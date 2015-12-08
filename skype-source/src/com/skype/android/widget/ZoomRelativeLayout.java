// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.RelativeLayout;

// Referenced classes of package com.skype.android.widget:
//            ScaleGestureDetectorHolder

public class ZoomRelativeLayout extends RelativeLayout
{

    private ScaleGestureDetectorHolder a;

    public ZoomRelativeLayout(Context context)
    {
        super(context);
    }

    public ZoomRelativeLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ZoomRelativeLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private ScaleGestureDetector a()
    {
        return a.getScaleGestureDetector();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return a() != null && motionevent.getPointerCount() > 1;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (a() != null)
        {
            a().onTouchEvent(motionevent);
        }
        return true;
    }

    public void setScaleGestureDetectorHolder(ScaleGestureDetectorHolder scalegesturedetectorholder)
    {
        a = scalegesturedetectorholder;
    }
}
