// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.pinterest.activity.commerce.util.CommerceHelper;
import com.pinterest.activity.library.adapter.LibraryAdapter;
import com.pinterest.activity.library.model.LibraryFeed;
import com.pinterest.activity.library.view.LibraryHeaderView;
import com.pinterest.activity.library.view.LibrarySectionView;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.user.view.FollowUserButton;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.InterestsFeed;
import com.pinterest.api.model.LibrarySection;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.BaseApi;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.api.remote.LibraryApi;
import com.pinterest.api.remote.UserApi;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.education.EducationHelper;
import com.pinterest.fragment.PinterestGridFragment;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.ui.actionbar.ActionBar;
import com.pinterest.ui.grid.AdapterFooterView;
import com.pinterest.ui.grid.PinterestGridView;
import com.pinterest.ui.text.IconView;
import com.pinterest.ui.text.PTextView;
import java.util.ArrayList;

public class LibraryFragment extends PinterestGridFragment
{

    public static final int LIBRARY_ALL_PINS_SIZE;
    private boolean _boardSortOptionsAdded;
    private String _currentSortOrder;
    private com.pinterest.base.Events.EventsSubscriber _eventSubscriber;
    private FollowUserButton _followBtn;
    private boolean _libraryFeedLoading;
    private LibraryHeaderView _libraryHeaderView;
    private com.pinterest.activity.library.adapter.LibraryAdapter.LibraryLoadMoreListener _librarySectionListListener;
    private TextView _librarySortText;
    private boolean _pinsAdded;
    private LibrarySection _pinsData;
    private LibrarySectionView _pinsSectionView;
    private InterestsFeed _pinsTopicFeed;
    private boolean _pinsTopicFeedAdded;
    private View _searchBar;
    private PTextView _searchBarTextView;
    private User _user;
    private boolean _userLoaded;
    private String _userUid;
    private BaseApiResponseHandler feedBatchHandler;
    private com.pinterest.api.remote.UserApi.UserApiResponse onUserLoad;

    public LibraryFragment()
    {
        _eventSubscriber = new _cls5();
        onUserLoad = new _cls8();
        feedBatchHandler = new _cls9();
        _librarySectionListListener = new _cls11();
        _layoutId = 0x7f0300d9;
        _adapter = new LibraryAdapter();
        ((LibraryAdapter)_adapter).setListener(_librarySectionListListener);
    }

    private void addActionBar(View view)
    {
        _actionBarWrapper.setShadowVisibility(8);
        if (MyUser.isUserMe(_userUid))
        {
            _searchBar = LayoutInflater.from(view.getContext()).inflate(0x7f0301bb, _actionBar, false);
            _actionBar.addView(_searchBar);
            setTextToSearchBar();
            _searchBar.setOnClickListener(new _cls2());
            return;
        } else
        {
            _actionBar.addView(getSendView(view));
            _followBtn = (FollowUserButton)LayoutInflater.from(view.getContext()).inflate(0x7f0301d6, _actionBar, false);
            _actionBar.addView(_followBtn);
            return;
        }
    }

    private void addBoardSortOptions()
    {
        if (_user == null || _user.getBoardCount() == null || _user.getBoardCount().intValue() == 0 || getContext() == null)
        {
            return;
        } else
        {
            Object obj = (ViewGroup)getView();
            obj = LayoutInflater.from(getContext()).inflate(0x7f03002e, ((ViewGroup) (obj)), false);
            _librarySortText = (TextView)((View) (obj)).findViewById(0x7f0f00ae);
            ((IconView)((View) (obj)).findViewById(0x7f0f00af)).setTint(0x7f0e007b);
            updateSortText();
            ((View) (obj)).setOnClickListener(new _cls6());
            _gridVw.addHeaderView(((View) (obj)));
            _boardSortOptionsAdded = true;
            return;
        }
    }

