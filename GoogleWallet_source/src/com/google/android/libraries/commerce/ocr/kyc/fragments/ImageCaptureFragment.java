// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.capture.DecoratingOcrHandler;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.capture.InFocusFrameCheck;
import com.google.android.libraries.commerce.ocr.capture.SizeSelectionStrategy;
import com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode;
import com.google.android.libraries.commerce.ocr.capture.processors.CardRectificationProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.GatingProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.SessionOcrResponseHandler;
import com.google.android.libraries.commerce.ocr.cv.BlurDetectorImpl;
import com.google.android.libraries.commerce.ocr.cv.CardRectifier;
import com.google.android.libraries.commerce.ocr.cv.CommonOcrCvModule;
import com.google.android.libraries.commerce.ocr.cv.ResourcePool;
import com.google.android.libraries.commerce.ocr.fragments.FragmentModule;
import com.google.android.libraries.commerce.ocr.kyc.capture.CaptureModule;
import com.google.android.libraries.commerce.ocr.kyc.capture.processor.KycBarcodeProcessor;
import com.google.android.libraries.commerce.ocr.kyc.capture.processor.KycCardSideImageProcessor;
import com.google.android.libraries.commerce.ocr.kyc.capture.processor.ProcessorModule;
import com.google.android.libraries.commerce.ocr.kyc.ui.KycOcrPreviewOverlayView;
import com.google.android.libraries.commerce.ocr.kyc.ui.KycOcrUiModule;
import com.google.android.libraries.commerce.ocr.kyc.ui.KycOcrViewPresenter;
import com.google.android.libraries.commerce.ocr.kyc.ui.KycPreviewOverlayPresenter;
import com.google.android.libraries.commerce.ocr.kyc.ui.KycTeachingDialog;
import com.google.android.libraries.commerce.ocr.ui.CameraPreviewPresenterImpl;
import com.google.android.libraries.commerce.ocr.ui.CameraPreviewViewImpl;
import com.google.android.libraries.commerce.ocr.ui.OcrView;
import com.google.android.libraries.commerce.ocr.ui.OcrViewImpl;
import com.google.android.libraries.commerce.ocr.util.NativeLibraryLoader;
import com.google.android.libraries.commerce.ocr.util.ShapeModifier;
import com.google.common.base.Functions;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.fragments:
//            KycOcrBundleModule, KycOcrFlagModule, KycDependencyProvider

public class ImageCaptureFragment extends Fragment
{
    public static interface Listener
    {

        public abstract void onBarcodeCaptured(com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode recognizedbarcode, com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics analytics);

        public abstract void onError(int i, com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics analytics);

        public abstract void onImageCaptured(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.CardSideImage cardsideimage, com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics analytics);

        public abstract void onSkipped(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics analytics);
    }


    private com.google.android.libraries.commerce.ocr.kyc.capture.processor.KycOcrAnalyticsImpl.Builder analyticsBuilder;
    private Provider analyticsProvider;
    private Provider barcodeSessionResponseHandlerProvider;
    private CameraManager cameraManager;
    private CameraPreviewPresenterImpl cameraPreviewPresenter;
    private CardRectificationProcessor cardProcessor;
    private SessionOcrResponseHandler currentBarcodeSessionHandler;
    private SessionOcrResponseHandler currentImageSessionHandler;
    private FragmentModule fragmentModule;
    private Provider imageSessionResponseHandlerProvider;
    private final ImageUtil imageUtil = new ImageUtil();
    private InFocusFrameCheck inFocusFrameCheck;
    private KycDependencyProvider kycDependencyProvider;
    private com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler kycOcrBarcodeResponseHandler;
    private com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler kycOcrImageResponseHandler;
    private KycOcrPreviewOverlayView kycOcrPreviewOverlayView;
    private KycOcrUiModule kycOcrUiModule;
    private OcrView kycOcrView;
    private KycOcrViewPresenter kycOcrViewPresenter;
    private KycPreviewOverlayPresenter kycPreviewOverlayPresenter;
    private Listener listener;
    private final ResourcePool resourcePool = (new CommonOcrCvModule()).provideOcrImageResourcePool();
    private com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView.CardHintRegionOfInterestProvider roiProvider$7711cd23;
    private final ShapeModifier shapeModifier = new ShapeModifier();
    private com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side side;
    private com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.CardSideImage tentativeCardSideImage;

    public ImageCaptureFragment()
    {
        side = com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side.FRONT;
    }

