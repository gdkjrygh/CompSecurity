// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.facebook.widget.e;

public class TouchStealingLinearLayout extends e
{

    public TouchStealingLinearLayout(Context context)
    {
        super(context);
    }

    public TouchStealingLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void a()
    {
        ViewParent viewparent = getParent();
        if (viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i = motionevent.getAction();
        boolean flag = super.onInterceptTouchEvent(motionevent);
        switch (i)
        {
        case 1: // '\001'
        default:
            return flag;

        case 0: // '\0'
        case 2: // '\002'
            a();
            break;
        }
        return flag;
    }
}
