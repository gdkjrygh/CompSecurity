// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import com.appboy.d.a;
import com.appboy.d.e;
import com.appboy.ui.t;

// Referenced classes of package com.appboy.ui.inappmessage:
//            r, AppboyInAppMessageFullView, a

final class g
    implements r
{

    final com.appboy.ui.inappmessage.a a;

    g(com.appboy.ui.inappmessage.a a1)
    {
        a = a1;
        super();
    }

    public final View a(Activity activity, a a1)
    {
        a1 = (e)a1;
        activity = (AppboyInAppMessageFullView)activity.getLayoutInflater().inflate(t.j, null);
        activity.a(a1.e());
        activity.a(a1.b());
        activity.b(a1.h());
        activity.b(a1.t());
        activity.d(a1.u());
        activity.a(a1.o());
        activity.a(a1.e_());
        activity.c(a1.v());
        activity.a();
        return activity;
    }
}
