// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;
import java.io.PrintStream;
import java.text.MessageFormat;

public class PhoneTextWatcher
    implements TextWatcher
{

    Context context;

    public PhoneTextWatcher(Context context1)
    {
        context = context1;
    }

    public void afterTextChanged(Editable editable)
    {
        if (editable.length() == 1)
        {
            if (editable.toString().equalsIgnoreCase("0"))
            {
                Toast.makeText(context, 0x7f0800c7, 0).show();
                editable.clear();
            } else
            if (editable.toString().equalsIgnoreCase("1"))
            {
                Toast.makeText(context, 0x7f0802be, 0).show();
                editable.clear();
                return;
            }
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public String formatPhoneNumber(String s)
    {
        MessageFormat messageformat = new MessageFormat("({0})-{1}-{2}");
        String as[] = new String[3];
        as[0] = s.substring(0, 3);
        as[1] = s.substring(3, 6);
        as[2] = s.substring(6);
        System.out.println(messageformat.format(as));
        return messageformat.format(as);
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
