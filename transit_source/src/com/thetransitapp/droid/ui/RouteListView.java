// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;

public class RouteListView extends ListView
{
    public static interface OnMoveListener
    {

        public abstract void onMove();
    }


    private OnMoveListener onMoveListener;
    private boolean scrolling;
    private float startX;
    private float startY;
    private boolean vertical;

    public RouteListView(Context context)
    {
        super(context);
    }

    public RouteListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public RouteListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag = false;
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 38
    //                   1 32
    //                   2 62;
           goto _L1 _L2 _L1 _L3
_L1:
        return super.onInterceptTouchEvent(motionevent);
_L2:
        startX = motionevent.getX();
        startY = motionevent.getY();
        scrolling = false;
          goto _L1
_L3:
        if (!scrolling)
        {
            float f = Math.abs(motionevent.getX() - startX);
            float f1 = Math.abs(motionevent.getY() - startY);
            if (f < 5F && f1 < 5F)
            {
                return super.onInterceptTouchEvent(motionevent);
            }
            if (f < f1)
            {
                flag = true;
            }
            vertical = flag;
            scrolling = true;
        }
        return vertical;
    }

    public void setOnMoveListener(OnMoveListener onmovelistener)
    {
        onMoveListener = onmovelistener;
    }
}
