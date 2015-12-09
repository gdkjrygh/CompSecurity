// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.util.SparseIntArray;
import java.util.ArrayList;

// Referenced classes of package com.mobeta.android.dslv:
//            DragSortListView

private class d
{

    final DragSortListView a;
    private SparseIntArray b;
    private ArrayList c;
    private int d;

    public int a(int i)
    {
        return b.get(i, -1);
    }

    public void a()
    {
        b.clear();
        c.clear();
    }

    public void a(int i, int k)
    {
        int l = b.get(i, -1);
        if (l != k)
        {
            if (l == -1)
            {
                if (b.size() == d)
                {
                    b.delete(((Integer)c.remove(0)).intValue());
                }
            } else
            {
                c.remove(Integer.valueOf(i));
            }
            b.put(i, k);
            c.add(Integer.valueOf(i));
        }
    }

    public (DragSortListView dragsortlistview, int i)
    {
        a = dragsortlistview;
        super();
        b = new SparseIntArray(i);
        c = new ArrayList(i);
        d = i;
    }
}
