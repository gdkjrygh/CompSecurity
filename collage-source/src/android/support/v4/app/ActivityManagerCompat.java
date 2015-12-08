// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.ActivityManager;

// Referenced classes of package android.support.v4.app:
//            ActivityManagerCompatKitKat

public final class ActivityManagerCompat
{

    private ActivityManagerCompat()
    {
    }

    public static boolean isLowRamDevice(ActivityManager activitymanager)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            return ActivityManagerCompatKitKat.isLowRamDevice(activitymanager);
        } else
        {
            return false;
        }
    }
}
