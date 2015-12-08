// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView;
import com.google.android.libraries.commerce.ocr.util.AccessibilityUtils;
import com.google.android.libraries.commerce.ocr.util.PaintUtils;
import com.google.android.libraries.commerce.ocr.util.ShapeModifier;
import com.google.android.libraries.commerce.ocr.wobs.fragments.TransitionHandler;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.ui:
//            WobsOcrUiModule, WobsOcrPreviewOverlayPresenter, UserAddedImageTeachingDialog

public final class WobsOcrPreviewOverlayView extends CardHintPreviewOverlayView
{

    private final AccessibilityUtils accessibilityUtils;
    private final String backCardContentDescription;
    private final String frontCardContentDescription;
    private final ImageView helpImageView;
    private final long pauseFadeAnimationDuration;
    private final long restartFadeAnimationDuration;
    private final int scanInstructionBottomMarginInPx;
    private final TextView sideHintTextView;
    private final Button skipButton;
    private final Button snapButton;
    private final Handler uiHandler;

    public WobsOcrPreviewOverlayView(Context context, View view, WobsOcrUiModule wobsocruimodule, final WobsOcrPreviewOverlayPresenter presenter, final TransitionHandler transitionHandler, com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView.CardHintRegionOfInterestProvider cardhintregionofinterestprovider, ShapeModifier shapemodifier, 
            ImageUtil imageutil, Handler handler, long l, long l1, final UserAddedImageTeachingDialog teachingDialog)
    {
        super(context, cardhintregionofinterestprovider, imageutil, handler, view, WobsOcrUiModule.providePreviewButtonContainer(view), WobsOcrUiModule.providePreviewOverlayTextView(view), PaintUtils.createPaint(wobsocruimodule.providePreviewBackgroundColor()), PaintUtils.createPaintStroke(wobsocruimodule.provideBoundingBoxColor(), wobsocruimodule.provideBoundingBoxLineWidthInPx()), PaintUtils.createPaintStroke(wobsocruimodule.provideEdgeDetectionHintColor(), wobsocruimodule.provideEdgeDetectionLineWidthInPx()), shapemodifier);
        accessibilityUtils = wobsocruimodule.provideAccessibilityUtils();
        sideHintTextView = wobsocruimodule.provideSideHintTextView(view);
        uiHandler = handler;
        pauseFadeAnimationDuration = l1;
        restartFadeAnimationDuration = l;
        presenter.setView(this);
        skipButton = WobsOcrUiModule.provideSkipScanButton(view);
        skipButton.setOnClickListener(new android.view.View.OnClickListener() {

            final WobsOcrPreviewOverlayView this$0;
            final TransitionHandler val$transitionHandler;

            public final void onClick(View view1)
            {
                transitionHandler.exit(10007);
            }

            
            {
                this$0 = WobsOcrPreviewOverlayView.this;
                transitionHandler = transitionhandler;
                super();
            }
        });
        snapButton = WobsOcrUiModule.provideSnapButton(view);
        snapButton.setOnClickListener(new android.view.View.OnClickListener() {

            final WobsOcrPreviewOverlayView this$0;
            final WobsOcrPreviewOverlayPresenter val$presenter;

            public final void onClick(View view1)
            {
                presenter.snapAndPerformOcr();
            }

            
            {
                this$0 = WobsOcrPreviewOverlayView.this;
                presenter = wobsocrpreviewoverlaypresenter;
                super();
            }
        });
        helpImageView = wobsocruimodule.provideHelpImageView(view);
        helpImageView.setOnClickListener(new android.view.View.OnClickListener() {

            final WobsOcrPreviewOverlayView this$0;
            final UserAddedImageTeachingDialog val$teachingDialog;

            public final void onClick(View view1)
            {
                teachingDialog.show();
            }

            
            {
                this$0 = WobsOcrPreviewOverlayView.this;
                teachingDialog = useraddedimageteachingdialog;
                super();
            }
        });
        scanInstructionBottomMarginInPx = wobsocruimodule.provideScanInstructionBottomMarginInPx();
        backCardContentDescription = wobsocruimodule.provideBackCardContentDescription();
        frontCardContentDescription = wobsocruimodule.provideFrontCardContentDescription();
    }

