// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            ModelAdapter

public abstract class PaginatedAdapter extends ModelAdapter
{

    private int page;

    public PaginatedAdapter(Context context, int i, List list)
    {
        super(context, i, list);
        page = 1;
    }

    protected List getObjects()
    {
        if (shouldShowSearchResults())
        {
            return searchResults;
        } else
        {
            return objects;
        }
    }

    protected abstract int getTotalNumberOfObjects();

    public void loadMore()
    {
        if (loading || searchActive || objects.size() == getTotalNumberOfObjects())
        {
            return;
        } else
        {
            loading = true;
            notifyDataSetChanged();
            loadPage(page, new _cls1(context));
            return;
        }
    }

    public void reload()
    {
        if (loading)
        {
            return;
        } else
        {
            page = 1;
            objects = new ArrayList();
            loadMore();
            return;
        }
    }


/*
    static int access$012(PaginatedAdapter paginatedadapter, int i)
    {
        i = paginatedadapter.page + i;
        paginatedadapter.page = i;
        return i;
    }

*/

    /* member class not found */
    class _cls1 {}

}
