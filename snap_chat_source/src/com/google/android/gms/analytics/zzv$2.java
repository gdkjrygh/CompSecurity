// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.analytics:
//            zzv, zzy

class zzCg
    implements android.os.r.Callback
{

    final zzv zzCg;

    public boolean handleMessage(Message message)
    {
        if (1 == message.what && zzv.zzfK().equals(message.obj))
        {
            long l = SystemClock.elapsedRealtime();
            if (l >= zzv.zzb(zzCg) + (long)(zzv.zzc(zzCg) * 1000))
            {
                zzy.zzfV().zzF(true);
                zzCg.dispatchLocalHits();
                zzy.zzfV().zzF(false);
                zzv.zza(zzCg, l);
            }
            if (zzv.zzc(zzCg) > 0 && !zzv.zzd(zzCg))
            {
                zzv.zze(zzCg).sendMessageDelayed(zzv.zze(zzCg).obtainMessage(1, zzv.zzfK()), Math.min(60, zzv.zzc(zzCg)) * 1000);
            }
        }
        return true;
    }

    (zzv zzv1)
    {
        zzCg = zzv1;
        super();
    }
}
