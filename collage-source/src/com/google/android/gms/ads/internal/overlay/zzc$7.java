// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;


// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzc, zzh

class zzAr
    implements Runnable
{

    final zzc zzAr;

    public void run()
    {
        if (zzc.zza(zzAr) != null)
        {
            zzc.zza(zzAr).onPaused();
        }
    }

    (zzc zzc1)
    {
        zzAr = zzc1;
        super();
    }
}
