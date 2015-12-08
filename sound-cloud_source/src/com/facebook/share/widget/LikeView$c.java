// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import com.facebook.p;
import com.facebook.share.internal.c;

// Referenced classes of package com.facebook.share.widget:
//            LikeView

private final class <init>
    implements com.facebook.share.internal.nit>
{

    boolean a;
    final LikeView b;

    public final void a(c c1, p p1)
    {
        if (a)
        {
            return;
        }
        p p2 = p1;
        if (c1 != null)
        {
            if (!c1.c())
            {
                p1 = new p("Cannot use LikeView. The device may not be supported.");
            }
            LikeView.a(b, c1);
            com.facebook.share.widget.LikeView.c(b);
            p2 = p1;
        }
        if (p2 != null && LikeView.d(b) != null)
        {
            LikeView.d(b);
        }
        LikeView.f(b);
    }

    private (LikeView likeview)
    {
        b = likeview;
        super();
    }

    b(LikeView likeview, byte byte0)
    {
        this(likeview);
    }
}
