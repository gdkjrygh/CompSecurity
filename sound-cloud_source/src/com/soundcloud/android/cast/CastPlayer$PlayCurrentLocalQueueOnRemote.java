// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.cast:
//            CastPlayer, LocalPlayQueue

private class <init> extends DefaultSubscriber
{

    private final Urn currentTrackUrn;
    private final long position;
    final CastPlayer this$0;

    public void onError(Throwable throwable)
    {
        CastPlayer.access$000(CastPlayer.this, new com.soundcloud.android.playback.._cls0(com.soundcloud.android.playback.._fld0, com.soundcloud.android.playback.._fld0, currentTrackUrn));
    }

    public void onNext(LocalPlayQueue localplayqueue)
    {
        CastPlayer.access$300(CastPlayer.this, localplayqueue, position);
    }

    public volatile void onNext(Object obj)
    {
        onNext((LocalPlayQueue)obj);
    }

    private (Urn urn, long l)
    {
        this$0 = CastPlayer.this;
        super();
        currentTrackUrn = urn;
        position = l;
    }

    position(Urn urn, long l, position position1)
    {
        this(urn, l);
    }
}
