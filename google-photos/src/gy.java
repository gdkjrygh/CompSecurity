// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.os.Bundle;

public final class gy extends android.media.session.MediaController.Callback
{

    private gx a;

    public gy(gx gx1)
    {
        a = gx1;
    }

    public final void onMetadataChanged(MediaMetadata mediametadata)
    {
        a.b(mediametadata);
    }

    public final void onPlaybackStateChanged(PlaybackState playbackstate)
    {
        a.a(playbackstate);
    }

    public final void onSessionDestroyed()
    {
        a.a();
    }

    public final void onSessionEvent(String s, Bundle bundle)
    {
    }
}
