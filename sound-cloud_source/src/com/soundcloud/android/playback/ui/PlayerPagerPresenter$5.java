// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.api.model.StationRecord;
import rx.b.g;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerTrackState, PlayerPagerPresenter, PlayerItem

class this._cls0
    implements g
{

    final PlayerPagerPresenter this$0;

    public PlayerItem call(PlayerTrackState playertrackstate, StationRecord stationrecord)
    {
        playertrackstate.setStation(stationrecord);
        return playertrackstate;
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call((PlayerTrackState)obj, (StationRecord)obj1);
    }

    ()
    {
        this$0 = PlayerPagerPresenter.this;
        super();
    }
}
