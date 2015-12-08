// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.pinterest.activity.library.adapter.LibraryTopicListAdapter;
import com.pinterest.activity.library.view.LibraryAllPinsHeaderView;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.InterestsFeed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.api.remote.UserApi;
import com.pinterest.base.Events;
import com.pinterest.education.EducationHelper;
import com.pinterest.fragment.PinGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.experiences.AndroidEducationAnchor;
import com.pinterest.schemas.experiences.Placement;
import com.pinterest.ui.actionbar.ActionBar;
import com.pinterest.ui.grid.PinterestGridView;
import org.lucasr.twowayview.TwoWayView;

public class LibraryAllPinsFragment extends PinGridFragment
{

    private com.pinterest.base.Events.EventsSubscriber _eventSubscriber;
    private int _selectedTopicPos;
    private InterestsFeed _topicFeed;
    private View _topicHeader;
    private TwoWayView _topicList;
    private LibraryTopicListAdapter _topicListAdapter;
    protected User _user;
    private LibraryAllPinsHeaderView _userHeaderView;

    public LibraryAllPinsFragment()
    {
        _selectedTopicPos = -1;
        _eventSubscriber = new _cls2();
        _layoutId = 0x7f0300da;
        _menuId = -1;
        _topicListAdapter = new LibraryTopicListAdapter();
    }

    private void addTopicHeader()
    {
        _topicHeader = _gridVw.addHeaderView(0x7f030138);
        _topicList = (TwoWayView)_topicHeader.findViewById(0x7f0f0321);
        _topicList.setOrientation(org.lucasr.twowayview.TwoWayView.Orientation.HORIZONTAL);
        _topicList.setHorizontalScrollBarEnabled(false);
        _topicList.setSelector(0x106000d);
        _topicList.setOnItemClickListener(new _cls3());
        _topicList.setOnScrollListener(new _cls4());
        _topicList.setAdapter(_topicListAdapter);
        updateTopicHeaderUI(false);
    }

    private Interest getSelectedTopicName()
    {
        Interest interest = null;
        if (_selectedTopicPos != -1)
        {
            interest = (Interest)_topicFeed.get(_selectedTopicPos);
        }
        return interest;
    }

    private void hidePulserViewPosition()
    {
        if (EducationHelper.e())
        {
            Events.post(new HidePulserEvent());
        }
    }

    private void topicClicked(int i)
    {
        Pinalytics.a(ElementType.LIBRARY_PROFILE_PIN_TOPIC, ComponentType.LIBRARY_PROFILE_ALL_PINS);
        int j = i;
        if (_selectedTopicPos == i)
        {
            j = -1;
        }
        _selectedTopicPos = j;
        updateTopicHeaderUI(true);
        _gridVw.setDataSource(null);
        _gridVw.setState(com.pinterest.ui.grid.PinterestGridView.State.LOADING);
        refresh();
    }

    private void updatePulserViewPosition()
    {
        if (EducationHelper.e())
        {
            Events.post(new ShowPulserEvent(AndroidEducationAnchor.LIBRARY_TOPIC));
        }
    }

    private void updateTopicHeaderUI(final boolean smoothScroll)
    {
        if (_topicFeed == null || _topicFeed.getCount() == 0)
        {
            _topicHeader.setVisibility(8);
            return;
        } else
        {
            _topicHeader.setVisibility(0);
            _topicListAdapter.setDataSource(_topicFeed);
            _topicListAdapter.setSelectedPosition(_selectedTopicPos);
            _topicList.post(new _cls5());
            return;
        }
    }

    private void updateUser()
    {
        while (_user == null || _userHeaderView == null) 
        {
            return;
        }
        _userHeaderView.setUser(_user);
    }

    protected Feed getOfflineFeed(int i)
    {
        if (!_navigation.getId().equals(MyUser.getUid()))
        {
            return null;
        } else
        {
            PinFeed pinfeed = new PinFeed();
            pinfeed.setItems(ModelHelper.getUserPins(MyUser.getUid(), i));
            return pinfeed;
        }
    }

    protected void loadData()
    {
        if (_user != null && ModelHelper.isValid(_user.getUid()) && _topicFeed != null)
        {
            if (_selectedTopicPos == -1)
            {
                UserApi.a(_user.getUid(), new com.pinterest.api.remote.PinApi.PinFeedApiResponse(gridResponseHandler), null, getApiTag());
                if (_topicFeed == null)
                {
                    UserApi.a(_user.getUid(), new _cls6(), getApiTag());
                }
            } else
            {
                Object obj = (Interest)_topicFeed.get(_selectedTopicPos);
                if (obj == null)
                {
                    obj = "";
                } else
                {
                    obj = ((Interest) (obj)).getKey();
                }
                SearchApi.a(_user.getUid(), ((String) (obj)), new com.pinterest.api.remote.PinApi.PinFeedApiResponse(gridResponseHandler), getApiTag());
            }
        }
        super.loadData();
    }

    protected void onActivate()
    {
        Events.register(_eventSubscriber, com/pinterest/activity/library/fragment/LibraryAllPinsFragment$ShowTopicClickedEvent, new Class[0]);
        super.onActivate();
    }

