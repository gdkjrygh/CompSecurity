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

    private void onSuccess(com.google.wallet.proto.api.sTransferAvailabilityResponse stransferavailabilityresponse)
    {
        ConfirmMoneyTransferActivity.access$1400(ConfirmMoneyTransferActivity.this, stransferavailabilityresponse);
        isFetchingDelay = false;
    }

    public final void onFailure(Exception exception)
    {
        ConfirmMoneyTransferActivity.access$1500(ConfirmMoneyTransferActivity.this, exception);
        isFetchingDelay = false;
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.sTransferAvailabilityResponse)obj);
    }

    ilabilityResponse()
    {
        this$0 = ConfirmMoneyTransferActivity.this;
        super();
    }
}
