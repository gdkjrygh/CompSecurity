// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class RecommendationScrollView extends ScrollView
{

    private float a;
    private float b;
    private float c;
    private float d;

    public RecommendationScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 38
    //                   1 32
    //                   2 67;
           goto _L1 _L2 _L1 _L3
_L1:
        return super.onInterceptTouchEvent(motionevent);
_L2:
        a = 0.0F;
        b = 0.0F;
        c = motionevent.getX();
        d = motionevent.getY();
        continue; /* Loop/switch isn't completed */
_L3:
        float f = motionevent.getX();
        float f1 = motionevent.getY();
        a = a + Math.abs(f - c);
        b = b + Math.abs(f1 - d);
        c = f;
        d = f1;
        if (a > b)
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
