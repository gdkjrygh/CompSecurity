// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.nineoldandroids.a.o;

public class DragContainer extends FrameLayout
{

    private static final String a = com/qihoo/security/ui/main/DragContainer.getName();
    private VelocityTracker b;
    private float c;
    private View d;
    private ListView e;
    private android.view.ViewGroup.MarginLayoutParams f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    public DragContainer(Context context)
    {
        super(context);
        b = VelocityTracker.obtain();
        c = 0.0F;
        d = null;
        e = null;
        f = null;
        a(context);
    }

    public DragContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = VelocityTracker.obtain();
        c = 0.0F;
        d = null;
        e = null;
        f = null;
        a(context);
    }

    public DragContainer(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = VelocityTracker.obtain();
        c = 0.0F;
        d = null;
        e = null;
        f = null;
        a(context);
    }

    private void a(Context context)
    {
        j = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private void a(MotionEvent motionevent)
    {
        if (b == null)
        {
            b = VelocityTracker.obtain();
        }
        b.addMovement(motionevent);
    }

    static void a(DragContainer dragcontainer, int i1)
    {
        dragcontainer.setLayoutParams(i1);
    }

    private boolean a()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (e != null)
        {
            flag = flag1;
            if (e.getChildCount() > 0)
            {
                flag = flag1;
                if (e.getChildAt(0).getTop() == 0)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private void b()
    {
        if (b != null)
        {
            b.clear();
            b.recycle();
            b = null;
        }
    }

    private void setLayoutParams(int i1)
    {
        f.topMargin = i1;
        d.setLayoutParams(f);
        d.invalidate();
    }

    public void a(int i1, int j1)
    {
        o o1;
        int k1;
        if (h > 0)
        {
            k1 = (Math.abs(i1 - j1) * 100) / h;
        } else
        {
            k1 = 0;
        }
        o1 = o.b(new int[] {
            i1, j1
        });
        o1.a(new com.nineoldandroids.a.o.b() {

            final DragContainer a;

            public void a(o o2)
            {
                int l1 = ((Integer)o2.o()).intValue();
                DragContainer.a(a, l1);
            }

            
            {
                a = DragContainer.this;
                super();
            }
        });
        o1.a(new AccelerateInterpolator());
        o1.d(k1);
        o1.a();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        d = findViewById(0x7f0b00f1);
        e = (ListView)findViewById(0x7f0b00f2);
        f = (android.view.ViewGroup.MarginLayoutParams)d.getLayoutParams();
        int i1 = f.topMargin;
        g = i1;
        h = i1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag = true;
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 44
    //                   1 36
    //                   2 67
    //                   3 36;
           goto _L1 _L2 _L1 _L3 _L1
_L1:
        flag = super.onInterceptTouchEvent(motionevent);
_L5:
        return flag;
_L2:
        k = (int)motionevent.getY();
        g = f.topMargin;
        continue; /* Loop/switch isn't completed */
_L3:
        int i1 = (int)motionevent.getY() - k;
        if (g == 0 && a() && i1 > j) goto _L5; else goto _L4
_L4:
        if (g == h && i1 < -j)
        {
            return true;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        i1 = motionevent.getActionMasked();
        a(motionevent);
        i1;
        JVM INSTR tableswitch 0 3: default 40
    //                   0 40
    //                   1 145
    //                   2 46
    //                   3 145;
           goto _L1 _L1 _L2 _L3 _L2
_L1:
        return super.onTouchEvent(motionevent);
_L3:
        b.computeCurrentVelocity(1000);
        float f1 = b.getYVelocity();
        if (f1 != 0.0F)
        {
            c = f1;
        }
        l = (int)(motionevent.getY() - (float)k);
        i = g + l;
        if (i < 0)
        {
            i = 0;
        }
        if (i > h)
        {
            i = h;
        }
        setLayoutParams(i);
        continue; /* Loop/switch isn't completed */
_L2:
        if (c > 0.0F)
        {
            a(i, h);
        } else
        {
            a(i, 0);
        }
        b();
        if (true) goto _L1; else goto _L4
_L4:
    }

}
