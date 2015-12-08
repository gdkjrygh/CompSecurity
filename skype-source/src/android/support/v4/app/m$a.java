// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.view.x;
import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//            m

static class b
    implements android.view.animation.ation.AnimationListener
{

    private boolean a;
    private View b;

    static View a(n.AnimationListener animationlistener)
    {
        return animationlistener.b;
    }

    public void onAnimationEnd(Animation animation)
    {
        if (a)
        {
            b.post(new Runnable() {

                final m.a a;

                public final void run()
                {
                    x.a(m.a.a(a), 0, null);
                }

            
            {
                a = m.a.this;
                super();
            }
            });
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        a = m.a(b, animation);
        if (a)
        {
            b.post(new Runnable() {

                final m.a a;

                public final void run()
                {
                    x.a(m.a.a(a), 2, null);
                }

            
            {
                a = m.a.this;
                super();
            }
            });
        }
    }

    public ation(View view, Animation animation)
    {
        a = false;
        if (view == null || animation == null)
        {
            return;
        } else
        {
            b = view;
            return;
        }
    }
}
