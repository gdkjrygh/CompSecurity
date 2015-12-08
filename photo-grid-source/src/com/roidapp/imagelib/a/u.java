// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.os.Handler;
import android.util.FloatMath;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.roidapp.imagelib.filter.FilterListView;

// Referenced classes of package com.roidapp.imagelib.a:
//            i, ah, h

final class u
    implements android.view.View.OnTouchListener
{

    final int a;
    final int b;
    final i c;
    private float d;
    private int e;
    private int f;
    private float g;
    private float h;

    u(i j, int k, int l)
    {
        c = j;
        a = k;
        b = l;
        super();
        d = 1.0F;
        e = 0;
        f = 0;
        h = 10F;
    }

    private static float a(MotionEvent motionevent)
    {
        float f1 = motionevent.getX(0) - motionevent.getX(1);
        float f2 = motionevent.getY(0) - motionevent.getY(1);
        return FloatMath.sqrt(f1 * f1 + f2 * f2);
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 52
    //                   0 54
    //                   1 129
    //                   2 787
    //                   3 52
    //                   4 52
    //                   5 706
    //                   6 638;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L5 _L6
_L1:
        return true;
_L2:
        if (i.k(c))
        {
            return false;
        }
        if (i.l(c) != null && !i.l(c).k() && i.l(c) != null)
        {
            i.l(c).g();
        }
        g = motionevent.getX();
        i.b(c, false);
        continue; /* Loop/switch isn't completed */
_L3:
        float f1;
        float f3;
        f1 = motionevent.getX();
        f3 = motionevent.getY();
        if (i.l(c) == null)
        {
            return false;
        }
        if (i.l(c).o() || i.k(c) || e == 1)
        {
            e = 0;
            return false;
        }
        if (Math.abs(f1 - g) >= h) goto _L8; else goto _L7
_L7:
        if (i.l(c) != null)
        {
            if (System.currentTimeMillis() - i.m(c) <= 2000L)
            {
                return true;
            }
            if (!i.l(c).k())
            {
                i.n(c).setVisibility(0);
                i.n(c).startAnimation(i.o(c));
                i.l(c).a(f1, f3);
                view = (android.widget.RelativeLayout.LayoutParams)i.n(c).getLayoutParams();
                view.leftMargin = (int)(f1 - (float)(a / 2));
                view.topMargin = (int)(f3 - (float)(b / 2));
                if (((android.widget.RelativeLayout.LayoutParams) (view)).leftMargin + a > i.p(c))
                {
                    view.rightMargin = i.p(c) - (((android.widget.RelativeLayout.LayoutParams) (view)).leftMargin + a);
                }
                if (((android.widget.RelativeLayout.LayoutParams) (view)).topMargin + b > i.q(c))
                {
                    view.bottomMargin = i.q(c) - (((android.widget.RelativeLayout.LayoutParams) (view)).topMargin + b);
                }
                i.n(c).setLayoutParams(view);
                i.s(c).postDelayed(i.r(c), 300L);
            }
            if (i.l(c).j())
            {
                i.t(c).setVisibility(0);
                i.t(c).startAnimation(i.o(c));
                i.s(c).postDelayed(i.u(c), 2000L);
            }
            i.a(c, System.currentTimeMillis());
        }
_L9:
        i.s(c).postDelayed(i.v(c), 2000L);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f1 - g > h)
        {
            if (i.h(c).isShown())
            {
                i.c(c).a(h.j, h.k, true);
            }
        } else
        if (f1 - g < -h && i.h(c).isShown())
        {
            i.c(c).a(h.j, h.k, false);
        }
        if (true) goto _L9; else goto _L6
_L6:
        if (i.l(c) != null && i.l(c).j())
        {
            i.s(c).postDelayed(i.u(c), 2000L);
        }
        i.s(c).postDelayed(i.v(c), 2000L);
        continue; /* Loop/switch isn't completed */
_L5:
        if (i.l(c) != null)
        {
            d = a(motionevent);
            e = 1;
            f = i.l(c).h();
            if (i.l(c).j())
            {
                i.t(c).setVisibility(0);
                i.t(c).startAnimation(i.o(c));
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (i.l(c) != null && e == 1 && i.l(c).j() && motionevent.getPointerCount() >= 2)
        {
            float f2 = a(motionevent) / d;
            float f4 = (float)i.l(c).i() / 10F;
            if (f2 >= 1.0F)
            {
                f2 = f2 * f4 + (float)f;
            } else
            {
                f2 = (float)f - f4 / f2;
            }
            i.l(c).a((int)f2);
            h.i = i.l(c).h();
            i.w(c).setProgress(i.l(c).h());
        }
        if (true) goto _L1; else goto _L10
_L10:
    }
}
