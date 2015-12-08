// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.rx.eventbus.EventBus;
import rx.b.a;

// Referenced classes of package com.soundcloud.android.likes:
//            TrackLikesHeaderPresenter

class this._cls0
    implements a
{

    final TrackLikesHeaderPresenter this$0;

    public void call()
    {
        TrackLikesHeaderPresenter.access$000(TrackLikesHeaderPresenter.this).publish(EventQueue.TRACKING, UIEvent.fromShuffleMyLikes());
    }

    ()
    {
        this$0 = TrackLikesHeaderPresenter.this;
        super();
    }
}
