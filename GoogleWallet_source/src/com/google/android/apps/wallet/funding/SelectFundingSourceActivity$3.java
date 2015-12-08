// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding;

import android.view.View;
import com.google.android.apps.wallet.paymentcard.api.PaymentCardApi;

// Referenced classes of package com.google.android.apps.wallet.funding:
//            SelectFundingSourceActivity

final class this._cls0
    implements android.view.ctFundingSourceActivity._cls3
{

    final SelectFundingSourceActivity this$0;

    public final void onClick(View view)
    {
        startActivity(PaymentCardApi.createAddNewCardIntent(SelectFundingSourceActivity.this, "instrument_add_context_P2P"));
    }

    ()
    {
        this$0 = SelectFundingSourceActivity.this;
        super();
    }
}
