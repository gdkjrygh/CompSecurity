// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Animation;

class ad
    implements android.view.animation.Animation.AnimationListener
{

    private android.view.animation.Animation.AnimationListener a;
    private boolean b;
    private View c;

    public ad(View view, Animation animation)
    {
        a = null;
        b = false;
        c = null;
        if (view == null || animation == null)
        {
            return;
        } else
        {
            c = view;
            return;
        }
    }

    public ad(View view, Animation animation, android.view.animation.Animation.AnimationListener animationlistener)
    {
        a = null;
        b = false;
        c = null;
        if (view == null || animation == null)
        {
            return;
        } else
        {
            a = animationlistener;
            c = view;
            return;
        }
    }

    static View a(ad ad1)
    {
        return ad1.c;
    }

    public void onAnimationEnd(Animation animation)
    {
        if (c != null && b)
        {
            c.post(new Runnable() {

                private ad a;

                public final void run()
                {
                    km.a(ad.a(a), 0, null);
                }

            
            {
                a = ad.this;
                super();
            }
            });
        }
        if (a != null)
        {
            a.onAnimationEnd(animation);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
        if (a != null)
        {
            a.onAnimationRepeat(animation);
        }
    }

    public void onAnimationStart(Animation animation)
    {
        if (c != null)
        {
            b = ac.a(c, animation);
            if (b)
            {
                c.post(new Runnable() {

                    private ad a;

                    public final void run()
                    {
                        km.a(ad.a(a), 2, null);
                    }

            
            {
                a = ad.this;
                super();
            }
                });
            }
        }
        if (a != null)
        {
            a.onAnimationStart(animation);
        }
    }
}
