// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.user.UserBaseFragment;
import com.pinterest.activity.user.view.UserFollowedBoardsView;
import com.pinterest.activity.user.view.UserFollowedInterestsView;
import com.pinterest.activity.user.view.UserFollowedPinnersView;
import com.pinterest.activity.user.view.UserMetadataView;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.UserApi;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.actions.ScrollableListener;
import com.pinterest.ui.actions.SynchronizedPagerChild;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.scrollview.ObservableScrollView;

public class UserFollowedFragment extends BaseFragment
    implements UserBaseFragment, SynchronizedPagerChild
{

    LinearLayout _contentVw;
    AdapterEmptyView _emptyVw;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    UserFollowedBoardsView _followedBoards;
    UserFollowedInterestsView _followedInterests;
    UserFollowedPinnersView _followedPinners;
    private com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse _interestsHandler;
    private com.pinterest.ui.layout.AdapterLinearLayout.OnChildViewClickListener _onBoardClickListener;
    private com.pinterest.ui.layout.AdapterLinearLayout.OnChildViewClickListener _onInterestClickListener;
    private com.pinterest.ui.layout.AdapterLinearLayout.OnChildViewClickListener _onUserClickListener;
    ObservableScrollView _scrollVw;
    Button _seeAllBoardsBt;
    Button _seeAllInterestsBt;
    Button _seeAllPinnersBt;
    protected SwipeRefreshLayout _swipeVw;
    private User _user;
    protected UserMetadataView _userMetadataView;
    private BaseApiResponseHandler batchHandler;

    public UserFollowedFragment()
    {
        batchHandler = new _cls3();
        _interestsHandler = new _cls4();
        _onBoardClickListener = new _cls5();
        _onInterestClickListener = new _cls6();
        _onUserClickListener = new _cls7();
        _eventsSubscriber = new _cls8();
    }

    private void initGridColumns()
    {
        if (_followedBoards != null)
        {
            int i = Resources.integer(0x7f0d0002).intValue();
            _followedBoards.setWeightSum(i);
            _followedBoards.setMaxChildViews(i);
        }
        if (_followedInterests != null)
        {
            int j = Resources.integer(0x7f0d0001).intValue();
            _followedInterests.setWeightSum(j);
            _followedInterests.setMaxChildViews(j);
        }
    }

    public void adjustScroll(int i)
    {
        scrollTo(0, i);
    }

    public User getUser()
    {
        return _user;
    }

    protected void loadData()
    {
        String s = getNavigation().getId();
        if (ModelHelper.isValid(s))
        {
            UserApi.f(s, batchHandler, getApiTag());
        }
    }

    protected void onActivate()
    {
        super.onActivate();
        if (_emptyVw != null)
        {
            _emptyVw.activate();
        }
    }

    public void onConfigurationChanged(final Configuration view)
    {
        super.onConfigurationChanged(view);
        view = getView();
        view.getViewTreeObserver().addOnGlobalLayoutListener(new _cls2());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f03011b;
    }

    protected void onDeactivate()
    {
        if (_emptyVw != null)
        {
            _emptyVw.deactivate();
        }
        super.onDeactivate();
    }

    public void onDestroyView()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/activity/user/fragment/UserFollowedInterestsFragment$UpdateEvent
        });
        if (_followedBoards != null)
        {
            _followedBoards.setOnChildViewClickListener(null);
        }
        if (_followedInterests != null)
        {
            _followedInterests.setOnChildViewClickListener(null);
        }
        if (_followedPinners != null)
        {
            _followedPinners.setOnChildViewClickListener(null);
        }
        ButterKnife.a(this);
        super.onDestroyView();
    }

    void onSeeAllBoardsClick()
    {
        Events.post(new Navigation(Location.USER_FOLLOWED_BOARDS, _user.getUid()));
    }

    void onSeeAllInterestsClick()
    {
        Events.post(new Navigation(Location.USER_FOLLOWED_INTERESTS, _user.getUid()));
    }

    void onSeeAllPinnersClick()
    {
        Events.post(new Navigation(Location.USER_FOLLOWED_PINNERS, _user.getUid()));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        if (_scrollListener != null)
        {
            _scrollVw.addListener(_scrollListener);
        }
        loadData();
        initGridColumns();
        _followedBoards.setUser(_user);
        _followedBoards.setOnChildViewClickListener(_onBoardClickListener);
        _followedInterests.setUser(_user);
        _followedInterests.setOnChildViewClickListener(_onInterestClickListener);
        _followedPinners.setUser(_user);
        _followedPinners.setOnChildViewClickListener(_onUserClickListener);
        _userMetadataView.setUser(_user);
        _userMetadataView.setMetadataBarMode(com.pinterest.ui.actionbar.MetadataBar.Mode.FOLLOWING);
        if (_swipeVw != null)
        {
            _swipeVw.setColorSchemeResources(new int[] {
                0x7f0e009c
            });
            int i = (int)Resources.dimension(0x7f0a01f6) + Constants.MARGIN;
            int j = Constants.SWIPE_OFFSET_LENGTH;
            _swipeVw.setProgressViewOffset(false, i - j, i);
            _swipeVw.setOnRefreshListener(new _cls1());
        }
        Events.register(_eventsSubscriber, com/pinterest/activity/user/fragment/UserFollowedInterestsFragment$UpdateEvent, new Class[0]);
    }

    public void scrollTo(int i, int j)
    {
        if (_scrollVw != null)
        {
            _scrollVw.scrollTo(i, j);
        }
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation == null)
        {
            return;
        } else
        {
            _user = _navigation.getModelAsUser();
            return;
        }
    }

    public void setScrollListener(ScrollableListener scrollablelistener)
    {
        super.setScrollListener(scrollablelistener);
        if (_scrollVw != null)
        {
            _scrollVw.addListener(scrollablelistener);
        }
    }






