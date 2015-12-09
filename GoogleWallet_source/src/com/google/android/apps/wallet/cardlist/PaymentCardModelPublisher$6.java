// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.cardlist:
//            PaymentCardModelPublisher, PaymentCardModelEvent, PaymentCardModel

final class val.doAfter
    implements AsyncCallback
{

    final PaymentCardModelPublisher this$0;
    final Runnable val$doAfter;

    private void onSuccess(List list)
    {
        list = new PaymentCardModelEvent(new PaymentCardModel(list), PaymentCardModelPublisher.access$500(PaymentCardModelPublisher.this));
        PaymentCardModelPublisher.access$700(PaymentCardModelPublisher.this).post(list);
        if (val$doAfter != null)
        {
            val$doAfter.run();
        }
    }

    public final void onFailure(Exception exception)
    {
        WLog.e(PaymentCardModelPublisher.access$900(), "Exception retrieving PaymentCards from db", exception);
        if (val$doAfter != null)
        {
            val$doAfter.run();
        }
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((List)obj);
    }

    I()
    {
        this$0 = final_paymentcardmodelpublisher;
        val$doAfter = Runnable.this;
        super();
    }
}
