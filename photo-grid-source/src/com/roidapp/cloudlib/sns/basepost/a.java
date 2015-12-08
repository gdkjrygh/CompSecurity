// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ax;
import com.roidapp.baselib.c.y;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            PinnedListView2, b

final class a extends ax
{

    final PinnedListView2 a;

    a(PinnedListView2 pinnedlistview2)
    {
        a = pinnedlistview2;
        super();
    }

    public final void a(RecyclerView recyclerview, int i)
    {
    }

    public final void a(RecyclerView recyclerview, int i, int j)
    {
        recyclerview = (LinearLayoutManager)recyclerview.b();
        i = recyclerview.r();
        j = recyclerview.l();
        android.support.v7.widget.al al = a.a();
        if (al != null && i != 0)
        {
            if (!PinnedListView2.a(a))
            {
                PinnedListView2.a(a, j, j, i);
            }
            if (!PinnedListView2.b(a) && j == 4)
            {
                PinnedListView2.c(a);
                recyclerview = al;
                if (al instanceof y)
                {
                    recyclerview = ((y)al).d();
                }
                if (recyclerview != null)
                {
                    ((b)recyclerview).j_();
                    return;
                }
            }
        }
    }
}
