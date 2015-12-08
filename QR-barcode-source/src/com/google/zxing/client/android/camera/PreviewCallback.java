// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.camera;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.google.zxing.client.android.camera:
//            CameraConfigurationManager

final class PreviewCallback
    implements android.hardware.Camera.PreviewCallback
{

    private static final String TAG = com/google/zxing/client/android/camera/PreviewCallback.getSimpleName();
    private final CameraConfigurationManager configManager;
    private Handler previewHandler;
    private int previewMessage;

    PreviewCallback(CameraConfigurationManager cameraconfigurationmanager)
    {
        configManager = cameraconfigurationmanager;
    }

    public void onPreviewFrame(byte abyte0[], Camera camera)
    {
        camera = configManager.getCameraResolution();
        Handler handler = previewHandler;
        if (camera != null && handler != null)
        {
            handler.obtainMessage(previewMessage, ((Point) (camera)).x, ((Point) (camera)).y, abyte0).sendToTarget();
            previewHandler = null;
            return;
        } else
        {
            Log.d(TAG, "Got preview callback, but no handler or resolution available");
            return;
        }
    }

    void setHandler(Handler handler, int i)
    {
        previewHandler = handler;
        previewMessage = i;
    }

}
