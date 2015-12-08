// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.text.Editable;
import android.text.TextWatcher;

public class ZipCodeFormattingTextWatcher
    implements TextWatcher
{

    public static final String NON_ALPHA_NUMERIC = "[^A-Za-z0-9]";
    boolean deleting;
    boolean formatting;

    public ZipCodeFormattingTextWatcher()
    {
        formatting = false;
        deleting = false;
    }

    public void afterTextChanged(Editable editable)
    {
        if (!formatting)
        {
            formatting = true;
            String s = editable.toString().replaceAll("[^A-Za-z0-9]", "").toUpperCase();
            editable.replace(0, editable.length(), s, 0, s.length());
            formatting = false;
            onZipCodeChanged(s);
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public boolean isDeleting()
    {
        return deleting;
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

    public void onZipCodeChanged(String s)
    {
    }
}
