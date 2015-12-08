// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import android.view.animation.Animation;
import com.appboy.ui.d.f;
import com.appboy.ui.inappmessage.a.c;

// Referenced classes of package com.appboy.ui.inappmessage:
//            v

final class D
    implements android.view.animation.Animation.AnimationListener
{

    final v a;

    D(v v1)
    {
        a = v1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        v.b(a).clearAnimation();
        v.b(a).setVisibility(8);
        v.b(a).setClickable(true);
        f.a(v.b(a));
        com.appboy.ui.inappmessage.v.c(a).b(v.a(a));
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        v.b(a).setClickable(false);
    }
}
