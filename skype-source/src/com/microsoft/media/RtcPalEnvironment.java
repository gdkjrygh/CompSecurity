// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.microsoft.media:
//            AudioPal, RtcPalConfig, NetworkPal

public class RtcPalEnvironment
{
    public static final class AudioEndpoint extends Enum
    {

        private static final AudioEndpoint $VALUES[];
        public static final AudioEndpoint BLUETOOTH;
        public static final AudioEndpoint NON_SPEAKER;
        public static final AudioEndpoint SPEAKER;
        private int mValue;

        public static AudioEndpoint valueOf(String s)
        {
            return (AudioEndpoint)Enum.valueOf(com/microsoft/media/RtcPalEnvironment$AudioEndpoint, s);
        }

        public static AudioEndpoint[] values()
        {
            return (AudioEndpoint[])$VALUES.clone();
        }

        public final int getAudioEndpoint()
        {
            return mValue;
        }

        static 
        {
            SPEAKER = new AudioEndpoint("SPEAKER", 0, 1);
            NON_SPEAKER = new AudioEndpoint("NON_SPEAKER", 1, 2);
            BLUETOOTH = new AudioEndpoint("BLUETOOTH", 2, 4);
            $VALUES = (new AudioEndpoint[] {
                SPEAKER, NON_SPEAKER, BLUETOOTH
            });
        }

        private AudioEndpoint(String s, int i, int j)
        {
            super(s, i);
            mValue = j;
        }
    }


    private static final String EXTERNAL_REG = "tmp/rtcpal_registry.reg";
    private static final String INTERNAL_REG = "rtcpal_registry.reg";
    private static String TAG = "RtcPalEnvironment";
    private static Context _context;
    private static boolean _palInited = false;

    public RtcPalEnvironment()
    {
    }

    public static boolean IsPalInitialized()
    {
        return _palInited;
    }

    private static void closeSilently(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    private static void copyRtcPalRegistry(Context context)
    {
        Object obj;
        Object obj1;
        Context context1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        obj5 = null;
        obj4 = null;
        obj2 = null;
        obj3 = null;
        obj1 = obj2;
        obj = obj4;
        context1 = obj5;
        File file = new File(Environment.getExternalStorageDirectory(), "tmp/rtcpal_registry.reg");
        obj1 = obj2;
        obj = obj4;
        context1 = obj5;
        if (file.exists())
        {
            break MISSING_BLOCK_LABEL_100;
        }
        obj1 = obj2;
        obj = obj4;
        context1 = obj5;
        Log.i(TAG, (new StringBuilder()).append(file.getAbsolutePath()).append(" doesn't exist").toString());
        closeSilently(null);
        closeSilently(null);
        return;
        obj1 = obj2;
        obj = obj4;
        context1 = obj5;
        context = context.openFileOutput("rtcpal_registry.reg", 0);
        obj1 = obj2;
        obj = context;
        context1 = context;
        obj2 = new FileInputStream(file);
        obj = new byte[1024];
_L3:
        int i = ((InputStream) (obj2)).read(((byte []) (obj)));
        if (i < 0) goto _L2; else goto _L1
_L1:
        context.write(((byte []) (obj)), 0, i);
          goto _L3
        obj;
        context1 = context;
        context = ((Context) (obj2));
        obj2 = obj;
_L7:
        obj1 = context;
        obj = context1;
        Log.e(TAG, ((IOException) (obj2)).toString(), ((Throwable) (obj2)));
        closeSilently(context);
        closeSilently(context1);
        return;
_L2:
        Log.i(TAG, (new StringBuilder("File ")).append(file.getAbsolutePath()).append(" was copied into internal memory and deleted").toString());
        file.delete();
        closeSilently(((Closeable) (obj2)));
        closeSilently(context);
        return;
        Exception exception;
        exception;
        context = ((Context) (obj));
_L5:
        closeSilently(((Closeable) (obj1)));
        closeSilently(context);
        throw exception;
        exception;
        obj1 = obj2;
        if (true) goto _L5; else goto _L4
_L4:
        obj2;
        context = obj3;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static void initialize()
    {
        if (_context != null)
        {
            initialize(_context);
            Log.i(TAG, "Pal initialization completed");
            return;
        } else
        {
            Log.e(TAG, "Initialization failed, context was not set");
            return;
        }
    }

    public static boolean initialize(Context context)
    {
        if (!AudioPal.initialize(context))
        {
            if (RtcPalConfig.isLogcatEnabled())
            {
                Log.e(TAG, "AudioPal initialization failed");
            }
            throw new ExceptionInInitializerError("AudioPal initialization failed");
        }
        if (!NetworkPal.initialize(context))
        {
            if (RtcPalConfig.isLogcatEnabled())
            {
                Log.e(TAG, "NetworkPal initialization failed");
            }
            throw new ExceptionInInitializerError("NetworkPal initialization failed");
        }
        setAppPath(context.getFilesDir().getParentFile().toString());
        if (!isRelease())
        {
            copyRtcPalRegistry(context);
        }
        if (!"mounted".equals(Environment.getExternalStorageState())) goto _L2; else goto _L1
_L1:
        context = new File(context.getExternalCacheDir(), "");
        if (context.exists()) goto _L4; else goto _L3
_L3:
        if (!context.createNewFile()) goto _L6; else goto _L5
_L5:
        (new StringBuilder("createNewFile() succeeded, file exist status: ")).append(context.exists());
        setTracePath(context.toString());
_L2:
        context = new StringBuffer();
        context.append((new StringBuilder("Android ")).append(android.os.Build.VERSION.RELEASE).append("; Manufacturer: ").append(Build.MANUFACTURER).append("; Product: ").append(Build.PRODUCT).append("; Model: ").append(Build.MODEL).append("; Hardware: ").append(Build.HARDWARE).toString());
        setOSName(context.toString());
        AudioPal.registerReceiver();
        _palInited = true;
        return true;
_L6:
        try
        {
            (new StringBuilder("createNewFile() failed, file exist status: ")).append(context.exists());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e(TAG, (new StringBuilder("createNewFile() IOException: ")).append(context.toString()).toString());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        (new StringBuilder("file already exists ")).append(context.toString());
        setTracePath(context.toString());
        if (true) goto _L2; else goto _L7
_L7:
    }

    private static native boolean isRelease();

    public static int setActiveEndpoint(AudioEndpoint audioendpoint)
    {
        return AudioPal.onActiveEndpointChange(audioendpoint.getAudioEndpoint());
    }

    private static native void setAppPath(String s);

    public static void setContext(Context context)
    {
        _context = context;
        try
        {
            setMediaAgentAppPath(context.getFilesDir().getParentFile().toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void setConversationActivity(Activity activity)
    {
        activity.setVolumeControlStream(0);
    }

    public static void setDeviceChanged(int i)
    {
        AudioPal.onDeviceChange(i);
    }

    public static void setHeadsetWithMicStatus(boolean flag)
    {
        AudioPal.onHeadsetWithMicStatusChange(flag);
    }

    private static native void setMediaAgentAppPath(String s);

    private static native void setOSName(String s);

    private static native void setTracePath(String s);

    public static void setVolumeChange()
    {
        AudioPal.onVolumeChange();
    }

    public static void uninitialize()
    {
        AudioPal.unregisterReceiver();
        _palInited = false;
    }

}
