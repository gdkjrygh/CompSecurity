// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view;

import com.facebook.common.b.a;
import com.facebook.reflex.ah;
import com.facebook.reflex.aj;
import com.facebook.reflex.view.c.s;
import com.facebook.widget.b.b;

// Referenced classes of package com.facebook.reflex.view:
//            h, k, i

class l
    implements ah
{

    final h a;
    private aj b;

    private l(h h1)
    {
        a = h1;
        super();
        b = aj.Idle;
    }

    l(h h1, i i)
    {
        this(h1);
    }

    public void a(aj aj1, float f, float f1)
    {
        int j;
        int i1 = h.k(a).size();
        for (int i = 0; i < i1; i++)
        {
            ((ah)h.k(a).a(i)).a(aj1, f, f1);
        }

        if ((double)Math.abs(h.l(a) - f) > 0.5D)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            if (h.m(a) != null)
            {
                h.m(a).a(aj1, f);
            }
            com.facebook.reflex.view.h.a(a, f);
            h.i(a);
            j = a.getFirstVisiblePosition();
            int j1 = a.getLastVisiblePosition();
            int k1 = a.getHeaderViewsCount();
            h.n(a).a().onScroll(a, j, (j1 - j) + 1 + k1, h.e(a).a());
        }
        if (b == aj1) goto _L2; else goto _L1
_L1:
        b = aj1;
        com.facebook.reflex.view.k.a[b.ordinal()];
        JVM INSTR tableswitch 1 3: default 240
    //                   1 271
    //                   2 277
    //                   3 283;
           goto _L3 _L4 _L5 _L6
_L3:
        j = 0;
_L8:
        h.n(a).a().onScrollStateChanged(a, j);
_L2:
        return;
_L4:
        j = 0;
        continue; /* Loop/switch isn't completed */
_L5:
        j = 1;
        continue; /* Loop/switch isn't completed */
_L6:
        j = 2;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
