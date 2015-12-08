// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompat, MediaSessionCompatApi21

public static abstract class mCallbackObj
{
    private class StubApi21
        implements MediaSessionCompatApi21.Callback
    {

        final MediaSessionCompat.Callback this$0;

        public void onCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
        {
            MediaSessionCompat.Callback.this.onCommand(s, bundle, resultreceiver);
        }

        public void onCustomAction(String s, Bundle bundle)
        {
            MediaSessionCompat.Callback.this.onCustomAction(s, bundle);
        }

        public void onFastForward()
        {
            MediaSessionCompat.Callback.this.onFastForward();
        }

        public boolean onMediaButtonEvent(Intent intent)
        {
            return MediaSessionCompat.Callback.this.onMediaButtonEvent(intent);
        }

        public void onPause()
        {
            MediaSessionCompat.Callback.this.onPause();
        }

        public void onPlay()
        {
            MediaSessionCompat.Callback.this.onPlay();
        }

        public void onPlayFromMediaId(String s, Bundle bundle)
        {
            MediaSessionCompat.Callback.this.onPlayFromMediaId(s, bundle);
        }

        public void onPlayFromSearch(String s, Bundle bundle)
        {
            MediaSessionCompat.Callback.this.onPlayFromSearch(s, bundle);
        }

        public void onRewind()
        {
            MediaSessionCompat.Callback.this.onRewind();
        }

        public void onSeekTo(long l)
        {
            MediaSessionCompat.Callback.this.onSeekTo(l);
        }

        public void onSetRating(Object obj)
        {
            MediaSessionCompat.Callback.this.onSetRating(RatingCompat.fromRating(obj));
        }

        public void onSkipToNext()
        {
            MediaSessionCompat.Callback.this.onSkipToNext();
        }

        public void onSkipToPrevious()
        {
            MediaSessionCompat.Callback.this.onSkipToPrevious();
        }

        public void onSkipToQueueItem(long l)
        {
            MediaSessionCompat.Callback.this.onSkipToQueueItem(l);
        }

        public void onStop()
        {
            MediaSessionCompat.Callback.this.onStop();
        }

        private StubApi21()
        {
            this$0 = MediaSessionCompat.Callback.this;
            super();
        }

        StubApi21(MediaSessionCompat._cls1 _pcls1)
        {
            this();
        }
    }


    final Object mCallbackObj;

    public void onCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
    {
    }

    public void onCustomAction(String s, Bundle bundle)
    {
    }

    public void onFastForward()
    {
    }

    public boolean onMediaButtonEvent(Intent intent)
    {
        return false;
    }

    public void onPause()
    {
    }

    public void onPlay()
    {
    }

    public void onPlayFromMediaId(String s, Bundle bundle)
    {
    }

    public void onPlayFromSearch(String s, Bundle bundle)
    {
    }

    public void onRewind()
    {
    }

    public void onSeekTo(long l)
    {
    }

    public void onSetRating(RatingCompat ratingcompat)
    {
    }

    public void onSkipToNext()
    {
    }

    public void onSkipToPrevious()
    {
    }

    public void onSkipToQueueItem(long l)
    {
    }

    public void onStop()
    {
    }

    public back()
    {
        if (android.os.essionCompat.Callback >= 21)
        {
            mCallbackObj = MediaSessionCompatApi21.createCallback(new StubApi21(null));
            return;
        } else
        {
            mCallbackObj = null;
            return;
        }
    }
}
