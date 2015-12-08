// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            zzt, zzab, zzfj, zzhe, 
//            zzic, zzel

class zzlK
    implements Runnable
{

    final zzt zzlJ;
    final Intent zzlK;

    public void run()
    {
        int i = zzab.zzaU().zzd(zzlK);
        zzab.zzaU();
        if (i == 0 && zzt.zza(zzlJ).zzlW != null && zzt.zza(zzlJ).zzlW.zzuq != null && zzt.zza(zzlJ).zzlW.zzuq.zzeF() != null)
        {
            zzt.zza(zzlJ).zzlW.zzuq.zzeF().close();
        }
        zzt.zza(zzlJ).zzmk = false;
    }

    b(zzt zzt1, Intent intent)
    {
        zzlJ = zzt1;
        zzlK = intent;
        super();
    }
}
