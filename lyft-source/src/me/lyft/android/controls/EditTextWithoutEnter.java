// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

public class EditTextWithoutEnter extends EditText
{

    public EditTextWithoutEnter(Context context)
    {
        super(context);
    }

    public EditTextWithoutEnter(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public EditTextWithoutEnter(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        InputConnection inputconnection = super.onCreateInputConnection(editorinfo);
        editorinfo.imeOptions = editorinfo.imeOptions & 0xbfffffff;
        return inputconnection;
    }
}
