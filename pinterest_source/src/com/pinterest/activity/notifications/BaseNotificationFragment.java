// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.ListView;
import com.pinterest.activity.notifications.adapter.StoryAdapter;
import com.pinterest.activity.notifications.view.MaxWidthListView;
import com.pinterest.activity.task.fragment.ListFragment;
import com.pinterest.adapter.LoadMoreListener;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Model;
import com.pinterest.api.remote.BaseApi;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.grid.AdapterFooterView;
import java.util.List;

public abstract class BaseNotificationFragment extends ListFragment
    implements LoadMoreListener
{

    protected BaseApiResponseHandler _apiResponseHandler;
    private SwipeRefreshLayout _swipeVw;

    public BaseNotificationFragment()
    {
    }

    private void resetRefreshing()
    {
        _swipeVw.setRefreshing(false);
        _refreshing = false;
    }

    protected abstract StoryAdapter createAdapter();

    protected abstract BaseApiResponseHandler createResponseHandler();

    protected abstract int getEmptyMessageResourceId();

    protected void handleApiResponseOnFailure()
    {
        if (_adapter != null)
        {
            AdapterEmptyView.setState(_emptyView, 1);
        } else
        {
            AdapterEmptyView.setState(_emptyView, 2);
        }
        setEmptyContent(_adapter);
        resetRefreshing();
    }

    protected void handleApiResponseOnStart()
    {
        if (_adapter != null && ((StoryAdapter)_adapter).getCount() > 0)
        {
            AdapterFooterView adapterfooterview = _footerView;
            int i;
            if (_swipeVw.isRefreshing())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            AdapterFooterView.setState(adapterfooterview, i);
            AdapterEmptyView.setState(_emptyView, 2);
            return;
        } else
        {
            AdapterEmptyView.setState(_emptyView, 0);
            AdapterFooterView.setState(_footerView, 2);
            return;
        }
    }

    protected void handleApiResponseOnSuccess(Feed feed)
    {
        if (_adapter != null)
        {
            Object obj = feed;
            if (_swipeVw.isRefreshing())
            {
                obj = feed;
                if (!((StoryAdapter)_adapter).isEmpty())
                {
                    if (feed.getAbsCount() > 0)
                    {
                        obj = (String)feed.getIds().get(0);
                    } else
                    {
                        obj = "";
                    }
                    if (((String) (obj)).equals(((StoryAdapter)_adapter).getItem(0).getUid()))
                    {
                        obj = null;
                    } else
                    {
                        ((StoryAdapter)_adapter).setDataSource(null);
                        obj = feed;
                    }
                }
            }
            if (((StoryAdapter)_adapter).getCount() > 0)
            {
                ((StoryAdapter)_adapter).appendItems(((Feed) (obj)));
            } else
            {
                ((StoryAdapter)_adapter).setDataSource(((Feed) (obj)));
                AdapterEmptyView.setState(_emptyView, 1);
                onSetDataSource();
            }
            ((StoryAdapter)_adapter).finishedLoading();
        } else
        {
            AdapterEmptyView.setState(_emptyView, 2);
        }
        AdapterFooterView.setState(_footerView, 1);
        setEmptyContent(_adapter);
        resetRefreshing();
    }

    public void loadMore()
    {
        if (_adapter != null)
        {
            Object obj = ((StoryAdapter)_adapter).getDataSource();
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((Feed) (obj)).getNextUrl();
            }
            if (obj != null)
            {
                BaseApi.e(((String) (obj)), _apiResponseHandler, getApiTag());
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300b0;
        _adapter = createAdapter();
        ((StoryAdapter)_adapter).setListener(this);
        _apiResponseHandler = createResponseHandler();
    }

    public void onDestroyView()
    {
        ((StoryAdapter)_adapter).setListener(null);
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (_adapter != null && ((StoryAdapter)_adapter).getDataSource() != null)
        {
            ((StoryAdapter)_adapter).getDataSource().saveInstanceState(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onSetDataSource()
    {
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (bundle != null)
        {
            ((StoryAdapter)_adapter).setDataSource(Feed.restoreInstanceState(bundle));
        }
        _swipeVw = (SwipeRefreshLayout)view.findViewById(0x7f0f0204);
        _swipeVw.setOnRefreshListener(new _cls1());
        _emptyView.setRefreshAction(new _cls2());
        _footerView.setState(2);
        _listView = (MaxWidthListView)view.findViewById(0x7f0f020e);
        _listView.addHeaderView(new View(getActivity()));
        _listView.addFooterView(_footerView, null, false);
        _listView.setEmptyView(view.findViewById(0x7f0f020f));
        _listView.setAdapter(_adapter);
    }

    protected void updateEmptyContent()
    {
        _emptyLeftImage = 0x7f02020a;
        _emptyCenterImage = 0x7f020209;
        _emptyRightImage = 0x7f02020b;
        _emptyFanUtilParams = (new com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams()).setMode(com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams.Orientation.VERTICAL).setRotation(0.0F).setFanDistanceMultiplier(0.8F);
        _emptyMessage = Resources.string(getEmptyMessageResourceId());
    }



    private class _cls1
        implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
    {

        final BaseNotificationFragment this$0;

        public void onRefresh()
        {
            if (access$000)
            {
                _swipeVw.setRefreshing(false);
                return;
            } else
            {
                Pinalytics.a(EventType.PULL_TO_REFRESH, null);
                refresh();
                return;
            }
        }

        _cls1()
        {
            this$0 = BaseNotificationFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final BaseNotificationFragment this$0;

        public void onClick(View view)
        {
            refresh();
        }

        _cls2()
        {
            this$0 = BaseNotificationFragment.this;
            super();
        }
    }

}
