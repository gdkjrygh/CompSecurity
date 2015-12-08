// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import android.hardware.Camera;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.sensors.proxies.camera.CameraProxy;
import java.util.ArrayList;

public final class u
    implements android.hardware.Camera.PreviewCallback
{

    public final CameraProxy a;
    public final android.hardware.Camera.PreviewCallback b;
    public ArrayList c;
    final Size d;

    public u(CameraProxy cameraproxy, android.hardware.Camera.PreviewCallback previewcallback, Size size)
    {
        c = null;
        a = cameraproxy;
        b = previewcallback;
        d = size;
    }

    public final void onPreviewFrame(byte abyte0[], Camera camera)
    {
        b.onPreviewFrame(abyte0, camera);
    }
}
