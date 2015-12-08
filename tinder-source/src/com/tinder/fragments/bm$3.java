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

final class a
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
        e1.a(new d() {

            final bm._cls3 a;

            public final void onSpringActivate(e e2)
            {
                if (bm.w(a.b) != null)
                {
                    bm.w(a.b).a();
                }
                com.tinder.fragments.bm.a(a.b, false);
                if (bm.b(a.b) != null)
                {
                    bm.b(a.b).setVisibility(0);
                }
                if (bm.c(a.b) != null)
                {
                    bm.c(a.b).setVisibility(0);
                }
                if (bm.x(a.b))
                {
                    com.tinder.fragments.bm.d(a.b).setVisibility(0);
                }
            }

            public final void onSpringAtRest(e e2)
            {
                bm.s(a.b).animate().alpha(1.0F).setDuration(90L).setInterpolator(new DecelerateInterpolator()).start();
                com.tinder.fragments.bm.a(a.b, true);
                bm.t(a.b).setVisibility(0);
                bm.u(a.b).setBackgroundColor(-1);
                bm.v(a.b);
            }

            public final void onSpringUpdate(e e2)
            {
                float f1;
                f1 = (float)e2.d.a;
                if (e2.a() && com.tinder.fragments.bm.a)
                {
                    bm.n(a.b).animate().translationZ(0.0F).setDuration(90L).start();
                    if (com.tinder.fragments.bm.o(a.b))
                    {
                        bm.p(a.b).animate().translationZ(0.0F).setDuration(90L).start();
                    }
                }
                bm.q(a.b).setTranslationY(o.a(f1, 0.0F, bm.g().d, 1.0F, 0.0F));
                ad.c(bm.q(a.b), o.a(f1, 0.0F, bm.g().h, 1.0F, 1.0F));
                bm.n(a.b).setTranslationY(o.a(f1, 0.0F, bm.g().i, 1.0F, 0.0F));
                bm.n(a.b).setAlpha(f1);
                if (com.tinder.fragments.bm.o(a.b))
                {
                    bm.p(a.b).setTranslationY((1.0F - f1) * bm.g().g);
                }
                if (bm.b(a.b) != null)
                {
                    bm.b(a.b).setTranslationX((float)(-a.b.c) * (1.0F - f1));
                    bm.b(a.b).setRotation(180F * f1);
                }
                if (!a.a) goto _L2; else goto _L1
_L1:
                com.tinder.fragments.bm.d(a.b).setTranslationY(100F * (1.0F - f1));
_L4:
                if (bm.c(a.b) != null)
                {
                    bm.c(a.b).setTranslationX((float)a.b.c * (1.0F - f1));
                    bm.c(a.b).setRotation((1.0F - f1) * 180F);
                }
                return;
_L2:
                if (bm.m(a.b).isSuperLike())
                {
                    bm.r(a.b).setAlpha(1.0F - f1);
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                a = bm._cls3.this;
                super();
            }
        });
        e1.b(1.0D);
    }

    _cls1.a(bm bm1, boolean flag)
    {
        b = bm1;
        a = flag;
        super();
    }
}
