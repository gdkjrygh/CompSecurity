// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.view.ModifiedViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.pinterest.activity.notifications.adapter.NotificationsAdapter;
import com.pinterest.activity.notifications.view.NetworkStoryListCell;
import com.pinterest.activity.task.fragment.ViewPagerFragment;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.ui.actionbar.ActionBar;
import com.pinterest.ui.badge.AppBadgeUtils;
import com.pinterest.ui.tab.Tab;
import com.pinterest.ui.tab.TabBar;

// Referenced classes of package com.pinterest.activity.notifications:
//            NotificationCount

public class NotificationsFragment extends ViewPagerFragment
{

    private static final String LAST_SELECTED_NOTIFICATION_TAB = "LAST_SELECTED_NOTIFICATION_TAB";
    private Tab _conversationButton;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private Tab _newsButton;
    private android.support.v4.view.ModifiedViewPager.OnPageChangeListener _onPageChangedListener;
    private TabBar _tabBar;
    private com.pinterest.ui.tab.TabBar.Listener _tabListener;
    private Tab _yourStoryButton;

    public NotificationsFragment()
    {
        _tabListener = new _cls1();
        _onPageChangedListener = new _cls2();
        _eventsSubscriber = new _cls3();
    }

    private int getTabToShow()
    {
        byte byte0;
        int i;
        if (NotificationCount.getUnseenConversationCount() > 0)
        {
            byte0 = 2;
        } else
        if (NotificationCount.getUnseenYourStoryCount() > 0)
        {
            byte0 = 1;
        } else
        if (NotificationCount.getUnseenNetworkStoryCount() > 0)
        {
            byte0 = 0;
        } else
        {
            byte0 = -1;
        }
        i = byte0;
        if (byte0 == -1)
        {
            i = Preferences.user().getInt("LAST_SELECTED_NOTIFICATION_TAB", 0);
        }
        return i;
    }

    private void saveSelectedTab()
    {
        Preferences.user().getInt("LAST_SELECTED_NOTIFICATION_TAB", _tabBar.getSelectedIndex());
    }

    private void updateUnreadBadge(Tab tab, Integer integer)
    {
        boolean flag;
        if (integer != null && integer.intValue() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (tab != null)
        {
            if (flag)
            {
                integer = Resources.drawable(0x7f020265);
            } else
            {
                integer = null;
            }
            tab.setIcon(integer, 2);
        }
    }

    private void updateUnreadBadges()
    {
        updateUnreadBadge(_newsButton, Integer.valueOf(NotificationCount.getUnseenNetworkStoryCount()));
        updateUnreadBadge(_yourStoryButton, Integer.valueOf(NotificationCount.getUnseenYourStoryCount()));
        updateUnreadBadge(_conversationButton, Integer.valueOf(NotificationCount.getUnseenConversationCount()));
    }

    protected void onActivate()
    {
        NetworkStoryListCell.updateRelatedObjectsCount(getResources().getConfiguration().screenWidthDp);
        super.onActivate();
        AppBadgeUtils.removeBadge(Application.context());
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        NetworkStoryListCell.updateRelatedObjectsCount(configuration.screenWidthDp);
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300df;
        _menuId = 0x7f10000a;
        _viewAdapter = new NotificationsAdapter(getChildFragmentManager());
        _offScreenLimit = 2;
    }

    public void onDestroyView()
    {
        Events.unregister(_eventsSubscriber);
        saveSelectedTab();
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _actionBar.setTitle(0x7f07003c);
        _actionBarWrapper.setShadowVisibility(8);
        _tabBar = (TabBar)view.findViewById(0x7f0f007a);
        _tabBar.setMaxWidth((int)Resources.dimension(0x7f0a0135));
        _newsButton = (Tab)_tabBar.findViewById(0x7f0f026e);
        _yourStoryButton = (Tab)_tabBar.findViewById(0x7f0f026f);
        _conversationButton = (Tab)_tabBar.findViewById(0x7f0f0270);
        int i = getTabToShow();
        _tabBar.setCurrentIndex(i);
        _tabBar.setListener(_tabListener);
        _viewPager.setPageMargin((int)Resources.dimension(0x7f0a016c));
        _viewPager.setCurrentItem(i);
        _viewPager.setOnPageChangeListener(_onPageChangedListener);
        Events.register(_eventsSubscriber, com/pinterest/activity/notifications/NotificationCount$UpdateEvent, new Class[0]);
        updateUnreadBadges();
    }





    private class _cls2
        implements android.support.v4.view.ModifiedViewPager.OnPageChangeListener
    {

        final NotificationsFragment this$0;

        public void onPageScrollStateChanged(int i)
        {
        }

        public void onPageScrolled(int i, float f, int j)
        {
            _tabBar.setPagerScroll(i, f);
        }

        public void onPageSelected(int i)
        {
            _tabBar.setCurrentIndex(i);
            Pinalytics.a(NotificationsFragment.this);
        }

        _cls2()
        {
            this$0 = NotificationsFragment.this;
            super();
        }
    }


    private class _cls3
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final NotificationsFragment this$0;

        public void onEventMainThread(NotificationCount.UpdateEvent updateevent)
        {
            updateUnreadBadges();
        }

        _cls3()
        {
            this$0 = NotificationsFragment.this;
            super();
        }
    }

}
