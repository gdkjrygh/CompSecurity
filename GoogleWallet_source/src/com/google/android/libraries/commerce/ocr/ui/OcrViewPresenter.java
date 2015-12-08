// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.ViewGroup;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ui:
//            OcrView, CameraPreviewView, PreviewOverlayView, OcrRegionOfInterestProvider

public abstract class OcrViewPresenter
    implements CameraPreviewView.OnErrorCallback, CameraPreviewView.OnPreviewLayoutFinalizedCallback
{

    private final CameraManager cameraManager;
    protected final CameraPreviewView.Presenter cameraPreviewPresenter;
    private final ViewGroup containerFrame;
    protected final ViewGroup overlayFrame;
    protected final ViewGroup previewFrame;
    private final PreviewOverlayView.Presenter previewOverlayPresenter;
    private final OcrRegionOfInterestProvider roiProvider;

    public OcrViewPresenter(ViewGroup viewgroup, ViewGroup viewgroup1, ViewGroup viewgroup2, CameraManager cameramanager, CameraPreviewView.Presenter presenter, OcrRegionOfInterestProvider ocrregionofinterestprovider, PreviewOverlayView.Presenter presenter1)
    {
        containerFrame = viewgroup;
        previewFrame = viewgroup1;
        overlayFrame = viewgroup2;
        cameraManager = cameramanager;
        cameraPreviewPresenter = presenter;
        roiProvider = ocrregionofinterestprovider;
        previewOverlayPresenter = presenter1;
        cameraPreviewPresenter.setOnPreviewLayoutFinalizedCallback(this);
        cameraPreviewPresenter.setOnErrorCallback(this);
        cameraPreviewPresenter.setOnPreviewReadyCallback(new com.google.android.libraries.commerce.ocr.capture.CameraManager.OnFinishCallback() {

            final OcrViewPresenter this$0;

            public final void onFinish()
            {
                onPreviewReady();
            }

            
            {
                this$0 = OcrViewPresenter.this;
                super();
            }
        });
    }

    private void adjustPreviewLayoutToMatchCamera()
    {
        Point point = cameraManager.getScreenFillingPreviewSize();
        ViewGroup viewgroup = containerFrame;
        android.view.ViewGroup.LayoutParams layoutparams = viewgroup.getLayoutParams();
        layoutparams.width = point.x;
        layoutparams.height = point.y;
        viewgroup.requestLayout();
        int i = layoutparams.height;
        int j = layoutparams.width;
        Log.d("OcrViewPresenter", (new StringBuilder(49)).append("Screen preview view size: ").append(i).append("x").append(j).toString());
    }

    public final void attachView(OcrView ocrview)
    {
        previewOverlayPresenter.setView(ocrview.getPreviewOverlayView());
        cameraPreviewPresenter.setView(ocrview.getCameraPreviewView());
        previewFrame.addView(ocrview.getCameraPreviewView().toView());
        overlayFrame.addView(ocrview.getPreviewOverlayView().toView());
    }

    public final void detachViews()
    {
        previewOverlayPresenter.setView(null);
        cameraPreviewPresenter.setView(null);
        previewFrame.removeAllViews();
        overlayFrame.removeAllViews();
    }

    public final void onFinalized(Rect rect, Point point)
    {
        point = new Rect(0, 0, point.x, point.y);
        roiProvider.onImageAreaChange(point);
        previewOverlayPresenter.onPreviewLayoutFinalized(rect, point);
    }

    protected void onPreviewReady()
    {
        adjustPreviewLayoutToMatchCamera();
        cameraManager.requestAutoFocus();
    }
}
