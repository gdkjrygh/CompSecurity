// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.graphics.Rect;
import android.util.Log;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;
import com.google.android.libraries.commerce.ocr.util.ShapeModifier;

public class BarcodeRegionOfInterestProvider
    implements OcrRegionOfInterestProvider
{

    private Rect boundingBoxRect;
    private Rect boundingBoxRectRelativeToImage;
    private final CameraManager cameraManager;
    private final ShapeModifier shapeModifier;

    public BarcodeRegionOfInterestProvider(CameraManager cameramanager, ShapeModifier shapemodifier)
    {
        cameraManager = cameramanager;
        shapeModifier = shapemodifier;
    }

    private static Rect getDecodingArea(Rect rect)
    {
        int j = rect.width();
        int i = rect.height();
        int k = Math.max(j, i);
        int l = Math.min(j, i);
        k = Math.min(k / 2, l);
        j = (j - k) / 2;
        i = (i - k) / 2;
        return new Rect(j, i, j + k, i + k);
    }

    public final Rect getBlurDetectorROI()
    {
        return boundingBoxRectRelativeToImage;
    }

    public final Rect getBoundingBoxRect()
    {
        return boundingBoxRect;
    }

    public final Rect getBoundingBoxRectRelativeToCameraPreview()
    {
        return boundingBoxRectRelativeToImage;
    }

    public final void onImageAreaChange(Rect rect)
    {
        boundingBoxRect = getDecodingArea(rect);
        Log.d("BarcodeRegionOfInterestProvider", String.format("Bounding box: %s", new Object[] {
            boundingBoxRect.toShortString()
        }));
        boundingBoxRectRelativeToImage = shapeModifier.scaleToNewResolutionThenSwapDimensions(boundingBoxRect, rect, cameraManager.getPreviewSize());
        Log.d("BarcodeRegionOfInterestProvider", String.format("Bounding box relative to image: %s", new Object[] {
            boundingBoxRectRelativeToImage.toShortString()
        }));
    }
}
