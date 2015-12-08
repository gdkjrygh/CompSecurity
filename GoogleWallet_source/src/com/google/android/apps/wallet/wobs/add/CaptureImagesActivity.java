// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.Window;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.giftcard.api.GiftCardApi;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.loyalty.api.LoyaltyApi;
import com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.api.WobsOcrClientAdapter;
import com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.RecognizeWobDataResponseConverter;
import com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.WobsOcrRequestConverter;
import com.google.android.libraries.commerce.ocr.loyalty.api.WobsOcrClient;
import com.google.android.libraries.commerce.ocr.loyalty.fragments.WobsOcrClientProvider;
import com.google.android.libraries.commerce.ocr.wobs.WobsOcrFragment;
import com.google.common.collect.Lists;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            DaggerOcrImageHolder, WobsOcrClientImpl

public class CaptureImagesActivity extends WalletActivity
    implements WobsOcrClientProvider, com.google.android.libraries.commerce.ocr.wobs.WobsOcrFragment.WobsOcrFragmentResultHandler
{

    private static final String TAG;
    private static final String WOBS_OCR_FRAGMENT_TAG;
    private com.google.android.apps.wallet.wobs.add.api.AddWobsApi.ImageCaptureAnalyticsStrings analyticsStrings;
    AnalyticsUtil analyticsUtil;
    AppControl appControl;
    DaggerOcrImageHolder ocrImageHolder;
    WobsOcrRequestConverter requestConverter;
    RecognizeWobDataResponseConverter responseConverter;
    WobsOcrClientImpl wobsOcrClientImpl;
    Provider wobsOcrFragment;

    public CaptureImagesActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_container);
    }

    private void analyticsEndTiming()
    {
        if (analyticsStrings != null)
        {
            analyticsUtil.endTiming(analyticsStrings.timing, null);
        }
    }

    private void analyticsSendButtonTapSkip()
    {
        if (analyticsStrings != null)
        {
            analyticsUtil.sendButtonTap(analyticsStrings.buttonTapSkip, new AnalyticsCustomDimension[0]);
        }
    }

    private void analyticsSendError()
    {
        if (analyticsStrings != null)
        {
            analyticsUtil.sendError(analyticsStrings.field, new AnalyticsCustomDimension[0]);
        }
    }

    private void analyticsSendScreen()
    {
        if (analyticsStrings != null)
        {
            analyticsUtil.sendScreen(analyticsStrings.screen, new AnalyticsCustomDimension[0]);
        }
    }

    private void analyticsSendSuccess()
    {
        if (analyticsStrings != null)
        {
            analyticsUtil.sendSuccess(analyticsStrings.field, new AnalyticsCustomDimension[0]);
        }
    }

    private void analyticsStartTiming()
    {
        if (analyticsStrings != null)
        {
            analyticsUtil.startTiming(analyticsStrings.timing, null);
        }
    }

    public final void doOnCreate(Bundle bundle)
    {
        getSupportActionBar().hide();
        if (bundle != null) goto _L2; else goto _L1
_L1:
        int i;
        bundle = new Bundle();
        if (!getIntent().hasExtra("extra_wob_type"))
        {
            WLog.e(TAG, "Intent must specify WobsApi.EXTRA_WOB_TYPE!");
            finish();
        }
        bundle.putString("CONTINUOUS_PICTURE_FOCUS_MODE_MODEL_BLACKLIST", appControl.getString(AppControlKey.WOBS_CONTINUOUS_PICTURE_FOCUS_MODE_MODEL_BLACKLIST));
        bundle.putString("AUTO_SNAP_MODEL_BLACKLIST", appControl.getString(AppControlKey.WOBS_AUTO_SNAP_MODEL_BLACKLIST));
        bundle.putInt("USER_ADDED_IMAGE_MODE", getIntent().getIntExtra("extra_image_capture_mode", 3));
        i = getIntent().getExtras().getInt("extra_wob_type");
        i;
        JVM INSTR tableswitch 1 2: default 128
    //                   1 214
    //                   2 229;
           goto _L3 _L4 _L5
_L3:
        WLog.e(TAG, (new StringBuilder(71)).append("Unrecognized WobType from intent AddWobsApi.EXTRA_WOB_TYPE: ").append(i).toString());
        finish();
_L7:
        WobsOcrFragment wobsocrfragment = (WobsOcrFragment)wobsOcrFragment.get();
        wobsocrfragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().add(0x1020002, wobsocrfragment, WOBS_OCR_FRAGMENT_TAG).commit();
_L2:
        analyticsStrings = (com.google.android.apps.wallet.wobs.add.api.AddWobsApi.ImageCaptureAnalyticsStrings)getIntent().getParcelableExtra("extra_image_capture_analytics_strings");
        return;
_L4:
        bundle.putInt("WOB_TYPE", com.google.commerce.ocr.definitions.WireProto.WobType.GIFTCARD.ordinal());
        continue; /* Loop/switch isn't completed */
_L5:
        bundle.putInt("WOB_TYPE", com.google.commerce.ocr.definitions.WireProto.WobType.LOYALTY.ordinal());
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected final void doOnResume()
    {
        super.doOnResume();
        analyticsSendScreen();
        analyticsStartTiming();
    }

    public final WobsOcrClient getWobsOcrClient()
    {
        return new WobsOcrClientAdapter(requestConverter, responseConverter, wobsOcrClientImpl);
    }

    public final void handleResult(int i, Intent intent)
    {
        i;
        JVM INSTR lookupswitch 3: default 36
    //                   -1: 122
    //                   0: 44
    //                   10007: 133;
           goto _L1 _L2 _L3 _L4
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        analyticsEndTiming();
        analyticsSendError();
_L12:
        Object obj;
        java.util.ArrayList arraylist = Lists.newArrayList();
        obj = arraylist;
        if (intent != null)
        {
            obj = arraylist;
            if (intent.hasExtra("WOBS_OCR_RESULT"))
            {
                obj = intent.getParcelableArrayListExtra("WOBS_OCR_RESULT");
            }
        }
        if (!getIntent().getBooleanExtra("extra_is_initial_capture", false)) goto _L6; else goto _L5
_L5:
        int j = getIntent().getExtras().getInt("extra_wob_type");
        if (j != 1) goto _L8; else goto _L7
_L7:
        startActivity(GiftCardApi.createNewGiftCardActivityIntentWithOcrResults(this, i, ((java.util.ArrayList) (obj))));
_L10:
        return;
_L2:
        analyticsEndTiming();
        analyticsSendSuccess();
        continue; /* Loop/switch isn't completed */
_L4:
        analyticsSendButtonTapSkip();
        obj = ocrImageHolder;
        int k;
        if (DaggerOcrImageHolder.get(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.FRONT) == null)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        obj = ocrImageHolder;
        if (DaggerOcrImageHolder.get(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.BACK) == null)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (j != k)
        {
            obj = ocrImageHolder;
            DaggerOcrImageHolder.clear();
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (j != 2) goto _L10; else goto _L9
_L9:
        startActivity(LoyaltyApi.createNewLoyaltyCardActivityIntentWithOcrResults(this, i, ((java.util.ArrayList) (obj))));
        return;
_L6:
        intent = new Intent();
        intent.putParcelableArrayListExtra("extra_ocr_result_code", ((java.util.ArrayList) (obj)));
        setResult(i, intent);
        finish();
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    protected final void onBeforeCreate(Bundle bundle)
    {
        getWindow().addFlags(1024);
        super.onBeforeCreate(bundle);
    }

    protected final void onUpPressed()
    {
        setResult(0);
        finish();
    }

    static 
    {
        String s = com/google/android/apps/wallet/wobs/add/CaptureImagesActivity.getName();
        TAG = s;
        String s1 = String.valueOf(com/google/android/libraries/commerce/ocr/wobs/WobsOcrFragment.getSimpleName());
        WOBS_OCR_FRAGMENT_TAG = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("-").append(s1).toString();
    }
}
