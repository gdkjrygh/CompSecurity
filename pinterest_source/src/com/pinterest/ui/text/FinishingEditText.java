// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;

public class FinishingEditText extends EditText
{

    public FinishingEditText(Context context)
    {
        super(context);
    }

    public FinishingEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FinishingEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyevent)
    {
        if (i == 4 && (getContext() instanceof Activity) && getText().length() == 0)
        {
            ((Activity)getContext()).finish();
            return true;
        } else
        {
            return false;
        }
    }
}
