// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.model;

import com.amazon.device.iap.model.UserData;

public class UserDataBuilder
{

    private String marketplace;
    private String userId;

    public UserDataBuilder()
    {
    }

    public UserData build()
    {
        return new UserData(this);
    }

    public String getMarketplace()
    {
        return marketplace;
    }

    public String getUserId()
    {
        return userId;
    }

    public UserDataBuilder setMarketplace(String s)
    {
        marketplace = s;
        return this;
    }

    public UserDataBuilder setUserId(String s)
    {
        userId = s;
        return this;
    }
}
