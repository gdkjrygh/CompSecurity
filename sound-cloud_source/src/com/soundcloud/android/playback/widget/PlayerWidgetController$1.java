// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.widget;

import com.soundcloud.android.playback.TrackQueueItem;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback.widget:
//            PlayerWidgetController

class this._cls0
    implements f
{

    final PlayerWidgetController this$0;

    public volatile Object call(Object obj)
    {
        return call((TrackQueueItem)obj);
    }

    public b call(TrackQueueItem trackqueueitem)
    {
        return PlayerWidgetController.access$000(PlayerWidgetController.this, trackqueueitem);
    }

    ()
    {
        this$0 = PlayerWidgetController.this;
        super();
    }
}
