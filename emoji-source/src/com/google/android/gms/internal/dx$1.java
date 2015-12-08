// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            dx, al, ds, ex, 
//            dz, ey, bb, eu

static final class qy
    implements Runnable
{

    final Context qu;
    final ds qv;
    final dz qw;
    final qy qx;
    final String qy;

    public void run()
    {
        ex ex1 = ex.a(qu, new al(), false, false, null, qv.kQ);
        ex1.setWillNotDraw(true);
        qw.b(ex1);
        ey ey1 = ex1.cb();
        ey1.a("/invalidRequest", qw.qD);
        ey1.a("/loadAdURL", qw.qE);
        ey1.a("/log", bb.mZ);
        ey1.a(qx);
        eu.z("Loading the JS library.");
        ex1.loadUrl(qy);
    }

    (Context context, ds ds1, dz dz1,  , String s)
    {
        qu = context;
        qv = ds1;
        qw = dz1;
        qx = ;
        qy = s;
        super();
    }
}
