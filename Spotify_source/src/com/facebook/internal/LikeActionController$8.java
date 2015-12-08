// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.Activity;
import android.os.Bundle;
import aov;
import aqw;
import com.facebook.AppEventsLogger;

// Referenced classes of package com.facebook.internal:
//            LikeActionController

final class c
    implements aov
{

    private aqw a;
    private Activity b;
    private Bundle c;
    private LikeActionController d;

    public final void a()
    {
        LikeActionController.e(d);
        if (a.b != null)
        {
            LikeActionController.a(d, true, LikeActionController.f(d), LikeActionController.g(d), LikeActionController.h(d), LikeActionController.i(d), LikeActionController.j(d));
            LikeActionController.a(d, b, c);
            return;
        } else
        {
            LikeActionController.a(d, null);
            LikeActionController.a(d, false);
            LikeActionController.b(d).b("fb_like_control_did_unlike", c);
            LikeActionController.b(d, b, c);
            return;
        }
    }

    (LikeActionController likeactioncontroller, aqw aqw1, Activity activity, Bundle bundle)
    {
        d = likeactioncontroller;
        a = aqw1;
        b = activity;
        c = bundle;
        super();
    }
}
