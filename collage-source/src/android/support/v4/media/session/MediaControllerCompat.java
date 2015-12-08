// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompat, PlaybackStateCompat, MediaControllerCompatApi21, ParcelableVolumeInfo, 
//            IMediaSession, IMediaControllerCallback

public final class MediaControllerCompat
{
    public static abstract class Callback
        implements android.os.IBinder.DeathRecipient
    {

        private final Object mCallbackObj;
        private MessageHandler mHandler;
        private boolean mRegistered;

        private void setHandler(Handler handler)
        {
            mHandler = new MessageHandler(handler.getLooper());
        }

        public void binderDied()
        {
            onSessionDestroyed();
        }

        public void onAudioInfoChanged(PlaybackInfo playbackinfo)
        {
        }

        public void onExtrasChanged(Bundle bundle)
        {
        }

        public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
        {
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
        {
        }

        public void onQueueChanged(List list)
        {
        }

        public void onQueueTitleChanged(CharSequence charsequence)
        {
        }

        public void onSessionDestroyed()
        {
        }

        public void onSessionEvent(String s, Bundle bundle)
        {
        }




/*
        static boolean access$302(Callback callback, boolean flag)
        {
            callback.mRegistered = flag;
            return flag;
        }

*/



        public Callback()
        {
            mRegistered = false;
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                mCallbackObj = MediaControllerCompatApi21.createCallback(new StubApi21());
                return;
            } else
            {
                mCallbackObj = new StubCompat();
                return;
            }
        }
    }

    private class Callback.MessageHandler extends Handler
    {

        private static final int MSG_DESTROYED = 8;
        private static final int MSG_EVENT = 1;
        private static final int MSG_UPDATE_EXTRAS = 7;
        private static final int MSG_UPDATE_METADATA = 3;
        private static final int MSG_UPDATE_PLAYBACK_STATE = 2;
        private static final int MSG_UPDATE_QUEUE = 5;
        private static final int MSG_UPDATE_QUEUE_TITLE = 6;
        private static final int MSG_UPDATE_VOLUME = 4;
        final Callback this$0;

        public void handleMessage(Message message)
        {
            if (!mRegistered)
            {
                return;
            }
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                onSessionEvent((String)message.obj, message.getData());
                return;

            case 2: // '\002'
                onPlaybackStateChanged((PlaybackStateCompat)message.obj);
                return;

            case 3: // '\003'
                onMetadataChanged((MediaMetadataCompat)message.obj);
                return;

            case 5: // '\005'
                onQueueChanged((List)message.obj);
                return;

            case 6: // '\006'
                onQueueTitleChanged((CharSequence)message.obj);
                return;

            case 7: // '\007'
                onExtrasChanged((Bundle)message.obj);
                return;

            case 4: // '\004'
                onAudioInfoChanged((PlaybackInfo)message.obj);
                return;

            case 8: // '\b'
                onSessionDestroyed();
                break;
            }
        }

        public void post(int i, Object obj, Bundle bundle)
        {
            obtainMessage(i, obj).sendToTarget();
        }

