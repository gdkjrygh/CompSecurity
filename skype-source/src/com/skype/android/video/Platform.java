// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.microsoft.media.RtcPalEnvironment;
import com.skype.android.platform.capture.CameraManager;
import com.skype.android.platform.capture.CameraManagerSingleton;
import com.skype.android.util.Log;
import com.skype.android.video.common.PlatformInfo;
import com.skype.android.video.hw.factory.ExtensionFactory;
import java.io.IOException;

public class Platform
{

    private static final String TAG = "Skype";
    private static ConnectivityManager connectivityManager;
    private static boolean isInitialized = false;

    public Platform()
    {
    }

    public static boolean initCameraManagerFactory(boolean flag)
    {
        if (flag)
        {
            try
            {
                if (Log.isLoggable("Skype", 4))
                {
                    Log.i("Skype", "Using virtual cameras");
                }
                CameraManagerSingleton.a(new com.skype.android.fake.capture.CameraManagerFake.Factory());
            }
            catch (RuntimeException runtimeexception)
            {
                if (Log.isLoggable("Skype", 6))
                {
                    Log.e("Skype", "Exception caught", runtimeexception);
                }
                return false;
            }
            break MISSING_BLOCK_LABEL_86;
        }
        if (Log.isLoggable("Skype", 4))
        {
            Log.i("Skype", "Using real cameras");
        }
        CameraManagerSingleton.a(new com.skype.android.impl.capture.CameraManagerImpl.Factory());
        return true;
    }

    private static native void initNative();

    public static void initialize(Context context)
    {
        if (Log.isLoggable("Skype", 4))
        {
            Log.i("Skype", "Initializing the platform");
        }
        initNative();
        ExtensionFactory.initNative();
        ExtensionFactory.setVideoEncoderExtensionFactory(new com.skype.android.video.hw.extension.encoder.VideoCameraEncoderExtension.Factory());
        ExtensionFactory.setVideoDecoderExtensionFactory(new com.skype.android.video.hw.extension.decoder.VideoSampleDecoderExtension.Factory());
        CameraManagerSingleton.a(new com.skype.android.impl.capture.CameraManagerImpl.Factory());
        PlatformInfo.initialize(context);
        RtcPalEnvironment.setContext(context);
        connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        isInitialized = true;
_L1:
        return;
        context;
        if (Log.isLoggable("Skype", 6))
        {
            Log.e("Skype", "Exception caught", context);
            return;
        }
          goto _L1
    }

    public static boolean isConnectionBroadband()
    {
        if (connectivityManager != null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (!Log.isLoggable("Skype", 3))
        {
            break MISSING_BLOCK_LABEL_217;
        }
        Log.d("Skype", "ConnectivityManager is not available");
        return false;
        Object obj = connectivityManager.getActiveNetworkInfo();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (Log.isLoggable("Skype", 3))
        {
            Log.d("Skype", "No network connection");
        }
        break MISSING_BLOCK_LABEL_219;
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        if (!connectivityManager.isActiveNetworkMetered())
        {
            break MISSING_BLOCK_LABEL_128;
        }
        if (!Log.isLoggable("Skype", 3))
        {
            break MISSING_BLOCK_LABEL_217;
        }
        Log.d("Skype", (new StringBuilder("Network connection is metered: ")).append(obj).toString());
        return false;
        if (((NetworkInfo) (obj)).isConnected() && (((NetworkInfo) (obj)).getType() == 1 || ((NetworkInfo) (obj)).getType() == 9))
        {
            if (Log.isLoggable("Skype", 3))
            {
                Log.d("Skype", (new StringBuilder("Network connection is non-metered broadband: ")).append(obj).toString());
            }
            break MISSING_BLOCK_LABEL_221;
        }
        try
        {
            if (Log.isLoggable("Skype", 3))
            {
                Log.d("Skype", (new StringBuilder("Network connection is non-metered narrowband: ")).append(obj).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (Log.isLoggable("Skype", 6))
            {
                Log.e("Skype", "Exception caught", ((Throwable) (obj)));
                return false;
            }
        }
        return false;
        return true;
        return true;
    }

    public static native boolean isSliqExternal();

    public static void shutdown()
    {
        if (isInitialized)
        {
            try
            {
                CameraManagerSingleton.a().close();
                return;
            }
            catch (IOException ioexception)
            {
                if (Log.isLoggable("Skype", 6))
                {
                    Log.e("Skype", "Exception caught", ioexception);
                    return;
                }
            }
        }
    }

}
