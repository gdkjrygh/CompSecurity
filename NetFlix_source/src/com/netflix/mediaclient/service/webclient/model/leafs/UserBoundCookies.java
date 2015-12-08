// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;


public class UserBoundCookies
{

    private String NetflixId;
    private String NetflixIdTest;
    private String SecureNetflixId;
    private String SecureNetflixIdTest;

    public UserBoundCookies()
    {
    }

    public String getUserBoundNetflixId()
    {
        return NetflixId;
    }

    public String getUserBoundSecureNetflixId()
    {
        return SecureNetflixId;
    }
}
