// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.x;
import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.design.widget:
//            g, a, m

class h extends g
{

    private boolean g;

    h(View view, m m)
    {
        super(view, m);
    }

    static boolean a(h h1, boolean flag)
    {
        h1.g = flag;
        return flag;
    }

    final void b()
    {
        if (g || e.getVisibility() != 0)
        {
            return;
        }
        if (!x.E(e) || e.isInEditMode())
        {
            e.setVisibility(8);
            return;
        } else
        {
            e.animate().scaleX(0.0F).scaleY(0.0F).alpha(0.0F).setDuration(200L).setInterpolator(a.b).setListener(new AnimatorListenerAdapter() {

                final h a;

                public final void onAnimationCancel(Animator animator)
                {
                    h.a(a, false);
                }

                public final void onAnimationEnd(Animator animator)
                {
                    h.a(a, false);
                    a.e.setVisibility(8);
                }

                public final void onAnimationStart(Animator animator)
                {
                    h.a(a, true);
                    a.e.setVisibility(0);
                }

            
            {
                a = h.this;
                super();
            }
            });
            return;
        }
    }

    final void c()
    {
label0:
        {
            if (e.getVisibility() != 0)
            {
                if (!x.E(e) || e.isInEditMode())
                {
                    break label0;
                }
                e.setAlpha(0.0F);
                e.setScaleY(0.0F);
                e.setScaleX(0.0F);
                e.animate().scaleX(1.0F).scaleY(1.0F).alpha(1.0F).setDuration(200L).setInterpolator(a.b).setListener(new AnimatorListenerAdapter() {

                    final h a;

                    public final void onAnimationStart(Animator animator)
                    {
                        a.e.setVisibility(0);
                    }

            
            {
                a = h.this;
                super();
            }
                });
            }
            return;
        }
        e.setVisibility(0);
        e.setAlpha(1.0F);
        e.setScaleY(1.0F);
        e.setScaleX(1.0F);
    }
}
