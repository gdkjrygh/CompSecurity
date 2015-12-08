// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            zzh, WearableListenerService, DataEventBuffer

class a extends com.google.android.gms.wearable.internal.
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
            final WearableListenerService.zza b;

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
                b = WearableListenerService.zza.this;
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
            final WearableListenerService.zza c;

            public void run()
            {
                a.a(b);
            }

            
            {
                c = WearableListenerService.zza.this;
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
            final WearableListenerService.zza b;

            public void run()
            {
                b.b.onCapabilityChanged(a);
            }

            
            {
                b = WearableListenerService.zza.this;
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
            final WearableListenerService.zza b;

            public void run()
            {
                a.a(b.b);
            }

            
            {
                b = WearableListenerService.zza.this;
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
            final WearableListenerService.zza b;

            public void run()
            {
                b.b.onMessageReceived(a);
            }

            
            {
                b = WearableListenerService.zza.this;
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
            final WearableListenerService.zza b;

            public void run()
            {
                b.b.onPeerConnected(a);
            }

            
            {
                b = WearableListenerService.zza.this;
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
            final WearableListenerService.zza b;

            public void run()
            {
                b.b.onConnectedNodes(a);
            }

            
            {
                b = WearableListenerService.zza.this;
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
            final WearableListenerService.zza b;

            public void run()
            {
                b.b.onPeerDisconnected(a);
            }

            
            {
                b = WearableListenerService.zza.this;
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

    _cls8.a(WearableListenerService wearablelistenerservice)
    {
        b = wearablelistenerservice;
        super();
        a = false;
        a = wearablelistenerservice instanceof zzh;
    }
}
