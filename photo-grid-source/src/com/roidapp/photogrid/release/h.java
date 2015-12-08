// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.AbsListView;

// Referenced classes of package com.roidapp.photogrid.release:
//            c

final class h
    implements android.widget.AbsListView.OnScrollListener
{

    int a;
    final c b;

    h(c c1)
    {
        b = c1;
        super();
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        a = i + j;
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (c.g(b) != null);
    }
}
