// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture;

import android.graphics.Point;
import android.hardware.Camera;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;

// Referenced classes of package com.google.android.libraries.commerce.ocr.capture:
//            CameraManagerImpl

final class allback
    implements android.hardware.ck
{

    final CameraManagerImpl this$0;
    final allback val$imageCallback;

    public final void onPictureTaken(byte abyte0[], Camera camera)
    {
        camera = camera.getParameters();
        Point point = new Point(camera.tPictureSize().tPictureSize, camera.tPictureSize().tPictureSize);
        val$imageCallback.onImage(new OcrImage(abyte0, camera.tPictureFormat(), point, getOrientation()));
    }

    allback()
    {
        this$0 = final_cameramanagerimpl;
        val$imageCallback = allback.this;
        super();
    }
}
