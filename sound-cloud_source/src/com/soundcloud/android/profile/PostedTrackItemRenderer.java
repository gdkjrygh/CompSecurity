// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.tracks.TrackItem;
import com.soundcloud.android.tracks.TrackItemMenuPresenter;
import com.soundcloud.android.tracks.TrackItemRenderer;
import com.soundcloud.android.tracks.TrackItemView;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.List;

public class PostedTrackItemRenderer extends TrackItemRenderer
{

    public PostedTrackItemRenderer(ImageOperations imageoperations, CondensedNumberFormatter condensednumberformatter, TrackItemMenuPresenter trackitemmenupresenter, EventBus eventbus, ScreenProvider screenprovider, Navigator navigator, FeatureOperations featureoperations, 
            com.soundcloud.android.tracks.TrackItemView.Factory factory)
    {
        super(imageoperations, condensednumberformatter, trackitemmenupresenter, eventbus, screenprovider, navigator, featureoperations, factory);
    }

    private void toggleReposterView(TrackItemView trackitemview, TrackItem trackitem)
    {
        trackitem = trackitem.getReposter();
        if (trackitem.isPresent())
        {
            trackitemview.showReposter((String)trackitem.get());
            return;
        } else
        {
            trackitemview.hideReposter();
            return;
        }
    }

    public void bindItemView(int i, View view, List list)
    {
        super.bindItemView(i, view, list);
        list = (TrackItem)list.get(i);
        toggleReposterView((TrackItemView)view.getTag(), list);
    }
}
