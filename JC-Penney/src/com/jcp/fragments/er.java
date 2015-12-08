// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.jcp.h.c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.jcp.fragments:
//            el

class er extends LinkMovementMethod
{

    final String a;
    final el b;

    er(el el, String s)
    {
        b = el;
        a = s;
        super();
    }

    public boolean onTouchEvent(TextView textview, Spannable spannable, MotionEvent motionevent)
    {
        int i = motionevent.getAction();
        if (i == 1 || i == 0)
        {
            int j = (int)motionevent.getX();
            int k = textview.getTotalPaddingLeft();
            int l = textview.getScrollX();
            int i1 = (int)motionevent.getY();
            int j1 = textview.getTotalPaddingTop();
            int k1 = textview.getScrollY();
            Layout layout = textview.getLayout();
            j = layout.getOffsetForHorizontal(layout.getLineForVertical((i1 - j1) + k1), (j - k) + l);
            if (((ClickableSpan[])spannable.getSpans(j, j, android/text/style/ClickableSpan)).length != 0 && i == 1)
            {
                Matcher matcher = Pattern.compile(".com/(.*?)/").matcher(a);
                if (matcher.find())
                {
                    c.b(matcher.group(1));
                }
            }
        }
        return super.onTouchEvent(textview, spannable, motionevent);
    }
}
