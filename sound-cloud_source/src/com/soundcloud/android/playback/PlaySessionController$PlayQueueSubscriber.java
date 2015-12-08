// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.events.PlayQueueEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import rx.Y;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionController

private class <init> extends DefaultSubscriber
{

    final PlaySessionController this$0;

    public void onNext(PlayQueueEvent playqueueevent)
    {
        if (playqueueevent.isNewQueue())
        {
            PlaySessionController.access$900(PlaySessionController.this).unsubscribe();
            PlaySessionController.access$1002(PlaySessionController.this, false);
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((PlayQueueEvent)obj);
    }

    private ()
    {
        this$0 = PlaySessionController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