    private void fadeBackground(long l, boolean flag)
    {
        float f1 = 1.0F;
        boundingBoxView.setAlpha(1.0F);
        float f;
        if (flag)
        {
            f = 0.6F;
        } else
        {
            f = 1.0F;
        }
        if (!flag)
        {
            f1 = 0.6F;
        }
        ObjectAnimator.ofFloat(boundingBoxView, "alpha", new float[] {
            f, f1
        }).setDuration(l).start();
    }

    private void fadeForeground(long l, boolean flag)
    {
        fadeForegroundElement(flag, l, new View[] {
            sideHintTextView, messageTextView, skipButton, snapButton, helpImageView
        });
    }

    private static transient void fadeForegroundElement(boolean flag, long l, View aview[])
    {
        float f1 = 1.0F;
        float f;
        ValueAnimator avalueanimator[];
        if (flag)
        {
            f = 0.0F;
        } else
        {
            f = 1.0F;
        }
        if (!flag)
        {
            f1 = 0.0F;
        }
        avalueanimator = new ValueAnimator[aview.length];
        for (int i = 0; i < aview.length; i++)
        {
            avalueanimator[i] = ObjectAnimator.ofFloat(aview[i], "alpha", new float[] {
                f, f1
            });
        }

        aview = new AnimatorSet();
        aview.playTogether(avalueanimator);
        aview.setDuration(l).start();
    }

    protected final int getMessageTextTopMargin()
    {
        return super.getMessageTextTopMargin() - scanInstructionBottomMarginInPx;
    }

    protected final void layoutOverlayElementsRelativeToBoundingBox()
    {
        super.layoutOverlayElementsRelativeToBoundingBox();
        Object obj = roiProvider.getMidBoundingBoxRect();
        int i = (int)(((double)((Rect) (obj)).top + (double)((Rect) (obj)).height() / 2D) - (double)sideHintTextView.getHeight() / 2D);
        obj = (android.widget.RelativeLayout.LayoutParams)sideHintTextView.getLayoutParams();
        ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(((android.widget.RelativeLayout.LayoutParams) (obj)).leftMargin, i, ((android.widget.RelativeLayout.LayoutParams) (obj)).rightMargin, ((android.widget.RelativeLayout.LayoutParams) (obj)).bottomMargin);
        sideHintTextView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
    }

    public final void pause()
    {
        uiHandler.post(new Runnable() {

            final WobsOcrPreviewOverlayView this$0;

            public final void run()
            {
                onEdgeChange(null);
                fadeForeground(pauseFadeAnimationDuration, false);
                fadeBackground(pauseFadeAnimationDuration, true);
            }

            
            {
                this$0 = WobsOcrPreviewOverlayView.this;
                super();
            }
        });
    }

    public final void setSide(final com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side side, final boolean animation)
    {
        uiHandler.post(new Runnable() {

            final WobsOcrPreviewOverlayView this$0;
            final boolean val$animation;
            final com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side val$side;

            public final void run()
            {
                Object obj = sideHintTextView;
                TextView textview;
                int i;
                if (side == com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.BACK)
                {
                    i = com.google.android.libraries.commerce.ocr.wobs.R.string.back_of_card;
                } else
                {
                    i = com.google.android.libraries.commerce.ocr.wobs.R.string.front_of_card;
                }
                ((TextView) (obj)).setText(i);
                textview = sideHintTextView;
                if (side == com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.BACK)
                {
                    obj = backCardContentDescription;
                } else
                {
                    obj = frontCardContentDescription;
                }
                textview.setContentDescription(((CharSequence) (obj)));
                if (animation)
                {
                    fadeForeground(restartFadeAnimationDuration, true);
                    fadeBackground(restartFadeAnimationDuration, false);
                }
                accessibilityUtils.sendAnnouncementEventForViewContentDescription(sideHintTextView);
            }

            
            {
                this$0 = WobsOcrPreviewOverlayView.this;
                side = side1;
                animation = flag;
                super();
            }
        });
    }








}
