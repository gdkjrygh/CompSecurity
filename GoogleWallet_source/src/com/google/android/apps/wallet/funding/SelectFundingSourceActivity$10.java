// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding;

import com.google.android.apps.wallet.frontinginstrument.TapAndPayModelPublisher;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.android.apps.wallet.storedvalue.api.StoredValueEvent;
import com.google.android.apps.wallet.storedvalue.api.StoredValueModel;
import com.google.common.base.Optional;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.funding:
//            SelectFundingSourceActivity

final class val.paymentCard
    implements Callable
{

    final SelectFundingSourceActivity this$0;
    final PaymentCard val$paymentCard;

    private Void call()
        throws Exception
    {
        tapAndPayModelPublisher.selectCredential(val$paymentCard, ((StoredValueEvent)SelectFundingSourceActivity.access$100(SelectFundingSourceActivity.this).get()).getModel().getStoredValue());
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    her()
    {
        this$0 = final_selectfundingsourceactivity;
        val$paymentCard = PaymentCard.this;
        super();
    }
}
