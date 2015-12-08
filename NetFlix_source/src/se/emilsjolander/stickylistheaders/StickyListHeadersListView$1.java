// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.view.View;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            StickyListHeadersListView

class this._cls0
    implements android.view.ListHeadersListView._cls1
{

    final StickyListHeadersListView this$0;

    public void onClick(View view)
    {
        if (StickyListHeadersListView.access$200(StickyListHeadersListView.this) != null)
        {
            StickyListHeadersListView.access$200(StickyListHeadersListView.this).onHeaderClick(StickyListHeadersListView.this, StickyListHeadersListView.access$300(StickyListHeadersListView.this), StickyListHeadersListView.access$400(StickyListHeadersListView.this).intValue(), StickyListHeadersListView.access$500(StickyListHeadersListView.this).longValue(), true);
        }
    }

    HeaderClickListener()
    {
        this$0 = StickyListHeadersListView.this;
        super();
    }
}
