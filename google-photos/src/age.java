// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

final class age
    implements Runnable
{

    private agd a;

    age(agd agd1)
    {
        a = agd1;
        super();
    }

    public final void run()
    {
        boolean flag = false;
        if (a.b == null) goto _L2; else goto _L1
_L1:
        agd agd1;
        int i;
        int j;
        int k;
        agd1 = a;
        if (agd1.b == null)
        {
            break MISSING_BLOCK_LABEL_525;
        }
        long l1 = System.currentTimeMillis();
        Object obj;
        RecyclerView recyclerview;
        long l;
        if (agd1.v == 0x8000000000000000L)
        {
            l = 0L;
        } else
        {
            l = l1 - agd1.v;
        }
        obj = agd1.n.e;
        if (agd1.u == null)
        {
            agd1.u = new Rect();
        }
        ((aex) (obj)).calculateItemDecorationsForChild(agd1.b.a, agd1.u);
        if (!((aex) (obj)).canScrollHorizontally()) goto _L4; else goto _L3
_L3:
        j = (int)(agd1.g + agd1.e);
        i = j - agd1.u.left - agd1.n.getPaddingLeft();
        if (agd1.e >= 0.0F || i >= 0) goto _L6; else goto _L5
_L5:
        if (!((aex) (obj)).canScrollVertically()) goto _L8; else goto _L7
_L7:
        k = (int)(agd1.h + agd1.f);
        j = k - agd1.u.top - agd1.n.getPaddingTop();
        if (agd1.f >= 0.0F || j >= 0) goto _L10; else goto _L9
_L9:
        if (i != 0)
        {
            obj = agd1.j;
            recyclerview = agd1.n;
            k = agd1.b.a.getWidth();
            agd1.n.getWidth();
            i = ((agj) (obj)).a(recyclerview, k, i, l);
        }
        if (j != 0)
        {
            obj = agd1.j;
            recyclerview = agd1.n;
            k = agd1.b.a.getHeight();
            agd1.n.getHeight();
            j = ((agj) (obj)).a(recyclerview, k, j, l);
        }
        if (i == 0 && j == 0)
        {
            break MISSING_BLOCK_LABEL_525;
        }
        if (agd1.v == 0x8000000000000000L)
        {
            agd1.v = l1;
        }
        agd1.n.scrollBy(i, j);
        i = 1;
_L13:
        if (i != 0)
        {
            if (a.b != null)
            {
                agd.a(a, a.b);
            }
            a.n.removeCallbacks(a.o);
            mk.a(a.n, this);
        }
_L2:
        return;
_L6:
        if (agd1.e <= 0.0F) goto _L4; else goto _L11
_L11:
        j = (j + agd1.b.a.getWidth() + agd1.u.right) - (agd1.n.getWidth() - agd1.n.getPaddingRight());
        i = j;
        if (j > 0) goto _L5; else goto _L4
_L4:
        i = 0;
          goto _L5
_L10:
        if (agd1.f <= 0.0F) goto _L8; else goto _L12
_L12:
        k = (k + agd1.b.a.getHeight() + agd1.u.bottom) - (agd1.n.getHeight() - agd1.n.getPaddingBottom());
        j = k;
        if (k > 0) goto _L9; else goto _L8
_L8:
        j = 0;
          goto _L9
        agd1.v = 0x8000000000000000L;
        i = ((flag) ? 1 : 0);
          goto _L13
    }
}
