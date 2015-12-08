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
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.a;
import com.google.android.gms.internal.kn;
import com.google.android.gms.internal.x;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class AdvertisingIdClient
{
    public static final class Info
    {

        private final String lA;
        private final boolean lB;

        public final String getId()
        {
            return lA;
        }

        public final boolean isLimitAdTrackingEnabled()
        {
            return lB;
        }

        public final String toString()
        {
            return (new StringBuilder("{")).append(lA).append("}").append(lB).toString();
        }

        public Info(String s, boolean flag)
        {
            lA = s;
            lB = flag;
        }
    }

    static final class a extends Thread
    {

        private WeakReference lw;
        private long lx;
        CountDownLatch ly;
        boolean lz;

        private void disconnect()
        {
            AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)lw.get();
            if (advertisingidclient != null)
            {
                advertisingidclient.finish();
                lz = true;
            }
        }

        public final boolean aa()
        {
            return lz;
        }

        public final void cancel()
        {
            ly.countDown();
        }

        public final void run()
        {
            try
            {
                if (!ly.await(lx, TimeUnit.MILLISECONDS))
                {
                    disconnect();
                }
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                disconnect();
            }
        }

        public a(AdvertisingIdClient advertisingidclient, long l)
        {
            lw = new WeakReference(advertisingidclient);
            lx = l;
            ly = new CountDownLatch(1);
            lz = false;
            start();
        }
    }


    com.google.android.gms.common.a lq;
    x lr;
    boolean ls;
    Object lt;
    a lu;
    final long lv;
    private final Context mContext;

    private AdvertisingIdClient(Context context, long l)
    {
        lt = new Object();
        kn.k(context);
        mContext = context;
        ls = false;
        lv = l;
    }

    private void Z()
    {
        Object obj = lt;
        obj;
        JVM INSTR monitorenter ;
        if (lu == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        lu.cancel();
        Exception exception;
        try
        {
            lu.join();
        }
        catch (InterruptedException interruptedexception) { }
        if (lv > 0L)
        {
            lu = new a(this, lv);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static x a(Context context, com.google.android.gms.common.a a1)
        throws IOException
    {
        try
        {
            context = com.google.android.gms.internal.x.a.g(a1.hO());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException("Interrupted exception");
        }
        return context;
    }

    private void b(boolean flag)
        throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        kn.be("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (ls)
        {
            finish();
        }
        lq = h(mContext);
        lr = a(mContext, lq);
        ls = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        Z();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static Info getAdvertisingIdInfo(Context context)
        throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        context = new AdvertisingIdClient(context, -1L);
        Info info;
        context.b(false);
        info = context.getInfo();
        context.finish();
        return info;
        Exception exception;
        exception;
        context.finish();
        throw exception;
    }

    private Info getInfo()
        throws IOException
    {
        kn.be("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (ls)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        Object obj = lt;
        obj;
        JVM INSTR monitorenter ;
        if (lu == null || !lu.aa())
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
        b(false);
        if (!ls)
        {
            throw new IOException("AdvertisingIdClient cannot reconnect.");
        }
        break MISSING_BLOCK_LABEL_94;
        Object obj1;
        obj1;
        throw new IOException("AdvertisingIdClient cannot reconnect.", ((Throwable) (obj1)));
        kn.k(lq);
        kn.k(lr);
        obj1 = new Info(lr.getId(), lr.c(true));
        this;
        JVM INSTR monitorexit ;
        Z();
        return ((Info) (obj1));
        obj1;
        Log.i("AdvertisingIdClient", "GMS remote exception ", ((Throwable) (obj1)));
        throw new IOException("Remote exception");
    }

    private static com.google.android.gms.common.a h(Context context)
        throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        com.google.android.gms.common.a a1;
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
            GooglePlayServicesUtil.B(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException(context);
        }
        a1 = new com.google.android.gms.common.a();
        intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, a1, 1))
        {
            return a1;
        } else
        {
            throw new IOException("Connection failure");
        }
    }

    protected final void finalize()
        throws Throwable
    {
        finish();
        super.finalize();
    }

    public final void finish()
    {
        kn.be("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (mContext != null && lq != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (ls)
        {
            mContext.unbindService(lq);
        }
_L1:
        ls = false;
        lr = null;
        lq = null;
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
}
