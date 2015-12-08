// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

public class InterceptingTouchListener
    implements android.view.View.OnTouchListener
{

    public InterceptingTouchListener()
    {
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 1: default 28
    //                   0 36
    //                   1 49;
           goto _L1 _L2 _L3
_L1:
        view.onTouchEvent(motionevent);
        return true;
_L2:
        view.getParent().requestDisallowInterceptTouchEvent(true);
        continue; /* Loop/switch isn't completed */
_L3:
        view.getParent().requestDisallowInterceptTouchEvent(false);
        if (true) goto _L1; else goto _L4
_L4:
    }
}
