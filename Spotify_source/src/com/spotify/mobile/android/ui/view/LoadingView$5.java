// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.view.animation.Animation;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            LoadingView

final class a
    implements android.view.animation.ationListener
{

    private LoadingView a;

    public final void onAnimationEnd(Animation animation)
    {
        if (animation == LoadingView.j(a))
        {
            if (LoadingView.a(a) == ate.c)
            {
                LoadingView.a(a, ate.d);
            }
        } else
        if (animation == LoadingView.k(a))
        {
            LoadingView.a(a, ate.f);
            LoadingView.i(a);
            return;
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    ate(LoadingView loadingview)
    {
        a = loadingview;
        super();
    }
}
