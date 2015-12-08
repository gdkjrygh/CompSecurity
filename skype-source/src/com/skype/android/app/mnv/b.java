// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


final class b
{

    private static final String PS_SCENARIO_DELIMITER = "!";
    private static final String PS_SCENARIO_PREFIX = "SkypeAndroid__";
    private static final String X_CALLER_ENVIRONMENT_ID = "1";
    private String country;
    private String guid;
    private String language;
    private String phoneNumber;
    private String scenario;

    b()
    {
    }

    public final String getAppId()
    {
        return "D1604CB9-CFF6-4A1B-8A91-3C6751D6D79A";
    }

    public final String getCallerEnvironmentId()
    {
        return "1";
    }

    public final String getCountry()
    {
        return country;
    }

    public final String getGuid()
    {
        return guid;
    }

    public final String getLanguage()
    {
        return language;
    }

    public final String getPhoneNumber()
    {
        return phoneNumber;
    }

    public final String getScenario()
    {
        return (new StringBuilder("SkypeAndroid__")).append(scenario).append("!").append(getGuid()).toString();
    }

    public final void setCountry(String s)
    {
        country = s;
    }

    public final void setGuid(String s)
    {
        guid = s;
    }

    public final void setLanguage(String s)
    {
        language = s;
    }

    public final void setPhoneNumber(String s)
    {
        phoneNumber = s;
    }

    public final void setScenario(String s)
    {
        scenario = s;
    }
}
