// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.text.Html;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

public class FixTouchConsumeTextView extends TextView
{

    public ClickableSpan a[];

    public FixTouchConsumeTextView(Context context)
    {
        super(context);
    }

    public FixTouchConsumeTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FixTouchConsumeTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (getText() instanceof Spannable)
        {
            Spannable spannable = (Spannable)getText();
            if (motionevent.getAction() == 0)
            {
                Layout layout = getLayout();
                if (layout == null)
                {
                    motionevent = null;
                } else
                {
                    int i = (int)motionevent.getX();
                    int j = getTotalPaddingLeft();
                    int k = getScrollX();
                    i = layout.getOffsetForHorizontal(layout.getLineForVertical(((int)motionevent.getY() - getTotalPaddingTop()) + getScrollY()), (i - j) + k);
                    motionevent = (ClickableSpan[])spannable.getSpans(i, i, android/text/style/ClickableSpan);
                }
                a = motionevent;
                if (spannable != null)
                {
                    Selection.removeSelection(spannable);
                }
            }
        }
        return false;
    }

    public void setTextViewHTML(String s)
    {
        setText(new SpannableStringBuilder(Html.fromHtml(s)));
    }
}
