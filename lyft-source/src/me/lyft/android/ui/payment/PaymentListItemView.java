// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.Credit;
import me.lyft.android.domain.payment.CreditCardChargeAccount;
import me.lyft.android.domain.payment.CreditLineChargeAccount;
import me.lyft.android.domain.payment.FacebookChargeAccount;
import me.lyft.android.domain.payment.PayPalChargeAccount;
import me.lyft.android.domain.payment.WalletChargeAccount;

// Referenced classes of package me.lyft.android.ui.payment:
//            WalletPaymentItemView, CreditCardPaymentItemView, CreditLinePaymentItemView, PayPalPaymentItemView, 
//            FacebookPaymentItemView, CommuteCreditPaymentListItemView, LyftCreditPaymentListItemView

public abstract class PaymentListItemView extends LinearLayout
{

    ImageView iconImageView;
    ImageView rightIconView;
    TextView subtitleTextView;
    TextView titleTextView;

    public PaymentListItemView(Context context)
    {
        super(context);
        context = LayoutInflater.from(context).inflate(0x7f0300e6, this, true);
        setClickable(true);
        ButterKnife.a(this, context);
    }

    public static PaymentListItemView createChargeAccountListItem(Context context, ChargeAccount chargeaccount, int i)
    {
        WalletPaymentItemView walletpaymentitemview = null;
        if (chargeaccount.isWallet())
        {
            walletpaymentitemview = new WalletPaymentItemView(context, (WalletChargeAccount)chargeaccount, i);
        } else
        {
            if (chargeaccount.isCreditCard())
            {
                return new CreditCardPaymentItemView(context, (CreditCardChargeAccount)chargeaccount, i);
            }
            if (chargeaccount.isCreditLine())
            {
                return new CreditLinePaymentItemView(context, (CreditLineChargeAccount)chargeaccount, i);
            }
            if (chargeaccount.isPayPal())
            {
                return new PayPalPaymentItemView(context, (PayPalChargeAccount)chargeaccount, i);
            }
            if (chargeaccount.isFacebook())
            {
                return new FacebookPaymentItemView(context, (FacebookChargeAccount)chargeaccount, i);
            }
        }
        return walletpaymentitemview;
    }

    public static PaymentListItemView createCreditListItem(Context context, Credit credit, int i)
    {
        if (credit.isCommuteCredits())
        {
            return new CommuteCreditPaymentListItemView(context, credit, i);
        } else
        {
            return new LyftCreditPaymentListItemView(context, credit, i);
        }
    }

    protected abstract int getIcon();

    protected abstract int getMode();

    protected abstract String getSubTitle();

    protected abstract String getTitle();

    protected abstract boolean isFailed();

    protected abstract boolean isSelectedPayment();

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        titleTextView.setText(getTitle());
        iconImageView.setImageResource(getIcon());
        if (getMode() != 1) goto _L2; else goto _L1
_L1:
        if (isSelectedPayment())
        {
            String s;
            int i;
            if (isFailed())
            {
                i = 0x7f020131;
            } else
            {
                i = 0x7f020130;
            }
            rightIconView.setImageResource(i);
        }
_L4:
        if (isFailed())
        {
            i = getResources().getColor(0x7f0c008f);
            titleTextView.setTextColor(i);
            subtitleTextView.setTextColor(i);
        }
        s = getSubTitle();
        if (!Strings.isNullOrEmpty(s))
        {
            subtitleTextView.setVisibility(0);
            subtitleTextView.setText(s);
        }
        return;
_L2:
        if (getMode() == 2)
        {
            rightIconView.setImageResource(0x7f02014d);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
