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
//            ViewPropertyAnimatorPreHC

private class <init>
    implements com.nineoldandroids.animation.>, com.nineoldandroids.animation.>
{

    final ViewPropertyAnimatorPreHC this$0;

    public void onAnimationCancel(Animator animator)
    {
        if (ViewPropertyAnimatorPreHC.access$200(ViewPropertyAnimatorPreHC.this) != null)
        {
            ViewPropertyAnimatorPreHC.access$200(ViewPropertyAnimatorPreHC.this)._mth0(animator);
        }
    }

    public void onAnimationEnd(Animator animator)
    {
        if (ViewPropertyAnimatorPreHC.access$200(ViewPropertyAnimatorPreHC.this) != null)
        {
            ViewPropertyAnimatorPreHC.access$200(ViewPropertyAnimatorPreHC.this)._mth0(animator);
        }
        ViewPropertyAnimatorPreHC.access$300(ViewPropertyAnimatorPreHC.this).remove(animator);
        if (ViewPropertyAnimatorPreHC.access$300(ViewPropertyAnimatorPreHC.this).isEmpty())
        {
            ViewPropertyAnimatorPreHC.access$202(ViewPropertyAnimatorPreHC.this, null);
        }
    }

    public void onAnimationRepeat(Animator animator)
    {
        if (ViewPropertyAnimatorPreHC.access$200(ViewPropertyAnimatorPreHC.this) != null)
        {
            ViewPropertyAnimatorPreHC.access$200(ViewPropertyAnimatorPreHC.this)._mth0(animator);
        }
    }

    public void onAnimationStart(Animator animator)
    {
        if (ViewPropertyAnimatorPreHC.access$200(ViewPropertyAnimatorPreHC.this) != null)
        {
            ViewPropertyAnimatorPreHC.access$200(ViewPropertyAnimatorPreHC.this)._mth0(animator);
        }
    }

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f = valueanimator.getAnimatedFraction();
        valueanimator = (this._cls0)ViewPropertyAnimatorPreHC.access$300(ViewPropertyAnimatorPreHC.this).get(valueanimator);
        if ((((this._cls0) (valueanimator)).tyMask & 0x1ff) != 0)
        {
            View view = (View)ViewPropertyAnimatorPreHC.access$400(ViewPropertyAnimatorPreHC.this).get();
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
                this._cls0 _lcls0 = (luesHolder)valueanimator.get(i);
                float f1 = _lcls0.Value;
                float f2 = _lcls0.aValue;
                ViewPropertyAnimatorPreHC.access$500(ViewPropertyAnimatorPreHC.this, _lcls0.Constant, f1 + f2 * f);
            }

        }
        valueanimator = (View)ViewPropertyAnimatorPreHC.access$400(ViewPropertyAnimatorPreHC.this).get();
        if (valueanimator != null)
        {
            valueanimator.invalidate();
        }
    }

    private ()
    {
        this$0 = ViewPropertyAnimatorPreHC.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
