// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;

// Referenced classes of package android.support.v4.media.session:
//            PlaybackStateCompat

class <init>
    implements <init>
{

    final vent this$0;

    public void onMetadataChanged(Object obj)
    {
        Changed(MediaMetadataCompat.fromMediaMetadata(obj));
    }

    public void onPlaybackStateChanged(Object obj)
    {
        StateChanged(PlaybackStateCompat.fromPlaybackState(obj));
    }

    public void onSessionDestroyed()
    {
        estroyed();
    }

    public void onSessionEvent(String s, Bundle bundle)
    {
        vent(s, bundle);
    }

    private ()
    {
        this$0 = this._cls0.this;
        super();
    }

    this._cls0(this._cls0 _pcls0_1)
    {
        this();
    }
}
