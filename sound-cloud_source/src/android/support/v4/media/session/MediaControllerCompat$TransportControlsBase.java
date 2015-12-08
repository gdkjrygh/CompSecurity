// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.RatingCompat;

// Referenced classes of package android.support.v4.media.session:
//            MediaControllerCompat, IMediaSession

static class mBinder extends mBinder
{

    private IMediaSession mBinder;

    public void fastForward()
    {
        try
        {
            mBinder.fastForward();
            return;
        }
        catch (RemoteException remoteexception)
        {
            (new StringBuilder("Dead object in fastForward. ")).append(remoteexception);
        }
    }

    public void pause()
    {
        try
        {
            mBinder.pause();
            return;
        }
        catch (RemoteException remoteexception)
        {
            (new StringBuilder("Dead object in pause. ")).append(remoteexception);
        }
    }

    public void play()
    {
        try
        {
            mBinder.play();
            return;
        }
        catch (RemoteException remoteexception)
        {
            (new StringBuilder("Dead object in play. ")).append(remoteexception);
        }
    }

    public void playFromMediaId(String s, Bundle bundle)
    {
        try
        {
            mBinder.playFromMediaId(s, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            (new StringBuilder("Dead object in playFromMediaId. ")).append(s);
        }
    }

    public void playFromSearch(String s, Bundle bundle)
    {
        try
        {
            mBinder.playFromSearch(s, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            (new StringBuilder("Dead object in playFromSearch. ")).append(s);
        }
    }

    public void rewind()
    {
        try
        {
            mBinder.rewind();
            return;
        }
        catch (RemoteException remoteexception)
        {
            (new StringBuilder("Dead object in rewind. ")).append(remoteexception);
        }
    }

    public void seekTo(long l)
    {
        try
        {
            mBinder.seekTo(l);
            return;
        }
        catch (RemoteException remoteexception)
        {
            (new StringBuilder("Dead object in seekTo. ")).append(remoteexception);
        }
    }

    public void sendCustomAction(mBinder mbinder, Bundle bundle)
    {
        sendCustomAction(mbinder.sendCustomAction(), bundle);
    }

    public void sendCustomAction(String s, Bundle bundle)
    {
        try
        {
            mBinder.sendCustomAction(s, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            (new StringBuilder("Dead object in sendCustomAction. ")).append(s);
        }
    }

    public void setRating(RatingCompat ratingcompat)
    {
        try
        {
            mBinder.rate(ratingcompat);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RatingCompat ratingcompat)
        {
            (new StringBuilder("Dead object in setRating. ")).append(ratingcompat);
        }
    }

    public void skipToNext()
    {
        try
        {
            mBinder.next();
            return;
        }
        catch (RemoteException remoteexception)
        {
            (new StringBuilder("Dead object in skipToNext. ")).append(remoteexception);
        }
    }

    public void skipToPrevious()
    {
        try
        {
            mBinder.previous();
            return;
        }
        catch (RemoteException remoteexception)
        {
            (new StringBuilder("Dead object in skipToPrevious. ")).append(remoteexception);
        }
    }

    public void skipToQueueItem(long l)
    {
        try
        {
            mBinder.skipToQueueItem(l);
            return;
        }
        catch (RemoteException remoteexception)
        {
            (new StringBuilder("Dead object in skipToQueueItem. ")).append(remoteexception);
        }
    }

    public void stop()
    {
        try
        {
            mBinder.stop();
            return;
        }
        catch (RemoteException remoteexception)
        {
            (new StringBuilder("Dead object in stop. ")).append(remoteexception);
        }
    }

    public (IMediaSession imediasession)
    {
        mBinder = imediasession;
    }
}
