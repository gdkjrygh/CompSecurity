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
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            b, Channel, f, l, 
//            m, y

public abstract class q extends Service
    implements a.a, c.a, d.b, k.a, n.a, n.b
{
    private final class a extends com.google.android.gms.wearable.internal.x.a
    {

        boolean a;
        final q b;

        public final void a(DataHolder dataholder)
        {
label0:
            {
                if (Log.isLoggable("WearableLS", 3))
                {
                    Log.d("WearableLS", (new StringBuilder("onDataItemChanged: ")).append(q.zza(b)).append(": ").append(dataholder).toString());
                }
                q.zzb(b);
                synchronized (q.zzc(b))
                {
                    if (!q.zzd(b))
                    {
                        break label0;
                    }
                    dataholder.b();
                }
                return;
            }
            q.zze(b).post(new Runnable(this, dataholder) {

                final DataHolder a;
                final a b;

                public final void run()
                {
                    f f1 = new f(a);
                    b.b.onDataChanged(f1);
                    f1.b();
                    return;
                    Exception exception;
                    exception;
                    f1.b();
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
            y y1;
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder("onEntityUpdate: ")).append(amsentityupdateparcelable).toString());
            }
            if (!a)
            {
                return;
            }
            q.zzb(b);
            y1 = (y)b;
            synchronized (q.zzc(b))
            {
                if (!q.zzd(b))
                {
                    break MISSING_BLOCK_LABEL_82;
                }
            }
            return;
            amsentityupdateparcelable;
            obj;
            JVM INSTR monitorexit ;
            throw amsentityupdateparcelable;
            q.zze(b).post(new Runnable(this, y1, amsentityupdateparcelable) {

                final y a;
                final AmsEntityUpdateParcelable b;
                final a c;

                public final void run()
                {
                }

            
            {
                c = a1;
                a = y;
                b = amsentityupdateparcelable;
                super();
            }
            });
            obj;
            JVM INSTR monitorexit ;
        }

        public final void a(AncsNotificationParcelable ancsnotificationparcelable)
        {
            y y1;
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder("onNotificationReceived: ")).append(ancsnotificationparcelable).toString());
            }
            if (!a)
            {
                return;
            }
            q.zzb(b);
            y1 = (y)b;
            synchronized (q.zzc(b))
            {
                if (!q.zzd(b))
                {
                    break MISSING_BLOCK_LABEL_82;
                }
            }
            return;
            ancsnotificationparcelable;
            obj;
            JVM INSTR monitorexit ;
            throw ancsnotificationparcelable;
            q.zze(b).post(new Runnable(this, y1, ancsnotificationparcelable) {

                final y a;
                final AncsNotificationParcelable b;
                final a c;

                public final void run()
                {
                }

            
            {
                c = a1;
                a = y;
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
                    Log.d("WearableLS", (new StringBuilder("onConnectedCapabilityChanged: ")).append(capabilityinfoparcelable).toString());
                }
                q.zzb(b);
                synchronized (q.zzc(b))
                {
                    if (!q.zzd(b))
                    {
                        break label0;
                    }
                }
                return;
            }
            q.zze(b).post(new Runnable(this, capabilityinfoparcelable) {

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
                    Log.d("WearableLS", (new StringBuilder("onChannelEvent: ")).append(channeleventparcelable).toString());
                }
                q.zzb(b);
                synchronized (q.zzc(b))
                {
                    if (!q.zzd(b))
                    {
                        break label0;
                    }
                }
                return;
            }
            q.zze(b).post(new Runnable(this, channeleventparcelable) {

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
                    Log.d("WearableLS", (new StringBuilder("onMessageReceived: ")).append(messageeventparcelable).toString());
                }
                q.zzb(b);
                synchronized (q.zzc(b))
                {
                    if (!q.zzd(b))
                    {
                        break label0;
                    }
                }
                return;
            }
            q.zze(b).post(new Runnable(this, messageeventparcelable) {

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
                    Log.d("WearableLS", (new StringBuilder("onPeerConnected: ")).append(q.zza(b)).append(": ").append(nodeparcelable).toString());
                }
                q.zzb(b);
                synchronized (q.zzc(b))
                {
                    if (!q.zzd(b))
                    {
                        break label0;
                    }
                }
                return;
            }
            q.zze(b).post(new Runnable(this, nodeparcelable) {

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
                    Log.d("WearableLS", (new StringBuilder("onConnectedNodes: ")).append(q.zza(b)).append(": ").append(list).toString());
                }
                q.zzb(b);
                synchronized (q.zzc(b))
                {
                    if (!q.zzd(b))
                    {
                        break label0;
                    }
                }
                return;
            }
            q.zze(b).post(new Runnable(this, list) {

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
                    Log.d("WearableLS", (new StringBuilder("onPeerDisconnected: ")).append(q.zza(b)).append(": ").append(nodeparcelable).toString());
                }
                q.zzb(b);
                synchronized (q.zzc(b))
                {
                    if (!q.zzd(b))
                    {
                        break label0;
                    }
                }
                return;
            }
            q.zze(b).post(new Runnable(this, nodeparcelable) {

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
            b = q.this;
            super();
            a = false;
            a = q.this instanceof y;
        }
    }


    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private boolean zzMG;
    private String zzQe;
    private volatile int zzaeG;
    private IBinder zzaeJ;
    private Handler zzbfk;
    private Object zzbfl;

    public q()
    {
        zzaeG = -1;
        zzbfl = new Object();
    }

    private void zzEN()
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if (i == zzaeG)
        {
            return;
        }
        if (GooglePlayServicesUtil.zze(this, i))
        {
            zzaeG = i;
            return;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    static String zza(q q1)
    {
        return q1.zzQe;
    }

    static void zzb(q q1)
        throws SecurityException
    {
        q1.zzEN();
    }

    static Object zzc(q q1)
    {
        return q1.zzbfl;
    }

    static boolean zzd(q q1)
    {
        return q1.zzMG;
    }

    static Handler zze(q q1)
    {
        return q1.zzbfk;
    }

    public final IBinder onBind(Intent intent)
    {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()))
        {
            return zzaeJ;
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
            Log.d("WearableLS", (new StringBuilder("onCreate: ")).append(getPackageName()).toString());
        }
        zzQe = getPackageName();
        HandlerThread handlerthread = new HandlerThread("WearableListenerService");
        handlerthread.start();
        zzbfk = new Handler(handlerthread.getLooper());
        zzaeJ = new a();
    }

    public void onDataChanged(f f)
    {
    }

    public void onDestroy()
    {
        Object obj = zzbfl;
        obj;
        JVM INSTR monitorenter ;
        zzMG = true;
        if (zzbfk == null)
        {
            throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
        }
        break MISSING_BLOCK_LABEL_34;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzbfk.getLooper().quit();
        obj;
        JVM INSTR monitorexit ;
        super.onDestroy();
        return;
    }

    public void onInputClosed(Channel channel, int i, int j)
    {
    }

    public void onMessageReceived(l l)
    {
    }

    public void onOutputClosed(Channel channel, int i, int j)
    {
    }

    public void onPeerConnected(m m)
    {
    }

    public void onPeerDisconnected(m m)
    {
    }
}
