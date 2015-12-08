// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;

import android.text.Editable;
import android.text.TextWatcher;
import me.lyft.android.utils.CardExtensions;

public class CVCTextWatcher
    implements TextWatcher
{

    boolean deleting;
    boolean formatting;

    public CVCTextWatcher()
    {
        formatting = false;
        deleting = false;
    }

    public void afterTextChanged(Editable editable)
    {
        if (!formatting)
        {
            String s1 = editable.toString().replaceAll("[^0-9]", "");
            int i = CardExtensions.getCVCMaxLength(s1, getCardType());
            String s = s1;
            if (s1.length() > i)
            {
                s = s1.substring(0, i);
            }
            s = (new StringBuilder(s)).toString();
            if (!editable.toString().equals(s))
            {
                formatting = true;
                editable.replace(0, editable.length(), s);
                formatting = false;
            }
            onCVCChanged(editable.toString());
            if (editable.length() == i)
            {
                onMaxLengthReached();
            }
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public String getCardType()
    {
        return "Unknown";
    }

    public boolean isDeleting()
    {
        return deleting;
    }

    public void onCVCChanged(String s)
    {
    }

    public void onMaxLengthReached()
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        boolean flag;
        if (k < j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        deleting = flag;
    }
}
