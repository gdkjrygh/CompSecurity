// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.hapticmediasdk.controllers;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.immersion.hapticmediasdk.MediaTaskManager;
import com.immersion.hapticmediasdk.models.HttpUnsuccessfulException;
import com.immersion.hapticmediasdk.utils.Log;
import com.immersion.hapticmediasdk.utils.Profiler;
import java.util.concurrent.atomic.AtomicInteger;
import rrrrrr.crrrrr;
import rrrrrr.rcrrrr;

// Referenced classes of package com.immersion.hapticmediasdk.controllers:
//            HapticPlaybackThread

public class MediaController
{

    private static final String a = "MediaController";
    private static final int b = 1000;
    public static int b044604460446044604460446 = 35;
    public static int b044604460446044604460446 = 1;
    public static int b044604460446044604460446 = 2;
    public static int b044604460446044604460446 = 0;
    private static final int c = 200;
    private AtomicInteger d;
    private AtomicInteger e;
    private Handler f;
    private HapticPlaybackThread g;
    private Profiler h;
    private MediaTaskManager i;
    private Runnable j;

    public MediaController(Looper looper, MediaTaskManager mediataskmanager)
    {
        try
        {
            super();
            d = new AtomicInteger();
            e = new AtomicInteger();
        }
        // Misplaced declaration of an exception variable
        catch (Looper looper)
        {
            throw looper;
        }
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 != b044604460446044604460446)
        {
            b044604460446044604460446 = b044604460446044604460446();
            b044604460446044604460446 = b044604460446044604460446();
        }
        try
        {
            h = new Profiler();
        }
        // Misplaced declaration of an exception variable
        catch (Looper looper)
        {
            throw looper;
        }
        j = new rcrrrr(this);
        i = mediataskmanager;
        f = new crrrrr(this, looper);
        return;
    }

    private int a()
    {
        g.pauseHapticPlayback();
        return 0;
    }

    private void a(int k)
    {
        d.set(k);
        i.transitToState(com.immersion.hapticmediasdk.HapticContentSDK.SDKStatus.PAUSED_DUE_TO_BUFFERING);
    }

    private void a(int k, long l)
    {
        HapticPlaybackThread hapticplaybackthread = g;
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 != b044604460446044604460446)
        {
            b044604460446044604460446 = 10;
            b044604460446044604460446 = 4;
        }
        hapticplaybackthread.playHapticForPlaybackPosition(k, l);
    }

    private void a(Message message)
    {
        message = (Exception)message.getData().getSerializable("haptic_download_exception");
        if (message instanceof HttpUnsuccessfulException)
        {
            HttpUnsuccessfulException httpunsuccessfulexception = (HttpUnsuccessfulException)message;
            Log.e("MediaController", (new StringBuilder()).append("caught HttpUnsuccessfulExcetion http status code = ").append(httpunsuccessfulexception.getHttpStatusCode()).toString());
        }
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 != b044604460446044604460446)
        {
            b044604460446044604460446 = b044604460446044604460446();
            b044604460446044604460446 = 98;
        }
        Log.e("MediaController", (new StringBuilder("HapticDownloadError: ")).append(message.getMessage()).toString());
        i.transitToState(com.immersion.hapticmediasdk.HapticContentSDK.SDKStatus.STOPPED_DUE_TO_ERROR);
    }

    private void a(boolean flag)
    {
        int k;
        boolean flag1;
        k = 0;
        flag1 = g.isStarted();
_L2:
        int l;
        boolean flag2;
        if (flag ? !flag1 : flag1)
        {
            break MISSING_BLOCK_LABEL_21;
        } else
        {
            break; /* Loop/switch isn't completed */
        }
        synchronized (g)
        {
            try
            {
                g.wait(200L);
            }
            // Misplaced declaration of an exception variable
            catch (InterruptedException interruptedexception) { }
        }
        flag2 = g.isStarted();
        l = k + 1;
        flag1 = flag2;
        k = l;
        if (flag) goto _L2; else goto _L1
_L1:
        flag1 = flag2;
        k = l;
        if (l < 5) goto _L2; else goto _L3
_L3:
        return;
        exception;
        hapticplaybackthread;
        JVM INSTR monitorexit ;
        InterruptedException interruptedexception;
        throw exception;
    }

    public static void b043B043B043B043B043B043B(MediaController mediacontroller, int k, long l)
    {
        int i1 = b044604460446044604460446;
        switch ((i1 * (b044604460446044604460446 + i1)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = 79;
            b044604460446044604460446 = 74;
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            mediacontroller.a(k, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediaController mediacontroller)
        {
            throw mediacontroller;
        }
    }

    public static void b043B043B043B043B043B043B(MediaController mediacontroller, Message message)
    {
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 != b044604460446044604460446())
        {
            b044604460446044604460446 = 31;
            b044604460446044604460446 = 2;
        }
        mediacontroller.a(message);
    }

    public static AtomicInteger b043B043B043B043B043B043B(MediaController mediacontroller)
    {
        int k = b044604460446044604460446;
        switch ((k * (b044604460446044604460446 + k)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = 31;
            b044604460446044604460446 = 73;
            // fall through

        case 0: // '\0'
            return mediacontroller.e;
        }
    }

    public static int b044604460446044604460446()
    {
        return 5;
    }

    public static int b044604460446044604460446()
    {
        return 2;
    }

    public static AtomicInteger b041104110411041104110411(MediaController mediacontroller)
    {
        try
        {
            mediacontroller = mediacontroller.d;
        }
        // Misplaced declaration of an exception variable
        catch (MediaController mediacontroller)
        {
            throw mediacontroller;
        }
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 != b044604460446044604460446())
        {
            b044604460446044604460446 = 20;
            b044604460446044604460446 = 78;
        }
        return mediacontroller;
    }

    public static HapticPlaybackThread b043B043B043B043B043B043B(MediaController mediacontroller)
    {
        int k = b044604460446044604460446;
        switch ((k * (b044604460446044604460446 + k)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = 93;
            b044604460446044604460446 = b044604460446044604460446();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            mediacontroller = mediacontroller.g;
        }
        // Misplaced declaration of an exception variable
        catch (MediaController mediacontroller)
        {
            throw mediacontroller;
        }
        return mediacontroller;
    }

    public static MediaTaskManager b043B043B043B043B043B043B(MediaController mediacontroller)
    {
        mediacontroller = mediacontroller.i;
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 != b044604460446044604460446)
        {
            b044604460446044604460446 = 52;
            b044604460446044604460446 = 73;
        }
        return mediacontroller;
    }

    public static void b043B043B043B043B043B043B(MediaController mediacontroller, int k)
    {
        mediacontroller.a(k);
    }

    public static int b044604460446044604460446()
    {
        return 0;
    }

    public Handler getControlHandler()
    {
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 != b044604460446044604460446)
        {
            b044604460446044604460446 = 97;
            b044604460446044604460446 = 45;
        }
        return f;
    }

    public int getCurrentPosition()
    {
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 != b044604460446044604460446)
        {
            b044604460446044604460446 = 51;
            b044604460446044604460446 = 63;
        }
        return (int)i.getMediaTimestamp();
    }

    public long getReferenceTimeForCurrentPosition()
    {
        int k = b044604460446044604460446;
        switch ((k * (b044604460446044604460446 + k)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = b044604460446044604460446();
            b044604460446044604460446 = 38;
            break;

        case 0: // '\0'
            break;
        }
        long l;
        try
        {
            l = i.getMediaReferenceTime();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return l;
    }

    public void initHapticPlayback(HapticPlaybackThread hapticplaybackthread)
    {
        try
        {
            g = hapticplaybackthread;
            g.start();
        }
        // Misplaced declaration of an exception variable
        catch (HapticPlaybackThread hapticplaybackthread)
        {
            throw hapticplaybackthread;
        }
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 != b044604460446044604460446)
        {
            b044604460446044604460446 = b044604460446044604460446();
            b044604460446044604460446 = 24;
        }
        try
        {
            a(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HapticPlaybackThread hapticplaybackthread)
        {
            throw hapticplaybackthread;
        }
    }

    public boolean isPlaying()
    {
        com.immersion.hapticmediasdk.HapticContentSDK.SDKStatus sdkstatus;
        com.immersion.hapticmediasdk.HapticContentSDK.SDKStatus sdkstatus1;
        try
        {
            sdkstatus = i.getSDKStatus();
            sdkstatus1 = com.immersion.hapticmediasdk.HapticContentSDK.SDKStatus.PLAYING;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return sdkstatus == sdkstatus1;
    }

    public void onDestroy(Handler handler)
    {
        if (g != null)
        {
            g.quitHapticPlayback();
            a(false);
            g = null;
        }
        MediaTaskManager mediataskmanager = i;
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 != b044604460446044604460446)
        {
            b044604460446044604460446 = b044604460446044604460446();
            b044604460446044604460446 = 29;
        }
        handler.removeCallbacks(mediataskmanager);
    }

    public int onPause()
    {
        int k = a();
        int l = b044604460446044604460446;
        switch ((l * (b044604460446044604460446 + l)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = 39;
            b044604460446044604460446 = 73;
            // fall through

        case 0: // '\0'
            return k;
        }
    }

    public int onPrepared()
    {
        return prepareHapticPlayback();
    }

    public void playbackStarted()
    {
        if (g != null)
        {
            HapticPlaybackThread hapticplaybackthread = g;
            int k = b044604460446044604460446;
            switch ((k * (b044604460446044604460446 + k)) % b044604460446044604460446)
            {
            default:
                b044604460446044604460446 = b044604460446044604460446();
                b044604460446044604460446 = b044604460446044604460446();
                // fall through

            case 0: // '\0'
                hapticplaybackthread.getHandler().postDelayed(j, 200L);
                break;
            }
            return;
        } else
        {
            Log.e("MediaController", "Can't start periodic sync since haptic playback thread stopped.");
            return;
        }
    }

    public int prepareHapticPlayback()
    {
        HapticPlaybackThread hapticplaybackthread;
        int k;
        int l;
        try
        {
            h.startTiming();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        try
        {
            hapticplaybackthread = g;
            k = d.get();
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        l = b044604460446044604460446;
        switch ((l * (b044604460446044604460446 + l)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = b044604460446044604460446();
            b044604460446044604460446 = 98;
            break;

        case 0: // '\0'
            break;
        }
        hapticplaybackthread.prepareHapticPlayback(k, e.incrementAndGet());
        return 0;
    }

    public void seekTo(int k)
    {
        AtomicInteger atomicinteger = d;
        if (k <= 0)
        {
            k = 0;
        }
        atomicinteger.set(k);
        if (g != null)
        {
            Handler handler = g.getHandler();
            k = b044604460446044604460446;
            switch ((k * (b044604460446044604460446 + k)) % b044604460446044604460446)
            {
            default:
                b044604460446044604460446 = 66;
                b044604460446044604460446 = 5;
                // fall through

            case 0: // '\0'
                handler.removeCallbacks(j);
                break;
            }
            g.removePlaybackCallbacks();
        }
    }

    public void setRequestBufferPosition(int k)
    {
        AtomicInteger atomicinteger;
        int l;
        try
        {
            atomicinteger = d;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        l = b044604460446044604460446();
        switch ((l * (b044604460446044604460446 + l)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = 8;
            b044604460446044604460446 = b044604460446044604460446();
            break;

        case 0: // '\0'
            break;
        }
        atomicinteger.set(k);
        return;
    }

    public int stopHapticPlayback()
    {
        d.set(0);
        g.stopHapticPlayback();
        HapticPlaybackThread hapticplaybackthread = g;
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 != b044604460446044604460446)
        {
            b044604460446044604460446 = 48;
            b044604460446044604460446 = 63;
        }
        hapticplaybackthread.getHandler().removeCallbacks(j);
        return 0;
    }

    public void waitHapticStopped()
    {
        boolean flag = g.isStopped();
        int k = 0;
        do
        {
            if (flag || k >= 5)
            {
                break;
            }
            synchronized (g)
            {
                try
                {
                    g.wait(200L);
                }
                // Misplaced declaration of an exception variable
                catch (InterruptedException interruptedexception) { }
            }
            flag = g.isStopped();
            k++;
        } while (true);
        break MISSING_BLOCK_LABEL_61;
        exception;
        hapticplaybackthread;
        JVM INSTR monitorexit ;
        throw exception;
        InterruptedException interruptedexception;
    }
}
