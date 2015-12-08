// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;

import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.application.driver.expresspay.IExpressPayRepository;
import me.lyft.android.domain.driver.ExpressPayAccount;
import me.lyft.android.infrastructure.lyft.driver.ExpressPayAccountDTO;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.payment:
//            PaymentService

class val.analytics
    implements Action1
{

    final PaymentService this$0;
    final ActionAnalytics val$analytics;

    public volatile void call(Object obj)
    {
        call((ExpressPayAccountDTO)obj);
    }

    public void call(ExpressPayAccountDTO expresspayaccountdto)
    {
        val$analytics.trackSuccess();
        PaymentService.access$700(PaymentService.this).setExpressAccount(ExpressPayAccount.fromDTO(expresspayaccountdto));
    }

    ccountDTO()
    {
        this$0 = final_paymentservice;
        val$analytics = ActionAnalytics.this;
        super();
    }
}
