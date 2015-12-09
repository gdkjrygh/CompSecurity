// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import com.jcp.adapters.bn;
import java.util.List;

// Referenced classes of package com.jcp.views:
//            x, y, z

public class PagingListView extends ListView
{

    private boolean a;
    private boolean b;
    private z c;
    private x d;
    private android.widget.AbsListView.OnScrollListener e;

    public PagingListView(Context context)
    {
        super(context);
        a();
    }

    public PagingListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public PagingListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    static android.widget.AbsListView.OnScrollListener a(PagingListView paginglistview)
    {
        return paginglistview.e;
    }

    private void a()
    {
        a = false;
        d = new x(getContext());
        addFooterView(d);
        super.setOnScrollListener(new y(this));
    }

    static boolean a(PagingListView paginglistview, boolean flag)
    {
        paginglistview.a = flag;
        return flag;
    }

    static boolean b(PagingListView paginglistview)
    {
        return paginglistview.a;
    }

    static boolean c(PagingListView paginglistview)
    {
        return paginglistview.b;
    }

    static z d(PagingListView paginglistview)
    {
        return paginglistview.c;
    }

    public void a(boolean flag, List list)
    {
        setHasMoreItems(flag);
        setIsLoading(false);
        if (list != null && list.size() > 0)
        {
            android.widget.ListAdapter listadapter = ((HeaderViewListAdapter)getAdapter()).getWrappedAdapter();
            if (listadapter instanceof bn)
            {
                ((bn)listadapter).a(list);
            }
        }
    }

    public void setHasMoreItems(boolean flag)
    {
        b = flag;
        if (!b)
        {
            removeFooterView(d);
        } else
        if (findViewById(0x7f0e0361) == null)
        {
            addFooterView(d);
            setAdapter(((HeaderViewListAdapter)getAdapter()).getWrappedAdapter());
            return;
        }
    }

    public void setIsLoading(boolean flag)
    {
        a = flag;
    }

    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        e = onscrolllistener;
    }

    public void setPagingableListener(z z)
    {
        c = z;
    }
}
