// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzas, zzct, zzat, zzar

class zzzC
    implements Runnable
{

    final zzar zzayN;
    final long zzayO;
    final zzas zzayP;
    final String zzzC;

    public void run()
    {
        if (zzas.zza(zzayP) == null)
        {
            zzct zzct1 = zzct.zztR();
            zzct1.zza(zzas.zzb(zzayP), zzayN);
            zzas.zza(zzayP, zzct1.zztS());
        }
        zzas.zza(zzayP).zzf(zzayO, zzzC);
    }

    (zzas zzas1, zzar zzar, long l, String s)
    {
        zzayP = zzas1;
        zzayN = zzar;
        zzayO = l;
        zzzC = s;
        super();
    }
}