    private void confirmCapturedImage()
    {
        kycOcrPreviewOverlayView.onImageCaptured();
        analyticsBuilder.recordConfirmedTime();
        kycOcrImageResponseHandler.onRecognized(tentativeCardSideImage);
    }

    private void createCommonComponentsForPipeline()
    {
        analyticsBuilder = new com.google.android.libraries.commerce.ocr.kyc.capture.processor.KycOcrAnalyticsImpl.Builder();
        inFocusFrameCheck = new InFocusFrameCheck(new BlurDetectorImpl(), cameraManager);
        cardProcessor = new CardRectificationProcessor(ProcessorModule.provideOcrIntervalPolicy(KycOcrBundleModule.provideMinPerformOcrIntervalInMs(getArguments())), imageUtil, new CardRectifier(), roiProvider$7711cd23, KycOcrBundleModule.provideEdgeFinderWidthToOuterBoundingBoxEdgeLengthRatio(getArguments()), true);
        if (kycOcrPreviewOverlayView != null)
        {
            inFocusFrameCheck.setEdgeChangeListener(kycOcrPreviewOverlayView);
            cardProcessor.setEdgeChangeListener(kycOcrPreviewOverlayView);
        }
    }

    private void createViews()
    {
        CameraPreviewViewImpl camerapreviewviewimpl = new CameraPreviewViewImpl(fragmentModule.provideContext(), cameraPreviewPresenter);
        android.content.Context context = fragmentModule.provideContext();
        KycOcrPreviewOverlayView kycocrpreviewoverlayview = kycOcrPreviewOverlayView;
        FragmentModule fragmentmodule = fragmentModule;
        kycOcrView = new OcrViewImpl(context, camerapreviewviewimpl, kycocrpreviewoverlayview, FragmentModule.provideUiThreadHandler());
        kycOcrPreviewOverlayView.setSide(getSide());
        inFocusFrameCheck.setEdgeChangeListener(kycOcrPreviewOverlayView);
        cardProcessor.setEdgeChangeListener(kycOcrPreviewOverlayView);
        kycOcrViewPresenter.attachView(kycOcrView);
    }

    private PipelineNode getGatingPipelineForBackImage(GatingProcessor gatingprocessor, Provider provider)
    {
        ProcessorModule processormodule = new ProcessorModule();
        FragmentModule fragmentmodule = fragmentModule;
        return processormodule.provideBackSidePipelineProcessor$1bae286b(FragmentModule.provideExecutorFactory(), roiProvider$7711cd23, resourcePool, gatingprocessor, inFocusFrameCheck, new KycBarcodeProcessor(), provider, analyticsBuilder);
    }

    private PipelineNode getGatingPipelineForFrontImage(GatingProcessor gatingprocessor, Provider provider)
    {
        ProcessorModule processormodule = new ProcessorModule();
        FragmentModule fragmentmodule = fragmentModule;
        return processormodule.provideFrontSidePipelineProcessor$3cd588c8(FragmentModule.provideExecutorFactory(), roiProvider$7711cd23, resourcePool, gatingprocessor, inFocusFrameCheck, cardProcessor, new KycCardSideImageProcessor(imageUtil), provider, analyticsBuilder);
    }

    private static PipelineNode getPipelineForBackSnapshot(Provider provider)
    {
        return null;
    }

    private PipelineNode getPipelineForFrontSnapshot(Provider provider)
    {
        ProcessorModule processormodule = new ProcessorModule();
        FragmentModule fragmentmodule = fragmentModule;
        return processormodule.provideFrontSnapPipeline$12a4e3b4(FragmentModule.provideExecutorFactory(), imageUtil, roiProvider$7711cd23, resourcePool, new KycCardSideImageProcessor(imageUtil), KycOcrFlagModule.provideJpegCompressionRate(), provider);
    }

    private SizeSelectionStrategy getSizeSelectionStrategyForSide()
    {
        if (side == com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side.FRONT)
        {
            return CaptureModule.provideCardSizeSelectionStrategy();
        } else
        {
            return CaptureModule.provideBarcodeSizeSelectionStrategy();
        }
    }

    private void pause()
    {
        cameraManager.stopPreview();
        kycOcrPreviewOverlayView.pause();
        cameraPreviewPresenter.setStartPreviewOnResume(false);
    }

    private void releaseViews()
    {
        kycOcrViewPresenter.detachViews();
        cardProcessor.setEdgeChangeListener(null);
        inFocusFrameCheck.setEdgeChangeListener(null);
    }

    private void retryImageCapture()
    {
        tentativeCardSideImage = null;
        resumeFromPause();
    }

