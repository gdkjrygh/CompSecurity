// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;

// Referenced classes of package com.soundcloud.android.search:
//            SearchPagerAdapter

public class TabbedSearchFragment extends Fragment
{
    protected static class SearchPagerScreenListener
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        private final EventBus eventBus;

        public void onPageScrollStateChanged(int i)
        {
        }

        public void onPageScrolled(int i, float f, int j)
        {
        }

        public void onPageSelected(int i)
        {
            switch (i)
            {
            default:
                throw new IllegalArgumentException("Did not recognise page in pager to publish screen event");

            case 0: // '\0'
                eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.SEARCH_EVERYTHING));
                return;

            case 1: // '\001'
                eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.SEARCH_TRACKS));
                return;

            case 2: // '\002'
                eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.SEARCH_PLAYLISTS));
                return;

            case 3: // '\003'
                eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.SEARCH_USERS));
                break;
            }
        }

        public SearchPagerScreenListener(EventBus eventbus)
        {
            eventBus = eventbus;
        }
    }


    private static final String KEY_QUERY = "query";
    public static final String TAG = "tabbed_search";
    EventBus eventBus;
    private ViewPager pager;
    Resources resources;

    public TabbedSearchFragment()
    {
        setRetainInstance(true);
        SoundCloudApplication.getObjectGraph().a(this);
    }

    TabbedSearchFragment(EventBus eventbus, Resources resources1)
    {
        eventBus = eventbus;
        resources = resources1;
    }

    public static TabbedSearchFragment newInstance(String s)
    {
        TabbedSearchFragment tabbedsearchfragment = new TabbedSearchFragment();
        Bundle bundle = new Bundle();
        bundle.putString("query", s);
        tabbedsearchfragment.setArguments(bundle);
        return tabbedsearchfragment;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.SEARCH_EVERYTHING));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300c1, viewgroup, false);
        layoutinflater.setBackgroundColor(getResources().getColor(0x7f0e00b1));
        return layoutinflater;
    }

    public void onDestroyView()
    {
        pager = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        String s = getArguments().getString("query");
        boolean flag;
        if (bundle == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle = new SearchPagerAdapter(resources, getChildFragmentManager(), s, flag);
        pager = (ViewPager)view.findViewById(0x7f0f00b7);
        pager.setAdapter(bundle);
        pager.setPageMarginDrawable(0x7f0200fa);
        pager.setPageMargin(resources.getDimensionPixelOffset(0x7f0b0110));
        ((TabLayout)view.findViewById(0x7f0f0169)).setupWithViewPager(pager);
        pager.addOnPageChangeListener(new SearchPagerScreenListener(eventBus));
    }
}
