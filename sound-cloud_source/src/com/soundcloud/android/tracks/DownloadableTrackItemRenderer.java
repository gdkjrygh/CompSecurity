// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.offline.DownloadImageView;
import com.soundcloud.android.offline.OfflineState;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.List;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItemRenderer, TrackItem, TrackItemMenuPresenter

public class DownloadableTrackItemRenderer extends TrackItemRenderer
{

    public DownloadableTrackItemRenderer(ImageOperations imageoperations, CondensedNumberFormatter condensednumberformatter, TrackItemMenuPresenter trackitemmenupresenter, EventBus eventbus, FeatureOperations featureoperations, ScreenProvider screenprovider, Navigator navigator, 
            TrackItemView.Factory factory)
    {
        super(imageoperations, condensednumberformatter, trackitemmenupresenter, eventbus, screenprovider, navigator, featureoperations, factory);
    }

    private void setDownloadProgressIndicator(View view, TrackItem trackitem)
    {
        view = (DownloadImageView)view.findViewById(0x7f0f00cf);
        if (featureOperations.isOfflineContentEnabled())
        {
            view.setState(trackitem.getDownloadedState());
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
        setDownloadProgressIndicator(view, (TrackItem)list.get(i));
    }
}
