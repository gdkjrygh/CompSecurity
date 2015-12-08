// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.events.PlaybackSessionEvent;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackSessionAnalyticsController

class this._cls0
    implements f
{

    final PlaybackSessionAnalyticsController this$0;

    public Boolean call(PropertySet propertyset)
    {
        boolean flag;
        if (PlaybackSessionAnalyticsController.access$000(PlaybackSessionAnalyticsController.this) == null || !PlaybackSessionAnalyticsController.access$000(PlaybackSessionAnalyticsController.this).isPlayEvent())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    ()
    {
        this$0 = PlaybackSessionAnalyticsController.this;
        super();
    }
}
