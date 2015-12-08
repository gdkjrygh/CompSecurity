// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

// Referenced classes of package com.google.android.apps.translate.widget:
//            as

public class SearchTextBox extends EditText
    implements android.widget.TextView.OnEditorActionListener
{

    private as a;

    public SearchTextBox(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOnEditorActionListener(this);
    }

    private InputMethodManager getIMM()
    {
        return (InputMethodManager)getContext().getSystemService("input_method");
    }

    public final void a()
    {
        requestFocus();
        getIMM().showSoftInput(this, 1);
    }

    public final void b()
    {
        getIMM().hideSoftInputFromWindow(getApplicationWindowToken(), 2);
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6 || i == 3)
        {
            b();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4 && a != null)
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (i == 4 && a != null)
        {
            a.c();
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        if (a != null)
        {
            a.a(charsequence.toString());
        }
    }

    public void setSearchListener(as as1)
    {
        a = as1;
    }
}
