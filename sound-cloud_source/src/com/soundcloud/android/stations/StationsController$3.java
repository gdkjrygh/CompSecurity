// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.events.CurrentUserChangedEvent;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsController, StationsOperations

class this._cls0
    implements f
{

    final StationsController this$0;

    public volatile Object call(Object obj)
    {
        return call((CurrentUserChangedEvent)obj);
    }

    public b call(CurrentUserChangedEvent currentuserchangedevent)
    {
        return StationsController.access$000(StationsController.this).sync();
    }

    ()
    {
        this$0 = StationsController.this;
        super();
    }
}
