// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.utils.ViewUtils;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import com.soundcloud.java.strings.Strings;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.main:
//            Screen, NavigationIntentHelper, NavigationModel, MainPagerAdapter

public class MainTabsPresenter extends DefaultActivityLightCycle
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{

    private AppCompatActivity activity;
    private final EventBus eventBus;
    private final BaseLayoutHelper layoutHelper;
    private NavigationModel navigationModel;
    private ViewPager pager;
    private MainPagerAdapter pagerAdapter;
    private final MainPagerAdapter.Factory pagerAdapterFactory;

    MainTabsPresenter(NavigationModel navigationmodel, BaseLayoutHelper baselayouthelper, MainPagerAdapter.Factory factory, EventBus eventbus)
    {
        navigationModel = navigationmodel;
        layoutHelper = baselayouthelper;
        pagerAdapterFactory = factory;
        eventBus = eventbus;
    }

    private void addToToolbar(TabLayout tablayout)
    {
        Toolbar toolbar = (Toolbar)activity.findViewById(0x7f0f0022);
        toolbar.setContentInsetsAbsolute(0, 0);
        toolbar.addView(tablayout);
    }

    private void bindPagerWithTabs(TabLayout tablayout)
    {
        pager.setAdapter(pagerAdapter);
        tablayout.setOnTabSelectedListener(tabSelectedListener(pager, pagerAdapter));
        pager.addOnPageChangeListener(pageChangeListenerFor(tablayout));
        setTabIcons(pagerAdapter, tablayout, pager.getCurrentItem());
    }

    private View createTabViewFor(int i)
    {
        ImageView imageview = new ImageView(activity);
        imageview.setImageResource(i);
        i = (int)imageview.getContext().getResources().getDimension(0x7f0b0030);
        imageview.setPadding(i, 0, i, 0);
        return imageview;
    }

    private TabLayout createTabs()
    {
        TabLayout tablayout = new TabLayout(activity);
        tablayout.setTabGravity(0);
        tablayout.setTabMode(1);
        tablayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        addToToolbar(tablayout);
        return tablayout;
    }

    private static android.support.v4.view.ViewPager.OnPageChangeListener pageChangeListenerFor(final TabLayout final_tablayout)
    {
        return new _cls2(final_tablayout);
    }

    private void resolveAction(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 40
    //                   -2083382138: 97
    //                   -2069035426: 69
    //                   -1620328836: 83;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_97;
_L5:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            selectItem(Screen.STREAM);
            return;

        case 1: // '\001'
            selectItem(Screen.COLLECTIONS);
            return;

        case 2: // '\002'
            selectItem(Screen.SEARCH_MAIN);
            break;
        }
        break MISSING_BLOCK_LABEL_134;
_L3:
        if (s.equals("com.soundcloud.android.action.STREAM"))
        {
            byte0 = 0;
        }
          goto _L5
_L4:
        if (s.equals("com.soundcloud.android.action.COLLECTION"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("com.soundcloud.android.action.SEARCH"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    private void resolveData(Uri uri)
    {
        if (NavigationIntentHelper.shouldGoToStream(uri))
        {
            selectItem(Screen.STREAM);
        } else
        if (NavigationIntentHelper.shouldGoToSearch(uri))
        {
            selectItem(Screen.SEARCH_MAIN);
            return;
        }
    }

    private void selectItem(Screen screen)
    {
        int i = navigationModel.getPosition(screen);
        if (i != -1)
        {
            pager.setCurrentItem(i);
        }
    }

    private void setTabFromIntent(Intent intent)
    {
        Uri uri = intent.getData();
        intent = intent.getAction();
        if (uri != null)
        {
            resolveData(uri);
        } else
        if (Strings.isNotBlank(intent))
        {
            resolveAction(intent);
            return;
        }
    }

    private void setTabIcons(MainPagerAdapter mainpageradapter, TabLayout tablayout, int i)
    {
        int k = mainpageradapter.getCount();
        tablayout.removeAllTabs();
        int j = 0;
        while (j < k) 
        {
            mainpageradapter = tablayout.newTab();
            mainpageradapter.setCustomView(createTabViewFor(navigationModel.getItem(j).getIcon()));
            mainpageradapter.setContentDescription(navigationModel.getItem(j).getName());
            boolean flag;
            if (j == i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            tablayout.addTab(mainpageradapter, j, flag);
            j++;
        }
    }

    private void setupViews(AppCompatActivity appcompatactivity)
    {
        pager = (ViewPager)appcompatactivity.findViewById(0x7f0f00b7);
        pager.setPageMargin(ViewUtils.dpToPx(appcompatactivity, 10));
        pager.setPageMarginDrawable(0x7f0e00a3);
        bindPagerWithTabs(createTabs());
    }

    private static android.support.design.widget.TabLayout.ViewPagerOnTabSelectedListener tabSelectedListener(final ViewPager final_viewpager, MainPagerAdapter mainpageradapter)
    {
        return new _cls1(mainpageradapter);
    }

    public volatile void onCreate(Activity activity1, Bundle bundle)
    {
        onCreate((AppCompatActivity)activity1, bundle);
    }

    public void onCreate(AppCompatActivity appcompatactivity, Bundle bundle)
    {
        activity = appcompatactivity;
        pagerAdapter = pagerAdapterFactory.create(appcompatactivity.getSupportFragmentManager());
        setupViews(appcompatactivity);
        if (bundle == null)
        {
            setTabFromIntent(appcompatactivity.getIntent());
        }
    }

    public volatile void onNewIntent(Activity activity1, Intent intent)
    {
        onNewIntent((AppCompatActivity)activity1, intent);
    }

    public void onNewIntent(AppCompatActivity appcompatactivity, Intent intent)
    {
        setTabFromIntent(intent);
    }

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        trackScreen();
    }

    public volatile void onPause(Activity activity1)
    {
        onPause((AppCompatActivity)activity1);
    }

    public void onPause(AppCompatActivity appcompatactivity)
    {
        pager.removeOnPageChangeListener(this);
    }

    public volatile void onResume(Activity activity1)
    {
        onResume((AppCompatActivity)activity1);
    }

    public void onResume(AppCompatActivity appcompatactivity)
    {
        pager.addOnPageChangeListener(this);
    }

    public void setBaseLayout(AppCompatActivity appcompatactivity)
    {
        layoutHelper.setBaseTabsLayout(appcompatactivity);
    }

    public void trackScreen()
    {
        Screen screen = navigationModel.getItem(pager.getCurrentItem()).getScreen();
        eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(screen));
    }

    private class _cls2 extends android.support.design.widget.TabLayout.TabLayoutOnPageChangeListener
    {

        final TabLayout val$tabBar;

        public final void onPageSelected(int i)
        {
            if (tabBar.getSelectedTabPosition() != i)
            {
                super.onPageSelected(i);
            }
        }

        _cls2(TabLayout tablayout1)
        {
            tabBar = tablayout1;
            super(final_tablayout);
        }
    }


    private class _cls1 extends android.support.design.widget.TabLayout.ViewPagerOnTabSelectedListener
    {

        final MainPagerAdapter val$pagerAdapter;

        public final void onTabReselected(android.support.design.widget.TabLayout.Tab tab)
        {
            pagerAdapter.resetScroll(tab.getPosition());
        }

        _cls1(MainPagerAdapter mainpageradapter)
        {
            pagerAdapter = mainpageradapter;
            super(final_viewpager);
        }
    }

}
