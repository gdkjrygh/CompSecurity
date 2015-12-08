// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import aov;
import aqq;
import aqs;
import aqx;
import arb;
import arp;
import com.facebook.LoggingBehavior;

// Referenced classes of package com.facebook.internal:
//            LikeActionController

final class c
    implements aov
{

    private aqq a;
    private aqs b;
    private aqx c;
    private LikeActionController d;

    public final void a()
    {
        LikeActionController.b(d, a.c);
        if (arp.a(LikeActionController.d(d)))
        {
            LikeActionController.b(d, b.c);
            LikeActionController.b(d, b.d);
        }
        if (arp.a(LikeActionController.d(d)))
        {
            Object obj = LoggingBehavior.f;
            LikeActionController.h();
            LikeActionController.k(d);
            arb.b();
            LikeActionController likeactioncontroller = d;
            if (b.b != null)
            {
                obj = b.b;
            } else
            {
                obj = a.b;
            }
            LikeActionController.a(likeactioncontroller, "get_verified_id", ((com.facebook.FacebookRequestError) (obj)));
        }
        if (c != null)
        {
            c.a();
        }
    }

    (LikeActionController likeactioncontroller, aqq aqq1, aqs aqs1, aqx aqx1)
    {
        d = likeactioncontroller;
        a = aqq1;
        b = aqs1;
        c = aqx1;
        super();
    }
}
