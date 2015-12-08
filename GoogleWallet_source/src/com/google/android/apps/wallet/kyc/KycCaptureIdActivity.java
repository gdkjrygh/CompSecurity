// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.Window;
import com.google.android.apps.common.csi.lib.Ticker;
import com.google.android.apps.common.csi.lib.Timer;
import com.google.android.apps.wallet.analytics.CsiManager;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.fragment.Fragments;
import com.google.android.apps.wallet.kyc.api.KycClient;
import com.google.android.apps.wallet.rpc.CrossbarEesClientService;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.libraries.commerce.ocr.kyc.fragments.KycOcrFragment;
import com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult;
import com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResultHandler;
import com.google.protobuf.nano.MessageNano;
import java.util.concurrent.Callable;
import javax.inject.Provider;

public class KycCaptureIdActivity extends WalletActivity
    implements KycOcrResultHandler
{
    final class CustomTimer
        implements Timer
    {

        long elapsedTime;
        final KycCaptureIdActivity this$0;

        public final long elapsedRealtime()
        {
            return elapsedTime;
        }

        private CustomTimer()
        {
            this$0 = KycCaptureIdActivity.this;
            super();
            elapsedTime = 0L;
        }

    }


    CrossbarEesClientService crossbarEesClientService;
    CsiManager csiManager;
    private byte frontImageData[];
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    Handler handler;
    KycClient kycClient;
    Provider kycOcrFragmentProvider;
    private int retryCount;

    public KycCaptureIdActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_container);
        retryCount = 0;
        frontImageData = null;
    }

    private Ticker makeTicker(Long long1, String s)
    {
        CustomTimer customtimer = new CustomTimer();
        customtimer.elapsedTime = long1.longValue();
        return new Ticker(s, customtimer);
    }

    private void reportOCRAnalytics(KycOcrResult kycocrresult)
    {
        kycocrresult = kycocrresult.getSideAnalytics(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side.FRONT);
        if (kycocrresult != null)
        {
            if (kycocrresult.timeToCaptureMillis() != null)
            {
                csiManager.reportTicker(makeTicker(kycocrresult.timeToCaptureMillis(), "KYC_OCR_TIME_TO_CAPTURE"));
            }
            if (kycocrresult.timeToConfirmMillis() != null)
            {
                csiManager.reportTicker(makeTicker(kycocrresult.timeToConfirmMillis(), "KYC_OCR_TIME_TO_CONFIRM"));
            }
            if (kycocrresult.timeToFirstFocusedFrameMillis() != null)
            {
                csiManager.reportTicker(makeTicker(kycocrresult.timeToFirstFocusedFrameMillis(), "KYC_OCR_TIME_TO_FOCUS"));
            }
            if (kycocrresult.timeToFirstFrameMillis() != null)
            {
                csiManager.reportTicker(makeTicker(kycocrresult.timeToFirstFrameMillis(), "KYC_OCR_TIME_TO_FRAME"));
            }
        }
    }

    private void submit()
    {
        executeAction("EES_ENCRYPT", new Callable() {

            final KycCaptureIdActivity this$0;

            private com.google.wallet.proto.NanoWalletShared.ClientEncryptedData call()
                throws Exception
            {
                return crossbarEesClientService.encrypt(frontImageData).encryptedFile;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = KycCaptureIdActivity.this;
                super();
            }
        });
    }

    public final void doOnCreate(Bundle bundle)
    {
        getWindow().addFlags(8192);
        getSupportActionBar().hide();
        if (bundle == null)
        {
            bundle = new Bundle();
            bundle.putBoolean("KYC_TWO_SIDES", false);
            bundle.putBoolean("KYC_ALLOW_SKIP", false);
            KycOcrFragment kycocrfragment = (KycOcrFragment)kycOcrFragmentProvider.get();
            kycocrfragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().add(com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer, kycocrfragment, Fragments.getTransactionTag(com/google/android/libraries/commerce/ocr/kyc/fragments/KycOcrFragment)).commit();
        }
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if (retryCount <= 0 && frontImageData != null)
        {
            retryCount = retryCount + 1;
            handler.postDelayed(new Runnable() {

                final KycCaptureIdActivity this$0;

                public final void run()
                {
                    submit();
                }

            
            {
                this$0 = KycCaptureIdActivity.this;
                super();
            }
            }, 100L);
        } else
        {
            fullScreenProgressSpinnerManager.hide();
            setResult(0);
            AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.kyc_error_please_try_again)).setFinishActivityOnClick().setFinishActivityOnDismiss().setCancelable(false).build().show(getSupportFragmentManager());
        }
        return true;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        super.onActionSuccess(s, callable, obj);
        s = (com.google.wallet.proto.NanoWalletShared.ClientEncryptedData)obj;
        callable = new Intent();
        callable.putExtra("CLIENT_ENCRYPTED_DATA", MessageNano.toByteArray(s));
        setResult(11, callable);
        finish();
    }

    public void onError(int i, KycOcrResult kycocrresult)
    {
        reportOCRAnalytics(kycocrresult);
        setResult(10);
        finish();
    }

    public void onRecognized(KycOcrResult kycocrresult)
    {
        fullScreenProgressSpinnerManager.show();
        reportOCRAnalytics(kycocrresult);
        frontImageData = kycocrresult.getSideImage(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side.FRONT).getCardJpegImageData();
        submit();
    }

    public void onSkipped(KycOcrResult kycocrresult)
    {
        reportOCRAnalytics(kycocrresult);
        setResult(12);
        finish();
    }

    protected final void onUpPressed()
    {
        setResult(0);
        finish();
    }


}
