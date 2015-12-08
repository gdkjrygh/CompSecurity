// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.home.adapter.HomefeedBuilderGridAdapter;
import com.pinterest.activity.home.adapter.HomefeedBuilderListAdapter;
import com.pinterest.activity.home.util.HomefeedBuilderData;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.ApiFields;
import com.pinterest.api.model.Interest;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.grid.PinterestAdapterView;
import com.pinterest.ui.grid.PinterestGridView;
import java.util.Set;

// Referenced classes of package com.pinterest.activity.home:
//            HomefeedBuilderFragment

public class HomefeedBuilderListFragment extends HomefeedBuilderFragment
{

    private static int LIST_PAGE_SIZE = 4;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private int _outerPadding;

    public HomefeedBuilderListFragment()
    {
        _eventsSubscriber = new _cls1();
    }

    protected void beforeFollow(Interest interest, int i)
    {
        EventType eventtype;
        HomefeedBuilderData homefeedbuilderdata;
        if (interest.getFollowing().booleanValue())
        {
            eventtype = EventType.INTEREST_FOLLOW;
        } else
        {
            eventtype = EventType.INTEREST_UNFOLLOW;
        }
        homefeedbuilderdata = HomefeedBuilderData.get();
        if (eventtype == EventType.INTEREST_FOLLOW)
        {
            homefeedbuilderdata.getFollowedInterestUids().add(interest.getUid());
        } else
        if (eventtype == EventType.INTEREST_UNFOLLOW)
        {
            homefeedbuilderdata.getFollowedInterestUids().remove(interest.getUid());
            return;
        }
    }

    protected void enterBrowseMode()
    {
        if (_mode == HomefeedBuilderFragment.MODE.BROWSE)
        {
            return;
        } else
        {
            dumpImpressionsFromAdapter();
            _adapter = new HomefeedBuilderListAdapter();
            _adapter.setLoadMoreListener(loadMoreListener);
            _gridVw.setAdapter(_adapter);
            _gridVw.getAdapterView().setBrickPadding(0);
            _gridVw.getAdapterView().setOuterPadding(0);
            super.enterBrowseMode();
            ((HomefeedBuilderListAdapter)_adapter).setMode(_mode);
            return;
        }
    }

    protected void enterSearchMode()
    {
        if (!(_adapter instanceof HomefeedBuilderGridAdapter))
        {
            _adapter = new HomefeedBuilderGridAdapter();
            _adapter.setLoadMoreListener(loadMoreListener);
            _gridVw.setAdapter(_adapter);
        }
        _gridVw.getAdapterView().setBrickPadding((int)Resources.dimension(0x7f0a0012));
        _gridVw.getAdapterView().setOuterPadding(_outerPadding);
        super.enterSearchMode();
        ((HomefeedBuilderGridAdapter)_adapter).setMode(_mode);
    }

    protected void enterSubmittedSearchMode()
    {
        if (!(_adapter instanceof HomefeedBuilderListAdapter))
        {
            dumpImpressionsFromAdapter();
            _adapter = new HomefeedBuilderListAdapter();
            _adapter.setLoadMoreListener(loadMoreListener);
            _gridVw.setAdapter(_adapter);
        }
        _gridVw.getAdapterView().setBrickPadding(0);
        _gridVw.getAdapterView().setOuterPadding(0);
        super.enterSubmittedSearchMode();
        ((HomefeedBuilderListAdapter)_adapter).setMode(_mode);
    }

    protected void loadRecommendedInterests()
    {
        InterestsApi.b("recommendation", ApiFields.j(), Integer.valueOf(LIST_PAGE_SIZE), _recommendedInterestsApiResponseHandler, getApiTag());
    }

    protected void loadSubmittedSearchInterests(String s)
    {
        _refreshing = true;
        SearchApi.a(s, ApiFields.j(), Integer.valueOf(LIST_PAGE_SIZE), "homefeed_builder", new HomefeedBuilderFragment.SearchInterestsApiResponseHandler(this, gridResponseHandler, HomefeedBuilderFragment.MODE.SEARCH), getApiTag());
    }

    protected void onActivate()
    {
        super.onActivate();
        _shouldRefreshOnActivate = false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _adapter = new HomefeedBuilderListAdapter();
        ((HomefeedBuilderListAdapter)_adapter).setMode(_mode);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
    }

    public void onPause()
    {
        super.onPause();
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/activity/home/view/HomefeedBuilderListCell$FadeoutDismissedViewStartEvent, com/pinterest/activity/home/view/HomefeedBuilderListCell$FadeoutDismissedViewEndEvent
        });
    }

    public void onResume()
    {
        super.onResume();
        Events.register(_eventsSubscriber, com/pinterest/activity/home/view/HomefeedBuilderListCell$FadeoutDismissedViewStartEvent, new Class[] {
            com/pinterest/activity/home/view/HomefeedBuilderListCell$FadeoutDismissedViewEndEvent
        });
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _gridVw.getAdapterView().setBrickPadding(0);
        _outerPadding = _gridVw.getAdapterView().getOuterPadding();
        _gridVw.getAdapterView().setOuterPadding(0);
    }








    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final HomefeedBuilderListFragment this$0;

        private void allowTouchEventsOnList(boolean flag)
        {
            
// JavaClassFileOutputException: get_constant: invalid tag

        private void setupDatasourceForDismissalAnimation(int i, List list)
        {
            int j = 
// JavaClassFileOutputException: get_constant: invalid tag

        public void onEventMainThread(com.pinterest.activity.home.view.HomefeedBuilderListCell.FadeoutDismissedViewEndEvent fadeoutdismissedviewendevent)
        {
            List list = .getDataSource().getItems();
            int i = list.indexOf(fadeoutdismissedviewendevent.getInterest());
            if (i != -1)
            {
                .getDataSource().removeItem(i);
                setupDatasourceForDismissalAnimation(i, list);
                .notifyDataSetChanged();
                
// JavaClassFileOutputException: get_constant: invalid tag

        public void onEventMainThread(com.pinterest.activity.home.view.HomefeedBuilderListCell.FadeoutDismissedViewStartEvent fadeoutdismissedviewstartevent)
        {
            fadeoutdismissedviewstartevent = fadeoutdismissedviewstartevent.getInterest();
            class _cls1 extends ApiResponseHandler
            {

                final _cls1 this$1;

                _cls1()
                {
                    this$1 = _cls1.this;
                    ApiResponseHandler();
                }
            }

            InterestsApi.a(MyUser.getUid(), fadeoutdismissedviewstartevent.getUid(), new _cls1(), getApiTag());
            allowTouchEventsOnList(false);
        }


        _cls1()
        {
            this$0 = HomefeedBuilderListFragment.this;
            super();
        }

        class _cls2
            implements Runnable
        {

            final _cls1 this$1;

            public void run()
            {
                allowTouchEventsOnList(true);
            }

                _cls2()
                {
                    this$1 = _cls1.this;
                    Object();
                }
        }

    }

}
