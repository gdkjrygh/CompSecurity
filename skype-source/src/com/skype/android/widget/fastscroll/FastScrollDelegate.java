// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fastscroll;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.skype.android.widget.fastscroll:
//            TouchInterceptor, Positionable

public class FastScrollDelegate
    implements TouchInterceptor
{

    final View a;
    final Positionable b;
    final Runnable c;
    private final int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private final Rect h;

    public FastScrollDelegate(View view, int i)
    {
        this(view, (Positionable)view, i);
    }

    private FastScrollDelegate(View view, Positionable positionable, int i)
    {
        c = new Runnable() {

            final FastScrollDelegate a;

            public final void run()
            {
                FastScrollDelegate.a(a);
                a.a.invalidate();
            }

            
            {
                a = FastScrollDelegate.this;
                super();
            }
        };
        h = new Rect();
        a = view;
        b = positionable;
        d = i;
    }

    private void a()
    {
        boolean flag1 = e;
        boolean flag;
        if (f || g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            e = true;
            a.removeCallbacks(c);
        } else
        if (flag1)
        {
            View view = a;
            Runnable runnable = c;
            View view1 = a;
            int i;
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                i = view1.getScrollBarFadeDuration();
                i = view1.getScrollBarDefaultDelayBeforeFade() + i;
            } else
            {
                i = 5000;
            }
            view.postDelayed(runnable, i);
            return;
        }
    }

    private boolean a(int i, int j)
    {
        return h.intersect(i - d, j - d, d + i, d + j);
    }

    static boolean a(FastScrollDelegate fastscrolldelegate)
    {
        fastscrolldelegate.e = false;
        return false;
    }

    private void b(boolean flag)
    {
        g = flag;
        a();
    }

    public final void a(int i, int j, int k)
    {
        int i1 = a.getWidth() - a.getPaddingRight();
        View view = a;
        float f1;
        int l;
        int j1;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            l = view.getScrollBarSize();
        } else
        {
            l = view.getPaddingRight();
        }
        f1 = a.getHeight();
        j1 = (int)(((float)i * f1) / (float)k);
        i = (int)(((float)(i + j) * f1) / (float)k);
        h.set(i1 - l, j1, i1, i);
    }

    public final void a(boolean flag)
    {
        f = flag;
        a();
    }

    public final boolean a(MotionEvent motionevent)
    {
        int i;
        int j;
        boolean flag;
        boolean flag1;
        flag1 = false;
        i = (int)motionevent.getX();
        j = (int)motionevent.getY();
        flag = flag1;
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 52
    //                   0 61
    //                   1 58
    //                   2 52
    //                   3 58;
           goto _L1 _L2 _L3 _L1 _L3
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        flag = g;
_L5:
        return flag;
_L2:
        flag = flag1;
        if (e)
        {
            flag = flag1;
            if (a(i, j))
            {
                return true;
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final boolean b(MotionEvent motionevent)
    {
        int i;
        int j;
        i = (int)motionevent.getX();
        j = (int)motionevent.getY();
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 44
    //                   0 46
    //                   1 93
    //                   2 62;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L2:
        if (a(i, j))
        {
            b(true);
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (g)
        {
            b.a((1.0F * (float)j) / (float)a.getHeight());
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (g)
        {
            b(false);
            return false;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
