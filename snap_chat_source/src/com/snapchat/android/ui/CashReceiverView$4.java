// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.snapchat.android.ui:
//            CashReceiverView

public final class a
    implements android.animation.stener
{

    private View a;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        animator = (ViewGroup)a.getParent();
        if (animator != null)
        {
            animator.removeView(a);
        }
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    public (View view)
    {
        a = view;
        super();
    }
}
