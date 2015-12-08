// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.b;
import com.google.android.gms.common.d;
import com.google.android.gms.common.f;
import com.google.android.gms.common.internal.u;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.a.a:
//            c, b

public class a
{

    private static boolean h = false;
    f a;
    com.google.android.gms.d.a b;
    boolean c;
    Object d;
    c e;
    final long f;
    private final Context g;

    public a(Context context, long l)
    {
        d = new Object();
        u.a(context);
        g = context;
        c = false;
        f = l;
    }

    static f a(Context context)
    {
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new b(9);
        }
        f f1;
        Intent intent;
        boolean flag;
        if (h)
        {
            Log.d("Ads", "Skipping gmscore version check");
            switch (com.google.android.gms.common.a.a().a(context))
            {
            case 1: // '\001'
            default:
                throw new IOException("Google Play services not available");

            case 0: // '\0'
            case 2: // '\002'
                break;
            }
        } else
        {
            try
            {
                com.google.android.gms.common.d.b(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new IOException(context);
            }
        }
        f1 = new f();
        intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try
        {
            flag = com.google.android.gms.common.stats.b.a().a(context, intent, f1, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException(context);
        }
        if (flag)
        {
            return f1;
        } else
        {
            throw new IOException("Connection failure");
        }
    }

    static com.google.android.gms.d.a a(Context context, f f1)
    {
        try
        {
            context = com.google.android.gms.d.b.a(f1.a());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException("Interrupted exception");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException(context);
        }
        return context;
    }

    public static com.google.android.gms.a.a.b b(Context context)
    {
        context = new a(context, -1L);
        com.google.android.gms.a.a.b b1;
        context.a(false);
        b1 = context.a();
        context.b();
        return b1;
        Exception exception;
        exception;
        context.b();
        throw exception;
    }

    private void c()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        e.a();
        Exception exception;
        try
        {
            e.join();
        }
        catch (InterruptedException interruptedexception) { }
        if (f > 0L)
        {
            e = new c(this, f);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public com.google.android.gms.a.a.b a()
    {
        u.c("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (e == null || !e.b())
        {
            throw new IOException("AdvertisingIdClient is not connected.");
        }
        break MISSING_BLOCK_LABEL_58;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        JVM INSTR monitorexit ;
        a(false);
        if (!c)
        {
            throw new IOException("AdvertisingIdClient cannot reconnect.");
        }
        break MISSING_BLOCK_LABEL_94;
        Object obj1;
        obj1;
        throw new IOException("AdvertisingIdClient cannot reconnect.", ((Throwable) (obj1)));
        u.a(a);
        u.a(b);
        obj1 = new com.google.android.gms.a.a.b(b.a(), b.a(true));
        this;
        JVM INSTR monitorexit ;
        c();
        return ((com.google.android.gms.a.a.b) (obj1));
        obj1;
        Log.i("AdvertisingIdClient", "GMS remote exception ", ((Throwable) (obj1)));
        throw new IOException("Remote exception");
    }

    protected void a(boolean flag)
    {
        u.c("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            b();
        }
        a = a(g);
        b = a(g, a);
        c = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b()
    {
        u.c("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (g != null && a != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (c)
        {
            com.google.android.gms.common.stats.b.a().a(g, a);
        }
_L1:
        c = false;
        b = null;
        a = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", ((Throwable) (obj)));
          goto _L1
    }

    protected void finalize()
    {
        b();
        super.finalize();
    }

}
