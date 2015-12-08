// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            CapabilityInfo, Channel, DataEventBuffer, MessageEvent, 
//            Node

public abstract class WearableListenerService extends Service
    implements CapabilityApi.CapabilityListener, ChannelApi.ChannelListener, DataApi.DataListener, MessageApi.MessageListener, NodeApi.NodeListener, NodeApi.zza
{

    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private boolean zzJA;
    private String zzMZ;
    private volatile int zzZN;
    private IBinder zzZQ;
    private Handler zzaTd;
    private Object zzaTe;

    public WearableListenerService()
    {
        zzZN = -1;
        zzaTe = new Object();
    }

    private void zzAS()
    {
        int i = Binder.getCallingUid();
        if (i == zzZN)
        {
            return;
        }
        if (GooglePlayServicesUtil.a(this, i))
        {
            zzZN = i;
            return;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    static String zza(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzMZ;
    }

    static void zzb(WearableListenerService wearablelistenerservice)
    {
        wearablelistenerservice.zzAS();
    }

    static Object zzc(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzaTe;
    }

    static boolean zzd(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzJA;
    }

    static Handler zze(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzaTd;
    }

    public final IBinder onBind(Intent intent)
    {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()))
        {
            return zzZQ;
        } else
        {
            return null;
        }
    }

    public void onCapabilityChanged(CapabilityInfo capabilityinfo)
    {
    }

    public void onChannelClosed(Channel channel, int i, int j)
    {
    }

    public void onChannelOpened(Channel channel)
    {
    }

    public void onConnectedNodes(List list)
    {
    }

    public void onCreate()
    {
        super.onCreate();
        if (Log.isLoggable("WearableLS", 3))
        {
            Log.d("WearableLS", (new StringBuilder()).append("onCreate: ").append(getPackageName()).toString());
        }
        zzMZ = getPackageName();
        HandlerThread handlerthread = new HandlerThread("WearableListenerService");
        handlerthread.start();
        zzaTd = new Handler(handlerthread.getLooper());
        zzZQ = new zza();
    }

    public void onDataChanged(DataEventBuffer dataeventbuffer)
    {
    }

    public void onDestroy()
    {
        Object obj = zzaTe;
        obj;
        JVM INSTR monitorenter ;
        zzJA = true;
        if (zzaTd == null)
        {
            throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
        }
        break MISSING_BLOCK_LABEL_34;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzaTd.getLooper().quit();
        obj;
        JVM INSTR monitorexit ;
        super.onDestroy();
        return;
    }

    public void onInputClosed(Channel channel, int i, int j)
    {
    }

    public void onMessageReceived(MessageEvent messageevent)
    {
    }

    public void onOutputClosed(Channel channel, int i, int j)
    {
    }

    public void onPeerConnected(Node node)
    {
    }

    public void onPeerDisconnected(Node node)
    {
    }

    private class zza extends com.google.android.gms.wearable.internal.zzas.zza
    {

        boolean a;
        final WearableListenerService b;

        public void a(DataHolder dataholder)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onDataItemChanged: ").append(WearableListenerService.zza(b)).append(": ").append(dataholder).toString());
                }
                WearableListenerService.zzb(b);
                synchronized (WearableListenerService.zzc(b))
                {
                    if (!WearableListenerService.zzd(b))
                    {
                        break label0;
                    }
                    dataholder.i();
                }
                return;
            }
            WearableListenerService.zze(b).post(new Runnable(dataholder) {

                final DataHolder a;
                final zza b;

                public void run()
                {
                    DataEventBuffer dataeventbuffer = new DataEventBuffer(a);
                    b.b.onDataChanged(dataeventbuffer);
                    dataeventbuffer.f_();
                    return;
                    Exception exception;
                    exception;
                    dataeventbuffer.f_();
                    throw exception;
                }

                
                {
                    b = zza.this;
                    a = dataholder;
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

        public void a(AncsNotificationParcelable ancsnotificationparcelable)
        {
            zzh zzh1;
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder()).append("onNotificationReceived: ").append(ancsnotificationparcelable).toString());
            }
            if (!a)
            {
                return;
            }
            WearableListenerService.zzb(b);
            zzh1 = (zzh)b;
            synchronized (WearableListenerService.zzc(b))
            {
                if (!WearableListenerService.zzd(b))
                {
                    break MISSING_BLOCK_LABEL_85;
                }
            }
            return;
            ancsnotificationparcelable;
            obj;
            JVM INSTR monitorexit ;
            throw ancsnotificationparcelable;
            WearableListenerService.zze(b).post(new Runnable(zzh1, ancsnotificationparcelable) {

                final zzh a;
                final AncsNotificationParcelable b;
                final zza c;

                public void run()
                {
                    a.a(b);
                }

                
                {
                    c = zza.this;
                    a = zzh1;
                    b = ancsnotificationparcelable;
                    super();
                }
            });
            obj;
            JVM INSTR monitorexit ;
        }

        public void a(CapabilityInfoParcelable capabilityinfoparcelable)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onConnectedCapabilityChanged: ").append(capabilityinfoparcelable).toString());
                }
                WearableListenerService.zzb(b);
                synchronized (WearableListenerService.zzc(b))
                {
                    if (!WearableListenerService.zzd(b))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.zze(b).post(new Runnable(capabilityinfoparcelable) {

                final CapabilityInfoParcelable a;
                final zza b;

                public void run()
                {
                    b.b.onCapabilityChanged(a);
                }

                
                {
                    b = zza.this;
                    a = capabilityinfoparcelable;
                    super();
                }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            capabilityinfoparcelable;
            obj;
            JVM INSTR monitorexit ;
            throw capabilityinfoparcelable;
        }

        public void a(ChannelEventParcelable channeleventparcelable)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onChannelEvent: ").append(channeleventparcelable).toString());
                }
                WearableListenerService.zzb(b);
                synchronized (WearableListenerService.zzc(b))
                {
                    if (!WearableListenerService.zzd(b))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.zze(b).post(new Runnable(channeleventparcelable) {

                final ChannelEventParcelable a;
                final zza b;

                public void run()
                {
                    a.a(b.b);
                }

                
                {
                    b = zza.this;
                    a = channeleventparcelable;
                    super();
                }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            channeleventparcelable;
            obj;
            JVM INSTR monitorexit ;
            throw channeleventparcelable;
        }

        public void a(MessageEventParcelable messageeventparcelable)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onMessageReceived: ").append(messageeventparcelable).toString());
                }
                WearableListenerService.zzb(b);
                synchronized (WearableListenerService.zzc(b))
                {
                    if (!WearableListenerService.zzd(b))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.zze(b).post(new Runnable(messageeventparcelable) {

                final MessageEventParcelable a;
                final zza b;

                public void run()
                {
                    b.b.onMessageReceived(a);
                }

                
                {
                    b = zza.this;
                    a = messageeventparcelable;
                    super();
                }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            messageeventparcelable;
            obj;
            JVM INSTR monitorexit ;
            throw messageeventparcelable;
        }

        public void a(NodeParcelable nodeparcelable)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onPeerConnected: ").append(WearableListenerService.zza(b)).append(": ").append(nodeparcelable).toString());
                }
                WearableListenerService.zzb(b);
                synchronized (WearableListenerService.zzc(b))
                {
                    if (!WearableListenerService.zzd(b))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.zze(b).post(new Runnable(nodeparcelable) {

                final NodeParcelable a;
                final zza b;

                public void run()
                {
                    b.b.onPeerConnected(a);
                }

                
                {
                    b = zza.this;
                    a = nodeparcelable;
                    super();
                }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            nodeparcelable;
            obj;
            JVM INSTR monitorexit ;
            throw nodeparcelable;
        }

        public void a(List list)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onConnectedNodes: ").append(WearableListenerService.zza(b)).append(": ").append(list).toString());
                }
                WearableListenerService.zzb(b);
                synchronized (WearableListenerService.zzc(b))
                {
                    if (!WearableListenerService.zzd(b))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.zze(b).post(new Runnable(list) {

                final List a;
                final zza b;

                public void run()
                {
                    b.b.onConnectedNodes(a);
                }

                
                {
                    b = zza.this;
                    a = list;
                    super();
                }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            list;
            obj;
            JVM INSTR monitorexit ;
            throw list;
        }

        public void b(NodeParcelable nodeparcelable)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder()).append("onPeerDisconnected: ").append(WearableListenerService.zza(b)).append(": ").append(nodeparcelable).toString());
                }
                WearableListenerService.zzb(b);
                synchronized (WearableListenerService.zzc(b))
                {
                    if (!WearableListenerService.zzd(b))
                    {
                        break label0;
                    }
                }
                return;
            }
            WearableListenerService.zze(b).post(new Runnable(nodeparcelable) {

                final NodeParcelable a;
                final zza b;

                public void run()
                {
                    b.b.onPeerDisconnected(a);
                }

                
                {
                    b = zza.this;
                    a = nodeparcelable;
                    super();
                }
            });
            obj;
            JVM INSTR monitorexit ;
            return;
            nodeparcelable;
            obj;
            JVM INSTR monitorexit ;
            throw nodeparcelable;
        }

        zza()
        {
            b = WearableListenerService.this;
            super();
            a = false;
            a = WearableListenerService.this instanceof zzh;
        }
    }

}
