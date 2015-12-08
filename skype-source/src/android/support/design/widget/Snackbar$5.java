// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.design.widget:
//            Snackbar, n

final class a
    implements android.view.animation.nimationListener
{

    final Snackbar a;

    public final void onAnimationEnd(Animation animation)
    {
        if (Snackbar.e(a) != null)
        {
            Snackbar.e(a);
        }
        n.a().c(Snackbar.b(a));
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    nListener(Snackbar snackbar)
    {
        a = snackbar;
        super();
    }
}
