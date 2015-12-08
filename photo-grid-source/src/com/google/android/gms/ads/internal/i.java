// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.pj;
import com.google.android.gms.internal.qa;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzp, zzk, zzq

final class i extends pj
{

    final zzk a;
    private final String b;

    public i(zzk zzk1, String s)
    {
        a = zzk1;
        super();
        b = s;
    }

    public final void onStop()
    {
    }

    public final void zzbn()
    {
        zzp.zzbv();
        qa.c(a.f.context, b);
    }
}
