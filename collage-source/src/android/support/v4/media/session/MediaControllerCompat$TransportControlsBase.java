// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.RatingCompat;
import android.util.Log;

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
            Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in fastForward. ").append(remoteexception).toString());
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
            Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in pause. ").append(remoteexception).toString());
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
            Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in play. ").append(remoteexception).toString());
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
            Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in playFromMediaId. ").append(s).toString());
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
            Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in playFromSearch. ").append(s).toString());
        }
    }

    public void playFromUri(Uri uri, Bundle bundle)
    {
        try
        {
            mBinder.playFromUri(uri, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in playFromUri. ").append(uri).toString());
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
            Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in rewind. ").append(remoteexception).toString());
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
            Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in seekTo. ").append(remoteexception).toString());
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
            Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in sendCustomAction. ").append(s).toString());
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
            Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in setRating. ").append(ratingcompat).toString());
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
            Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in skipToNext. ").append(remoteexception).toString());
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
            Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in skipToPrevious. ").append(remoteexception).toString());
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
            Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in skipToQueueItem. ").append(remoteexception).toString());
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
            Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in stop. ").append(remoteexception).toString());
        }
    }

    public (IMediaSession imediasession)
    {
        mBinder = imediasession;
    }
}
