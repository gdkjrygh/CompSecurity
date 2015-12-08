// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerTrackState, PlayerPagerPresenter

class this._cls0
    implements f
{

    final PlayerPagerPresenter this$0;

    public PlayerTrackState call(PropertySet propertyset)
    {
        return new PlayerTrackState(propertyset, PlayerPagerPresenter.access$000(PlayerPagerPresenter.this).isCurrentTrack((Urn)propertyset.get(TrackProperty.URN)), PlayerPagerPresenter.access$100(PlayerPagerPresenter.this), PlayerPagerPresenter.access$200(PlayerPagerPresenter.this));
    }

    public volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    ()
    {
        this$0 = PlayerPagerPresenter.this;
        super();
    }
}
