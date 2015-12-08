// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.loyalty.api.WobsOcrClient;
import com.google.android.libraries.commerce.ocr.loyalty.fragments.WobsOcrClientProvider;
import com.google.android.libraries.commerce.ocr.util.TimeoutManager;
import com.google.android.libraries.commerce.ocr.wobs.capture.CaptureModule;
import com.google.android.libraries.commerce.ocr.wobs.capture.WobsActionDecoratingResponseHandler;
import com.google.android.libraries.commerce.ocr.wobs.capture.WobsOcrResponseHandler;
import com.google.android.libraries.commerce.ocr.wobs.fragments.ImageCaptureDependencyProvider;
import com.google.android.libraries.commerce.ocr.wobs.fragments.ImageCaptureFragment;
import com.google.android.libraries.commerce.ocr.wobs.fragments.ImagePreviewFragment;
import com.google.android.libraries.commerce.ocr.wobs.fragments.OcrResultNotifier;
import com.google.android.libraries.commerce.ocr.wobs.fragments.TransitionHandler;
import com.google.android.libraries.commerce.ocr.wobs.fragments.WobsOcrBundleModule;
import com.google.android.libraries.commerce.ocr.wobs.fragments.WobsOcrFlagModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs:
//            WobsResultMerger

public class WobsOcrFragment extends Fragment
    implements WobsOcrClientProvider, ImageCaptureDependencyProvider, TransitionHandler
{
    final class RunWhenInForegroundTask extends TimerTask
    {

        private TimerTask task;
        final WobsOcrFragment this$0;

        public final void run()
        {
            handler.post(new Runnable() {

                final RunWhenInForegroundTask this$1;

                public final void run()
                {
                    if (onSaveInstanceStateCalled)
                    {
                        runOnResumeList.add(task);
                        return;
                    } else
                    {
                        task.run();
                        return;
                    }
                }

            
            {
                this$1 = RunWhenInForegroundTask.this;
                super();
            }
            });
        }


        public RunWhenInForegroundTask(TimerTask timertask)
        {
            this$0 = WobsOcrFragment.this;
            super();
            task = timertask;
        }
    }

    public static interface WobsOcrFragmentResultHandler
    {

        public abstract void handleResult(int i, Intent intent);
    }


    private static final String IMAGE_CAPTURE_FRAGMENT_TAG;
    private static final String IMAGE_PREVIEW_FRAGMENT_TAG;
    private static final String TAG;
    private CameraManager cameraManager;
    private Handler handler;
    private ImageCaptureFragment imageCaptureFragment;
    private ImagePreviewFragment imagePreviewFragment;
    private WobsActionDecoratingResponseHandler ocrResponseHandler;
    private boolean onSaveInstanceStateCalled;
    private TimeoutManager pauseCaptureTimeoutManager;
    private List runOnResumeList;
    private WobsOcrClientProvider wobsOcrClientProvider;
    private WobsOcrFragmentResultHandler wobsOcrFragmentResultHandler;
    private WobsOcrResponseHandler wobsOcrResponseHandler;

    public WobsOcrFragment()
    {
        runOnResumeList = new ArrayList();
    }

    public final void captureSingleSide(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side side)
    {
        imageCaptureFragment.setSide(side, false);
        getChildFragmentManager().beginTransaction().replace(R.id.fragment_container, imageCaptureFragment, IMAGE_CAPTURE_FRAGMENT_TAG).addToBackStack(null).commit();
    }

    public final void exit(int i)
    {
        cameraManager.stopPreview();
        wobsOcrFragmentResultHandler.handleResult(i, new Intent());
    }

    public final WobsOcrClient getWobsOcrClient()
    {
        return wobsOcrClientProvider.getWobsOcrClient();
    }

    public final void next()
    {
        Object obj = wobsOcrResponseHandler.getAggregatedResponse();
        if (((ArrayList) (obj)).isEmpty())
        {
            wobsOcrFragmentResultHandler.handleResult(10005, new Intent());
            return;
        }
        obj = (new Intent()).putExtra("WOBS_OCR_RESULT", WobsResultMerger.mergeResults(((ArrayList) (obj))));
        ArrayList arraylist = wobsOcrResponseHandler.getAggregatedDebugResponseInfo();
        if (!arraylist.isEmpty())
        {
            ((Intent) (obj)).putExtra("WOBS_OCR_DEBUG_INFO", arraylist);
        }
        wobsOcrFragmentResultHandler.handleResult(-1, ((Intent) (obj)));
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        wobsOcrClientProvider = (WobsOcrClientProvider)activity;
        wobsOcrFragmentResultHandler = (WobsOcrFragmentResultHandler)activity;
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        FragmentActivity fragmentactivity = getActivity();
        Bundle bundle1 = getArguments();
        handler = new Handler();
        pauseCaptureTimeoutManager = new TimeoutManager(WobsOcrFlagModule.providePauseCaptureFadeAnimationDurationInMs());
        cameraManager = CaptureModule.provideCameraManager(fragmentactivity, WobsOcrBundleModule.provideEnableAttemptContinuousPictureFocusMode(bundle1, getActivity().getPackageManager()));
        wobsOcrResponseHandler = CaptureModule.provideWobsOcrResponseHandler(fragmentactivity, this);
        ocrResponseHandler = new WobsActionDecoratingResponseHandler(wobsOcrResponseHandler, this, WobsOcrBundleModule.provideInitialOcrAttemptAction(bundle1));
        if (bundle == null)
        {
            imagePreviewFragment = new ImagePreviewFragment();
            imagePreviewFragment.setArguments(bundle1);
            imageCaptureFragment = new ImageCaptureFragment();
            imageCaptureFragment.setArguments(bundle1);
            imageCaptureFragment.setSide(WobsOcrBundleModule.provideInitialSide(bundle1), false);
            getChildFragmentManager().beginTransaction().add(R.id.fragment_container, imageCaptureFragment, IMAGE_CAPTURE_FRAGMENT_TAG).commit();
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return (ViewGroup)layoutinflater.inflate(R.layout.wobs_ocr_fragment_container, viewgroup, false);
    }

    public final void onResume()
    {
        super.onResume();
        onSaveInstanceStateCalled = false;
        for (Iterator iterator = runOnResumeList.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        runOnResumeList.clear();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        onSaveInstanceStateCalled = true;
        super.onSaveInstanceState(bundle);
    }

    public final void onViewStateRestored(Bundle bundle)
    {
        super.onViewStateRestored(bundle);
        if (bundle != null)
        {
            imageCaptureFragment = (ImageCaptureFragment)getChildFragmentManager().findFragmentByTag(IMAGE_CAPTURE_FRAGMENT_TAG);
            if (imageCaptureFragment == null)
            {
                imageCaptureFragment = new ImageCaptureFragment();
                imageCaptureFragment.setArguments(getArguments());
            }
            imagePreviewFragment = (ImagePreviewFragment)getChildFragmentManager().findFragmentByTag(IMAGE_PREVIEW_FRAGMENT_TAG);
            if (imagePreviewFragment == null)
            {
                imagePreviewFragment = new ImagePreviewFragment();
                imagePreviewFragment.setArguments(getArguments());
            }
        }
    }

    public final void pauseCapture(TimerTask timertask, long l)
    {
        cameraManager.stopPreview();
        imageCaptureFragment.pauseOverlay();
        if (l == 0x8000000000000000L)
        {
            pauseCaptureTimeoutManager.startTimeout(timertask);
            return;
        } else
        {
            pauseCaptureTimeoutManager.startTimeout(timertask, l);
            return;
        }
    }

    public final void pauseCaptureAndFlipSide()
    {
        pauseCapture(new RunWhenInForegroundTask(new TimerTask() {

            final WobsOcrFragment this$0;

            public final void run()
            {
                imageCaptureFragment.flipSide(true);
                cameraManager.restartPreview();
            }

            
            {
                this$0 = WobsOcrFragment.this;
                super();
            }
        }), WobsOcrFlagModule.providePauseCaptureBeforeFlipTimeInMs());
    }

    public final void pauseCaptureAndPreview()
    {
        pauseCapture(new RunWhenInForegroundTask(new TimerTask() {

            final WobsOcrFragment this$0;

            public final void run()
            {
                getChildFragmentManager().beginTransaction().replace(R.id.fragment_container, imagePreviewFragment, WobsOcrFragment.IMAGE_PREVIEW_FRAGMENT_TAG).addToBackStack(null).commit();
            }

            
            {
                this$0 = WobsOcrFragment.this;
                super();
            }
        }), WobsOcrFlagModule.providePauseCaptureBeforePreviewTimeInMs());
    }

    public final CameraManager provideCameraManager()
    {
        return cameraManager;
    }

    public final OcrResultNotifier provideOcrResultNotifier()
    {
        return wobsOcrResponseHandler;
    }

    public final com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler provideWobsOcrResponseHandler()
    {
        return ocrResponseHandler;
    }

    static 
    {
        String s = com/google/android/libraries/commerce/ocr/wobs/WobsOcrFragment.getName();
        TAG = s;
        String s1 = String.valueOf(com/google/android/libraries/commerce/ocr/wobs/fragments/ImageCaptureFragment.getSimpleName());
        IMAGE_CAPTURE_FRAGMENT_TAG = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("-").append(s1).toString();
        s = TAG;
        s1 = String.valueOf(com/google/android/libraries/commerce/ocr/wobs/fragments/ImagePreviewFragment.getSimpleName());
        IMAGE_PREVIEW_FRAGMENT_TAG = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("-").append(s1).toString();
    }







}
