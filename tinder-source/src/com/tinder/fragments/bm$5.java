// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.Animator;
import android.view.View;
import android.widget.RelativeLayout;
import com.tinder.adapters.u;
import com.tinder.e.ac;
import com.tinder.e.au;
import com.tinder.utils.aa;
import com.tinder.views.OverScrollView;
import com.tinder.views.SkippableViewPager;
import com.viewpagerindicator.CirclePageIndicator;

// Referenced classes of package com.tinder.fragments:
//            bm

final class a extends au
{

    final Runnable a;
    final bm b;

    public final void onAnimationEnd(Animator animator)
    {
        bm.v(b);
        if (a != null)
        {
            a.run();
        }
    }

    public final void onAnimationStart(Animator animator)
    {
        if (bm.w(b) != null)
        {
            bm.w(b).b();
        }
        com.tinder.fragments.bm.u(b).setBackgroundColor(0);
        bm.a(b, false);
        bm.t(b).setVisibility(4);
        if (bm.y(b).getCount() > 1)
        {
            bm.s(b).setVisibility(0);
        }
        if (bm.a && bm.g() != null)
        {
            bm.n(b).setTranslationZ(bm.g().j);
            if (bm.o(b))
            {
                bm.p(b).setTranslationZ(bm.g().l);
            }
        }
    }

    (bm bm1, Runnable runnable)
    {
        b = bm1;
        a = runnable;
        super();
    }
}
