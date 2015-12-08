// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Intent;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzid;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzb, zzo, zzp

class zzos
    implements Runnable
{

    final Intent zzos;
    final zzb zzot;

    public void run()
    {
        int i = zzo.zzbF().zzd(zzos);
        zzo.zzbF();
        if (i == 0 && zzot.zzon.zzpO != null && zzot.zzon.zzpO.zzzE != null && zzot.zzon.zzpO.zzzE.zzgD() != null)
        {
            zzot.zzon.zzpO.zzzE.zzgD().close();
        }
        zzot.zzon.zzqi = false;
    }

    y.zzc(zzb zzb1, Intent intent)
    {
        zzot = zzb1;
        zzos = intent;
        super();
    }
}
