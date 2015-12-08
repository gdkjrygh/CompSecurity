// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class TouchBlockingFrameLayout extends FrameLayout
{

    public TouchBlockingFrameLayout(Context context)
    {
        super(context);
    }

    public TouchBlockingFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TouchBlockingFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return false;
    }
}
