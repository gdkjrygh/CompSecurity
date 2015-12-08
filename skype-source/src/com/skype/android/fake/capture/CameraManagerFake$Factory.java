// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.fake.capture;

import com.skype.android.platform.capture.CameraManager;
import com.skype.android.platform.capture.CameraManagerFactory;
import com.skype.android.util.Log;
import java.io.IOException;
import org.json.JSONException;

// Referenced classes of package com.skype.android.fake.capture:
//            CameraManagerFake

public static class 
    implements CameraManagerFactory
{

    public CameraManager createCameraManager()
    {
        String s1 = "{ \"cameras\": [ { \"id\": 0 } ] }";
        String s = CameraManagerFake.a("/sdcard/fakecam/config.json");
_L2:
        return new CameraManagerFake(s);
        Object obj;
        obj;
        obj = s1;
        if (!Log.isLoggable("Capture", 5)) goto _L2; else goto _L1
_L1:
        Log.w("Capture", "Could not read configuration from /sdcard/fakecam/config.json");
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
