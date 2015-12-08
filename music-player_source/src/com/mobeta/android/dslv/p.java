// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.util.SparseIntArray;
import java.util.ArrayList;

// Referenced classes of package com.mobeta.android.dslv:
//            DragSortListView

final class p
{

    final DragSortListView a;
    private SparseIntArray b;
    private ArrayList c;
    private int d;

    public p(DragSortListView dragsortlistview)
    {
        a = dragsortlistview;
        super();
        b = new SparseIntArray(3);
        c = new ArrayList(3);
        d = 3;
    }

    public final int a(int i)
    {
        return b.get(i, -1);
    }

    public final void a()
    {
        b.clear();
        c.clear();
    }

    public final void a(int i, int j)
    {
        int k = b.get(i, -1);
        if (k != j)
        {
            if (k == -1)
            {
                if (b.size() == d)
                {
                    b.delete(((Integer)c.remove(0)).intValue());
                }
            } else
            {
                c.remove(Integer.valueOf(i));
            }
            b.put(i, j);
            c.add(Integer.valueOf(i));
        }
    }
}
