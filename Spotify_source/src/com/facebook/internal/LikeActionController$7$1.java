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

final class a
    implements aov
{

    private aqv a;
    private b b;

    public final void a()
    {
        LikeActionController.e(b.b);
        if (a.b != null)
        {
            LikeActionController.a(b.b, false, LikeActionController.f(b.b), LikeActionController.g(b.b), LikeActionController.h(b.b), LikeActionController.i(b.b), LikeActionController.j(b.b));
            LikeActionController.a(b.b, b.b, b.b);
            return;
        } else
        {
            LikeActionController.a(b.b, arp.a(a.c, null));
            LikeActionController.a(b.b, true);
            LikeActionController.b(b.b).b("fb_like_control_did_like", b.b);
            LikeActionController.b(b.b, b.b, b.b);
            return;
        }
    }

    ( , aqv aqv1)
    {
        b = ;
        a = aqv1;
        super();
    }

    // Unreferenced inner class com/facebook/internal/LikeActionController$7

/* anonymous class */
    final class LikeActionController._cls7
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
                aou1.a(new LikeActionController._cls7._cls1(this, aqv1));
                Request.b(aou1);
                return;
            }
        }

            
            {
                c = likeactioncontroller;
                a = activity;
                b = bundle;
                super();
            }
    }

}
