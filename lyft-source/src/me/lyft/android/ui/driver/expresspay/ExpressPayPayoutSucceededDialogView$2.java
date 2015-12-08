// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            ExpressPayPayoutSucceededDialogView

class this._cls0 extends AnimatorListenerAdapter
{

    final ExpressPayPayoutSucceededDialogView this$0;

    public void onAnimationStart(Animator animator)
    {
        appFlow.resetTo(new me.lyft.android.ui.driver.());
    }

    ()
    {
        this$0 = ExpressPayPayoutSucceededDialogView.this;
        super();
    }
}
