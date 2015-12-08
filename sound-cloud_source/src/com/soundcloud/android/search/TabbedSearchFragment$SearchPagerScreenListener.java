// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.search:
//            TabbedSearchFragment

protected static class eventBus
    implements android.support.v4.view.tener
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

    public (EventBus eventbus)
    {
        eventBus = eventbus;
    }
}
