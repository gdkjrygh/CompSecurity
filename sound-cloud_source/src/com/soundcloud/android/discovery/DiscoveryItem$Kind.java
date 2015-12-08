// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;


// Referenced classes of package com.soundcloud.android.discovery:
//            DiscoveryItem

static final class _cls9 extends Enum
{

    private static final SearchItem $VALUES[];
    public static final SearchItem PlaylistTagsItem;
    public static final SearchItem SearchItem;
    public static final SearchItem TrackRecommendationItem;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/soundcloud/android/discovery/DiscoveryItem$Kind, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        TrackRecommendationItem = new <init>("TrackRecommendationItem", 0);
        PlaylistTagsItem = new <init>("PlaylistTagsItem", 1);
        SearchItem = new <init>("SearchItem", 2);
        $VALUES = (new .VALUES[] {
            TrackRecommendationItem, PlaylistTagsItem, SearchItem
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
