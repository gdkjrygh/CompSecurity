// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;

public class ErrorShowingEditText extends EditText
{

    private static final int errorIconId = 0x7f0201ac;
    private static final int warningIconId = 0x7f0201ad;
    private CharSequence _error;
    private boolean _isWarningMessage;

    public ErrorShowingEditText(Context context)
    {
        this(context, null);
    }

    public ErrorShowingEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CharSequence getError()
    {
        return _error;
    }

    public boolean isWarningMessage()
    {
        return _isWarningMessage;
    }

    public void setError(CharSequence charsequence)
    {
        setError(charsequence, false);
    }

    public void setError(CharSequence charsequence, boolean flag)
    {
        _error = charsequence;
        _isWarningMessage = flag;
        Drawable adrawable[] = getCompoundDrawables();
        if (charsequence == null)
        {
            setCompoundDrawables(adrawable[0], adrawable[1], null, adrawable[3]);
            return;
        }
        int i;
        if (flag)
        {
            i = 0x7f0201ad;
        } else
        {
            i = 0x7f0201ac;
        }
        charsequence = getContext().getResources().getDrawable(i);
        charsequence.setBounds(0, 0, charsequence.getIntrinsicWidth(), charsequence.getIntrinsicHeight());
        setCompoundDrawables(adrawable[0], adrawable[1], charsequence, adrawable[3]);
    }
}
