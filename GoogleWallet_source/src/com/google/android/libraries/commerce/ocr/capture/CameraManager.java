// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture;

import android.graphics.Point;
import android.view.SurfaceHolder;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;

// Referenced classes of package com.google.android.libraries.commerce.ocr.capture:
//            SizeSelectionStrategy

public interface CameraManager
{
    public static interface ImageCallback
    {

        public abstract void onImage(OcrImage ocrimage);
    }

    public static interface OnFinishCallback
    {

        public abstract void onFinish();
    }


    public abstract void addContinuousPreviewImageCallback(ImageCallback imagecallback);

    public abstract void closeDriver();

    public abstract int getOrientation();

    public abstract Point getPreviewSize();

    public abstract Point getScreenFillingPreviewSize();

    public abstract void openDriver(Point point, SurfaceHolder surfaceholder, OnFinishCallback onfinishcallback)
        throws RuntimeException;

    public abstract void requestAutoFocus();

    public abstract boolean requestImage(ImageCallback imagecallback, byte byte0);

    public abstract void restartPreview();

    public abstract void setSizeSelectionStrategy(SizeSelectionStrategy sizeselectionstrategy);

    public abstract void startPreview(OnFinishCallback onfinishcallback);

    public abstract void stopPreview();
}
