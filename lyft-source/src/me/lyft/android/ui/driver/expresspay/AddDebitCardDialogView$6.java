// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import android.content.res.Resources;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.driver.expresspay.IExpressPayRepository;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.driver.ExpressPayAccount;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.ui.payment.IPaymentErrorHandler;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            AddDebitCardDialogView

class this._cls0 extends AsyncCall
{

    final AddDebitCardDialogView this$0;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        paymentErrorHandler.handleCardError(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        super.onSuccess(unit);
        dialogFlow.dismiss();
        unit = expressPayRepository.getExpressPayAccount().getSuccessMessage();
        DialogFlow dialogflow = dialogFlow;
        if (Strings.isNullOrEmpty(unit))
        {
            unit = new Toast(getResources().getString(0x7f0700ee));
        } else
        {
            unit = new PayDebitCardInfoDialog(unit, getResources().getString(0x7f070188), false, getResources().getString(0x7f0701ee), constantsProvider.getConstants().getExpressPayDebitCardInfoLink());
        }
        dialogflow.show(unit);
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.enableUI();
        progressController.hideProgress();
    }

    PayDebitCardInfoDialog()
    {
        this$0 = AddDebitCardDialogView.this;
        super();
    }
}
