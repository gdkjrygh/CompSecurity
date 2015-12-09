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
import bqi;
import btl;
import bto;
import btx;
import bzq;
import bzr;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

public class AdvertisingIdClient
{

    private static boolean zzoh = false;
    private final Context mContext;
    btx zzob;
    bzq zzoc;
    boolean zzod;
    Object zzoe;
    zza zzof;
    final long zzog;

    public AdvertisingIdClient(Context context)
    {
        this(context, 30000L);
    }

    public AdvertisingIdClient(Context context, long l)
    {
        zzoe = new Object();
        btl.a(context);
        mContext = context;
        zzod = false;
        zzog = l;
    }

    public static Info getAdvertisingIdInfo(Context context)
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

    static bzq zza(Context context, btx btx1)
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
        if (btx1.a)
        {
            throw new IllegalStateException();
        }
        btx1.a = true;
        context = bzr.a((IBinder)btx1.b.take());
        return context;
    }

    private void zzaJ()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (zzof == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        zzof.cancel();
        Exception exception;
        try
        {
            zzof.join();
        }
        catch (InterruptedException interruptedexception) { }
        if (zzog > 0L)
        {
            zzof = new zza(zzog);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static btx zzo(Context context)
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
        btx btx1;
        Intent intent;
        boolean flag;
        if (zzoh)
        {
            Log.d("Ads", "Skipping gmscore version check");
            bqi.a();
            switch (bqi.a(context))
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
        btx1 = new btx();
        intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try
        {
            bto.a();
            flag = bto.b(context, intent, btx1, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException(context);
        }
        if (flag)
        {
            return btx1;
        } else
        {
            throw new IOException("Connection failure");
        }
    }

    protected void finalize()
    {
        finish();
        super.finalize();
    }

    public void finish()
    {
        btl.c("Calling this from your main thread can lead to deadlock");
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
            bto.a();
            bto.a(mContext, zzob);
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
    {
        btl.c("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (zzod)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (zzof == null || !zzof.zzaK())
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
        btl.a(zzob);
        btl.a(zzoc);
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
    {
        zzb(true);
    }

    protected void zzb(boolean flag)
    {
        btl.c("Calling this from your main thread can lead to deadlock");
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


    private class zza extends Thread
    {

        private WeakReference zzoi;
        private long zzoj;
        CountDownLatch zzok;
        boolean zzol;

        private void disconnect()
        {
            AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)zzoi.get();
            if (advertisingidclient != null)
            {
                advertisingidclient.finish();
                zzol = true;
            }
        }

        public void cancel()
        {
            zzok.countDown();
        }

        public void run()
        {
            try
            {
                if (!zzok.await(zzoj, TimeUnit.MILLISECONDS))
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

        public boolean zzaK()
        {
            return zzol;
        }

        public zza(long l)
        {
            zzoi = new WeakReference(AdvertisingIdClient.this);
            zzoj = l;
            zzok = new CountDownLatch(1);
            zzol = false;
            start();
        }
    }


    private class Info
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

}
