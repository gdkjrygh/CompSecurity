// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;

import android.content.res.Resources;
import android.hardware.Camera;
import android.os.Handler;
import java.util.Map;

// Referenced classes of package com.google.android.apps.unveil.sensors.proxies.camera:
//            RealCamera

public class FelixCamera extends RealCamera
{

    private static FelixCamera globalCamera;
    private boolean skipNextRelease;

    protected FelixCamera(Camera camera)
    {
        super(camera);
        skipNextRelease = false;
    }

    public static FelixCamera open(Handler handler, Map map, Resources resources)
    {
        if (globalCamera != null)
        {
            return globalCamera;
        }
        map = Camera.open();
        handler = map;
        if (map == null)
        {
            handler = Camera.open(0);
        }
        handler = new FelixCamera(handler);
        globalCamera = handler;
        return handler;
    }

    public static void skipNextRelease()
    {
        if (globalCamera != null)
        {
            globalCamera.skipNextRelease = true;
        }
    }

    public void release()
    {
        if (skipNextRelease)
        {
            skipNextRelease = false;
            return;
        } else
        {
            super.release();
            globalCamera = null;
            return;
        }
    }
}
