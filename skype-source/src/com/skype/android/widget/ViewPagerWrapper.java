// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

// Referenced classes of package com.skype.android.widget:
//            GestureTracker

public class ViewPagerWrapper extends ViewPager
{

    private final GestureTracker a;
    private boolean b;

    public ViewPagerWrapper(Context context)
    {
        super(context);
        a = new GestureTracker();
        b = true;
    }

    public ViewPagerWrapper(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new GestureTracker();
        b = true;
    }

    protected final void a(int i, float f, int j)
    {
        super.a(i, f, j);
        a.b = true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return b && super.onInterceptTouchEvent(motionevent);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        flag = flag1;
        boolean flag2;
        if (!super.onTouchEvent(motionevent))
        {
            break MISSING_BLOCK_LABEL_43;
        }
        flag2 = a.b(motionevent);
        flag = flag1;
        if (!flag2)
        {
            flag = true;
        }
        a.a(motionevent);
        return flag;
        Exception exception;
        exception;
        a.a(motionevent);
        throw exception;
    }

    public void setPassThroughStrategy(GestureTracker.PassThroughStrategy passthroughstrategy)
    {
        a.a(passthroughstrategy);
    }

    public void setSwipingAllowed(boolean flag)
    {
        b = flag;
    }
}
