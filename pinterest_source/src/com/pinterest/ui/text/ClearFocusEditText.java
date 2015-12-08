// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;
import com.pinterest.kit.utils.DrawableUtils;

public class ClearFocusEditText extends EditText
{

    public ClearFocusEditText(Context context)
    {
        super(context);
    }

    public ClearFocusEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ClearFocusEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            clearFocus();
        }
        return super.onKeyPreIme(i, keyevent);
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
    {
        super.setCompoundDrawablesWithIntrinsicBounds(DrawableUtils.tintIcon(drawable), DrawableUtils.tintIcon(drawable1), DrawableUtils.tintIcon(drawable2), DrawableUtils.tintIcon(drawable3));
    }
}
