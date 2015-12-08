// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import rx.a.b.a;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPresenter

class this._cls0
    implements b
{

    final PlayerPresenter this$0;

    public void call(CurrentPlayQueueItemEvent currentplayqueueitemevent)
    {
        PlayerPresenter.access$202(PlayerPresenter.this, PlayerPresenter.access$400(PlayerPresenter.this).observeOn(a.a()).subscribe(PlayerPresenter.access$300(PlayerPresenter.this)));
    }

    public volatile void call(Object obj)
    {
        call((CurrentPlayQueueItemEvent)obj);
    }

    nt()
    {
        this$0 = PlayerPresenter.this;
        super();
    }
}
