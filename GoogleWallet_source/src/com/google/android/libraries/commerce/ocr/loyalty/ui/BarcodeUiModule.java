// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.libraries.commerce.ocr.ui.CameraPreviewView;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;
import com.google.android.libraries.commerce.ocr.ui.OcrView;
import com.google.android.libraries.commerce.ocr.ui.OcrViewImpl;
import com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.ui:
//            BoxedPreviewOverlayViewImpl, OcrViewPresenterImpl, PreviewOverlayPresenterImpl, PartialResultResponder, 
//            BarcodeRegionOfInterestProvider

public class BarcodeUiModule
{

    public BarcodeUiModule()
    {
    }

    static Button provideCaptureFrameButton(View view)
    {
        view = (Button)view.findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrCaptureFrameButton);
        view.setVisibility(8);
        return view;
    }

    static OcrView provideCreditCardOcrView(Context context, CameraPreviewView camerapreviewview, BoxedPreviewOverlayViewImpl boxedpreviewoverlayviewimpl, Handler handler)
    {
        return new OcrViewImpl(context, camerapreviewview, boxedpreviewoverlayviewimpl, handler);
    }

    static LayoutInflater provideLayoutInflator(Fragment fragment)
    {
        return fragment.getLayoutInflater(fragment.getArguments());
    }

    static com.google.android.libraries.commerce.ocr.ui.OcrView.Presenter provideMainPresenter(OcrViewPresenterImpl ocrviewpresenterimpl)
    {
        return ocrviewpresenterimpl;
    }

    static PartialResultResponder providePartialResultResponder(PreviewOverlayPresenterImpl previewoverlaypresenterimpl)
    {
        return previewoverlaypresenterimpl;
    }

    static com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView.Presenter providePreviewOverlayPresenter(PreviewOverlayPresenterImpl previewoverlaypresenterimpl)
    {
        return previewoverlaypresenterimpl;
    }

    static TextView providePreviewOverlayTextView(View view)
    {
        view = (TextView)view.findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrMessage);
        view.setText(com.google.android.libraries.commerce.ocr.loyalty.R.string.hold_card_here);
        return view;
    }

    static View providePreviewOverlayView(Fragment fragment, LayoutInflater layoutinflater)
    {
        fragment = (ViewGroup)fragment.getView().findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrOverlay);
        return layoutinflater.inflate(com.google.android.libraries.commerce.ocr.R.layout.ocr_preview_overlay, fragment, false);
    }

    static PreviewOverlayView providePreviewOverlayView(BoxedPreviewOverlayViewImpl boxedpreviewoverlayviewimpl)
    {
        return boxedpreviewoverlayviewimpl;
    }

    static View provideProgressOverlayView(View view)
    {
        return view.findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrProgressOverlay);
    }

    static OcrRegionOfInterestProvider provideRegionOfInterestProvider(BarcodeRegionOfInterestProvider barcoderegionofinterestprovider)
    {
        return barcoderegionofinterestprovider;
    }

    static OcrRegionOfInterestProvider provideRegionOfInterestProvider(OcrRegionOfInterestProvider ocrregionofinterestprovider)
    {
        return ocrregionofinterestprovider;
    }

    static Button provideSkipScanButton(View view)
    {
        view = (Button)view.findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrSkipScanButton);
        view.setText(com.google.android.libraries.commerce.ocr.loyalty.R.string.skip_scan_barcode);
        return view;
    }
}
