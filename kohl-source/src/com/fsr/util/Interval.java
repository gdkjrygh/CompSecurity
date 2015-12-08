// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.util;

import java.util.Date;

public class Interval
{

    private long mInterval;

    public Interval(Date date, Date date1)
    {
        mInterval = 0L;
        mInterval = date1.getTime() - date.getTime();
    }

    public float getDays()
    {
        return (float)mInterval / 8.64E+07F;
    }

    public int getWholeDays()
    {
        return (int)Math.floor(getDays());
    }
}
