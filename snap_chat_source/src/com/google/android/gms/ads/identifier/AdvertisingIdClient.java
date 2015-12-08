// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.zza;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzs;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AdvertisingIdClient
{
    public static final class Info
    {

        private final String zzlx;
        private final boolean zzly;

        public final String getId()
        {
            return zzlx;
        }

        public final boolean isLimitAdTrackingEnabled()
        {
            return zzly;
        }

        public final String toString()
        {
            return (new StringBuilder("{")).append(zzlx).append("}").append(zzly).toString();
        }

        public Info(String s, boolean flag)
        {
            zzlx = s;
            zzly = flag;
        }
    }

    static class zza extends Thread
    {

        private WeakReference zzlt;
        private long zzlu;
        CountDownLatch zzlv;
        boolean zzlw;

        private void disconnect()
        {
            AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)zzlt.get();
            if (advertisingidclient != null)
            {
                advertisingidclient.finish();
                zzlw = true;
            }
        }

        public void cancel()
        {
            zzlv.countDown();
        }

        public void run()
        {
            try
            {
                if (!zzlv.await(zzlu, TimeUnit.MILLISECONDS))
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

        public boolean zzaa()
        {
            return zzlw;
        }

        public zza(AdvertisingIdClient advertisingidclient, long l)
        {
            zzlt = new WeakReference(advertisingidclient);
            zzlu = l;
            zzlv = new CountDownLatch(1);
            zzlw = false;
            start();
        }
    }


    private final Context mContext;
    com.google.android.gms.common.zza zzln;
    zzs zzlo;
    boolean zzlp;
    Object zzlq;
    zza zzlr;
    final long zzls;

    public AdvertisingIdClient(Context context)
    {
        this(context, 30000L);
    }

    public AdvertisingIdClient(Context context, long l)
    {
        zzlq = new Object();
        zzx.zzl(context);
        mContext = context;
        zzlp = false;
        zzls = l;
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

    private void zzZ()
    {
        Object obj = zzlq;
        obj;
        JVM INSTR monitorenter ;
        if (zzlr == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        zzlr.cancel();
        Exception exception;
        try
        {
            zzlr.join();
        }
        catch (InterruptedException interruptedexception) { }
        if (zzls > 0L)
        {
            zzlr = new zza(this, zzls);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static zzs zza(Context context, com.google.android.gms.common.zza zza1)
    {
        try
        {
            context = com.google.android.gms.internal.zzs.zza.zzb(zza1.zzhJ());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException("Interrupted exception");
        }
        return context;
    }

    static com.google.android.gms.common.zza zzh(Context context)
    {
        com.google.android.gms.common.zza zza1;
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
            GooglePlayServicesUtil.zzI(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException(context);
        }
        zza1 = new com.google.android.gms.common.zza();
        intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (com.google.android.gms.internal.zzlo.zzka().zza(context, intent, zza1, 1))
        {
            return zza1;
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
        zzx.zzbe("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (mContext != null && zzln != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        try
        {
            if (zzlp)
            {
                com.google.android.gms.internal.zzlo.zzka().zza(mContext, zzln);
            }
        }
        catch (IllegalArgumentException illegalargumentexception) { }
        zzlp = false;
        zzlo = null;
        zzln = null;
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Info getInfo()
    {
        zzx.zzbe("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (zzlp)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        Object obj = zzlq;
        obj;
        JVM INSTR monitorenter ;
        if (zzlr == null || !zzlr.zzaa())
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
        if (!zzlp)
        {
            throw new IOException("AdvertisingIdClient cannot reconnect.");
        }
        break MISSING_BLOCK_LABEL_94;
        Object obj1;
        obj1;
        throw new IOException("AdvertisingIdClient cannot reconnect.", ((Throwable) (obj1)));
        zzx.zzl(zzln);
        zzx.zzl(zzlo);
        obj1 = new Info(zzlo.getId(), zzlo.zzc(true));
        this;
        JVM INSTR monitorexit ;
        zzZ();
        return ((Info) (obj1));
        obj1;
        throw new IOException("Remote exception");
    }

    public void start()
    {
        zzb(true);
    }

    protected void zzb(boolean flag)
    {
        zzx.zzbe("Calling this from your main thread can lead to deadlock");
        this;
        JVM INSTR monitorenter ;
        if (zzlp)
        {
            finish();
        }
        zzln = zzh(mContext);
        zzlo = zza(mContext, zzln);
        zzlp = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzZ();
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
