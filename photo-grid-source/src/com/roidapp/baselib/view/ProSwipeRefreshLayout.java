// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

// Referenced classes of package com.roidapp.baselib.view:
//            FixedSwipeRefreshLayout

public class ProSwipeRefreshLayout extends FixedSwipeRefreshLayout
{

    private int a;
    private float b;
    private boolean c;

    public ProSwipeRefreshLayout(Context context)
    {
        super(context);
    }

    public ProSwipeRefreshLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 38
    //                   1 32
    //                   2 57;
           goto _L1 _L2 _L1 _L3
_L1:
        return super.onInterceptTouchEvent(motionevent);
_L2:
        b = MotionEvent.obtain(motionevent).getX();
        c = false;
        continue; /* Loop/switch isn't completed */
_L3:
        float f = Math.abs(motionevent.getX() - b);
        if (c || f > (float)a)
        {
            c = true;
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
