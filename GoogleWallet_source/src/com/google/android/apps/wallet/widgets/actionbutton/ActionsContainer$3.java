// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.actionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.google.android.apps.wallet.widgets.actionbutton:
//            ActionsContainer, FloatingActionButton

final class this._cls0 extends AnimatorListenerAdapter
{

    final ActionsContainer this$0;

    public final void onAnimationEnd(Animator animator)
    {
        if (ActionsContainer.access$200(ActionsContainer.this) == animator)
        {
            ActionsContainer.access$202(ActionsContainer.this, null);
        }
        setLayerType(0, null);
        if (ActionsContainer.access$100(ActionsContainer.this) != null)
        {
            ActionsContainer.access$100(ActionsContainer.this).setVisibility(4);
        }
    }

    public final void onAnimationStart(Animator animator)
    {
        setVisibility(0);
        setClickable(true);
        setLayerType(2, null);
        if (ActionsContainer.access$100(ActionsContainer.this) != null)
        {
            ActionsContainer.access$100(ActionsContainer.this).setClickable(false);
        }
    }

    n()
    {
        this$0 = ActionsContainer.this;
        super();
    }
}
