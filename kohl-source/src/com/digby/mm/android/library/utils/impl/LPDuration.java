// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.utils.impl;

import com.digby.mm.android.library.utils.IDuration;

public class LPDuration
    implements IDuration
{

    private static final int SECONDS_PER_DAY = 0x15180;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int SECONDS_PER_WEEK = 0x93a80;
    private int iSeconds;

    public LPDuration(int i)
    {
        iSeconds = i;
    }

    public int getDays()
    {
        return 0;
    }

    public int getHours()
    {
        return 0;
    }

    public int getMinutes()
    {
        return iSeconds * 60;
    }

    public int getSeconds()
    {
        return iSeconds;
    }

    public int getWeeks()
    {
        return 0;
    }
}
