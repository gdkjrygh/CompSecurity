// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;

public final class owh
    implements android.view.View.OnTouchListener
{

    boolean a;
    private int b;
    private int c;
    private int d;
    private long e;
    private RecyclerView f;
    private owm g;
    private int h;
    private float i;
    private float j;
    private boolean k;
    private int l;
    private VelocityTracker m;
    private int n;
    private View o;
    private int p;

    public owh(RecyclerView recyclerview, owm owm1, int i1)
    {
        h = 1;
        ViewConfiguration viewconfiguration = ViewConfiguration.get(recyclerview.getContext());
        b = viewconfiguration.getScaledTouchSlop();
        c = viewconfiguration.getScaledMinimumFlingVelocity() << 4;
        d = viewconfiguration.getScaledMaximumFlingVelocity();
        e = recyclerview.getContext().getResources().getInteger(0x10e0000);
        f = recyclerview;
        g = owm1;
        p = i1;
    }

    private float a(float f1)
    {
        float f2 = f1;
        switch (owl.a[p - 1])
        {
        default:
            f2 = Math.abs(f1);
            // fall through

        case 1: // '\001'
            return f2;

        case 2: // '\002'
            return -f1;
        }
    }

    static RecyclerView a(owh owh1)
    {
        return owh1.f;
    }

    private boolean a()
    {
        if (m == null)
        {
            return false;
        }
        if (o != null && k)
        {
            o.animate().translationX(0.0F).alpha(1.0F).setDuration(e).setListener(null);
        }
        b();
        return false;
    }

    static owm b(owh owh1)
    {
        return owh1.g;
    }

    private void b()
    {
        if (m != null)
        {
            m.recycle();
        }
        m = null;
        i = 0.0F;
        j = 0.0F;
        o = null;
        n = -1;
        k = false;
    }

    static boolean c(owh owh1)
    {
        return owh1.a();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        int k1;
        int l1;
        l1 = 1;
        k1 = 1;
        if (h == 1)
        {
            h = f.getWidth();
        }
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 60
    //                   0 62
    //                   1 277
    //                   2 619
    //                   3 272;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L2:
        int i1;
        int i2;
        int j2;
        if (a)
        {
            continue; /* Loop/switch isn't completed */
        }
        view = new Rect();
        int ai[] = new int[2];
        f.getLocationOnScreen(ai);
        k1 = (int)motionevent.getRawX();
        l1 = ai[0];
        i2 = (int)motionevent.getRawY();
        j2 = ai[1];
        i1 = 0;
_L7:
        if (i1 >= f.getChildCount())
        {
            continue; /* Loop/switch isn't completed */
        }
        View view1 = f.getChildAt(i1);
        if (view1 == null)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        view1.getHitRect(view);
        if (!view.contains(k1 - l1, i2 - j2))
        {
            break MISSING_BLOCK_LABEL_256;
        }
        o = view1;
        if (o == null) goto _L1; else goto _L6
_L6:
        i = motionevent.getRawX();
        j = motionevent.getRawY();
        n = f.c(o);
        if (n != -1 && g.b(n))
        {
            m = VelocityTracker.obtain();
            m.addMovement(motionevent);
            return false;
        } else
        {
            o = null;
            return false;
        }
        i1++;
          goto _L7
_L5:
        return a();
_L3:
        if (m != null)
        {
            float f1 = motionevent.getRawX() - i;
            m.addMovement(motionevent);
            m.computeCurrentVelocity(1000);
            float f2 = m.getXVelocity();
            float f3 = a(f2);
            float f4 = Math.abs(m.getYVelocity());
            int j1;
            if (a(f1) > (float)(h / 2))
            {
                if (f1 > 0.0F)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
            } else
            if ((float)c <= f3 && f3 <= (float)d && f4 < f3 && k)
            {
                if (f2 < 0.0F)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                if (f1 < 0.0F)
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                if (j1 == k1)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                if (m.getXVelocity() > 0.0F)
                {
                    k1 = l1;
                } else
                {
                    k1 = 0;
                }
                l1 = j1;
                j1 = k1;
                k1 = l1;
            } else
            {
                j1 = 0;
                k1 = 0;
            }
            if (k1 != 0 && n != -1 && o != null)
            {
                view = o;
                motionevent = o.animate();
                if (j1 != 0)
                {
                    f1 = h;
                } else
                {
                    f1 = -h;
                }
                motionevent.translationX(f1).alpha(0.0F).setDuration(e).setListener(new owk(this, view));
            } else
            if (o != null)
            {
                o.animate().translationX(0.0F).alpha(1.0F).setDuration(e).setListener(null);
            }
            b();
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (m != null && !a)
        {
            m.addMovement(motionevent);
            f1 = motionevent.getRawX() - i;
            f2 = motionevent.getRawY();
            f3 = j;
            if (a(f1) > (float)b && Math.abs(f2 - f3) < a(f1) / 2.0F)
            {
                k = true;
                if (f1 > 0.0F)
                {
                    j1 = b;
                } else
                {
                    j1 = -b;
                }
                l = j1;
                f.requestDisallowInterceptTouchEvent(true);
                view = MotionEvent.obtain(motionevent);
                view.setAction(motionevent.getActionIndex() << 8 | 3);
                f.onTouchEvent(view);
                view.recycle();
            }
            if (k && o != null)
            {
                o.setTranslationX(f1 - (float)l);
                o.setAlpha(Math.max(0.0F, Math.min(1.0F, 1.0F - (a(f1) * 2.0F) / (float)h)));
                return true;
            }
        }
        if (true) goto _L1; else goto _L8
_L8:
    }
}
