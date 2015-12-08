// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.rx.eventbus.EventBus;

class ExplorePagerScreenListener
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{

    private final EventBus eventBus;

    public ExplorePagerScreenListener(EventBus eventbus)
    {
        eventBus = eventbus;
    }

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
            eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.EXPLORE_GENRES));
            return;

        case 1: // '\001'
            eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.EXPLORE_TRENDING_MUSIC));
            return;

        case 2: // '\002'
            eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.EXPLORE_TRENDING_AUDIO));
            break;
        }
    }
}
