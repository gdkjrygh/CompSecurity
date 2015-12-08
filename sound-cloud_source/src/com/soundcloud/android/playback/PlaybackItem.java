// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackType

public interface PlaybackItem
{

    public abstract long getDuration();

    public abstract PlaybackType getPlaybackType();

    public abstract long getStartPosition();

    public abstract Urn getTrackUrn();
}
