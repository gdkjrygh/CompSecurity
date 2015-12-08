// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.os.PowerManager;
import p.df.a;

public class d
{

    private static android.os.PowerManager.WakeLock a;

    public static void a()
    {
        if (a != null)
        {
            p.df.a.a("AlarmAlertWakeLock", "ALARM - Releasing cpu wake lock");
            a.release();
            a = null;
        }
    }

    public static void a(Context context)
    {
        if (a != null)
        {
            return;
        } else
        {
            p.df.a.a("AlarmAlertWakeLock", "ALARM - Acquiring cpu wake lock");
            a = ((PowerManager)context.getSystemService("power")).newWakeLock(0x3000001a, "ALARM");
            a.acquire();
            return;
        }
    }
}
