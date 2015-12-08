// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.money;

import android.text.InputFilter;
import android.text.Spanned;
import com.google.android.apps.wallet.money.CurrencyUtil;
import java.text.DecimalFormatSymbols;
import java.util.Currency;
import java.util.Locale;

public final class MoneyValueInputFilter
    implements InputFilter
{

    private int decimalDigits;
    private final String decimalSeparator;

    public MoneyValueInputFilter()
    {
        this(String.valueOf(DecimalFormatSymbols.getInstance(Locale.getDefault()).getDecimalSeparator()));
    }

    private MoneyValueInputFilter(String s)
    {
        decimalSeparator = s;
        decimalDigits = CurrencyUtil.getLegalAddressCurrency().getDefaultFractionDigits();
    }

    public final CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        if (i != j)
        {
            charsequence = (new StringBuffer()).append(spanned.subSequence(0, k)).append(charsequence.subSequence(i, j)).append(spanned.subSequence(l, spanned.length()));
            i = charsequence.indexOf(decimalSeparator);
            if (i != -1 && charsequence.length() - 1 - i > decimalDigits)
            {
                return "";
            }
        }
        return null;
    }

    final void setNumberOfDecimalDigits(int i)
    {
        decimalDigits = i;
    }
}
