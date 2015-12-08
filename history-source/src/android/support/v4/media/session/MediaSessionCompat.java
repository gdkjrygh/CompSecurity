// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.VolumeProviderCompat;
import android.text.TextUtils;

// Referenced classes of package android.support.v4.media.session:
//            PlaybackStateCompat, MediaSessionCompatApi21

public class MediaSessionCompat
{
    public static abstract class Callback
    {

        final Object mCallbackObj;

        public void onCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
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

        public void onStop()
        {
        }

        public Callback()
        {
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                mCallbackObj = MediaSessionCompatApi21.createCallback(new StubApi21());
                return;
            } else
            {
                mCallbackObj = null;
                return;
            }
        }
    }

    private class Callback.StubApi21
        implements MediaSessionCompatApi21.Callback
    {

        final Callback this$0;

        public void onCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
        {
            Callback.this.onCommand(s, bundle, resultreceiver);
        }

        public void onFastForward()
        {
            Callback.this.onFastForward();
        }

        public boolean onMediaButtonEvent(Intent intent)
        {
            return Callback.this.onMediaButtonEvent(intent);
        }

        public void onPause()
        {
            Callback.this.onPause();
        }

        public void onPlay()
        {
            Callback.this.onPlay();
        }

        public void onRewind()
        {
            Callback.this.onRewind();
        }

        public void onSeekTo(long l)
        {
            Callback.this.onSeekTo(l);
        }

        public void onSetRating(Object obj)
        {
            Callback.this.onSetRating(RatingCompat.fromRating(obj));
        }

        public void onSkipToNext()
        {
            Callback.this.onSkipToNext();
        }

        public void onSkipToPrevious()
        {
            Callback.this.onSkipToPrevious();
        }

        public void onStop()
        {
            Callback.this.onStop();
        }

        private Callback.StubApi21()
        {
            this$0 = Callback.this;
            super();
        }

    }

    static interface MediaSessionImpl
    {

        public abstract Object getMediaSession();

        public abstract Token getSessionToken();

        public abstract boolean isActive();

        public abstract void release();

        public abstract void sendSessionEvent(String s, Bundle bundle);

        public abstract void setActive(boolean flag);

        public abstract void setCallback(Callback callback, Handler handler);

        public abstract void setFlags(int i);

        public abstract void setMetadata(MediaMetadataCompat mediametadatacompat);

        public abstract void setPlaybackState(PlaybackStateCompat playbackstatecompat);

        public abstract void setPlaybackToLocal(int i);

        public abstract void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat);
    }

    static class MediaSessionImplApi21
        implements MediaSessionImpl
    {

        private final Object mSessionObj;
        private final Token mToken;

        public Object getMediaSession()
        {
            return mSessionObj;
        }

        public Token getSessionToken()
        {
            return mToken;
        }

        public boolean isActive()
        {
            return MediaSessionCompatApi21.isActive(mSessionObj);
        }

        public void release()
        {
            MediaSessionCompatApi21.release(mSessionObj);
        }

        public void sendSessionEvent(String s, Bundle bundle)
        {
            MediaSessionCompatApi21.sendSessionEvent(mSessionObj, s, bundle);
        }

        public void setActive(boolean flag)
        {
            MediaSessionCompatApi21.setActive(mSessionObj, flag);
        }

        public void setCallback(Callback callback, Handler handler)
        {
            MediaSessionCompatApi21.setCallback(mSessionObj, callback.mCallbackObj, handler);
        }

        public void setFlags(int i)
        {
            MediaSessionCompatApi21.setFlags(mSessionObj, i);
        }

        public void setMetadata(MediaMetadataCompat mediametadatacompat)
        {
            MediaSessionCompatApi21.setMetadata(mSessionObj, mediametadatacompat.getMediaMetadata());
        }

        public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
        {
            MediaSessionCompatApi21.setPlaybackState(mSessionObj, playbackstatecompat.getPlaybackState());
        }

        public void setPlaybackToLocal(int i)
        {
            MediaSessionCompatApi21.setPlaybackToLocal(mSessionObj, i);
        }

        public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
        {
            MediaSessionCompatApi21.setPlaybackToRemote(mSessionObj, volumeprovidercompat.getVolumeProvider());
        }

        public MediaSessionImplApi21(Context context, String s)
        {
            mSessionObj = MediaSessionCompatApi21.createSession(context, s);
            mToken = new Token(MediaSessionCompatApi21.getSessionToken(mSessionObj));
        }

        public MediaSessionImplApi21(Object obj)
        {
            mSessionObj = MediaSessionCompatApi21.verifySession(obj);
            mToken = new Token(MediaSessionCompatApi21.getSessionToken(mSessionObj));
        }
    }

    static class MediaSessionImplBase
        implements MediaSessionImpl
    {

        public Object getMediaSession()
        {
            return null;
        }

        public Token getSessionToken()
        {
            return null;
        }

        public boolean isActive()
        {
            return false;
        }

        public void release()
        {
        }

        public void sendSessionEvent(String s, Bundle bundle)
        {
        }

        public void setActive(boolean flag)
        {
        }

        public void setCallback(Callback callback, Handler handler)
        {
        }

        public void setFlags(int i)
        {
        }

        public void setMetadata(MediaMetadataCompat mediametadatacompat)
        {
        }

        public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
        {
        }

        public void setPlaybackToLocal(int i)
        {
        }

        public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
        {
        }

        MediaSessionImplBase()
        {
        }
    }

    public static final class Token
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public Token createFromParcel(Parcel parcel)
            {
                return new Token(parcel.readParcelable(null));
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public Token[] newArray(int i)
            {
                return new Token[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private final Parcelable mInner;

        public int describeContents()
        {
            return mInner.describeContents();
        }

        public Object getToken()
        {
            return mInner;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeParcelable(mInner, i);
        }


        Token(Parcelable parcelable)
        {
            mInner = parcelable;
        }
    }


    public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
    private final MediaSessionImpl mImpl;

    public MediaSessionCompat(Context context, String s)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            mImpl = new MediaSessionImplApi21(context, s);
            return;
        } else
        {
            mImpl = new MediaSessionImplBase();
            return;
        }
    }

    private MediaSessionCompat(MediaSessionImpl mediasessionimpl)
    {
        mImpl = mediasessionimpl;
    }

    public static MediaSessionCompat obtain(Object obj)
    {
        return new MediaSessionCompat(new MediaSessionImplApi21(obj));
    }

    public Object getMediaSession()
    {
        return mImpl.getMediaSession();
    }

    public Token getSessionToken()
    {
        return mImpl.getSessionToken();
    }

    public boolean isActive()
    {
        return mImpl.isActive();
    }

    public void release()
    {
        mImpl.release();
    }

    public void sendSessionEvent(String s, Bundle bundle)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("event cannot be null or empty");
        } else
        {
            mImpl.sendSessionEvent(s, bundle);
            return;
        }
    }

    public void setActive(boolean flag)
    {
        mImpl.setActive(flag);
    }

    public void setCallback(Callback callback)
    {
        setCallback(callback, null);
    }

    public void setCallback(Callback callback, Handler handler)
    {
        MediaSessionImpl mediasessionimpl = mImpl;
        if (handler == null)
        {
            handler = new Handler();
        }
        mediasessionimpl.setCallback(callback, handler);
    }

    public void setFlags(int i)
    {
        mImpl.setFlags(i);
    }

    public void setMetadata(MediaMetadataCompat mediametadatacompat)
    {
        mImpl.setMetadata(mediametadatacompat);
    }

    public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
    {
        mImpl.setPlaybackState(playbackstatecompat);
    }

    public void setPlaybackToLocal(int i)
    {
        mImpl.setPlaybackToLocal(i);
    }

    public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
    {
        if (volumeprovidercompat == null)
        {
            throw new IllegalArgumentException("volumeProvider may not be null!");
        } else
        {
            mImpl.setPlaybackToRemote(volumeprovidercompat);
            return;
        }
    }
}