    private void setProcessorAndPresenter(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side side1)
    {
        createCommonComponentsForPipeline();
        GatingProcessor gatingprocessor = new GatingProcessor();
        PipelineNode pipelinenode;
        if (side1.equals(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side.FRONT))
        {
            pipelinenode = getGatingPipelineForFrontImage(gatingprocessor, imageSessionResponseHandlerProvider);
        } else
        {
            pipelinenode = getGatingPipelineForBackImage(gatingprocessor, barcodeSessionResponseHandlerProvider);
        }
        if (side1.equals(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side.FRONT))
        {
            side1 = getPipelineForFrontSnapshot(imageSessionResponseHandlerProvider);
        } else
        {
            side1 = getPipelineForBackSnapshot(barcodeSessionResponseHandlerProvider);
        }
        cameraPreviewPresenter.setPipelineNodeAndGate(pipelinenode, gatingprocessor);
        kycPreviewOverlayPresenter.setPipeline(side1);
    }

    private void startNewCaptureSession()
    {
        currentImageSessionHandler = new SessionOcrResponseHandler(new DecoratingOcrHandler(kycOcrImageResponseHandler) {

            final ImageCaptureFragment this$0;

            private void onRecognized(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.CardSideImage cardsideimage)
            {
                onRecognized(cardsideimage, ((Bundle) (null)));
            }

            private void onRecognized(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.CardSideImage cardsideimage, Bundle bundle)
            {
                analyticsBuilder.recordCapturedTime();
                showConfirmCapturedImage(cardsideimage);
            }

            public final volatile void onRecognized(Object obj)
            {
                onRecognized((com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.CardSideImage)obj);
            }

            public final volatile void onRecognized(Object obj, Object obj1)
            {
                onRecognized((com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.CardSideImage)obj, (Bundle)obj1);
            }

            
            {
                this$0 = ImageCaptureFragment.this;
                super(ocrresponsehandler);
            }
        }, getSide());
        currentBarcodeSessionHandler = new SessionOcrResponseHandler(new DecoratingOcrHandler(kycOcrBarcodeResponseHandler) {

            final ImageCaptureFragment this$0;

            private void onRecognized(com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode recognizedbarcode)
            {
                onRecognized(recognizedbarcode, ((Bundle) (null)));
            }

            private void onRecognized(com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode recognizedbarcode, Bundle bundle)
            {
                analyticsBuilder.recordCapturedTime();
                kycOcrBarcodeResponseHandler.onRecognized(recognizedbarcode);
            }

            public final volatile void onRecognized(Object obj)
            {
                onRecognized((com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode)obj);
            }

            public final volatile void onRecognized(Object obj, Object obj1)
            {
                onRecognized((com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode)obj, (Bundle)obj1);
            }

            
            {
                this$0 = ImageCaptureFragment.this;
                super(ocrresponsehandler);
            }
        }, getSide());
    }

