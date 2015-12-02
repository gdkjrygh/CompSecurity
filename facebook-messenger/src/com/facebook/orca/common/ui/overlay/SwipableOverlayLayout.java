// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.facebook.ui.touch.a;
import com.facebook.ui.touch.f;
import com.facebook.widget.OverlayLayout;

public class SwipableOverlayLayout extends OverlayLayout
    implements f
{

    private a a;
    private boolean b;

    public SwipableOverlayLayout(Context context)
    {
        this(context, null);
    }

    public SwipableOverlayLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SwipableOverlayLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void a()
    {
        a = null;
    }

    public void a(a a1)
    {
        a = a1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (a != null)
        {
            b = a.a(motionevent);
        }
        return b;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (b)
        {
            b = a.a(motionevent);
        }
        return b;
    }
}
