// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompat

private class <init>
    implements <init>
{

    final evious this$0;

    public void onCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
    {
        <init>.this.<init>(s, bundle, resultreceiver);
    }

    public void onFastForward()
    {
        ard();
    }

    public boolean onMediaButtonEvent(Intent intent)
    {
        return tonEvent(intent);
    }

    public void onPause()
    {
        tonEvent();
    }

    public void onPlay()
    {
        tonEvent();
    }

    public void onRewind()
    {
        tonEvent();
    }

    public void onSeekTo(long l)
    {
        tonEvent(l);
    }

    public void onSetRating(Object obj)
    {
        g(RatingCompat.fromRating(obj));
    }

    public void onSkipToNext()
    {
        xt();
    }

    public void onSkipToPrevious()
    {
        evious();
    }

    public void onStop()
    {
        evious();
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
