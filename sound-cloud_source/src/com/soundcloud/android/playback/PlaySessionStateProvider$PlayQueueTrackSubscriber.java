// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import java.util.Map;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionStateProvider

private class <init> extends DefaultSubscriber
{

    final PlaySessionStateProvider this$0;

    public void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
    {
        if (PlaySessionStateProvider.access$500(PlaySessionStateProvider.this)._mth0())
        {
            PlaySessionStateProvider.access$400(PlaySessionStateProvider.this).clear();
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((CurrentPlayQueueItemEvent)obj);
    }

    private ()
    {
        this$0 = PlaySessionStateProvider.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
