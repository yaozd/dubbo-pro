package com.product.data.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

import java.io.Serializable;

@Data
@Log4j
@NoArgsConstructor
@AllArgsConstructor
public class City implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ec_city.guid
     *
     * @mbggenerated
     */
    private Integer guid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ec_city.cityId
     *
     * @mbggenerated
     */
    private String cityid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ec_city.cityName
     *
     * @mbggenerated
     */
    private String cityname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ec_city.provinceId
     *
     * @mbggenerated
     */
    private String provinceid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ec_city.guid
     *
     * @return the value of ec_city.guid
     *
     * @mbggenerated
     */
//    public Integer getGuid() {
//        return guid;
//    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ec_city.guid
     *
     * @param guid the value for ec_city.guid
     *
     * @mbggenerated
     */
//    public void setGuid(Integer guid) {
//        this.guid = guid;
//    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ec_city.cityId
     *
     * @return the value of ec_city.cityId
     *
     * @mbggenerated
     */
//    public String getCityid() {
//        return cityid;
//    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ec_city.cityId
     *
     * @param cityid the value for ec_city.cityId
     *
     * @mbggenerated
     */
//    public void setCityid(String cityid) {
//        this.cityid = cityid == null ? null : cityid.trim();
//    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ec_city.cityName
     *
     * @return the value of ec_city.cityName
     *
     * @mbggenerated
     */
//    public String getCityname() {
//        return cityname;
//    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ec_city.cityName
     *
     * @param cityname the value for ec_city.cityName
     *
     * @mbggenerated
     */
//    public void setCityname(String cityname) {
//        this.cityname = cityname == null ? null : cityname.trim();
//    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ec_city.provinceId
     *
     * @return the value of ec_city.provinceId
     *
     * @mbggenerated
     */
//    public String getProvinceid() {
//        return provinceid;
//    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ec_city.provinceId
     *
     * @param provinceid the value for ec_city.provinceId
     *
     * @mbggenerated
     */
//    public void setProvinceid(String provinceid) {
//        this.provinceid = provinceid == null ? null : provinceid.trim();
//    }
}