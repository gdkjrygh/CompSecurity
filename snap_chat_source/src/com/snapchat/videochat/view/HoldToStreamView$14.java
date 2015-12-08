// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import Vt;
import Vw;

// Referenced classes of package com.snapchat.videochat.view:
//            HoldToStreamView

final class a
    implements Runnable
{

    private boolean a;
    private HoldToStreamView b;

    public final void run()
    {
        b.a.i(a);
        b.a.v();
        b.a.d(a);
        HoldToStreamView.d(b);
        if (a)
        {
            HoldToStreamView.e(b);
            b.a.u();
            b.a.c(true);
        } else
        {
            HoldToStreamView.f(b);
        }
        HoldToStreamView.g(b);
        HoldToStreamView.h(b).a(a);
        b.invalidate();
    }

    (HoldToStreamView holdtostreamview, boolean flag)
    {
        b = holdtostreamview;
        a = flag;
        super();
    }
}
