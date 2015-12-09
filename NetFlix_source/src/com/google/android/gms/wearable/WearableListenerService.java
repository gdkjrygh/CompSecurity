// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.ki;
import com.google.android.gms.internal.kk;

// Referenced classes of package com.google.android.gms.wearable:
//            b, e, f

public abstract class WearableListenerService extends Service
{
    private class a extends com.google.android.gms.internal.kh.a
    {

        final WearableListenerService adx;

        public void M(DataHolder dataholder)
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder()).append("onDataItemChanged: ").append(WearableListenerService.a(adx)).append(": ").append(dataholder).toString());
            }
            WearableListenerService.b(adx);
            WearableListenerService.c(adx).post(new Runnable(this, dataholder) {

                final DataHolder ady;
                final a adz;

                public void run()
                {
                    b b1 = new b(ady);
                    adz.adx.onDataChanged(b1);
                    b1.close();
                    return;
                    Exception exception;
                    exception;
                    b1.close();
                    throw exception;
                }

            
            {
                adz = a1;
                ady = dataholder;
                super();
            }
            });
        }

        public void a(ki ki)
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder()).append("onMessageReceived: ").append(ki).toString());
            }
            WearableListenerService.b(adx);
            WearableListenerService.c(adx).post(new Runnable(this, ki) {

                final ki adA;
                final a adz;

                public void run()
                {
                    adz.adx.onMessageReceived(adA);
                }

            
            {
                adz = a1;
                adA = ki;
                super();
            }
            });
        }

        public void a(kk kk)
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder()).append("onPeerConnected: ").append(WearableListenerService.a(adx)).append(": ").append(kk).toString());
            }
            WearableListenerService.b(adx);
            WearableListenerService.c(adx).post(new Runnable(this, kk) {

                final kk adB;
                final a adz;

                public void run()
                {
                    adz.adx.onPeerConnected(adB);
                }

            
            {
                adz = a1;
                adB = kk;
                super();
            }
            });
        }

        public void b(kk kk)
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder()).append("onPeerDisconnected: ").append(WearableListenerService.a(adx)).append(": ").append(kk).toString());
            }
            WearableListenerService.b(adx);
            WearableListenerService.c(adx).post(new Runnable(this, kk) {

                final kk adB;
                final a adz;

                public void run()
                {
                    adz.adx.onPeerDisconnected(adB);
                }

            
            {
                adz = a1;
                adB = kk;
                super();
            }
            });
        }

        private a()
        {
            adx = WearableListenerService.this;
            super();
        }

    }


    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private IBinder DB;
    private volatile int adu;
    private String adv;
    private Handler adw;

    public WearableListenerService()
    {
        adu = -1;
    }

    static String a(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.adv;
    }

    static void b(WearableListenerService wearablelistenerservice)
        throws SecurityException
    {
        wearablelistenerservice.md();
    }

    static Handler c(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.adw;
    }

    private boolean cM(int i)
    {
        String as[];
        boolean flag;
        boolean flag1;
        flag1 = false;
        as = getPackageManager().getPackagesForUid(i);
        flag = flag1;
        if (as == null) goto _L2; else goto _L1
_L1:
        i = 0;
_L7:
        flag = flag1;
        if (i >= as.length) goto _L2; else goto _L3
_L3:
        if (!"com.google.android.gms".equals(as[i])) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void md()
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if (i == adu)
        {
            return;
        }
        if (GooglePlayServicesUtil.b(getPackageManager(), "com.google.android.gms") && cM(i))
        {
            adu = i;
            return;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    public IBinder onBind(Intent intent)
    {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()))
        {
            return DB;
        } else
        {
            return null;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        if (Log.isLoggable("WearableLS", 3))
        {
            Log.d("WearableLS", (new StringBuilder()).append("onCreate: ").append(getPackageName()).toString());
        }
        adv = getPackageName();
        HandlerThread handlerthread = new HandlerThread("WearableListenerService");
        handlerthread.start();
        adw = new Handler(handlerthread.getLooper());
        DB = new a();
    }

    public void onDataChanged(b b1)
    {
    }

    public void onDestroy()
    {
        adw.getLooper().quit();
        super.onDestroy();
    }

    public void onMessageReceived(e e)
    {
    }

    public void onPeerConnected(f f)
    {
    }

    public void onPeerDisconnected(f f)
    {
    }
}
