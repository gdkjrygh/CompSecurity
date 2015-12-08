// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.fragments;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.capture.InFocusFrameCheck;
import com.google.android.libraries.commerce.ocr.capture.pipeline.Pipeline;
import com.google.android.libraries.commerce.ocr.capture.processors.CardRectificationProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.GatingProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.SessionOcrResponseHandler;
import com.google.android.libraries.commerce.ocr.cv.BlurDetectorImpl;
import com.google.android.libraries.commerce.ocr.cv.CardRectifier;
import com.google.android.libraries.commerce.ocr.cv.CommonOcrCvModule;
import com.google.android.libraries.commerce.ocr.fragments.FragmentModule;
import com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeRecognizer;
import com.google.android.libraries.commerce.ocr.loyalty.fragments.WobsOcrClientProvider;
import com.google.android.libraries.commerce.ocr.ui.CameraPreviewPresenterImpl;
import com.google.android.libraries.commerce.ocr.ui.CameraPreviewView;
import com.google.android.libraries.commerce.ocr.ui.CameraPreviewViewImpl;
import com.google.android.libraries.commerce.ocr.util.NativeLibraryLoader;
import com.google.android.libraries.commerce.ocr.util.ShapeModifier;
import com.google.android.libraries.commerce.ocr.wobs.WobsOcrFragment;
import com.google.android.libraries.commerce.ocr.wobs.capture.CaptureModule;
import com.google.android.libraries.commerce.ocr.wobs.capture.processors.ProcessorModule;
import com.google.android.libraries.commerce.ocr.wobs.capture.processors.WobsOcrProcessor;
import com.google.android.libraries.commerce.ocr.wobs.ui.UserAddedImageTeachingDialog;
import com.google.android.libraries.commerce.ocr.wobs.ui.WobsOcrPreviewOverlayPresenter;
import com.google.android.libraries.commerce.ocr.wobs.ui.WobsOcrPreviewOverlayView;
import com.google.android.libraries.commerce.ocr.wobs.ui.WobsOcrUiModule;
import com.google.android.libraries.commerce.ocr.wobs.ui.WobsOcrView;
import com.google.android.libraries.commerce.ocr.wobs.ui.WobsOcrViewPresenter;
import com.google.common.base.Functions;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.fragments:
//            WobsOcrBundleModule, WobsOcrFlagModule, ImageCaptureDependencyProvider, TransitionHandler

public class ImageCaptureFragment extends Fragment
{

    private Bundle bundle;
    private CameraManager cameraManager;
    private com.google.android.libraries.commerce.ocr.ui.CameraPreviewView.Presenter cameraPreviewPresenter;
    private CameraPreviewView cameraPreviewView;
    private CardRectificationProcessor cardProcessor;
    SessionOcrResponseHandler currentSessionHandler;
    private boolean enableAutoSnap;
    private FragmentModule fragmentModule;
    private ImageUtil imageUtil;
    private InFocusFrameCheck inFocusFrameCheck;
    private WobsOcrViewPresenter ocrPresenter;
    WobsOcrPreviewOverlayView ocrPreviewOverlayView;
    private com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler ocrResponseHandler;
    private WobsOcrPreviewOverlayPresenter previewOverlayPresenter;
    private Resources resources;
    private com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView.CardHintRegionOfInterestProvider roiProvider$7711cd23;
    private ShapeModifier shapeModifier;
    private com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side side;
    private TransitionHandler transitionHandler;
    private WobsOcrClientProvider wobsOcrClientProvider;
    private WobsOcrUiModule wobsOcrUiModule;

    public ImageCaptureFragment()
    {
        side = com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.BACK;
    }

