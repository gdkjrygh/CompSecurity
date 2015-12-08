// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import aou;
import aov;
import aqp;
import aqr;
import aqx;
import arb;
import com.facebook.LoggingBehavior;
import com.facebook.Request;

// Referenced classes of package com.facebook.internal:
//            LikeActionController

final class a
    implements aqx
{

    final LikeActionController a;

    public final void a()
    {
        aqr aqr1 = new aqr(a, LikeActionController.d(a));
        aqp aqp1 = new aqp(a, LikeActionController.d(a));
        aou aou1 = new aou();
        aqr1.a(aou1);
        aqp1.a(aou1);
        aou1.a(new aov(aqr1, aqp1) {

            private aqr a;
            private aqp b;
            private LikeActionController._cls9 c;

            public final void a()
            {
                if (a.b != null || b.b != null)
                {
                    LoggingBehavior loggingbehavior = LoggingBehavior.a;
                    LikeActionController.h();
                    LikeActionController.k(c.a);
                    arb.b();
                    return;
                } else
                {
                    LikeActionController.a(c.a, a.c, b.c, b.d, b.e, b.f, a.d);
                    return;
                }
            }

            
            {
                c = LikeActionController._cls9.this;
                a = aqr1;
                b = aqp1;
                super();
            }
        });
        Request.b(aou1);
    }

    _cls1.b(LikeActionController likeactioncontroller)
    {
        a = likeactioncontroller;
        super();
    }
}
