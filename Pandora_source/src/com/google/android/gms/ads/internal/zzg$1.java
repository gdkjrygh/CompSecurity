// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzg, zza

class a
    implements Runnable
{

    final WeakReference a;
    final zzg b;

    public void run()
    {
        zzg.zza(b, false);
        zza zza1 = (zza)a.get();
        if (zza1 != null)
        {
            zza1.zzb(zzg.zza(b));
        }
    }

    (zzg zzg1, WeakReference weakreference)
    {
        b = zzg1;
        a = weakreference;
        super();
    }
}
