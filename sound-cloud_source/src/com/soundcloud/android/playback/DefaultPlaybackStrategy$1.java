// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.ServiceInitiator;
import com.soundcloud.android.events.PlayerLifeCycleEvent;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            DefaultPlaybackStrategy

class this._cls0
    implements f
{

    final DefaultPlaybackStrategy this$0;

    public volatile Object call(Object obj)
    {
        return call((PlayerLifeCycleEvent)obj);
    }

    public b call(PlayerLifeCycleEvent playerlifecycleevent)
    {
        if (playerlifecycleevent.isServiceRunning())
        {
            DefaultPlaybackStrategy.access$000(DefaultPlaybackStrategy.this).togglePlayback();
            return b.empty();
        } else
        {
            return playCurrent();
        }
    }

    ()
    {
        this$0 = DefaultPlaybackStrategy.this;
        super();
    }
}
