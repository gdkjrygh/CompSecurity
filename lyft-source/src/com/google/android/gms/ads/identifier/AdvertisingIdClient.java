// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.stats.zzb;
import com.google.android.gms.common.zza;
import com.google.android.gms.internal.zzav;
import java.io.IOException;

public class AdvertisingIdClient
{

    com.google.android.gms.common.zza a;
    zzav b;
    boolean c;
    Object d;
    zza e;
    final long f;
    private final Context g;

    public AdvertisingIdClient(Context context, long l)
    {
        d = new Object();
        zzu.a(context);
        g = context;
        c = false;
        f = l;
    }

    static zza a(Context context)
    {
        zza zza1;
        Intent intent;
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new GooglePlayServicesNotAvailableException(9);
        }
        try
        {
            GooglePlayServicesUtil.b(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException(context);
        }
        zza1 = new zza();
        intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (zzb.a().a(context, intent, zza1, 1))
        {
            return zza1;
        } else
        {
            throw new IOException("Connection failure");
        }
    }

    static zzav a(Context context, zza zza1)
    {
        try
        {
            context = com.google.android.gms.internal.zzav.zza.a(zza1.a());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException("Interrupted exception");
        }
        return context;
    }

    public static Info b(Context context)
    {
        context = new AdvertisingIdClient(context, -1L);
        Info info;
        context.a(false);
        info = context.a();
        context.b();
        return info;
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
            e = new zza(f);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Info a()
    {
        zzu.c("Calling this from your main thread can lead to deadlock");
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
        zzu.a(a);
        zzu.a(b);
        obj1 = new Info(b.a(), b.a(true));
        this;
        JVM INSTR monitorexit ;
        c();
        return ((Info) (obj1));
        obj1;
        Log.i("AdvertisingIdClient", "GMS remote exception ", ((Throwable) (obj1)));
        throw new IOException("Remote exception");
    }

    protected void a(boolean flag)
    {
        zzu.c("Calling this from your main thread can lead to deadlock");
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
        zzu.c("Calling this from your main thread can lead to deadlock");
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
            zzb.a().a(g, a);
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

    private class zza extends Thread
    {

        CountDownLatch a;
        boolean b;
        private WeakReference c;
        private long d;

        private void c()
        {
            AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)c.get();
            if (advertisingidclient != null)
            {
                advertisingidclient.b();
                b = true;
            }
        }

        public void a()
        {
            a.countDown();
        }

        public boolean b()
        {
            return b;
        }

        public void run()
        {
            try
            {
                if (!a.await(d, TimeUnit.MILLISECONDS))
                {
                    c();
                }
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                c();
            }
        }

        public zza(long l)
        {
            c = new WeakReference(AdvertisingIdClient.this);
            d = l;
            a = new CountDownLatch(1);
            b = false;
            start();
        }
    }


    private class Info
    {

        private final String a;
        private final boolean b;

        public String a()
        {
            return a;
        }

        public boolean b()
        {
            return b;
        }

        public String toString()
        {
            return (new StringBuilder()).append("{").append(a).append("}").append(b).toString();
        }

        public Info(String s, boolean flag)
        {
            a = s;
            b = flag;
        }
    }

}
