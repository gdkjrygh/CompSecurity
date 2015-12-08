// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.b;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.f;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AdvertisingIdClient
{
    public static final class Info
    {

        private final String zzom;
        private final boolean zzon;

        public final String getId()
        {
            return zzom;
        }

        public final boolean isLimitAdTrackingEnabled()
        {
            return zzon;
        }

        public final String toString()
        {
            return (new StringBuilder("{")).append(zzom).append("}").append(zzon).toString();
        }

        public Info(String s, boolean flag)
        {
            zzom = s;
            zzon = flag;
        }
    }

    static final class a extends Thread
    {

        CountDownLatch a;
        boolean b;
        private WeakReference c;
        private long d;

        private void a()
        {
            AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)c.get();
            if (advertisingidclient != null)
            {
                advertisingidclient.finish();
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

        public a(AdvertisingIdClient advertisingidclient, long l)
        {
            c = new WeakReference(advertisingidclient);
            d = l;
            a = new CountDownLatch(1);
            b = false;
            start();
        }
    }


    private static boolean zzoh = false;
    private final Context mContext;
    d zzob;
    f zzoc;
    boolean zzod;
    Object zzoe;
    a zzof;
    final long zzog;

    public AdvertisingIdClient(Context context)
    {
        this(context, 30000L);
    }

    public AdvertisingIdClient(Context context, long l)
    {
        zzoe = new Object();
        u.a(context);
        mContext = context;
        zzod = false;
        zzog = l;
    }

    public static Info getAdvertisingIdInfo(Context context)
        throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        context = new AdvertisingIdClient(context, -1L);
        Info info;
        context.zzb(false);
        info = context.getInfo();
        context.finish();
        return info;
        Exception exception;
        exception;
        context.finish();
        throw exception;
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean flag)
    {
        zzoh = flag;
    }

    static f zza(Context context, d d1)
        throws IOException
    {
        try
        {
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
            }
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
        if (d1.a)
        {
            throw new IllegalStateException();
        }
        d1.a = true;
        context = com.google.android.gms.internal.f.a.a((IBinder)d1.b.take());
        return context;
    }

    private void zzaJ()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (zzof == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        zzof.a.countDown();
        Exception exception;
        try
        {
            zzof.join();
        }
        catch (InterruptedException interruptedexception) { }
        if (zzog > 0L)
        {
            zzof = new a(this, zzog);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static d zzo(Context context)
        throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new GooglePlayServicesNotAvailableException(9);
        }
        d d1;
        Intent intent;
        boolean flag;
        if (zzoh)
        {
            Log.d("Ads", "Skipping gmscore version check");
            b.a();
            switch (b.a(context))
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
                GooglePlayServicesUtil.zzaa(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new IOException(context);
            }
        }
        d1 = new d();
        intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try
        {
            flag = com.google.android.gms.common.stats.b.a().a(context, intent, d1, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException(context);
        }
        if (flag)
        {
            return d1;
        } else
        {
            throw new IOException("Connection failure");
        }
    }

    protected void finalize()
        throws Throwable
    {
        finish();
        super.finalize();
    }

    public void finish()
    {
        u.c("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (mContext != null && zzob != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (zzod)
        {
            com.google.android.gms.common.stats.b.a().a(mContext, zzob);
        }
_L1:
        zzod = false;
        zzoc = null;
        zzob = null;
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
        u.c("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (zzod)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (zzof == null || !zzof.b)
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
        zzb(false);
        if (!zzod)
        {
            throw new IOException("AdvertisingIdClient cannot reconnect.");
        }
        break MISSING_BLOCK_LABEL_94;
        Object obj1;
        obj1;
        throw new IOException("AdvertisingIdClient cannot reconnect.", ((Throwable) (obj1)));
        u.a(zzob);
        u.a(zzoc);
        obj1 = new Info(zzoc.a(), zzoc.a(true));
        this;
        JVM INSTR monitorexit ;
        zzaJ();
        return ((Info) (obj1));
        obj1;
        Log.i("AdvertisingIdClient", "GMS remote exception ", ((Throwable) (obj1)));
        throw new IOException("Remote exception");
    }

    public void start()
        throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        zzb(true);
    }

    protected void zzb(boolean flag)
        throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        u.c("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (zzod)
        {
            finish();
        }
        zzob = zzo(mContext);
        zzoc = zza(mContext, zzob);
        zzod = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzaJ();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
