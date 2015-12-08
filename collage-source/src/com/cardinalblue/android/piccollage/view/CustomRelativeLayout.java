// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class CustomRelativeLayout extends LinearLayout
{
    public static interface a
    {

        public abstract void a(KeyEvent keyevent);
    }


    private a a;

    public CustomRelativeLayout(Context context)
    {
        super(context);
    }

    public CustomRelativeLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CustomRelativeLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (a != null)
        {
            a.a(keyevent);
        }
        return super.dispatchKeyEvent(keyevent);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return super.onTouchEvent(motionevent);
    }

    public void setDispatchKeyEventListener(a a1)
    {
        a = a1;
    }
}
