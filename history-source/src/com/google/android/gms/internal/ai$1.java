// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            ai, ah, gs, gj

class ni
    implements Runnable
{

    final Context nf;
    final gs ng;
    final gj nh;
    final String ni;
    final ai nj;

    public void run()
    {
        nj.a(nf, ng, nh).f(ni);
    }

    (ai ai1, Context context, gs gs, gj gj, String s)
    {
        nj = ai1;
        nf = context;
        ng = gs;
        nh = gj;
        ni = s;
        super();
    }
}
