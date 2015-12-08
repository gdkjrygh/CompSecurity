// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.TaggedFragment;
import android.support.v4.util.Pair;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.activity.notifications.NotificationCount;
import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.Refreshable;
import com.pinterest.api.ApiHttpClient;
import com.pinterest.api.remote.ApiServices;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.di.HasComponent;
import com.pinterest.di.components.ActivityComponent;
import com.pinterest.di.components.DaggerFragmentComponent;
import com.pinterest.di.components.FragmentComponent;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.kit.utils.MenuUtils;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.actionbar.ActionBar;
import com.pinterest.ui.actions.Scrollable;
import com.pinterest.ui.actions.ScrollableListener;

public class BaseFragment extends Fragment
    implements TaggedFragment, Refreshable, HasComponent, Scrollable
{

    protected Toolbar _actionBar;
    protected ActionBar _actionBarWrapper;
    protected boolean _active;
    protected ApiServices _apiServices;
    protected boolean _cutout;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private FragmentComponent _fragmentComponent;
    protected long _lastRefresh;
    protected int _layoutId;
    protected int _menuId;
    protected Navigation _navigation;
    protected boolean _refreshing;
    protected boolean _reshowActionBar;
    protected ScrollableListener _scrollListener;

    public BaseFragment()
    {
        _layoutId = 0x7f030110;
        _menuId = 0x7f100004;
        _eventsSubscriber = new _cls7();
        _reshowActionBar = true;
    }

    private FragmentComponent initializeComponent()
    {
        _fragmentComponent = DaggerFragmentComponent.a().a((ActivityComponent)((HasComponent)getActivity()).getComponent()).a();
        return _fragmentComponent;
    }

    private void updateNotificationBadge()
    {
        View view = _actionBar.findViewById(0x7f0f04ad);
        if (view != null)
        {
            boolean flag;
            if (NotificationCount.getTotalUnseenCount() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ViewHelper.setVisibility(view, flag);
        }
    }

    public String getApiTag()
    {
        if (_navigation == null)
        {
            return getClass().getName();
        } else
        {
            return _navigation.toString();
        }
    }

    public FragmentComponent getComponent()
    {
        return _fragmentComponent;
    }

    public volatile Object getComponent()
    {
        return getComponent();
    }

    public String getFragmentTag()
    {
        return getClass().getSimpleName();
    }

    public long getLastRefresh()
    {
        return _lastRefresh;
    }

    public Navigation getNavigation()
    {
        return _navigation;
    }

    public Pair getScrollPosition()
    {
        return new Pair(Integer.valueOf(0), Integer.valueOf(0));
    }

    public String getTaskDataId()
    {
        return _navigation.getId();
    }

    protected void hideWaitDialog()
    {
        Events.post(new DialogEvent(null));
    }

    public boolean isActive()
    {
        return _active;
    }

    protected void loadData()
    {
    }

    protected boolean onActionIconClick(MenuItem menuitem)
    {
        return MenuUtils.onOptionsItemSelected(menuitem, getActivity());
    }

    protected void onActivate()
    {
        if (_reshowActionBar && _actionBarWrapper != null)
        {
            _actionBarWrapper.setTranslationY(0.0F);
        }
    }

    public boolean onBackPressed()
    {
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        if (_navigation == null)
        {
            Bundle bundle1 = getArguments();
            if (bundle1 != null)
            {
                setNavigation((Navigation)bundle1.getParcelable("NAVIGATION_MODEL_BUNDLE_KEY"));
            }
        }
        super.onCreate(bundle);
        setRetainInstance(false);
        initializeComponent().inject(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(_layoutId, viewgroup, false);
        if (_navigation != null && _navigation.getDisplayMode() == com.pinterest.activity.task.model.Navigation.DisplayMode.OVERLAY)
        {
            viewgroup.setClickable(true);
            layoutinflater = new FrameLayout(viewgroup.getContext());
            layoutinflater.setOnClickListener(new _cls1());
            int j = (int)Resources.dimension(0x7f0a0178);
            int i = (int)Resources.dimension(0x7f0a0177);
            i = (int)(Device.getScreenWidth() - (float)i) / 2;
            if (i <= 0)
            {
                i = j;
            }
            layoutinflater.setPadding(i, j, i, j);
            layoutinflater.addView(viewgroup);
            viewgroup = new ImageView(viewgroup.getContext());
            viewgroup.setImageResource(0x7f020151);
            viewgroup.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            viewgroup.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            layoutinflater.addView(viewgroup);
            return layoutinflater;
        } else
        {
            return viewgroup;
        }
    }

    protected void onDeactivate()
    {
    }

    public void onDestroy()
    {
        setScrollListener(null);
        super.onDestroy();
        Application.watch(this);
    }

    public void onDestroyView()
    {
        Events.unregister(_eventsSubscriber);
        _actionBarWrapper = null;
        if (_actionBar != null)
        {
            View view = _actionBar.findViewById(0x7f0f04ac);
            if (view != null)
            {
                view.setOnClickListener(null);
            }
            _actionBar.setNavigationOnClickListener(null);
            _actionBar.setOnClickListener(null);
            _actionBar.setOnLongClickListener(null);
            _actionBar.setOnMenuItemClickListener(null);
            _actionBar = null;
        }
        ApiHttpClient.cancelPendingRequests(getApiTag());
        super.onDestroyView();
    }

    public void onPause()
    {
        super.onPause();
        setActive(false);
    }

    public void onResume()
    {
        super.onResume();
    }

    public void onStop()
    {
        super.onStop();
    }

    protected void onUpClick(View view)
    {
        pressBackButton();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _actionBarWrapper = (ActionBar)view.findViewById(0x7f0f008e);
        if (_actionBarWrapper != null)
        {
            _actionBar = _actionBarWrapper.getActionBar();
        }
        if (_actionBar != null)
        {
            if (_menuId > 0)
            {
                _actionBar.inflateMenu(_menuId);
            }
            _actionBar.setNavigationIcon(0x7f02015c);
            _actionBar.setNavigationOnClickListener(new _cls2());
            _actionBar.setOnMenuItemClickListener(new _cls3());
            _actionBar.setOnClickListener(new _cls4());
            _actionBar.setOnLongClickListener(new _cls5());
            bundle = _actionBar.findViewById(0x7f0f04ac);
            if (bundle != null)
            {
                updateNotificationBadge();
                bundle.setOnClickListener(new _cls6());
            }
            DrawableUtils.tintToolbarIcons(_actionBar, 0x7f0e006d);
            Events.register(_eventsSubscriber, com/pinterest/activity/notifications/NotificationCount$UpdateEvent, new Class[0]);
        }
        if (_cutout && (view instanceof FrameLayout) && (_navigation == null || _navigation.getDisplayMode() != com.pinterest.activity.task.model.Navigation.DisplayMode.OVERLAY))
        {
            bundle = new ImageView(view.getContext());
            bundle.setImageResource(0x7f020044);
            bundle.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            bundle.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            ((ViewGroup)view).addView(bundle);
        }
    }

    protected void pressBackButton()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            fragmentactivity.onBackPressed();
        }
    }

    public void refresh()
    {
        _refreshing = true;
        _lastRefresh = System.currentTimeMillis();
        loadData();
    }

    public void scrollTo(int i, int j)
    {
    }

    public void setActive(boolean flag)
    {
label0:
        {
            boolean flag1 = true;
            PLog.logv("#setActive %s %b", new Object[] {
                getClass().getSimpleName(), Boolean.valueOf(flag)
            });
            if (_active == flag)
            {
                flag1 = false;
            }
            _active = flag;
            if (flag1)
            {
                if (!_active)
                {
                    break label0;
                }
                onActivate();
            }
            return;
        }
        onDeactivate();
    }

    public void setCutout(boolean flag)
    {
        _cutout = flag;
    }

    public void setNavigation(Navigation navigation)
    {
        _navigation = navigation;
        if (getActivity() == null)
        {
            Bundle bundle1 = getArguments();
            Bundle bundle;
            if (bundle1 == null)
            {
                bundle = new Bundle();
            } else
            {
                bundle = bundle1;
                if (bundle1.containsKey("NAVIGATION_MODEL_BUNDLE_KEY"))
                {
                    return;
                }
            }
            bundle.putParcelable("NAVIGATION_MODEL_BUNDLE_KEY", navigation);
            setArguments(bundle);
        }
        if (_navigation == null)
        {
            CrashReporting.b("Navigation: null");
            return;
        } else
        {
            CrashReporting.b((new StringBuilder("Navigation: ")).append(_navigation.toBreadCrumb()).toString());
            return;
        }
    }

    public void setScrollListener(ScrollableListener scrollablelistener)
    {
        _scrollListener = scrollablelistener;
    }

    protected void showWaitDialog()
    {
        showWaitDialog(0x7f070342);
    }

    protected void showWaitDialog(int i)
    {
        showWaitDialog(Resources.string(i));
    }

    protected void showWaitDialog(String s)
    {
        Events.post(new DialogEvent(new LoadingDialog(s)));
    }


    private class _cls7
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final BaseFragment this$0;

        public void onEventMainThread(com.pinterest.activity.notifications.NotificationCount.UpdateEvent updateevent)
        {
            updateNotificationBadge();
        }

        _cls7()
        {
            this$0 = BaseFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final BaseFragment this$0;

        public void onClick(View view)
        {
            pressBackButton();
        }

        _cls1()
        {
            this$0 = BaseFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final BaseFragment this$0;

        public void onClick(View view)
        {
            onUpClick(view);
        }

        _cls2()
        {
            this$0 = BaseFragment.this;
            super();
        }
    }


    private class _cls3
        implements android.support.v7.widget.Toolbar.OnMenuItemClickListener
    {

        final BaseFragment this$0;

        public boolean onMenuItemClick(MenuItem menuitem)
        {
            return onActionIconClick(menuitem);
        }

        _cls3()
        {
            this$0 = BaseFragment.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final BaseFragment this$0;

        public void onClick(View view)
        {
            scrollTo(0, 0);
        }

        _cls4()
        {
            this$0 = BaseFragment.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnLongClickListener
    {

        final BaseFragment this$0;

        public boolean onLongClick(View view)
        {
            CharSequence charsequence = _actionBar.getTitle();
            if (charsequence != null)
            {
                view = Toast.makeText(view.getContext(), String.valueOf(charsequence), 1);
                view.setGravity(51, 72, Constants.ACTIONBAR_HEIGHT);
                view.show();
                return true;
            } else
            {
                return false;
            }
        }

        _cls5()
        {
            this$0 = BaseFragment.this;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final BaseFragment this$0;

        public void onClick(View view)
        {
            view = _actionBar.getMenu().findItem(0x7f0f0506);
            if (view != null)
            {
                onActionIconClick(view);
            }
        }

        _cls6()
        {
            this$0 = BaseFragment.this;
            super();
        }
    }

}
