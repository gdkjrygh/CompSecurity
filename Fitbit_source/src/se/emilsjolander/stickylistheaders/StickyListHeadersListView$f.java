// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.widget.AbsListView;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            StickyListHeadersListView, j

private class <init>
    implements android.widget.
{

    final StickyListHeadersListView a;

    public void onScroll(AbsListView abslistview, int i, int k, int l)
    {
        if (StickyListHeadersListView.f(a) != null)
        {
            StickyListHeadersListView.f(a).onScroll(abslistview, i, k, l);
        }
        StickyListHeadersListView.a(a, StickyListHeadersListView.g(a).a());
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (StickyListHeadersListView.f(a) != null)
        {
            StickyListHeadersListView.f(a).onScrollStateChanged(abslistview, i);
        }
    }

    private (StickyListHeadersListView stickylistheaderslistview)
    {
        a = stickylistheaderslistview;
        super();
    }

    a(StickyListHeadersListView stickylistheaderslistview, a a1)
    {
        this(stickylistheaderslistview);
    }
}
