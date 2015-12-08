// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

// Referenced classes of package com.google.android.apps.translate.widget:
//            ba, bb

public class WordWrapInput extends EditText
{

    private boolean a;
    private bb b;
    private ba c;

    public WordWrapInput(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = true;
        b = null;
        c = null;
    }

    private InputMethodManager getInputMethodManager()
    {
        return (InputMethodManager)getContext().getSystemService("input_method");
    }

    public final boolean a()
    {
        return getInputMethodManager().showSoftInput(this, 0);
    }

    public final boolean b()
    {
        return getInputMethodManager().hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public boolean onCheckIsTextEditor()
    {
        return a;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        boolean flag = a;
        a = true;
        InputConnection inputconnection = super.onCreateInputConnection(editorinfo);
        editorinfo.imeOptions = editorinfo.imeOptions & 0xbfffffff;
        a = flag;
        return inputconnection;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyevent)
    {
        if (keyevent.getKeyCode() == 4 && c != null)
        {
            c.l();
        }
        return super.onKeyPreIme(i, keyevent);
    }

    public void onSelectionChanged(int i, int j)
    {
        if (b != null)
        {
            b.a();
        }
    }

    public void setBackButtonListener(ba ba1)
    {
        c = ba1;
    }

    public void setIsTextEditor(boolean flag)
    {
        a = flag;
    }

    public void setSelectionChangeListener(bb bb1)
    {
        b = bb1;
    }
}
