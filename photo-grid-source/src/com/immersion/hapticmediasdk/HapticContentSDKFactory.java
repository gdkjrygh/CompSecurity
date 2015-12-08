// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.hapticmediasdk;

import android.content.Context;
import com.immersion.content.EndpointWarp;
import com.immersion.hapticmediasdk.utils.Log;

// Referenced classes of package com.immersion.hapticmediasdk:
//            MediaPlaybackSDK, HapticContentSDK

public class HapticContentSDKFactory
{

    private static final String a = "HapticContentSDKFactory";
    public static int b044604460446044604460446 = 19;
    public static int b044604460446044604460446 = 2;
    public static int b044604460446044604460446 = 1;

    public HapticContentSDKFactory()
    {
        int i = b044604460446044604460446;
        switch ((i * (b044604460446044604460446 + i)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = b044604460446044604460446();
            b044604460446044604460446 = b044604460446044604460446();
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public static HapticContentSDK GetNewSDKInstance(int i, Context context)
    {
_L2:
        context = new MediaPlaybackSDK(context);
        i = context.b041104110411041104110411();
        if (i != 0)
        {
            context = new StringBuilder();
            int j = b044604460446044604460446;
            switch ((j * (b044604460446044604460446 + j)) % b044604460446044604460446)
            {
            default:
                b044604460446044604460446 = 42;
                b044604460446044604460446 = 92;
                // fall through

            case 0: // '\0'
                Log.e("HapticContentSDKFactory", context.append("Failed to create Haptic Content SDK instance. error=").append(i).toString());
                break;
            }
            return null;
        } else
        {
            Log.i("HapticContentSDKFactory", "Haptic Content SDK instance was created successfully");
            return context;
        }
        if (!EndpointWarp.loadSharedLibrary())
        {
            return null;
        }
        if (context == null)
        {
            Log.e("HapticContentSDKFactory", "Failed to create a Haptic Content SDK instance. invalid context: null");
            return null;
        }
        switch (i)
        {
        default:
            Log.e("HapticContentSDKFactory", "Failed to create a Haptic Content SDK instance. Invalid mode");
            break; /* Loop/switch isn't completed */

        case 0: // '\0'
            break;
        }
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    public static int b044604460446044604460446()
    {
        return 96;
    }
}
