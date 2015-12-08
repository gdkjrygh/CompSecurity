// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.presentation.PagingListItemAdapter;
import com.soundcloud.android.tracks.DownloadableTrackItemRenderer;
import com.soundcloud.android.tracks.TrackItemRenderer;

class PagedTracksAdapter extends PagingListItemAdapter
{

    private final TrackItemRenderer trackRenderer;

    PagedTracksAdapter(DownloadableTrackItemRenderer downloadabletrackitemrenderer)
    {
        super(downloadabletrackitemrenderer);
        trackRenderer = downloadabletrackitemrenderer;
    }

    TrackItemRenderer getTrackRenderer()
    {
        return trackRenderer;
    }
}
