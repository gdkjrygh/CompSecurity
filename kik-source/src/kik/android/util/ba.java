// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.view.animation.Animation;

final class ba
    implements android.view.animation.Animation.AnimationListener
{

    final android.view.animation.Animation.AnimationListener a;

    ba(android.view.animation.Animation.AnimationListener animationlistener)
    {
        a = animationlistener;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        a.onAnimationEnd(animation);
    }

    public final void onAnimationRepeat(Animation animation)
    {
        a.onAnimationRepeat(animation);
    }

    public final void onAnimationStart(Animation animation)
    {
        a.onAnimationStart(animation);
    }
}
