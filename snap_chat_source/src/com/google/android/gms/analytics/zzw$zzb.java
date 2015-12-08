// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.internal.zzlv;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.analytics:
//            zzw, zzae

class <init> extends TimerTask
{

    final zzw zzCv;

    public void run()
    {
        if (zzw.zzb(zzCv) == zzCy && zzw.zze(zzCv).isEmpty() && zzw.zzf(zzCv) + zzw.zzg(zzCv) < zzw.zzh(zzCv).elapsedRealtime())
        {
            zzae.zzab("Disconnecting due to inactivity");
            zzw.zzi(zzCv);
            return;
        } else
        {
            zzw.zzj(zzCv).schedule(new <init>(zzCv), zzw.zzg(zzCv));
            return;
        }
    }

    private (zzw zzw1)
    {
        zzCv = zzw1;
        super();
    }

    zzCv(zzw zzw1, zzCv zzcv)
    {
        this(zzw1);
    }
}
