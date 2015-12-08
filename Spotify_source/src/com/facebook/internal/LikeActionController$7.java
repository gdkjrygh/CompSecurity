// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.Activity;
import android.os.Bundle;
import aou;
import aov;
import aqv;
import aqx;
import arp;
import com.facebook.AppEventsLogger;
import com.facebook.Request;

// Referenced classes of package com.facebook.internal:
//            LikeActionController

final class b
    implements aqx
{

    final Activity a;
    final Bundle b;
    final LikeActionController c;

    public final void a()
    {
        if (arp.a(LikeActionController.d(c)))
        {
            Bundle bundle = new Bundle();
            bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
            LikeActionController.a(LikeActionController.c(c), c, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
            return;
        } else
        {
            aou aou1 = new aou();
            aqv aqv1 = new aqv(c, LikeActionController.d(c));
            aqv1.a(aou1);
            aou1.a(new aov(aqv1) {

                private aqv a;
                private LikeActionController._cls7 b;

                public final void a()
                {
                    LikeActionController.e(b.c);
                    if (a.b != null)
                    {
                        LikeActionController.a(b.c, false, LikeActionController.f(b.c), LikeActionController.g(b.c), LikeActionController.h(b.c), LikeActionController.i(b.c), LikeActionController.j(b.c));
                        LikeActionController.a(b.c, b.a, b.b);
                        return;
                    } else
                    {
                        LikeActionController.a(b.c, arp.a(a.c, null));
                        LikeActionController.a(b.c, true);
                        LikeActionController.b(b.c).b("fb_like_control_did_like", b.b);
                        LikeActionController.b(b.c, b.a, b.b);
                        return;
                    }
                }

            
            {
                b = LikeActionController._cls7.this;
                a = aqv1;
                super();
            }
            });
            Request.b(aou1);
            return;
        }
    }

    _cls1.a(LikeActionController likeactioncontroller, Activity activity, Bundle bundle)
    {
        c = likeactioncontroller;
        a = activity;
        b = bundle;
        super();
    }
}
