// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.util.Pair;
import android.view.ViewGroup;
import com.skype.android.app.data.DataAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.search:
//            SearchResultAdapter

public class SearchMultipleSourceAdapter extends DataAdapter
{
    private final class a extends android.support.v7.widget.RecyclerView.c
    {

        final SearchMultipleSourceAdapter this$0;

        public final void onChanged()
        {
            notifyDataSetChanged();
        }

        private a()
        {
            this$0 = SearchMultipleSourceAdapter.this;
            super();
        }

    }


    private static final int MAX_VIEWTYPES_BY_CHILD = 10;
    private List adapters;

    public SearchMultipleSourceAdapter()
    {
        adapters = new ArrayList();
    }

    private Pair getAdapterAndPosition(int i)
    {
        for (Iterator iterator = adapters.iterator(); iterator.hasNext();)
        {
            SearchResultAdapter searchresultadapter = (SearchResultAdapter)iterator.next();
            int j = searchresultadapter.getVisibleViewsCount();
            if (i < j)
            {
                return new Pair(searchresultadapter, Integer.valueOf(i));
            }
            i -= j;
        }

        return null;
    }

    public void addAdapter(SearchResultAdapter searchresultadapter)
    {
        adapters.add(searchresultadapter);
        searchresultadapter.registerAdapterDataObserver(new a());
    }

    public void clear()
    {
        adapters.clear();
        super.clear();
    }

    public int getItemCount()
    {
        int i = 0;
        for (Iterator iterator = adapters.iterator(); iterator.hasNext();)
        {
            i += ((SearchResultAdapter)iterator.next()).getVisibleViewsCount();
        }

        return i;
    }

    public int getItemViewType(int i)
    {
        Pair pair = getAdapterAndPosition(i);
        i = adapters.indexOf(pair.first);
        return ((SearchResultAdapter)pair.first).getItemViewType(((Integer)pair.second).intValue()) + i * 10;
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.v v, int i)
    {
        onBindViewHolder((com.skype.android.app.data.DataAdapter.ItemViewHolder)v, i);
    }

    public void onBindViewHolder(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder, int i)
    {
        Pair pair = getAdapterAndPosition(i);
        ((SearchResultAdapter)pair.first).onBindViewHolder(itemviewholder, ((Integer)pair.second).intValue());
    }

    public volatile android.support.v7.widget.RecyclerView.v onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        int j = i / 10;
        return ((SearchResultAdapter)adapters.get(j)).onCreateViewHolder(viewgroup, i % 10);
    }
}
