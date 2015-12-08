// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public final class jnw
{

    private static boolean h = false;
    private kdn a;
    private ksx b;
    private boolean c;
    private Object d;
    private jny e;
    private final Context f;
    private long g;

    private jnw(Context context, long l)
    {
        d = new Object();
        b.d(context);
        f = context;
        c = false;
        g = -1L;
    }

    public static jnx a(Context context)
    {
        context = new jnw(context, -1L);
        jnx jnx1;
        context.a(false);
        jnx1 = context.b();
        context.a();
        return jnx1;
        Exception exception;
        exception;
        context.a();
        throw exception;
    }

    private static ksx a(kdn kdn1)
    {
        try
        {
            kdn1 = ksy.a(kdn1.a());
        }
        // Misplaced declaration of an exception variable
        catch (kdn kdn1)
        {
            throw new IOException("Interrupted exception");
        }
        // Misplaced declaration of an exception variable
        catch (kdn kdn1)
        {
            throw new IOException(kdn1);
        }
        return kdn1;
    }

    private void a(boolean flag)
    {
        b.q("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            a();
        }
        a = b(f);
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

    private jnx b()
    {
        b.q("Calling this from your main thread can lead to deadlock");
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
        a(false);
        if (!c)
        {
            throw new IOException("AdvertisingIdClient cannot reconnect.");
        }
        break MISSING_BLOCK_LABEL_94;
        Exception exception;
        exception;
        throw new IOException("AdvertisingIdClient cannot reconnect.", exception);
        b.d(a);
        b.d(b);
        jnx jnx1 = new jnx(b.a(), b.a(true));
        this;
        JVM INSTR monitorexit ;
        exception = ((Exception) (d));
        exception;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        e.a.countDown();
        try
        {
            e.join();
        }
        catch (InterruptedException interruptedexception) { }
        if (g > 0L)
        {
            e = new jny(this, g);
        }
        return jnx1;
        exception;
        throw new IOException("Remote exception");
        jnx1;
        exception;
        JVM INSTR monitorexit ;
        throw jnx1;
    }

    private static kdn b(Context context)
    {
        kdn kdn1;
        Intent intent;
        boolean flag;
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new jya(9);
        }
        try
        {
            jyc.b(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException(context);
        }
        kdn1 = new kdn();
        intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try
        {
            flag = kcz.a().a(context, intent, kdn1, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException(context);
        }
        if (flag)
        {
            return kdn1;
        } else
        {
            throw new IOException("Connection failure");
        }
    }

    public final void a()
    {
        b.q("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (f != null && a != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        try
        {
            if (c)
            {
                kcz.a().a(f, a);
            }
        }
        catch (IllegalArgumentException illegalargumentexception) { }
        c = false;
        b = null;
        a = null;
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void finalize()
    {
        a();
        super.finalize();
    }

}
