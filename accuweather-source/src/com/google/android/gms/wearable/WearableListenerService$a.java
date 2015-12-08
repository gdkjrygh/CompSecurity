// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.af;
import com.google.android.gms.wearable.internal.ai;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService, DataEventBuffer

private class <init> extends com.google.android.gms.wearable.internal.
{

    final WearableListenerService alr;

    public void Y(DataHolder dataholder)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder()).append("onDataItemChanged: ").append(WearableListenerService.a(alr)).append(": ").append(dataholder).toString());
            }
            WearableListenerService.b(alr);
            synchronized (WearableListenerService.c(alr))
            {
                if (!WearableListenerService.d(alr))
                {
                    break label0;
                }
                dataholder.close();
            }
            return;
        }
        WearableListenerService.e(alr).post(new Runnable(dataholder) {

            final DataHolder als;
            final WearableListenerService.a alt;

            public void run()
            {
                DataEventBuffer dataeventbuffer = new DataEventBuffer(als);
                alt.alr.onDataChanged(dataeventbuffer);
                dataeventbuffer.release();
                return;
                Exception exception;
                exception;
                dataeventbuffer.release();
                throw exception;
            }

            
            {
                alt = WearableListenerService.a.this;
                als = dataholder;
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
            WearableListenerService.b(alr);
            synchronized (WearableListenerService.c(alr))
            {
                if (!WearableListenerService.d(alr))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.e(alr).post(new Runnable(af) {

            final WearableListenerService.a alt;
            final af alu;

            public void run()
            {
                alt.alr.onMessageReceived(alu);
            }

            
            {
                alt = WearableListenerService.a.this;
                alu = af;
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
                Log.d("WearableLS", (new StringBuilder()).append("onPeerConnected: ").append(WearableListenerService.a(alr)).append(": ").append(ai).toString());
            }
            WearableListenerService.b(alr);
            synchronized (WearableListenerService.c(alr))
            {
                if (!WearableListenerService.d(alr))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.e(alr).post(new Runnable(ai) {

            final WearableListenerService.a alt;
            final ai alv;

            public void run()
            {
                alt.alr.onPeerConnected(alv);
            }

            
            {
                alt = WearableListenerService.a.this;
                alv = ai;
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
                Log.d("WearableLS", (new StringBuilder()).append("onPeerDisconnected: ").append(WearableListenerService.a(alr)).append(": ").append(ai).toString());
            }
            WearableListenerService.b(alr);
            synchronized (WearableListenerService.c(alr))
            {
                if (!WearableListenerService.d(alr))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.e(alr).post(new Runnable(ai) {

            final WearableListenerService.a alt;
            final ai alv;

            public void run()
            {
                alt.alr.onPeerDisconnected(alv);
            }

            
            {
                alt = WearableListenerService.a.this;
                alv = ai;
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

    private _cls4.alv(WearableListenerService wearablelistenerservice)
    {
        alr = wearablelistenerservice;
        super();
    }

    alr(WearableListenerService wearablelistenerservice, alr alr1)
    {
        this(wearablelistenerservice);
    }
}
