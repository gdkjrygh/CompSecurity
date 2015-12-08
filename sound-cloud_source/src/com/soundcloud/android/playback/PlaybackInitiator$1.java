// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueue, PlaybackInitiator, PlaySessionSource

class val.playSessionSource
    implements f
{

    final PlaybackInitiator this$0;
    final PlaySessionSource val$playSessionSource;

    public PlayQueue call(List list)
    {
        return PlayQueue.shuffled(list, val$playSessionSource);
    }

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    _cls9()
    {
        this$0 = final_playbackinitiator;
        val$playSessionSource = PlaySessionSource.this;
        super();
    }
}
