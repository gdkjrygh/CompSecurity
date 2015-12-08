// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;


public class Config
{

    public static final Boolean MOBILE_CONFIG_BYPASS_SSL_ERRORS = Boolean.valueOf(Boolean.parseBoolean("false"));
    public static final String MOBILE_CONFIG_LOCALE_COUNTRY = "us";
    public static final String MOBILE_CONFIG_URL = "https://m.capitalone.com:443/static/mobileconfig.json";

    public Config()
    {
    }

}
