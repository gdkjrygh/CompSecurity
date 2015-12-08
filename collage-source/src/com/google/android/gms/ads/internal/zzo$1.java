// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzo, zza

class zzpD
    implements Runnable
{

    final WeakReference zzpD;
    final zzo zzpE;

    public void run()
    {
        zzo.zza(zzpE, false);
        zza zza1 = (zza)zzpD.get();
        if (zza1 != null)
        {
            zza1.zzc(zzo.zza(zzpE));
        }
    }

    (zzo zzo1, WeakReference weakreference)
    {
        zzpE = zzo1;
        zzpD = weakreference;
        super();
    }
}
