// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.money;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.money.CurrencySymbolPosition;
import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.util.view.Views;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.wallet.widgets.money:
//            MonetaryValueInput

public class MoneyInputSection extends LinearLayout
{

    private MonetaryValueInput input;
    private TextView moneySymbol;

    public MoneyInputSection(Context context)
    {
        super(context);
    }

    public MoneyInputSection(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.money_input_section, this);
        int i;
        if (CurrencyUtil.getCurrencySymbolPosition(Locale.getDefault()) == CurrencySymbolPosition.FOLLOW_AMOUNT)
        {
            i = com.google.android.apps.walletnfcrel.R.id.SuffixMoneySymbol;
        } else
        {
            i = com.google.android.apps.walletnfcrel.R.id.PrefixMoneySymbol;
        }
        moneySymbol = (TextView)Views.findViewById(this, i);
        moneySymbol.setVisibility(0);
        moneySymbol.setText(CurrencyUtil.getCurrencySymbol());
        input = (MonetaryValueInput)findViewById(com.google.android.apps.walletnfcrel.R.id.MoneyInput);
    }

    public final TextView getErrorView()
    {
        return (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.MoneyInputError);
    }

    public final MonetaryValueInput getInput()
    {
        return (MonetaryValueInput)findViewById(com.google.android.apps.walletnfcrel.R.id.MoneyInput);
    }

    public void setEnabled(boolean flag)
    {
        moneySymbol.setEnabled(flag);
        input.setEnabled(flag);
    }
}
