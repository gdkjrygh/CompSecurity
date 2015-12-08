// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            fq, ay, fh, gu, 
//            fs, gv, cc, gr

static final class uB
    implements Runnable
{

    final Context nf;
    final uB uA;
    final String uB;
    final fh uy;
    final fs uz;

    public void run()
    {
        gu gu1 = gu.a(nf, new ay(), false, false, null, uy.lO);
        gu1.setWillNotDraw(true);
        uz.b(gu1);
        gv gv1 = gu1.dD();
        gv1.a("/invalidRequest", uz.uG);
        gv1.a("/loadAdURL", uz.uH);
        gv1.a("/log", cc.pX);
        gv1.a(uA);
        gr.S("Loading the JS library.");
        gu1.loadUrl(uB);
    }

    (Context context, fh fh1, fs fs1,  , String s)
    {
        nf = context;
        uy = fh1;
        uz = fs1;
        uA = ;
        uB = s;
        super();
    }
}
