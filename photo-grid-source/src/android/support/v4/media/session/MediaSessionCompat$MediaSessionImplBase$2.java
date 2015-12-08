// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;

class val.callback
    implements val.callback
{

    final val.callback this$0;
    final val.callback val$callback;

    public void onCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
    {
        val$callback.callback(s, bundle, resultreceiver);
    }

    public void onFastForward()
    {
        val$callback.callback();
    }

    public boolean onMediaButtonEvent(Intent intent)
    {
        return val$callback.vent(intent);
    }

    public void onPause()
    {
        val$callback.callback();
    }

    public void onPlay()
    {
        val$callback.callback();
    }

    public void onRewind()
    {
        val$callback.callback();
    }

    public void onSeekTo(long l)
    {
        val$callback.callback(l);
    }

    public void onSetRating(Object obj)
    {
        val$callback.callback(RatingCompat.fromRating(obj));
    }

    public void onSkipToNext()
    {
        val$callback.callback();
    }

    public void onSkipToPrevious()
    {
        val$callback.us();
    }

    public void onStop()
    {
        val$callback.callback();
    }

    ()
    {
        this$0 = final_;
        val$callback = val.callback.this;
        super();
    }
}
