// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.appboy;

import com.appboy.d.b.a;
import com.soundcloud.android.events.AttributionEvent;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.events.SearchEvent;
import com.soundcloud.android.events.TrackingEvent;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.main.Screen;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.analytics.appboy:
//            AppboyAttributeName, AppboyWrapper

class AppboyEventHandler
{

    private static final List CREATOR_ATTRIBUTES;
    private static final List EXPLORE_CATEGORY_ATTRIBUTES;
    private static final List EXPLORE_GENRE_AND_CATEGORY;
    private static final List PLAYABLE_ATTRIBUTES;
    private static final List PLAYLIST_ATTRIBUTES;
    private final AppboyWrapper appboy;

    AppboyEventHandler(AppboyWrapper appboywrapper)
    {
        appboy = appboywrapper;
    }

    private a buildCreatorProperties(UIEvent uievent)
    {
        return buildProperties(CREATOR_ATTRIBUTES, uievent);
    }

    private a buildPlayableProperties(TrackingEvent trackingevent)
    {
        return buildProperties(PLAYABLE_ATTRIBUTES, trackingevent);
    }

    private a buildPlaylistProperties(UIEvent uievent)
    {
        return buildProperties(PLAYLIST_ATTRIBUTES, uievent);
    }

    private a buildProperties(List list, TrackingEvent trackingevent)
    {
        a a1 = new a();
        AppboyAttributeName appboyattributename;
        for (list = list.iterator(); list.hasNext(); a1.a(appboyattributename.getAppBoyKey(), trackingevent.get(appboyattributename.getEventKey())))
        {
            appboyattributename = (AppboyAttributeName)list.next();
        }

        return a1;
    }

    private boolean isCategoryScreen(ScreenEvent screenevent)
    {
        return screenevent.getScreenTag().equals(Screen.EXPLORE_GENRES.get()) || screenevent.getScreenTag().equals(Screen.EXPLORE_TRENDING_AUDIO.get()) || screenevent.getScreenTag().equals(Screen.EXPLORE_TRENDING_MUSIC.get());
    }

    private boolean isGenreScreen(ScreenEvent screenevent)
    {
        return screenevent.getScreenTag().startsWith("explore");
    }

    private boolean isSearchEverythingClick(SearchEvent searchevent)
    {
        return "search".equals(searchevent.get("click_name")) && Screen.SEARCH_EVERYTHING.get().equals(searchevent.get("page_name"));
    }

    private void tagEvent(String s)
    {
        appboy.logCustomEvent(s);
    }

    private void tagEvent(String s, a a1)
    {
        appboy.logCustomEvent(s, a1);
    }

    public void handleEvent(AttributionEvent attributionevent)
    {
        appboy.setAttribution(attributionevent.get("network"), attributionevent.get("campaign"), attributionevent.get("adgroup"), attributionevent.get("creative"));
    }

    public void handleEvent(ScreenEvent screenevent)
    {
        if (isCategoryScreen(screenevent))
        {
            tagEvent("explore", buildProperties(EXPLORE_CATEGORY_ATTRIBUTES, screenevent));
        } else
        if (isGenreScreen(screenevent))
        {
            tagEvent("explore", buildProperties(EXPLORE_GENRE_AND_CATEGORY, screenevent));
            return;
        }
    }

    public void handleEvent(SearchEvent searchevent)
    {
        if (searchevent.getKind().equals("submit") && isSearchEverythingClick(searchevent))
        {
            tagEvent("search");
        }
    }

    public void handleEvent(UIEvent uievent)
    {
        String s;
        byte byte0;
        s = uievent.getKind();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 68
    //                   -1499107915: 179
    //                   -1268958287: 123
    //                   -934521517: 165
    //                   3321751: 109
    //                   109400031: 151
    //                   950398559: 137;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_179;
_L8:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            tagEvent("like", buildPlayableProperties(uievent));
            return;

        case 1: // '\001'
            tagEvent("follow", buildCreatorProperties(uievent));
            return;

        case 2: // '\002'
            tagEvent("comment", buildPlayableProperties(uievent));
            return;

        case 3: // '\003'
            tagEvent("share", buildPlayableProperties(uievent));
            return;

        case 4: // '\004'
            tagEvent("repost", buildPlayableProperties(uievent));
            return;

        case 5: // '\005'
            tagEvent("create_playlist", buildPlaylistProperties(uievent));
            break;
        }
        break MISSING_BLOCK_LABEL_264;
_L5:
        if (s.equals("like"))
        {
            byte0 = 0;
        }
          goto _L8
_L3:
        if (s.equals("follow"))
        {
            byte0 = 1;
        }
          goto _L8
_L7:
        if (s.equals("comment"))
        {
            byte0 = 2;
        }
          goto _L8
_L6:
        if (s.equals("share"))
        {
            byte0 = 3;
        }
          goto _L8
_L4:
        if (s.equals("repost"))
        {
            byte0 = 4;
        }
          goto _L8
        if (s.equals("create_playlist"))
        {
            byte0 = 5;
        }
          goto _L8
    }

    static 
    {
        PLAYABLE_ATTRIBUTES = Arrays.asList(new AppboyAttributeName[] {
            AppboyAttributeName.CREATOR_DISPLAY_NAME, AppboyAttributeName.CREATOR_URN, AppboyAttributeName.PLAYABLE_TITLE, AppboyAttributeName.PLAYABLE_URN, AppboyAttributeName.PLAYABLE_TYPE
        });
        EXPLORE_CATEGORY_ATTRIBUTES = Collections.singletonList(AppboyAttributeName.CATEGORY);
        EXPLORE_GENRE_AND_CATEGORY = Arrays.asList(new AppboyAttributeName[] {
            AppboyAttributeName.GENRE, AppboyAttributeName.CATEGORY
        });
        CREATOR_ATTRIBUTES = Arrays.asList(new AppboyAttributeName[] {
            AppboyAttributeName.CREATOR_DISPLAY_NAME, AppboyAttributeName.CREATOR_URN
        });
        PLAYLIST_ATTRIBUTES = Arrays.asList(new AppboyAttributeName[] {
            AppboyAttributeName.PLAYLIST_TITLE, AppboyAttributeName.PLAYLIST_URN
        });
    }
}
