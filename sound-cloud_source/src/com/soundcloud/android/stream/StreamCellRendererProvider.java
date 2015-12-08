// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import dagger.Lazy;

class StreamCellRendererProvider
{

    private CellRenderer playlistItemRenderer;
    private CellRenderer trackItemRenderer;

    StreamCellRendererProvider(FeatureFlags featureflags, Lazy lazy, Lazy lazy1, Lazy lazy2, Lazy lazy3)
    {
        if (featureflags.isEnabled(Flag.NEW_STREAM))
        {
            trackItemRenderer = (CellRenderer)lazy2.a();
            playlistItemRenderer = (CellRenderer)lazy3.a();
            return;
        } else
        {
            trackItemRenderer = (CellRenderer)lazy.a();
            playlistItemRenderer = (CellRenderer)lazy1.a();
            return;
        }
    }

    public CellRenderer getPlaylistItemRenderer()
    {
        return playlistItemRenderer;
    }

    public CellRenderer getTrackItemRenderer()
    {
        return trackItemRenderer;
    }
}
