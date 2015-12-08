// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.ksoichiro.android.observablescrollview;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class TouchInterceptionFrameLayout extends FrameLayout
{
    public static interface a
    {

        public abstract boolean a();
    }


    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private PointF e;
    private MotionEvent f;
    private a g;

    public TouchInterceptionFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TouchInterceptionFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private transient void a(MotionEvent motionevent, MotionEvent amotionevent[])
    {
        if (motionevent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = getChildCount() - 1;
_L5:
        if (i < 0) goto _L1; else goto _L3
_L3:
        View view;
        MotionEvent motionevent1;
        boolean flag;
        view = getChildAt(i);
        if (view == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        motionevent1 = MotionEvent.obtainNoHistory(motionevent);
        if (!rect.contains((int)motionevent1.getX(), (int)motionevent1.getY()))
        {
            break; /* Loop/switch isn't completed */
        }
        float f1 = -view.getLeft();
        float f2 = -view.getTop();
        int k = amotionevent.length;
        int j = 0;
        boolean flag1;
        for (flag = false; j < k; flag = flag1)
        {
            MotionEvent motionevent2 = amotionevent[j];
            flag1 = flag;
            if (motionevent2 != null)
            {
                motionevent2 = MotionEvent.obtainNoHistory(motionevent2);
                motionevent2.offsetLocation(f1, f2);
                flag1 = flag | view.dispatchTouchEvent(motionevent2);
            }
            j++;
        }

        motionevent1.offsetLocation(f1, f2);
        if (flag | view.dispatchTouchEvent(motionevent1)) goto _L1; else goto _L4
_L4:
        i--;
          goto _L5
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (g == null)
        {
            return false;
        }
        switch (motionevent.getActionMasked())
        {
        case 1: // '\001'
        default:
            return false;

        case 0: // '\0'
            e = new PointF(motionevent.getX(), motionevent.getY());
            f = MotionEvent.obtainNoHistory(motionevent);
            b = true;
            a = g.a();
            c = a;
            d = false;
            return a;

        case 2: // '\002'
            break;
        }
        if (e == null)
        {
            e = new PointF(motionevent.getX(), motionevent.getY());
        }
        motionevent.getX();
        float f1 = e.x;
        motionevent.getY();
        f1 = e.y;
        a = g.a();
        return a;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = true;
        if (g == null) goto _L2; else goto _L1
_L1:
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 44
    //                   0 54
    //                   1 301
    //                   2 72
    //                   3 301;
           goto _L2 _L3 _L4 _L5 _L4
_L2:
        flag = super.onTouchEvent(motionevent);
_L7:
        return flag;
_L3:
        if (a)
        {
            a(motionevent, new MotionEvent[0]);
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (e == null)
        {
            e = new PointF(motionevent.getX(), motionevent.getY());
        }
        motionevent.getX();
        float f1 = e.x;
        motionevent.getY();
        f1 = e.y;
        a = g.a();
        if (a)
        {
            if (!c)
            {
                c = true;
                MotionEvent.obtainNoHistory(f).setLocation(motionevent.getX(), motionevent.getY());
                e = new PointF(motionevent.getX(), motionevent.getY());
            }
            if (!d)
            {
                d = true;
                motionevent = MotionEvent.obtainNoHistory(motionevent);
                motionevent.setAction(3);
                a(motionevent, new MotionEvent[0]);
            }
            b = true;
            return true;
        }
        if (b)
        {
            b = false;
            MotionEvent motionevent1 = MotionEvent.obtainNoHistory(f);
            motionevent1.setLocation(motionevent.getX(), motionevent.getY());
            a(motionevent, new MotionEvent[] {
                motionevent1
            });
        } else
        {
            a(motionevent, new MotionEvent[0]);
        }
        c = false;
        d = false;
        continue; /* Loop/switch isn't completed */
_L4:
        c = false;
        if (d) goto _L7; else goto _L6
_L6:
        d = true;
        if (b)
        {
            b = false;
            MotionEvent motionevent2 = MotionEvent.obtainNoHistory(f);
            motionevent2.setLocation(motionevent.getX(), motionevent.getY());
            a(motionevent, new MotionEvent[] {
                motionevent2
            });
            return true;
        }
        a(motionevent, new MotionEvent[0]);
        return true;
        if (true) goto _L2; else goto _L8
_L8:
    }
}
