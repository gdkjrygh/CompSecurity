// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.service;

import android.app.Service;
import android.os.PowerManager;
import com.fitbit.e.a;

public abstract class WakefulService extends Service
{

    private android.os.PowerManager.WakeLock a;

    public WakefulService()
    {
    }

    private void b()
    {
        a = ((PowerManager)getSystemService("power")).newWakeLock(1, a());
        a.setReferenceCounted(false);
    }

    private void c()
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        if (a.isHeld())
        {
            a.release();
        }
        a = null;
        return;
        Throwable throwable;
        throwable;
    }

    private void d()
    {
        if (a != null)
        {
            a.acquire();
        }
    }

    protected abstract String a();

    public void onCreate()
    {
        super.onCreate();
        com.fitbit.e.a.a(a(), "Create service.", new Object[0]);
        b();
        d();
    }

    public void onDestroy()
    {
        super.onDestroy();
        com.fitbit.e.a.a(a(), "Destroy service.", new Object[0]);
        c();
    }
}
