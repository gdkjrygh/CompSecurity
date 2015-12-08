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
import com.google.android.gms.wearable.internal.af;
import com.google.android.gms.wearable.internal.ai;

// Referenced classes of package com.google.android.gms.wearable:
//            DataEventBuffer, MessageEvent, Node

public abstract class WearableListenerService extends Service
    implements DataApi.DataListener, MessageApi.MessageListener, NodeApi.NodeListener
{
    private class a extends com.google.android.gms.wearable.internal.ac.a
    {

        final WearableListenerService alr;

        public void Y(DataHolder dataholder)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onDataItemChanged: ").append(WearableListenerService.a(alr)).append(": ").append(dataholder).toString());
                }
                WearableListenerService.b(alr);
                synchronized (WearableListenerService.c(alr))
                {
                    if (!WearableListenerService.d(alr))
                    {
                        break label0;
                    }
                    dataholder.close();
                }
                return;
            }
            WearableListenerService.e(alr).post(new Runnable(this, dataholder) {

                final DataHolder als;
                final a alt;

                public void run()
                {
                    DataEventBuffer dataeventbuffer = new DataEventBuffer(als);
                    alt.alr.onDataChanged(dataeventbuffer);
                    dataeventbuffer.release();
                    return;
                    Exception exception;
                    exception;
                    dataeventbuffer.release();
                    throw exception;
                }

            
            {
                alt = a1;
                als = dataholder;
                super();
            }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            dataholder;
            obj;
            JVM INSTR monitorexit ;
            throw dataholder;
        }

        public void a(af af)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onMessageReceived: ").append(af).toString());
                }
                WearableListenerService.b(alr);
                synchronized (WearableListenerService.c(alr))
                {
                    if (!WearableListenerService.d(alr))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.e(alr).post(new Runnable(this, af) {

                final a alt;
                final af alu;

                public void run()
                {
                    alt.alr.onMessageReceived(alu);
                }

            
            {
                alt = a1;
                alu = af;
                super();
            }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            af;
            obj;
            JVM INSTR monitorexit ;
            throw af;
        }

        public void a(ai ai)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onPeerConnected: ").append(WearableListenerService.a(alr)).append(": ").append(ai).toString());
                }
                WearableListenerService.b(alr);
                synchronized (WearableListenerService.c(alr))
                {
                    if (!WearableListenerService.d(alr))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.e(alr).post(new Runnable(this, ai) {

                final a alt;
                final ai alv;

                public void run()
                {
                    alt.alr.onPeerConnected(alv);
                }

            
            {
                alt = a1;
                alv = ai;
                super();
            }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            ai;
            obj;
            JVM INSTR monitorexit ;
            throw ai;
        }

        public void b(ai ai)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onPeerDisconnected: ").append(WearableListenerService.a(alr)).append(": ").append(ai).toString());
                }
                WearableListenerService.b(alr);
                synchronized (WearableListenerService.c(alr))
                {
                    if (!WearableListenerService.d(alr))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.e(alr).post(new Runnable(this, ai) {

                final a alt;
                final ai alv;

                public void run()
                {
                    alt.alr.onPeerDisconnected(alv);
                }

            
            {
                alt = a1;
                alv = ai;
                super();
            }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            ai;
            obj;
            JVM INSTR monitorexit ;
            throw ai;
        }

        private a()
        {
            alr = WearableListenerService.this;
            super();
        }

    }


    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private IBinder Gz;
    private volatile int aln;
    private Handler alo;
    private Object alp;
    private boolean alq;
    private String xN;

    public WearableListenerService()
    {
        aln = -1;
        alp = new Object();
    }

    static String a(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.xN;
    }

    static void b(WearableListenerService wearablelistenerservice)
        throws SecurityException
    {
        wearablelistenerservice.ni();
    }

    static Object c(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.alp;
    }

    static boolean d(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.alq;
    }

    static Handler e(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.alo;
    }

    private boolean ed(int i)
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

    private void ni()
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if (i == aln)
        {
            return;
        }
        if (GooglePlayServicesUtil.b(getPackageManager(), "com.google.android.gms") && ed(i))
        {
            aln = i;
            return;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    public final IBinder onBind(Intent intent)
    {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()))
        {
            return Gz;
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
        xN = getPackageName();
        HandlerThread handlerthread = new HandlerThread("WearableListenerService");
        handlerthread.start();
        alo = new Handler(handlerthread.getLooper());
        Gz = new a();
    }

    public void onDataChanged(DataEventBuffer dataeventbuffer)
    {
    }

    public void onDestroy()
    {
        synchronized (alp)
        {
            alq = true;
            alo.getLooper().quit();
        }
        super.onDestroy();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onMessageReceived(MessageEvent messageevent)
    {
    }

    public void onPeerConnected(Node node)
    {
    }

    public void onPeerDisconnected(Node node)
    {
    }
}
