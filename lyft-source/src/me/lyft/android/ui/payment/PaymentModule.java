// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.res.Resources;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentErrorHandler, IPaymentErrorHandler

public class PaymentModule
{

    public PaymentModule()
    {
    }

    public IPaymentErrorHandler providePaymentErrorHandler(IViewErrorHandler iviewerrorhandler, Resources resources, DialogFlow dialogflow)
    {
        return new PaymentErrorHandler(iviewerrorhandler, resources, dialogflow);
    }
}
