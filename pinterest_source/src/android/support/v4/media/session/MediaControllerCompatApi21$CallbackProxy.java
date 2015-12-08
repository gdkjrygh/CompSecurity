// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.os.Bundle;

class mCallback extends android.media.session.lbackProxy
{

    protected final sionEvent mCallback;

    public void onMetadataChanged(MediaMetadata mediametadata)
    {
        mCallback.adataChanged(mediametadata);
    }

    public void onPlaybackStateChanged(PlaybackState playbackstate)
    {
        mCallback.ybackStateChanged(playbackstate);
    }

    public void onSessionDestroyed()
    {
        mCallback.sionDestroyed();
    }

    public void onSessionEvent(String s, Bundle bundle)
    {
        mCallback.sionEvent(s, bundle);
    }

    public ( )
    {
        mCallback = ;
    }
}
