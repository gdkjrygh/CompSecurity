// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.actionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.google.android.apps.wallet.widgets.actionbutton:
//            ActionsContainer

final class val.view extends AnimatorListenerAdapter
{

    final ActionsContainer this$0;
    final View val$view;

    public final void onAnimationEnd(Animator animator)
    {
        val$view.setLayerType(0, null);
    }

    public final void onAnimationStart(Animator animator)
    {
        val$view.setLayerType(2, null);
    }

    ()
    {
        this$0 = final_actionscontainer;
        val$view = View.this;
        super();
    }
}
