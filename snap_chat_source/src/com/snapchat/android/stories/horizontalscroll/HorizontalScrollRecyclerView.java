// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.horizontalscroll;

import aY;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class HorizontalScrollRecyclerView extends RecyclerView
{

    private float r;

    public HorizontalScrollRecyclerView(Context context)
    {
        super(context, null);
        r = -1F;
    }

    public HorizontalScrollRecyclerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0);
        r = -1F;
    }

    public HorizontalScrollRecyclerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        r = -1F;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 38
    //                   1 32
    //                   2 49;
           goto _L1 _L2 _L1 _L3
_L1:
        return super.onInterceptTouchEvent(motionevent);
_L2:
        r = motionevent.getX();
        continue; /* Loop/switch isn't completed */
_L3:
        int i;
        if (r - motionevent.getX() > 0.0F)
        {
            i = 1;
        } else
        {
            i = -1;
        }
        if (!aY.a(this, i))
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
