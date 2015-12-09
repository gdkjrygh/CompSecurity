// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.validation;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.money.CurrencySymbolPosition;
import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.validator.DataValidator;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.wallet.widgets.validation:
//            ValidatedEditText, ValidationLogic

public class ValidatedCurrencyEditText extends LinearLayout
    implements ValidationGroup.Groupable
{

    private final ValidatedEditText validatedEditText;

    public ValidatedCurrencyEditText(Context context)
    {
        this(context, null);
    }

    public ValidatedCurrencyEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.validated_currency_edit_text, this);
        TextView textview;
        int i;
        if (CurrencyUtil.getCurrencySymbolPosition(Locale.getDefault()) == CurrencySymbolPosition.FOLLOW_AMOUNT)
        {
            i = com.google.android.apps.walletnfcrel.R.id.SuffixMoneySymbol;
        } else
        {
            i = com.google.android.apps.walletnfcrel.R.id.PrefixMoneySymbol;
        }
        textview = (TextView)Views.findViewById(this, i);
        textview.setVisibility(0);
        textview.setText(CurrencyUtil.getCurrencySymbol());
        validatedEditText = (ValidatedEditText)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.MoneyInput);
        validatedEditText.getValidationLogic().initializeStyle(context, attributeset);
    }

    public final boolean checkForError()
    {
        return validatedEditText.checkForError();
    }

    public final View getInputView()
    {
        return validatedEditText;
    }

    public final String getValue()
    {
        return validatedEditText.getValue();
    }

    public void setAutoAdvanceEnabled(boolean flag)
    {
        validatedEditText.setAutoAdvanceEnabled(flag);
    }

    public void setFilters(InputFilter ainputfilter[])
    {
        validatedEditText.setFilters(ainputfilter);
    }

    public void setHint(CharSequence charsequence)
    {
        validatedEditText.setHint(charsequence);
    }

    public void setInputType(int i)
    {
        validatedEditText.setInputType(i);
    }

    public void setInvalidState(String s)
    {
        validatedEditText.setInvalidState(s);
    }

    public void setMaxLength(int i)
    {
        validatedEditText.setMaxLength(i);
    }

    public void setValidator(DataValidator datavalidator)
    {
        validatedEditText.setValidator(datavalidator);
    }

    public void setValue(String s)
    {
        validatedEditText.setValue(s);
    }
}