    private void addPinsSection()
    {
        if (_pinsData != null && canShowAllPins() && getContext() != null && _gridVw != null)
        {
            View view = LayoutInflater.from(getContext()).inflate(0x7f0301e2, _gridVw, false);
            _pinsSectionView = (LibrarySectionView)view.findViewById(0x7f0f0498);
            _pinsSectionView.configure(_pinsData, _user, 1);
            _gridVw.addHeaderView(view);
            _pinsAdded = true;
        }
    }

    private void addSectionViews()
    {
        if (_userLoaded)
        {
            if (!_pinsAdded)
            {
                addPinsSection();
            }
            if (!_pinsTopicFeedAdded && _pinsAdded)
            {
                addTopicsToPinsSection();
            }
            if (!_boardSortOptionsAdded && _pinsData != null)
            {
                addBoardSortOptions();
                return;
            }
        }
    }

    private void addTopicsToPinsSection()
    {
        if (_pinsTopicFeed != null && _pinsSectionView != null)
        {
            _pinsSectionView.setTopicsFeed(_pinsTopicFeed);
            _pinsSectionView.configureTopics();
            _pinsTopicFeedAdded = true;
        }
    }

    private boolean canShowAllPins()
    {
        while (_user == null || (_user.getBoardCountDisplay() <= 0 || _user.getPinCountDisplay() < 8) && _user.getBoardCountDisplay() < 2) 
        {
            return false;
        }
        return true;
    }

    private ImageView getSendView(View view)
    {
        view = new IconView(view.getContext());
        view.setImageDrawable(getResources().getDrawable(0x7f0201bf));
        int i = (int)getResources().getDimension(0x7f0a0148);
        view.setPadding(i, i, i, i);
        view.setOnClickListener(new _cls4());
        return view;
    }

    private boolean isTooLarge(TextView textview, String s, int i, int j)
    {
        return textview.getPaint().measureText(s) + (float)(j * 2) + (float)_searchBarTextView.getCompoundDrawablePadding() + (float)i >= (float)textview.getMeasuredWidth();
    }

    private void loadBoardTopics(LibraryFeed libraryfeed)
    {
        if (libraryfeed == null)
        {
            return;
        }
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < libraryfeed.getCount(); i++)
        {
            Object obj = (LibrarySection)libraryfeed.get(i);
            if (obj == null)
            {
                continue;
            }
            obj = ((LibrarySection) (obj)).getBoard();
            if (obj != null && !((Board) (obj)).getSecret().booleanValue())
            {
                arraylist.add(((Board) (obj)).getUid());
            }
        }

