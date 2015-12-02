// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.animatablelistview;

import android.widget.AbsListView;

// Referenced classes of package com.facebook.widget.animatablelistview:
//            l

class n
    implements android.widget.AbsListView.OnScrollListener
{

    final l a;

    n(l l1)
    {
        a = l1;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        l.a(a, i);
    }
}
