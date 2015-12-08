// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.cardform.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import com.braintreepayments.cardform.utils.DateValidator;

// Referenced classes of package com.braintreepayments.cardform.view:
//            FloatingLabelEditText, SlashSpan

public class MonthYearEditText extends FloatingLabelEditText
{

    private boolean mChangeWasAddition;

    public MonthYearEditText(Context context)
    {
        super(context);
        init();
    }

    public MonthYearEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public MonthYearEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void addDateSlash(Editable editable)
    {
        if (2 <= editable.length())
        {
            editable.setSpan(new SlashSpan(), 1, 2, 33);
        }
    }

    private String getString()
    {
        Editable editable = getText();
        if (editable != null)
        {
            return editable.toString();
        } else
        {
            return "";
        }
    }

    private void init()
    {
        setInputType(2);
        setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(6)
        });
    }

    private void prependLeadingZero(Editable editable)
    {
        char c = editable.charAt(0);
        editable.replace(0, 1, "0").append(c);
    }

    public void afterTextChanged(Editable editable)
    {
        int i = 0;
        if (mChangeWasAddition && editable.length() == 1 && Character.getNumericValue(editable.charAt(0)) >= 2)
        {
            prependLeadingZero(editable);
        }
        Object aobj[] = editable.getSpans(0, editable.length(), com/braintreepayments/cardform/view/SlashSpan);
        for (int j = aobj.length; i < j; i++)
        {
            editable.removeSpan(aobj[i]);
        }

        if (!mRightToLeftLanguage)
        {
            addDateSlash(editable);
        }
        super.afterTextChanged(editable);
        if (getSelectionStart() == 4 && !editable.toString().endsWith("20") || getSelectionStart() == 6)
        {
            focusNext();
        }
    }

    public String getMonth()
    {
        if (getString().length() < 2)
        {
            return "";
        } else
        {
            return getString().substring(0, 2);
        }
    }

    public String getYear()
    {
        String s = getString();
        if (s.length() == 4 || s.length() == 6)
        {
            return getString().substring(2);
        } else
        {
            return "";
        }
    }

    public boolean isValid()
    {
        return DateValidator.isValid(getMonth(), getYear());
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        boolean flag;
        if (k > j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mChangeWasAddition = flag;
    }
}
