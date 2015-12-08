// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.collections.PlaylistsOptions;

// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public final class CollectionEvent extends TrackingEvent
{

    public static final String FILTER_ALL = "filter:all";
    public static final String FILTER_CREATED = "filter:created";
    public static final String FILTER_LIKED = "filter:liked";
    public static final String KEY_OBJECT = "click_object";
    public static final String KEY_TARGET = "click_target";
    public static final String KIND_CLEAR = "filter_clear";
    public static final String KIND_SET = "filter_set";
    public static final String SORT_RECENT = "sort:recent";
    public static final String SORT_TITLE = "sort:title";

    private CollectionEvent(String s)
    {
        super(s, System.currentTimeMillis());
    }

    public static CollectionEvent forClearFilter()
    {
        return new CollectionEvent("filter_clear");
    }

    public static CollectionEvent forFilter(PlaylistsOptions playlistsoptions)
    {
        CollectionEvent collectionevent = new CollectionEvent("filter_set");
        collectionevent.put("click_object", getObjectTag(playlistsoptions));
        if (playlistsoptions.sortByTitle())
        {
            playlistsoptions = "sort:title";
        } else
        {
            playlistsoptions = "sort:recent";
        }
        collectionevent.put("click_target", playlistsoptions);
        return collectionevent;
    }

    private static String getObjectTag(PlaylistsOptions playlistsoptions)
    {
        if (playlistsoptions.showLikes() && !playlistsoptions.showPosts())
        {
            return "filter:liked";
        }
        if (playlistsoptions.showPosts() && !playlistsoptions.showLikes())
        {
            return "filter:created";
        } else
        {
            return "filter:all";
        }
    }
}
