// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.b;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;

// Referenced classes of package com.nineoldandroids.b:
//            b

class d extends b
{

    private final WeakReference a;

    d(View view)
    {
        a = new WeakReference(view.animate());
    }

    public b a(float f)
    {
        ViewPropertyAnimator viewpropertyanimator = (ViewPropertyAnimator)a.get();
        if (viewpropertyanimator != null)
        {
            viewpropertyanimator.translationX(f);
        }
        return this;
    }

    public b a(long l)
    {
        ViewPropertyAnimator viewpropertyanimator = (ViewPropertyAnimator)a.get();
        if (viewpropertyanimator != null)
        {
            viewpropertyanimator.setDuration(l);
        }
        return this;
    }

    public b a(com.nineoldandroids.a.a.a a1)
    {
        ViewPropertyAnimator viewpropertyanimator;
label0:
        {
            viewpropertyanimator = (ViewPropertyAnimator)a.get();
            if (viewpropertyanimator != null)
            {
                if (a1 != null)
                {
                    break label0;
                }
                viewpropertyanimator.setListener(null);
            }
            return this;
        }
        viewpropertyanimator.setListener(new android.animation.Animator.AnimatorListener(a1) {

            final d a;
            private final com.nineoldandroids.a.a.a b;

            public void onAnimationCancel(Animator animator)
            {
                b.c(null);
            }

            public void onAnimationEnd(Animator animator)
            {
                b.b(null);
            }

            public void onAnimationRepeat(Animator animator)
            {
                b.d(null);
            }

            public void onAnimationStart(Animator animator)
            {
                b.a(null);
            }

            
            {
                a = d.this;
                b = a1;
                super();
            }
        });
        return this;
    }

    public void a()
    {
        ViewPropertyAnimator viewpropertyanimator = (ViewPropertyAnimator)a.get();
        if (viewpropertyanimator != null)
        {
            viewpropertyanimator.start();
        }
    }

    public b b(float f)
    {
        ViewPropertyAnimator viewpropertyanimator = (ViewPropertyAnimator)a.get();
        if (viewpropertyanimator != null)
        {
            viewpropertyanimator.translationY(f);
        }
        return this;
    }

    public b c(float f)
    {
        ViewPropertyAnimator viewpropertyanimator = (ViewPropertyAnimator)a.get();
        if (viewpropertyanimator != null)
        {
            viewpropertyanimator.alpha(f);
        }
        return this;
    }
}
