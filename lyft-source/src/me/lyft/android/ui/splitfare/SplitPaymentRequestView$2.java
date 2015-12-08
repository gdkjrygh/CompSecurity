// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.content.res.Resources;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.dialogs.Toast;
import rx.functions.Action0;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            SplitPaymentRequestView

class this._cls0
    implements Action0
{

    final SplitPaymentRequestView this$0;

    public void call()
    {
        dialogFlow.show(new Toast(getResources().getString(0x7f07034c)));
        appFlow.goBack();
    }

    ()
    {
        this$0 = SplitPaymentRequestView.this;
        super();
    }
}
