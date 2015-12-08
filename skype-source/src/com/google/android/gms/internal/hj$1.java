// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.c;

// Referenced classes of package com.google.android.gms.internal:
//            hj, hi

final class a
    implements Runnable
{

    final hj a;

    public final void run()
    {
        a.a.t();
        c c1 = a.a.g();
        if (c1 != null)
        {
            c1.n();
        }
        if (hj.d(a) != null)
        {
            hj.d(a).a();
            hj.e(a);
        }
    }

    verlay.c(hj hj1)
    {
        a = hj1;
        super();
    }
}
