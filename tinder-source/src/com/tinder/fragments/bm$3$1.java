// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.a.d;
import com.facebook.a.e;
import com.facebook.a.f;
import com.tinder.e.ac;
import com.tinder.model.User;
import com.tinder.utils.a;
import com.tinder.utils.aa;
import com.tinder.utils.ad;
import com.tinder.utils.o;
import com.tinder.views.OverScrollView;
import com.tinder.views.SkippableViewPager;
import com.viewpagerindicator.CirclePageIndicator;

// Referenced classes of package com.tinder.fragments:
//            bm

final class a extends d
{

    final a a;

    public final void onSpringActivate(e e1)
    {
        if (bm.w(a.a) != null)
        {
            bm.w(a.a).a();
        }
        com.tinder.fragments.bm.a(a.a, false);
        if (bm.b(a.a) != null)
        {
            bm.b(a.a).setVisibility(0);
        }
        if (bm.c(a.a) != null)
        {
            bm.c(a.a).setVisibility(0);
        }
        if (bm.x(a.a))
        {
            com.tinder.fragments.bm.d(a.a).setVisibility(0);
        }
    }

    public final void onSpringAtRest(e e1)
    {
        bm.s(a.a).animate().alpha(1.0F).setDuration(90L).setInterpolator(new DecelerateInterpolator()).start();
        com.tinder.fragments.bm.a(a.a, true);
        bm.t(a.a).setVisibility(0);
        bm.u(a.a).setBackgroundColor(-1);
        bm.v(a.a);
    }

    public final void onSpringUpdate(e e1)
    {
        float f;
        f = (float)e1.d.m;
        if (e1.a() && com.tinder.fragments.bm.a)
        {
            bm.n(a.a).animate().translationZ(0.0F).setDuration(90L).start();
            if (com.tinder.fragments.bm.o(a.a))
            {
                bm.p(a.a).animate().translationZ(0.0F).setDuration(90L).start();
            }
        }
        bm.q(a.a).setTranslationY(o.a(f, 0.0F, bm.g().d, 1.0F, 0.0F));
        ad.c(bm.q(a.a), o.a(f, 0.0F, bm.g().h, 1.0F, 1.0F));
        bm.n(a.a).setTranslationY(o.a(f, 0.0F, bm.g().i, 1.0F, 0.0F));
        bm.n(a.a).setAlpha(f);
        if (com.tinder.fragments.bm.o(a.a))
        {
            bm.p(a.a).setTranslationY((1.0F - f) * bm.g().g);
        }
        if (bm.b(a.a) != null)
        {
            bm.b(a.a).setTranslationX((float)(-a.a.c) * (1.0F - f));
            bm.b(a.a).setRotation(180F * f);
        }
        if (!a.a) goto _L2; else goto _L1
_L1:
        com.tinder.fragments.bm.d(a.a).setTranslationY(100F * (1.0F - f));
_L4:
        if (bm.c(a.a) != null)
        {
            bm.c(a.a).setTranslationX((float)a.a.c * (1.0F - f));
            bm.c(a.a).setRotation((1.0F - f) * 180F);
        }
        return;
_L2:
        if (bm.m(a.a).isSuperLike())
        {
            bm.r(a.a).setAlpha(1.0F - f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    t(t t)
    {
        a = t;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/bm$3

/* anonymous class */
    final class bm._cls3
        implements Runnable
    {

        final boolean a;
        final bm b;

        public final void run()
        {
            e e1 = com.tinder.utils.a.a();
            e1.a(0.0D);
            e1.c(12D);
            e1.j = 0.0010000000474974513D;
            e1.a(f.a(40D, 7D));
            e1.a(new bm._cls3._cls1(this));
            e1.b(1.0D);
        }

            
            {
                b = bm1;
                a = flag;
                super();
            }
    }

}
