// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer;

import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.transfer:
//            ConfirmMoneyTransferActivity

final class this._cls0
    implements AsyncCallback
{

    final ConfirmMoneyTransferActivity this$0;

    private void onSuccess(com.google.wallet.proto.api.teFeeResponse tefeeresponse)
    {
        ConfirmMoneyTransferActivity.access$1600(ConfirmMoneyTransferActivity.this, tefeeresponse);
        ConfirmMoneyTransferActivity.access$1702(ConfirmMoneyTransferActivity.this, false);
    }

    public final void onFailure(Exception exception)
    {
        ConfirmMoneyTransferActivity.access$1500(ConfirmMoneyTransferActivity.this, exception);
        ConfirmMoneyTransferActivity.access$1702(ConfirmMoneyTransferActivity.this, false);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.teFeeResponse)obj);
    }

    e()
    {
        this$0 = ConfirmMoneyTransferActivity.this;
        super();
    }
}
