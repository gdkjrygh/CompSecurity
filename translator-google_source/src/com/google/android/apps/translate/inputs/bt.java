// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.hardware.Camera;
import com.google.android.apps.unveil.nonstop.c;
import com.google.android.apps.unveil.nonstop.m;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.wordlens.NativeFrameSink;

public final class bt extends c
{

    final NativeFrameSink a = new NativeFrameSink();
    private int j;

    public bt()
    {
        j = 0;
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        if (Camera.getNumberOfCameras() > 0)
        {
            Camera.getCameraInfo(0, camerainfo);
            a.a(camerainfo.orientation);
        }
    }

    protected final void a(m m1)
    {
        int i = j;
        j = i + 1;
        if (i == 0)
        {
            a.onSetImageInfoNative(17, m1.c, m1.d);
        }
        try
        {
            a.onSetNextFrameNative(m1.e());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (m m1)
        {
            Singleton.b().a(-804, m1.getMessage());
        }
    }
}
