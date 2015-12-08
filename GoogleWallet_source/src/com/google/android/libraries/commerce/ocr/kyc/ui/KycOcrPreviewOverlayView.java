// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.cv.Boundaries;
import com.google.android.libraries.commerce.ocr.kyc.fragments.KycOcrBundleModule;
import com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView;
import com.google.android.libraries.commerce.ocr.util.AccessibilityUtils;
import com.google.android.libraries.commerce.ocr.util.PaintUtils;
import com.google.android.libraries.commerce.ocr.util.ShapeModifier;
import com.google.common.collect.Lists;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.ui:
//            KycOcrUiModule, KycTeachingDialog

public final class KycOcrPreviewOverlayView extends CardHintPreviewOverlayView
{
    static final class AlphaRange
    {

        private final float end;
        private final float start;

        final ObjectAnimator animate(View view)
        {
            return ObjectAnimator.ofFloat(view, "alpha", new float[] {
                start, end
            });
        }

        final AlphaRange reverse()
        {
            return new AlphaRange(end, start);
        }

        AlphaRange(float f, float f1)
        {
            start = f;
            end = f1;
        }
    }

    static abstract class DefaultAnimatorListener
        implements android.animation.Animator.AnimatorListener
    {

        public void onAnimationCancel(Animator animator)
        {
        }

        public void onAnimationEnd(Animator animator)
        {
        }

        public void onAnimationRepeat(Animator animator)
        {
        }

        public void onAnimationStart(Animator animator)
        {
        }

        private DefaultAnimatorListener()
        {
        }

    }


    private static final AlphaRange BACKGROUND_ALPHA_RANGE = new AlphaRange(0.6F, 1.0F);
    private static final AlphaRange FOREGROUND_ALPHA_RANGE = new AlphaRange(1.0F, 0.0F);
    private final AccessibilityUtils accessibilityUtils;
    private final String backCardContentDescription;
    private final Set buttonsAfterSnap = new HashSet();
    private final Set buttonsBeforeSnap = new HashSet();
    private final Button confirmButton;
    private android.view.View.OnClickListener confirmClickListener;
    private final String frontCardContentDescription;
    private final ImageView helpButton;
    private boolean isPaused;
    private final long pauseFadeAnimationDuration;
    private final long restartFadeAnimationDuration;
    private final Button retryButton;
    private android.view.View.OnClickListener retryClickListener;
    private final int scanInstructionBottomMarginInPx;
    private final TextView sideHintTextView;
    private final View skipScanContainer;
    private final Button snapButton;
    private android.view.View.OnClickListener snapListener;
    private final Handler uiHandler;

