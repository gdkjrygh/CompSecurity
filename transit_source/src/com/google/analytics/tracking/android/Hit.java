// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


class Hit
{

    private final long mHitId;
    private String mHitString;
    private final long mHitTime;
    private String mHitUrl;

    Hit(String s, long l, long l1)
    {
        mHitString = s;
        mHitId = l;
        mHitTime = l1;
    }

    long getHitId()
    {
        return mHitId;
    }

    String getHitParams()
    {
        return mHitString;
    }

    long getHitTime()
    {
        return mHitTime;
    }

    String getHitUrl()
    {
        return mHitUrl;
    }

    void setHitString(String s)
    {
        mHitString = s;
    }

    void setHitUrl(String s)
    {
        mHitUrl = s;
    }
}
