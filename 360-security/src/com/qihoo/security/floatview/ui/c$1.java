// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.ui;

import android.os.Handler;
import android.widget.Scroller;

// Referenced classes of package com.qihoo.security.floatview.ui:
//            c

class a
    implements Runnable
{

    final c a;

    public void run()
    {
        int k;
        boolean flag;
        k = 0;
        flag = true;
        boolean flag1 = c.a(a).computeScrollOffset();
        flag = flag1;
_L1:
label0:
        {
            {
                if (!flag)
                {
                    break label0;
                }
                int j = c.a(a).getCurrX();
                int l = c.a(a).getCurrY();
                int i = j;
                if (j >= a.i - a.getWidthOnSide())
                {
                    i = a.i - a.getWidthOnSide();
                    c.a(a).abortAnimation();
                    c.a(a, false);
                    c.b(a);
                    c.c(a);
                }
                j = i;
                if (i <= 0)
                {
                    c.a(a).abortAnimation();
                    c.a(a, false);
                    c.b(a);
                    c.c(a);
                    j = 0;
                }
                android.view.owManager.LayoutParams layoutparams;
                ArrayIndexOutOfBoundsException arrayindexoutofboundsexception;
                if (l < 0)
                {
                    i = k;
                } else
                {
                    i = l;
                }
                k = i;
                if (i >= a.j - a.getHeight())
                {
                    k = a.j - a.getHeight();
                }
                layoutparams = a.h;
                a.k = j;
                layoutparams.x = j;
                layoutparams = a.h;
                a.m = k;
                layoutparams.y = k;
                if (c.d(a) != null && a.k != a.l && a.m != a.n)
                {
                    c.d(a).a(a.h.x, a.h.y);
                }
                if (a.h.x >= a.i / 2)
                {
                    a.setSide(3);
                } else
                {
                    a.setSide(2);
                }
                if (a.isShown())
                {
                    a.a(a.h);
                }
                a.l = a.k;
                a.n = a.m;
                c.e(a).postDelayed(this, 20L);
            }
            return;
        }
        if (c.f(a))
        {
            if (c.g(a) && a.h.x != a.i - a.getWidthOnSide() && a.h.x != 0)
            {
                if (a.h.x >= a.i / 2)
                {
                    c.a(a).startScroll(a.h.x, a.h.y, a.i - a.getWidthOnSide() - a.h.x, 0, Math.abs(a.i - a.getWidthOnSide() - a.h.x) / 2);
                } else
                {
                    c.a(a).startScroll(a.h.x, a.h.y, -a.h.x, 0, Math.abs(a.h.x) / 2);
                }
                c.e(a).post(this);
                return;
            }
            c.a(a, false);
            if (c.g(a))
            {
                c.b(a);
            }
            c.c(a);
            return;
        } else
        {
            break MISSING_BLOCK_LABEL_425;
        }
        arrayindexoutofboundsexception;
          goto _L1
    }

    tion(c c1)
    {
        a = c1;
        super();
    }
}
