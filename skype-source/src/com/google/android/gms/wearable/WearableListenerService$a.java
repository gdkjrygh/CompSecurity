// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService, zzj, e

private final class a extends com.google.android.gms.wearable.internal.
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
        WearableListenerService.zze(b).post(new Runnable(dataholder) {

            final DataHolder a;
            final WearableListenerService.a b;

            public final void run()
            {
                e e1 = new e(a);
                b.b.onDataChanged(e1);
                e1.a();
                return;
                Exception exception;
                exception;
                e1.a();
                throw exception;
            }

            
            {
                b = WearableListenerService.a.this;
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
        WearableListenerService.zze(b).post(new Runnable(zzj1, amsentityupdateparcelable) {

            final zzj a;
            final AmsEntityUpdateParcelable b;
            final WearableListenerService.a c;

            public final void run()
            {
            }

            
            {
                c = WearableListenerService.a.this;
                a = zzj1;
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
        WearableListenerService.zze(b).post(new Runnable(zzj1, ancsnotificationparcelable) {

            final zzj a;
            final AncsNotificationParcelable b;
            final WearableListenerService.a c;

            public final void run()
            {
            }

            
            {
                c = WearableListenerService.a.this;
                a = zzj1;
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
        WearableListenerService.zze(b).post(new Runnable(capabilityinfoparcelable) {

            final CapabilityInfoParcelable a;
            final WearableListenerService.a b;

            public final void run()
            {
                b.b.onCapabilityChanged(a);
            }

            
            {
                b = WearableListenerService.a.this;
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
        WearableListenerService.zze(b).post(new Runnable(channeleventparcelable) {

            final ChannelEventParcelable a;
            final WearableListenerService.a b;

            public final void run()
            {
                a.a(b.b);
            }

            
            {
                b = WearableListenerService.a.this;
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
        WearableListenerService.zze(b).post(new Runnable(messageeventparcelable) {

            final MessageEventParcelable a;
            final WearableListenerService.a b;

            public final void run()
            {
                b.b.onMessageReceived(a);
            }

            
            {
                b = WearableListenerService.a.this;
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
        WearableListenerService.zze(b).post(new Runnable(nodeparcelable) {

            final NodeParcelable a;
            final WearableListenerService.a b;

            public final void run()
            {
                b.b.onPeerConnected(a);
            }

            
            {
                b = WearableListenerService.a.this;
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
        WearableListenerService.zze(b).post(new Runnable(list) {

            final List a;
            final WearableListenerService.a b;

            public final void run()
            {
                b.b.onConnectedNodes(a);
            }

            
            {
                b = WearableListenerService.a.this;
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
        WearableListenerService.zze(b).post(new Runnable(nodeparcelable) {

            final NodeParcelable a;
            final WearableListenerService.a b;

            public final void run()
            {
                b.b.onPeerDisconnected(a);
            }

            
            {
                b = WearableListenerService.a.this;
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

    _cls9.a(WearableListenerService wearablelistenerservice)
    {
        b = wearablelistenerservice;
        super();
        a = false;
        a = wearablelistenerservice instanceof zzj;
    }
}