    protected void onDeactivate()
    {
        super.onDeactivate();
        Events.unregister(_eventSubscriber);
        if (EducationHelper.e())
        {
            Events.post(new EducationEvent(com.pinterest.activity.task.education.event.EducationEvent.Type.DISMISS));
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _actionBarWrapper.setShadowVisibility(8);
        _userHeaderView = new LibraryAllPinsHeaderView(view.getContext());
        _gridVw.addHeaderView(_userHeaderView);
        addTopicHeader();
        updateUser();
        if (MyUser.isUserMe(_user) && _topicFeed != null && _topicFeed.getCount() > 0)
        {
            EducationHelper.a(Placement.ANDROID_ALL_PINS_VIEW_TAKEOVER, this);
        }
        _gridVw.addListener(new _cls1());
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation == null)
        {
            return;
        }
        _user = navigation.getModelAsUser();
        _topicFeed = (InterestsFeed)navigation.getExtra("com.pinterest.EXTRA_FEED");
        navigation = (Integer)navigation.getExtra("com.pinterest.EXTRA_TOPIC_INDEX");
        if (navigation != null)
        {
            _selectedTopicPos = navigation.intValue();
        }
        updateUser();
    }

    protected void updateEmptyContent()
    {
        _emptyLeftImage = 0x7f02020f;
        _emptyCenterImage = 0x7f020217;
        _emptyRightImage = 0x7f020212;
        if (_user != null && MyUser.isUserMe(_user.getUid()))
        {
            _emptyMessage = Resources.string(0x7f070266);
            return;
        }
        if (_user != null && !TextUtils.isEmpty(_user.getFirstName()))
        {
            _emptyMessage = Resources.string(0x7f07026b, new Object[] {
                _user.getFirstName()
            });
            return;
        } else
        {
            _emptyMessage = Resources.string(0x7f07026c);
            return;
        }
    }









/*
    static InterestsFeed access$702(LibraryAllPinsFragment libraryallpinsfragment, InterestsFeed interestsfeed)
    {
        libraryallpinsfragment._topicFeed = interestsfeed;
        return interestsfeed;
    }

*/


    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final LibraryAllPinsFragment this$0;

        public void onEventMainThread(ShowTopicClickedEvent showtopicclickedevent)
        {
            if (_topicListAdapter == null || _topicList == null)
            {
                return;
            } else
            {
                topicClicked(0);
                return;
            }
        }

        _cls2()
        {
            this$0 = LibraryAllPinsFragment.this;
            super();
        }
    }


    private class _cls3
        implements android.widget.AdapterView.OnItemClickListener
    {

        final LibraryAllPinsFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (_topicListAdapter != null && view != null && (view instanceof TopicAnnotationCell))
            {
                topicClicked(i);
                adapterview = getSelectedTopicName();
                if (adapterview == null)
                {
                    adapterview = "";
                } else
                {
                    adapterview = adapterview.getName();
                }
                view = new HashMap();
                view.put("library_topic_name", adapterview);
                Pinalytics.a(ElementType.LIBRARY_PROFILE_PIN_TOPIC, view);
                if (EducationHelper.e())
                {
                    Events.post(new EducationEvent(com.pinterest.activity.task.education.event.EducationEvent.Type.DISMISS));
                    return;
                }
            }
        }

        _cls3()
        {
            this$0 = LibraryAllPinsFragment.this;
            super();
        }
    }


    private class _cls4
        implements org.lucasr.twowayview.TwoWayView.OnScrollListener
    {

        final LibraryAllPinsFragment this$0;

        public void onScroll(TwoWayView twowayview, int i, int j, int k)
        {
            if (i != 0)
            {
                hidePulserViewPosition();
                return;
            } else
            {
                updatePulserViewPosition();
                return;
            }
        }

        public void onScrollStateChanged(TwoWayView twowayview, int i)
        {
        }

        _cls4()
        {
            this$0 = LibraryAllPinsFragment.this;
            super();
        }
    }


    private class HidePulserEvent
    {

        public HidePulserEvent()
        {
        }
    }


    private class ShowPulserEvent
    {

        public final AndroidEducationAnchor _androidEducationAnchor;

        public ShowPulserEvent(AndroidEducationAnchor androideducationanchor)
        {
            _androidEducationAnchor = androideducationanchor;
        }
    }


    private class _cls5
        implements Runnable
    {

        final LibraryAllPinsFragment this$0;
        final boolean val$smoothScroll;

        public void run()
        {
            int i;
            if (_selectedTopicPos == -1)
            {
                i = 0;
            } else
            {
                i = _selectedTopicPos;
            }
            if (smoothScroll)
            {
                _topicList.smoothScrollToPositionFromOffset(i, 0, 700);
                return;
            } else
            {
                _topicList.setSelection(i);
                return;
            }
        }

        _cls5()
        {
            this$0 = LibraryAllPinsFragment.this;
            smoothScroll = flag;
            super();
        }
    }


    private class _cls6 extends com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse
    {

        final LibraryAllPinsFragment this$0;

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            _topicFeed = (InterestsFeed)feed;
            updateTopicHeaderUI(false);
        }

        _cls6()
        {
            this$0 = LibraryAllPinsFragment.this;
            super();
        }
    }


    private class _cls1 extends com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener
    {

        final LibraryAllPinsFragment this$0;

        public void onScroll(View view, int i, int j, int k, int l)
        {
            updatePulserViewPosition();
        }

        _cls1()
        {
            this$0 = LibraryAllPinsFragment.this;
            super();
        }
    }

}
