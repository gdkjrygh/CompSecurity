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
import com.google.android.gms.wearable.internal.ah;
import com.google.android.gms.wearable.internal.ak;

// Referenced classes of package com.google.android.gms.wearable:
//            DataEventBuffer, MessageEvent, Node

public abstract class WearableListenerService extends Service
    implements DataApi.DataListener, MessageApi.MessageListener, NodeApi.NodeListener
{
    private class a extends com.google.android.gms.wearable.internal.ae.a
    {

        final WearableListenerService avf;

        public void Z(DataHolder dataholder)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onDataItemChanged: ").append(WearableListenerService.a(avf)).append(": ").append(dataholder).toString());
                }
                WearableListenerService.b(avf);
                synchronized (WearableListenerService.c(avf))
                {
                    if (!WearableListenerService.d(avf))
                    {
                        break label0;
                    }
                    dataholder.close();
                }
                return;
            }
            WearableListenerService.e(avf).post(new Runnable(this, dataholder) {

                final DataHolder avg;
                final a avh;

                public void run()
                {
                    DataEventBuffer dataeventbuffer = new DataEventBuffer(avg);
                    avh.avf.onDataChanged(dataeventbuffer);
                    dataeventbuffer.release();
                    return;
                    Exception exception;
                    exception;
                    dataeventbuffer.release();
                    throw exception;
                }

            
            {
                avh = a1;
                avg = dataholder;
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

        public void a(ah ah)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onMessageReceived: ").append(ah).toString());
                }
                WearableListenerService.b(avf);
                synchronized (WearableListenerService.c(avf))
                {
                    if (!WearableListenerService.d(avf))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.e(avf).post(new Runnable(this, ah) {

                final a avh;
                final ah avi;

                public void run()
                {
                    avh.avf.onMessageReceived(avi);
                }

            
            {
                avh = a1;
                avi = ah;
                super();
            }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            ah;
            obj;
            JVM INSTR monitorexit ;
            throw ah;
        }

        public void a(ak ak)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onPeerConnected: ").append(WearableListenerService.a(avf)).append(": ").append(ak).toString());
                }
                WearableListenerService.b(avf);
                synchronized (WearableListenerService.c(avf))
                {
                    if (!WearableListenerService.d(avf))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.e(avf).post(new Runnable(this, ak) {

                final a avh;
                final ak avj;

                public void run()
                {
                    avh.avf.onPeerConnected(avj);
                }

            
            {
                avh = a1;
                avj = ak;
                super();
            }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            ak;
            obj;
            JVM INSTR monitorexit ;
            throw ak;
        }

        public void b(ak ak)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onPeerDisconnected: ").append(WearableListenerService.a(avf)).append(": ").append(ak).toString());
                }
                WearableListenerService.b(avf);
                synchronized (WearableListenerService.c(avf))
                {
                    if (!WearableListenerService.d(avf))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.e(avf).post(new Runnable(this, ak) {

                final a avh;
                final ak avj;

                public void run()
                {
                    avh.avf.onPeerDisconnected(avj);
                }

            
            {
                avh = a1;
                avj = ak;
                super();
            }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            ak;
            obj;
            JVM INSTR monitorexit ;
            throw ak;
        }

        private a()
        {
            avf = WearableListenerService.this;
            super();
        }

    }


    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private String BZ;
    private IBinder LZ;
    private volatile int NX;
    private Handler avc;
    private Object avd;
    private boolean ave;

    public WearableListenerService()
    {
        NX = -1;
        avd = new Object();
    }

    static String a(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.BZ;
    }

    static void b(WearableListenerService wearablelistenerservice)
        throws SecurityException
    {
        wearablelistenerservice.pU();
    }

    private boolean bc(int i)
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
        return wearablelistenerservice.avd;
    }

    static boolean d(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.ave;
    }

    static Handler e(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.avc;
    }

    private void pU()
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if (i == NX)
        {
            return;
        }
        if (GooglePlayServicesUtil.b(getPackageManager(), "com.google.android.gms") && bc(i))
        {
            NX = i;
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
            return LZ;
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
        BZ = getPackageName();
        HandlerThread handlerthread = new HandlerThread("WearableListenerService");
        handlerthread.start();
        avc = new Handler(handlerthread.getLooper());
        LZ = new a();
    }

    public void onDataChanged(DataEventBuffer dataeventbuffer)
    {
    }

    public void onDestroy()
    {
        synchronized (avd)
        {
            ave = true;
            avc.getLooper().quit();
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
