// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.money;

import android.content.Context;
import android.content.res.Resources;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.apps.wallet.money.CurrencyUtil;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.wallet.widgets.money:
//            MoneyValueInputFilter

public class MonetaryValueInput extends EditText
{

    private static final BigDecimal MICROS_PER_UNIT = new BigDecimal(0xf4240);
    private Currency currency;
    private final DecimalFormat decimalFormat = (DecimalFormat)DecimalFormat.getInstance(Locale.getDefault());
    private final Integer maxInputLength;
    private final MoneyValueInputFilter moneyValueInputFilter = new MoneyValueInputFilter();

    public MonetaryValueInput(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        decimalFormat.setParseBigDecimal(true);
        currency = CurrencyUtil.getLegalAddressCurrency();
        attributeset = getFilters();
        context = attributeset;
        if (attributeset == null)
        {
            context = new InputFilter[0];
        }
        context = (InputFilter[])Arrays.copyOf(context, context.length + 1);
        context[context.length - 1] = new MoneyValueInputFilter();
        setFilters(context);
        setFocusable(true);
        setImeOptions(0x10000000);
        setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final MonetaryValueInput this$0;

            public final void onFocusChange(View view, boolean flag)
            {
                if (!flag && getText().toString().length() > 0)
                {
                    formatAmount();
                }
            }

            
            {
                this$0 = MonetaryValueInput.this;
                super();
            }
        });
        maxInputLength = Integer.valueOf(getResources().getInteger(com.google.android.apps.walletnfcrel.R.integer.monetary_value_input_max_length));
        int i = currency.getDefaultFractionDigits();
        setHint(String.format((new StringBuilder(14)).append("%.").append(i).append("f").toString(), new Object[] {
            BigDecimal.ZERO
        }));
    }

    private BigDecimal getRoundedDecimal()
    {
        BigDecimal bigdecimal;
        try
        {
            bigdecimal = ((BigDecimal)decimalFormat.parse(getText().toString())).setScale(currency.getDefaultFractionDigits(), 4);
        }
        catch (ParseException parseexception)
        {
            return BigDecimal.ZERO;
        }
        return bigdecimal;
    }

    public final void formatAmount()
    {
        int i = currency.getDefaultFractionDigits();
        String s;
        for (s = String.format((new StringBuilder(14)).append("%.").append(i).append("f").toString(), new Object[] {
    getRoundedDecimal()
}); s.length() > maxInputLength.intValue() || s.equals(getText().toString());)
        {
            return;
        }

        setText(s);
    }

    public final com.google.wallet.proto.NanoWalletEntities.MoneyProto getMoneyValue()
    {
        com.google.wallet.proto.NanoWalletEntities.MoneyProto moneyproto = new com.google.wallet.proto.NanoWalletEntities.MoneyProto();
        moneyproto.currencyCode = currency.getCurrencyCode();
        moneyproto.micros = Long.valueOf(getRoundedDecimal().multiply(MICROS_PER_UNIT).longValue());
        return moneyproto;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setText(CurrencyUtil.decimalToDisplayableMoney(getRoundedDecimal(), currency));
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onPopulateAccessibilityEvent(accessibilityevent);
        accessibilityevent.getText().clear();
        accessibilityevent.getText().add(CurrencyUtil.decimalToDisplayableMoney(getRoundedDecimal(), currency));
    }

    public void setCurrency(Currency currency1)
    {
        currency = currency1;
        moneyValueInputFilter.setNumberOfDecimalDigits(currency1.getDefaultFractionDigits());
    }

}
