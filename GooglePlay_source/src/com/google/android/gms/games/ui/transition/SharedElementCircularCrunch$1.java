// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.transition;

import android.animation.Animator;
import android.view.View;

// Referenced classes of package com.google.android.gms.games.ui.transition:
//            SharedElementCircularCrunch

final class val.view
    implements android.animation.dElementCircularCrunch._cls1
{

    final SharedElementCircularCrunch this$0;
    final View val$view;

    public final void onAnimationCancel(Animator animator)
    {
        val$view.setOutlineProvider(null);
    }

    public final void onAnimationEnd(Animator animator)
    {
        val$view.setOutlineProvider(null);
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    ()
    {
        this$0 = final_sharedelementcircularcrunch;
        val$view = View.this;
        super();
    }
}
