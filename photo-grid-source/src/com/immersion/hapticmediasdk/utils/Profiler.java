// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.hapticmediasdk.utils;

import android.os.SystemClock;

public class Profiler
{

    public static int b044A044A044A044A044A044A = 0;
    public static int b044A044A044A044A044A044A = 1;
    public static int b044A044A044A044A044A044A = 89;
    public static int b044A044A044A044A044A044A = 2;
    public long mStartTime;
    public long mStartTimeII;

    public Profiler()
    {
        int i = b044A044A044A044A044A044A;
        switch ((i * (b044A044A044A044A044A044A + i)) % b044A044A044A044A044A044A)
        {
        default:
            b044A044A044A044A044A044A = 10;
            b044A044A044A044A044A044A = 87;
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            super();
            return;
        }
        catch (Exception exception)
        {
            throw exception;
        }
    }

    public static int b044A044A044A044A044A044A()
    {
        return 4;
    }

    public long getDuration()
    {
        int i;
        long l;
        long l1;
        try
        {
            l = SystemClock.elapsedRealtime();
            l1 = mStartTime;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        i = b044A044A044A044A044A044A;
        switch ((i * (b044A044A044A044A044A044A + i)) % b044A044A044A044A044A044A)
        {
        default:
            b044A044A044A044A044A044A = b044A044A044A044A044A044A();
            b044A044A044A044A044A044A = 69;
            // fall through

        case 0: // '\0'
            return l - l1;
        }
    }

    public long getDurationII()
    {
        long l = SystemClock.elapsedRealtime();
        int i = b044A044A044A044A044A044A;
        switch ((i * (b044A044A044A044A044A044A + i)) % b044A044A044A044A044A044A)
        {
        default:
            b044A044A044A044A044A044A = 72;
            b044A044A044A044A044A044A = 11;
            // fall through

        case 0: // '\0'
            return l - mStartTimeII;
        }
    }

    public void startTiming()
    {
        do
        {
        } while (true);
    }

    public void startTimingII()
    {
        if (((b044A044A044A044A044A044A + b044A044A044A044A044A044A) * b044A044A044A044A044A044A) % b044A044A044A044A044A044A != b044A044A044A044A044A044A)
        {
            b044A044A044A044A044A044A = 81;
            b044A044A044A044A044A044A = 31;
        }
        mStartTimeII = SystemClock.elapsedRealtime();
    }
}
