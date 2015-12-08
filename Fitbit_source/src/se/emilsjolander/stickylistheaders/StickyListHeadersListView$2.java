// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.view.View;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            StickyListHeadersListView

class a
    implements android.view.ListHeadersListView._cls2
{

    final StickyListHeadersListView a;

    public void onClick(View view)
    {
        StickyListHeadersListView.d(a).a(a, StickyListHeadersListView.a(a), StickyListHeadersListView.b(a).intValue(), StickyListHeadersListView.c(a).longValue(), true);
    }

    (StickyListHeadersListView stickylistheaderslistview)
    {
        a = stickylistheaderslistview;
        super();
    }
}
