// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.extension.model;


public class ShopRunnerTag
{

    private String token;

    public ShopRunnerTag()
    {
        token = "testToken";
    }

    public ShopRunnerTag(String s)
    {
        token = "testToken";
        token = s;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken(String s)
    {
        token = s;
    }
}
