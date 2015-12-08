// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import com.soundcloud.android.presentation.PagingListItemAdapter;
import com.soundcloud.android.tracks.TrackGridRenderer;

public class ExploreModule
{

    public ExploreModule()
    {
    }

    public PagingListItemAdapter provideEndlessAdapter(TrackGridRenderer trackgridrenderer)
    {
        return new PagingListItemAdapter(0x7f03006c, trackgridrenderer);
    }
}
