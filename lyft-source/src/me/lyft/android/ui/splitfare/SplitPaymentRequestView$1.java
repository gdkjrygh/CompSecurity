// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import me.lyft.android.common.DialogFlow;
import rx.functions.Action0;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            SplitPaymentRequestView

class this._cls0
    implements Action0
{

    final SplitPaymentRequestView this$0;

    public void call()
    {
        dialogFlow.show(new ialogAnimationDialog());
    }

    ialogAnimationDialog()
    {
        this$0 = SplitPaymentRequestView.this;
        super();
    }
}
