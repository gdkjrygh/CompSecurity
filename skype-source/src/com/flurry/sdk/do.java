// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public class do
{

    private static do a;
    private final Context b;
    private final Handler c = new Handler(Looper.getMainLooper());
    private final Handler d;

    private do(Context context)
    {
        b = context.getApplicationContext();
        context = new HandlerThread("FlurryAgent");
        context.start();
        d = new Handler(context.getLooper());
    }

    public static do a()
    {
        return a;
    }

    public static void a(Context context)
    {
        com/flurry/sdk/do;
        JVM INSTR monitorenter ;
        do do1 = a;
        if (do1 == null) goto _L2; else goto _L1
_L1:
        com/flurry/sdk/do;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        throw new IllegalArgumentException("Context cannot be null");
        context;
        com/flurry/sdk/do;
        JVM INSTR monitorexit ;
        throw context;
        a = new do(context);
          goto _L1
    }

    public void a(Runnable runnable)
    {
        if (runnable == null)
        {
            return;
        } else
        {
            c.post(runnable);
            return;
        }
    }

    public void a(Runnable runnable, long l)
    {
        if (runnable == null)
        {
            return;
        } else
        {
            c.postDelayed(runnable, l);
            return;
        }
    }

    public Context b()
    {
        return b;
    }

    public void b(Runnable runnable)
    {
        if (runnable == null)
        {
            return;
        } else
        {
            c.removeCallbacks(runnable);
            return;
        }
    }

    public void b(Runnable runnable, long l)
    {
        if (runnable == null)
        {
            return;
        } else
        {
            d.postDelayed(runnable, l);
            return;
        }
    }

    public PackageManager c()
    {
        return b.getPackageManager();
    }

    public void c(Runnable runnable)
    {
        if (runnable == null)
        {
            return;
        } else
        {
            d.post(runnable);
            return;
        }
    }

    public void d(Runnable runnable)
    {
        if (runnable == null)
        {
            return;
        } else
        {
            d.removeCallbacks(runnable);
            return;
        }
    }
}
