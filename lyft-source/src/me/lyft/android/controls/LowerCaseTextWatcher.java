// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.text.Editable;
import android.text.TextWatcher;

public class LowerCaseTextWatcher
    implements TextWatcher
{

    boolean formatting;

    public LowerCaseTextWatcher()
    {
        formatting = false;
    }

    public void afterTextChanged(Editable editable)
    {
        if (!formatting)
        {
            String s = editable.toString().toLowerCase();
            if (!editable.toString().equals(s))
            {
                formatting = true;
                editable.replace(0, editable.length(), s);
                formatting = false;
            }
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
