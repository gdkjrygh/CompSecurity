// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;

// Referenced classes of package com.snapchat.android.ui:
//            CashSwiperView

final class nit> extends nit>
{

    private a a;

    public final void onAnimationEnd(Animator animator)
    {
        if (!CashSwiperView.o(a.a))
        {
            CashSwiperView.n(a.a);
            CashSwiperView.l(a.a);
            CashSwiperView.m(a.a).start();
        }
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/snapchat/android/ui/CashSwiperView$3

/* anonymous class */
    final class CashSwiperView._cls3
        implements Runnable
    {

        final CashSwiperView a;

        public final void run()
        {
            if (!CashSwiperView.o(a))
            {
                CashSwiperView.p(a);
                CashSwiperView.m(a).start();
                CashSwiperView.m(a).addListener(new CashSwiperView._cls3._cls1(this));
            }
        }

            
            {
                a = cashswiperview;
                super();
            }
    }

}
