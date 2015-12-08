// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.view.View;
import android.widget.EditText;

public class TextFocusChangeListener
    implements android.view.View.OnFocusChangeListener
{

    public TextFocusChangeListener()
    {
    }

    private void trimEditText(View view)
    {
        view = (EditText)view;
        String s = view.getText().toString();
        if (s != null)
        {
            view.setText(s.trim());
        }
    }

    public void onFocusChange(View view, boolean flag)
    {
        if (!flag && (view instanceof EditText))
        {
            trimEditText(view);
        }
    }
}
