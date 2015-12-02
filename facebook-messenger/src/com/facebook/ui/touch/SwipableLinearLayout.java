// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

// Referenced classes of package com.facebook.ui.touch:
//            f, a, e

public class SwipableLinearLayout extends LinearLayout
    implements f
{

    private a a;
    private e b;
    private boolean c;

    public SwipableLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
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
            c = a.a(motionevent);
        }
        return c;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (b != null)
        {
            b.a();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (c)
        {
            c = a.a(motionevent);
        }
        return c;
    }

    public void setOnSizeChangedListener(e e1)
    {
        b = e1;
    }
}
