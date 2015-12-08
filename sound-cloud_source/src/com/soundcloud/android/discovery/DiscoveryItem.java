// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;


abstract class DiscoveryItem
{
    static final class Kind extends Enum
    {

        private static final Kind $VALUES[];
        public static final Kind PlaylistTagsItem;
        public static final Kind SearchItem;
        public static final Kind TrackRecommendationItem;

        public static Kind valueOf(String s)
        {
            return (Kind)Enum.valueOf(com/soundcloud/android/discovery/DiscoveryItem$Kind, s);
        }

        public static Kind[] values()
        {
            return (Kind[])$VALUES.clone();
        }

        static 
        {
            TrackRecommendationItem = new Kind("TrackRecommendationItem", 0);
            PlaylistTagsItem = new Kind("PlaylistTagsItem", 1);
            SearchItem = new Kind("SearchItem", 2);
            $VALUES = (new Kind[] {
                TrackRecommendationItem, PlaylistTagsItem, SearchItem
            });
        }

        private Kind(String s, int i)
        {
            super(s, i);
        }
    }


    private final Kind kind;

    DiscoveryItem(Kind kind1)
    {
        kind = kind1;
    }

    Kind getKind()
    {
        return kind;
    }
}
