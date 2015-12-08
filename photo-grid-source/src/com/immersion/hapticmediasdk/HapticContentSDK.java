// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.hapticmediasdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.immersion.hapticmediasdk.utils.Log;
import com.immersion.hapticmediasdk.utils.RuntimeInfo;

// Referenced classes of package com.immersion.hapticmediasdk:
//            MediaTaskManager

public abstract class HapticContentSDK
{

    public static final int INACCESSIBLE_URL = -2;
    public static final int INVALID = -1;
    public static final int MALFORMED_URL = -4;
    public static final int PERMISSION_DENIED = -3;
    public static final int SDKMODE_MEDIAPLAYBACK = 0;
    public static final int SUCCESS = 0;
    public static final int UNSUPPORTED_PROTOCOL = -5;
    private static final String a = "HapticContentSDK";
    public static final int b044404440444044404440444 = 10000;
    public static int b044604460446044604460446 = 25;
    public static int b044604460446044604460446 = 1;
    public static final int b044404440444044404440444 = 1500;
    public static int b044604460446044604460446 = 2;
    public static int b044604460446044604460446;
    private HandlerThread b;
    private Handler c;
    private Context d;
    private RuntimeInfo e;
    public boolean mDisposed;
    public MediaTaskManager mMediaTaskManager;
    public SDKStatus mSDKStatus;

