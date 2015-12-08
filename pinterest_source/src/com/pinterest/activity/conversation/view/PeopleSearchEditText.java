// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.pinterest.ui.text.ClearFocusEditText;

public class PeopleSearchEditText extends ClearFocusEditText
{

    public PeopleSearchEditText(Context context)
    {
        this(context, null);
    }

    public PeopleSearchEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PeopleSearchEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        return new PInputConnection(super.onCreateInputConnection(editorinfo), true);
    }

    private class PInputConnection extends InputConnectionWrapper
    {

        final PeopleSearchEditText this$0;

        public boolean deleteSurroundingText(int i, int j)
        {
            if (getText().length() == 0)
            {
                dispatchKeyEvent(new KeyEvent(0, 67));
            }
            return super.deleteSurroundingText(i, j);
        }

        public PInputConnection(InputConnection inputconnection, boolean flag)
        {
            this$0 = PeopleSearchEditText.this;
            super(inputconnection, flag);
        }
    }

}
