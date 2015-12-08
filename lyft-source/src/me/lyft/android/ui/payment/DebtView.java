// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.domain.User;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.Money;

// Referenced classes of package me.lyft.android.ui.payment:
//            DebtWalletListItemView, DebtPayPalListItemView, DebtListItemView, DebtAddCardListItemView

public class DebtView extends ScrollView
{

    AppFlow appFlow;
    LinearLayout cardList;
    IChargeAccountsProvider chargeAccountsProvider;
    ImageButton closeButton;
    TextView debtAmountTxt;
    ILyftPreferences lyftPreferences;
    IUserProvider userProvider;

    public DebtView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private void loadPaymentMethods()
    {
        Object obj = chargeAccountsProvider.getChargeAccounts();
        cardList.removeAllViews();
        if (!chargeAccountsProvider.hasWalletCard())
        {
            cardList.addView(new DebtWalletListItemView(getContext(), null));
        }
        if (!chargeAccountsProvider.hasPayPalChargeAccount())
        {
            cardList.addView(new DebtPayPalListItemView(getContext(), null));
        }
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (ChargeAccount)((Iterator) (obj)).next();
            obj1 = DebtListItemView.createItem(getContext(), ((ChargeAccount) (obj1)));
            if (obj1 != null)
            {
                cardList.addView(((View) (obj1)));
            }
        } while (true);
        if (!chargeAccountsProvider.hasMaximumCreditCardsAmount())
        {
            cardList.addView(new DebtAddCardListItemView(getContext()));
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        closeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final DebtView this$0;

            public void onClick(View view)
            {
                appFlow.goUp();
            }

            
            {
                this$0 = DebtView.this;
                super();
            }
        });
        loadPaymentMethods();
        String s = userProvider.getUser().getDebtMoney().format();
        debtAmountTxt.setText(s);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }
}
