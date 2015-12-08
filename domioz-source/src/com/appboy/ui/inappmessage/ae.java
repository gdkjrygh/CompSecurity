// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import android.view.animation.Animation;
import com.appboy.ui.d.d;

// Referenced classes of package com.appboy.ui.inappmessage:
//            w, s

final class ae
    implements android.view.animation.Animation.AnimationListener
{

    final w a;

    ae(w w1)
    {
        a = w1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        w.b(a).clearAnimation();
        w.b(a).setVisibility(8);
        w.b(a).setClickable(true);
        d.a(w.b(a));
        animation = w.c(a);
        w.a(a);
        animation.c();
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        w.b(a).setClickable(false);
    }
}
