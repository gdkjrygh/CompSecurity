// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzb, zzl

class zzJt
    implements Runnable
{

    final zzb zzJs;
    final boolean zzJt;

    public void run()
    {
        zzb.zza(zzJs).zzG(zzJt);
    }

    (zzb zzb1, boolean flag)
    {
        zzJs = zzb1;
        zzJt = flag;
        super();
    }
}
