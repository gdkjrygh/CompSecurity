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
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.s;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AdvertisingIdClient
{
    public static final class Info
    {

        private final String lx;
        private final boolean ly;

        public String getId()
        {
            return lx;
        }

        public boolean isLimitAdTrackingEnabled()
        {
            return ly;
        }

        public String toString()
        {
            return (new StringBuilder()).append("{").append(lx).append("}").append(ly).toString();
        }

        public Info(String s1, boolean flag)
        {
            lx = s1;
            ly = flag;
        }
    }

    static class a extends Thread
    {

        private WeakReference lt;
        private long lu;
        CountDownLatch lv;
        boolean lw;

        private void disconnect()
        {
            AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)lt.get();
            if (advertisingidclient != null)
            {
                advertisingidclient.finish();
                lw = true;
            }
        }

        public boolean aa()
        {
            return lw;
        }

        public void cancel()
        {
            lv.countDown();
        }

        public void run()
        {
            try
            {
                if (!lv.await(lu, TimeUnit.MILLISECONDS))
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
            lt = new WeakReference(advertisingidclient);
            lu = l;
            lv = new CountDownLatch(1);
            lw = false;
            start();
        }
    }


    com.google.android.gms.common.a ln;
    s lo;
    boolean lp;
    Object lq;
    a lr;
    final long ls;
    private final Context mContext;

    public AdvertisingIdClient(Context context)
    {
        this(context, 30000L);
    }

    public AdvertisingIdClient(Context context, long l)
    {
        lq = new Object();
        jx.i(context);
        mContext = context;
        lp = false;
        ls = l;
    }

    private void Z()
    {
        Object obj = lq;
        obj;
        JVM INSTR monitorenter ;
        if (lr == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        lr.cancel();
        Exception exception;
        try
        {
            lr.join();
        }
        catch (InterruptedException interruptedexception) { }
        if (ls > 0L)
        {
            lr = new a(this, ls);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static s a(Context context, com.google.android.gms.common.a a1)
        throws IOException
    {
        try
        {
            context = com.google.android.gms.internal.s.a.b(a1.gs());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException("Interrupted exception");
        }
        return context;
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

    static com.google.android.gms.common.a h(Context context)
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
            GooglePlayServicesUtil.C(context);
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

    protected void b(boolean flag)
        throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        jx.aV("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (lp)
        {
            finish();
        }
        ln = h(mContext);
        lo = a(mContext, ln);
        lp = true;
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

    protected void finalize()
        throws Throwable
    {
        finish();
        super.finalize();
    }

    public void finish()
    {
        jx.aV("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (mContext != null && ln != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (lp)
        {
            mContext.unbindService(ln);
        }
_L1:
        lp = false;
        lo = null;
        ln = null;
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

    public Info getInfo()
        throws IOException
    {
        jx.aV("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (lp)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        Object obj = lq;
        obj;
        JVM INSTR monitorenter ;
        if (lr == null || !lr.aa())
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
        if (!lp)
        {
            throw new IOException("AdvertisingIdClient cannot reconnect.");
        }
        break MISSING_BLOCK_LABEL_94;
        Object obj1;
        obj1;
        throw new IOException("AdvertisingIdClient cannot reconnect.", ((Throwable) (obj1)));
        jx.i(ln);
        jx.i(lo);
        obj1 = new Info(lo.getId(), lo.c(true));
        this;
        JVM INSTR monitorexit ;
        Z();
        return ((Info) (obj1));
        obj1;
        Log.i("AdvertisingIdClient", "GMS remote exception ", ((Throwable) (obj1)));
        throw new IOException("Remote exception");
    }

    public void start()
        throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        b(true);
    }
}
