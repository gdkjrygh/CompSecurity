// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;


public class MatchingStartTime
{

    String rideId;
    long startTime;

    public MatchingStartTime(String s)
    {
        rideId = s;
        startTime = System.currentTimeMillis();
    }

    public String getRideId()
    {
        return rideId;
    }

    public long getStartTime()
    {
        return startTime;
    }
}
