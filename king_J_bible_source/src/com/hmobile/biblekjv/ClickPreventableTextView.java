// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Context;
import android.text.Spannable;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class ClickPreventableTextView extends TextView
    implements android.view.View.OnClickListener
{

    private android.view.View.OnClickListener clickListener;
    private boolean ignoreSpannableClick;
    private boolean preventClick;

    public ClickPreventableTextView(Context context)
    {
        super(context);
    }

    public ClickPreventableTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ClickPreventableTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean ignoreSpannableClick()
    {
        return ignoreSpannableClick;
    }

    public void onClick(View view)
    {
        if (preventClick)
        {
            preventClick = false;
        } else
        if (clickListener != null)
        {
            clickListener.onClick(view);
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (getMovementMethod() != null)
        {
            getMovementMethod().onTouchEvent(this, (Spannable)getText(), motionevent);
        }
        ignoreSpannableClick = true;
        boolean flag = super.onTouchEvent(motionevent);
        ignoreSpannableClick = false;
        return flag;
    }

    public void preventNextClick()
    {
        preventClick = true;
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        clickListener = onclicklistener;
        super.setOnClickListener(this);
    }
}
