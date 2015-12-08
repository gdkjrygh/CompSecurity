// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import java.util.List;

// Referenced classes of package com.soundcloud.android.discovery:
//            DiscoveryItem

class PlaylistDiscoveryItem extends DiscoveryItem
{

    private final List popularTags;
    private final List recentTags;

    PlaylistDiscoveryItem(List list, List list1)
    {
        super(DiscoveryItem.Kind.PlaylistTagsItem);
        popularTags = list;
        recentTags = list1;
    }

    List getPopularTags()
    {
        return popularTags;
    }

    List getRecentTags()
    {
        return recentTags;
    }
}
