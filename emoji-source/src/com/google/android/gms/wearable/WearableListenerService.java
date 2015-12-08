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

        final WearableListenerService alu;

        public void Y(DataHolder dataholder)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onDataItemChanged: ").append(WearableListenerService.a(alu)).append(": ").append(dataholder).toString());
                }
                WearableListenerService.b(alu);
                synchronized (WearableListenerService.c(alu))
                {
                    if (!WearableListenerService.d(alu))
                    {
                        break label0;
                    }
                    dataholder.close();
                }
                return;
            }
            WearableListenerService.e(alu).post(new Runnable(this, dataholder) {

                final DataHolder alv;
                final a alw;

                public void run()
                {
                    DataEventBuffer dataeventbuffer = new DataEventBuffer(alv);
                    alw.alu.onDataChanged(dataeventbuffer);
                    dataeventbuffer.release();
                    return;
                    Exception exception;
                    exception;
                    dataeventbuffer.release();
                    throw exception;
                }

            
            {
                alw = a1;
                alv = dataholder;
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
                WearableListenerService.b(alu);
                synchronized (WearableListenerService.c(alu))
                {
                    if (!WearableListenerService.d(alu))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.e(alu).post(new Runnable(this, af) {

                final a alw;
                final af alx;

                public void run()
                {
                    alw.alu.onMessageReceived(alx);
                }

            
            {
                alw = a1;
                alx = af;
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
                    Log.d("WearableLS", (new StringBuilder()).append("onPeerConnected: ").append(WearableListenerService.a(alu)).append(": ").append(ai).toString());
                }
                WearableListenerService.b(alu);
                synchronized (WearableListenerService.c(alu))
                {
                    if (!WearableListenerService.d(alu))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.e(alu).post(new Runnable(this, ai) {

                final a alw;
                final ai aly;

                public void run()
                {
                    alw.alu.onPeerConnected(aly);
                }

            
            {
                alw = a1;
                aly = ai;
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
                    Log.d("WearableLS", (new StringBuilder()).append("onPeerDisconnected: ").append(WearableListenerService.a(alu)).append(": ").append(ai).toString());
                }
                WearableListenerService.b(alu);
                synchronized (WearableListenerService.c(alu))
                {
                    if (!WearableListenerService.d(alu))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.e(alu).post(new Runnable(this, ai) {

                final a alw;
                final ai aly;

                public void run()
                {
                    alw.alu.onPeerDisconnected(aly);
                }

            
            {
                alw = a1;
                aly = ai;
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
            alu = WearableListenerService.this;
            super();
        }

    }


    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private IBinder GC;
    private volatile int alq;
    private Handler alr;
    private Object als;
    private boolean alt;
    private String xQ;

    public WearableListenerService()
    {
        alq = -1;
        als = new Object();
    }

    static String a(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.xQ;
    }

    static void b(WearableListenerService wearablelistenerservice)
        throws SecurityException
    {
        wearablelistenerservice.nn();
    }

    static Object c(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.als;
    }

    static boolean d(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.alt;
    }

    static Handler e(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.alr;
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

    private void nn()
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if (i == alq)
        {
            return;
        }
        if (GooglePlayServicesUtil.b(getPackageManager(), "com.google.android.gms") && ed(i))
        {
            alq = i;
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
            return GC;
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
        xQ = getPackageName();
        HandlerThread handlerthread = new HandlerThread("WearableListenerService");
        handlerthread.start();
        alr = new Handler(handlerthread.getLooper());
        GC = new a();
    }

    public void onDataChanged(DataEventBuffer dataeventbuffer)
    {
    }

    public void onDestroy()
    {
        synchronized (als)
        {
            alt = true;
            alr.getLooper().quit();
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
