// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.people;


public class Bandwidth
{

    private boolean isUnlimited;
    private long max;
    private long maxBytes;
    private long maxKb;
    private long remainingBytes;
    private long remainingKb;
    private long used;
    private long usedBytes;
    private long usedKb;

    public Bandwidth()
    {
    }

    public long getMax()
    {
        return max;
    }

    public long getMaxBytes()
    {
        return maxBytes;
    }

    public long getMaxKb()
    {
        return maxKb;
    }

    public long getRemainingBytes()
    {
        return remainingBytes;
    }

    public long getRemainingKb()
    {
        return remainingKb;
    }

    public long getUsed()
    {
        return used;
    }

    public long getUsedBytes()
    {
        return usedBytes;
    }

    public long getUsedKb()
    {
        return usedKb;
    }

    public boolean isUnlimited()
    {
        return isUnlimited;
    }

    public void setMax(long l)
    {
        max = l;
    }

    public void setMaxBytes(long l)
    {
        maxBytes = l;
    }

    public void setMaxKb(long l)
    {
        maxKb = l;
    }

    public void setRemainingBytes(long l)
    {
        remainingBytes = l;
    }

    public void setRemainingKb(long l)
    {
        remainingKb = l;
    }

    public void setUnlimited(boolean flag)
    {
        isUnlimited = flag;
    }

    public void setUsed(long l)
    {
        used = l;
    }

    public void setUsedBytes(long l)
    {
        usedBytes = l;
    }

    public void setUsedKb(long l)
    {
        usedKb = l;
    }
}
