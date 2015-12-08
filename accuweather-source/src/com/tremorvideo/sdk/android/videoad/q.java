// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.View;
import android.widget.RelativeLayout;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            o, r, ea

class q
    implements android.view.View.OnClickListener
{

    final View a;
    final ea b;
    final o c;

    q(o o1, View view, ea ea)
    {
        c = o1;
        a = view;
        b = ea;
        super();
    }

    public void onClick(View view)
    {
        c.o.post(new r(this));
        o.c(c, b);
        c.u = 0x7fffffffffffffffL;
        c.q = false;
        o.a(c, o.a(c));
        o.a(c, true);
        o.d(c, 0);
    }
}
