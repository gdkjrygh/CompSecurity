// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.braintree.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.braintreepayments.cardform.utils.DateValidator;
import com.braintreepayments.cardform.view.SlashSpan;

// Referenced classes of package com.pinterest.activity.commerce.braintree.view:
//            CardPEditText

public class MonthYearEditText extends CardPEditText
    implements TextWatcher
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

        addDateSlash(editable);
        if (getSelectionStart() == 4 && !editable.toString().endsWith("20") || getSelectionStart() == 6)
        {
            focusNextView();
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
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

    public void init()
    {
        super.init();
        setInputType(2);
        setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(6)
        });
        addTextChangedListener(this);
    }

    public boolean isValid()
    {
        return DateValidator.a(getMonth(), getYear());
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

    public void setText(String s)
    {
        String s1;
label0:
        {
            s1 = s;
            if (s == null)
            {
                break label0;
            }
            if (s.length() != 3)
            {
                s1 = s;
                if (s.length() != 5)
                {
                    break label0;
                }
            }
            s1 = (new StringBuilder("0")).append(s).toString();
        }
        super.setText(s1);
    }
}