        LibraryApi.a(arraylist, new LibraryTopicsApiResponseHandler(arraylist), getApiTag());
    }

    private void loadLibraryFeed(String s)
    {
        _libraryFeedLoading = true;
        LibraryApi.d(_userUid, s, feedBatchHandler, getApiTag());
    }

    private void loadLibraryUserPins()
    {
        UserApi.a(_userUid, new LibraryPinsApiResponse(null), String.valueOf(LIBRARY_ALL_PINS_SIZE), getApiTag());
    }

    private void loadMore()
    {
        if (_adapter == null || _adapter.getDataSource() == null || _adapter.getDataSource().getNextUrl() == null)
        {
            return;
        } else
        {
            BaseApi.e(_adapter.getDataSource().getNextUrl(), new _cls10(), getApiTag());
            return;
        }
    }

    private void loadUserTopics()
    {
        UserApi.a(_userUid, new _cls7(), getApiTag());
    }

    private void setTextToSearchBar()
    {
        _searchBarTextView = (PTextView)_searchBar.findViewById(0x7f0f0453);
        _searchBarTextView.getViewTreeObserver().addOnGlobalLayoutListener(new _cls3());
    }

    private void updatePulserViewPosition()
    {
        if (EducationHelper.f())
        {
            Events.post(new com.pinterest.activity.task.education.view.EducationContainerView.PositionPulsarEvent());
        }
    }

    private void updateSortText()
    {
        if (_librarySortText == null)
        {
            return;
        }
        String s1 = getResources().getString(0x7f070328);
        String s;
        if (TextUtils.equals(_currentSortOrder, "last_pinned_to"))
        {
            s = getResources().getString(0x7f070329).toLowerCase();
        } else
        {
            s = getResources().getString(0x7f070327);
        }
        s = String.format("%s <b>%s</b>", new Object[] {
            s1, s
        });
        _librarySortText.setText(Html.fromHtml(s));
    }

    private void updateUser()
    {
        if (_user != null)
        {
            if (_libraryHeaderView != null)
            {
                _libraryHeaderView.setUser(_user);
            }
            if (_pinsSectionView != null)
            {
                _pinsSectionView.setUser(_user);
            }
            if (_adapter != null)
            {
                ((LibraryAdapter)_adapter).updateUser(_user);
            }
            if (_followBtn != null)
            {
                _followBtn.setUser(_user);
                return;
            }
        }
    }

    protected void loadData()
    {
        super.loadData();
        UserApi.a(_userUid, onUserLoad);
        ((LibraryAdapter)_adapter).resetDataSource();
        loadLibraryUserPins();
        loadUserTopics();
        _currentSortOrder = Preferences.persisted().getString("PREF_LIBRARY_BOARD_SORT_ORDER", "last_pinned_to");
        ((LibraryAdapter)_adapter).setSortOrder(_currentSortOrder);
        loadLibraryFeed(_currentSortOrder);
    }

    protected void onActivate()
    {
        super.onActivate();
        Events.registerSticky(_eventSubscriber, com/pinterest/api/model/Board$UpdateEvent, new Class[] {
            com/pinterest/api/model/MyUser$UpdateEvent, com/pinterest/events/FeedEvents$MyBoardsInvalidated
        });
        Events.register(_eventSubscriber, com/pinterest/api/model/User$UpdateEvent, new Class[] {
            com/pinterest/activity/library/model/LibraryFeed$SortEvent, com/pinterest/activity/library/view/LibrarySectionGridView$WeightsSetEvent, com/pinterest/activity/library/fragment/LibraryFragment$ShowAllPinsPageEvent
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        _fixedActionBar = true;
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    protected void onDeactivate()
    {
        super.onDeactivate();
        Events.unregister(_eventSubscriber);
        if (EducationHelper.f())
        {
            Events.post(new EducationEvent(com.pinterest.activity.task.education.event.EducationEvent.Type.DISMISS));
        }
    }

    public void onDestroyView()
    {
        if (_searchBar != null)
        {
            _searchBar.setOnClickListener(null);
            _searchBar = null;
        }
        if (_followBtn != null)
        {
            _followBtn.setOnClickListener(null);
            _followBtn = null;
        }
        _libraryHeaderView = null;
        _pinsSectionView = null;
        _pinsTopicFeed = null;
        _librarySortText = null;
        if (_librarySectionListListener != null)
        {
            _librarySectionListListener = null;
        }
        ((LibraryAdapter)_adapter).setListener(null);
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        addActionBar(view);
        _libraryHeaderView = new LibraryHeaderView(view.getContext());
        _gridVw.addHeaderView(_libraryHeaderView);
        if (_gridVw != null)
        {
            _gridVw.getFooterView().setBackgroundResource(0x7f0e00bf);
        }
        updateUser();
        _gridVw.addListener(new _cls1());
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation == null)
        {
            return;
        }
        _userUid = navigation.getId();
        _user = navigation.getModelAsUser();
        if (MyUser.isUserMe(_userUid))
        {
            if (CommerceHelper.isCommerceEnabled())
            {
                _menuId = 0x7f100006;
                return;
            } else
            {
                _menuId = 0x7f100005;
                return;
            }
        } else
        {
            _menuId = 0x7f100002;
            return;
        }
    }

    static 
    {
        int i;
        if (Device.isTablet())
        {
            i = 11;
        } else
        {
            i = 8;
        }
        LIBRARY_ALL_PINS_SIZE = i;
    }










/*
    static String access$1502(LibraryFragment libraryfragment, String s)
    {
        libraryfragment._currentSortOrder = s;
        return s;
    }

*/



/*
    static boolean access$1702(LibraryFragment libraryfragment, boolean flag)
    {
        libraryfragment._refreshing = flag;
        return flag;
    }

*/







/*
    static LibrarySectionView access$2102(LibraryFragment libraryfragment, LibrarySectionView librarysectionview)
    {
        libraryfragment._pinsSectionView = librarysectionview;
        return librarysectionview;
    }

*/


/*
    static InterestsFeed access$2302(LibraryFragment libraryfragment, InterestsFeed interestsfeed)
    {
        libraryfragment._pinsTopicFeed = interestsfeed;
        return interestsfeed;
    }

*/



/*
    static boolean access$2502(LibraryFragment libraryfragment, boolean flag)
    {
        libraryfragment._userLoaded = flag;
        return flag;
    }

*/



/*
    static LibrarySection access$2602(LibraryFragment libraryfragment, LibrarySection librarysection)
    {
        libraryfragment._pinsData = librarysection;
        return librarysection;
    }

*/







/*
    static User access$302(LibraryFragment libraryfragment, User user)
    {
        libraryfragment._user = user;
        return user;
    }

*/



/*
    static boolean access$3202(LibraryFragment libraryfragment, boolean flag)
    {
        libraryfragment._refreshing = flag;
        return flag;
    }

*/
























/*
    static boolean access$702(LibraryFragment libraryfragment, boolean flag)
    {
        libraryfragment._libraryFeedLoading = flag;
        return flag;
    }

*/



    private class _cls5
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final LibraryFragment this$0;

        public void onEventMainThread(ShowAllPinsPageEvent showallpinspageevent)
        {
            if (_pinsSectionView != null)
            {
                _pinsSectionView.showAllPinsPage();
            }
        }

        public void onEventMainThread(com.pinterest.activity.library.model.LibraryFeed.SortEvent sortevent)
        {
            if (StringUtils.isNotEmpty(sortevent.getSortOrder()))
            {
                _currentSortOrder = sortevent.getSortOrder();
                Preferences.persisted().set("PREF_LIBRARY_BOARD_SORT_ORDER", _currentSortOrder);
                ((LibraryAdapter)
// JavaClassFileOutputException: get_constant: invalid tag

        public void onEventMainThread(com.pinterest.activity.library.view.LibrarySectionGridView.WeightsSetEvent weightssetevent)
        {
            if (MyUser.isUserMe(_userUid))
            {
                EducationHelper.a(Placement.ANDROID_USER_PROFILE_TAKEOVER, LibraryFragment.this);
            }
        }

        public void onEventMainThread(com.pinterest.api.model.Board.UpdateEvent updateevent)
        {
            if (!updateevent.wasDeleted() || !MyUser.isUserMe(_userUid)) goto _L2; else goto _L1
_L1:
            ((LibraryAdapter)
// JavaClassFileOutputException: get_constant: invalid tag

        public void onEventMainThread(com.pinterest.api.model.MyUser.UpdateEvent updateevent)
        {
            updateevent = updateevent.getUser();
            if (updateevent == null || !
// JavaClassFileOutputException: get_constant: invalid tag

        public void onEventMainThread(com.pinterest.api.model.Pin.UpdateEvent updateevent)
        {
            if (updateevent.getPin() == null)
            {
                return;
            } else
            {
                loadLibraryUserPins();
                return;
            }
        }

        public void onEventMainThread(com.pinterest.api.model.User.UpdateEvent updateevent)
        {
            updateevent = updateevent.getUser();
            if (updateevent == null || !
// JavaClassFileOutputException: get_constant: invalid tag

        public void onEventMainThread(com.pinterest.events.FeedEvents.MadeNewPin madenewpin)
        {
            if (ANDROID_USER_PROFILE_TAKEOVER == null)
            {
                return;
            }
            if (madenewpin.a().getBoard() != null)
            {
                
// JavaClassFileOutputException: get_constant: invalid tag

        public void onEventMainThread(com.pinterest.events.FeedEvents.MyBoardsInvalidated myboardsinvalidated)
        {
            Events.removeStickyEvent(myboardsinvalidated);
            if (!_libraryFeedLoading)
            {
                
// JavaClassFileOutputException: get_constant: invalid tag

        _cls5()
        {
            this$0 = LibraryFragment.this;
            super();
        }
    }


    private class _cls8 extends com.pinterest.api.remote.UserApi.UserApiResponse
    {

        final LibraryFragment this$0;

        public void onSuccess(User user)
        {
            _user = user;
            updateUser();
            _userLoaded = true;
            addSectionViews();
        }

        _cls8()
        {
            this$0 = LibraryFragment.this;
            super();
        }
    }


    private class _cls9 extends BaseApiResponseHandler
    {

        final LibraryFragment this$0;

        public void onFinish()
        {
            super.onFinish();
            _libraryFeedLoading = false;
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            Object obj1 = null;
            super.onSuccess(apiresponse);
            PinterestJsonObject pinterestjsonobject = (PinterestJsonObject)apiresponse.getData();
            Object obj;
            if (apiresponse != null)
            {
                obj = pinterestjsonobject.c((new StringBuilder("GET:")).append(String.format("/v3/users/%s/pins/liked/", new Object[] {
                    _userUid
                })).toString());
                apiresponse = pinterestjsonobject.c((new StringBuilder("GET:")).append(String.format("/v3/users/%s/boards/feed/", new Object[] {
                    _userUid
                })).toString());
            } else
            {
                obj = null;
                apiresponse = obj1;
            }
            obj = new LibraryFeed(((PinterestJsonObject) (obj)), "", "likes");
            ((LibraryAdapter)
// JavaClassFileOutputException: get_constant: invalid tag

        _cls9()
        {
            this$0 = LibraryFragment.this;
            super();
        }

    }



    private class _cls2
        implements android.view.View.OnClickListener
    {

        final LibraryFragment this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.SEARCH_BUTTON, ComponentType.NAVIGATION);
            view = new Navigation(Location.SEARCH);
            view.putExtra("com.pinterest.EXTRA_SEARCH_MODE", "VALUE_SEARCH_LIBRARY");
            Events.post(view);
        }

        _cls2()
        {
            this$0 = LibraryFragment.this;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final LibraryFragment this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.LIBRARY_SORT_BOARDS);
            view = new Navigation(Location.BOARD_SORT);
            view.putExtra("com.pinterest.EXTRA_SORT_ORDER", _currentSortOrder);
            Events.post(view);
        }

        _cls6()
        {
            this$0 = LibraryFragment.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final LibraryFragment this$0;

        public void onClick(View view)
        {
            if (_user != null)
            {
                if ((view = getActivity()) != null)
                {
                    ReportHelper.showBlockDialog(view, _user);
                    return;
                }
            }
        }

        _cls4()
        {
            this$0 = LibraryFragment.this;
            super();
        }
    }





    private class _cls7 extends com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse
    {

        final LibraryFragment this$0;

        public void onSuccess(Feed feed)
        {
            _pinsTopicFeed = (InterestsFeed)feed;
            addSectionViews();
        }

        _cls7()
        {
            this$0 = LibraryFragment.this;
            super();
        }
    }


    private class _cls3
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final LibraryFragment this$0;

        public void onGlobalLayout()
        {
            String s = _searchBarTextView.getText().toString();
            int i = _searchBarTextView.getCompoundDrawables()[0].getIntrinsicWidth();
            int j = _searchBarTextView.getPaddingLeft();
            if (isTooLarge(_searchBarTextView, s, i, j))
            {
                _searchBarTextView.setText(0x7f07061e);
            }
            _searchBarTextView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }

        _cls3()
        {
            this$0 = LibraryFragment.this;
            super();
        }
    }


    private class _cls1 extends com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener
    {

        final LibraryFragment this$0;

        public void onScroll(View view, int i, int j, int k, int l)
        {
            updatePulserViewPosition();
        }

        _cls1()
        {
            this$0 = LibraryFragment.this;
            super();
        }
    }

}