    private void createControls()
    {
        imageUtil = new ImageUtil();
        fragmentModule = new FragmentModule(this);
        Object obj;
        com.google.android.libraries.commerce.ocr.cv.ResourcePool resourcepool;
        Provider provider;
        WobsOcrProcessor wobsocrprocessor;
        GatingProcessor gatingprocessor;
        com.google.android.libraries.commerce.ocr.capture.pipeline.Pipeline.PipelineBuilder pipelinebuilder;
        int i;
        if (getArguments() == null)
        {
            obj = new Bundle();
        } else
        {
            obj = getArguments();
        }
        bundle = ((Bundle) (obj));
        shapeModifier = new ShapeModifier();
        obj = fragmentModule;
        obj = FragmentModule.provideExecutorFactory();
        roiProvider$7711cd23 = new com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView.CardHintRegionOfInterestProvider(fragmentModule.provideScreenManager(), cameraManager, shapeModifier, WobsOcrBundleModule.provideEdgeFinderWidthToOuterBoundingBoxEdgeLengthRatio(bundle), Functions.identity());
        resourcepool = (new CommonOcrCvModule()).provideOcrImageResourcePool();
        inFocusFrameCheck = new InFocusFrameCheck(new BlurDetectorImpl(), cameraManager);
        provider = new Provider() {

            final ImageCaptureFragment this$0;

            private SessionOcrResponseHandler get()
            {
                return currentSessionHandler;
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
        i = WobsOcrFlagModule.provideJpegCompressionRate();
        wobsocrprocessor = new WobsOcrProcessor(WobsOcrBundleModule.provideWobType(bundle), wobsOcrClientProvider.getWobsOcrClient(), imageUtil, i);
        previewOverlayPresenter = new WobsOcrPreviewOverlayPresenter(cameraManager, imageUtil, roiProvider$7711cd23, wobsocrprocessor, provider, fragmentModule.provideBackgroundHandler(), i);
        gatingprocessor = new GatingProcessor();
        pipelinebuilder = Pipeline.wire(Pipeline.forSync(gatingprocessor));
        cardProcessor = new CardRectificationProcessor(ProcessorModule.provideOcrIntervalPolicy(bundle), imageUtil, new CardRectifier(), roiProvider$7711cd23, WobsOcrBundleModule.provideEdgeFinderWidthToOuterBoundingBoxEdgeLengthRatio(bundle), true);
        if (enableAutoSnap)
        {
            Object obj1 = new BarcodeRecognizer(CaptureModule.provideBarcodeDecoder(), roiProvider$7711cd23);
            ProcessorModule processormodule = new ProcessorModule();
            obj1 = processormodule.provideBarcodeNode(((com.google.android.libraries.commerce.ocr.util.ExecutorServiceFactory) (obj)), ocrResponseHandler, 100, ((BarcodeRecognizer) (obj1)));
            pipelinebuilder.to(processormodule.provideProcessorPipeline$74b393b8(resourcepool, ((com.google.android.libraries.commerce.ocr.util.ExecutorServiceFactory) (obj)), roiProvider$7711cd23, inFocusFrameCheck, cardProcessor, ((com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode) (obj1)), wobsocrprocessor, provider));
        } else
        {
            gatingprocessor.block();
        }
        cameraPreviewPresenter = new CameraPreviewPresenterImpl(((com.google.android.libraries.commerce.ocr.util.ExecutorServiceFactory) (obj)), cameraManager, resourcepool, pipelinebuilder.getPipelineNode(), gatingprocessor, false, false);
        ocrPresenter = new WobsOcrViewPresenter((FrameLayout)getView().findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrContainer), (ViewGroup)getView().findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrPreview), (ViewGroup)getView().findViewById(com.google.android.libraries.commerce.ocr.R.id.ocrOverlay), cameraPreviewPresenter, previewOverlayPresenter, roiProvider$7711cd23, cameraManager, transitionHandler);
    }

