// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.ai;
import com.google.android.gms.wearable.internal.al;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService, DataEventBuffer

private class <init> extends com.google.android.gms.wearable.internal.
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
        WearableListenerService.e(axq).post(new Runnable(ai) {

            final WearableListenerService.a axs;
            final ai axt;

            public void run()
            {
                axs.axq.onMessageReceived(axt);
            }

            
            {
                axs = WearableListenerService.a.this;
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
        WearableListenerService.e(axq).post(new Runnable(al) {

            final WearableListenerService.a axs;
            final al axu;

            public void run()
            {
                axs.axq.onPeerConnected(axu);
            }

            
            {
                axs = WearableListenerService.a.this;
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
        WearableListenerService.e(axq).post(new Runnable(dataholder) {

            final DataHolder axr;
            final WearableListenerService.a axs;

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
                axs = WearableListenerService.a.this;
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
        WearableListenerService.e(axq).post(new Runnable(al) {

            final WearableListenerService.a axs;
            final al axu;

            public void run()
            {
                axs.axq.onPeerDisconnected(axu);
            }

            
            {
                axs = WearableListenerService.a.this;
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

    private _cls4.axu(WearableListenerService wearablelistenerservice)
    {
        axq = wearablelistenerservice;
        super();
    }

    axq(WearableListenerService wearablelistenerservice, axq axq1)
    {
        this(wearablelistenerservice);
    }
}
