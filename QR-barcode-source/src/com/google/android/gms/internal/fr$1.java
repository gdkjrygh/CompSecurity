// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            fr, ay, fi, gv, 
//            ft, gw, bx, gs

static final class un
    implements Runnable
{

    final Context mV;
    final fi uk;
    final ft ul;
    final un um;
    final String un;

    public void run()
    {
        gv gv1 = gv.a(mV, new ay(), false, false, null, uk.lD);
        gv1.setWillNotDraw(true);
        ul.b(gv1);
        gw gw1 = gv1.du();
        gw1.a("/invalidRequest", ul.us);
        gw1.a("/loadAdURL", ul.ut);
        gw1.a("/log", bx.pG);
        gw1.a(um);
        gs.S("Loading the JS library.");
        gv1.loadUrl(un);
    }

    (Context context, fi fi1, ft ft1,  , String s)
    {
        mV = context;
        uk = fi1;
        ul = ft1;
        um = ;
        un = s;
        super();
    }
}
