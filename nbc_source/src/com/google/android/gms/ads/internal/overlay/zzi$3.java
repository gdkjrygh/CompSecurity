// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;


// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzi, zzg

class zzAn
    implements Runnable
{

    final zzi zzAl;
    final String zzAm;
    final String zzAn;

    public void run()
    {
        if (zzi.zza(zzAl) != null)
        {
            zzi.zza(zzAl).zzg(zzAm, zzAn);
        }
    }

    (zzi zzi1, String s, String s1)
    {
        zzAl = zzi1;
        zzAm = s;
        zzAn = s1;
        super();
    }
}
