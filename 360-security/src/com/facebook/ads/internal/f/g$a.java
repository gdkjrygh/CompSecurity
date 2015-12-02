// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.f;

import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

// Referenced classes of package com.facebook.ads.internal.f:
//            g

private class b
    implements android.view.animation.ation.AnimationListener
{

    final g a;
    private final View b;
    private boolean c;
    private Animation d;
    private Animation e;

    private void a(Animation animation)
    {
        if (animation == d)
        {
            b.startAnimation(e);
        } else
        if (animation == e)
        {
            b.startAnimation(d);
            return;
        }
    }

    static void a( , Animation animation)
    {
        .a(animation);
    }

    public  a(boolean flag)
    {
        c = flag;
        return this;
    }

    public void a()
    {
        d = new TranslateAnimation(0, 0.0F, 0, 0.0F, 0, 0.0F, 0, 0 - g.a(a));
        d.setDuration(g.b(a));
        d.setStartOffset(g.c(a));
        d.setFillAfter(true);
        d.setAnimationListener(this);
        e = new TranslateAnimation(0, 0.0F, 0, 0.0F, 0, g.a(a), 0, 0.0F);
        e.setDuration(g.b(a));
        e.setStartOffset(g.c(a));
        e.setFillAfter(true);
        e.setAnimationListener(this);
        View view = b;
        Animation animation;
        if (c)
        {
            animation = e;
        } else
        {
            animation = d;
        }
        view.startAnimation(animation);
    }

    public void onAnimationEnd(Animation animation)
    {
        if (!g.d(a))
        {
            a(animation);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        if (g.d(a))
        {
            (new Handler()).postDelayed(new Runnable(animation) {

                final Animation a;
                final g.a b;

                public void run()
                {
                    g.a.a(b, a);
                }

            
            {
                b = g.a.this;
                a = animation;
                super();
            }
            }, g.c(a));
        }
    }

    public _cls1.a(g g1, View view)
    {
        a = g1;
        super();
        c = false;
        b = view;
    }
}
