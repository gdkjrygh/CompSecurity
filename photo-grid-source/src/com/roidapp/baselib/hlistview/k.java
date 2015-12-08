// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.widget.ListAdapter;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            p, AbsHListView

final class k extends p
    implements Runnable
{

    int a;
    final AbsHListView b;

    private k(AbsHListView abshlistview)
    {
        b = abshlistview;
        super(abshlistview, (byte)0);
    }

    k(AbsHListView abshlistview, byte byte0)
    {
        this(abshlistview);
    }

    public final void run()
    {
        if (!b.aj)
        {
            ListAdapter listadapter = b.j;
            int i = a;
            if (listadapter != null && b.ao > 0 && i != -1 && i < listadapter.getCount() && b())
            {
                android.view.View view = b.getChildAt(i - b.V);
                if (view != null)
                {
                    b.a(view, i, listadapter.getItemId(i));
                    return;
                }
            }
        }
    }
}
