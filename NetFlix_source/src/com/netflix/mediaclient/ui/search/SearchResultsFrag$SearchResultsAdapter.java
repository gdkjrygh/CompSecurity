// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.search;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.SearchResults;
import com.netflix.mediaclient.ui.common.PlayContextImp;
import com.netflix.mediaclient.ui.kids.search.KidsSearchResultView;
import com.tonicartos.widget.stickygridheaders.StickyGridHeadersBaseAdapter;

// Referenced classes of package com.netflix.mediaclient.ui.search:
//            SearchResultsFrag, SearchResultView

private class DUMMY_VIEW extends BaseAdapter
    implements android.widget.archResultsAdapter, StickyGridHeadersBaseAdapter
{

    private final View DUMMY_VIEW;
    final SearchResultsFrag this$0;

    public int getCount()
    {
        if (SearchResultsFrag.access$000(SearchResultsFrag.this) == null)
        {
            return 0;
        } else
        {
            return SearchResultsFrag.access$000(SearchResultsFrag.this).getNumResults();
        }
    }

    public int getCountForHeader(int i)
    {
        if (SearchResultsFrag.access$000(SearchResultsFrag.this) == null)
        {
            return 0;
        } else
        {
            return SearchResultsFrag.access$000(SearchResultsFrag.this).getNumResultsForSection(i);
        }
    }

    public View getHeaderView(int i, View view, ViewGroup viewgroup)
    {
        if (SearchResultsFrag.access$000(SearchResultsFrag.this) == null)
        {
            return DUMMY_VIEW;
        }
        viewgroup = view;
        if (view == null)
        {
            viewgroup = getActivity().getLayoutInflater().inflate(0x7f030079, null);
        }
        ((TextView)viewgroup.findViewById(0x7f070196)).setText(SearchResultsFrag.access$000(SearchResultsFrag.this).getSectionTitle(getActivity(), i));
        return viewgroup;
    }

    public Object getItem(int i)
    {
        if (SearchResultsFrag.access$000(SearchResultsFrag.this) == null)
        {
            return null;
        } else
        {
            return SearchResultsFrag.access$000(SearchResultsFrag.this).getResult(i);
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getNumHeaders()
    {
        while (getNetflixActivity().isForKids() || SearchResultsFrag.access$000(SearchResultsFrag.this) == null) 
        {
            return 0;
        }
        return SearchResultsFrag.access$000(SearchResultsFrag.this).getNumSections();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
label0:
        {
            if (view != null)
            {
                viewgroup = view;
                if (view instanceof SearchResultView)
                {
                    break label0;
                }
            }
            view = (NetflixActivity)getActivity();
            if (view.isForKids())
            {
                viewgroup = new KidsSearchResultView(view);
            } else
            {
                viewgroup = new SearchResultView(view);
            }
        }
        view = new PlayContextImp(SearchResultsFrag.access$000(SearchResultsFrag.this), i);
        ((SearchResultView)viewgroup).update(getItem(i), view);
        return viewgroup;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        view.performClick();
    }

    public ()
    {
        this$0 = SearchResultsFrag.this;
        super();
        DUMMY_VIEW = new TextView(getActivity());
    }
}
