// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;


public class PowerManagerWakeLockWrapper
{

    private final android.os.PowerManager.WakeLock wakeLock;

    public PowerManagerWakeLockWrapper(android.os.PowerManager.WakeLock wakelock)
    {
        wakeLock = wakelock;
    }

    public void acquire()
    {
        wakeLock.acquire();
    }

    public boolean isHeld()
    {
        return wakeLock.isHeld();
    }

    public void release()
    {
        wakeLock.release();
    }
}
