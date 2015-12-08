// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.support.v4.util.SimpleArrayMap;

public final class PassiveTimedConnectionMatcher
{

    private final SimpleArrayMap mMap;
    private final int mMaxCapacity;
    private final long mTimeOutDurationMillis;

    public PassiveTimedConnectionMatcher()
    {
        mTimeOutDurationMillis = 60000L;
        mMaxCapacity = 10;
        mMap = new SimpleArrayMap(10);
    }

    public PassiveTimedConnectionMatcher(long l)
    {
        mTimeOutDurationMillis = l;
        mMaxCapacity = 1024;
        mMap = new SimpleArrayMap();
    }
}
