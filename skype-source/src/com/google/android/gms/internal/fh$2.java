// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.n;

// Referenced classes of package com.google.android.gms.internal:
//            fh, ij, gx

final class b
    implements Runnable
{

    final gx a;
    final String b;
    final fh c;

    public final void run()
    {
        a.b(fh.a(c).x().get(b));
    }

    (fh fh1, gx gx1, String s)
    {
        c = fh1;
        a = gx1;
        b = s;
        super();
    }
}
