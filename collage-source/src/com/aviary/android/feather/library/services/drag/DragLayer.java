// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services.drag;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.aviary.android.feather.library.services.a;

public class DragLayer extends FrameLayout
{
    public static interface a
    {

        public abstract void a();
    }


    a a;
    com.aviary.android.feather.library.services.a b;

    public DragLayer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (b != null)
        {
            return b.a(keyevent);
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    public boolean dispatchUnhandledMove(View view, int i)
    {
        if (b != null)
        {
            return b.a(view, i);
        } else
        {
            return false;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (a != null)
        {
            a.a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (b != null)
        {
            return b.a(motionevent);
        } else
        {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (b != null)
        {
            return b.b(motionevent);
        } else
        {
            return false;
        }
    }

    public void setDragController(com.aviary.android.feather.library.services.a a1)
    {
        b = a1;
    }

    public void setOnAttachedToWindowListener(a a1)
    {
        a = a1;
    }
}
