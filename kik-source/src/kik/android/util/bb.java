// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.view.View;
import android.view.animation.Animation;

final class bb
    implements android.view.animation.Animation.AnimationListener
{

    final View a;
    final Animation b;

    bb(View view, Animation animation)
    {
        a = view;
        b = animation;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (a.getAnimation() != null && a.getAnimation() == b)
        {
            a.clearAnimation();
        }
        a.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        a.setVisibility(0);
    }
}
