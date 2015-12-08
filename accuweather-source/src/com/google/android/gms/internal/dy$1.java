// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            dy, am, dt, ey, 
//            ea, ez, bc, ev

static final class qv
    implements Runnable
{

    final Context qr;
    final dt qs;
    final ea qt;
    final qv qu;
    final String qv;

    public void run()
    {
        ey ey1 = ey.a(qr, new am(), false, false, null, qs.kO);
        ey1.setWillNotDraw(true);
        qt.b(ey1);
        ez ez1 = ey1.bW();
        ez1.a("/invalidRequest", qt.qA);
        ez1.a("/loadAdURL", qt.qB);
        ez1.a("/log", bc.mX);
        ez1.a(qu);
        ev.z("Loading the JS library.");
        ey1.loadUrl(qv);
    }

    (Context context, dt dt1, ea ea1,  , String s)
    {
        qr = context;
        qs = dt1;
        qt = ea1;
        qu = ;
        qv = s;
        super();
    }
}
