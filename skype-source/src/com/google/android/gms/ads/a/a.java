// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.b;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.e;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.u;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class com.google.android.gms.ads.a.a
{
    public static final class a
    {

        private final String a;
        private final boolean b;

        public final String a()
        {
            return a;
        }

        public final boolean b()
        {
            return b;
        }

        public final String toString()
        {
            return (new StringBuilder("{")).append(a).append("}").append(b).toString();
        }

        public a(String s, boolean flag)
        {
            a = s;
            b = flag;
        }
    }

    static final class b extends Thread
    {

        CountDownLatch a;
        boolean b;
        private WeakReference c;
        private long d;

        private void a()
        {
            com.google.android.gms.ads.a.a a1 = (com.google.android.gms.ads.a.a)c.get();
            if (a1 != null)
            {
                a1.c();
                b = true;
            }
        }

        public final void run()
        {
            try
            {
                if (!a.await(d, TimeUnit.MILLISECONDS))
                {
                    a();
                }
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                a();
            }
        }

        public b(com.google.android.gms.ads.a.a a1, long l)
        {
            c = new WeakReference(a1);
            d = l;
            a = new CountDownLatch(1);
            b = false;
            start();
        }
    }


    private static boolean h = false;
    h a;
    u b;
    boolean c;
    Object d;
    b e;
    final long f;
    private final Context g;

    public com.google.android.gms.ads.a.a(Context context)
    {
        this(context, 30000L);
    }

    private com.google.android.gms.ads.a.a(Context context, long l)
    {
        d = new Object();
        y.a(context);
        g = context;
        c = false;
        f = l;
    }

    public static a a(Context context)
        throws IOException, IllegalStateException, c, d
    {
        context = new com.google.android.gms.ads.a.a(context, -1L);
        a a1;
        context.a(false);
        a1 = context.b();
        context.c();
        return a1;
        Exception exception;
        exception;
        context.c();
        throw exception;
    }

    private static u a(h h1)
        throws IOException
    {
        try
        {
            h1 = com.google.android.gms.internal.u.a.a(h1.a());
        }
        // Misplaced declaration of an exception variable
        catch (h h1)
        {
            throw new IOException("Interrupted exception");
        }
        // Misplaced declaration of an exception variable
        catch (h h1)
        {
            throw new IOException(h1);
        }
        return h1;
    }

    private void a(boolean flag)
        throws IOException, IllegalStateException, c, d
    {
        y.c("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            c();
        }
        a = b(g);
        b = a(a);
        c = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        d();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static h b(Context context)
        throws IOException, c, d
    {
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new c(9);
        }
        h h1;
        Intent intent;
        boolean flag;
        if (h)
        {
            com.google.android.gms.common.b.a();
            switch (com.google.android.gms.common.b.a(context))
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
                com.google.android.gms.common.e.b(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new IOException(context);
            }
        }
        h1 = new h();
        intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try
        {
            flag = com.google.android.gms.common.stats.b.a().a(context, intent, h1, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException(context);
        }
        if (flag)
        {
            return h1;
        } else
        {
            throw new IOException("Connection failure");
        }
    }

    private void d()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        e.a.countDown();
        Exception exception;
        try
        {
            e.join();
        }
        catch (InterruptedException interruptedexception) { }
        if (f > 0L)
        {
            e = new b(this, f);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a()
        throws IOException, IllegalStateException, c, d
    {
        a(true);
    }

    public final a b()
        throws IOException
    {
        y.c("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (e == null || !e.b)
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
        y.a(a);
        y.a(b);
        obj1 = new a(b.a(), b.a(true));
        this;
        JVM INSTR monitorexit ;
        d();
        return ((a) (obj1));
        obj1;
        Log.i("AdvertisingIdClient", "GMS remote exception ", ((Throwable) (obj1)));
        throw new IOException("Remote exception");
    }

    public final void c()
    {
        y.c("Calling this from your main thread can lead to deadlock");
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

    protected final void finalize()
        throws Throwable
    {
        c();
        super.finalize();
    }

}
