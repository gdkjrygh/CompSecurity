// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.design.widget:
//            Snackbar

final class a
    implements android.view.animation.nimationListener
{

    final int a;
    final Snackbar b;

    public final void onAnimationEnd(Animation animation)
    {
        Snackbar.f(b);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    nListener(Snackbar snackbar, int i)
    {
        b = snackbar;
        a = i;
        super();
    }
}
