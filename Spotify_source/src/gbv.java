// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Animation;
import java.util.LinkedList;

public final class gbv
{

    LinkedList a;

    public gbv()
    {
        a = new LinkedList();
    }

    final void a()
    {
        gbt gbt1 = (gbt)a.element();
        gbt1.a.setVisibility(0);
        gbt1.a.startAnimation(gbt1.b);
        gbt1.b.setAnimationListener(new android.view.animation.Animation.AnimationListener(gbt1) {

            private gbt a;
            private gbv b;

            public final void onAnimationEnd(Animation animation)
            {
                if (a.c)
                {
                    a.a.setVisibility(8);
                }
                b.a.remove();
                if (b.a.size() > 0)
                {
                    b.a();
                }
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
            }

            
            {
                b = gbv.this;
                a = gbt1;
                super();
            }
        });
    }

    public final void a(View view, Animation animation, boolean flag)
    {
        a.add(new gbt(view, animation, flag));
        if (a.size() == 1)
        {
            a();
        }
    }
}
