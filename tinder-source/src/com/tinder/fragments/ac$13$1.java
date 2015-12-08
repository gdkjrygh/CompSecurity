// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.facebook.a.d;
import com.facebook.a.e;
import com.tinder.e.au;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.fragments:
//            ac

final class a extends au
{

    final ty a;

    public final void onAnimationEnd(Animator animator)
    {
        ac.j(a.a).setVisibility(4);
    }

    ator(ator ator)
    {
        a = ator;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/ac$13

/* anonymous class */
    public final class ac._cls13 extends d
    {

        final ac a;

        public final void onSpringActivate(e e1)
        {
            ac.j(a).setAlpha(1.0F);
            ac.j(a).setVisibility(0);
            ac.k(a).setVisibility(0);
            ac.k(a).setRotation(20F);
        }

        public final void onSpringAtRest(e e1)
        {
            ac.j(a).animate().alpha(0.0F).setDuration(200L).setStartDelay(300L).setListener(new ac._cls13._cls1(this)).start();
            ac.l(a);
        }

        public final void onSpringUpdate(e e1)
        {
            float f = (float)e1.d.a;
            ad.c(ac.k(a), f);
            ac.k(a).setRotation(20F - f * 20F);
        }

            public 
            {
                a = ac1;
                super();
            }
    }

}
