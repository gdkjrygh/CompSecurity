// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

final class cqq extends crr
{

    final cqp a;
    private boolean b;

    cqq(cqp cqp1)
    {
        a = cqp1;
        super();
        b = false;
        b = cqp1 instanceof ctm;
    }

    public final void a(DataHolder dataholder)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder("onDataItemChanged: ")).append(cqp.a(a)).append(": ").append(dataholder).toString());
            }
            cqp.b(a);
            synchronized (cqp.c(a))
            {
                if (!cqp.d(a))
                {
                    break label0;
                }
                dataholder.b();
            }
            return;
        }
        cqp.e(a).post(new Runnable(dataholder) {

            private DataHolder a;

            public final void run()
            {
                (new cqh(a)).a();
            }

            
            {
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
        if (Log.isLoggable("WearableLS", 3))
        {
            Log.d("WearableLS", (new StringBuilder("onEntityUpdate: ")).append(amsentityupdateparcelable).toString());
        }
        if (!b)
        {
            return;
        }
        cqp.b(a);
        synchronized (cqp.c(a))
        {
            if (!cqp.d(a))
            {
                break MISSING_BLOCK_LABEL_74;
            }
        }
        return;
        exception;
        amsentityupdateparcelable;
        JVM INSTR monitorexit ;
        throw exception;
        cqp.e(a).post(new Runnable() {

            public final void run()
            {
            }

        });
        amsentityupdateparcelable;
        JVM INSTR monitorexit ;
    }

    public final void a(AncsNotificationParcelable ancsnotificationparcelable)
    {
        if (Log.isLoggable("WearableLS", 3))
        {
            Log.d("WearableLS", (new StringBuilder("onNotificationReceived: ")).append(ancsnotificationparcelable).toString());
        }
        if (!b)
        {
            return;
        }
        cqp.b(a);
        synchronized (cqp.c(a))
        {
            if (!cqp.d(a))
            {
                break MISSING_BLOCK_LABEL_74;
            }
        }
        return;
        exception;
        ancsnotificationparcelable;
        JVM INSTR monitorexit ;
        throw exception;
        cqp.e(a).post(new Runnable() {

            public final void run()
            {
            }

        });
        ancsnotificationparcelable;
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
            cqp.b(a);
            synchronized (cqp.c(a))
            {
                if (!cqp.d(a))
                {
                    break label0;
                }
            }
            return;
        }
        cqp.e(a).post(new Runnable() {

            public final void run()
            {
            }

        });
        capabilityinfoparcelable;
        JVM INSTR monitorexit ;
        return;
        exception;
        capabilityinfoparcelable;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(ChannelEventParcelable channeleventparcelable)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder("onChannelEvent: ")).append(channeleventparcelable).toString());
            }
            cqp.b(a);
            synchronized (cqp.c(a))
            {
                if (!cqp.d(a))
                {
                    break label0;
                }
            }
            return;
        }
        cqp.e(a).post(new Runnable(channeleventparcelable) {

            private ChannelEventParcelable a;

            public final void run()
            {
                ChannelEventParcelable channeleventparcelable1 = a;
                switch (channeleventparcelable1.c)
                {
                default:
                    Log.w("ChannelEventParcelable", (new StringBuilder("Unknown type: ")).append(channeleventparcelable1.c).toString());
                    // fall through

                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                    return;
                }
            }

            
            {
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
            cqp.b(a);
            synchronized (cqp.c(a))
            {
                if (!cqp.d(a))
                {
                    break label0;
                }
            }
            return;
        }
        cqp.e(a).post(new Runnable(messageeventparcelable) {

            private MessageEventParcelable a;
            private cqq b;

            public final void run()
            {
                b.a.a(a);
            }

            
            {
                b = cqq.this;
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
                Log.d("WearableLS", (new StringBuilder("onPeerConnected: ")).append(cqp.a(a)).append(": ").append(nodeparcelable).toString());
            }
            cqp.b(a);
            synchronized (cqp.c(a))
            {
                if (!cqp.d(a))
                {
                    break label0;
                }
            }
            return;
        }
        cqp.e(a).post(new Runnable() {

            public final void run()
            {
            }

        });
        nodeparcelable;
        JVM INSTR monitorexit ;
        return;
        exception;
        nodeparcelable;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(List list)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder("onConnectedNodes: ")).append(cqp.a(a)).append(": ").append(list).toString());
            }
            cqp.b(a);
            synchronized (cqp.c(a))
            {
                if (!cqp.d(a))
                {
                    break label0;
                }
            }
            return;
        }
        cqp.e(a).post(new Runnable() {

            public final void run()
            {
            }

        });
        list;
        JVM INSTR monitorexit ;
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(NodeParcelable nodeparcelable)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder("onPeerDisconnected: ")).append(cqp.a(a)).append(": ").append(nodeparcelable).toString());
            }
            cqp.b(a);
            synchronized (cqp.c(a))
            {
                if (!cqp.d(a))
                {
                    break label0;
                }
            }
            return;
        }
        cqp.e(a).post(new Runnable() {

            public final void run()
            {
            }

        });
        nodeparcelable;
        JVM INSTR monitorexit ;
        return;
        exception;
        nodeparcelable;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
