// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.search;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.servicemgr.SearchResults;
import com.netflix.mediaclient.ui.common.PlayContextImp;
import com.netflix.mediaclient.ui.kids.search.KidsSearchResultView;
import com.netflix.mediaclient.util.DeviceUtils;
import com.tonicartos.widget.stickygridheaders.StickyGridHeadersBaseAdapter;
import com.tonicartos.widget.stickygridheaders.StickyGridHeadersGridView;

// Referenced classes of package com.netflix.mediaclient.ui.search:
//            SearchResultView

public class SearchResultsFrag extends NetflixFrag
{
    private class SearchResultsAdapter extends BaseAdapter
        implements android.widget.AdapterView.OnItemClickListener, StickyGridHeadersBaseAdapter
    {

        private final View DUMMY_VIEW;
        final SearchResultsFrag this$0;

        public int getCount()
        {
            if (results == null)
            {
                return 0;
            } else
            {
                return results.getNumResults();
            }
        }

        public int getCountForHeader(int i)
        {
            if (results == null)
            {
                return 0;
            } else
            {
                return results.getNumResultsForSection(i);
            }
        }

        public View getHeaderView(int i, View view, ViewGroup viewgroup)
        {
            if (results == null)
            {
                return DUMMY_VIEW;
            }
            viewgroup = view;
            if (view == null)
            {
                viewgroup = getActivity().getLayoutInflater().inflate(0x7f030079, null);
            }
            ((TextView)viewgroup.findViewById(0x7f070196)).setText(results.getSectionTitle(getActivity(), i));
            return viewgroup;
        }

        public Object getItem(int i)
        {
            if (results == null)
            {
                return null;
            } else
            {
                return results.getResult(i);
            }
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public int getNumHeaders()
        {
            while (getNetflixActivity().isForKids() || results == null) 
            {
                return 0;
            }
            return results.getNumSections();
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
            view = new PlayContextImp(results, i);
            ((SearchResultView)viewgroup).update(getItem(i), view);
            return viewgroup;
        }

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            view.performClick();
        }

        public SearchResultsAdapter()
        {
            this$0 = SearchResultsFrag.this;
            super();
            DUMMY_VIEW = new TextView(getActivity());
        }
    }


    private static final String TAG = "SearchResultsFrag";
    private static final SparseArray numColsTable;
    private SearchResultsAdapter adapter;
    private StickyGridHeadersGridView gridView;
    private SearchResults results;

    public SearchResultsFrag()
    {
    }

    public static SearchResultsFrag create()
    {
        return new SearchResultsFrag();
    }

    public boolean isLoadingData()
    {
        return false;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030078, null);
        adapter = new SearchResultsAdapter();
        gridView = (StickyGridHeadersGridView)layoutinflater.findViewById(0x7f070195);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(adapter);
        gridView.setAreHeadersSticky(false);
        int i = DeviceUtils.getBasicScreenOrientation(getActivity());
        int j = DeviceUtils.getScreenSizeCategory(getActivity());
        gridView.setNumColumns(((SparseIntArray)numColsTable.get(i)).get(j));
        return layoutinflater;
    }

    public void update(SearchResults searchresults)
    {
        Log.v("SearchResultsFrag", "Updating...");
        results = searchresults;
        adapter.notifyDataSetChanged();
        gridView.smoothScrollToPosition(0);
    }

    static 
    {
        numColsTable = new SparseArray(2);
        SparseIntArray sparseintarray = new SparseIntArray();
        sparseintarray.put(1, 1);
        sparseintarray.put(2, 1);
        sparseintarray.put(3, 2);
        sparseintarray.put(4, 2);
        numColsTable.put(1, sparseintarray);
        sparseintarray = new SparseIntArray();
        sparseintarray.put(1, 2);
        sparseintarray.put(2, 2);
        sparseintarray.put(3, 3);
        sparseintarray.put(4, 3);
        numColsTable.put(2, sparseintarray);
    }

}
