// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package kik.android.util:
//            av

final class ax
    implements android.view.animation.Animation.AnimationListener
{

    final View a;
    final int b;
    final android.view.animation.Animation.AnimationListener c;

    ax(View view, int i, android.view.animation.Animation.AnimationListener animationlistener)
    {
        a = view;
        b = i;
        c = animationlistener;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        a.clearAnimation();
        av.a(a, b, com.kik.android.a.c.a.b, 150, c);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
