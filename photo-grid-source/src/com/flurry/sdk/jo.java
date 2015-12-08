// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;

// Referenced classes of package com.flurry.sdk:
//            ke, kf

public class jo
{

    private static jo a;
    private static final String b = com/flurry/sdk/jo.getSimpleName();
    private final Context c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private final Handler e;
    private final HandlerThread f = new HandlerThread("FlurryAgent");
    private final String g;
    private final ke h = new ke();

    private jo(Context context, String s)
    {
        c = context.getApplicationContext();
        f.start();
        e = new Handler(f.getLooper());
        g = s;
    }

    public static jo a()
    {
        return a;
    }

    private void a(Context context)
    {
        h.a(context);
    }

    public static void a(Context context, String s)
    {
        com/flurry/sdk/jo;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            if (!a.d().equals(s))
            {
                throw new IllegalStateException("Only one API key per application is supported!");
            }
            break MISSING_BLOCK_LABEL_88;
        }
        break MISSING_BLOCK_LABEL_38;
        context;
        com/flurry/sdk/jo;
        JVM INSTR monitorexit ;
        throw context;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        throw new IllegalArgumentException("Context cannot be null");
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("API key must be specified");
        }
        s = new jo(context, s);
        a = s;
        s.a(context);
        com/flurry/sdk/jo;
        JVM INSTR monitorexit ;
    }

    public static void b()
    {
        com/flurry/sdk/jo;
        JVM INSTR monitorenter ;
        jo jo1 = a;
        if (jo1 != null) goto _L2; else goto _L1
_L1:
        com/flurry/sdk/jo;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.h();
        a = null;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void h()
    {
        i();
        f.quit();
    }

    private void i()
    {
        h.a();
    }

    public kf a(Class class1)
    {
        return h.a(class1);
    }

    public void a(Runnable runnable)
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

    public void a(Runnable runnable, long l)
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

    public void b(Runnable runnable)
    {
        if (runnable == null)
        {
            return;
        } else
        {
            e.post(runnable);
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
            e.postDelayed(runnable, l);
            return;
        }
    }

    public Context c()
    {
        return c;
    }

    public void c(Runnable runnable)
    {
        if (runnable == null)
        {
            return;
        } else
        {
            e.removeCallbacks(runnable);
            return;
        }
    }

    public String d()
    {
        return g;
    }

    public PackageManager e()
    {
        return c.getPackageManager();
    }

    public Handler f()
    {
        return d;
    }

    public Handler g()
    {
        return e;
    }

}
