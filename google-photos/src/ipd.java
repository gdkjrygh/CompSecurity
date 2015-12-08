// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.view.View;
import java.util.Map;

final class ipd
    implements android.animation.Animator.AnimatorListener
{

    final int a;
    final ipb b;
    private View c;
    private ipr d;

    ipd(ipb ipb1, View view, ipr ipr1, int i)
    {
        b = ipb1;
        c = view;
        d = ipr1;
        a = i;
        super();
    }

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        Object obj = null;
        c.setLayerType(0, null);
        b.f.post(new ipe(this, animator));
        b.b(c, ((ObjectAnimator)animator).getPropertyName());
        ipr ipr1 = d;
        View view = c;
        animator = obj;
        if (view instanceof ipq)
        {
            animator = (ipq)view;
        }
        if (animator != null && ipr1.a.containsKey(animator))
        {
            int i = ((Integer)ipr1.a.get(animator)).intValue() - 1;
            ipr1.a.put(animator, Integer.valueOf(i));
            if (i == 0)
            {
                animator.aw_();
                ipr1.a.remove(animator);
            }
        }
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }
}
