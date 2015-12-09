// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.social;


public class Badge
{

    private String category;
    private Long dateTime;
    private String description;
    private String earnedMessage;
    private String encodedId;
    private Integer gradientEnd;
    private Integer gradientStart;
    private Long id;
    private String image;
    private String mobileDescription;
    private String shareImageUrl;
    private String shareText;
    private String shortDescription;
    private String shortName;
    private Integer timesAchieved;
    private String type;
    private String unit;
    private Long userId;
    private Integer value;

    public Badge()
    {
    }

    public Badge(Long long1)
    {
        id = long1;
    }

    public Badge(Long long1, String s, String s1, String s2, Long long2, Integer integer, Integer integer1, 
            String s3, String s4, String s5, String s6, Integer integer2, Integer integer3, Long long3, 
            String s7, String s8, String s9, String s10, String s11)
    {
        id = long1;
        encodedId = s;
        type = s1;
        shortName = s2;
        dateTime = long2;
        timesAchieved = integer;
        value = integer1;
        image = s3;
        unit = s4;
        description = s5;
        earnedMessage = s6;
        gradientStart = integer2;
        gradientEnd = integer3;
        userId = long3;
        category = s7;
        mobileDescription = s8;
        shortDescription = s9;
        shareImageUrl = s10;
        shareText = s11;
    }

    public String getCategory()
    {
        return category;
    }

    public Long getDateTime()
    {
        return dateTime;
    }

    public String getDescription()
    {
        return description;
    }

    public String getEarnedMessage()
    {
        return earnedMessage;
    }

    public String getEncodedId()
    {
        return encodedId;
    }

    public Integer getGradientEnd()
    {
        return gradientEnd;
    }

    public Integer getGradientStart()
    {
        return gradientStart;
    }

    public Long getId()
    {
        return id;
    }

    public String getImage()
    {
        return image;
    }

    public String getMobileDescription()
    {
        return mobileDescription;
    }

    public String getShareImageUrl()
    {
        return shareImageUrl;
    }

    public String getShareText()
    {
        return shareText;
    }

    public String getShortDescription()
    {
        return shortDescription;
    }

    public String getShortName()
    {
        return shortName;
    }

    public Integer getTimesAchieved()
    {
        return timesAchieved;
    }

    public String getType()
    {
        return type;
    }

    public String getUnit()
    {
        return unit;
    }

    public Long getUserId()
    {
        return userId;
    }

    public Integer getValue()
    {
        return value;
    }

    public void setCategory(String s)
    {
        category = s;
    }

    public void setDateTime(Long long1)
    {
        dateTime = long1;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setEarnedMessage(String s)
    {
        earnedMessage = s;
    }

    public void setEncodedId(String s)
    {
        encodedId = s;
    }

    public void setGradientEnd(Integer integer)
    {
        gradientEnd = integer;
    }

    public void setGradientStart(Integer integer)
    {
        gradientStart = integer;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setImage(String s)
    {
        image = s;
    }

    public void setMobileDescription(String s)
    {
        mobileDescription = s;
    }

    public void setShareImageUrl(String s)
    {
        shareImageUrl = s;
    }

    public void setShareText(String s)
    {
        shareText = s;
    }

    public void setShortDescription(String s)
    {
        shortDescription = s;
    }

    public void setShortName(String s)
    {
        shortName = s;
    }

    public void setTimesAchieved(Integer integer)
    {
        timesAchieved = integer;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setUnit(String s)
    {
        unit = s;
    }

    public void setUserId(Long long1)
    {
        userId = long1;
    }

    public void setValue(Integer integer)
    {
        value = integer;
    }
}
