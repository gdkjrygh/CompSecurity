// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;


public class ProfileServiceToken
{

    private String token;
    private String tokenHeader;

    public ProfileServiceToken(String s, String s1)
    {
        tokenHeader = s;
        token = s1;
    }

    public String getToken()
    {
        return token;
    }

    public String getTokenHeader()
    {
        return tokenHeader;
    }
}
