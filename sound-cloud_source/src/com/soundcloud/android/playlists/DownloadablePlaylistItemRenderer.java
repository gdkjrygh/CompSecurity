// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.res.Resources;
import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.offline.DownloadImageView;
import com.soundcloud.android.offline.OfflineState;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.android.view.adapters.PlaylistItemRenderer;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.List;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistItem, PlaylistItemMenuPresenter

public class DownloadablePlaylistItemRenderer extends PlaylistItemRenderer
{

    private final FeatureOperations featureOperations;

    public DownloadablePlaylistItemRenderer(Resources resources, ImageOperations imageoperations, CondensedNumberFormatter condensednumberformatter, PlaylistItemMenuPresenter playlistitemmenupresenter, FeatureOperations featureoperations, EventBus eventbus, ScreenProvider screenprovider, 
            Navigator navigator)
    {
        super(resources, imageoperations, condensednumberformatter, playlistitemmenupresenter, eventbus, screenprovider, navigator);
        featureOperations = featureoperations;
        allowOfflineOptions();
    }

    private void setDownloadProgressIndicator(View view, PlaylistItem playlistitem)
    {
        view = (DownloadImageView)view.findViewById(0x7f0f00cf);
        if (featureOperations.isOfflineContentEnabled())
        {
            view.setState(playlistitem.getDownloadState());
            return;
        } else
        {
            view.setState(OfflineState.NO_OFFLINE);
            return;
        }
    }

    public void bindItemView(int i, View view, List list)
    {
        super.bindItemView(i, view, list);
        setDownloadProgressIndicator(view, (PlaylistItem)list.get(i));
    }
}
