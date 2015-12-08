// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            vp, xm, qy, qr

final class qt
    implements vp
{

    final String a;
    final qy b;
    final qr c;

    qt(qr qr, String s, qy qy1)
    {
        c = qr;
        a = s;
        b = qy1;
        super();
    }

    public final void a(xm xm1)
    {
        zzb.zzaH((new StringBuilder("Failed to load URL: ")).append(a).append("\n").append(xm1.toString()).toString());
        b.a(null);
    }
}
