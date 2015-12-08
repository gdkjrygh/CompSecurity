// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.commerce.ocr.util.AccessibilityUtils;

public final class KycOcrUiModule
{

    private final AccessibilityUtils accessibilityUtils;
    private final String backSideContentDescription;
    private final int boundingBoxLineWidthInPx;
    private final Context context;
    private final int edgeDetectionHintColor;
    private final int edgeDetectionLineWidthInPx;
    private final String frontSideContentDescription;
    private final Drawable helpBtnBgDrawable;
    private final int overlayMessageTextColor;
    private final int scanInstructionBottomMarginInPx;
    private final int sideHintTextSizeInPx;

    public KycOcrUiModule(Context context1)
    {
        context = context1;
        Resources resources = context1.getResources();
        sideHintTextSizeInPx = resources.getDimensionPixelSize(com.google.android.libraries.commerce.ocr.kyc.R.dimen.kyc_side_hint_message_size);
        overlayMessageTextColor = resources.getColor(com.google.android.libraries.commerce.ocr.R.color.ocr_message_text);
        boundingBoxLineWidthInPx = resources.getDimensionPixelSize(com.google.android.libraries.commerce.ocr.R.dimen.bounding_box_line_width);
        edgeDetectionHintColor = resources.getColor(com.google.android.libraries.commerce.ocr.R.color.edge_detection_hint);
        edgeDetectionLineWidthInPx = resources.getDimensionPixelSize(com.google.android.libraries.commerce.ocr.R.dimen.edge_detection_hint_line_width);
        scanInstructionBottomMarginInPx = resources.getDimensionPixelSize(com.google.android.libraries.commerce.ocr.kyc.R.dimen.kyc_scan_instruction_bottom_margin);
        backSideContentDescription = resources.getString(com.google.android.libraries.commerce.ocr.kyc.R.string.ocr_kyc_back_content_description);
        frontSideContentDescription = resources.getString(com.google.android.libraries.commerce.ocr.kyc.R.string.ocr_kyc_front_content_description);
        helpBtnBgDrawable = resources.getDrawable(com.google.android.libraries.commerce.ocr.kyc.R.drawable.kyc_ocr_help_btn_bg);
        accessibilityUtils = new AccessibilityUtils(context1);
    }

    public static Button provideConfirmCaptureButton(View view)
    {
        return (Button)view.findViewById(com.google.android.libraries.commerce.ocr.kyc.R.id.ocrConfirmCaptureButton);
    }

    public static ViewGroup provideContainerFrame(Fragment fragment)
    {
        return (ViewGroup)fragment.getView().findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrContainer);
    }

    public static ViewGroup provideOverlayFrame(Fragment fragment)
    {
        return (ViewGroup)fragment.getView().findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrOverlay);
    }

    public static ViewGroup providePreviewFrame(Fragment fragment)
    {
        return (ViewGroup)fragment.getView().findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrPreview);
    }

    public static View providePreviewOverlayButtonContainer(View view)
    {
        return view.findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrPreviewButtonContainer);
    }

    public static Button providePreviewOverlaySkipButton(View view)
    {
        view = (Button)view.findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrSkipScanButton);
        view.setText(com.google.android.libraries.commerce.ocr.kyc.R.string.ocr_kyc_skip_scanning);
        return view;
    }

    public static ViewGroup providePreviewOverlaySkipScanContainer(View view)
    {
        return (ViewGroup)view.findViewById(com.google.android.libraries.commerce.ocr.kyc.R.id.ocrSkipScanContainer);
    }

    public static View providePreviewOverlayTextView(View view)
    {
        view = (TextView)view.findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrMessage);
        view.setText(com.google.android.libraries.commerce.ocr.kyc.R.string.ocr_kyc_scan_card_details);
        return view;
    }

    public static Button provideRetryCaptureButton(View view)
    {
        return (Button)view.findViewById(com.google.android.libraries.commerce.ocr.kyc.R.id.ocrRetryCaptureButton);
    }

    public static Button provideSnapButton(View view)
    {
        return (Button)view.findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrCaptureFrameButton);
    }

    public final AccessibilityUtils provideAccessibilityUtils()
    {
        return accessibilityUtils;
    }

    public final String provideBackCardContentDescription()
    {
        return backSideContentDescription;
    }

    public final int provideBoundingBoxLineWidthInPx()
    {
        return boundingBoxLineWidthInPx;
    }

    public final int provideEdgeDetectionHintColor()
    {
        return edgeDetectionHintColor;
    }

    public final int provideEdgeDetectionLineWidthInPx()
    {
        return edgeDetectionLineWidthInPx;
    }

    public final String provideFrontCardContentDescription()
    {
        return frontSideContentDescription;
    }

    public final ImageView provideHelpImageView(View view)
    {
        view = (ImageView)view.findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrHelpImageView);
        view.setImageResource(com.google.android.libraries.commerce.ocr.kyc.R.drawable.kyc_ocr_question_mark);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.setBackground(helpBtnBgDrawable);
        } else
        {
            view.setBackgroundDrawable(helpBtnBgDrawable);
        }
        view.setVisibility(0);
        return view;
    }

    public final View providePreviewOverlayView(Fragment fragment)
    {
        ViewGroup viewgroup = provideOverlayFrame(fragment);
        return fragment.getLayoutInflater(fragment.getArguments()).inflate(com.google.android.libraries.commerce.ocr.kyc.R.layout.kyc_ocr_preview_overlay, viewgroup, false);
    }

    public final int provideScanInstructionBottomMarginInPx()
    {
        return scanInstructionBottomMarginInPx;
    }

    public final TextView provideSideHintTextView(View view)
    {
        view = (ViewGroup)view.findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrPreviewOverlayRoot);
        TextView textview = new TextView(context);
        textview.setTextColor(overlayMessageTextColor);
        textview.setGravity(1);
        textview.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
        view.addView(textview);
        textview.setTextSize(0, sideHintTextSizeInPx);
        return textview;
    }
}
