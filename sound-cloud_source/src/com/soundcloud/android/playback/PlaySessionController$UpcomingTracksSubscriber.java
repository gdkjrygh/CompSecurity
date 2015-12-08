// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.ErrorUtils;
import java.util.HashMap;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionController, PlayQueueManager, PlaySessionSource, PlayQueue

private class <init> extends DefaultSubscriber
{

    final PlaySessionController this$0;

    public void onError(Throwable throwable)
    {
        if (throwable instanceof UnsupportedOperationException)
        {
            HashMap hashmap = new HashMap(2);
            hashmap.put("Queue Size", String.valueOf(PlaySessionController.access$000(PlaySessionController.this).getQueueSize()));
            hashmap.put("PlaySessionSource", PlaySessionController.access$000(PlaySessionController.this).getCurrentPlaySessionSource().toString());
            ErrorUtils.handleSilentException(throwable, hashmap);
            return;
        } else
        {
            super.onError(throwable);
            return;
        }
    }

    public void onNext(PlayQueue playqueue)
    {
        PlaySessionController.access$1002(PlaySessionController.this, playqueue.isEmpty());
    }

    public volatile void onNext(Object obj)
    {
        onNext((PlayQueue)obj);
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
