// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;
import com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView;
import com.google.android.libraries.commerce.ocr.ui.UserSkipHandler;

public class BoxedPreviewOverlayViewImpl
    implements PreviewOverlayView
{
    final class BoundingBoxView extends View
    {

        private final Paint cardAreaPaint = new Paint();
        private final Paint clearPaint = new Paint();
        private final int cornerRadius = dpToActualPixels(8);
        private final Paint highlightPaint = new Paint();
        final BoxedPreviewOverlayViewImpl this$0;

        private int dpToActualPixels(int i)
        {
            return (int)((float)i * context.getResources().getDisplayMetrics().density);
        }

        protected final void onDraw(Canvas canvas)
        {
            canvas.drawRect(visiblePreviewArea, cardAreaPaint);
            canvas.drawRoundRect(overlayBoundingBox, cornerRadius, cornerRadius, clearPaint);
            canvas.drawRoundRect(overlayBoundingBox, cornerRadius, cornerRadius, highlightPaint);
        }

        public BoundingBoxView(Context context1, int i)
        {
            this$0 = BoxedPreviewOverlayViewImpl.this;
            super(context1);
            highlightPaint.setColor(-1);
            highlightPaint.setStyle(android.graphics.Paint.Style.STROKE);
            highlightPaint.setAlpha(i);
            cardAreaPaint.setAlpha(i);
            clearPaint.setAntiAlias(true);
            clearPaint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        }
    }


    private final BoundingBoxView boundingBoxView;
    private final Context context;
    private final TextView messageTextView;
    private RectF overlayBoundingBox;
    private final View previewOverlayView;
    private final OcrRegionOfInterestProvider roiProvider;
    private final Handler uiHandler;
    private Rect visiblePreviewArea;

    public BoxedPreviewOverlayViewImpl(Context context1, View view, TextView textview, final com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView.Presenter presenter, final UserSkipHandler userSkipHandler, OcrRegionOfInterestProvider ocrregionofinterestprovider, final Button captureFrameButton, 
            Button button, Handler handler)
    {
        context = context1;
        previewOverlayView = view;
        roiProvider = ocrregionofinterestprovider;
        messageTextView = textview;
        captureFrameButton.setOnClickListener(new android.view.View.OnClickListener() {

            final BoxedPreviewOverlayViewImpl this$0;
            final Button val$captureFrameButton;
            final com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView.Presenter val$presenter;

            public final void onClick(View view1)
            {
                presenter.snapAndPerformOcr();
                captureFrameButton.setEnabled(false);
            }

            
            {
                this$0 = BoxedPreviewOverlayViewImpl.this;
                presenter = presenter1;
                captureFrameButton = button;
                super();
            }
        });
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final BoxedPreviewOverlayViewImpl this$0;
            final UserSkipHandler val$userSkipHandler;

            public final void onClick(View view1)
            {
                userSkipHandler.onUserSkipped();
            }

            
            {
                this$0 = BoxedPreviewOverlayViewImpl.this;
                userSkipHandler = userskiphandler;
                super();
            }
        });
        uiHandler = handler;
        boundingBoxView = new BoundingBoxView(context1, 155);
    }

    private boolean isLayoutFinalized()
    {
        return visiblePreviewArea != null;
    }

    private void layoutOverlayElementsRelativeToBoundingBox()
    {
        if (isLayoutFinalized())
        {
            int i = (int)(2.0F * (messageTextView.getTextSize() + (float)messageTextView.getPaddingTop() + (float)messageTextView.getPaddingBottom()));
            int j = roiProvider.getBoundingBoxRect().top;
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)messageTextView.getLayoutParams();
            layoutparams.setMargins(layoutparams.leftMargin, j - i - 15, layoutparams.rightMargin, layoutparams.bottomMargin);
            messageTextView.setLayoutParams(layoutparams);
        }
    }

    public final void showBoundingBox(Rect rect)
    {
        visiblePreviewArea = rect;
        overlayBoundingBox = new RectF(roiProvider.getBoundingBoxRect());
        if (boundingBoxView.getParent() == null)
        {
            layoutOverlayElementsRelativeToBoundingBox();
            ((ViewGroup)previewOverlayView.findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrBoundingBoxRoot)).addView(boundingBoxView);
        }
    }

    public final View toView()
    {
        return previewOverlayView;
    }



}
