// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.impl.capture;

import com.skype.android.platform.capture.CameraManager;
import com.skype.android.platform.capture.CameraManagerFactory;

// Referenced classes of package com.skype.android.impl.capture:
//            CameraManagerImpl

public static class 
    implements CameraManagerFactory
{

    public CameraManager createCameraManager()
    {
        return new CameraManagerImpl();
    }

    public ()
    {
    }
}
