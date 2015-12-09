// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.ki;
import com.google.android.gms.internal.kk;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService, b

private class <init> extends com.google.android.gms.internal.<init>
{

    final WearableListenerService adx;

    public void M(DataHolder dataholder)
    {
        if (Log.isLoggable("WearableLS", 3))
        {
            Log.d("WearableLS", (new StringBuilder()).append("onDataItemChanged: ").append(WearableListenerService.a(adx)).append(": ").append(dataholder).toString());
        }
        WearableListenerService.b(adx);
        WearableListenerService.c(adx).post(new Runnable(dataholder) {

            final DataHolder ady;
            final WearableListenerService.a adz;

            public void run()
            {
                b b1 = new b(ady);
                adz.adx.onDataChanged(b1);
                b1.close();
                return;
                Exception exception;
                exception;
                b1.close();
                throw exception;
            }

            
            {
                adz = WearableListenerService.a.this;
                ady = dataholder;
                super();
            }
        });
    }

    public void a(ki ki)
    {
        if (Log.isLoggable("WearableLS", 3))
        {
            Log.d("WearableLS", (new StringBuilder()).append("onMessageReceived: ").append(ki).toString());
        }
        WearableListenerService.b(adx);
        WearableListenerService.c(adx).post(new Runnable(ki) {

            final ki adA;
            final WearableListenerService.a adz;

            public void run()
            {
                adz.adx.onMessageReceived(adA);
            }

            
            {
                adz = WearableListenerService.a.this;
                adA = ki;
                super();
            }
        });
    }

    public void a(kk kk)
    {
        if (Log.isLoggable("WearableLS", 3))
        {
            Log.d("WearableLS", (new StringBuilder()).append("onPeerConnected: ").append(WearableListenerService.a(adx)).append(": ").append(kk).toString());
        }
        WearableListenerService.b(adx);
        WearableListenerService.c(adx).post(new Runnable(kk) {

            final kk adB;
            final WearableListenerService.a adz;

            public void run()
            {
                adz.adx.onPeerConnected(adB);
            }

            
            {
                adz = WearableListenerService.a.this;
                adB = kk;
                super();
            }
        });
    }

    public void b(kk kk)
    {
        if (Log.isLoggable("WearableLS", 3))
        {
            Log.d("WearableLS", (new StringBuilder()).append("onPeerDisconnected: ").append(WearableListenerService.a(adx)).append(": ").append(kk).toString());
        }
        WearableListenerService.b(adx);
        WearableListenerService.c(adx).post(new Runnable(kk) {

            final kk adB;
            final WearableListenerService.a adz;

            public void run()
            {
                adz.adx.onPeerDisconnected(adB);
            }

            
            {
                adz = WearableListenerService.a.this;
                adB = kk;
                super();
            }
        });
    }

    private _cls4.adB(WearableListenerService wearablelistenerservice)
    {
        adx = wearablelistenerservice;
        super();
    }

    adx(WearableListenerService wearablelistenerservice, adx adx1)
    {
        this(wearablelistenerservice);
    }
}
