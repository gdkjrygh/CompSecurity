// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.pinterest.activity.notifications.adapter.ConversationListAdapter;
import com.pinterest.activity.notifications.view.MaxWidthListView;
import com.pinterest.activity.task.fragment.ListFragment;
import com.pinterest.adapter.LoadMoreListener;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.BaseApi;
import com.pinterest.api.remote.ConversationApi;
import com.pinterest.base.Events;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.experience.Experiences;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.grid.AdapterFooterView;
import com.pinterest.ui.megaphone.MegaphoneView;
import com.pinterest.ui.megaphone.NagUtils;

public class ConversationListFragment extends ListFragment
    implements LoadMoreListener
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private BackgroundTask _fetchLocalDataTask;
    private Handler _handler;
    private BaseApiResponseHandler _onConversationNextPageLoaded;
    private BaseApiResponseHandler _onConversationsLoaded;

    public ConversationListFragment()
    {
        _fetchLocalDataTask = new _cls4();
        _onConversationsLoaded = new _cls5();
        _onConversationNextPageLoaded = new _cls6();
        _eventsSubscriber = new _cls7();
    }

    protected void loadData()
    {
        super.loadData();
        AdapterEmptyView.setState(_emptyView, 0);
        ConversationApi.a(_onConversationsLoaded, getApiTag());
        _handler.postDelayed(new _cls2(), 1000L);
    }

    public void loadMore()
    {
label0:
        {
            if (_adapter != null)
            {
                Object obj = ((ConversationListAdapter)_adapter).getDataSource();
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((Feed) (obj)).getNextUrl();
                }
                if (obj == null)
                {
                    break label0;
                }
                BaseApi.e(((String) (obj)), _onConversationNextPageLoaded, getApiTag());
            }
            return;
        }
        ((ConversationListAdapter)_adapter).finishedLoading();
    }

    protected void onActivate()
    {
        super.onActivate();
        if (!isNagShown() && isDataNonEmpty())
        {
            NagUtils.showNag(getPlacementId(), new NagEvent(null), 0x7f060001);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300b0;
        _placementId = Experiences.f;
        _adapter = new ConversationListAdapter(getActivity());
        ((ConversationListAdapter)_adapter).setListener(this);
        _handler = new Handler();
    }

    public void onDestroy()
    {
        super.onDestroy();
        _handler.removeCallbacksAndMessages(null);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        Events.unregister(_eventsSubscriber);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _emptyView = (AdapterEmptyView)view.findViewById(0x7f0f0210);
        _emptyView.setRefreshAction(new _cls1());
        _footerView = new AdapterFooterView(view.getContext());
        _footerView.setState(2);
        _listView = (MaxWidthListView)view.findViewById(0x7f0f020e);
        _listView.addHeaderView(new View(getActivity()));
        _listView.addFooterView(_footerView, null, false);
        _listView.setEmptyView(view.findViewById(0x7f0f020f));
        _listView.setAdapter(_adapter);
        Events.register(_eventsSubscriber, com/pinterest/api/model/Conversation$UpdateEvent, new Class[] {
            com/pinterest/api/model/Conversation$HideEvent, com/pinterest/activity/notifications/ConversationListFragment$NagEvent
        });
        (new ClearNotificationBadgeCountTask(null)).execute();
    }

    protected void updateEmptyContent()
    {
        _emptyLeftImage = 0x7f020256;
        _emptyRightImage = 0x7f020257;
        if (getView() != null)
        {
            _emptyFanUtilParams = (new com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams()).setFanDistanceMultiplier(0.25F).setLeftPivotPoint(com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams.PivotPoint.BOTTOM_LEFT).setRightPivotPoint(com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams.PivotPoint.BOTTOM_RIGHT).setFanDistanceReference(com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams.ReferenceView.LEFT).setSideAlpha(1.0F).setRotation(-6F);
        }
        _emptyAction = new _cls3();
        _emptyActionLabel = Resources.string(0x7f070257);
        _emptyMessage = Resources.string(0x7f070258);
    }

























/*
    static MegaphoneView access$3102(ConversationListFragment conversationlistfragment, MegaphoneView megaphoneview)
    {
        conversationlistfragment._nagView = megaphoneview;
        return megaphoneview;
    }

*/










    private class _cls4 extends BackgroundTask
    {

        public ConversationFeed _feed;
        final ConversationListFragment this$0;

        public void onFinish()
        {
            if (_feed != null && _feed.getCount() > 0)
            {
                ((ConversationListAdapter)isActive).setDataSource(_feed);
                AdapterEmptyView.setState(
// JavaClassFileOutputException: get_constant: invalid tag

        public void run()
        {
            _feed = new ConversationFeed(ModelHelper.getRecentConversations());
        }

        _cls4()
        {
            this$0 = ConversationListFragment.this;
            super();
        }
    }


    private class _cls5 extends ApiResponseHandler
    {

        final ConversationListFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            onFailure(throwable, apiresponse);
            ((ConversationListAdapter)
// JavaClassFileOutputException: get_constant: invalid tag

        public void onSuccess(ApiResponse apiresponse)
        {
            Object obj;
            onSuccess(apiresponse);
            obj = apiresponse.getData();
            if (!(obj instanceof PinterestJsonArray)) goto _L2; else goto _L1
_L1:
            obj = new ConversationFeed((PinterestJsonArray)obj, getBaseUrl());
            ((ConversationFeed) (obj)).setBookmark(apiresponse.getBookmark());
            if (
// JavaClassFileOutputException: get_constant: invalid tag

        _cls5()
        {
            this$0 = ConversationListFragment.this;
            super();
        }
    }


    private class _cls6 extends ApiResponseHandler
    {

        final ConversationListFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            onFailure(throwable, apiresponse);
            ((ConversationListAdapter)setState).finishedLoading();
            AdapterFooterView.setState(getData, 1);
        }

        public void onStart()
        {
            super.onStart();
            AdapterEmptyView.setState(getBaseUrl, 2);
            AdapterFooterView.setState(getData, 0);
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            apiresponse = ((ApiResponse) (apiresponse.getData()));
            if (apiresponse instanceof PinterestJsonArray)
            {
                apiresponse = new ConversationFeed((PinterestJsonArray)apiresponse, getBaseUrl());
                if (setState != null)
                {
                    ((ConversationListAdapter)setState).getDataSource().appendItems(apiresponse);
                    ((ConversationListAdapter)setState).finishedLoading();
                }
                AdapterFooterView.setState(getData, 1);
            }
        }

        _cls6()
        {
            this$0 = ConversationListFragment.this;
            super();
        }
    }


    private class _cls7
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final ConversationListFragment this$0;

        public void onEventMainThread(NagEvent nagevent)
        {
            PLog.info("ConversationListFragment.NagEvent", new Object[0]);
            if ( == null)
            {
                ((MegaphoneView)ViewHelper.viewById(getActivity(), 0x7f03017d)). = nagevent;
                .setListViewParent(
// JavaClassFileOutputException: get_constant: invalid tag

        public void onEventMainThread(com.pinterest.api.model.Conversation.HideEvent hideevent)
        {
            if (isActive() && hideevent.getConversation() != null)
            {
                ConversationFeed conversationfeed = ((ConversationListAdapter)access$3300).getDataSource();
                conversationfeed.removeItem(hideevent.getConversation());
                ((ConversationListAdapter)access$3300).setDataSource(conversationfeed);
                if (((ConversationListAdapter)access$3300).isEmpty())
                {
                    AdapterEmptyView.setState(
// JavaClassFileOutputException: get_constant: invalid tag

        public void onEventMainThread(com.pinterest.api.model.Conversation.UpdateEvent updateevent)
        {
            if (isActive() && updateevent.getConversation() != null)
            {
                _fetchLocalDataTask.execute();
            }
        }

        _cls7()
        {
            this$0 = ConversationListFragment.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final ConversationListFragment this$0;

        public void run()
        {
            _fetchLocalDataTask.execute();
        }

        _cls2()
        {
            this$0 = ConversationListFragment.this;
            super();
        }
    }


    private class NagEvent extends BaseNagEvent
    {

        private NagEvent()
        {
        }

        NagEvent(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ConversationListFragment this$0;

        public void onClick(View view)
        {
            refresh();
        }

        _cls1()
        {
            this$0 = ConversationListFragment.this;
            super();
        }
    }


    private class ClearNotificationBadgeCountTask extends BackgroundTask
    {

        final ConversationListFragment this$0;

        public void onFinish()
        {
            onFinish();
            NotificationCount.setUnseenConversationCount(0);
        }

        public void run()
        {
            ConversationApi.b(new ApiResponseHandler(), getApiTag());
        }

        private ClearNotificationBadgeCountTask()
        {
            this$0 = ConversationListFragment.this;
            super();
        }

        ClearNotificationBadgeCountTask(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final ConversationListFragment this$0;

        public void onClick(View view)
        {
            Events.post(new Navigation(Location.CONVERSATION_CREATE));
        }

        _cls3()
        {
            this$0 = ConversationListFragment.this;
            super();
        }
    }

}
