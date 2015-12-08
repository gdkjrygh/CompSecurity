// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.pinterest.kit.utils.AnimationUtils;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.activity.task.toast.view:
//            ToastContainer

class init> extends com.pinterest.kit.utils.ationListener
{

    final l.v this$1;

    public void onAnimationStart(Animator animator)
    {
        animator = previousChildren.iterator();
        do
        {
            if (!animator.hasNext())
            {
                break;
            }
            View view = (View)animator.next();
            if (!ToastContainer.access$000(view))
            {
                float f = view.getTranslationY();
                AnimationUtils.springAnimate(view, "translationY", f, f - (float)v.getMeasuredHeight(), 0.75F, 0.25F).start();
            }
        } while (true);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
