// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.emilsjolander.components.stickylistheaders;

import android.widget.AbsListView;

// Referenced classes of package com.emilsjolander.components.stickylistheaders:
//            StickyListHeadersListView

final class this._cls0
    implements android.widget.
{

    private StickyListHeadersListView this$0;

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (StickyListHeadersListView.access$200(StickyListHeadersListView.this) != null)
        {
            StickyListHeadersListView.access$200(StickyListHeadersListView.this).onScroll(abslistview, i, j, k);
        }
        if (android.os.ener.onScroll >= 8)
        {
            StickyListHeadersListView.access$300(StickyListHeadersListView.this, i);
        }
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (StickyListHeadersListView.access$200(StickyListHeadersListView.this) != null)
        {
            StickyListHeadersListView.access$200(StickyListHeadersListView.this).onScrollStateChanged(abslistview, i);
        }
    }

    ()
    {
        this$0 = StickyListHeadersListView.this;
        super();
    }
}
