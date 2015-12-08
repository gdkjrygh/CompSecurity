// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.pinterest.activity.search.SearchNagView;
import com.pinterest.adapter.PeopleListAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.UserFeed;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.fragment.PeopleListFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.grid.AdapterEmptyView;
import org.apache.commons.lang3.StringUtils;

public class GuidedPeopleSearchFragment extends PeopleListFragment
{

    View _emptyWrapper;
    private String _lastQuery;
    protected SearchNagView _nagView;
    protected SearchNagView _nagVwEmpty;
    private com.pinterest.api.remote.UserApi.UserFeedApiResponse onSearch;

    public GuidedPeopleSearchFragment()
    {
        onSearch = new _cls1();
    }

    private void emptyFeed()
    {
        if (_adapter != null)
        {
            ((PeopleListAdapter)_adapter).setDataSource(new UserFeed());
        }
    }

    protected void loadData()
    {
        if (_lastQuery != null)
        {
            SearchApi.a(_lastQuery, onSearch, getApiTag());
        }
        super.loadData();
    }

    protected void onActivate()
    {
        super.onActivate();
        loadData();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300ee;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = LayoutInflater.from(getActivity()).inflate(0x7f0301eb, null);
        _nagView = (SearchNagView)viewgroup.findViewById(0x7f0f04ab);
        _nagVwEmpty = (SearchNagView)layoutinflater.findViewById(0x7f0f02a0);
        _listView.addHeaderView(viewgroup);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        ButterKnife.a(this);
        _nagView = null;
        _nagVwEmpty = null;
        if (_adapter != null)
        {
            ((PeopleListAdapter)_adapter).setDataSource(null);
        }
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        ButterKnife.a(this, view);
        super.onViewCreated(view, bundle);
        showSearchNag(((PeopleListAdapter)_adapter).getDataSource());
        _listView.setEmptyView(_emptyWrapper);
        loadData();
    }

    public void reload(String s)
    {
        while (getView() == null || s.equalsIgnoreCase(_lastQuery)) 
        {
            return;
        }
        _lastQuery = s;
        if (StringUtils.isEmpty(s))
        {
            emptyFeed();
            AdapterEmptyView.setState(_emptyView, 2);
            return;
        } else
        {
            AdapterEmptyView.setState(_emptyView, 0);
            SearchApi.a(s, onSearch, getApiTag());
            return;
        }
    }

    public void setLastQuery(String s)
    {
        _lastQuery = s;
    }

    protected void showSearchNag(Feed feed)
    {
label0:
        {
            if (feed != null)
            {
                if (feed.getCount() <= 0)
                {
                    break label0;
                }
                SearchNagView.showSearchNag(_nagView, feed);
            }
            return;
        }
        SearchNagView.showSearchNag(_nagVwEmpty, feed);
    }

    protected void updateEmptyContent()
    {
        _emptyLeftImage = 0x7f02020c;
        _emptyCenterImage = 0x7f02020d;
        _emptyRightImage = 0x7f02020e;
        _emptyMessage = Resources.string(0x7f070272, new Object[] {
            _lastQuery
        });
    }






    private class _cls1 extends com.pinterest.api.remote.UserApi.UserFeedApiResponse
    {

        final GuidedPeopleSearchFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            onLoadFailed(throwable, apiresponse);
        }

        public void onFinish()
        {
            ((PeopleListAdapter)access$100).finishedLoading();
        }

        public void onStart()
        {
            emptyFeed();
            AdapterEmptyView.setState(
// JavaClassFileOutputException: get_constant: invalid tag

        public void onSuccess(Feed feed)
        {
            onSuccess(feed);
            HashMap hashmap = new HashMap();
            hashmap.put("query", _lastQuery);
            Pinalytics.a(EventType.SEARCH_USERS, null, hashmap);
            onPeopleLoaded((UserFeed)feed);
        }

        _cls1()
        {
            this$0 = GuidedPeopleSearchFragment.this;
            super();
        }
    }

}
