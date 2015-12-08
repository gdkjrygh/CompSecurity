// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.s3;


public class ConfigDTO
{

    private static final String PRODUCTION = "production";
    private String analyticsUrl;
    private String atsUrl;
    private String displayName;
    private String facebookAppId;
    private String stripeKey;
    private String url;
    private String webUrl;

    public ConfigDTO()
    {
    }

    public String getAnalyticsUrl()
    {
        return analyticsUrl;
    }

    public String getAtsUrl()
    {
        return atsUrl;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public String getFacebookAppId()
    {
        return facebookAppId;
    }

    public String getStripeKey()
    {
        return stripeKey;
    }

    public String getUrl()
    {
        return url;
    }

    public String getWebUrl()
    {
        return webUrl;
    }

    public boolean isProduction()
    {
        return "production".equalsIgnoreCase(displayName);
    }
}