        public Callback.MessageHandler(Looper looper)
        {
            this$0 = Callback.this;
            super(looper);
        }
    }

    private class Callback.StubApi21
        implements MediaControllerCompatApi21.Callback
    {

        final Callback this$0;

        public void onMetadataChanged(Object obj)
        {
            Callback.this.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(obj));
        }

        public void onPlaybackStateChanged(Object obj)
        {
            Callback.this.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(obj));
        }

        public void onSessionDestroyed()
        {
            Callback.this.onSessionDestroyed();
        }

        public void onSessionEvent(String s, Bundle bundle)
        {
            Callback.this.onSessionEvent(s, bundle);
        }

        private Callback.StubApi21()
        {
            this$0 = Callback.this;
            super();
        }

    }

    private class Callback.StubCompat extends IMediaControllerCallback.Stub
    {

        final Callback this$0;

        public void onEvent(String s, Bundle bundle)
            throws RemoteException
        {
            mHandler.post(1, s, bundle);
        }

        public void onExtrasChanged(Bundle bundle)
            throws RemoteException
        {
            mHandler.post(7, bundle, null);
        }

        public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
            throws RemoteException
        {
            mHandler.post(3, mediametadatacompat, null);
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
            throws RemoteException
        {
            mHandler.post(2, playbackstatecompat, null);
        }

        public void onQueueChanged(List list)
            throws RemoteException
        {
            mHandler.post(5, list, null);
        }

        public void onQueueTitleChanged(CharSequence charsequence)
            throws RemoteException
        {
            mHandler.post(6, charsequence, null);
        }

        public void onSessionDestroyed()
            throws RemoteException
        {
            mHandler.post(8, null, null);
        }

        public void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
            throws RemoteException
        {
            if (parcelablevolumeinfo != null)
            {
                parcelablevolumeinfo = new PlaybackInfo(parcelablevolumeinfo.volumeType, parcelablevolumeinfo.audioStream, parcelablevolumeinfo.controlType, parcelablevolumeinfo.maxVolume, parcelablevolumeinfo.currentVolume);
            } else
            {
                parcelablevolumeinfo = null;
            }
            mHandler.post(4, parcelablevolumeinfo, null);
        }

        private Callback.StubCompat()
        {
            this$0 = Callback.this;
            super();
        }

    }

    static interface MediaControllerImpl
    {

        public abstract void adjustVolume(int i, int j);

        public abstract boolean dispatchMediaButtonEvent(KeyEvent keyevent);

        public abstract Bundle getExtras();

        public abstract long getFlags();

        public abstract Object getMediaController();

        public abstract MediaMetadataCompat getMetadata();

        public abstract String getPackageName();

        public abstract PlaybackInfo getPlaybackInfo();

        public abstract PlaybackStateCompat getPlaybackState();

        public abstract List getQueue();

        public abstract CharSequence getQueueTitle();

        public abstract int getRatingType();

        public abstract PendingIntent getSessionActivity();

        public abstract TransportControls getTransportControls();

        public abstract void registerCallback(Callback callback, Handler handler);

        public abstract void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver);

        public abstract void setVolumeTo(int i, int j);

        public abstract void unregisterCallback(Callback callback);
    }

    static class MediaControllerImplApi21
        implements MediaControllerImpl
    {

        protected final Object mControllerObj;

        public void adjustVolume(int i, int j)
        {
            MediaControllerCompatApi21.adjustVolume(mControllerObj, i, j);
        }

        public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
        {
            return MediaControllerCompatApi21.dispatchMediaButtonEvent(mControllerObj, keyevent);
        }

        public Bundle getExtras()
        {
            return MediaControllerCompatApi21.getExtras(mControllerObj);
        }

        public long getFlags()
        {
            return MediaControllerCompatApi21.getFlags(mControllerObj);
        }

        public Object getMediaController()
        {
            return mControllerObj;
        }

        public MediaMetadataCompat getMetadata()
        {
            Object obj = MediaControllerCompatApi21.getMetadata(mControllerObj);
            if (obj != null)
            {
                return MediaMetadataCompat.fromMediaMetadata(obj);
            } else
            {
                return null;
            }
        }

        public String getPackageName()
        {
            return MediaControllerCompatApi21.getPackageName(mControllerObj);
        }

        public PlaybackInfo getPlaybackInfo()
        {
            Object obj = MediaControllerCompatApi21.getPlaybackInfo(mControllerObj);
            if (obj != null)
            {
                return new PlaybackInfo(MediaControllerCompatApi21.PlaybackInfo.getPlaybackType(obj), MediaControllerCompatApi21.PlaybackInfo.getLegacyAudioStream(obj), MediaControllerCompatApi21.PlaybackInfo.getVolumeControl(obj), MediaControllerCompatApi21.PlaybackInfo.getMaxVolume(obj), MediaControllerCompatApi21.PlaybackInfo.getCurrentVolume(obj));
            } else
            {
                return null;
            }
        }

        public PlaybackStateCompat getPlaybackState()
        {
            Object obj = MediaControllerCompatApi21.getPlaybackState(mControllerObj);
            if (obj != null)
            {
                return PlaybackStateCompat.fromPlaybackState(obj);
            } else
            {
                return null;
            }
        }

        public List getQueue()
        {
            Object obj = MediaControllerCompatApi21.getQueue(mControllerObj);
            if (obj != null) goto _L2; else goto _L1
_L1:
            obj = null;
_L4:
            return ((List) (obj));
_L2:
            ArrayList arraylist = new ArrayList();
            Iterator iterator = ((List) (obj)).iterator();
            do
            {
                obj = arraylist;
                if (!iterator.hasNext())
                {
                    continue;
                }
                arraylist.add(MediaSessionCompat.QueueItem.obtain(iterator.next()));
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public CharSequence getQueueTitle()
        {
            return MediaControllerCompatApi21.getQueueTitle(mControllerObj);
        }

        public int getRatingType()
        {
            return MediaControllerCompatApi21.getRatingType(mControllerObj);
        }

        public PendingIntent getSessionActivity()
        {
            return MediaControllerCompatApi21.getSessionActivity(mControllerObj);
        }

        public TransportControls getTransportControls()
        {
            Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
            if (obj != null)
            {
                return new TransportControlsApi21(obj);
            } else
            {
                return null;
            }
        }

        public void registerCallback(Callback callback, Handler handler)
        {
            MediaControllerCompatApi21.registerCallback(mControllerObj, callback.mCallbackObj, handler);
        }

        public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
        {
            MediaControllerCompatApi21.sendCommand(mControllerObj, s, bundle, resultreceiver);
        }

        public void setVolumeTo(int i, int j)
        {
            MediaControllerCompatApi21.setVolumeTo(mControllerObj, i, j);
        }

        public void unregisterCallback(Callback callback)
        {
            MediaControllerCompatApi21.unregisterCallback(mControllerObj, callback.mCallbackObj);
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token)
            throws RemoteException
        {
            mControllerObj = MediaControllerCompatApi21.fromToken(context, token.getToken());
            if (mControllerObj == null)
            {
                throw new RemoteException();
            } else
            {
                return;
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat mediasessioncompat)
        {
            mControllerObj = MediaControllerCompatApi21.fromToken(context, mediasessioncompat.getSessionToken().getToken());
        }
    }

    static class MediaControllerImplApi23 extends MediaControllerImplApi21
    {

        public TransportControls getTransportControls()
        {
            Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
            if (obj != null)
            {
                return new TransportControlsApi23(obj);
            } else
            {
                return null;
            }
        }

        public MediaControllerImplApi23(Context context, MediaSessionCompat.Token token)
            throws RemoteException
        {
            super(context, token);
        }

        public MediaControllerImplApi23(Context context, MediaSessionCompat mediasessioncompat)
        {
            super(context, mediasessioncompat);
        }
    }

    static class MediaControllerImplBase
        implements MediaControllerImpl
    {

        private IMediaSession mBinder;
        private MediaSessionCompat.Token mToken;
        private TransportControls mTransportControls;

        public void adjustVolume(int i, int j)
        {
            try
            {
                mBinder.adjustVolume(i, j, null);
                return;
            }
            catch (RemoteException remoteexception)
            {
                Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in adjustVolume. ").append(remoteexception).toString());
            }
        }

        public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
        {
            if (keyevent == null)
            {
                throw new IllegalArgumentException("event may not be null.");
            }
            try
            {
                mBinder.sendMediaButton(keyevent);
            }
            // Misplaced declaration of an exception variable
            catch (KeyEvent keyevent)
            {
                Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in dispatchMediaButtonEvent. ").append(keyevent).toString());
            }
            return false;
        }

        public Bundle getExtras()
        {
            Bundle bundle;
            try
            {
                bundle = mBinder.getExtras();
            }
            catch (RemoteException remoteexception)
            {
                Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getExtras. ").append(remoteexception).toString());
                return null;
            }
            return bundle;
        }

        public long getFlags()
        {
            long l;
            try
            {
                l = mBinder.getFlags();
            }
            catch (RemoteException remoteexception)
            {
                Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getFlags. ").append(remoteexception).toString());
                return 0L;
            }
            return l;
        }

        public Object getMediaController()
        {
            return null;
        }

        public MediaMetadataCompat getMetadata()
        {
            MediaMetadataCompat mediametadatacompat;
            try
            {
                mediametadatacompat = mBinder.getMetadata();
            }
            catch (RemoteException remoteexception)
            {
                Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getMetadata. ").append(remoteexception).toString());
                return null;
            }
            return mediametadatacompat;
        }

        public String getPackageName()
        {
            String s;
            try
            {
                s = mBinder.getPackageName();
            }
            catch (RemoteException remoteexception)
            {
                Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getPackageName. ").append(remoteexception).toString());
                return null;
            }
            return s;
        }

        public PlaybackInfo getPlaybackInfo()
        {
            Object obj;
            try
            {
                obj = mBinder.getVolumeAttributes();
                obj = new PlaybackInfo(((ParcelableVolumeInfo) (obj)).volumeType, ((ParcelableVolumeInfo) (obj)).audioStream, ((ParcelableVolumeInfo) (obj)).controlType, ((ParcelableVolumeInfo) (obj)).maxVolume, ((ParcelableVolumeInfo) (obj)).currentVolume);
            }
            catch (RemoteException remoteexception)
            {
                Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getPlaybackInfo. ").append(remoteexception).toString());
                return null;
            }
            return ((PlaybackInfo) (obj));
        }

        public PlaybackStateCompat getPlaybackState()
        {
            PlaybackStateCompat playbackstatecompat;
            try
            {
                playbackstatecompat = mBinder.getPlaybackState();
            }
            catch (RemoteException remoteexception)
            {
                Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getPlaybackState. ").append(remoteexception).toString());
                return null;
            }
            return playbackstatecompat;
        }

        public List getQueue()
        {
            List list;
            try
            {
                list = mBinder.getQueue();
            }
            catch (RemoteException remoteexception)
            {
                Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getQueue. ").append(remoteexception).toString());
                return null;
            }
            return list;
        }

        public CharSequence getQueueTitle()
        {
            CharSequence charsequence;
            try
            {
                charsequence = mBinder.getQueueTitle();
            }
            catch (RemoteException remoteexception)
            {
                Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getQueueTitle. ").append(remoteexception).toString());
                return null;
            }
            return charsequence;
        }

        public int getRatingType()
        {
            int i;
            try
            {
                i = mBinder.getRatingType();
            }
            catch (RemoteException remoteexception)
            {
                Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getRatingType. ").append(remoteexception).toString());
                return 0;
            }
            return i;
        }

        public PendingIntent getSessionActivity()
        {
            PendingIntent pendingintent;
            try
            {
                pendingintent = mBinder.getLaunchPendingIntent();
            }
            catch (RemoteException remoteexception)
            {
                Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in getSessionActivity. ").append(remoteexception).toString());
                return null;
            }
            return pendingintent;
        }

        public TransportControls getTransportControls()
        {
            if (mTransportControls == null)
            {
                mTransportControls = new TransportControlsBase(mBinder);
            }
            return mTransportControls;
        }

        public void registerCallback(Callback callback, Handler handler)
        {
            if (callback == null)
            {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try
            {
                mBinder.asBinder().linkToDeath(callback, 0);
                mBinder.registerCallbackListener((IMediaControllerCallback)callback.mCallbackObj);
                callback.setHandler(handler);
                callback.mRegistered = true;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Handler handler)
            {
                Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in registerCallback. ").append(handler).toString());
            }
            callback.onSessionDestroyed();
        }

        public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
        {
            try
            {
                mBinder.sendCommand(s, bundle, new MediaSessionCompat.ResultReceiverWrapper(resultreceiver));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in sendCommand. ").append(s).toString());
            }
        }

        public void setVolumeTo(int i, int j)
        {
            try
            {
                mBinder.setVolumeTo(i, j, null);
                return;
            }
            catch (RemoteException remoteexception)
            {
                Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in setVolumeTo. ").append(remoteexception).toString());
            }
        }

        public void unregisterCallback(Callback callback)
        {
            if (callback == null)
            {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try
            {
                mBinder.unregisterCallbackListener((IMediaControllerCallback)callback.mCallbackObj);
                mBinder.asBinder().unlinkToDeath(callback, 0);
                callback.mRegistered = false;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Callback callback)
            {
                Log.e("MediaControllerCompat", (new StringBuilder()).append("Dead object in unregisterCallback. ").append(callback).toString());
            }
        }

        public MediaControllerImplBase(MediaSessionCompat.Token token)
        {
            mToken = token;
            mBinder = IMediaSession.Stub.asInterface((IBinder)token.getToken());
        }
    }

    public static final class PlaybackInfo
    {

        public static final int PLAYBACK_TYPE_LOCAL = 1;
        public static final int PLAYBACK_TYPE_REMOTE = 2;
        private final int mAudioStream;
        private final int mCurrentVolume;
        private final int mMaxVolume;
        private final int mPlaybackType;
        private final int mVolumeControl;

        public int getAudioStream()
        {
            return mAudioStream;
        }

        public int getCurrentVolume()
        {
            return mCurrentVolume;
        }

        public int getMaxVolume()
        {
            return mMaxVolume;
        }

        public int getPlaybackType()
        {
            return mPlaybackType;
        }

        public int getVolumeControl()
        {
            return mVolumeControl;
        }

        PlaybackInfo(int i, int j, int k, int l, int i1)
        {
            mPlaybackType = i;
            mAudioStream = j;
            mVolumeControl = k;
            mMaxVolume = l;
            mCurrentVolume = i1;
        }
    }

    public static abstract class TransportControls
    {

        public abstract void fastForward();

        public abstract void pause();

        public abstract void play();

        public abstract void playFromMediaId(String s, Bundle bundle);

        public abstract void playFromSearch(String s, Bundle bundle);

        public abstract void playFromUri(Uri uri, Bundle bundle);

        public abstract void rewind();

        public abstract void seekTo(long l);

        public abstract void sendCustomAction(PlaybackStateCompat.CustomAction customaction, Bundle bundle);

        public abstract void sendCustomAction(String s, Bundle bundle);

        public abstract void setRating(RatingCompat ratingcompat);

        public abstract void skipToNext();

        public abstract void skipToPrevious();

        public abstract void skipToQueueItem(long l);

        public abstract void stop();

        TransportControls()
        {
        }
    }

    static class TransportControlsApi21 extends TransportControls
    {

        protected final Object mControlsObj;

        public void fastForward()
        {
            MediaControllerCompatApi21.TransportControls.fastForward(mControlsObj);
        }

        public void pause()
        {
            MediaControllerCompatApi21.TransportControls.pause(mControlsObj);
        }

        public void play()
        {
            MediaControllerCompatApi21.TransportControls.play(mControlsObj);
        }

        public void playFromMediaId(String s, Bundle bundle)
        {
            MediaControllerCompatApi21.TransportControls.playFromMediaId(mControlsObj, s, bundle);
        }

        public void playFromSearch(String s, Bundle bundle)
        {
            MediaControllerCompatApi21.TransportControls.playFromSearch(mControlsObj, s, bundle);
        }

        public void playFromUri(Uri uri, Bundle bundle)
        {
        }

        public void rewind()
        {
            MediaControllerCompatApi21.TransportControls.rewind(mControlsObj);
        }

        public void seekTo(long l)
        {
            MediaControllerCompatApi21.TransportControls.seekTo(mControlsObj, l);
        }

        public void sendCustomAction(PlaybackStateCompat.CustomAction customaction, Bundle bundle)
        {
            MediaControllerCompatApi21.TransportControls.sendCustomAction(mControlsObj, customaction.getAction(), bundle);
        }

        public void sendCustomAction(String s, Bundle bundle)
        {
            MediaControllerCompatApi21.TransportControls.sendCustomAction(mControlsObj, s, bundle);
        }

        public void setRating(RatingCompat ratingcompat)
        {
            Object obj = mControlsObj;
            if (ratingcompat != null)
            {
                ratingcompat = ((RatingCompat) (ratingcompat.getRating()));
            } else
            {
                ratingcompat = null;
            }
            MediaControllerCompatApi21.TransportControls.setRating(obj, ratingcompat);
        }

        public void skipToNext()
        {
            MediaControllerCompatApi21.TransportControls.skipToNext(mControlsObj);
        }

        public void skipToPrevious()
        {
            MediaControllerCompatApi21.TransportControls.skipToPrevious(mControlsObj);
        }

        public void skipToQueueItem(long l)
        {
            MediaControllerCompatApi21.TransportControls.skipToQueueItem(mControlsObj, l);
        }

        public void stop()
        {
            MediaControllerCompatApi21.TransportControls.stop(mControlsObj);
        }

        public TransportControlsApi21(Object obj)
        {
            mControlsObj = obj;
        }
    }

    static class TransportControlsApi23 extends TransportControlsApi21
    {

        public void playFromUri(Uri uri, Bundle bundle)
        {
            MediaControllerCompatApi23.TransportControls.playFromUri(mControlsObj, uri, bundle);
        }

        public TransportControlsApi23(Object obj)
        {
            super(obj);
        }
    }

    static class TransportControlsBase extends TransportControls
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

        public void sendCustomAction(PlaybackStateCompat.CustomAction customaction, Bundle bundle)
        {
            sendCustomAction(customaction.getAction(), bundle);
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

        public TransportControlsBase(IMediaSession imediasession)
        {
            mBinder = imediasession;
        }
    }


    private static final String TAG = "MediaControllerCompat";
    private final MediaControllerImpl mImpl;
    private final MediaSessionCompat.Token mToken;

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token)
        throws RemoteException
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

    public void adjustVolume(int i, int j)
    {
        mImpl.adjustVolume(i, j);
    }

    public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
    {
        if (keyevent == null)
        {
            throw new IllegalArgumentException("KeyEvent may not be null");
        } else
        {
            return mImpl.dispatchMediaButtonEvent(keyevent);
        }
    }

    public Bundle getExtras()
    {
        return mImpl.getExtras();
    }

    public long getFlags()
    {
        return mImpl.getFlags();
    }

    public Object getMediaController()
    {
        return mImpl.getMediaController();
    }

    public MediaMetadataCompat getMetadata()
    {
        return mImpl.getMetadata();
    }

    public String getPackageName()
    {
        return mImpl.getPackageName();
    }

    public PlaybackInfo getPlaybackInfo()
    {
        return mImpl.getPlaybackInfo();
    }

    public PlaybackStateCompat getPlaybackState()
    {
        return mImpl.getPlaybackState();
    }

    public List getQueue()
    {
        return mImpl.getQueue();
    }

    public CharSequence getQueueTitle()
    {
        return mImpl.getQueueTitle();
    }

    public int getRatingType()
    {
        return mImpl.getRatingType();
    }

    public PendingIntent getSessionActivity()
    {
        return mImpl.getSessionActivity();
    }

    public MediaSessionCompat.Token getSessionToken()
    {
        return mToken;
    }

    public TransportControls getTransportControls()
    {
        return mImpl.getTransportControls();
    }

    public void registerCallback(Callback callback)
    {
        registerCallback(callback, null);
    }

    public void registerCallback(Callback callback, Handler handler)
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

    public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
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

    public void setVolumeTo(int i, int j)
    {
        mImpl.setVolumeTo(i, j);
    }

    public void unregisterCallback(Callback callback)
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
}
