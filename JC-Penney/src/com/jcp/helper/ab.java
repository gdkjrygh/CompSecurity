// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.jcp.activities.MainActivity;
import com.jcp.c.ai;
import com.jcp.e.ak;

public class ab
    implements TextWatcher, android.widget.TextView.OnEditorActionListener
{

    private ak a;
    private MainActivity b;
    private EditText c;

    public ab(MainActivity mainactivity, ak ak, EditText edittext)
    {
        b = mainactivity;
        a = ak;
        c = edittext;
    }

    public void afterTextChanged(Editable editable)
    {
        if (editable.length() >= 3)
        {
            ai ai1 = new ai(b);
            ai1.a(a);
            ai1.a(editable.toString());
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 3 || i == 6 || i == 5)
        {
            b.i();
            if (!TextUtils.isEmpty(c.getEditableText()))
            {
                b.a(c.getEditableText().toString());
            }
        }
        return false;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
