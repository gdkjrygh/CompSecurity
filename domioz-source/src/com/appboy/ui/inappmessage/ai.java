// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;

// Referenced classes of package com.appboy.ui.inappmessage:
//            ak, al, aj, am

public class ai
    implements android.view.View.OnTouchListener
{

    private int a;
    private int b;
    private int c;
    private long d;
    private View e;
    private am f;
    private int g;
    private float h;
    private float i;
    private boolean j;
    private int k;
    private Object l;
    private VelocityTracker m;
    private float n;

    public ai(View view, am am)
    {
        g = 1;
        ViewConfiguration viewconfiguration = ViewConfiguration.get(view.getContext());
        a = viewconfiguration.getScaledTouchSlop();
        b = viewconfiguration.getScaledMinimumFlingVelocity() * 16;
        c = viewconfiguration.getScaledMaximumFlingVelocity();
        d = view.getContext().getResources().getInteger(0x10e0000);
        e = view;
        l = null;
        f = am;
    }

    static View a(ai ai1)
    {
        return ai1.e;
    }

    static am b(ai ai1)
    {
        return ai1.f;
    }

    public final void a()
    {
        android.view.ViewGroup.LayoutParams layoutparams = e.getLayoutParams();
        int i1 = e.getHeight();
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            i1, 1
        }).setDuration(d);
        valueanimator.addListener(new ak(this, layoutparams, i1));
        valueanimator.addUpdateListener(new al(this, layoutparams));
        valueanimator.start();
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
            g = e.getWidth();
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
            if ((float)b <= f3 && f3 <= (float)c && f4 < f3 && f4 < f3 && j)
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
                view = e.animate();
                if (i1 != 0)
                {
                    f1 = g;
                } else
                {
                    f1 = -g;
                }
                view.translationX(f1).alpha(0.0F).setDuration(d).setListener(new aj(this));
            } else
            if (j)
            {
                e.animate().translationX(0.0F).alpha(1.0F).setDuration(d).setListener(null);
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
            e.animate().translationX(0.0F).alpha(1.0F).setDuration(d).setListener(null);
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
            if (Math.abs(f1) > (float)a && Math.abs(f2 - f3) < Math.abs(f1) / 2.0F)
            {
                j = true;
                if (f1 > 0.0F)
                {
                    i1 = a;
                } else
                {
                    i1 = -a;
                }
                k = i1;
                e.getParent().requestDisallowInterceptTouchEvent(true);
                view = MotionEvent.obtain(motionevent);
                view.setAction(motionevent.getActionIndex() << 8 | 3);
                e.onTouchEvent(view);
                view.recycle();
            }
            if (j)
            {
                n = f1;
                e.setTranslationX(f1 - (float)k);
                return true;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
    }
}
