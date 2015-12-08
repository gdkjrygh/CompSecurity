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

    final WearableListenerService alu;

    public void Y(DataHolder dataholder)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder()).append("onDataItemChanged: ").append(WearableListenerService.a(alu)).append(": ").append(dataholder).toString());
            }
            WearableListenerService.b(alu);
            synchronized (WearableListenerService.c(alu))
            {
                if (!WearableListenerService.d(alu))
                {
                    break label0;
                }
                dataholder.close();
            }
            return;
        }
        WearableListenerService.e(alu).post(new Runnable(dataholder) {

            final DataHolder alv;
            final WearableListenerService.a alw;

            public void run()
            {
                DataEventBuffer dataeventbuffer = new DataEventBuffer(alv);
                alw.alu.onDataChanged(dataeventbuffer);
                dataeventbuffer.release();
                return;
                Exception exception;
                exception;
                dataeventbuffer.release();
                throw exception;
            }

            
            {
                alw = WearableListenerService.a.this;
                alv = dataholder;
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
            WearableListenerService.b(alu);
            synchronized (WearableListenerService.c(alu))
            {
                if (!WearableListenerService.d(alu))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.e(alu).post(new Runnable(af) {

            final WearableListenerService.a alw;
            final af alx;

            public void run()
            {
                alw.alu.onMessageReceived(alx);
            }

            
            {
                alw = WearableListenerService.a.this;
                alx = af;
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
                Log.d("WearableLS", (new StringBuilder()).append("onPeerConnected: ").append(WearableListenerService.a(alu)).append(": ").append(ai).toString());
            }
            WearableListenerService.b(alu);
            synchronized (WearableListenerService.c(alu))
            {
                if (!WearableListenerService.d(alu))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.e(alu).post(new Runnable(ai) {

            final WearableListenerService.a alw;
            final ai aly;

            public void run()
            {
                alw.alu.onPeerConnected(aly);
            }

            
            {
                alw = WearableListenerService.a.this;
                aly = ai;
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
                Log.d("WearableLS", (new StringBuilder()).append("onPeerDisconnected: ").append(WearableListenerService.a(alu)).append(": ").append(ai).toString());
            }
            WearableListenerService.b(alu);
            synchronized (WearableListenerService.c(alu))
            {
                if (!WearableListenerService.d(alu))
                {
                    break label0;
                }
            }
            return;
        }
        WearableListenerService.e(alu).post(new Runnable(ai) {

            final WearableListenerService.a alw;
            final ai aly;

            public void run()
            {
                alw.alu.onPeerDisconnected(aly);
            }

            
            {
                alw = WearableListenerService.a.this;
                aly = ai;
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

    private _cls4.aly(WearableListenerService wearablelistenerservice)
    {
        alu = wearablelistenerservice;
        super();
    }

    alu(WearableListenerService wearablelistenerservice, alu alu1)
    {
        this(wearablelistenerservice);
    }
}
