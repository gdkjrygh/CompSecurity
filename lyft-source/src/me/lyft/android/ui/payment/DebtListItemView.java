// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.CreditCardChargeAccount;
import me.lyft.android.domain.payment.PayPalChargeAccount;
import me.lyft.android.domain.payment.WalletChargeAccount;

// Referenced classes of package me.lyft.android.ui.payment:
//            DebtWalletListItemView, DebtPayPalListItemView, DebtCreditCardListItemView

public abstract class DebtListItemView extends FrameLayout
{

    TextView accountText;
    ImageView accountTypeImage;
    private final ChargeAccount chargeAccount;

    public DebtListItemView(Context context, ChargeAccount chargeaccount)
    {
        super(context);
        chargeAccount = chargeaccount;
        context = Scoop.a(this);
        context.b(this);
        context.a(getContext()).inflate(0x7f03004d, this);
        setClickable(true);
        ButterKnife.a(this);
    }

    public static DebtListItemView createItem(Context context, ChargeAccount chargeaccount)
    {
        DebtWalletListItemView debtwalletlistitemview = null;
        if (chargeaccount.isWallet())
        {
            debtwalletlistitemview = new DebtWalletListItemView(context, (WalletChargeAccount)chargeaccount);
        } else
        {
            if (chargeaccount.isPayPal())
            {
                return new DebtPayPalListItemView(context, (PayPalChargeAccount)chargeaccount);
            }
            if (chargeaccount.isCreditCard())
            {
                return new DebtCreditCardListItemView(context, (CreditCardChargeAccount)chargeaccount);
            }
        }
        return debtwalletlistitemview;
    }

    protected final ChargeAccount getChargeAccount()
    {
        return chargeAccount;
    }

    protected abstract int getIcon();

    protected abstract String getTitle();

    protected abstract boolean isFailed();

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        accountTypeImage.setImageResource(getIcon());
        accountText.setText(getTitle());
        if (isFailed())
        {
            accountText.setTextColor(getResources().getColor(0x7f0c008f));
        }
    }
}
