// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import rx.b.b;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsController, StationsOperations

class this._cls0
    implements b
{

    final StationsController this$0;

    public void call(llectionPlayState llectionplaystate)
    {
        StationsController.access$000(StationsController.this).saveLastPlayedTrackPosition(llectionPlayState.access._mth100(llectionplaystate), llectionPlayState.access._mth200(llectionplaystate));
        StationsController.access$000(StationsController.this).saveRecentlyPlayedStation(llectionPlayState.access._mth100(llectionplaystate));
    }

    public volatile void call(Object obj)
    {
        call((llectionPlayState)obj);
    }

    llectionPlayState()
    {
        this$0 = StationsController.this;
        super();
    }
}
