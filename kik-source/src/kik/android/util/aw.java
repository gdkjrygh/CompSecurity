// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.view.View;
import android.view.animation.Animation;

final class aw
    implements android.view.animation.Animation.AnimationListener
{

    final android.view.animation.Animation.AnimationListener a;
    final View b;

    aw(android.view.animation.Animation.AnimationListener animationlistener, View view)
    {
        a = animationlistener;
        b = view;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        b.setVisibility(8);
        if (a != null)
        {
            a.onAnimationEnd(animation);
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
        if (a != null)
        {
            a.onAnimationRepeat(animation);
        }
    }

    public final void onAnimationStart(Animation animation)
    {
        if (a != null)
        {
            a.onAnimationStart(animation);
        }
    }
}
