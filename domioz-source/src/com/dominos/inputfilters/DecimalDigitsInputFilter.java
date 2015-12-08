// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.inputfilters;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.method.DigitsKeyListener;
import android.widget.EditText;

public class DecimalDigitsInputFilter extends DigitsKeyListener
    implements InputFilter
{

    int digitsAfterZero;
    int digitsBeforeZero;
    EditText et;

    public DecimalDigitsInputFilter(int i, int j, EditText edittext)
    {
        super(Boolean.FALSE.booleanValue(), Boolean.TRUE.booleanValue());
        digitsBeforeZero = i;
        digitsAfterZero = j;
        et = edittext;
    }

    public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        String s = (new StringBuilder()).append(et.getText()).append(charsequence.toString()).toString();
        if (s.equals("."))
        {
            return "0.";
        }
        if (s.toString().indexOf(".") == -1)
        {
            if (s.length() > digitsBeforeZero)
            {
                return "";
            }
        } else
        if (s.substring(s.indexOf(".") + 1).length() > digitsAfterZero)
        {
            return "";
        }
        return super.filter(charsequence, i, j, spanned, k, l);
    }
}
