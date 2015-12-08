// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.view;

import android.view.View;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.ValueAnimator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.nineoldandroids.view:
//            ViewPropertyAnimatorHC

private class <init>
    implements com.nineoldandroids.animation.>, com.nineoldandroids.animation.>
{

    final ViewPropertyAnimatorHC this$0;

    public void onAnimationCancel(Animator animator)
    {
        if (ViewPropertyAnimatorHC.access$200(ViewPropertyAnimatorHC.this) != null)
        {
            ViewPropertyAnimatorHC.access$200(ViewPropertyAnimatorHC.this)._mth0(animator);
        }
    }

    public void onAnimationEnd(Animator animator)
    {
        if (ViewPropertyAnimatorHC.access$200(ViewPropertyAnimatorHC.this) != null)
        {
            ViewPropertyAnimatorHC.access$200(ViewPropertyAnimatorHC.this)._mth0(animator);
        }
        ViewPropertyAnimatorHC.access$300(ViewPropertyAnimatorHC.this).remove(animator);
        if (ViewPropertyAnimatorHC.access$300(ViewPropertyAnimatorHC.this).isEmpty())
        {
            ViewPropertyAnimatorHC.access$202(ViewPropertyAnimatorHC.this, null);
        }
    }

    public void onAnimationRepeat(Animator animator)
    {
        if (ViewPropertyAnimatorHC.access$200(ViewPropertyAnimatorHC.this) != null)
        {
            ViewPropertyAnimatorHC.access$200(ViewPropertyAnimatorHC.this)._mth0(animator);
        }
    }

    public void onAnimationStart(Animator animator)
    {
        if (ViewPropertyAnimatorHC.access$200(ViewPropertyAnimatorHC.this) != null)
        {
            ViewPropertyAnimatorHC.access$200(ViewPropertyAnimatorHC.this)._mth0(animator);
        }
    }

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f = valueanimator.getAnimatedFraction();
        valueanimator = (rt)ViewPropertyAnimatorHC.access$300(ViewPropertyAnimatorHC.this).get(valueanimator);
        if ((((this._cls0) (valueanimator)).tyMask & 0x1ff) != 0)
        {
            View view = (View)ViewPropertyAnimatorHC.access$400(ViewPropertyAnimatorHC.this).get();
            if (view != null)
            {
                view.invalidate();
            }
        }
        valueanimator = ((this._cls0) (valueanimator)).luesHolder;
        if (valueanimator != null)
        {
            int j = valueanimator.size();
            for (int i = 0; i < j; i++)
            {
                rt rt = (luesHolder)valueanimator.get(i);
                float f1 = rt.Value;
                float f2 = rt.aValue;
                ViewPropertyAnimatorHC.access$500(ViewPropertyAnimatorHC.this, rt.Constant, f1 + f2 * f);
            }

        }
        valueanimator = (View)ViewPropertyAnimatorHC.access$400(ViewPropertyAnimatorHC.this).get();
        if (valueanimator != null)
        {
            valueanimator.invalidate();
        }
    }

    private ()
    {
        this$0 = ViewPropertyAnimatorHC.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
