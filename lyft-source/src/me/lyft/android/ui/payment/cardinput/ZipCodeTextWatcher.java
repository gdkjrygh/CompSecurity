// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;

import android.text.Editable;
import android.text.TextWatcher;
import me.lyft.android.utils.CardExtensions;

public class ZipCodeTextWatcher
    implements TextWatcher
{

    String locale;

    public ZipCodeTextWatcher(String s)
    {
        locale = s;
    }

    public void afterTextChanged(Editable editable)
    {
        int i = CardExtensions.getZipMaxLength(locale);
        if (editable.length() == i)
        {
            onMaxLengthReached();
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onMaxLengthReached()
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
