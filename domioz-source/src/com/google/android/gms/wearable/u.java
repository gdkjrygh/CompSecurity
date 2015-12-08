// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.i;
import com.google.android.gms.wearable.internal.zzal;
import com.google.android.gms.wearable.internal.zzao;
import com.google.android.gms.wearable.internal.zze;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService, v, w, x, 
//            y

final class u extends i
{

    final WearableListenerService a;

    private u(WearableListenerService wearablelistenerservice)
    {
        a = wearablelistenerservice;
        super();
    }

    u(WearableListenerService wearablelistenerservice, byte byte0)
    {
        this(wearablelistenerservice);
    }

    public final void a(DataHolder dataholder)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder("onDataItemChanged: ")).append(WearableListenerService.zza(a)).append(": ").append(dataholder).toString());
            }
            WearableListenerService.zzb(a);
            synchronized (WearableListenerService.zzc(a))
            {
                if (!WearableListenerService.zzd(a))
                {
                    break label0;
                }
                dataholder.g();
            }
            return;
        }
        com.google.android.gms.wearable.WearableListenerService.zze(a).post(new v(this, dataholder));
        obj;
        JVM INSTR monitorexit ;
        return;
        dataholder;
        obj;
        JVM INSTR monitorexit ;
        throw dataholder;
    }

    public final void a(zzal zzal)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder("onMessageReceived: ")).append(zzal).toString());
            }
            WearableListenerService.zzb(a);
            synchronized (WearableListenerService.zzc(a))
            {
                if (!WearableListenerService.zzd(a))
                {
                    break label0;
                }
            }
            return;
        }
        com.google.android.gms.wearable.WearableListenerService.zze(a).post(new w(this, zzal));
        obj;
        JVM INSTR monitorexit ;
        return;
        zzal;
        obj;
        JVM INSTR monitorexit ;
        throw zzal;
    }

    public final void a(zzao zzao)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder("onPeerConnected: ")).append(WearableListenerService.zza(a)).append(": ").append(zzao).toString());
            }
            WearableListenerService.zzb(a);
            synchronized (WearableListenerService.zzc(a))
            {
                if (!WearableListenerService.zzd(a))
                {
                    break label0;
                }
            }
            return;
        }
        com.google.android.gms.wearable.WearableListenerService.zze(a).post(new x(this, zzao));
        obj;
        JVM INSTR monitorexit ;
        return;
        zzao;
        obj;
        JVM INSTR monitorexit ;
        throw zzao;
    }

    public final void a(zze zze)
    {
        if (Log.isLoggable("WearableLS", 3))
        {
            Log.d("WearableLS", (new StringBuilder("onNotificationReceived: ")).append(zze).toString());
        }
    }

    public final void b(zzao zzao)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                Log.d("WearableLS", (new StringBuilder("onPeerDisconnected: ")).append(WearableListenerService.zza(a)).append(": ").append(zzao).toString());
            }
            WearableListenerService.zzb(a);
            synchronized (WearableListenerService.zzc(a))
            {
                if (!WearableListenerService.zzd(a))
                {
                    break label0;
                }
            }
            return;
        }
        com.google.android.gms.wearable.WearableListenerService.zze(a).post(new y(this, zzao));
        obj;
        JVM INSTR monitorexit ;
        return;
        zzao;
        obj;
        JVM INSTR monitorexit ;
        throw zzao;
    }
}
