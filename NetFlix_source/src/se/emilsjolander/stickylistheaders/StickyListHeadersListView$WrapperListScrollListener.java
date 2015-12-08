// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.widget.AbsListView;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            StickyListHeadersListView, WrapperViewList

private class <init>
    implements android.widget.rListScrollListener
{

    final StickyListHeadersListView this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (StickyListHeadersListView.access$700(StickyListHeadersListView.this) != null)
        {
            StickyListHeadersListView.access$700(StickyListHeadersListView.this)._mth0(abslistview, i, j, k);
        }
        StickyListHeadersListView.access$900(StickyListHeadersListView.this, StickyListHeadersListView.access$800(StickyListHeadersListView.this).getFixedFirstVisibleItem());
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (StickyListHeadersListView.access$700(StickyListHeadersListView.this) != null)
        {
            StickyListHeadersListView.access$700(StickyListHeadersListView.this)._mth0(abslistview, i);
        }
    }

    private ()
    {
        this$0 = StickyListHeadersListView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
