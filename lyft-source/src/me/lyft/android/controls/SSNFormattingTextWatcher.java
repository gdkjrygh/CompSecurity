// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.text.Editable;
import android.text.TextWatcher;

public class SSNFormattingTextWatcher
    implements TextWatcher
{

    boolean deleting;
    boolean formatting;

    public SSNFormattingTextWatcher()
    {
        formatting = false;
        deleting = false;
    }

    public void afterTextChanged(Editable editable)
    {
        if (formatting) goto _L2; else goto _L1
_L1:
        String s;
        StringBuilder stringbuilder;
        s = editable.toString().replaceAll("[^0-9]", "");
        stringbuilder = new StringBuilder(s);
        if (!deleting) goto _L4; else goto _L3
_L3:
        if (s.length() > 3)
        {
            stringbuilder.insert(3, '-');
        }
        if (s.length() > 5)
        {
            stringbuilder.insert(6, '-');
        }
_L6:
        s = stringbuilder.toString();
        if (!editable.toString().equals(s))
        {
            formatting = true;
            editable.replace(0, editable.length(), s);
            formatting = false;
        }
_L2:
        return;
_L4:
        if (s.length() > 2)
        {
            stringbuilder.insert(3, '-');
        }
        if (s.length() > 4)
        {
            stringbuilder.insert(6, '-');
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
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
