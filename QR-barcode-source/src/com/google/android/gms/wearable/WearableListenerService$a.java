// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.ah;
import com.google.android.gms.wearable.internal.ak;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService, DataEventBuffer

private class <init> extends com.google.android.gms.wearable.internal.
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
        WearableListenerService.e(avf).post(new Runnable(dataholder) {

            final DataHolder avg;
            final WearableListenerService.a avh;

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
                avh = WearableListenerService.a.this;
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
        WearableListenerService.e(avf).post(new Runnable(ah) {

            final WearableListenerService.a avh;
            final ah avi;

            public void run()
            {
                avh.avf.onMessageReceived(avi);
            }

            
            {
                avh = WearableListenerService.a.this;
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
        WearableListenerService.e(avf).post(new Runnable(ak) {

            final WearableListenerService.a avh;
            final ak avj;

            public void run()
            {
                avh.avf.onPeerConnected(avj);
            }

            
            {
                avh = WearableListenerService.a.this;
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
        WearableListenerService.e(avf).post(new Runnable(ak) {

            final WearableListenerService.a avh;
            final ak avj;

            public void run()
            {
                avh.avf.onPeerDisconnected(avj);
            }

            
            {
                avh = WearableListenerService.a.this;
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

    private _cls4.avj(WearableListenerService wearablelistenerservice)
    {
        avf = wearablelistenerservice;
        super();
    }

    avf(WearableListenerService wearablelistenerservice, avf avf1)
    {
        this(wearablelistenerservice);
    }
}
