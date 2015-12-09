// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.ui.CameraPreviewView;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;
import com.google.android.libraries.commerce.ocr.ui.OcrView;
import com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView;
import com.google.common.base.Preconditions;

public class OcrViewPresenterImpl
    implements com.google.android.libraries.commerce.ocr.ui.OcrView.Presenter
{

    private final CameraManager cameraManager;
    private final com.google.android.libraries.commerce.ocr.ui.CameraPreviewView.Presenter cameraPreviewPresenter;
    private final Fragment fragment;
    private com.google.android.libraries.commerce.ocr.capture.CameraManager.OnFinishCallback onPreviewReadyCallback;
    private final com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView.Presenter previewOverlayPresenter;
    private final OcrRegionOfInterestProvider roiProvider;
    private final OcrView view;

    public OcrViewPresenterImpl(Fragment fragment1, OcrView ocrview, com.google.android.libraries.commerce.ocr.ui.CameraPreviewView.Presenter presenter, com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView.Presenter presenter1, OcrRegionOfInterestProvider ocrregionofinterestprovider, CameraManager cameramanager)
    {
        fragment = fragment1;
        cameraManager = cameramanager;
        view = ocrview;
        roiProvider = ocrregionofinterestprovider;
        previewOverlayPresenter = presenter1;
        previewOverlayPresenter.setView(ocrview.getPreviewOverlayView());
        cameraPreviewPresenter = presenter;
        cameraPreviewPresenter.setView(ocrview.getCameraPreviewView());
        cameraPreviewPresenter.setOnPreviewLayoutFinalizedCallback(new com.google.android.libraries.commerce.ocr.ui.CameraPreviewView.OnPreviewLayoutFinalizedCallback() {

            final OcrViewPresenterImpl this$0;

            public final void onFinalized(Rect rect, Point point)
            {
                onPreviewLayoutFinalized(rect, point);
            }

            
            {
                this$0 = OcrViewPresenterImpl.this;
                super();
            }
        });
        cameraPreviewPresenter.setOnPreviewReadyCallback(new com.google.android.libraries.commerce.ocr.capture.CameraManager.OnFinishCallback() {

            final OcrViewPresenterImpl this$0;

            public final void onFinish()
            {
                onPreviewReady();
            }

            
            {
                this$0 = OcrViewPresenterImpl.this;
                super();
            }
        });
    }

    private void adjustPreviewLayoutToMatchCamera()
    {
        Point point = cameraManager.getScreenFillingPreviewSize();
        FrameLayout framelayout = (FrameLayout)fragment.getView().findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrContainer);
        android.view.ViewGroup.LayoutParams layoutparams = framelayout.getLayoutParams();
        layoutparams.width = point.x;
        layoutparams.height = point.y;
        framelayout.requestLayout();
        int i = layoutparams.height;
        int j = layoutparams.width;
        Log.d("OcrViewPresenterImpl", (new StringBuilder(49)).append("Screen preview view size: ").append(i).append("x").append(j).toString());
    }

    public final void attachView()
    {
        Preconditions.checkNotNull(fragment);
        Preconditions.checkNotNull(view);
        Preconditions.checkNotNull(fragment.getView().findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrPreview));
        ((FrameLayout)fragment.getView().findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrPreview)).addView(view.getCameraPreviewView().toView());
        ((ViewGroup)fragment.getView().findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrOverlay)).addView(view.getPreviewOverlayView().toView());
    }

    public final void onPreviewLayoutFinalized(Rect rect, Point point)
    {
        point = new Rect(0, 0, point.x, point.y);
        roiProvider.onImageAreaChange(point);
        previewOverlayPresenter.onPreviewLayoutFinalized(rect, point);
    }

    public final void onPreviewReady()
    {
        adjustPreviewLayoutToMatchCamera();
        cameraManager.requestAutoFocus();
        if (onPreviewReadyCallback != null)
        {
            onPreviewReadyCallback.onFinish();
        }
    }

    public final void showErrorMessage(int i)
    {
        view.showErrorMessage(i);
    }
}
