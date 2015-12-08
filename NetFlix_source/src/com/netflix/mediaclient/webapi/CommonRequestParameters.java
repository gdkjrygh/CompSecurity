// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.webapi;


public final class CommonRequestParameters
{

    public String appVersion;
    public String country;
    public String deviceCategory;
    public String deviceType;
    public String geolocationCountry;
    public String languages;
    public String osVersion;
    public String uiVersion;
    public String userId;
    public Boolean withCredentials;

    public CommonRequestParameters()
    {
    }

    public static CommonRequestParameters getInstanceWithCredentials()
    {
        CommonRequestParameters commonrequestparameters = new CommonRequestParameters();
        commonrequestparameters.withCredentials = Boolean.TRUE;
        return commonrequestparameters;
    }
}