    public final com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side getSide()
    {
        return side;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        kycPreviewOverlayPresenter = new KycPreviewOverlayPresenter(cameraManager);
        bundle = fragmentModule;
        cameraPreviewPresenter = new CameraPreviewPresenterImpl(FragmentModule.provideExecutorFactory(), cameraManager, resourcePool, null, null, true, true);
        bundle = fragmentModule.provideContext();
        Object obj = getArguments();
        Object obj1 = roiProvider$7711cd23;
        ImageUtil imageutil = imageUtil;
        FragmentModule fragmentmodule = fragmentModule;
        kycOcrPreviewOverlayView = new KycOcrPreviewOverlayView(bundle, ((Bundle) (obj)), ((com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView.CardHintRegionOfInterestProvider) (obj1)), imageutil, FragmentModule.provideUiThreadHandler(), kycOcrUiModule.providePreviewOverlayView(this), kycOcrUiModule, shapeModifier, KycOcrFlagModule.provideRestartCaptureFadeAnimationDurationInMs(), KycOcrFlagModule.providePauseCaptureFadeAnimationDurationInMs(), KycOcrBundleModule.showManualCaptureButton(getArguments()), listener, analyticsProvider, new KycTeachingDialog(getFragmentManager(), com/google/android/libraries/commerce/ocr/kyc/ui/KycTeachingDialog.getSimpleName()));
        kycPreviewOverlayPresenter.setView(kycOcrPreviewOverlayView);
        kycOcrPreviewOverlayView.setSnapListener(new android.view.View.OnClickListener() {

            final ImageCaptureFragment this$0;

            public final void onClick(View view)
            {
                kycPreviewOverlayPresenter.snapAndPerformOcr();
            }

            
            {
                this$0 = ImageCaptureFragment.this;
                super();
            }
        });
        kycOcrPreviewOverlayView.setRetryClickListener(new android.view.View.OnClickListener() {

            final ImageCaptureFragment this$0;

            public final void onClick(View view)
            {
                retryImageCapture();
            }

            
            {
                this$0 = ImageCaptureFragment.this;
                super();
            }
        });
        kycOcrPreviewOverlayView.setConfirmClickListener(new android.view.View.OnClickListener() {

            final ImageCaptureFragment this$0;

            public final void onClick(View view)
            {
                confirmCapturedImage();
            }

            
            {
                this$0 = ImageCaptureFragment.this;
                super();
            }
        });
        bundle = kycOcrUiModule;
        bundle = KycOcrUiModule.provideContainerFrame(this);
        obj = kycOcrUiModule;
        obj = KycOcrUiModule.providePreviewFrame(this);
        obj1 = kycOcrUiModule;
        kycOcrViewPresenter = new KycOcrViewPresenter(bundle, ((ViewGroup) (obj)), KycOcrUiModule.provideOverlayFrame(this), cameraManager, cameraPreviewPresenter, roiProvider$7711cd23, kycPreviewOverlayPresenter, listener, analyticsProvider);
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        activity = getParentFragment();
        kycDependencyProvider = (KycDependencyProvider)activity;
        listener = (Listener)activity;
        fragmentModule = kycDependencyProvider.provideFragmentModule();
        kycOcrUiModule = new KycOcrUiModule(fragmentModule.provideContext());
        imageSessionResponseHandlerProvider = new Provider() {

            final ImageCaptureFragment this$0;

            private SessionOcrResponseHandler get()
            {
                return currentImageSessionHandler;
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = ImageCaptureFragment.this;
                super();
            }
        };
        barcodeSessionResponseHandlerProvider = new Provider() {

            final ImageCaptureFragment this$0;

            private SessionOcrResponseHandler get()
            {
                return currentBarcodeSessionHandler;
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = ImageCaptureFragment.this;
                super();
            }
        };
        analyticsProvider = new Provider() {

            final ImageCaptureFragment this$0;

            private com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics get()
            {
                return analyticsBuilder.build();
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = ImageCaptureFragment.this;
                super();
            }
        };
        kycOcrImageResponseHandler = new com.google.android.libraries.commerce.ocr.kyc.capture.KycOcrResponseHandler.ImageHandler(listener, analyticsProvider, fragmentModule.provideVibrator());
        kycOcrBarcodeResponseHandler = new com.google.android.libraries.commerce.ocr.kyc.capture.KycOcrResponseHandler.BarcodeHandler(listener, analyticsProvider, fragmentModule.provideVibrator());
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        NativeLibraryLoader.loadOcrClientLibrary();
        if (getSide() == com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side.FRONT)
        {
            bundle = kycDependencyProvider.provideCardCameraManager();
        } else
        {
            bundle = kycDependencyProvider.provideBarcodeCameraManager();
        }
        cameraManager = bundle;
        roiProvider$7711cd23 = new com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView.CardHintRegionOfInterestProvider(fragmentModule.provideScreenManager(), cameraManager, shapeModifier, KycOcrBundleModule.provideEdgeFinderWidthToOuterBoundingBoxEdgeLengthRatio(getArguments()), Functions.identity());
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(com.google.android.libraries.commerce.ocr.R.layout.ocr, viewgroup, false);
    }

    public final void onPause()
    {
        releaseViews();
        super.onPause();
    }

    public final void onResume()
    {
        super.onResume();
        setProcessorAndPresenter(getSide());
        createViews();
        startNewCaptureSession();
        cameraPreviewPresenter.enableImageProcessing();
    }

    public final void resumeFromPause()
    {
        startNewCaptureSession();
        kycOcrPreviewOverlayView.resume();
        cameraManager.restartPreview();
        cameraPreviewPresenter.enableImageProcessing();
        cameraPreviewPresenter.setStartPreviewOnResume(true);
    }

    public final void setSide(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side side1)
    {
        if (side1 != getSide())
        {
            side = side1;
            releaseViews();
            cameraManager.setSizeSelectionStrategy(getSizeSelectionStrategyForSide());
            createViews();
            kycOcrPreviewOverlayView.setSide(side1);
            setProcessorAndPresenter(side1);
        }
    }

    public final void showConfirmCapturedImage(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.CardSideImage cardsideimage)
    {
        tentativeCardSideImage = cardsideimage;
        pause();
    }







}
