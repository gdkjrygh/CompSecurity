// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.commands.StoreTracksCommand;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsOperations, ApiStation

class this._cls0
    implements b
{

    final StationsOperations this$0;

    public void call(ApiStation apistation)
    {
        StationsOperations.access$000(StationsOperations.this).call(apistation.getTrackRecords());
    }

    public volatile void call(Object obj)
    {
        call((ApiStation)obj);
    }

    ()
    {
        this$0 = StationsOperations.this;
        super();
    }
}
