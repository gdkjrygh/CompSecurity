// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.c;
import com.google.android.gms.common.e;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.internal.ig;
import com.google.android.gms.internal.la;
import com.google.android.gms.internal.lb;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.ads.a:
//            c, b

public class a
{

    h a;
    la b;
    boolean c;
    Object d;
    com.google.android.gms.ads.a.c e;
    final long f = -1L;
    private final Context g;

    private a(Context context)
    {
        d = new Object();
        ap.a(context);
        g = context;
        c = false;
    }

    public static b a(Context context)
    {
        context = new a(context);
        b b1;
        context.b();
        b1 = context.c();
        context.a();
        return b1;
        Exception exception;
        exception;
        context.a();
        throw exception;
    }

    private static la a(h h1)
    {
        try
        {
            h1 = lb.a(h1.a());
        }
        // Misplaced declaration of an exception variable
        catch (h h1)
        {
            throw new IOException("Interrupted exception");
        }
        return h1;
    }

    private static h b(Context context)
    {
        h h1;
        Intent intent;
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new c(9);
        }
        try
        {
            com.google.android.gms.common.e.b(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException(context);
        }
        h1 = new h();
        intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (ig.a().a(context, intent, h1, 1))
        {
            return h1;
        } else
        {
            throw new IOException("Connection failure");
        }
    }

    private void b()
    {
        ap.c("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            a();
        }
        a = b(g);
        b = a(a);
        c = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private b c()
    {
        ap.c("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (e == null || !e.b)
        {
            throw new IOException("AdvertisingIdClient is not connected.");
        }
        break MISSING_BLOCK_LABEL_58;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        JVM INSTR monitorexit ;
        b();
        if (!c)
        {
            throw new IOException("AdvertisingIdClient cannot reconnect.");
        }
        break MISSING_BLOCK_LABEL_93;
        Exception exception;
        exception;
        throw new IOException("AdvertisingIdClient cannot reconnect.", exception);
        ap.a(a);
        ap.a(b);
        b b1 = new b(b.a(), b.a(true));
        this;
        JVM INSTR monitorexit ;
        exception = ((Exception) (d));
        exception;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        e.a.countDown();
        try
        {
            e.join();
        }
        catch (InterruptedException interruptedexception) { }
        if (f > 0L)
        {
            e = new com.google.android.gms.ads.a.c(this, f);
        }
        return b1;
        exception;
        Log.i("AdvertisingIdClient", "GMS remote exception ", exception);
        throw new IOException("Remote exception");
        b1;
        exception;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final void a()
    {
        ap.c("Calling this from your main thread can lead to deadlock");
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
            ig.a().a(g, a);
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
        a();
        super.finalize();
    }
}
