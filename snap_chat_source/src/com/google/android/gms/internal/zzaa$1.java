// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            zzaa, zzt

class zzmL
    implements Runnable
{

    final WeakReference zzmL;
    final zzaa zzmM;

    public void run()
    {
        zzaa.zza(zzmM, false);
        zzt zzt1 = (zzt)zzmL.get();
        if (zzt1 != null)
        {
            zzt1.zzb(zzaa.zza(zzmM));
        }
    }

    (zzaa zzaa1, WeakReference weakreference)
    {
        zzmM = zzaa1;
        zzmL = weakreference;
        super();
    }
}
