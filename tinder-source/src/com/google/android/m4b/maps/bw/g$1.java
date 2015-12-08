// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bw;

import android.content.Context;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.cg.bt;

// Referenced classes of package com.google.android.m4b.maps.bw:
//            g

final class d extends Thread
{

    private Context a;
    private m b;
    private Runnable c;
    private bt d;
    private g e;

    public final void run()
    {
        g.a(e, a, b, c, "ZoomTables.data", d);
    }

    (g g1, String s, Context context, m m, Runnable runnable, bt bt)
    {
        e = g1;
        a = context;
        b = m;
        c = runnable;
        d = bt;
        super(s);
    }
}
