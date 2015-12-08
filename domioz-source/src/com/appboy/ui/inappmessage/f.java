// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import com.appboy.d.a;
import com.appboy.d.g;
import com.appboy.ui.t;

// Referenced classes of package com.appboy.ui.inappmessage:
//            r, AppboyInAppMessageModalView, a

final class f
    implements r
{

    final com.appboy.ui.inappmessage.a a;

    f(com.appboy.ui.inappmessage.a a1)
    {
        a = a1;
        super();
    }

    public final View a(Activity activity, a a1)
    {
        g g1 = (g)a1;
        activity = (AppboyInAppMessageModalView)activity.getLayoutInflater().inflate(t.k, null);
        activity.a(a1.e());
        activity.a(a1.b());
        activity.b(a1.h());
        activity.b(g1.t());
        activity.d(g1.u());
        activity.a(a1.i(), a1.f(), a1.g());
        activity.a(a1.o());
        activity.a(g1.e_());
        activity.c(g1.v());
        activity.a();
        return activity;
    }
}
