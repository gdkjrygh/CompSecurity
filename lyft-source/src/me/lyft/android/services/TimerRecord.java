// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;


public class TimerRecord
{

    String tag;
    Long timestamp;

    public TimerRecord(String s, Long long1)
    {
        tag = s;
        timestamp = long1;
    }

    public String getTag()
    {
        return tag;
    }

    public Long getTimestamp()
    {
        return timestamp;
    }
}
