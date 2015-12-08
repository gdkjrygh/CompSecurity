// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;


// Referenced classes of package com.soundcloud.android.utils:
//            PowerManagerWrapper, PowerManagerWakeLockWrapper

public class LockUtil
{

    public static final String WAKE_LOCK_TAG = "LockUtilWakeLock";
    private final PowerManagerWakeLockWrapper wakeLock;

    public LockUtil(PowerManagerWrapper powermanagerwrapper)
    {
        wakeLock = powermanagerwrapper.newPartialWakeLock("LockUtilWakeLock");
    }

    public void lock()
    {
        if (wakeLock.isHeld())
        {
            break MISSING_BLOCK_LABEL_17;
        }
        wakeLock.acquire();
        return;
        Exception exception;
        exception;
        (new StringBuilder("Error getting Wake Lock: ")).append(exception.getMessage());
        return;
    }

    public void unlock()
    {
        if (wakeLock.isHeld())
        {
            wakeLock.release();
        }
    }
}
