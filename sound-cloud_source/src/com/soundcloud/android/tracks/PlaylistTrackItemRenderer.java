// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.PromotedSourceInfo;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.tracks:
//            DownloadableTrackItemRenderer, OverflowMenuOptions, TrackItemMenuPresenter, TrackItem

public class PlaylistTrackItemRenderer extends DownloadableTrackItemRenderer
{

    private Urn pageUrn;
    private PromotedSourceInfo promotedSourceInfo;
    private TrackItemMenuPresenter.RemoveTrackListener removeTrackListener;

    public PlaylistTrackItemRenderer(ImageOperations imageoperations, CondensedNumberFormatter condensednumberformatter, TrackItemMenuPresenter trackitemmenupresenter, EventBus eventbus, FeatureOperations featureoperations, ScreenProvider screenprovider, Navigator navigator, 
            TrackItemView.Factory factory)
    {
        super(imageoperations, condensednumberformatter, trackitemmenupresenter, eventbus, featureoperations, screenprovider, navigator, factory);
        pageUrn = Urn.NOT_SET;
    }

    public void setPlaylistInformation(PromotedSourceInfo promotedsourceinfo, Urn urn)
    {
        promotedSourceInfo = promotedsourceinfo;
        pageUrn = urn;
    }

    public void setRemoveTrackListener(TrackItemMenuPresenter.RemoveTrackListener removetracklistener)
    {
        removeTrackListener = removetracklistener;
    }

    protected void showTrackItemMenu(View view, TrackItem trackitem, int i)
    {
        trackItemMenuPresenter.show((FragmentActivity)view.getContext(), view, trackitem, i, pageUrn, removeTrackListener, promotedSourceInfo, OverflowMenuOptions.builder().build());
    }
}
