// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.pinterest.activity.create.dialog.CreateBoardDialog;
import com.pinterest.activity.task.education.model.Education;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.user.adapter.MyUserBoardGridAdapter;
import com.pinterest.activity.user.view.UserMetadataView;
import com.pinterest.activity.user.view.UserSuggestedPinnersView;
import com.pinterest.adapter.BoardGridAdapter;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.api.remote.UserApi;
import com.pinterest.base.Colors;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.education.EducationHelper;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.experiment.Experiments;
import com.pinterest.fragment.BoardGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.experiences.Experience;
import com.pinterest.schemas.experiences.ExperienceType;
import com.pinterest.schemas.experiences.Placement;
import com.pinterest.ui.actions.SynchronizedPagerChild;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.grid.AdapterFooterView;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.activity.user:
//            UserBaseFragment

public class UserBoardsFragment extends BoardGridFragment
    implements UserBaseFragment, SynchronizedPagerChild
{

    private static final int MAXIMUM_SUGGESTION_NUM = 3;
    private static final String SECRET_FEED = "__SECRET";
    private Runnable _eduRunnable;
    private boolean _eduWasLoaded;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private com.pinterest.ui.layout.AdapterLinearLayout.OnChildViewClickListener _onUserClickListener;
    private boolean _similarUsersAdded;
    private UserSuggestedPinnersView _suggestedPinnersView;
    private User _user;
    private UserMetadataView _userMetadataView;
    private com.pinterest.api.remote.ExperiencesApi.ExperienceResponseHandler eduHandler;
    private com.pinterest.api.remote.BoardApi.BoardFeedApiResponse onBoardsLoaded;
    private android.view.View.OnClickListener onCreateBoardClicked;
    private com.pinterest.api.remote.BoardApi.BoardFeedApiResponse onSecretLoaded;
    private com.pinterest.api.remote.UserApi.UserFeedApiResponse onSimilarUsersLoaded;

    public UserBoardsFragment()
    {
        _similarUsersAdded = false;
        onBoardsLoaded = new _cls1(gridResponseHandler);
        onSecretLoaded = new _cls2();
        onSimilarUsersLoaded = new _cls3();
        _onUserClickListener = new _cls4();
        _eventsSubscriber = new _cls5();
        eduHandler = new _cls6();
        onCreateBoardClicked = new _cls7();
        _layoutId = 0x7f03011a;
        _swipeOffsetEnd = (int)Resources.dimension(0x7f0a01f6) + Constants.MARGIN;
        _swipeOffsetStart = _swipeOffsetEnd - Constants.SWIPE_OFFSET_LENGTH;
    }

    private void addSuggestedUsers(User user)
    {
        if (_suggestedPinnersView != null || user == null)
        {
            return;
        } else
        {
            _suggestedPinnersView = new UserSuggestedPinnersView(getActivity());
            _suggestedPinnersView.setOrientation(1);
            _suggestedPinnersView.setOnChildViewClickListener(_onUserClickListener);
            UserApi.c(user.getUid(), onSimilarUsersLoaded, getApiTag());
            return;
        }
    }

    private boolean shouldShowEducation()
    {
        for (ExperienceValue experiencevalue = Experiences.b(String.valueOf(Placement.ANDROID_USER_PROFILE_TAKEOVER.getValue())); experiencevalue == null || experiencevalue.c != ExperienceType.GUIDE.getValue() || (new Education(experiencevalue.g)).getEid().equals(String.valueOf(Experience.ANDROID_PROFILE_OFFLINE_PIN_ED.getValue())) && !Experiments.v();)
        {
            return false;
        }

        return true;
    }

    private void updateSimilarUsers()
    {
        if (_user == null || _suggestedPinnersView == null || _suggestedPinnersView.getAdapter() == null)
        {
            return;
        } else
        {
            UserApi.c(_user.getUid(), onSimilarUsersLoaded, getApiTag());
            return;
        }
    }

    public void adjustScroll(int i)
    {
        scrollTo(0, i, true);
    }

    protected Feed getOfflineFeed(int i)
    {
        if (!_navigation.getId().equals(MyUser.getUid()) || i != 0)
        {
            return null;
        } else
        {
            BoardFeed boardfeed = new BoardFeed();
            boardfeed.setItems(ModelHelper.getUserPublicBoards(MyUser.getUid()));
            return boardfeed;
        }
    }

    public User getUser()
    {
        return _user;
    }

    public void loadData()
    {
        String s = getNavigation().getId();
        if (ModelHelper.isValid(s))
        {
            UserApi.a(s, onBoardsLoaded, getApiTag());
            if (MyUser.isUserMe(s))
            {
                MyUserApi.a(onSecretLoaded, getApiTag());
            }
        }
        super.loadData();
    }

    protected void onActivate()
    {
        super.onActivate();
        if (_eduWasLoaded)
        {
            String s = _navigation.getId();
            if (ModelHelper.isValid(s))
            {
                UserApi.a(Integer.toString(Placement.ANDROID_USER_PROFILE_TAKEOVER.getValue()), s, eduHandler, getApiTag());
            }
        }
        _emptyView.refresh();
        updateSimilarUsers();
    }

    protected void onBoardClicked(AdapterView adapterview, View view, int i, long l)
    {
        if (_adapter != null)
        {
            adapterview = (Board)((BoardGridAdapter)_adapter).getItem(i);
            if (adapterview != null)
            {
                Pinalytics.a(ElementType.BOARD_COVER, ComponentType.FLOWED_BOARD, adapterview.getUid());
                Events.post(new Navigation(Location.BOARD, adapterview));
                return;
            }
            if (_adapter instanceof MyUserBoardGridAdapter)
            {
                adapterview = (MyUserBoardGridAdapter)_adapter;
                if (adapterview.isCreateCell(i))
                {
                    Pinalytics.a(ElementType.BOARD_CREATE, ComponentType.FLOWED_BOARD);
                    Events.post(new DialogEvent(CreateBoardDialog.newInstance(null)));
                    return;
                }
                if (adapterview.isCreateSecretCell(i))
                {
                    Pinalytics.a(ElementType.BOARD_CREATE_SECRET, ComponentType.FLOWED_BOARD);
                    adapterview = CreateBoardDialog.newInstance(null);
                    adapterview.setIsSecretBoard(true);
                    Events.post(new DialogEvent(adapterview));
                    return;
                }
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (MyUser.isUserMe(_navigation.getId()))
        {
            _adapter = new MyUserBoardGridAdapter();
            bundle = Feed.restoreInstanceState(bundle, "__SECRET");
            if (bundle != null)
            {
                ((MyUserBoardGridAdapter)_adapter).setSecretDatasource(bundle);
            }
        }
        ((BoardGridAdapter)_adapter).setUser(_user);
    }

    public void onDestroyView()
    {
        EducationHelper.a(_eduRunnable);
        Events.unregister(_eventsSubscriber);
        _userMetadataView = null;
        _emptyView = null;
        _similarUsersAdded = false;
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (_adapter instanceof MyUserBoardGridAdapter)
        {
            Feed feed = ((MyUserBoardGridAdapter)_adapter).getSecretDatasource();
            if (feed != null)
            {
                feed.saveInstanceState(bundle, "__SECRET");
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if ((_adapter instanceof MyUserBoardGridAdapter) && ((MyUserBoardGridAdapter)_adapter).getSecretDatasource() != null)
        {
            _gridVw.getFooterView().setBackgroundColor(Colors.BG_GRID_DARK);
        }
        _eduWasLoaded = false;
        _userMetadataView = new UserMetadataView(view.getContext());
        _userMetadataView.setUser(_user);
        _userMetadataView.setMetadataBarMode(com.pinterest.ui.actionbar.MetadataBar.Mode.BOARDS);
        _gridVw.addHeaderView(_userMetadataView, -1, -2);
        Events.register(_eventsSubscriber, com/pinterest/api/model/User$UpdateEvent, new Class[] {
            com/pinterest/api/model/Board$UpdateEvent, com/pinterest/activity/notifications/NotificationCount$UpdateEvent
        });
        Events.registerSticky(_eventsSubscriber, com/pinterest/api/model/User$UserFollowEvent, new Class[] {
            com/pinterest/events/FeedEvents$MyBoardsInvalidated
        });
        updateEmptyContent();
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation == null)
        {
            return;
        } else
        {
            _user = navigation.getModelAsUser();
            return;
        }
    }

    protected void updateEmptyContent()
    {
        _emptyLeftImage = 0x7f020208;
        _emptyCenterImage = 0x7f020207;
        _emptyRightImage = 0x7f020206;
        if (MyUser.isUserMe(_navigation.getId()))
        {
            _emptyActionLabel = Resources.string(0x7f07025b);
            _emptyAction = onCreateBoardClicked;
        }
        if (MyUser.isUserMe(_navigation.getId()))
        {
            _emptyMessage = Resources.string(0x7f07025c);
            return;
        }
        if (_user != null && !TextUtils.isEmpty(_user.getFirstName()))
        {
            _emptyMessage = Resources.string(0x7f07023f, new Object[] {
                _user.getFirstName()
            });
            return;
        } else
        {
            _emptyMessage = Resources.string(0x7f070240);
            return;
        }
    }










/*
    static boolean access$1502(UserBoardsFragment userboardsfragment, boolean flag)
    {
        userboardsfragment._similarUsersAdded = flag;
        return flag;
    }

*/












/*
    static User access$2402(UserBoardsFragment userboardsfragment, User user)
    {
        userboardsfragment._user = user;
        return user;
    }

*/





/*
    static boolean access$2802(UserBoardsFragment userboardsfragment, boolean flag)
    {
        userboardsfragment._eduWasLoaded = flag;
        return flag;
    }

*/




/*
    static Runnable access$3002(UserBoardsFragment userboardsfragment, Runnable runnable)
    {
        userboardsfragment._eduRunnable = runnable;
        return runnable;
    }

*/










    private class _cls4
        implements com.pinterest.ui.layout.AdapterLinearLayout.OnChildViewClickListener
    {

        final UserBoardsFragment this$0;

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

        _cls4()
        {
            this$0 = UserBoardsFragment.this;
            super();
        }
    }


    private class _cls5
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final UserBoardsFragment this$0;

        public void onEventMainThread(com.pinterest.activity.notifications.NotificationCount.UpdateEvent updateevent)
        {
            int i = NotificationCount.getTotalUnseenCount();
            if (i != PWidgetProvider.getNotifCount())
            {
                PWidgetHelper.notifyWidgetStateChange(getActivity(), i);
            }
        }

        public void onEventMainThread(com.pinterest.api.model.Board.UpdateEvent updateevent)
        {
            Board board = updateevent.getBoard();
            boolean flag1 = false;
            if (board != null)
            {
                boolean flag = flag1;
                if (
// JavaClassFileOutputException: get_constant: invalid tag

        public void onEventMainThread(com.pinterest.api.model.User.UpdateEvent updateevent)
        {
            updateevent = updateevent.getUser();
            if (updateevent == null || !updateevent.equals(_user))
            {
                return;
            } else
            {
                _user = updateevent;
                return;
            }
        }

        public void onEventMainThread(com.pinterest.api.model.User.UserFollowEvent userfollowevent)
        {
            Events.removeStickyEvent(userfollowevent);
            userfollowevent = userfollowevent.getUser();
            break MISSING_BLOCK_LABEL_9;
            if (userfollowevent != null && userfollowevent.equals(_user) && !(
// JavaClassFileOutputException: get_constant: invalid tag

        public void onEventMainThread(com.pinterest.events.FeedEvents.MyBoardsInvalidated myboardsinvalidated)
        {
            Events.removeStickyEvent(myboardsinvalidated);
            refresh();
        }

        _cls5()
        {
            this$0 = UserBoardsFragment.this;
            super();
        }
    }


    private class _cls6 extends com.pinterest.api.remote.ExperiencesApi.ExperienceResponseHandler
    {

        final UserBoardsFragment this$0;

        public void onSuccess()
        {
            _eduWasLoaded = true;
            if (isActive() && shouldShowEducation())
            {
                _eduRunnable = EducationHelper.a(Placement.ANDROID_USER_PROFILE_TAKEOVER, UserBoardsFragment.this);
            }
        }

        _cls6()
        {
            this$0 = UserBoardsFragment.this;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnClickListener
    {

        final UserBoardsFragment this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.BOARD_CREATE, ComponentType.FLOWED_BOARD);
            Events.post(new DialogEvent(CreateBoardDialog.newInstance(null)));
        }

        _cls7()
        {
            this$0 = UserBoardsFragment.this;
            super();
        }
    }

}
