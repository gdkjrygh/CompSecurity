// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Intent;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.internal.zzfa;
import com.google.android.gms.internal.zzgd;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zza, zzh

class a
    implements Runnable
{

    final Intent a;
    final zza b;

    public void run()
    {
        int i = zzh.zzaZ().zzd(a);
        zzh.zzaZ();
        if (i == 0 && zza.zza(b).k != null && zza.zza(b).k.zzwz != null && zza.zza(b).k.zzwz.zzfr() != null)
        {
            zza.zza(b).k.zzwz.zzfr().close();
        }
        zza.zza(b).y = false;
    }

    y.zzc(zza zza1, Intent intent)
    {
        b = zza1;
        a = intent;
        super();
    }
}
