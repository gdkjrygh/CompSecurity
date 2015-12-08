// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.os.SystemClock;
import android.util.Log;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompatApi14

class MediaSessionCompatApi18
{
    static class OnPlaybackPositionUpdateListener
        implements android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
    {

        protected final MediaSessionCompatApi14.Callback mCallback;

        public void onPlaybackPositionUpdate(long l)
        {
            mCallback.onSeekTo(l);
        }

        public OnPlaybackPositionUpdateListener(MediaSessionCompatApi14.Callback callback)
        {
            mCallback = callback;
        }
    }


    private static final long ACTION_SEEK_TO = 256L;
    private static final String TAG = "MediaSessionCompatApi18";
    private static boolean sIsMbrPendingIntentSupported = true;

    MediaSessionCompatApi18()
    {
    }

    public static Object createPlaybackPositionUpdateListener(MediaSessionCompatApi14.Callback callback)
    {
        return new OnPlaybackPositionUpdateListener(callback);
    }

    static int getRccTransportControlFlagsFromActions(long l)
    {
        int j = MediaSessionCompatApi14.getRccTransportControlFlagsFromActions(l);
        int i = j;
        if ((256L & l) != 0L)
        {
            i = j | 0x100;
        }
        return i;
    }

    public static void registerMediaButtonEventReceiver(Context context, PendingIntent pendingintent, ComponentName componentname)
    {
        context = (AudioManager)context.getSystemService("audio");
        if (sIsMbrPendingIntentSupported)
        {
            try
            {
                context.registerMediaButtonEventReceiver(pendingintent);
            }
            // Misplaced declaration of an exception variable
            catch (PendingIntent pendingintent)
            {
                Log.w("MediaSessionCompatApi18", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                sIsMbrPendingIntentSupported = false;
            }
        }
        if (!sIsMbrPendingIntentSupported)
        {
            context.registerMediaButtonEventReceiver(componentname);
        }
    }

    public static void setOnPlaybackPositionUpdateListener(Object obj, Object obj1)
    {
        ((RemoteControlClient)obj).setPlaybackPositionUpdateListener((android.media.RemoteControlClient.OnPlaybackPositionUpdateListener)obj1);
    }

    public static void setState(Object obj, int i, long l, float f, long l1)
    {
        long l3 = 0L;
        long l4 = SystemClock.elapsedRealtime();
        long l2 = l;
        if (i == 3)
        {
            l2 = l;
            if (l > 0L)
            {
                l2 = l3;
                if (l1 > 0L)
                {
                    l1 = l4 - l1;
                    l2 = l1;
                    if (f > 0.0F)
                    {
                        l2 = l1;
                        if (f != 1.0F)
                        {
                            l2 = (long)((float)l1 * f);
                        }
                    }
                }
                l2 = l + l2;
            }
        }
        i = MediaSessionCompatApi14.getRccStateFromState(i);
        ((RemoteControlClient)obj).setPlaybackState(i, l2, f);
    }

    public static void setTransportControlFlags(Object obj, long l)
    {
        ((RemoteControlClient)obj).setTransportControlFlags(getRccTransportControlFlagsFromActions(l));
    }

    public static void unregisterMediaButtonEventReceiver(Context context, PendingIntent pendingintent, ComponentName componentname)
    {
        context = (AudioManager)context.getSystemService("audio");
        if (sIsMbrPendingIntentSupported)
        {
            context.unregisterMediaButtonEventReceiver(pendingintent);
            return;
        } else
        {
            context.unregisterMediaButtonEventReceiver(componentname);
            return;
        }
    }

}
