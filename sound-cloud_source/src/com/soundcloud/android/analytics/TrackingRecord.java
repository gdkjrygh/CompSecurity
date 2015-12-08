// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.java.objects.MoreObjects;

public class TrackingRecord
{

    private final String backend;
    private final String data;
    private final long id;
    private final long timestamp;

    public TrackingRecord(long l, long l1, String s, String s1)
    {
        id = l;
        backend = s;
        timestamp = l1;
        data = s1;
    }

    public TrackingRecord(long l, String s, String s1)
    {
        this(-1L, l, s, s1);
    }

    public String getBackend()
    {
        return backend;
    }

    public String getData()
    {
        return data;
    }

    public long getId()
    {
        return id;
    }

    public long getTimeStamp()
    {
        return timestamp;
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(com/soundcloud/android/analytics/TrackingRecord).add("id", id).add("timestamp", timestamp).add("backend", backend).add("data", data).toString();
    }
}
