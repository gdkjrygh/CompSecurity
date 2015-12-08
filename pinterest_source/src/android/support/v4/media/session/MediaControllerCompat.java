// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompat, PlaybackStateCompat

public final class MediaControllerCompat
{

    private static final String TAG = "MediaControllerCompat";
    private final MediaControllerImpl mImpl;
    private final MediaSessionCompat.Token mToken;

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token)
    {
        if (token == null)
        {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        mToken = token;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            mImpl = new MediaControllerImplApi21(context, token);
            return;
        } else
        {
            mImpl = new MediaControllerImplBase(mToken);
            return;
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediasessioncompat)
    {
        if (mediasessioncompat == null)
        {
            throw new IllegalArgumentException("session must not be null");
        }
        mToken = mediasessioncompat.getSessionToken();
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            mImpl = new MediaControllerImplApi23(context, mediasessioncompat);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            mImpl = new MediaControllerImplApi21(context, mediasessioncompat);
            return;
        } else
        {
            mImpl = new MediaControllerImplBase(mToken);
            return;
        }
    }

    public final void adjustVolume(int i, int j)
    {
        mImpl.adjustVolume(i, j);
    }

    public final boolean dispatchMediaButtonEvent(KeyEvent keyevent)
    {
        if (keyevent == null)
        {
            throw new IllegalArgumentException("KeyEvent may not be null");
        } else
        {
            return mImpl.dispatchMediaButtonEvent(keyevent);
        }
    }

    public final Bundle getExtras()
    {
        return mImpl.getExtras();
    }

    public final long getFlags()
    {
        return mImpl.getFlags();
    }

    public final Object getMediaController()
    {
        return mImpl.getMediaController();
    }

    public final MediaMetadataCompat getMetadata()
    {
        return mImpl.getMetadata();
    }

    public final String getPackageName()
    {
        return mImpl.getPackageName();
    }

    public final PlaybackInfo getPlaybackInfo()
    {
        return mImpl.getPlaybackInfo();
    }

    public final PlaybackStateCompat getPlaybackState()
    {
        return mImpl.getPlaybackState();
    }

    public final List getQueue()
    {
        return mImpl.getQueue();
    }

    public final CharSequence getQueueTitle()
    {
        return mImpl.getQueueTitle();
    }

    public final int getRatingType()
    {
        return mImpl.getRatingType();
    }

    public final PendingIntent getSessionActivity()
    {
        return mImpl.getSessionActivity();
    }

    public final MediaSessionCompat.Token getSessionToken()
    {
        return mToken;
    }

    public final TransportControls getTransportControls()
    {
        return mImpl.getTransportControls();
    }

    public final void registerCallback(Callback callback)
    {
        registerCallback(callback, null);
    }

    public final void registerCallback(Callback callback, Handler handler)
    {
        if (callback == null)
        {
            throw new IllegalArgumentException("callback cannot be null");
        }
        Handler handler1 = handler;
        if (handler == null)
        {
            handler1 = new Handler();
        }
        mImpl.registerCallback(callback, handler1);
    }

    public final void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("command cannot be null or empty");
        } else
        {
            mImpl.sendCommand(s, bundle, resultreceiver);
            return;
        }
    }

    public final void setVolumeTo(int i, int j)
    {
        mImpl.setVolumeTo(i, j);
    }

    public final void unregisterCallback(Callback callback)
    {
        if (callback == null)
        {
            throw new IllegalArgumentException("callback cannot be null");
        } else
        {
            mImpl.unregisterCallback(callback);
            return;
        }
    }

    /* member class not found */
    class MediaControllerImplApi21 {}


    /* member class not found */
    class MediaControllerImplBase {}


    /* member class not found */
    class MediaControllerImplApi23 {}


    /* member class not found */
    class MediaControllerImpl {}

}
