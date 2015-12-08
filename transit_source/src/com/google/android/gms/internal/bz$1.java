// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            bz, x, bu, cq, 
//            cb, cr, ah, cn

static final class gR
    implements Runnable
{

    final Context gO;
    final bu gP;
    final cb gQ;
    final String gR;

    public void run()
    {
        cq cq1 = cq.a(gO, new x(), false, false, null, gP.eg);
        cq1.setWillNotDraw(true);
        gQ.b(cq1);
        cr cr1 = cq1.aw();
        cr1.a("/invalidRequest", gQ.gU);
        cr1.a("/loadAdURL", gQ.gV);
        cr1.a("/log", ah.eE);
        cn.m("Getting the ad request URL.");
        cq1.loadDataWithBaseURL("http://googleads.g.doubleclick.net", (new StringBuilder()).append("<!DOCTYPE html><html><head><script src=\"http://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.js\"></script><script>AFMA_buildAdURL(").append(gR).append(");</script></head><body></body></html>").toString(), "text/html", "UTF-8", null);
    }

    (Context context, bu bu1, cb cb1, String s)
    {
        gO = context;
        gP = bu1;
        gQ = cb1;
        gR = s;
        super();
    }
}
