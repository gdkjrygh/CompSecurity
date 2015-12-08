// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.View;
import android.widget.RelativeLayout;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bm, bx, ea

class bw
    implements android.view.View.OnClickListener
{

    final View a;
    final ea b;
    final bm c;

    bw(bm bm1, View view, ea ea)
    {
        c = bm1;
        a = view;
        b = ea;
        super();
    }

    public void onClick(View view)
    {
        c.m.post(new bx(this));
        bm.c(c, b);
        c.s = 0x7fffffffffffffffL;
        c.o = false;
        bm.a(c, bm.a(c));
        bm.a(c, true);
        bm.d(c, 0);
    }
}
