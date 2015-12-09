// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class ScrollProxyView extends View
{

    public ScrollProxyView(Context context)
    {
        this(context, null, 0);
    }

    public ScrollProxyView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ScrollProxyView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (getVisibility() != 8)
        {
            setVisibility(8);
        }
    }

    public boolean canScrollVertically(int i)
    {
        return i >= 0 || getScrollY() > 0;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return false;
    }
}
