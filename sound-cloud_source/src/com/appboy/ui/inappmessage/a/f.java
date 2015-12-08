// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;

// Referenced classes of package com.appboy.ui.inappmessage.a:
//            g

public class f
    implements android.view.View.OnTouchListener
{
    public static interface a
    {

        public abstract void a();
    }


    long a;
    View b;
    private int c;
    private int d;
    private int e;
    private a f;
    private int g;
    private float h;
    private float i;
    private boolean j;
    private int k;
    private Object l;
    private VelocityTracker m;
    private float n;

    public f(View view, a a1)
    {
        g = 1;
        ViewConfiguration viewconfiguration = ViewConfiguration.get(view.getContext());
        c = viewconfiguration.getScaledTouchSlop();
        d = viewconfiguration.getScaledMinimumFlingVelocity() * 16;
        e = viewconfiguration.getScaledMaximumFlingVelocity();
        a = view.getContext().getResources().getInteger(0x10e0000);
        b = view;
        l = null;
        f = a1;
    }

    static View a(f f1)
    {
        return f1.b;
    }

    static a b(f f1)
    {
        return f1.f;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        motionevent.offsetLocation(n, 0.0F);
        if (g < 2)
        {
            g = b.getWidth();
        }
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 68
    //                   0 70
    //                   1 103
    //                   2 533
    //                   3 465;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L2:
        h = motionevent.getRawX();
        i = motionevent.getRawY();
        m = VelocityTracker.obtain();
        m.addMovement(motionevent);
        return false;
_L3:
        if (m != null)
        {
            float f1 = motionevent.getRawX() - h;
            m.addMovement(motionevent);
            m.computeCurrentVelocity(1000);
            float f2 = m.getXVelocity();
            float f3 = Math.abs(f2);
            float f4 = Math.abs(m.getYVelocity());
            int i1;
            if (Math.abs(f1) > (float)(g / 2) && j)
            {
                if (f1 > 0.0F)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
            } else
            if ((float)d <= f3 && f3 <= (float)e && f4 < f3 && f4 < f3 && j)
            {
                if (f2 < 0.0F)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (f1 < 0.0F)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (i1 == flag)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (m.getXVelocity() > 0.0F)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                flag1 = i1;
                i1 = ((flag) ? 1 : 0);
                flag = flag1;
            } else
            {
                i1 = 0;
                flag = false;
            }
            if (flag)
            {
                view = b.animate();
                if (i1 != 0)
                {
                    f1 = g;
                } else
                {
                    f1 = -g;
                }
                view.translationX(f1).alpha(0.0F).setDuration(a).setListener(new g(this));
            } else
            if (j)
            {
                b.animate().translationX(0.0F).alpha(1.0F).setDuration(a).setListener(null);
            }
            m.recycle();
            m = null;
            n = 0.0F;
            h = 0.0F;
            i = 0.0F;
            j = false;
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (m != null)
        {
            b.animate().translationX(0.0F).alpha(1.0F).setDuration(a).setListener(null);
            m.recycle();
            m = null;
            n = 0.0F;
            h = 0.0F;
            i = 0.0F;
            j = false;
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (m != null)
        {
            m.addMovement(motionevent);
            f1 = motionevent.getRawX() - h;
            f2 = motionevent.getRawY();
            f3 = i;
            if (Math.abs(f1) > (float)c && Math.abs(f2 - f3) < Math.abs(f1) / 2.0F)
            {
                j = true;
                if (f1 > 0.0F)
                {
                    i1 = c;
                } else
                {
                    i1 = -c;
                }
                k = i1;
                b.getParent().requestDisallowInterceptTouchEvent(true);
                view = MotionEvent.obtain(motionevent);
                view.setAction(motionevent.getActionIndex() << 8 | 3);
                b.onTouchEvent(view);
                view.recycle();
            }
            if (j)
            {
                n = f1;
                b.setTranslationX(f1 - (float)k);
                return true;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
    }
}