/*
    static boolean access$402(UserFollowedFragment userfollowedfragment, boolean flag)
    {
        userfollowedfragment._refreshing = flag;
        return flag;
    }

*/



    private class _cls3 extends BaseApiResponseHandler
    {

        final UserFollowedFragment this$0;

        public void onFinish()
        {
            if (_swipeVw != null)
            {
                _swipeVw.setRefreshing(false);
            }
            
// JavaClassFileOutputException: get_constant: invalid tag

        public void onStart()
        {
            AdapterEmptyView.setState(_emptyVw, 0);
            ViewHelper.setVisibility(_emptyVw, 0);
            ViewHelper.setVisibility(_contentVw, 8);
            ViewHelper.setVisibility(_contentVw, 8);
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            PinterestJsonObject pinterestjsonobject1 = (PinterestJsonObject)apiresponse.getData();
            Object obj = _user.getUid();
            apiresponse = pinterestjsonobject1.c(String.format("GET:/v3/users/%s/boards/following/", new Object[] {
                obj
            }));
            PinterestJsonObject pinterestjsonobject = pinterestjsonobject1.c(String.format("GET:/v3/users/%s/interests/favorited/", new Object[] {
                obj
            }));
            pinterestjsonobject1 = pinterestjsonobject1.c(String.format("GET:/v3/users/%s/following/", new Object[] {
                obj
            }));
            obj = new ApiResponse(apiresponse);
            ApiResponse apiresponse1 = new ApiResponse(pinterestjsonobject);
            ApiResponse apiresponse2 = new ApiResponse(pinterestjsonobject1);
            class _cls1 extends com.pinterest.api.remote.BoardApi.BoardFeedApiResponse
            {

                final _cls3 this$1;

                public void onSuccess(Feed feed)
                {
                    onSuccess(feed);
                    if (getView() == null)
                    {
                        return;
                    }
                    BoardGridAdapter boardgridadapter;
                    boolean flag;
                    if (feed.getCount() > 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    ViewHelper.setVisibility(_seeAllBoardsBt, flag);
                    feed = (BoardFeed)feed;
                    boardgridadapter = new BoardGridAdapter();
                    boardgridadapter.setDataSource(feed);
                    _followedBoards.setAdapter(boardgridadapter);
                }

                _cls1()
                {
                    this$1 = _cls3.this;
                    BoardFeedApiResponse();
                }
            }

            _cls1 _lcls1 = new _cls1();
            class _cls2 extends com.pinterest.api.remote.UserApi.UserFeedApiResponse
            {

                final _cls3 this$1;

                public void onSuccess(Feed feed)
                {
                    onSuccess(feed);
                    if (getView() == null)
                    {
                        return;
                    }
                    Object obj1;
                    boolean flag;
                    if (feed.getCount() > 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    ViewHelper.setVisibility(_seeAllPinnersBt, flag);
                    obj1 = getView().getContext();
                    feed = (UserFeed)feed;
                    obj1 = new PeopleListAdapter(((android.content.Context) (obj1)));
                    ((PeopleListAdapter) (obj1)).setDataSource(feed);
                    _followedPinners.setAdapter(((android.widget.Adapter) (obj1)));
                }

                _cls2()
                {
                    this$1 = _cls3.this;
                    UserFeedApiResponse();
                }
            }

            _cls2 _lcls2 = new _cls2();
            if (((ApiResponse) (obj)).getCode() == 0)
            {
                _lcls1.onSuccess(apiresponse);
            } else
            {
                _lcls1.onFailure(null, apiresponse);
            }
            if (apiresponse1.getCode() == 0)
            {
                _interestsHandler.onSuccess(pinterestjsonobject);
            } else
            {
                _interestsHandler.onFailure(null, pinterestjsonobject);
            }
            if (apiresponse2.getCode() == 0)
            {
                _lcls2.onSuccess(pinterestjsonobject1);
                return;
            } else
            {
                _lcls2.onFailure(null, pinterestjsonobject1);
                return;
            }
        }

        _cls3()
        {
            this$0 = UserFollowedFragment.this;
            super();
        }
    }


    private class _cls4 extends com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse
    {

        final UserFollowedFragment this$0;

        public void onSuccess(Feed feed)
        {
            onSuccess(feed);
            if (getView() == null)
            {
                return;
            }
            InterestsFeed interestsfeed;
            boolean flag;
            if (feed.getCount() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ViewHelper.setVisibility(_seeAllInterestsBt, flag);
            interestsfeed = (InterestsFeed)feed;
            if (MyUser.isUserMe(_user) && feed.getCount() == 0)
            {
                feed = new MyUserInterestsGridAdapter();
            } else
            {
                feed = new InterestsGridAdapter();
            }
            feed.setDataSource(interestsfeed);
            _followedInterests.setAdapter(feed);
        }

        _cls4()
        {
            this$0 = UserFollowedFragment.this;
            super();
        }
    }


    private class _cls5
        implements com.pinterest.ui.layout.AdapterLinearLayout.OnChildViewClickListener
    {

        final UserFollowedFragment this$0;

        public void onChildViewClick(Object obj)
        {
            if (obj == null || !(obj instanceof Board))
            {
                return;
            } else
            {
                obj = (Board)obj;
                Pinalytics.a(ElementType.BOARD_COVER, ComponentType.FLOWED_BOARD, ((Board) (obj)).getUid());
                Events.post(new Navigation(Location.BOARD, ((com.pinterest.api.model.Model) (obj))));
                return;
            }
        }

        _cls5()
        {
            this$0 = UserFollowedFragment.this;
            super();
        }
    }


    private class _cls6
        implements com.pinterest.ui.layout.AdapterLinearLayout.OnChildViewClickListener
    {

        final UserFollowedFragment this$0;

        public void onChildViewClick(Object obj)
        {
            if (obj == null || !(obj instanceof Interest))
            {
                if (MyUser.isUserMe(_user))
                {
                    Events.post(new DialogEvent(new AddInterestDialog()));
                }
                return;
            } else
            {
                obj = (Interest)obj;
                HashMap hashmap = new HashMap();
                hashmap.put("interest", ((Interest) (obj)).getUrlName());
                Pinalytics.a(ElementType.FLOWED_INTEREST, hashmap);
                StopWatch.get().start("interest_ttrfp");
                Events.post(new Navigation(Location.INTEREST, ((com.pinterest.api.model.Model) (obj))));
                return;
            }
        }

        _cls6()
        {
            this$0 = UserFollowedFragment.this;
            super();
        }
    }


    private class _cls7
        implements com.pinterest.ui.layout.AdapterLinearLayout.OnChildViewClickListener
    {

        final UserFollowedFragment this$0;

        public void onChildViewClick(Object obj)
        {
            if (obj == null || !(obj instanceof User))
            {
                return;
            } else
            {
                obj = (User)obj;
                Pinalytics.a(ElementType.USER_LIST_USER, ComponentType.USER_FEED, ((User) (obj)).getUid());
                Events.post(new Navigation(Location.USER, ((com.pinterest.api.model.Model) (obj))));
                return;
            }
        }

        _cls7()
        {
            this$0 = UserFollowedFragment.this;
            super();
        }
    }



    private class _cls2
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final UserFollowedFragment this$0;
        final View val$view;

        public void onGlobalLayout()
        {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            initGridColumns();
        }

        _cls2()
        {
            this$0 = UserFollowedFragment.this;
            view = view1;
            super();
        }
    }


}
