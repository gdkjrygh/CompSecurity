// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Gallery;

// Referenced classes of package com.facebook.widget.images:
//            b

public class a extends Gallery
{

    private Runnable a;
    private long b;
    private boolean c;

    public a(Context context)
    {
        super(context);
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public a(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    static Runnable a(a a1, Runnable runnable)
    {
        a1.a = runnable;
        return runnable;
    }

    private void a()
    {
        if (a != null)
        {
            return;
        } else
        {
            a = new b(this);
            postDelayed(a, 250L);
            return;
        }
    }

    static void a(a a1)
    {
        a1.b();
    }

    private void b()
    {
        if (System.currentTimeMillis() - b > 250L && !c)
        {
            requestLayout();
            return;
        } else
        {
            a();
            return;
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (System.currentTimeMillis() - b > 250L && !c)
        {
            super.onLayout(flag, i, j, k, l);
            return;
        } else
        {
            a();
            return;
        }
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        b = System.currentTimeMillis();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        c = true;
_L4:
        return super.onTouchEvent(motionevent);
_L2:
        if (motionevent.getAction() == 1 || motionevent.getAction() == 3)
        {
            c = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
