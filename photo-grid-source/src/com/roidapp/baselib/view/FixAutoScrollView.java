// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class FixAutoScrollView extends ScrollView
{

    private boolean a;

    public FixAutoScrollView(Context context)
    {
        super(context);
        a = true;
    }

    public FixAutoScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = true;
    }

    public FixAutoScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = true;
    }

    protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect)
    {
        return 0;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!a)
        {
            return false;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public void setOverScrollMode(int i)
    {
        super.setOverScrollMode(2);
    }
}
