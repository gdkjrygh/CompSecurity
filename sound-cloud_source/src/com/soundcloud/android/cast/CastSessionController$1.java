// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import com.soundcloud.android.playback.PlaybackProgress;
import com.soundcloud.android.playback.PlaybackResult;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.cast:
//            CastSessionController, CastPlayer

class val.lastProgressForTrack
    implements b
{

    final CastSessionController this$0;
    final PlaybackProgress val$lastProgressForTrack;

    public void call(PlaybackResult playbackresult)
    {
        CastSessionController.access$000(CastSessionController.this).playCurrent(val$lastProgressForTrack.getPosition());
    }

    public volatile void call(Object obj)
    {
        call((PlaybackResult)obj);
    }

    _cls9()
    {
        this$0 = final_castsessioncontroller;
        val$lastProgressForTrack = PlaybackProgress.this;
        super();
    }
}
