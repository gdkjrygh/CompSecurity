// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.home.adapter.HomefeedBuilderGridAdapter;
import com.pinterest.activity.home.util.HomefeedBuilderData;
import com.pinterest.activity.search.event.GuidedSearchEvent;
import com.pinterest.activity.search.event.SearchSuggestionEvent;
import com.pinterest.activity.search.ui.GuidedSearchBar;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.ApiFields;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.api.remote.UserApi;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.grid.AdapterFooterView;
import com.pinterest.ui.grid.PinterestAdapterView;
import com.pinterest.ui.grid.PinterestGridView;
import com.pinterest.ui.text.IconView;
import java.util.Set;

// Referenced classes of package com.pinterest.activity.home:
//            HomefeedBuilderBaseFragment

public class HomefeedBuilderFragment extends HomefeedBuilderBaseFragment
{

    public static final String SEARCH_CALLER = "homefeed_builder";
    private IconView _backBt;
    protected com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private TextView _followingCount;
    private int _lastClickedIndex;
    protected MODE _mode;
    private int _numInterestsFollowed;
    protected com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse _recommendedInterestsApiResponseHandler;
    private com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse _relatedInterestsApiResponseHandler;
    GuidedSearchBar _searchBar;
    protected boolean _shouldRefreshOnActivate;

    public HomefeedBuilderFragment()
    {
        _numInterestsFollowed = 0;
        _shouldRefreshOnActivate = true;
        _mode = MODE.BROWSE;
        _lastClickedIndex = 0;
        _eventsSubscriber = new _cls2();
        _relatedInterestsApiResponseHandler = new _cls3(gridResponseHandler);
        _recommendedInterestsApiResponseHandler = new _cls4(gridResponseHandler);
        _layoutId = 0x7f0300d3;
        _menuId = 0x7f100002;
        _adapter = new HomefeedBuilderGridAdapter();
        _movingSpeed = 0.0F;
    }

    private int getNumColumns()
    {
        return _gridVw.getAdapterView().getColumnCount();
    }

