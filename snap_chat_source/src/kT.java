// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.snapchat.android.Timber;
import java.io.IOException;

public final class kT
{

    private static final kT INSTANCE = new kT();
    private static final String TAG = "DeviceAdvertiserIdManager";
    private com.google.android.gms.ads.identifier.AdvertisingIdClient.Info mAdvertisingIdClientInfo;
    public Context mContext;
    private final Object mMutex = new Object();

    public kT()
    {
        mAdvertisingIdClientInfo = null;
    }

    static Context a(kT kt)
    {
        return kt.mContext;
    }

    static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info a(Context context)
    {
        return b(context);
    }

    public static kT a()
    {
        kT;
        JVM INSTR monitorenter ;
        kT kt = INSTANCE;
        kT;
        JVM INSTR monitorexit ;
        return kt;
        Exception exception;
        exception;
        throw exception;
    }

    private static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info b(Context context)
    {
        PG.b();
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) != 0) goto _L2; else goto _L1
_L1:
        context = AdvertisingIdClient.getAdvertisingIdInfo(context);
        return context;
        context;
_L4:
        Timber.e("DeviceAdvertiserIdManager", String.format("Google advertising id lookup failed, by error %s", new Object[] {
            context.toString()
        }), new Object[0]);
_L2:
        return null;
        context;
        continue; /* Loop/switch isn't completed */
        context;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void a(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info)
    {
        synchronized (mMutex)
        {
            mAdvertisingIdClientInfo = info;
        }
        return;
        info;
        obj;
        JVM INSTR monitorexit ;
        throw info;
    }

    public final com.google.android.gms.ads.identifier.AdvertisingIdClient.Info b()
    {
        if (!PG.c())
        {
            a(b(mContext));
        }
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        synchronized (mMutex)
        {
            info = mAdvertisingIdClientInfo;
        }
        return info;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }


    // Unreferenced inner class kT$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        final kT this$0;

        public final void run()
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = kT.a(kT.a(kT.this));
            a(info);
        }

            public 
            {
                this$0 = kT.this;
                super();
            }
    }

}
