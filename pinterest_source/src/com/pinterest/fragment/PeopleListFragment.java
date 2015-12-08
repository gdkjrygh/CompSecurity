// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.pinterest.activity.task.fragment.ListFragment;
import com.pinterest.adapter.PeopleListAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.UserFeed;
import com.pinterest.api.remote.BaseApi;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.grid.AdapterFooterView;

public class PeopleListFragment extends ListFragment
{

    protected ApiResponseHandler onLoadMore;
    private com.pinterest.adapter.PeopleListAdapter.PeopleListListener peopleListListener;
    protected android.view.View.OnClickListener refreshListener;

    public PeopleListFragment()
    {
        refreshListener = new _cls1();
        peopleListListener = new _cls2();
        onLoadMore = new _cls3();
    }

    private void loadMore()
    {
        if (_adapter != null && ((PeopleListAdapter)_adapter).getDataSource() != null && ((PeopleListAdapter)_adapter).getDataSource().getNextUrl() != null)
        {
            BaseApi.e(((PeopleListAdapter)_adapter).getDataSource().getNextUrl(), onLoadMore, getApiTag());
        }
    }

    protected void initializeListView()
    {
        _emptyView = (AdapterEmptyView)getView().findViewById(0x7f0f0210);
        _emptyView.setState(0);
        _emptyView.setRefreshAction(refreshListener);
        View view = LayoutInflater.from(getActivity()).inflate(0x7f030175, null);
        _footerView = (AdapterFooterView)view.findViewById(0x7f0f01fd);
        _listView.addFooterView(view);
        _listView.setOnItemClickListener(((PeopleListAdapter)_adapter).onItemClick);
        _listView.setEmptyView(getView().findViewById(0x7f0f020f));
        _listView.setAdapter(_adapter);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _adapter = new PeopleListAdapter(getActivity());
        ((PeopleListAdapter)_adapter).setApiTag(getApiTag());
        ((PeopleListAdapter)_adapter).setListener(peopleListListener);
        if (bundle != null)
        {
            bundle = (UserFeed)Feed.restoreInstanceState(bundle);
            if (bundle != null)
            {
                ((PeopleListAdapter)_adapter).setDataSource(bundle);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        _listView = (ListView)layoutinflater.findViewById(0x7f0f0128);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        _emptyView = null;
        _listView = null;
        super.onDestroyView();
    }

    protected void onLoadFailed(Throwable throwable, ApiResponse apiresponse)
    {
        _refreshing = false;
        if (_emptyView == null)
        {
            return;
        }
        if (NetworkUtils.getInstance().hasInternet() && apiresponse != null)
        {
            _emptyView.setMessage(apiresponse.getMessageDetailIfExist());
        } else
        {
            AdapterEmptyView.setState(_emptyView, 1);
        }
        setEmptyContent(_adapter);
    }

    public void onPeopleLoaded(UserFeed userfeed)
    {
        _refreshing = false;
        AdapterEmptyView.setState(_emptyView, 2);
        AdapterFooterView.setState(_footerView, 1);
        if (_adapter != null)
        {
            if (((PeopleListAdapter)_adapter).getCount() == 0)
            {
                ((PeopleListAdapter)_adapter).setDataSource(postProcess(userfeed));
            } else
            {
                ((PeopleListAdapter)_adapter).appendItems(postProcess(userfeed));
                ((PeopleListAdapter)_adapter).notifyDataSetChanged();
            }
            if (((PeopleListAdapter)_adapter).getCount() == 0)
            {
                AdapterEmptyView.setState(_emptyView, 1);
            } else
            {
                AdapterEmptyView.setState(_emptyView, 2);
            }
        }
        setEmptyContent(_adapter);
    }

    public void onResume()
    {
        super.onResume();
        if (_adapter != null)
        {
            UserFeed userfeed = ((PeopleListAdapter)_adapter).getDataSource();
            if (userfeed != null)
            {
                userfeed.onStart();
            }
            ((PeopleListAdapter)_adapter).notifyDataSetChanged();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (_adapter != null)
        {
            UserFeed userfeed = ((PeopleListAdapter)_adapter).getDataSource();
            if (userfeed != null)
            {
                userfeed.saveInstanceState(bundle);
            }
        }
        super.onSaveInstanceState(bundle);
    }

    public void onStop()
    {
        if (_adapter != null)
        {
            UserFeed userfeed = ((PeopleListAdapter)_adapter).getDataSource();
            if (userfeed != null)
            {
                userfeed.onStop();
            }
        }
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        initializeListView();
    }

    protected UserFeed postProcess(UserFeed userfeed)
    {
        return userfeed;
    }






    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PeopleListFragment this$0;

        public void onClick(View view)
        {
            refresh();
        }

        _cls1()
        {
            this$0 = PeopleListFragment.this;
            super();
        }
    }


    private class _cls2
        implements com.pinterest.adapter.PeopleListAdapter.PeopleListListener
    {

        final PeopleListFragment this$0;

        public void loadMore()
        {
            PeopleListFragment.this.loadMore();
        }

        _cls2()
        {
            this$0 = PeopleListFragment.this;
            super();
        }
    }


    private class _cls3 extends com.pinterest.api.remote.UserApi.UserFeedApiResponse
    {

        final PeopleListFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            onLoadFailed(throwable, apiresponse);
        }

        public void onFinish()
        {
            AdapterFooterView.setState(, 1);
            if (access$100 != null)
            {
                ((PeopleListAdapter)access$100).finishedLoading();
            }
        }

        public void onStart()
        {
            AdapterFooterView.setState(, 0);
        }

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            onPeopleLoaded((UserFeed)feed);
        }

        _cls3()
        {
            this$0 = PeopleListFragment.this;
            super();
        }
    }

}
