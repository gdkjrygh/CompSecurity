// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import com.appboy.b.a.a;
import com.appboy.d.h;
import com.appboy.ui.q;
import com.appboy.ui.s;
import com.appboy.ui.t;

// Referenced classes of package com.appboy.ui.inappmessage:
//            r, AppboyInAppMessageSlideupView, m, v, 
//            a

final class e
    implements r
{

    final com.appboy.ui.inappmessage.a a;

    e(com.appboy.ui.inappmessage.a a1)
    {
        a = a1;
        super();
    }

    public final View a(Activity activity, com.appboy.d.a a1)
    {
        int i;
        a1 = (h)a1;
        activity = (AppboyInAppMessageSlideupView)activity.getLayoutInflater().inflate(t.l, null);
        activity.a(a1.e());
        activity.a(a1.b());
        activity.b(a1.h());
        activity.a(a1.i(), a1.f(), a1.g());
        activity.a(a1.o());
        i = a1.u();
        a1 = a1.m();
        com.appboy.ui.inappmessage.m.a[a1.ordinal()];
        JVM INSTR tableswitch 1 1: default 104
    //                   1 134;
           goto _L1 _L2
_L1:
        com.appboy.ui.inappmessage.v.a(activity.findViewById(s.P), i, activity.getContext().getResources().getColor(q.d));
_L4:
        activity.a();
        return activity;
_L2:
        activity.findViewById(s.P).setVisibility(8);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
