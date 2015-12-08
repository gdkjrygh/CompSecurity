// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;

// Referenced classes of package android.support.v4.media.session:
//            MediaControllerCompat, MediaControllerCompatApi21, PlaybackStateCompat

public static abstract class mCallbackObj
{
    private class StubApi21
        implements MediaControllerCompatApi21.Callback
    {

        final MediaControllerCompat.Callback this$0;

        public void onMetadataChanged(Object obj)
        {
            MediaControllerCompat.Callback.this.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(obj));
        }

        public void onPlaybackStateChanged(Object obj)
        {
            MediaControllerCompat.Callback.this.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(obj));
        }

        public void onSessionDestroyed()
        {
            MediaControllerCompat.Callback.this.onSessionDestroyed();
        }

        public void onSessionEvent(String s, Bundle bundle)
        {
            MediaControllerCompat.Callback.this.onSessionEvent(s, bundle);
        }

        private StubApi21()
        {
            this$0 = MediaControllerCompat.Callback.this;
            super();
        }

        StubApi21(MediaControllerCompat._cls1 _pcls1)
        {
            this();
        }
    }


    final Object mCallbackObj;

    public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
    {
    }

    public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
    {
    }

    public void onSessionDestroyed()
    {
    }

    public void onSessionEvent(String s, Bundle bundle)
    {
    }

    public back()
    {
        if (android.os.rollerCompat.Callback >= 21)
        {
            mCallbackObj = MediaControllerCompatApi21.createCallback(new StubApi21(null));
            return;
        } else
        {
            mCallbackObj = null;
            return;
        }
    }
}
