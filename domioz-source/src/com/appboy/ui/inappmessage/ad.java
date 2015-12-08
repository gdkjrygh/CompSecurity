// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import android.view.animation.Animation;
import com.appboy.b.a.b;
import com.appboy.d.a;

// Referenced classes of package com.appboy.ui.inappmessage:
//            w, s

final class ad
    implements android.view.animation.Animation.AnimationListener
{

    final w a;

    ad(w w1)
    {
        a = w1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        com.appboy.ui.inappmessage.w.b(a).setVisibility(0);
        com.appboy.ui.inappmessage.w.b(a).setClickable(true);
        if (com.appboy.ui.inappmessage.w.a(a).p() == b.a)
        {
            w.f(a);
        }
        com.appboy.f.a.a(w.g(), "In-app message animated into view.");
        animation = w.c(a);
        com.appboy.ui.inappmessage.w.b(a);
        com.appboy.ui.inappmessage.w.a(a);
        animation.a();
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        com.appboy.ui.inappmessage.w.b(a).setClickable(false);
    }
}
