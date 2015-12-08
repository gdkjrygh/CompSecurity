// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            InviteToSplitAcceptedDialogView

class this._cls0 extends AnimatorListenerAdapter
{

    final InviteToSplitAcceptedDialogView this$0;

    public void onAnimationStart(Animator animator)
    {
        appFlow.resetTo(new me.lyft.android.ui.logView.appFlow());
    }

    ()
    {
        this$0 = InviteToSplitAcceptedDialogView.this;
        super();
    }
}
