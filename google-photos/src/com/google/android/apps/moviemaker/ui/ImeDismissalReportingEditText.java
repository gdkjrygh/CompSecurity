// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import dad;

public class ImeDismissalReportingEditText extends EditText
{

    public dad a;

    public ImeDismissalReportingEditText(Context context)
    {
        super(context);
    }

    public ImeDismissalReportingEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ImeDismissalReportingEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        InputConnection inputconnection = super.onCreateInputConnection(editorinfo);
        int i = editorinfo.imeOptions & 0xff;
        if ((i & 6) != 0)
        {
            editorinfo.imeOptions = i ^ editorinfo.imeOptions;
            editorinfo.imeOptions = editorinfo.imeOptions | 6;
        }
        if ((editorinfo.imeOptions & 0x40000000) != 0)
        {
            editorinfo.imeOptions = editorinfo.imeOptions & 0xbfffffff;
        }
        return inputconnection;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyevent)
    {
        if (keyevent.getKeyCode() == 4 && keyevent.getAction() == 1 && a != null)
        {
            a.a(this);
        }
        return super.dispatchKeyEvent(keyevent);
    }
}
