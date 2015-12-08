// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.dialogs.Toast;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            ExpressPayPayoutSucceededDialogView

class this._cls0 extends AnimatorListenerAdapter
{

    final ExpressPayPayoutSucceededDialogView this$0;

    public void onAnimationEnd(Animator animator)
    {
        dialogFlow.show(new Toast(getResources().getString(0x7f070173)));
    }

    ()
    {
        this$0 = ExpressPayPayoutSucceededDialogView.this;
        super();
    }
}
