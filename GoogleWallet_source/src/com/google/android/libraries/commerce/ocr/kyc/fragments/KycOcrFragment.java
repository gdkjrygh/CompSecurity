// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.fragments;

import android.app.Activity;
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
import com.google.android.libraries.commerce.ocr.fragments.FragmentModule;
import com.google.android.libraries.commerce.ocr.kyc.capture.CaptureModule;
import com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResultHandler;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.fragments:
//            KycDependencyProvider, KycOcrResultImpl, ImageCaptureFragment, KycOcrBundleModule

public class KycOcrFragment extends Fragment
    implements ImageCaptureFragment.Listener, KycDependencyProvider
{

    private CameraManager barcodeCameraManager;
    private CameraManager cardCameraManager;
    private FragmentModule fragmentModule;
    private Handler handler;
    private ImageCaptureFragment imageCaptureFragment;
    private KycOcrResultImpl kycOcrResult;
    Optional overridePauseCaptureFadeAnimationDurationInMs;
    Optional overrideRestartCaptureFadeAnimationDurationInMs;
    public KycDependencyProvider overridingModule;
    private KycOcrResultHandler resultHandler;

    public KycOcrFragment()
    {
        kycOcrResult = new KycOcrResultImpl();
        overridePauseCaptureFadeAnimationDurationInMs = Optional.absent();
        overrideRestartCaptureFadeAnimationDurationInMs = Optional.absent();
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        resultHandler = (KycOcrResultHandler)activity;
    }

    public final void onBarcodeCaptured(com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode recognizedbarcode, com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics analytics)
    {
        kycOcrResult.setSideAnalytics(analytics, imageCaptureFragment.getSide());
        kycOcrResult.setBarcode(recognizedbarcode);
        resultHandler.onRecognized(kycOcrResult);
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (Bundle)Preconditions.checkNotNull(getArguments());
        fragmentModule = new FragmentModule(this);
        FragmentModule fragmentmodule;
        if (overridingModule != null)
        {
            cardCameraManager = overridingModule.provideCardCameraManager();
            barcodeCameraManager = overridingModule.provideBarcodeCameraManager();
        } else
        {
            boolean flag = KycOcrBundleModule.provideEnableAttemptContinuousPictureFocusMode(bundle, getActivity().getPackageManager());
            cardCameraManager = CaptureModule.provideCardCameraManager(this, flag);
            barcodeCameraManager = CaptureModule.provideBarcodeCameraManager(this, flag);
        }
        fragmentmodule = fragmentModule;
        handler = FragmentModule.provideUiThreadHandler();
        imageCaptureFragment = new ImageCaptureFragment();
        imageCaptureFragment.setArguments(bundle);
        getChildFragmentManager().beginTransaction().add(com.google.android.libraries.commerce.ocr.kyc.R.id.fragment_container, imageCaptureFragment, "KycOcrFragment-ImageCaptureFragment").commit();
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(com.google.android.libraries.commerce.ocr.kyc.R.layout.kyc_ocr_fragment_container, viewgroup, false);
    }

    public final void onError(int i, com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics analytics)
    {
        kycOcrResult.setSideAnalytics(analytics, imageCaptureFragment.getSide());
        resultHandler.onError(i, kycOcrResult);
    }

    public final void onImageCaptured(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.CardSideImage cardsideimage, com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics analytics)
    {
        kycOcrResult.setSideAnalytics(analytics, imageCaptureFragment.getSide());
        kycOcrResult.setSideImage(cardsideimage, imageCaptureFragment.getSide());
        handler.post(new Runnable() {

            final KycOcrFragment this$0;

            public final void run()
            {
label0:
                {
                    if (isResumed())
                    {
                        com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side side;
                        if (imageCaptureFragment.getSide() == com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side.FRONT)
                        {
                            side = com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side.BACK;
                        } else
                        {
                            side = com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side.FRONT;
                        }
                        if (!KycOcrBundleModule.captureBothSides(getArguments()) || kycOcrResult.getSideImage(side) != null)
                        {
                            break label0;
                        }
                        imageCaptureFragment.setSide(side);
                        imageCaptureFragment.resumeFromPause();
                    }
                    return;
                }
                resultHandler.onRecognized(kycOcrResult);
            }

            
            {
                this$0 = KycOcrFragment.this;
                super();
            }
        });
    }

    public final void onSkipped(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics analytics)
    {
        kycOcrResult.setSideAnalytics(analytics, imageCaptureFragment.getSide());
        resultHandler.onSkipped(kycOcrResult);
    }

    public final void onViewStateRestored(Bundle bundle)
    {
        super.onViewStateRestored(bundle);
    }

    public final CameraManager provideBarcodeCameraManager()
    {
        return barcodeCameraManager;
    }

    public final CameraManager provideCardCameraManager()
    {
        return cardCameraManager;
    }

    public final FragmentModule provideFragmentModule()
    {
        return fragmentModule;
    }



}