    public HapticContentSDK(int i, Context context)
    {
        mSDKStatus = SDKStatus.NOT_INITIALIZED;
        mDisposed = false;
        d = context;
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 != b044604460446044604460446)
        {
            b044604460446044604460446 = 24;
            b044604460446044604460446 = b044604460446044604460446();
        }
        e = new RuntimeInfo();
    }

    public static int b044604460446044604460446()
    {
        return 96;
    }

    public static int b044604460446044604460446()
    {
        return 2;
    }

    public int b041104110411041104110411()
    {
        if (d.getPackageManager().checkPermission("android.permission.VIBRATE", d.getPackageName()) != 0)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        b = new HandlerThread("SDK Monitor");
        b.start();
        Handler handler;
        int i;
        try
        {
            c = new Handler(b.getLooper());
            handler = c;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        i = b044604460446044604460446;
        switch ((i * (b044604460446044604460446 + i)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = b044604460446044604460446();
            b044604460446044604460446 = 93;
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            mMediaTaskManager = new MediaTaskManager(handler, d, e);
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return 0;
        Log.e("HapticContentSDK", "Failed to create a Haptic Content SDK instance.Vibrate permission denied.");
        return -3;
    }

    public final void dispose()
    {
        if (getSDKStatus() != SDKStatus.DISPOSED)
        {
            mMediaTaskManager.transitToState(SDKStatus.NOT_INITIALIZED);
            b.quit();
            b = null;
            mMediaTaskManager = null;
            mDisposed = true;
        }
    }

    public void finalize()
    {
        dispose();
        super.finalize();
        return;
        Object obj;
        obj;
        super.finalize();
        throw obj;
        obj;
        throw obj;
    }

    public final SDKStatus getSDKStatus()
    {
        if (mDisposed)
        {
            return SDKStatus.DISPOSED;
        } else
        {
            return mMediaTaskManager.getSDKStatus();
        }
    }

    public final String getVersion()
    {
        do
        {
        } while (true);
    }

    public final int mute()
    {
        int i = b044604460446044604460446;
        switch ((i * (b044604460446044604460446 + i)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = 16;
            b044604460446044604460446 = b044604460446044604460446();
            break;

        case 0: // '\0'
            break;
        }
        SDKStatus sdkstatus;
        SDKStatus sdkstatus1;
        try
        {
            sdkstatus = getSDKStatus();
            sdkstatus1 = SDKStatus.DISPOSED;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (sdkstatus != sdkstatus1)
        {
            try
            {
                e.mute();
            }
            catch (Exception exception1)
            {
                throw exception1;
            }
            return 0;
        } else
        {
            return -1;
        }
    }

    public abstract int openHaptics(String s);

    public final int pause()
    {
        SDKStatus sdkstatus;
        SDKStatus sdkstatus1;
        sdkstatus = getSDKStatus();
        if (sdkstatus == SDKStatus.DISPOSED)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        sdkstatus1 = SDKStatus.STOPPED_DUE_TO_ERROR;
        if (sdkstatus != sdkstatus1)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        try
        {
            throw new NullPointerException();
        }
        catch (Exception exception)
        {
            b044604460446044604460446 = 21;
        }
        return -1;
        MediaTaskManager mediataskmanager;
        int i;
        try
        {
            mediataskmanager = mMediaTaskManager;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        try
        {
            i = mediataskmanager.transitToState(SDKStatus.PAUSED);
        }
        catch (Exception exception2)
        {
            throw exception2;
        }
        return i;
    }

    public final int play()
    {
label0:
        {
            Object obj;
            SDKStatus sdkstatus;
            int i;
            try
            {
                obj = getSDKStatus();
                if (obj != SDKStatus.INITIALIZED && obj != SDKStatus.STOPPED)
                {
                    break label0;
                }
                mMediaTaskManager.setMediaTimestamp(0L);
                obj = mMediaTaskManager;
                sdkstatus = SDKStatus.PLAYING;
            }
            catch (Exception exception)
            {
                throw exception;
            }
            if (((b044604460446044604460446() + b044604460446044604460446) * b044604460446044604460446()) % b044604460446044604460446() != b044604460446044604460446)
            {
                b044604460446044604460446 = b044604460446044604460446();
                b044604460446044604460446 = b044604460446044604460446();
            }
            try
            {
                i = ((MediaTaskManager) (obj)).transitToState(sdkstatus);
            }
            catch (Exception exception1)
            {
                throw exception1;
            }
            return i;
        }
        return -1;
    }

    public final int resume()
    {
        SDKStatus sdkstatus = getSDKStatus();
        if (sdkstatus != SDKStatus.PAUSED && sdkstatus != SDKStatus.PLAYING)
        {
            if (sdkstatus == SDKStatus.STOPPED)
            {
                do
                {
                } while (true);
            } else
            {
                return -1;
            }
        } else
        {
            mMediaTaskManager.setMediaReferenceTime();
            return mMediaTaskManager.transitToState(SDKStatus.PLAYING);
        }
    }

    public final int seek(int i)
    {
        SDKStatus sdkstatus = getSDKStatus();
        int j = b044604460446044604460446;
        switch ((j * (b044604460446044604460446 + j)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = 56;
            b044604460446044604460446 = b044604460446044604460446();
            break;

        case 0: // '\0'
            break;
        }
        if (sdkstatus == SDKStatus.DISPOSED || sdkstatus == SDKStatus.NOT_INITIALIZED || sdkstatus == SDKStatus.STOPPED_DUE_TO_ERROR)
        {
            return -1;
        } else
        {
            return mMediaTaskManager.SeekTo(i);
        }
    }

    public final int stop()
    {
        SDKStatus sdkstatus = getSDKStatus();
        if (sdkstatus == SDKStatus.DISPOSED || sdkstatus == SDKStatus.NOT_INITIALIZED)
        {
            return -1;
        } else
        {
            return mMediaTaskManager.transitToState(SDKStatus.STOPPED);
        }
    }

    public final int unmute()
    {
label0:
        {
            try
            {
                if (getSDKStatus() == SDKStatus.DISPOSED)
                {
                    break label0;
                }
                e.unmute();
            }
            catch (Exception exception)
            {
                throw exception;
            }
            return 0;
        }
        return -1;
    }

    public final int update(long l)
    {
        SDKStatus sdkstatus = getSDKStatus();
        int i = b044604460446044604460446;
        switch ((i * (b044604460446044604460446 + i)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = b044604460446044604460446();
            b044604460446044604460446 = 98;
            break;

        case 0: // '\0'
            break;
        }
        if (sdkstatus == SDKStatus.PLAYING || sdkstatus == SDKStatus.PAUSED_DUE_TO_TIMEOUT)
        {
            mMediaTaskManager.setMediaTimestamp(l);
            return mMediaTaskManager.transitToState(SDKStatus.PLAYING);
        }
        if (sdkstatus == SDKStatus.PAUSED || sdkstatus == SDKStatus.PAUSED_DUE_TO_BUFFERING)
        {
            mMediaTaskManager.setMediaTimestamp(l);
            return 0;
        } else
        {
            return -1;
        }
    }

    private class SDKStatus extends Enum
    {

        public static final SDKStatus DISPOSED;
        public static final SDKStatus INITIALIZED;
        public static final SDKStatus NOT_INITIALIZED;
        public static final SDKStatus PAUSED;
        public static final SDKStatus PAUSED_DUE_TO_BUFFERING;
        public static final SDKStatus PAUSED_DUE_TO_TIMEOUT;
        public static final SDKStatus PLAYING;
        public static final SDKStatus STOPPED;
        public static final SDKStatus STOPPED_DUE_TO_ERROR;
        private static final SDKStatus a[];
        public static int b041704170417041704170417 = 0;
        public static int b041704170417041704170417 = 2;
        public static int b044A044A044A044A044A044A = 6;
        public static int b044A044A044A044A044A044A = 1;

        public static int b041704170417041704170417()
        {
            return 2;
        }

        public static int b041704170417041704170417()
        {
            return 37;
        }

        public static int b041704170417041704170417()
        {
            return 1;
        }

        public static SDKStatus valueOf(String s)
        {
            try
            {
                s = Enum.valueOf(com/immersion/hapticmediasdk/HapticContentSDK$SDKStatus, s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (((b044A044A044A044A044A044A + b041704170417041704170417()) * b044A044A044A044A044A044A) % b041704170417041704170417 != b041704170417041704170417)
            {
                b044A044A044A044A044A044A = 22;
                b041704170417041704170417 = 7;
            }
            try
            {
                s = (SDKStatus)s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return s;
        }

        public static SDKStatus valueOfCaseInsensitive(String s)
        {
            SDKStatus asdkstatus[];
            SDKStatus sdkstatus;
            int i;
            int j;
            boolean flag;
            try
            {
                asdkstatus = values();
                j = asdkstatus.length;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            i = 0;
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            if (((b044A044A044A044A044A044A + b044A044A044A044A044A044A) * b044A044A044A044A044A044A) % b041704170417041704170417() != b041704170417041704170417)
            {
                b044A044A044A044A044A044A = 55;
                b041704170417041704170417 = b041704170417041704170417();
            }
            sdkstatus = asdkstatus[i];
            flag = s.equalsIgnoreCase(sdkstatus.name());
            if (flag)
            {
                return sdkstatus;
            }
            i++;
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_10;
_L1:
            return null;
        }

        public static SDKStatus[] values()
        {
            int i = b044A044A044A044A044A044A;
            switch ((i * (b044A044A044A044A044A044A + i)) % b041704170417041704170417)
            {
            default:
                b044A044A044A044A044A044A = b041704170417041704170417();
                b044A044A044A044A044A044A = 72;
                break;

            case 0: // '\0'
                break;
            }
            SDKStatus asdkstatus[];
            try
            {
                asdkstatus = a;
            }
            catch (Exception exception1)
            {
                throw exception1;
            }
            try
            {
                asdkstatus = (SDKStatus[])asdkstatus.clone();
            }
            catch (Exception exception)
            {
                throw exception;
            }
            return asdkstatus;
        }

        static 
        {
            NOT_INITIALIZED = new SDKStatus("NOT_INITIALIZED", 0);
            INITIALIZED = new SDKStatus("INITIALIZED", 1);
            PLAYING = new SDKStatus("PLAYING", 2);
            STOPPED = new SDKStatus("STOPPED", 3);
            STOPPED_DUE_TO_ERROR = new SDKStatus("STOPPED_DUE_TO_ERROR", 4);
            PAUSED = new SDKStatus("PAUSED", 5);
            PAUSED_DUE_TO_TIMEOUT = new SDKStatus("PAUSED_DUE_TO_TIMEOUT", 6);
            PAUSED_DUE_TO_BUFFERING = new SDKStatus("PAUSED_DUE_TO_BUFFERING", 7);
            if (((b041704170417041704170417() + b044A044A044A044A044A044A) * b041704170417041704170417()) % b041704170417041704170417 != b041704170417041704170417)
            {
                b044A044A044A044A044A044A = b041704170417041704170417();
                b041704170417041704170417 = b041704170417041704170417();
            }
            DISPOSED = new SDKStatus("DISPOSED", 8);
            a = (new SDKStatus[] {
                NOT_INITIALIZED, INITIALIZED, PLAYING, STOPPED, STOPPED_DUE_TO_ERROR, PAUSED, PAUSED_DUE_TO_TIMEOUT, PAUSED_DUE_TO_BUFFERING, DISPOSED
            });
        }

        private SDKStatus(String s, int i)
        {
            super(s, i);
        }
    }

}
