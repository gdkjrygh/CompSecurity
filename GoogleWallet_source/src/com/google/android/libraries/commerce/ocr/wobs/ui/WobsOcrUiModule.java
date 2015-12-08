// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.ui;

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

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.ui:
//            RoundedCornerClickableImage

public final class WobsOcrUiModule
{

    private final AccessibilityUtils accessibilityUtils;
    private final String backSideContentDescription;
    private final int boundingBoxColor;
    private final int boundingBoxLineWidthInPx;
    private final Context context;
    private final int edgeDetectionHintColor;
    private final int edgeDetectionLineWidthInPx;
    private final String frontSideContentDescription;
    private final Drawable helpBtnBgDrawable;
    private final int overlayMessageTextColor;
    private final int previewBg;
    private final int scanInstructionBottomMarginInPx;
    private final int sideHintTextSizeInPx;

    public WobsOcrUiModule(Context context1)
    {
        context = context1;
        Resources resources = context1.getResources();
        sideHintTextSizeInPx = resources.getDimensionPixelSize(com.google.android.libraries.commerce.ocr.wobs.R.dimen.wobs_side_hint_message_size);
        overlayMessageTextColor = resources.getColor(com.google.android.libraries.commerce.ocr.R.color.ocr_message_text);
        boundingBoxColor = resources.getColor(com.google.android.libraries.commerce.ocr.wobs.R.color.wobs_bounding_box);
        boundingBoxLineWidthInPx = resources.getDimensionPixelSize(com.google.android.libraries.commerce.ocr.R.dimen.bounding_box_line_width);
        edgeDetectionHintColor = resources.getColor(com.google.android.libraries.commerce.ocr.R.color.edge_detection_hint);
        edgeDetectionLineWidthInPx = resources.getDimensionPixelSize(com.google.android.libraries.commerce.ocr.R.dimen.edge_detection_hint_line_width);
        previewBg = resources.getColor(com.google.android.libraries.commerce.ocr.wobs.R.color.preview_bg);
        scanInstructionBottomMarginInPx = resources.getDimensionPixelSize(com.google.android.libraries.commerce.ocr.wobs.R.dimen.wobs_scan_instruction_bottom_margin);
        helpBtnBgDrawable = resources.getDrawable(com.google.android.libraries.commerce.ocr.wobs.R.drawable.help_btn_bg);
        backSideContentDescription = resources.getString(com.google.android.libraries.commerce.ocr.wobs.R.string.back_content_description);
        frontSideContentDescription = resources.getString(com.google.android.libraries.commerce.ocr.wobs.R.string.front_content_description);
        accessibilityUtils = new AccessibilityUtils(context1);
    }

    public static RoundedCornerClickableImage provideFirstImageView(View view)
    {
        return (RoundedCornerClickableImage)view.findViewById(com.google.android.libraries.commerce.ocr.wobs.R.id.image1);
    }

    public static Button provideNextButton(View view)
    {
        return (Button)view.findViewById(com.google.android.libraries.commerce.ocr.wobs.R.id.next);
    }

    public static View providePreviewButtonContainer(View view)
    {
        return view.findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrPreviewButtonContainer);
    }

    public static TextView providePreviewOverlayTextView(View view)
    {
        view = (TextView)view.findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrMessage);
        view.setText(com.google.android.libraries.commerce.ocr.wobs.R.string.scan_gift_card_instruction);
        return view;
    }

    public static View providePreviewOverlayView(Fragment fragment)
    {
        LayoutInflater layoutinflater = fragment.getLayoutInflater(fragment.getArguments());
        fragment = (ViewGroup)fragment.getView().findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrOverlay);
        return layoutinflater.inflate(com.google.android.libraries.commerce.ocr.R.layout.ocr_preview_overlay, fragment, false);
    }

    public static View provideProgressView(View view)
    {
        return view.findViewById(com.google.android.libraries.commerce.ocr.wobs.R.id.ocrProgressOverlay);
    }

    public static RoundedCornerClickableImage provideSecondImageView(View view)
    {
        return (RoundedCornerClickableImage)view.findViewById(com.google.android.libraries.commerce.ocr.wobs.R.id.image2);
    }

    public static Button provideSkipScanButton(View view)
    {
        view = (Button)view.findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrSkipScanButton);
        view.setText(com.google.android.libraries.commerce.ocr.wobs.R.string.enter_manually);
        return view;
    }

    public static Button provideSnapButton(View view)
    {
        view = (Button)view.findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrCaptureFrameButton);
        view.setVisibility(0);
        return view;
    }

    public static TextView provideTitleView(View view)
    {
        return (TextView)view.findViewById(com.google.android.libraries.commerce.ocr.wobs.R.id.title);
    }

    public final AccessibilityUtils provideAccessibilityUtils()
    {
        return accessibilityUtils;
    }

    public final String provideBackCardContentDescription()
    {
        return backSideContentDescription;
    }

    public final int provideBoundingBoxColor()
    {
        return boundingBoxColor;
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
        view.setImageResource(com.google.android.libraries.commerce.ocr.wobs.R.drawable.question_mark);
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

    public final int providePreviewBackgroundColor()
    {
        return previewBg;
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
