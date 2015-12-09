// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.arsenal.auth;

import com.spotify.mobile.android.cosmos.JacksonModel;

public final class DevicesResponse
    implements JacksonModel
{

    private final String mDeviceCode;
    private final long mExpiresIn;
    private final String mUserCode;

    public DevicesResponse(String s, String s1, long l)
    {
        mDeviceCode = s;
        mUserCode = s1;
        mExpiresIn = l;
    }

    public final String getDeviceCode()
    {
        return mDeviceCode;
    }

    public final long getExpiresIn()
    {
        return mExpiresIn;
    }

    public final String getUserCode()
    {
        return mUserCode;
    }
}
