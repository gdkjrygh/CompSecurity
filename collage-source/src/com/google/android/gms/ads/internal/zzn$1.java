// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.gl;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzn

class zzoA
    implements Runnable
{

    final com.google.android.gms.internal.rmats.a zzoA;
    final zzn zzpt;

    public void run()
    {
        zzpt.zzb(new gl(zzoA, null, null, null, null, null, null));
    }

    (zzn zzn1, com.google.android.gms.internal.n n)
    {
        zzpt = zzn1;
        zzoA = n;
        super();
    }
}
