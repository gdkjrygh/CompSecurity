// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.map;


public class PinInfo
{

    private static int MULTIPLIER = 31;
    public String pinId;
    public int size;

    public PinInfo(String s, int i)
    {
        pinId = s;
        size = i;
    }

    public boolean equals(PinInfo pininfo)
    {
        return pinId == pininfo.pinId && size == pininfo.size;
    }

    public boolean equals(Object obj)
    {
        while (obj == null || !(obj instanceof PinInfo)) 
        {
            return false;
        }
        return equals((PinInfo)obj);
    }

    public int hashCode()
    {
        int i;
        if (pinId != null)
        {
            i = pinId.hashCode();
        } else
        {
            i = 1;
        }
        return i + size * MULTIPLIER;
    }

    public String toString()
    {
        return (new StringBuilder("id: ")).append(pinId).append(" size: ").append(size).toString();
    }

}
