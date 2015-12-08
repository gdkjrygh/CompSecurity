// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.crypto;


public class DeviceToken
{

    private final String mId;
    private final String mValue;

    public DeviceToken(String s, String s1)
    {
        mId = s;
        mValue = s1;
    }

    public String getId()
    {
        return mId;
    }

    public String getValue()
    {
        return mValue;
    }

    public String toString()
    {
        return (new StringBuilder("DeviceToken{id=")).append(mId).append(" value=").append(mValue).append("}").toString();
    }
}
