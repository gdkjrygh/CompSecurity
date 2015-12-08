// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.model.Urn;
import rx.b;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueue, PlaySessionSource

public interface PlaybackStrategy
{

    public abstract void pause();

    public abstract b playCurrent();

    public abstract void resume();

    public abstract void seek(long l);

    public abstract b setNewQueue(PlayQueue playqueue, Urn urn, int i, boolean flag, PlaySessionSource playsessionsource);

    public abstract void togglePlayback();
}
