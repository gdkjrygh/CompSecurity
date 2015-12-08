// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;


public class UserData
{

    public String accountCountry;
    public String currentProfileUserId;
    public String deviceCategory;
    public String esn;
    public String geoLocationCountry;
    public String languages;
    public String netflixId;
    public String secureNetflixId;
    public String userId;

    public UserData()
    {
    }

    public String toString()
    {
        return (new StringBuilder()).append("UserData [userId=").append(userId).append(", currentProfileUserId=").append(currentProfileUserId).append(", netflixId=").append(netflixId).append(", secureNetflixId=").append(secureNetflixId).append(", esn=").append(esn).append(", deviceCategory=").append(deviceCategory).append(", accountCountry=").append(accountCountry).append(", geoLocationCountry=").append(geoLocationCountry).append(", languages=").append(languages).append("]").toString();
    }
}
