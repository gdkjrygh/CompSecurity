// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.utils;


public class FrameRateController
{

    boolean curFrameDropFlag;
    private boolean isInit;
    private float targetFps;
    private float tsDeltaTarget;
    private float tsError;
    private long tsLast;

    public FrameRateController(float f)
    {
        isInit = false;
        Reset(f, 0L, true);
    }

    public boolean GetDropFlag(long l)
    {
        boolean flag = true;
        if (!isInit)
        {
            isInit = true;
            tsLast = l;
            curFrameDropFlag = false;
            tsError = 0.0F;
            return false;
        }
        if (l == tsLast)
        {
            flag = false;
        }
        curFrameDropFlag = flag;
        if (l < tsLast)
        {
            if (Long.signum(l) == -1)
            {
                tsLast = l;
            }
            return curFrameDropFlag;
        }
        float f = l - tsLast;
        float f1 = tsError;
        if (tsDeltaTarget - 5F < f + f1)
        {
            curFrameDropFlag = false;
        }
        return curFrameDropFlag;
    }

    public float GetTargetFps()
    {
        return targetFps;
    }

    public void Reset(float f, long l, boolean flag)
    {
        targetFps = f;
        tsDeltaTarget = 1000F / f;
        if (flag)
        {
            tsLast = l;
            tsError = 0.0F;
            curFrameDropFlag = false;
        }
    }

    public void Update(long l)
    {
        if (!curFrameDropFlag && l != tsLast)
        {
            float f = l - tsLast;
            tsError = tsError + (f - tsDeltaTarget);
            if (tsError > 100F || tsError < -100F)
            {
                tsError = 0.0F;
            }
            tsLast = l;
        }
    }
}
