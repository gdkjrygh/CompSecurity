// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.transfer.api.TransferApi;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;

public class SettleBalanceAlertDialog extends AlertDialogFragment
{

    private com.google.wallet.proto.NanoWalletEntities.MoneyProto amountOwed;

    public SettleBalanceAlertDialog()
    {
    }

    private SettleBalanceAlertDialog(Bundle bundle)
    {
        setArguments(bundle);
    }

    public static SettleBalanceAlertDialog createNewDialog()
    {
        return new SettleBalanceAlertDialog(new Bundle());
    }

    protected final void configureAlertDialog(android.app.AlertDialog.Builder builder)
    {
        android.net.Uri uri = HelpUrls.createSettleBalanceHelpUrl();
        setTitle(com.google.android.apps.walletnfcrel.R.string.send_money_kyc_settle_dlg_title);
        setMessage(getString(com.google.android.apps.walletnfcrel.R.string.send_money_kyc_settle_dlg_text, new Object[] {
            uri
        }));
        setPositiveButton(com.google.android.apps.walletnfcrel.R.string.settle_balance_pay_off_button);
        setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel);
        super.configureAlertDialog(builder);
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            startActivity(TransferApi.createConfirmMoneyTransferIntent(getActivity(), 3, amountOwed.micros.longValue(), amountOwed.currencyCode, null, null));
        }
        dismiss();
    }

    public final SettleBalanceAlertDialog setAmountOwed(com.google.wallet.proto.NanoWalletEntities.MoneyProto moneyproto)
    {
        amountOwed = moneyproto;
        return this;
    }
}
