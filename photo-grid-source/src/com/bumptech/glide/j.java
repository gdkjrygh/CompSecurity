// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import android.widget.AbsListView;
import java.util.List;

// Referenced classes of package com.bumptech.glide:
//            n, h, k, l, 
//            e

public final class j
    implements android.widget.AbsListView.OnScrollListener
{

    private final int a = 6;
    private final n b = new n();
    private final k c;
    private final l d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;

    public j(k k1, l l1)
    {
        i = true;
        c = k1;
        d = l1;
    }

    private void a(int i1, boolean flag)
    {
        if (i != flag)
        {
            i = flag;
            for (int j1 = 0; j1 < a; j1++)
            {
                com.bumptech.glide.h.a(b.a(0, 0));
            }

        }
        int k1;
        int l1;
        int i2;
        if (flag)
        {
            k1 = a;
        } else
        {
            k1 = -a;
        }
        k1 = i1 + k1;
        if (i1 < k1)
        {
            l1 = Math.max(e, i1);
            i2 = k1;
        } else
        {
            i2 = Math.min(f, i1);
            l1 = k1;
        }
        i2 = Math.min(h, i2);
        l1 = Math.min(h, Math.max(0, l1));
        if (i1 < k1)
        {
            for (i1 = l1; i1 < i2; i1++)
            {
                a(c.c(i1), true);
            }

        } else
        {
            for (i1 = i2 - 1; i1 >= l1; i1--)
            {
                a(c.c(i1), false);
            }

        }
        f = l1;
        e = i2;
    }

    private void a(Object obj)
    {
        int ai[] = d.b();
        c.a(obj).a(b.a(ai[0], ai[1]));
    }

    private void a(List list, boolean flag)
    {
        int k1 = list.size();
        if (flag)
        {
            for (int i1 = 0; i1 < k1; i1++)
            {
                a(list.get(i1));
            }

        } else
        {
            for (int j1 = k1 - 1; j1 >= 0; j1--)
            {
                a(list.get(j1));
            }

        }
    }

    public final void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        h = k1;
        if (i1 <= g) goto _L2; else goto _L1
_L1:
        a(i1 + j1, true);
_L4:
        g = i1;
        return;
_L2:
        if (i1 < g)
        {
            a(i1, false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i1)
    {
    }
}
