// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.payment.WalletChargeAccount;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.Toast;

// Referenced classes of package me.lyft.android.ui.payment:
//            DebtListItemView, IPaymentErrorHandler

public class DebtWalletListItemView extends DebtListItemView
{

    AppFlow appFlow;
    private Binder binder;
    DialogFlow dialogFlow;
    IPaymentErrorHandler errorHandler;
    IPaymentService paymentService;
    IProgressController progressController;
    IUserProvider userProvider;

    public DebtWalletListItemView(Context context, WalletChargeAccount walletchargeaccount)
    {
        super(context, walletchargeaccount);
    }

    private boolean isAddWallet()
    {
        return getChargeAccount() == null;
    }

    private String resolveCardText()
    {
        WalletChargeAccount walletchargeaccount = (WalletChargeAccount)getChargeAccount();
        if (isAddWallet())
        {
            return getResources().getString(0x7f0700f1);
        }
        if (walletchargeaccount.isFailed().booleanValue())
        {
            return getResources().getString(0x7f0700fc, new Object[] {
                walletchargeaccount.getLastFour()
            });
        } else
        {
            return getResources().getString(0x7f0700fe, new Object[] {
                walletchargeaccount.getLastFour()
            });
        }
    }

    protected int getIcon()
    {
        return 0x7f020071;
    }

    protected String getTitle()
    {
        return resolveCardText();
    }

    protected boolean isFailed()
    {
        if (isAddWallet())
        {
            return false;
        } else
        {
            return getChargeAccount().isFailed().booleanValue();
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
    }

    public boolean performClick()
    {
        progressController.showProgress();
        final String debt = userProvider.getUser().getDebtMoney().format();
        if (isAddWallet() || getChargeAccount().isFailed().booleanValue())
        {
            binder.bind(paymentService.saveWalletCard(), new AsyncCall() {

                final DebtWalletListItemView this$0;
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
                        debt
                    }), Integer.valueOf(0x7f0201ca)));
                    appFlow.goUp();
                }

                public void onUnsubscribe()
                {
                    progressController.hideProgress();
                }

            
            {
                this$0 = DebtWalletListItemView.this;
                debt = s;
                super();
            }
            });
        } else
        {
            binder.bind(paymentService.payDebtWithWallet(getChargeAccount().getId()), new AsyncCall() {

                final DebtWalletListItemView this$0;
                final String val$debt;

                public void onFail(Throwable throwable)
                {
                    super.onFail(throwable);
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
                        debt
                    }), Integer.valueOf(0x7f0201ca)));
                    appFlow.goUp();
                }

                public void onUnsubscribe()
                {
                    super.onUnsubscribe();
                    progressController.hideProgress();
                }

            
            {
                this$0 = DebtWalletListItemView.this;
                debt = s;
                super();
            }
            });
        }
        return true;
    }
}
