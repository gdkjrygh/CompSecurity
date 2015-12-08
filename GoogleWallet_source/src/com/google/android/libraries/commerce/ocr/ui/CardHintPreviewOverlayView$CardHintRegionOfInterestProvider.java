// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ui;

import android.graphics.Rect;
import android.util.Log;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.util.ScreenManager;
import com.google.android.libraries.commerce.ocr.util.ShapeModifier;
import com.google.common.base.Function;
import java.util.Locale;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ui:
//            OcrRegionOfInterestProvider, CardHintPreviewOverlayView

public static class blurCalculationStrategy
    implements OcrRegionOfInterestProvider
{

    private final Function blurCalculationStrategy;
    private Rect blurDetectorRoiRect;
    private Rect boundingBoxRect;
    private Rect boundingBoxRectRelativeToImage;
    private final CameraManager cameraManager;
    private final float edgeFinderWidthToOuterBoundingBoxEdgeLengthRatio;
    private Rect midBoundingBoxRect;
    private final ScreenManager screenManager;
    private final ShapeModifier shapeModifier;

    private Rect calculateRelativeToImage(Rect rect, Rect rect1, boolean flag)
    {
        Rect rect2 = rect;
        if (flag)
        {
            rect2 = rect;
            if (cameraManager.getOrientation() >= 180)
            {
                rect2 = shapeModifier.getShapeModifier(rect).apeModifier(180, rect1.exactCenterX(), rect1.exactCenterY()).apeModifier();
            }
        }
        rect = cameraManager.getPreviewSize();
        if (screenManager.isInPortraitMode())
        {
            return shapeModifier.scaleToNewResolutionThenSwapDimensions(rect2, rect1, rect);
        } else
        {
            return shapeModifier.scaleToNewResolution(rect2, rect1, rect);
        }
    }

    protected Rect calculateCenteredIso7810CardArea(Rect rect)
    {
        float f = (float)Math.min(rect.height(), rect.width()) * 0.99F;
        float f1 = f / 1.585773F;
        ShapeModifier shapemodifier = shapeModifier;
        ShapeModifier shapemodifier1 = shapeModifier;
        return shapemodifier.toRect(ShapeModifier.getCenteredRect(rect, f, f1));
    }

    public Rect getBlurDetectorROI()
    {
        return blurDetectorRoiRect;
    }

    public Rect getBoundingBoxRect()
    {
        return boundingBoxRect;
    }

    public Rect getBoundingBoxRectRelativeToCameraPreview()
    {
        return boundingBoxRectRelativeToImage;
    }

    public Rect getMidBoundingBoxRect()
    {
        return midBoundingBoxRect;
    }

    public void onImageAreaChange(Rect rect)
    {
        boundingBoxRect = calculateCenteredIso7810CardArea(rect);
        midBoundingBoxRect = shapeModifier.resizeBoundingBox(boundingBoxRect, edgeFinderWidthToOuterBoundingBoxEdgeLengthRatio);
        Log.d("CardRegionOfInterestProvider", String.format(Locale.US, "Visible Area: %s, Bounding box: %s, Mid Bounding Box: %s", new Object[] {
            rect, boundingBoxRect.toShortString(), midBoundingBoxRect.toShortString()
        }));
        boundingBoxRectRelativeToImage = calculateRelativeToImage(boundingBoxRect, rect, false);
        Log.d("CardRegionOfInterestProvider", String.format(Locale.US, "Bounding box relative to image: %s", new Object[] {
            boundingBoxRectRelativeToImage.toShortString()
        }));
        midBoundingBoxRect = shapeModifier.resizeBoundingBox(boundingBoxRect, edgeFinderWidthToOuterBoundingBoxEdgeLengthRatio);
        Rect rect1 = (Rect)blurCalculationStrategy.apply(boundingBoxRect);
        blurDetectorRoiRect = calculateRelativeToImage(rect1, rect, true);
        Log.d("CardRegionOfInterestProvider", String.format(Locale.US, "Blur detection on screen bounding box: %s, blur ROI box: %s, preview size: %s", new Object[] {
            rect1.toShortString(), blurDetectorRoiRect.toShortString(), cameraManager.getPreviewSize()
        }));
    }

    public (ScreenManager screenmanager, CameraManager cameramanager, ShapeModifier shapemodifier, float f, Function function)
    {
        screenManager = screenmanager;
        cameraManager = cameramanager;
        shapeModifier = shapemodifier;
        edgeFinderWidthToOuterBoundingBoxEdgeLengthRatio = f;
        blurCalculationStrategy = function;
    }
}
