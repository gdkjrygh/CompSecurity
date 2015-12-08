// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit;

import android.widget.AbsListView;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit:
//            LoadableListView

public static class b
    implements android.widget.lListener
{

    public final android.widget.lListener a;
    public final LoadableListView b;
    private final crollListener c;
    private final float d;

    public boolean a()
    {
        return atus.c == c.b();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
label0:
        {
            if (a != null)
            {
                a.onScroll(abslistview, i, j, k);
            }
            if (!abslistview.isStackFromBottom())
            {
                i = k - (i + j);
            }
            com.fitbit.e.a.b(LoadableListView.c(), "Found %s items left of %s", new Object[] {
                Integer.valueOf(i), Integer.valueOf(k)
            });
            if (i <= Math.min(1, (int)Math.rint((float)k * d)))
            {
                com.fitbit.e.a.a(LoadableListView.c(), "Load needed from adapter", new Object[0]);
                abslistview = c.a();
                if (abslistview != atus.c)
                {
                    break label0;
                }
                com.fitbit.e.a.a(LoadableListView.c(), "Adapter claims to be complete, resetting old scroll listener", new Object[0]);
                com.fitbit.LoadableListView.a(b, a);
            }
            return;
        }
        com.fitbit.e.a.a(LoadableListView.c(), "Adapter claims to be %s", new Object[] {
            abslistview
        });
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (a != null)
        {
            a.onScrollStateChanged(abslistview, i);
        }
    }

    public crollListener(android.widget.lListener llistener, crollListener crolllistener, float f, LoadableListView loadablelistview)
    {
        c = crolllistener;
        d = f;
        a = llistener;
        b = loadablelistview;
    }
}
