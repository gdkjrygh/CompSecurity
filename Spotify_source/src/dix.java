// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.android.paste.widget.prettylist.HidingHeaderListView;
import com.spotify.android.paste.widget.prettylist.StickyListView;

public final class dix extends HidingHeaderListView
{

    private StickyListView b;

    public dix(StickyListView stickylistview, Context context, AttributeSet attributeset, int i)
    {
        b = stickylistview;
        super(context, attributeset, i);
        super.setOnScrollListener(StickyListView.d(stickylistview));
    }

    public final void setOnScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        StickyListView.d(b).a = onscrolllistener;
    }
}
