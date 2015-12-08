// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import android.view.animation.Animation;
import com.appboy.b.a.b;
import com.appboy.d.a;
import com.appboy.ui.inappmessage.a.c;

// Referenced classes of package com.appboy.ui.inappmessage:
//            v

final class C
    implements android.view.animation.Animation.AnimationListener
{

    final v a;

    C(v v1)
    {
        a = v1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        com.appboy.ui.inappmessage.v.b(a).setVisibility(0);
        com.appboy.ui.inappmessage.v.b(a).setClickable(true);
        if (com.appboy.ui.inappmessage.v.a(a).o() == b.a)
        {
            v.f(a);
        }
        com.appboy.ui.inappmessage.v.c();
        animation = com.appboy.ui.inappmessage.v.c(a);
        com.appboy.ui.inappmessage.v.b(a);
        com.appboy.ui.inappmessage.v.a(a);
        animation.a();
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        com.appboy.ui.inappmessage.v.b(a).setClickable(false);
    }
}
