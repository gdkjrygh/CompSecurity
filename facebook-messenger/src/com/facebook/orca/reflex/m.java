// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.reflex;

import android.widget.AbsListView;
import com.facebook.orca.threadlist.i;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.reflex:
//            k

class m
    implements android.widget.AbsListView.OnScrollListener
{

    final k a;

    m(k k1)
    {
        a = k1;
        super();
    }

    public void onScroll(AbsListView abslistview, int j, int l, int i1)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int j)
    {
        Preconditions.checkNotNull(k.a(a));
        k.a(a).a(abslistview, j);
    }
}
