// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;


class _cls9
{

    static final int $SwitchMap$com$soundcloud$android$discovery$DiscoveryItem$Kind[];

    static 
    {
        $SwitchMap$com$soundcloud$android$discovery$DiscoveryItem$Kind = new int[values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$discovery$DiscoveryItem$Kind[TrackRecommendationItem.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$soundcloud$android$discovery$DiscoveryItem$Kind[PlaylistTagsItem.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$discovery$DiscoveryItem$Kind[SearchItem.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
