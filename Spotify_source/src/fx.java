// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.os.SystemClock;
import android.util.Log;

final class fx
{

    private static boolean a = true;

    static int a(long l)
    {
        int j = fv.a(l);
        int i = j;
        if ((256L & l) != 0L)
        {
            i = j | 0x100;
        }
        return i;
    }

    public static Object a()
    {
        return new fy();
    }

    public static void a(Context context, PendingIntent pendingintent, ComponentName componentname)
    {
        context = (AudioManager)context.getSystemService("audio");
        if (a)
        {
            try
            {
                context.registerMediaButtonEventReceiver(pendingintent);
            }
            // Misplaced declaration of an exception variable
            catch (PendingIntent pendingintent)
            {
                Log.w("MediaSessionCompatApi18", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                a = false;
            }
        }
        if (!a)
        {
            context.registerMediaButtonEventReceiver(componentname);
        }
    }

    public static void a(Object obj, int i, long l, float f, long l1)
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
        i = fv.a(i);
        ((RemoteControlClient)obj).setPlaybackState(i, l2, f);
    }

    public static void a(Object obj, long l)
    {
        ((RemoteControlClient)obj).setTransportControlFlags(a(l));
    }

    public static void a(Object obj, Object obj1)
    {
        ((RemoteControlClient)obj).setPlaybackPositionUpdateListener((android.media.RemoteControlClient.OnPlaybackPositionUpdateListener)obj1);
    }

    public static void b(Context context, PendingIntent pendingintent, ComponentName componentname)
    {
        context = (AudioManager)context.getSystemService("audio");
        if (a)
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
