// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;

public interface 
{

    public abstract void onCommand(String s, Bundle bundle, ResultReceiver resultreceiver);

    public abstract void onCustomAction(String s, Bundle bundle);

    public abstract void onFastForward();

    public abstract boolean onMediaButtonEvent(Intent intent);

    public abstract void onPause();

    public abstract void onPlay();

    public abstract void onPlayFromMediaId(String s, Bundle bundle);

    public abstract void onPlayFromSearch(String s, Bundle bundle);

    public abstract void onRewind();

    public abstract void onSeekTo(long l);

    public abstract void onSetRating(Object obj);

    public abstract void onSkipToNext();

    public abstract void onSkipToPrevious();

    public abstract void onSkipToQueueItem(long l);

    public abstract void onStop();
}
