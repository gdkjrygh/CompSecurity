// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import java.util.concurrent.TimeUnit;

class CachedEta
{

    public static final Long CACHE_TTL;
    private Long eta;
    private String rideId;
    private Long timestamp;

    public CachedEta(Long long1, Long long2, String s)
    {
        timestamp = long1;
        eta = long2;
        rideId = s;
    }

    public Long getEta()
    {
        return eta;
    }

    public String getRideId()
    {
        return rideId;
    }

    public Long getTimestamp()
    {
        return timestamp;
    }

    static 
    {
        CACHE_TTL = Long.valueOf(TimeUnit.SECONDS.toMillis(30L));
    }
}
