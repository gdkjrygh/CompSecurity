// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a.b;

import android.app.ActivityManager;
import android.util.Log;
import com.google.f.e.l;

public final class b
{

    public static l a()
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = ActivityManager.isRunningInTestHarness();
        } else
        {
            flag = false;
        }
        if ((ActivityManager.isUserAMonkey() || flag) && !Log.isLoggable("forceEmulatorServerLogs", 2))
        {
            return (new l()).a(false);
        } else
        {
            return (new l()).a(true);
        }
    }
}
