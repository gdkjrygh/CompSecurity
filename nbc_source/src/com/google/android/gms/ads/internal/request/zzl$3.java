// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;


// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzl

class zzDm
    implements Runnable
{

    final zzl zzDm;

    public void run()
    {
        if (zzl.zzb(zzDm) != null)
        {
            zzl.zzb(zzDm).release();
            zzl.zza(zzDm, null);
        }
    }

    (zzl zzl1)
    {
        zzDm = zzl1;
        super();
    }
}