    public KycOcrPreviewOverlayView(Context context, Bundle bundle, com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView.CardHintRegionOfInterestProvider cardhintregionofinterestprovider, ImageUtil imageutil, Handler handler, View view, KycOcrUiModule kycocruimodule, 
            ShapeModifier shapemodifier, long l, long l1, boolean flag, final com.google.android.libraries.commerce.ocr.kyc.fragments.ImageCaptureFragment.Listener listener, 
            final Provider analyticsProvider, final KycTeachingDialog teachingDialog)
    {
        super(context, cardhintregionofinterestprovider, imageutil, handler, view, KycOcrUiModule.providePreviewOverlayButtonContainer(view), (TextView)KycOcrUiModule.providePreviewOverlayTextView(view), PaintUtils.createPaint(0xff000000), PaintUtils.createPaintStroke(-1, kycocruimodule.provideBoundingBoxLineWidthInPx()), PaintUtils.createPaintStroke(kycocruimodule.provideEdgeDetectionHintColor(), kycocruimodule.provideEdgeDetectionLineWidthInPx()), shapemodifier);
        isPaused = false;
        accessibilityUtils = kycocruimodule.provideAccessibilityUtils();
        sideHintTextView = kycocruimodule.provideSideHintTextView(view);
        uiHandler = handler;
        pauseFadeAnimationDuration = l1;
        restartFadeAnimationDuration = l;
        helpButton = kycocruimodule.provideHelpImageView(view);
        helpButton.setOnClickListener(new android.view.View.OnClickListener() {

            final KycOcrPreviewOverlayView this$0;
            final KycTeachingDialog val$teachingDialog;

            public final void onClick(View view1)
            {
                teachingDialog.show();
            }

            
            {
                this$0 = KycOcrPreviewOverlayView.this;
                teachingDialog = kycteachingdialog;
                super();
            }
        });
        skipScanContainer = KycOcrUiModule.providePreviewOverlaySkipScanContainer(view);
        if (KycOcrBundleModule.allowSkipCapture(bundle))
        {
            KycOcrUiModule.providePreviewOverlaySkipButton(skipScanContainer).setOnClickListener(new android.view.View.OnClickListener() {

                final KycOcrPreviewOverlayView this$0;
                final Provider val$analyticsProvider;
                final com.google.android.libraries.commerce.ocr.kyc.fragments.ImageCaptureFragment.Listener val$listener;

                public final void onClick(View view1)
                {
                    listener.onSkipped((com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics)analyticsProvider.get());
                }

            
            {
                this$0 = KycOcrPreviewOverlayView.this;
                listener = listener1;
                analyticsProvider = provider;
                super();
            }
            });
            buttonsBeforeSnap.add(skipScanContainer);
        } else
        {
            skipScanContainer.setVisibility(8);
        }
        snapButton = KycOcrUiModule.provideSnapButton(view);
        snapButton.setOnClickListener(new android.view.View.OnClickListener() {

            final KycOcrPreviewOverlayView this$0;

            public final void onClick(View view1)
            {
                if (snapListener != null)
                {
                    snapListener.onClick(view1);
                }
            }

            
            {
                this$0 = KycOcrPreviewOverlayView.this;
                super();
            }
        });
        setManualCaptureAllowed(flag);
        retryButton = KycOcrUiModule.provideRetryCaptureButton(view);
        retryButton.setOnClickListener(new android.view.View.OnClickListener() {

            final KycOcrPreviewOverlayView this$0;

            public final void onClick(View view1)
            {
                if (retryClickListener != null)
                {
                    retryClickListener.onClick(view1);
                }
            }

            
            {
                this$0 = KycOcrPreviewOverlayView.this;
                super();
            }
        });
        confirmButton = KycOcrUiModule.provideConfirmCaptureButton(view);
        confirmButton.setOnClickListener(new android.view.View.OnClickListener() {

            final KycOcrPreviewOverlayView this$0;

            public final void onClick(View view1)
            {
                if (confirmClickListener != null)
                {
                    confirmClickListener.onClick(view1);
                }
            }

            
            {
                this$0 = KycOcrPreviewOverlayView.this;
                super();
            }
        });
        scanInstructionBottomMarginInPx = kycocruimodule.provideScanInstructionBottomMarginInPx();
        backCardContentDescription = kycocruimodule.provideBackCardContentDescription();
        frontCardContentDescription = kycocruimodule.provideFrontCardContentDescription();
        buttonsAfterSnap.add(retryButton);
        buttonsAfterSnap.add(confirmButton);
        for (context = buttonsAfterSnap.iterator(); context.hasNext(); bundle.setVisibility(4))
        {
            bundle = (View)context.next();
            bundle.setEnabled(false);
        }

    }

    private void transitionToConfirm(long l, boolean flag)
    {
        AnimatorSet animatorset = new AnimatorSet();
        java.util.ArrayList arraylist = Lists.newArrayList(new Animator[] {
            BACKGROUND_ALPHA_RANGE.animate(boundingBoxView), FOREGROUND_ALPHA_RANGE.animate(sideHintTextView), ObjectAnimator.ofFloat(retryButton, "rotation", new float[] {
                180F, 0.0F
            }), ObjectAnimator.ofFloat(confirmButton, "rotation", new float[] {
                -180F, 0.0F
            }), ObjectAnimator.ofFloat(retryButton, "translationX", new float[] {
                (float)(snapButton.getLeft() - retryButton.getLeft()), 0.0F
            }), ObjectAnimator.ofFloat(confirmButton, "translationX", new float[] {
                (float)(snapButton.getLeft() - confirmButton.getLeft()), 0.0F
            })
        });
        View view;
        for (Iterator iterator = buttonsBeforeSnap.iterator(); iterator.hasNext(); arraylist.add(FOREGROUND_ALPHA_RANGE.animate(view)))
        {
            view = (View)iterator.next();
        }

        View view1;
        for (Iterator iterator1 = buttonsAfterSnap.iterator(); iterator1.hasNext(); arraylist.add(FOREGROUND_ALPHA_RANGE.reverse().animate(view1)))
        {
            view1 = (View)iterator1.next();
        }

        animatorset.playTogether(arraylist);
        if (flag)
        {
            animatorset.addListener(new DefaultAnimatorListener() );
        } else
        {
            animatorset.setInterpolator(new Interpolator() {

                final KycOcrPreviewOverlayView this$0;

                public final float getInterpolation(float f)
                {
                    return 1.0F - f;
                }

            
            {
                this$0 = KycOcrPreviewOverlayView.this;
                super();
            }
            });
            animatorset.addListener(new DefaultAnimatorListener() );
        }
        animatorset.setDuration(l).start();
    }

