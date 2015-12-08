// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.res.Resources;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.Toast;

// Referenced classes of package me.lyft.android.ui.payment:
//            DebtPayPalListItemView, IPaymentErrorHandler

class val.debt extends AsyncCall
{

    final DebtPayPalListItemView this$0;
    final String val$debt;

    public void onFail(Throwable throwable)
    {
        errorHandler.handleSaveDebtCardError(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        super.onSuccess(unit);
        dialogFlow.show(new Toast(getResources().getString(0x7f0700fb, new Object[] {
            val$debt
        }), Integer.valueOf(0x7f0201ca)));
        appFlow.goUp();
    }

    public void onUnsubscribe()
    {
        progressController.hideProgress();
    }

    _cls9()
    {
        this$0 = final_debtpaypallistitemview;
        val$debt = String.this;
        super();
    }
}
