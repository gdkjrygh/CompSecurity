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
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.e;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            b, Channel, e, k, 
//            l, zzj

public abstract class WearableListenerService extends Service
    implements ChannelApi.a, a.a, c.b, j.a, m.a, m.b
{
    private final class a extends com.google.android.gms.wearable.internal.w.a
    {

        boolean a;
        final WearableListenerService b;

        public final void a(DataHolder dataholder)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    (new StringBuilder("onDataItemChanged: ")).append(WearableListenerService.zza(b)).append(": ").append(dataholder);
                }
                WearableListenerService.zzb(b);
                synchronized (WearableListenerService.zzc(b))
                {
                    if (!WearableListenerService.zzd(b))
                    {
                        break label0;
                    }
                    dataholder.g();
                }
                return;
            }
            WearableListenerService.zze(b).post(new Runnable(this, dataholder) {

                final DataHolder a;
                final a b;

                public final void run()
                {
                    com.google.android.gms.wearable.e e1 = new com.google.android.gms.wearable.e(a);
                    b.b.onDataChanged(e1);
                    e1.a();
                    return;
                    Exception exception;
                    exception;
                    e1.a();
                    throw exception;
                }

            
            {
                b = a1;
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

        public final void a(AmsEntityUpdateParcelable amsentityupdateparcelable)
        {
            zzj zzj1;
            if (Log.isLoggable("WearableLS", 3))
            {
                (new StringBuilder("onEntityUpdate: ")).append(amsentityupdateparcelable);
            }
            if (!a)
            {
                return;
            }
            WearableListenerService.zzb(b);
            zzj1 = (zzj)b;
            synchronized (WearableListenerService.zzc(b))
            {
                if (!WearableListenerService.zzd(b))
                {
                    break MISSING_BLOCK_LABEL_74;
                }
            }
            return;
            amsentityupdateparcelable;
            obj;
            JVM INSTR monitorexit ;
            throw amsentityupdateparcelable;
            WearableListenerService.zze(b).post(new Runnable(this, zzj1, amsentityupdateparcelable) {

                final zzj a;
                final AmsEntityUpdateParcelable b;
                final a c;

                public final void run()
                {
                }

            
            {
                c = a1;
                a = zzj;
                b = amsentityupdateparcelable;
                super();
            }
            });
            obj;
            JVM INSTR monitorexit ;
        }

        public final void a(AncsNotificationParcelable ancsnotificationparcelable)
        {
            zzj zzj1;
            if (Log.isLoggable("WearableLS", 3))
            {
                (new StringBuilder("onNotificationReceived: ")).append(ancsnotificationparcelable);
            }
            if (!a)
            {
                return;
            }
            WearableListenerService.zzb(b);
            zzj1 = (zzj)b;
            synchronized (WearableListenerService.zzc(b))
            {
                if (!WearableListenerService.zzd(b))
                {
                    break MISSING_BLOCK_LABEL_74;
                }
            }
            return;
            ancsnotificationparcelable;
            obj;
            JVM INSTR monitorexit ;
            throw ancsnotificationparcelable;
            WearableListenerService.zze(b).post(new Runnable(this, zzj1, ancsnotificationparcelable) {

                final zzj a;
                final AncsNotificationParcelable b;
                final a c;

                public final void run()
                {
                }

            
            {
                c = a1;
                a = zzj;
                b = ancsnotificationparcelable;
                super();
            }
            });
            obj;
            JVM INSTR monitorexit ;
        }

        public final void a(CapabilityInfoParcelable capabilityinfoparcelable)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    (new StringBuilder("onConnectedCapabilityChanged: ")).append(capabilityinfoparcelable);
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
            WearableListenerService.zze(b).post(new Runnable(this, capabilityinfoparcelable) {

                final CapabilityInfoParcelable a;
                final a b;

                public final void run()
                {
                    b.b.onCapabilityChanged(a);
                }

            
            {
                b = a1;
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

        public final void a(ChannelEventParcelable channeleventparcelable)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    (new StringBuilder("onChannelEvent: ")).append(channeleventparcelable);
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
            WearableListenerService.zze(b).post(new Runnable(this, channeleventparcelable) {

                final ChannelEventParcelable a;
                final a b;

                public final void run()
                {
                    a.a(b.b);
                }

            
            {
                b = a1;
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

        public final void a(MessageEventParcelable messageeventparcelable)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    (new StringBuilder("onMessageReceived: ")).append(messageeventparcelable);
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
            WearableListenerService.zze(b).post(new Runnable(this, messageeventparcelable) {

                final MessageEventParcelable a;
                final a b;

                public final void run()
                {
                    b.b.onMessageReceived(a);
                }

            
            {
                b = a1;
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

        public final void a(NodeParcelable nodeparcelable)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    (new StringBuilder("onPeerConnected: ")).append(WearableListenerService.zza(b)).append(": ").append(nodeparcelable);
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
            WearableListenerService.zze(b).post(new Runnable(this, nodeparcelable) {

                final NodeParcelable a;
                final a b;

                public final void run()
                {
                    b.b.onPeerConnected(a);
                }

            
            {
                b = a1;
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

        public final void a(List list)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    (new StringBuilder("onConnectedNodes: ")).append(WearableListenerService.zza(b)).append(": ").append(list);
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
            WearableListenerService.zze(b).post(new Runnable(this, list) {

                final List a;
                final a b;

                public final void run()
                {
                    b.b.onConnectedNodes(a);
                }

            
            {
                b = a1;
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

        public final void b(NodeParcelable nodeparcelable)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    (new StringBuilder("onPeerDisconnected: ")).append(WearableListenerService.zza(b)).append(": ").append(nodeparcelable);
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
            WearableListenerService.zze(b).post(new Runnable(this, nodeparcelable) {

                final NodeParcelable a;
                final a b;

                public final void run()
                {
                    b.b.onPeerDisconnected(a);
                }

            
            {
                b = a1;
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

        a()
        {
            b = WearableListenerService.this;
            super();
            a = false;
            a = WearableListenerService.this instanceof zzj;
        }
    }


    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private boolean zzLA;
    private String zzOZ;
    private Handler zzaZc;
    private Object zzaZd;
    private volatile int zzacB;
    private IBinder zzacE;

    public WearableListenerService()
    {
        zzacB = -1;
        zzaZd = new Object();
    }

    private void zzCs()
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if (i == zzacB)
        {
            return;
        }
        if (e.a(this, i))
        {
            zzacB = i;
            return;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    static String zza(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzOZ;
    }

    static void zzb(WearableListenerService wearablelistenerservice)
        throws SecurityException
    {
        wearablelistenerservice.zzCs();
    }

    static Object zzc(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzaZd;
    }

    static boolean zzd(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzLA;
    }

    static Handler zze(WearableListenerService wearablelistenerservice)
    {
        return wearablelistenerservice.zzaZc;
    }

    public final IBinder onBind(Intent intent)
    {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()))
        {
            return zzacE;
        } else
        {
            return null;
        }
    }

    public void onCapabilityChanged(b b)
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
            (new StringBuilder("onCreate: ")).append(getPackageName());
        }
        zzOZ = getPackageName();
        HandlerThread handlerthread = new HandlerThread("WearableListenerService");
        handlerthread.start();
        zzaZc = new Handler(handlerthread.getLooper());
        zzacE = new a();
    }

    public void onDataChanged(com.google.android.gms.wearable.e e1)
    {
    }

    public void onDestroy()
    {
        Object obj = zzaZd;
        obj;
        JVM INSTR monitorenter ;
        zzLA = true;
        if (zzaZc == null)
        {
            throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
        }
        break MISSING_BLOCK_LABEL_34;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzaZc.getLooper().quit();
        obj;
        JVM INSTR monitorexit ;
        super.onDestroy();
        return;
    }

    public void onInputClosed(Channel channel, int i, int j)
    {
    }

    public void onMessageReceived(k k)
    {
    }

    public void onOutputClosed(Channel channel, int i, int j)
    {
    }

    public void onPeerConnected(l l)
    {
    }

    public void onPeerDisconnected(l l)
    {
    }
}
