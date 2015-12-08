// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.os.ResultReceiver;

class gd extends android.media.session.MediaSession.Callback
{

    private gc a;

    public gd(gc gc1)
    {
        a = gc1;
    }

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
        return a.a(intent) || super.onMediaButtonEvent(intent);
    }

    public void onPause()
    {
        a.b();
    }

    public void onPlay()
    {
        a.a();
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

    public void onSetRating(Rating rating)
    {
        a.a(rating);
    }

    public void onSkipToNext()
    {
        a.c();
    }

    public void onSkipToPrevious()
    {
        a.d();
    }

    public void onSkipToQueueItem(long l)
    {
    }

    public void onStop()
    {
    }
}
