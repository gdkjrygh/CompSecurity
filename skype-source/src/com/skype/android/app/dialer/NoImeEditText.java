// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import com.skype.android.widget.AccessibleEditText;

public class NoImeEditText extends AccessibleEditText
{

    private InputMethodManager ime;

    public NoImeEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ime = (InputMethodManager)context.getSystemService("input_method");
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        if (ime.isActive(this))
        {
            ime.hideSoftInputFromWindow(getApplicationWindowToken(), 0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = super.onTouchEvent(motionevent);
        if (ime.isActive(this))
        {
            ime.hideSoftInputFromWindow(getApplicationWindowToken(), 0);
        }
        return flag;
    }
}
