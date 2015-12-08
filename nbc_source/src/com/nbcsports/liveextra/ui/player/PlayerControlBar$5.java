// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import rx.Subscriber;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerControlBar

class this._cls0 extends Subscriber
{

    final PlayerControlBar this$0;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        Timber.i(throwable, "Error updating clock display on player", new Object[0]);
    }

    public void onNext(Long long1)
    {
        PlayerControlBar.access$500(PlayerControlBar.this);
    }

    public volatile void onNext(Object obj)
    {
        onNext((Long)obj);
    }

    ()
    {
        this$0 = PlayerControlBar.this;
        super();
    }
}
