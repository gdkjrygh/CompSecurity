// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class NoTouchLayout extends FrameLayout
{

    public NoTouchLayout(Context context)
    {
        this(context, null);
    }

    public NoTouchLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NoTouchLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return true;
    }
}
