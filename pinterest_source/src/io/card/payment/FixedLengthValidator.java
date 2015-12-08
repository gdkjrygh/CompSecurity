// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.text.Editable;
import android.text.Spanned;

// Referenced classes of package io.card.payment:
//            Validator

class FixedLengthValidator
    implements Validator
{

    public int requiredLength;
    private String value;

    public FixedLengthValidator(int i)
    {
        requiredLength = i;
    }

    public void afterTextChanged(Editable editable)
    {
        value = editable.toString();
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        if (j > 0 && ((spanned.length() + l) - k) + j > requiredLength)
        {
            return "";
        } else
        {
            return null;
        }
    }

    public String getValue()
    {
        return value;
    }

    public boolean hasFullLength()
    {
        return isValid();
    }

    public boolean isValid()
    {
        return value != null && value.length() == requiredLength;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
