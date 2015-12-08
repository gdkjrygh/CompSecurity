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
import com.google.android.gms.wearable.internal.ai;
import com.google.android.gms.wearable.internal.al;

// Referenced classes of package com.google.android.gms.wearable:
//            DataEventBuffer, MessageEvent, Node

public abstract class WearableListenerService extends Service
    implements DataApi.DataListener, MessageApi.MessageListener, NodeApi.NodeListener
{
    private class a extends com.google.android.gms.wearable.internal.ae.a
    {

        final WearableListenerService axq;

        public void a(ai ai)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onMessageReceived: ").append(ai).toString());
                }
                WearableListenerService.b(axq);
                synchronized (WearableListenerService.c(axq))
                {
                    if (!WearableListenerService.d(axq))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.e(axq).post(new Runnable(this, ai) {

                final a axs;
                final ai axt;

                public void run()
                {
                    axs.axq.onMessageReceived(axt);
                }

            
            {
                axs = a1;
                axt = ai;
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

        public void a(al al)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onPeerConnected: ").append(WearableListenerService.a(axq)).append(": ").append(al).toString());
                }
                WearableListenerService.b(axq);
                synchronized (WearableListenerService.c(axq))
                {
                    if (!WearableListenerService.d(axq))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.e(axq).post(new Runnable(this, al) {

                final a axs;
                final al axu;

                public void run()
                {
                    axs.axq.onPeerConnected(axu);
                }

            
            {
                axs = a1;
                axu = al;
                super();
            }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            al;
            obj;
            JVM INSTR monitorexit ;
            throw al;
        }

        public void aa(DataHolder dataholder)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onDataItemChanged: ").append(WearableListenerService.a(axq)).append(": ").append(dataholder).toString());
                }
                WearableListenerService.b(axq);
                synchronized (WearableListenerService.c(axq))
                {
                    if (!WearableListenerService.d(axq))
                    {
                        break label0;
                    }
                    dataholder.close();
                }
                return;
            }
            WearableListenerService.e(axq).post(new Runnable(this, dataholder) {

                final DataHolder axr;
                final a axs;

                public void run()
                {
                    DataEventBuffer dataeventbuffer = new DataEventBuffer(axr);
                    axs.axq.onDataChanged(dataeventbuffer);
                    dataeventbuffer.release();
                    return;
                    Exception exception;
                    exception;
                    dataeventbuffer.release();
                    throw exception;
                }

            
            {
                axs = a1;
                axr = dataholder;
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

        public void b(al al)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onPeerDisconnected: ").append(WearableListenerService.a(axq)).append(": ").append(al).toString());
                }
                WearableListenerService.b(axq);
                synchronized (WearableListenerService.c(axq))
                {
                    if (!WearableListenerService.d(axq))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.e(axq).post(new Runnable(this, al) {

                final a axs;
                final al axu;

                public void run()
                {
                    axs.axq.onPeerDisconnected(axu);
                }

            
            {
                axs = a1;
                axu = al;
                super();
            }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            al;
            obj;
            JVM INSTR monitorexit ;
            throw al;
        }

        private a()
        {
            axq = WearableListenerService.this;
            super();
        }

    }


    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private String CS;
    private IBinder Nk;
    private volatile int Pj;
    private Handler axn;
    private Object axo;
    private boolean axp;

    public WearableListenerService()
    {
        Pj = -1;
        axo = new Object();
    }

    static String a(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.CS;
    }

    static void b(WearableListenerService wearablelistenerservice)
        throws SecurityException
    {
        wearablelistenerservice.rl();
    }

    private boolean bh(int i)
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

    static Object c(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.axo;
    }

    static boolean d(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.axp;
    }

    static Handler e(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.axn;
    }

    private void rl()
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if (i == Pj)
        {
            return;
        }
        if (GooglePlayServicesUtil.b(getPackageManager(), "com.google.android.gms") && bh(i))
        {
            Pj = i;
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
            return Nk;
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
        CS = getPackageName();
        HandlerThread handlerthread = new HandlerThread("WearableListenerService");
        handlerthread.start();
        axn = new Handler(handlerthread.getLooper());
        Nk = new a();
    }

    public void onDataChanged(DataEventBuffer dataeventbuffer)
    {
    }

    public void onDestroy()
    {
        synchronized (axo)
        {
            axp = true;
            axn.getLooper().quit();
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
