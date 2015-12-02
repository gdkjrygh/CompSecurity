// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.animatablelistview;

import com.a.a.ak;
import com.a.a.ar;
import com.facebook.widget.listview.BetterListView;
import com.facebook.widget.listview.o;

// Referenced classes of package com.facebook.widget.animatablelistview:
//            m, n, d

public class l
{

    private final BetterListView a;
    private final d b;
    private final com.facebook.widget.listview.l c = new com.facebook.widget.listview.l();
    private int d;
    private final ar e = new m(this);
    private final android.widget.AbsListView.OnScrollListener f = new n(this);

    public l(BetterListView betterlistview, d d1)
    {
        d = 0;
        a = betterlistview;
        b = d1;
        b.a(e);
        betterlistview.a(f);
    }

    public static l a(BetterListView betterlistview, d d1)
    {
        return new l(betterlistview, d1);
    }

    private void a(int i)
    {
        d = i;
    }

    private void a(ak ak)
    {
        if (d == 0 && c.a(a) == o.BOTTOM)
        {
            a.setSelection(a.getCount() - 1);
        }
    }

    static void a(l l1, int i)
    {
        l1.a(i);
    }

    static void a(l l1, ak ak)
    {
        l1.a(ak);
    }
}