    private void loadRelatedInterests(Interest interest)
    {
        InterestsApi.a(interest.getUrlName(), 0, ApiFields.v, _relatedInterestsApiResponseHandler, getApiTag());
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
        if (eventtype != EventType.INTEREST_FOLLOW) goto _L2; else goto _L1
_L1:
        homefeedbuilderdata.getFollowedInterestUids().add(interest.getUid());
_L4:
        if (_mode == MODE.BROWSE && interest.getFollowing().booleanValue())
        {
            _lastClickedIndex = i;
            loadRelatedInterests(interest);
        }
        _adapter.notifyDataSetChanged();
        return;
_L2:
        if (eventtype == EventType.INTEREST_UNFOLLOW)
        {
            homefeedbuilderdata.getFollowedInterestUids().remove(interest.getUid());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void enterBrowseMode()
    {
        if (_mode == MODE.BROWSE)
        {
            return;
        } else
        {
            _mode = MODE.BROWSE;
            _gridVw.reset();
            _gridVw.setDataSource(null);
            loadData();
            return;
        }
    }

    protected void enterSearchMode()
    {
        updateEmptyContent();
        _gridVw.setScrollY(0);
        _mode = MODE.SEARCH_TYPEAHEAD;
    }

    protected void enterSubmittedSearchMode()
    {
        updateEmptyContent();
        _gridVw.setScrollY(0);
        _mode = MODE.SEARCH;
    }

    protected String getReferralType()
    {
        return HomefeedBuilderData.getReferrer(_mode);
    }

    protected void loadData()
    {
        loadRecommendedInterests();
    }

    protected void loadRecommendedInterests()
    {
        InterestsApi.b("recommendation", ApiFields.v, null, _recommendedInterestsApiResponseHandler, getApiTag());
    }

    protected void loadSearchInterests(String s)
    {
        _refreshing = true;
        SearchApi.a(s, ApiFields.v, null, "homefeed_builder", new SearchInterestsApiResponseHandler(gridResponseHandler, MODE.SEARCH_TYPEAHEAD), getApiTag());
    }

    protected void loadSubmittedSearchInterests(String s)
    {
        _refreshing = true;
        SearchApi.a(s, ApiFields.v, null, "homefeed_builder", new SearchInterestsApiResponseHandler(gridResponseHandler, MODE.SEARCH), getApiTag());
    }

    protected void onActivate()
    {
        super.onActivate();
        if (_shouldRefreshOnActivate)
        {
            _gridVw.reset();
            _gridVw.setDataSource(null);
        } else
        {
            updateList();
        }
        updateFollowingCount();
        Events.register(_eventsSubscriber);
    }

    public void onBackBtnClicked(View view)
    {
        pressBackButton();
    }

    protected void onDeactivate()
    {
        if (_searchBar != null)
        {
            _searchBar.clearFocus();
        }
        Events.unregister(_eventsSubscriber);
        super.onDeactivate();
    }

    public void onDestroyView()
    {
        Events.unregister(_eventsSubscriber);
        _searchBar = null;
        if (_backBt != null)
        {
            _backBt.setOnClickListener(null);
            _backBt = null;
        }
        _followingCount = null;
        super.onDestroyView();
        ButterKnife.a(this);
        if (StopWatch.get().isActive("hf_builder_ttrfp"))
        {
            StopWatch.get().invalidate("hf_builder_ttrfp");
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        StopWatch.get().start("hf_builder_ttrfp");
        ButterKnife.a(this, view);
        _adapter.setLoadMoreListener(loadMoreListener);
        _gridVw.setOnItemClickListener(this);
        _gridVw.getFooterView().setBackgroundResource(0x7f0e00bf);
        _gridVw.addHeaderView(0x7f0301db);
        ((RelativeLayout)_gridVw.findViewById(0x7f0f048f)).setOnClickListener(new _cls1());
        _followingCount = (TextView)_gridVw.findViewById(0x7f0f0490);
        Events.register(_eventsSubscriber, com/pinterest/activity/search/event/SearchSuggestionEvent, new Class[] {
            com/pinterest/activity/home/view/HomefeedBuilderInterestFollowButton$InterestFollowEvent, com/pinterest/activity/search/event/GuidedSearchEvent
        });
        _searchBar.setSearchHint(Resources.string(0x7f0702a3));
        int i = (int)Resources.dimension(0x7f0a0163);
        ((HorizontalScrollView)_searchBar.findViewById(0x7f0f006f)).setPadding(i, 0, i, 0);
        _searchBar.setSearchBarRightDrawable(true);
    }

    protected void updateEmptyContent()
    {
        _emptyMessage = Resources.string(0x7f0703a3);
        _emptyLeftImage = 0x7f02020f;
        _emptyCenterImage = 0x7f020217;
        _emptyRightImage = 0x7f020212;
    }

    protected void updateFollowingCount()
    {
        UserApi.a(MyUser.getUid(), ApiFields.k, new _cls5(false));
    }



/*
    static int access$1002(HomefeedBuilderFragment homefeedbuilderfragment, int i)
    {
        homefeedbuilderfragment._numInterestsFollowed = i;
        return i;
    }

*/









    private class MODE extends Enum
    {

        private static final MODE $VALUES[];
        public static final MODE BROWSE;
        public static final MODE DYNAMIC_GRID;
        public static final MODE SEARCH;
        public static final MODE SEARCH_TYPEAHEAD;

        public static MODE valueOf(String s)
        {
            return (MODE)Enum.valueOf(com/pinterest/activity/home/HomefeedBuilderFragment$MODE, s);
        }

        public static MODE[] values()
        {
            return (MODE[])$VALUES.clone();
        }

        static 
        {
            BROWSE = new MODE("BROWSE", 0);
            SEARCH = new MODE("SEARCH", 1);
            SEARCH_TYPEAHEAD = new MODE("SEARCH_TYPEAHEAD", 2);
            DYNAMIC_GRID = new MODE("DYNAMIC_GRID", 3);
            $VALUES = (new MODE[] {
                BROWSE, SEARCH, SEARCH_TYPEAHEAD, DYNAMIC_GRID
            });
        }

        private MODE(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final HomefeedBuilderFragment this$0;

        public void onEventMainThread(com.pinterest.activity.home.view.HomefeedBuilderInterestFollowButton.InterestFollowEvent interestfollowevent)
        {
            onHomefeedInterestButtonFollow(interestfollowevent.getInterest());
        }

        public void onEventMainThread(GuidedSearchEvent guidedsearchevent)
        {
            if (guidedsearchevent.getQuery() != null && guidedsearchevent.getQuery().length() > 0)
            {
                enterSubmittedSearchMode();
                loadSubmittedSearchInterests(guidedsearchevent.getQuery());
                return;
            } else
            {
                enterBrowseMode();
                return;
            }
        }

        public void onEventMainThread(SearchSuggestionEvent searchsuggestionevent)
        {
            if (searchsuggestionevent.getType() == com.pinterest.activity.search.event.SearchSuggestionEvent.SuggestionType.AUTO_COMPLETE)
            {
                enterSearchMode();
                loadSearchInterests(searchsuggestionevent.getQuery());
            } else
            if (searchsuggestionevent.getType() == com.pinterest.activity.search.event.SearchSuggestionEvent.SuggestionType.RECENT_QUERY)
            {
                enterBrowseMode();
                return;
            }
        }

        _cls2()
        {
            this$0 = HomefeedBuilderFragment.this;
            super();
        }
    }


    private class _cls3 extends com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse
    {

        final HomefeedBuilderFragment this$0;

        public void onSuccess(Feed feed)
        {
            if (
// JavaClassFileOutputException: get_constant: invalid tag

        _cls3(FeedApiResponseHandler feedapiresponsehandler)
        {
            this$0 = HomefeedBuilderFragment.this;
            super(feedapiresponsehandler);
        }
    }


    private class _cls4 extends com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse
    {

        final HomefeedBuilderFragment this$0;

        public void onSuccess(Feed feed)
        {
            if (_mode != MODE.BROWSE)
            {
                return;
            }
            if (StopWatch.get().isActive("hf_builder_ttrfp"))
            {
                StopWatch.get().complete("hf_builder_ttrfp");
            }
            onSuccess(feed);
        }

        _cls4(FeedApiResponseHandler feedapiresponsehandler)
        {
            this$0 = HomefeedBuilderFragment.this;
            super(feedapiresponsehandler);
        }
    }


    private class SearchInterestsApiResponseHandler extends FeedApiResponseHandler
    {

        private MODE _handlerMode;
        final HomefeedBuilderFragment this$0;

        public void onSuccess(Feed feed)
        {
            if (_handlerMode != _mode)
            {
                return;
            } else
            {
                onSuccess(feed);
                return;
            }
        }

        public void onSuccess(final PinterestJsonObject response)
        {
            onSuccess(response);
            class _cls1 extends BackgroundTask
            {

                private Feed _feed;
                final SearchInterestsApiResponseHandler this$1;
                final PinterestJsonObject val$response;

                public void onFinish()
                {
                    onFinish();
                    onSuccess(_feed);
                }

                public void run()
                {
                    _feed = new SearchInterestsFeed(response, 
// JavaClassFileOutputException: get_constant: invalid tag

                _cls1()
                {
                    this$1 = SearchInterestsApiResponseHandler.this;
                    response = pinterestjsonobject;
                    BackgroundTask();
                }

                private class SearchInterestsFeed extends InterestsFeed
                {

                    private MODE _handlerMode;
                    final HomefeedBuilderFragment this$0;

                    public FeedApiResponseHandler newApiHandler()
                    {
                        return new SearchInterestsApiResponseHandler(_handlerMode);
                    }

                    public SearchInterestsFeed()
                    {
                        this$0 = HomefeedBuilderFragment.this;
                        InterestsFeed(null, null);
                    }

                    public SearchInterestsFeed(PinterestJsonObject pinterestjsonobject, String s)
                    {
                        this$0 = HomefeedBuilderFragment.this;
                        InterestsFeed(pinterestjsonobject, s);
                    }

                    public SearchInterestsFeed(PinterestJsonObject pinterestjsonobject, String s, MODE mode)
                    {
                        this$0 = HomefeedBuilderFragment.this;
                        InterestsFeed(pinterestjsonobject, s);
                        _handlerMode = mode;
                    }
                }

            }

            (new _cls1()).execute();
        }



        public SearchInterestsApiResponseHandler()
        {
            this$0 = HomefeedBuilderFragment.this;
            super();
        }

        public SearchInterestsApiResponseHandler(MODE mode)
        {
            this$0 = HomefeedBuilderFragment.this;
            super();
            _handlerMode = mode;
        }

        public SearchInterestsApiResponseHandler(FeedApiResponseHandler feedapiresponsehandler)
        {
            this$0 = HomefeedBuilderFragment.this;
            super(feedapiresponsehandler);
        }

        public SearchInterestsApiResponseHandler(FeedApiResponseHandler feedapiresponsehandler, MODE mode)
        {
            this(feedapiresponsehandler);
            _handlerMode = mode;
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final HomefeedBuilderFragment this$0;

        public void onClick(View view)
        {
            Events.post(new Navigation(Location.HOMEFEED_BUILDER_MY_TOPICS));
        }

        _cls1()
        {
            this$0 = HomefeedBuilderFragment.this;
            super();
        }
    }


    private class _cls5 extends com.pinterest.api.remote.UserApi.UserApiResponse
    {

        final HomefeedBuilderFragment this$0;

        public void onSuccess(User user)
        {
            onSuccess(user);
            if (user == null || _followingCount == null)
            {
                return;
            }
            HomefeedBuilderFragment homefeedbuilderfragment = HomefeedBuilderFragment.this;
            int i;
            if (user.getInterestFollowingCount() == null)
            {
                i = 0;
            } else
            {
                i = user.getInterestFollowingCount().intValue();
            }
            homefeedbuilderfragment._numInterestsFollowed = i;
            _followingCount.setText(String.valueOf(_numInterestsFollowed));
        }

        _cls5(boolean flag)
        {
            this$0 = HomefeedBuilderFragment.this;
            super(flag);
        }
    }

}
