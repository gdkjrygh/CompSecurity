// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.internal.zzcf;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzl

class a
    implements Runnable
{

    final zzl a;

    public void run()
    {
        if (zzl.zzb(a) != null)
        {
            zzl.zzeu().zzb(zzl.zzb(a));
            zzl.zza(a, null);
        }
    }

    (zzl zzl1)
    {
        a = zzl1;
        super();
    }
}
