// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.fitbit.util.af;

public class EditTextWithImeHack extends EditText
{

    private int a;
    private int b;
    private boolean c;

    public EditTextWithImeHack(Context context)
    {
        this(context, null);
    }

    public EditTextWithImeHack(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006e);
    }

    public EditTextWithImeHack(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(attributeset, i);
    }

    private void a(AttributeSet attributeset, int i)
    {
        attributeset = getContext().obtainStyledAttributes(attributeset, com.fitbit.FitbitMobile.R.styleable.EditTextWithImeHack, i, 0);
        a = getImeOptions() & 0xff;
        if (af.a())
        {
            d(attributeset.getInt(0, getImeOptions()));
        }
        c = attributeset.getBoolean(1, false);
        attributeset.recycle();
    }

    public void d(int i)
    {
        b = i & 0xff;
        setImeOptions(i);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        int i = getImeOptions();
        if (c && focusSearch(130) != null)
        {
            setImeOptions(5);
        }
        editorinfo = super.onCreateInputConnection(editorinfo);
        setImeOptions(i);
        return editorinfo;
        editorinfo;
        setImeOptions(i);
        throw editorinfo;
    }

    public void onEditorAction(int i)
    {
        int j = i;
        if (i == b)
        {
            j = a;
        }
        super.onEditorAction(j);
    }
}
