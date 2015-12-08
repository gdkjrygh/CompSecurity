// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;


// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzc, zzh

class zzAt
    implements Runnable
{

    final zzc zzAr;
    final String zzAs;
    final String zzAt;

    public void run()
    {
        if (zzc.zza(zzAr) != null)
        {
            zzc.zza(zzAr).zzh(zzAs, zzAt);
        }
    }

    (zzc zzc1, String s, String s1)
    {
        zzAr = zzc1;
        zzAs = s;
        zzAt = s1;
        super();
    }
}
