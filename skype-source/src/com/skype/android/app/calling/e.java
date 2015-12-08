// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.os.PowerManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class e
{

    private static String TAG = "ProximityWakeLock";
    private PowerManager powerManager;
    private Method releaseMethod;
    private boolean supportsProximitySensor;
    private android.os.PowerManager.WakeLock wakeLock;

    public e(PowerManager powermanager)
    {
        powerManager = powermanager;
        try
        {
            init();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PowerManager powermanager)
        {
            powermanager.printStackTrace();
        }
    }

    private void init()
        throws NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchFieldException
    {
        Class class1 = powerManager.getClass();
        int i = class1.getField("PROXIMITY_SCREEN_OFF_WAKE_LOCK").getInt(null);
        supportsProximitySensor = false;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT > 16)
        {
            flag = ((Boolean)class1.getDeclaredMethod("isWakeLockLevelSupported", new Class[] {
                Integer.TYPE
            }).invoke(powerManager, new Object[] {
                Integer.valueOf(i)
            })).booleanValue();
        } else
        if ((((Integer)class1.getDeclaredMethod("getSupportedWakeLockFlags", null).invoke(powerManager, null)).intValue() & i) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        supportsProximitySensor = flag;
        if (supportsProximitySensor)
        {
            wakeLock = powerManager.newWakeLock(i, TAG);
            releaseMethod = wakeLock.getClass().getDeclaredMethod("release", new Class[] {
                Integer.TYPE
            });
        }
    }

    public final void acquire()
    {
        if (wakeLock != null && !wakeLock.isHeld())
        {
            wakeLock.acquire();
        }
    }

    public final void release()
    {
        if (wakeLock == null || !wakeLock.isHeld())
        {
            break MISSING_BLOCK_LABEL_40;
        }
        releaseMethod.invoke(wakeLock, new Object[] {
            Integer.valueOf(1)
        });
        return;
        Throwable throwable;
        throwable;
        throwable.printStackTrace();
        wakeLock.release();
        return;
    }

    public final boolean supportsProximitySensor()
    {
        return supportsProximitySensor;
    }

}
