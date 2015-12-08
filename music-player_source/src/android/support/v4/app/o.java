// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//            Fragment, m

final class o
    implements android.view.animation.Animation.AnimationListener
{

    final Fragment a;
    final m b;

    o(m m1, Fragment fragment)
    {
        b = m1;
        a = fragment;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (a.b != null)
        {
            a.b = null;
            b.a(a, a.c, 0, 0, false);
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
