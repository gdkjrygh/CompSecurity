// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.events.TrackingEvent;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.analytics:
//            ScreenProvider

class this._cls0
    implements f
{

    final ScreenProvider this$0;

    public Boolean call(TrackingEvent trackingevent)
    {
        return Boolean.valueOf(trackingevent instanceof ScreenEvent);
    }

    public volatile Object call(Object obj)
    {
        return call((TrackingEvent)obj);
    }

    ()
    {
        this$0 = ScreenProvider.this;
        super();
    }
}
