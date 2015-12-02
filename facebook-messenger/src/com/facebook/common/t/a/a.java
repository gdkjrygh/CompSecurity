// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.t.a;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;

public class a extends TouchDelegate
{

    private final TouchDelegate a[];

    public transient a(View view, TouchDelegate atouchdelegate[])
    {
        super(new Rect(), view);
        a = atouchdelegate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = false;
        TouchDelegate atouchdelegate[] = a;
        int j = atouchdelegate.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!atouchdelegate[i].onTouchEvent(motionevent))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }
}
