// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.provider.Content;
import java.util.Locale;

// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public final class SearchEvent extends TrackingEvent
{

    public static final String CLICK_NAME_ITEM_NAVIGATION = "item_navigation";
    public static final String CLICK_NAME_OPEN_PLAYLIST = "open_playlist";
    public static final String CLICK_NAME_OPEN_PROFILE = "open_profile";
    public static final String CLICK_NAME_PLAY = "play";
    public static final String CLICK_NAME_SEARCH = "search";
    private static final String CONTEXT_EVERYTHING = "everything";
    private static final String CONTEXT_GLOBAL = "global";
    private static final String CONTEXT_PEOPLE = "people";
    private static final String CONTEXT_PERSONAL = "personal";
    private static final String CONTEXT_PLAYLISTS = "playlists";
    private static final String CONTEXT_TAGS = "tags";
    private static final String CONTEXT_TRACKS = "tracks";
    public static final String KEY_CLICK_NAME = "click_name";
    public static final String KEY_CLICK_OBJECT = "click_object";
    public static final String KEY_CONTENT = "content";
    public static final String KEY_CONTEXT = "context";
    private static final String KEY_LOCATION = "location";
    public static final String KEY_PAGE_NAME = "page_name";
    public static final String KEY_QUERY_URN = "query_urn";
    public static final String KEY_TYPE = "type";
    public static final String KIND_RESULTS = "results";
    public static final String KIND_SUBMIT = "submit";
    public static final String KIND_SUGGESTION = "suggestion";
    private static final String LOCATION_FIELD = "search_field";
    private static final String LOCATION_POPULAR_TAGS = "popular_tags";
    private static final String LOCATION_RECENT_TAGS = "recent_tags";
    private static final String LOCATION_SUGGESTION = "search_suggestion";
    private static final String TYPE_NORMAL = "normal";
    private static final String TYPE_PLAYLIST = "playlist";
    private static final String TYPE_TAG = "tag";
    private static final String TYPE_TRACK = "track";
    private static final String TYPE_USER = "user";
    private int clickPosition;

    private SearchEvent(String s)
    {
        super(s, System.currentTimeMillis());
        clickPosition = -1;
    }

    private SearchEvent addSearchQuerySourceInfo(SearchQuerySourceInfo searchquerysourceinfo)
    {
        if (searchquerysourceinfo != null)
        {
            put("query_urn", searchquerysourceinfo.getQueryUrn().toString());
            int i = searchquerysourceinfo.getClickPosition();
            if (i >= 0)
            {
                clickPosition = i;
            }
            if (searchquerysourceinfo.getClickUrn() != null)
            {
                put("click_object", searchquerysourceinfo.getClickUrn().toString());
            }
        }
        return this;
    }

    private static String eventAttributeFromScreen(Screen screen)
    {
        switch (_cls1..SwitchMap.com.soundcloud.android.main.Screen[screen.ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unexpected screen: ")).append(screen).toString());

        case 1: // '\001'
            return "everything";

        case 2: // '\002'
            return "tracks";

        case 3: // '\003'
            return "playlists";

        case 4: // '\004'
            return "people";

        case 5: // '\005'
            return "tags";
        }
    }

    public static SearchEvent popularTagSearch(String s)
    {
        return (SearchEvent)(new SearchEvent("submit")).put("type", "tag").put("location", "popular_tags").put("content", s);
    }

    public static SearchEvent recentTagSearch(String s)
    {
        return (SearchEvent)(new SearchEvent("submit")).put("type", "tag").put("location", "recent_tags").put("content", s);
    }

    public static SearchEvent searchField(String s, boolean flag, boolean flag1)
    {
        Object obj = new SearchEvent("submit");
        String s1;
        if (flag1)
        {
            s1 = "tag";
        } else
        {
            s1 = "normal";
        }
        obj = ((SearchEvent) (obj)).put("type", s1);
        if (flag)
        {
            s1 = "search_suggestion";
        } else
        {
            s1 = "search_field";
        }
        return (SearchEvent)((TrackingEvent) (obj)).put("location", s1).put("click_name", "search").put("content", s);
    }

    public static SearchEvent searchStart(Screen screen, SearchQuerySourceInfo searchquerysourceinfo)
    {
        return ((SearchEvent)((SearchEvent)(new SearchEvent("submit")).put("page_name", screen.get())).put("click_name", "search")).addSearchQuerySourceInfo(searchquerysourceinfo);
    }

    public static SearchEvent searchSuggestion(Content content, boolean flag, SearchQuerySourceInfo searchquerysourceinfo)
    {
        SearchEvent searchevent = (SearchEvent)((SearchEvent)((SearchEvent)(new SearchEvent("suggestion")).put("page_name", Screen.SEARCH_SUGGESTIONS.get())).put("click_name", "item_navigation")).put("type", content.name().toLowerCase(Locale.US));
        if (flag)
        {
            content = "personal";
        } else
        {
            content = "global";
        }
        return ((SearchEvent)searchevent.put("context", content)).addSearchQuerySourceInfo(searchquerysourceinfo);
    }

    public static SearchEvent tapPlaylistOnScreen(Screen screen)
    {
        return tapPlaylistOnScreen(screen, null);
    }

    public static SearchEvent tapPlaylistOnScreen(Screen screen, SearchQuerySourceInfo searchquerysourceinfo)
    {
        return ((SearchEvent)((SearchEvent)((SearchEvent)((SearchEvent)(new SearchEvent("results")).put("page_name", screen.get())).put("click_name", "open_playlist")).put("type", "playlist")).put("context", eventAttributeFromScreen(screen))).addSearchQuerySourceInfo(searchquerysourceinfo);
    }

    public static SearchEvent tapTrackOnScreen(Screen screen, SearchQuerySourceInfo searchquerysourceinfo)
    {
        return ((SearchEvent)((SearchEvent)((SearchEvent)((SearchEvent)(new SearchEvent("results")).put("page_name", screen.get())).put("click_name", "play")).put("type", "track")).put("context", eventAttributeFromScreen(screen))).addSearchQuerySourceInfo(searchquerysourceinfo);
    }

    public static SearchEvent tapUserOnScreen(Screen screen, SearchQuerySourceInfo searchquerysourceinfo)
    {
        return ((SearchEvent)((SearchEvent)((SearchEvent)((SearchEvent)(new SearchEvent("results")).put("page_name", screen.get())).put("click_name", "open_profile")).put("type", "user")).put("context", eventAttributeFromScreen(screen))).addSearchQuerySourceInfo(searchquerysourceinfo);
    }

    public final int getClickPosition()
    {
        return clickPosition;
    }

    public final String toString()
    {
        return String.format("Search Event with type id %s and %s", new Object[] {
            kind, attributes.toString()
        });
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$main$Screen[];

        static 
        {
            $SwitchMap$com$soundcloud$android$main$Screen = new int[Screen.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$main$Screen[Screen.SEARCH_EVERYTHING.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$soundcloud$android$main$Screen[Screen.SEARCH_TRACKS.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$soundcloud$android$main$Screen[Screen.SEARCH_PLAYLISTS.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$main$Screen[Screen.SEARCH_USERS.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$main$Screen[Screen.SEARCH_PLAYLIST_DISCO.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
