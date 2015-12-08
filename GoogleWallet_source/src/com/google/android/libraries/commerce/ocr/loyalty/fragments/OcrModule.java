// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.capture.CameraManagerImpl;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.capture.InFocusFrameCheck;
import com.google.android.libraries.commerce.ocr.capture.SizeSelectionStrategy;
import com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode;
import com.google.android.libraries.commerce.ocr.capture.processors.GatingProcessor;
import com.google.android.libraries.commerce.ocr.cv.BlurDetector;
import com.google.android.libraries.commerce.ocr.cv.BlurDetectorImpl;
import com.google.android.libraries.commerce.ocr.cv.CardRectifier;
import com.google.android.libraries.commerce.ocr.cv.CommonOcrCvModule;
import com.google.android.libraries.commerce.ocr.cv.ResourcePool;
import com.google.android.libraries.commerce.ocr.pub.ContinuousPictureFocusModePrerequisiteChecker;
import com.google.android.libraries.commerce.ocr.pub.FeaturePrerequisiteCheckerUtil;
import com.google.android.libraries.commerce.ocr.ui.CameraPreviewPresenterImpl;
import com.google.android.libraries.commerce.ocr.ui.CameraPreviewView;
import com.google.android.libraries.commerce.ocr.ui.CameraPreviewViewImpl;
import com.google.android.libraries.commerce.ocr.util.ExecutorServiceFactory;
import com.google.android.libraries.commerce.ocr.util.ScreenManager;
import com.google.android.libraries.commerce.ocr.util.ShapeModifier;

public class OcrModule
{

    private final CommonOcrCvModule commonOcrCvModule = new CommonOcrCvModule();

    public OcrModule()
    {
    }

    static boolean provideAttemptContinuousPictureFocusMode(PackageManager packagemanager, String s)
    {
        return (new ContinuousPictureFocusModePrerequisiteChecker(new FeaturePrerequisiteCheckerUtil(packagemanager), s)).check();
    }

    static BlurDetector provideBlurDetector()
    {
        return new BlurDetectorImpl();
    }

    static CameraManager provideCameraManager(ScreenManager screenmanager, ShapeModifier shapemodifier, Point point, Point point1, SizeSelectionStrategy sizeselectionstrategy, boolean flag)
    {
        return new CameraManagerImpl(screenmanager, 0, shapemodifier, point, point1, sizeselectionstrategy, flag);
    }

    static CameraPreviewView provideCameraPreviewView(Context context, com.google.android.libraries.commerce.ocr.ui.CameraPreviewView.Presenter presenter)
    {
        return new CameraPreviewViewImpl(context, presenter);
    }

    static com.google.android.libraries.commerce.ocr.ui.CameraPreviewView.Presenter provideCameraPreviewViewPresenter(ExecutorServiceFactory executorservicefactory, CameraManager cameramanager, ResourcePool resourcepool, PipelineNode pipelinenode, GatingProcessor gatingprocessor, boolean flag, com.google.android.libraries.commerce.ocr.ui.CameraPreviewView.OnErrorCallback onerrorcallback)
    {
        executorservicefactory = new CameraPreviewPresenterImpl(executorservicefactory, cameramanager, resourcepool, pipelinenode, gatingprocessor, flag, false);
        if (onerrorcallback != null)
        {
            executorservicefactory.setOnErrorCallback(onerrorcallback);
        }
        return executorservicefactory;
    }

    static CardRectifier provideCardRectifier()
    {
        return new CardRectifier();
    }

    static ExecutorServiceFactory provideExecutorServiceFactory()
    {
        return new ExecutorServiceFactory();
    }

    static ImageUtil provideImageUtil()
    {
        return new ImageUtil();
    }

    static InFocusFrameCheck provideInFocusFrameCheck(BlurDetector blurdetector, CameraManager cameramanager)
    {
        return new InFocusFrameCheck(blurdetector, cameramanager);
    }

    static ShapeModifier provideShapeModifier()
    {
        return new ShapeModifier();
    }

    final ResourcePool provideOcrImageResourcePool()
    {
        return commonOcrCvModule.provideOcrImageResourcePool();
    }
}