    private void createViews()
    {
        cameraPreviewView = new CameraPreviewViewImpl(fragmentModule.provideContext(), cameraPreviewPresenter);
        Object obj = wobsOcrUiModule;
        obj = WobsOcrUiModule.providePreviewOverlayView(this);
        Object obj1 = fragmentModule.provideContext();
        Object obj2 = wobsOcrUiModule;
        Object obj3 = previewOverlayPresenter;
        TransitionHandler transitionhandler = transitionHandler;
        com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView.CardHintRegionOfInterestProvider cardhintregionofinterestprovider = roiProvider$7711cd23;
        ShapeModifier shapemodifier = shapeModifier;
        ImageUtil imageutil = imageUtil;
        FragmentModule fragmentmodule = fragmentModule;
        ocrPreviewOverlayView = new WobsOcrPreviewOverlayView(((android.content.Context) (obj1)), ((View) (obj)), ((WobsOcrUiModule) (obj2)), ((WobsOcrPreviewOverlayPresenter) (obj3)), transitionhandler, cardhintregionofinterestprovider, shapemodifier, imageutil, FragmentModule.provideUiThreadHandler(), WobsOcrFlagModule.provideRestartCaptureFadeAnimationDurationInMs(), WobsOcrFlagModule.providePauseCaptureFadeAnimationDurationInMs(), UserAddedImageTeachingDialog.create(resources, getFragmentManager(), com/google/android/libraries/commerce/ocr/wobs/ui/UserAddedImageTeachingDialog.getSimpleName()));
        cardProcessor.setEdgeChangeListener(ocrPreviewOverlayView);
        inFocusFrameCheck.setEdgeChangeListener(ocrPreviewOverlayView);
        ocrPreviewOverlayView.setSide(side, false);
        obj = fragmentModule.provideContext();
        obj1 = cameraPreviewView;
        obj2 = ocrPreviewOverlayView;
        obj3 = fragmentModule;
        obj = new WobsOcrView(((android.content.Context) (obj)), ((CameraPreviewView) (obj1)), ((WobsOcrPreviewOverlayView) (obj2)), FragmentModule.provideUiThreadHandler());
        ocrPresenter.attachView(((com.google.android.libraries.commerce.ocr.ui.OcrView) (obj)));
    }

    private void releaseViews()
    {
        cardProcessor.setEdgeChangeListener(null);
        inFocusFrameCheck.setEdgeChangeListener(null);
        ocrPreviewOverlayView = null;
        cameraPreviewView = null;
    }

    private void startNewCaptureSession()
    {
        currentSessionHandler = new SessionOcrResponseHandler(ocrResponseHandler, side);
    }

    public final void flipSide(boolean flag)
    {
        com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side side1;
        if (com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.FRONT == side)
        {
            side1 = com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.BACK;
        } else
        {
            side1 = com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.FRONT;
        }
        setSide(side1, flag);
    }

    public final void onActivityCreated(Bundle bundle1)
    {
        super.onActivityCreated(bundle1);
        createControls();
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        WobsOcrFragment wobsocrfragment = (WobsOcrFragment)getParentFragment();
        wobsOcrClientProvider = wobsocrfragment;
        transitionHandler = wobsocrfragment;
        cameraManager = wobsocrfragment.provideCameraManager();
        ocrResponseHandler = wobsocrfragment.provideWobsOcrResponseHandler();
        wobsOcrUiModule = new WobsOcrUiModule(activity);
        enableAutoSnap = WobsOcrBundleModule.provideEnableAutoSnap(getArguments(), activity.getPackageManager());
        resources = activity.getResources();
    }

    public final void onCreate(Bundle bundle1)
    {
        super.onCreate(bundle1);
        if (enableAutoSnap)
        {
            NativeLibraryLoader.loadOcrClientLibrary();
        }
        if (bundle1 != null)
        {
            setSide(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.valueOf(bundle1.getString("card_side")), false);
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle1)
    {
        return (ViewGroup)layoutinflater.inflate(com.google.android.libraries.commerce.ocr.R.layout.ocr, viewgroup, false);
    }

    public final void onPause()
    {
        super.onPause();
        ocrPresenter.detachViews();
        releaseViews();
    }

    public final void onResume()
    {
        super.onResume();
        createViews();
        startNewCaptureSession();
        cameraPreviewPresenter.enableImageProcessing();
    }

    public final void onSaveInstanceState(Bundle bundle1)
    {
        bundle1.putString("card_side", side.name());
        super.onSaveInstanceState(bundle1);
    }

    public final void pauseOverlay()
    {
        if (ocrPreviewOverlayView != null)
        {
            ocrPreviewOverlayView.pause();
        }
    }

    public final void setSide(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side side1, boolean flag)
    {
        side = side1;
        if (ocrPreviewOverlayView != null)
        {
            ocrPreviewOverlayView.setSide(side1, flag);
        }
        startNewCaptureSession();
    }
}
