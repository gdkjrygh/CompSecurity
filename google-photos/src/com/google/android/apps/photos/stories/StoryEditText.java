// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.stories;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import iqe;

public class StoryEditText extends EditText
{

    public iqe a;

    public StoryEditText(Context context)
    {
        super(context);
    }

    public StoryEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public StoryEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public StoryEditText(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
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
        if (keyevent.getKeyCode() == 4 && a != null)
        {
            a.b();
            return true;
        } else
        {
            return super.onKeyPreIme(i, keyevent);
        }
    }
}
