// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.b;

import android.widget.AbsListView;

// Referenced classes of package com.facebook.widget.b:
//            b

class c
    implements android.widget.AbsListView.OnScrollListener
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        b.a(a, abslistview, i, j, k);
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        b.a(a, abslistview, i);
    }
}
