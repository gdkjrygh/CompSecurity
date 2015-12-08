// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

class MediaControllerCompatApi21
{

    MediaControllerCompatApi21()
    {
    }

    public static void adjustVolume(Object obj, int i, int j)
    {
        ((MediaController)obj).adjustVolume(i, j);
    }

    public static Object createCallback(Callback callback)
    {
        return new CallbackProxy(callback);
    }

    public static boolean dispatchMediaButtonEvent(Object obj, KeyEvent keyevent)
    {
        return ((MediaController)obj).dispatchMediaButtonEvent(keyevent);
    }

    public static Object fromToken(Context context, Object obj)
    {
        return new MediaController(context, (android.media.session.MediaSession.Token)obj);
    }

    public static Bundle getExtras(Object obj)
    {
        return ((MediaController)obj).getExtras();
    }

    public static long getFlags(Object obj)
    {
        return ((MediaController)obj).getFlags();
    }

    public static Object getMetadata(Object obj)
    {
        return ((MediaController)obj).getMetadata();
    }

    public static String getPackageName(Object obj)
    {
        return ((MediaController)obj).getPackageName();
    }

    public static Object getPlaybackInfo(Object obj)
    {
        return ((MediaController)obj).getPlaybackInfo();
    }

    public static Object getPlaybackState(Object obj)
    {
        return ((MediaController)obj).getPlaybackState();
    }

    public static List getQueue(Object obj)
    {
        obj = ((MediaController)obj).getQueue();
        if (obj == null)
        {
            return null;
        } else
        {
            return new ArrayList(((java.util.Collection) (obj)));
        }
    }

    public static CharSequence getQueueTitle(Object obj)
    {
        return ((MediaController)obj).getQueueTitle();
    }

    public static int getRatingType(Object obj)
    {
        return ((MediaController)obj).getRatingType();
    }

    public static PendingIntent getSessionActivity(Object obj)
    {
        return ((MediaController)obj).getSessionActivity();
    }

    public static Object getTransportControls(Object obj)
    {
        return ((MediaController)obj).getTransportControls();
    }

    public static void registerCallback(Object obj, Object obj1, Handler handler)
    {
        ((MediaController)obj).registerCallback((android.media.session.MediaController.Callback)obj1, handler);
    }

    public static void sendCommand(Object obj, String s, Bundle bundle, ResultReceiver resultreceiver)
    {
        ((MediaController)obj).sendCommand(s, bundle, resultreceiver);
    }

    public static void setVolumeTo(Object obj, int i, int j)
    {
        ((MediaController)obj).setVolumeTo(i, j);
    }

    public static void unregisterCallback(Object obj, Object obj1)
    {
        ((MediaController)obj).unregisterCallback((android.media.session.MediaController.Callback)obj1);
    }

    private class CallbackProxy extends android.media.session.MediaController.Callback
    {

        protected final Callback mCallback;

        public void onMetadataChanged(MediaMetadata mediametadata)
        {
            mCallback.onMetadataChanged(mediametadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackstate)
        {
            mCallback.onPlaybackStateChanged(playbackstate);
        }

        public void onSessionDestroyed()
        {
            mCallback.onSessionDestroyed();
        }

        public void onSessionEvent(String s, Bundle bundle)
        {
            mCallback.onSessionEvent(s, bundle);
        }

        public CallbackProxy(Callback callback)
        {
            mCallback = callback;
        }

        private class Callback
        {

            public abstract void onMetadataChanged(Object obj);

            public abstract void onPlaybackStateChanged(Object obj);

            public abstract void onSessionDestroyed();

            public abstract void onSessionEvent(String s, Bundle bundle);
        }

    }

}
