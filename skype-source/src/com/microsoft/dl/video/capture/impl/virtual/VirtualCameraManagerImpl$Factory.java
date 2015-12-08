// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.virtual;

import com.microsoft.dl.utils.Log;
import com.microsoft.dl.video.capture.api.CameraManager;
import com.microsoft.dl.video.capture.api.CameraManagerFactory;
import java.io.IOException;
import org.json.JSONException;

// Referenced classes of package com.microsoft.dl.video.capture.impl.virtual:
//            VirtualCameraManagerImpl

public static class 
    implements CameraManagerFactory
{

    public final CameraManager createCameraManager()
    {
        String s1 = "{ \"cameras\": [ { \"id\": 0 } ] }";
        String s = VirtualCameraManagerImpl.a(VirtualCameraManagerImpl.a());
_L2:
        return new VirtualCameraManagerImpl(s);
        Object obj;
        obj;
        obj = s1;
        if (!Log.isLoggable("Capture", 5)) goto _L2; else goto _L1
_L1:
        Log.w("Capture", (new StringBuilder("Could not read configuration from ")).append(VirtualCameraManagerImpl.a()).toString());
        obj = s1;
          goto _L2
        obj;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Could not parse configuration", ((Throwable) (obj)));
        }
        return null;
    }

    public ()
    {
    }
}