    protected final int getMessageTextTopMargin()
    {
        return getMessageTextTopMargin() - scanInstructionBottomMarginInPx;
    }

    protected final void layoutOverlayElementsRelativeToBoundingBox()
    {
        layoutOverlayElementsRelativeToBoundingBox();
        Object obj = roiProvider.getMidBoundingBoxRect();
        int i = (int)(((double)((Rect) (obj)).top + (double)((Rect) (obj)).height() / 2D) - (double)sideHintTextView.getHeight() / 2D);
        obj = (android.widget.RelativeLayout.LayoutParams)sideHintTextView.getLayoutParams();
        ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(((android.widget.RelativeLayout.LayoutParams) (obj)).leftMargin, i, ((android.widget.RelativeLayout.LayoutParams) (obj)).rightMargin, ((android.widget.RelativeLayout.LayoutParams) (obj)).bottomMargin);
        sideHintTextView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
    }

    public final void onEdgeChange(Boundaries boundaries)
    {
        if (!isPaused)
        {
            onEdgeChange(boundaries);
        }
    }

    public final void onImageCaptured()
    {
        for (Iterator iterator = buttonsAfterSnap.iterator(); iterator.hasNext(); ((View)iterator.next()).setEnabled(false)) { }
    }

    public final void pause()
    {
        uiHandler.post(new Runnable() {

            final KycOcrPreviewOverlayView this$0;

            public final void run()
            {
                onEdgeChange(null);
                isPaused = true;
                transitionToConfirm(pauseFadeAnimationDuration, true);
            }

            
            {
                this$0 = KycOcrPreviewOverlayView.this;
                super();
            }
        });
    }

    public final void resume()
    {
        if (isPaused)
        {
            isPaused = false;
            uiHandler.post(new Runnable() {

                final KycOcrPreviewOverlayView this$0;

                public final void run()
                {
                    transitionToConfirm(restartFadeAnimationDuration, false);
                }

            
            {
                this$0 = KycOcrPreviewOverlayView.this;
                super();
            }
            });
        }
    }

    public final void setConfirmClickListener(android.view.View.OnClickListener onclicklistener)
    {
        confirmClickListener = onclicklistener;
    }

    public final void setManualCaptureAllowed(boolean flag)
    {
        if (flag)
        {
            buttonsBeforeSnap.add(snapButton);
            snapButton.setVisibility(0);
            return;
        } else
        {
            buttonsBeforeSnap.remove(snapButton);
            snapButton.setVisibility(4);
            return;
        }
    }

    public final void setRetryClickListener(android.view.View.OnClickListener onclicklistener)
    {
        retryClickListener = onclicklistener;
    }

    public final void setSide(final com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side side)
    {
        uiHandler.post(new Runnable() {

            final KycOcrPreviewOverlayView this$0;
            final com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side val$side;

            public final void run()
            {
                Object obj = sideHintTextView;
                TextView textview;
                int i;
                if (side == com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side.BACK)
                {
                    i = com.google.android.libraries.commerce.ocr.kyc.R.string.ocr_kyc_back_of_id;
                } else
                {
                    i = com.google.android.libraries.commerce.ocr.kyc.R.string.ocr_kyc_front_of_id;
                }
                ((TextView) (obj)).setText(i);
                textview = sideHintTextView;
                if (side == com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side.BACK)
                {
                    obj = backCardContentDescription;
                } else
                {
                    obj = frontCardContentDescription;
                }
                textview.setContentDescription(((CharSequence) (obj)));
                accessibilityUtils.sendAnnouncementEventForViewContentDescription(sideHintTextView);
            }

            
            {
                this$0 = KycOcrPreviewOverlayView.this;
                side = side1;
                super();
            }
        });
    }

    public final void setSnapListener(android.view.View.OnClickListener onclicklistener)
    {
        snapListener = onclicklistener;
    }















/*
    static boolean access$702(KycOcrPreviewOverlayView kycocrpreviewoverlayview, boolean flag)
    {
        kycocrpreviewoverlayview.isPaused = flag;
        return flag;
    }

*/


}
