// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.capture.EdgeChangeListener;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.cv.Boundaries;
import com.google.android.libraries.commerce.ocr.util.ScreenManager;
import com.google.android.libraries.commerce.ocr.util.ShapeModifier;
import com.google.common.base.Function;
import java.util.Locale;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ui:
//            PreviewOverlayView, OcrRegionOfInterestProvider

public class CardHintPreviewOverlayView
    implements EdgeChangeListener, PreviewOverlayView
{
    final class BoundingBoxView extends View
    {

        private final Paint clearPaint = new Paint();
        private final RectF tempRectF = new RectF();
        final CardHintPreviewOverlayView this$0;

        private void drawInverseBoundingBox(Canvas canvas, RectF rectf)
        {
            canvas.drawRect(visiblePreviewArea, backgroundPaint);
            canvas.drawRoundRect(rectf, boundingBoxRadius, boundingBoxRadius, clearPaint);
            canvas.drawRoundRect(rectf, boundingBoxRadius, boundingBoxRadius, edgeLinePaint);
        }

        protected final void onDraw(Canvas canvas)
        {
            tempRectF.set(roiProvider.getMidBoundingBoxRect());
            drawInverseBoundingBox(canvas, tempRectF);
        }

        public BoundingBoxView(Context context)
        {
            this$0 = CardHintPreviewOverlayView.this;
            super(context);
            clearPaint.setAntiAlias(true);
            clearPaint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        }
    }

    public static class CardHintRegionOfInterestProvider
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
                    rect2 = shapeModifier.getShapeModifier(rect).rotate(180, rect1.exactCenterX(), rect1.exactCenterY()).getAsRect();
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

        public CardHintRegionOfInterestProvider(ScreenManager screenmanager, CameraManager cameramanager, ShapeModifier shapemodifier, float f, Function function)
        {
            screenManager = screenmanager;
            cameraManager = cameramanager;
            shapeModifier = shapemodifier;
            edgeFinderWidthToOuterBoundingBoxEdgeLengthRatio = f;
            blurCalculationStrategy = function;
        }
    }

    final class EdgeAlignmentHintView extends View
    {

        private final PointF lineEndBuffer = new PointF();
        private final PointF lineStartBuffer = new PointF();
        final CardHintPreviewOverlayView this$0;

        private void drawEdgeDectionHintLine(Canvas canvas, PointF pointf, RectF rectf, float f, PointF pointf1, RectF rectf1, float f1)
        {
            canvas.drawLine(pointf.x, pointf.y, pointf1.x, pointf1.y, edgeDetectionHintLinePaint);
            canvas.drawArc(rectf, f, 45F, false, edgeDetectionHintLinePaint);
            canvas.drawArc(rectf1, f1, 45F, false, edgeDetectionHintLinePaint);
        }

        protected final void onDraw(Canvas canvas)
        {
            if (cardBoundaries != null)
            {
                Rect rect = roiProvider.getMidBoundingBoxRect();
                if (cardBoundaries.getTop() != null)
                {
                    lineStartBuffer.set((float)rect.left + boundingBoxRadius, rect.top);
                    lineEndBuffer.set((float)rect.right - boundingBoxRadius, rect.top);
                    drawEdgeDectionHintLine(canvas, lineStartBuffer, topLeftRadiusRect, 225F, lineEndBuffer, topRightRadiusRect, 270F);
                }
                if (cardBoundaries.getBottom() != null)
                {
                    lineStartBuffer.set((float)rect.left + boundingBoxRadius, rect.bottom);
                    lineEndBuffer.set((float)rect.right - boundingBoxRadius, rect.bottom);
                    drawEdgeDectionHintLine(canvas, lineStartBuffer, bottomLeftRadiusRect, 90F, lineEndBuffer, bottomRightRadiusRect, 45F);
                }
                if (cardBoundaries.getLeft() != null)
                {
                    lineStartBuffer.set(rect.left, (float)rect.top + boundingBoxRadius);
                    lineEndBuffer.set(rect.left, (float)rect.bottom - boundingBoxRadius);
                    drawEdgeDectionHintLine(canvas, lineStartBuffer, topLeftRadiusRect, 180F, lineEndBuffer, bottomLeftRadiusRect, 135F);
                }
                if (cardBoundaries.getRight() != null)
                {
                    lineStartBuffer.set(rect.right, (float)rect.top + boundingBoxRadius);
                    lineEndBuffer.set(rect.right, (float)rect.bottom - boundingBoxRadius);
                    drawEdgeDectionHintLine(canvas, lineStartBuffer, topRightRadiusRect, -45F, lineEndBuffer, bottomRightRadiusRect, 0.0F);
                    return;
                }
            }
        }

        public EdgeAlignmentHintView(Context context)
        {
            this$0 = CardHintPreviewOverlayView.this;
            super(context);
        }
    }


    private final Paint backgroundPaint;
    private RectF bottomLeftRadiusRect;
    private RectF bottomRightRadiusRect;
    private float boundingBoxRadius;
    protected final View boundingBoxView;
    private Boundaries cardBoundaries;
    private final View edgeAlignmentHintView;
    private final Paint edgeDetectionHintLinePaint;
    private final Paint edgeLinePaint;
    protected final ImageUtil imageUtil;
    protected final TextView messageTextView;
    private final View previewButtonContainer;
    private final View previewOverlayView;
    protected final CardHintRegionOfInterestProvider roiProvider;
    protected final ShapeModifier shapeModifier;
    private RectF topLeftRadiusRect;
    private RectF topRightRadiusRect;
    private final Handler uiHandler;
    private Rect visiblePreviewArea;

    public CardHintPreviewOverlayView(Context context, CardHintRegionOfInterestProvider cardhintregionofinterestprovider, ImageUtil imageutil, Handler handler, View view, View view1, TextView textview, 
            Paint paint, Paint paint1, Paint paint2, ShapeModifier shapemodifier)
    {
        previewOverlayView = view;
        previewButtonContainer = view1;
        messageTextView = textview;
        backgroundPaint = paint;
        edgeLinePaint = paint1;
        edgeDetectionHintLinePaint = paint2;
        roiProvider = cardhintregionofinterestprovider;
        shapeModifier = shapemodifier;
        imageUtil = imageutil;
        uiHandler = handler;
        boundingBoxView = new BoundingBoxView(context);
        edgeAlignmentHintView = new EdgeAlignmentHintView(context);
        view.setVisibility(4);
    }

    private boolean isLayoutFinalized()
    {
        return visiblePreviewArea != null && roiProvider.getBoundingBoxRect() != null;
    }

    private void renderPreviewOverlayView(Rect rect)
    {
        visiblePreviewArea = rect;
        rect = imageUtil;
        boundingBoxRadius = ImageUtil.getCardRectangleCornerRadius(roiProvider.getMidBoundingBoxRect().width());
        setCornerRadiusRects();
        if (isLayoutFinalized())
        {
            layoutOverlayElementsRelativeToBoundingBox();
        }
        rect = (ViewGroup)previewOverlayView.findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrBoundingBoxRoot);
        if (boundingBoxView.getParent() == null)
        {
            rect.addView(boundingBoxView);
            boundingBoxView.setAlpha(0.6F);
        }
        if (edgeAlignmentHintView.getParent() == null)
        {
            rect.addView(edgeAlignmentHintView);
        }
    }

    private void setCornerRadiusRects()
    {
        float f = boundingBoxRadius * 2.0F;
        Rect rect = roiProvider.getMidBoundingBoxRect();
        topLeftRadiusRect = new RectF(rect.left, rect.top, (float)rect.left + f, (float)rect.top + f);
        topRightRadiusRect = new RectF((float)rect.right - f, rect.top, rect.right, (float)rect.top + f);
        bottomLeftRadiusRect = new RectF(rect.left, (float)rect.bottom - f, (float)rect.left + f, rect.bottom);
        bottomRightRadiusRect = new RectF((float)rect.right - f, (float)rect.bottom - f, rect.right, rect.bottom);
    }

    protected int getMessageTextTopMargin()
    {
        return roiProvider.getMidBoundingBoxRect().top - messageTextView.getHeight() - (int)(edgeDetectionHintLinePaint.getStrokeWidth() / 2.0F);
    }

    protected void layoutOverlayElementsRelativeToBoundingBox()
    {
        int i = getMessageTextTopMargin();
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)messageTextView.getLayoutParams();
        layoutparams.setMargins(layoutparams.leftMargin, i, layoutparams.rightMargin, layoutparams.bottomMargin);
        messageTextView.setLayoutParams(layoutparams);
        layoutparams = (android.widget.RelativeLayout.LayoutParams)previewButtonContainer.getLayoutParams();
        layoutparams.height = (visiblePreviewArea.height() - roiProvider.getMidBoundingBoxRect().height()) / 2;
        previewButtonContainer.setLayoutParams(layoutparams);
    }

    public void onEdgeChange(final Boundaries boundaries)
    {
        uiHandler.post(new Runnable() {

            final CardHintPreviewOverlayView this$0;
            final Boundaries val$boundaries;

            public final void run()
            {
                cardBoundaries = boundaries;
                edgeAlignmentHintView.postInvalidate();
            }

            
            {
                this$0 = CardHintPreviewOverlayView.this;
                boundaries = boundaries1;
                super();
            }
        });
    }

    public final void showBoundingBox(final Rect visiblePreviewArea)
    {
        uiHandler.post(new Runnable() {

            final CardHintPreviewOverlayView this$0;
            final Rect val$visiblePreviewArea;

            public final void run()
            {
                renderPreviewOverlayView(visiblePreviewArea);
                previewOverlayView.setVisibility(0);
            }

            
            {
                this$0 = CardHintPreviewOverlayView.this;
                visiblePreviewArea = rect;
                super();
            }
        });
    }

    public final View toView()
    {
        return previewOverlayView;
    }












/*
    static Boundaries access$602(CardHintPreviewOverlayView cardhintpreviewoverlayview, Boundaries boundaries)
    {
        cardhintpreviewoverlayview.cardBoundaries = boundaries;
        return boundaries;
    }

*/



}
