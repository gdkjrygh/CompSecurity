// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPresenter

private final class <init> extends DefaultSubscriber
{

    final PlayerPresenter this$0;

    public final void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
    {
        PlayerPresenter.access$1800(PlayerPresenter.this);
    }

    public final volatile void onNext(Object obj)
    {
        onNext((CurrentPlayQueueItemEvent)obj);
    }

    private ()
    {
        this$0 = PlayerPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
