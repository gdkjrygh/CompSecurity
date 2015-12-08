// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.audio;

import android.content.Context;
import android.util.Log;

// Referenced classes of package com.microsoft.dl.audio:
//            RouteController, VolumeController

public class AudioPlatform
{
    public static class clientCallback
    {

        public void callbackWithError(String s)
        {
            if (Log.isLoggable("DLAudioJava", 4))
            {
                Log.i("DLAudioJava", "Callback Route Change with error");
            }
        }

        public void callbackWithoutError(String s)
        {
            if (Log.isLoggable("DLAudioJava", 4))
            {
                Log.i("DLAudioJava", "Callback Route Change without error");
            }
        }

        public clientCallback()
        {
        }
    }


    private static RouteController a = null;
    private static VolumeController b = null;
    private static clientCallback c;

    private AudioPlatform()
    {
    }

    public static String getDefaultRoute()
    {
        if (Log.isLoggable("DLAudioJava", 4))
        {
            Log.i("DLAudioJava", "getDefaultRoute()");
        }
        if (a != null)
        {
            return a.getDefaultRoute();
        }
        if (Log.isLoggable("DLAudioJava", 6))
        {
            Log.e("DLAudioJava", "RouteController class not instantiated");
        }
        return "";
    }

    public static RouteController getJavaRouteInstance()
    {
        com/microsoft/dl/audio/AudioPlatform;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("DLAudioJava", 5))
        {
            Log.w("DLAudioJava", "java class RouteController is not available: no instance");
        }
        RouteController routecontroller = null;
_L4:
        com/microsoft/dl/audio/AudioPlatform;
        JVM INSTR monitorexit ;
        return routecontroller;
_L2:
        routecontroller = a;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static VolumeController getJavaVolumeInstance()
    {
        com/microsoft/dl/audio/AudioPlatform;
        JVM INSTR monitorenter ;
        if (b != null) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("DLAudioJava", 5))
        {
            Log.w("DLAudioJava", "java class VolumeController is not available: no instance");
        }
        VolumeController volumecontroller = null;
_L4:
        com/microsoft/dl/audio/AudioPlatform;
        JVM INSTR monitorexit ;
        return volumecontroller;
_L2:
        volumecontroller = b;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean initialize(Context context, boolean flag, clientCallback clientcallback)
    {
        if (a == null)
        {
            if (flag && clientcallback == null)
            {
                c = new clientCallback();
            } else
            {
                c = clientcallback;
            }
            a = new RouteController(flag, c);
            if (Log.isLoggable("DLAudioJava", 4))
            {
                Log.i("DLAudioJava", "RouteController constructed");
            }
        }
        if (b == null)
        {
            context = new VolumeController(context);
            b = context;
            context.registerVolumeIntentReceiver();
            if (Log.isLoggable("DLAudioJava", 4))
            {
                Log.i("DLAudioJava", "VolumeController constructed");
            }
        }
        if (Log.isLoggable("DLAudioJava", 4))
        {
            Log.i("DLAudioJava", "AudioPlatform initialized");
        }
        return true;
    }

    public static void registerNativeInstance(long l)
    {
        com/microsoft/dl/audio/AudioPlatform;
        JVM INSTR monitorenter ;
        if (l != 0L) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("DLAudioJava", 5))
        {
            Log.w("DLAudioJava", "The native instance is null, no callback possible");
        }
_L4:
        if (b != null)
        {
            b.registerNativeInstance(l);
        }
        if (a != null)
        {
            a.registerNativeInstance(l);
        }
        com/microsoft/dl/audio/AudioPlatform;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!Log.isLoggable("DLAudioJava", 4)) goto _L4; else goto _L3
_L3:
        Log.i("DLAudioJava", (new StringBuilder("register native instance=")).append(l).toString());
          goto _L4
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean setRoute(String s)
    {
        if (Log.isLoggable("DLAudioJava", 4))
        {
            Log.i("DLAudioJava", (new StringBuilder("setRoute() from UI: ")).append(s).toString());
        }
        if (a != null)
        {
            return a.setRouteChange(s);
        }
        if (Log.isLoggable("DLAudioJava", 6))
        {
            Log.e("DLAudioJava", "RouteController class not instantiated");
        }
        return false;
    }

    public static void uninitialize()
    {
        if (b != null)
        {
            b.unregisterVolumeIntentReceiver();
        }
        a = null;
        b = null;
        if (Log.isLoggable("DLAudioJava", 4))
        {
            Log.i("DLAudioJava", "AudioPlatform uninitialized");
        }
    }

    public static void unregisterNativeInstance()
    {
        com/microsoft/dl/audio/AudioPlatform;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            b.unregisterNativeInstance();
        }
        if (a != null)
        {
            a.unregisterNativeInstance();
        }
        if (Log.isLoggable("DLAudioJava", 4))
        {
            Log.i("DLAudioJava", "unregister native instance ");
        }
        com/microsoft/dl/audio/AudioPlatform;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
