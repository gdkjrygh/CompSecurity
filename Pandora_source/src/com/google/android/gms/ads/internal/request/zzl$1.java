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

    final com.google.android.gms.internal.za a;
    final zzl b;

    public void run()
    {
        zzl.zza(b).zza(a);
        if (zzl.zzb(b) != null)
        {
            zzl.zzeu().zzb(zzl.zzb(b));
            zzl.zza(b, null);
        }
    }

    a(zzl zzl1, com.google.android.gms.internal.za za)
    {
        b = zzl1;
        a = za;
        super();
    }
}
