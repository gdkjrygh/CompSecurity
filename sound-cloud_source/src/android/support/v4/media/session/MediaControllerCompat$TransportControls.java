// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.support.v4.media.RatingCompat;

// Referenced classes of package android.support.v4.media.session:
//            MediaControllerCompat

public static abstract class 
{

    public abstract void fastForward();

    public abstract void pause();

    public abstract void play();

    public abstract void playFromMediaId(String s, Bundle bundle);

    public abstract void playFromSearch(String s, Bundle bundle);

    public abstract void rewind();

    public abstract void seekTo(long l);

    public abstract void sendCustomAction( , Bundle bundle);

    public abstract void sendCustomAction(String s, Bundle bundle);

    public abstract void setRating(RatingCompat ratingcompat);

    public abstract void skipToNext();

    public abstract void skipToPrevious();

    public abstract void skipToQueueItem(long l);

    public abstract void stop();

    ()
    {
    }
}
