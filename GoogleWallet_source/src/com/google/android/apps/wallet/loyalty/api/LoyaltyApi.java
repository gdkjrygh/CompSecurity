// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty.api;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.wobs.add.api.AddWobsApi;
import java.util.ArrayList;

public final class LoyaltyApi
{

    public static final com.google.android.apps.wallet.wobs.add.api.AddWobsApi.ImageCaptureAnalyticsStrings IMAGE_CAPTURE_ANALYTICS_STRINGS = new com.google.android.apps.wallet.wobs.add.api.AddWobsApi.ImageCaptureAnalyticsStrings("Scan Loyalty Card", "ScanCard", "SkipScanning", "ScanCard");

    public static Intent createFeaturedProgramDetailsActivityIntentWithProgramId(Context context, String s)
    {
        return InternalIntents.forAction(context, "android.intent.action.VIEW").setData(UriRegistry.getUri(3000, new Object[] {
            s
        }));
    }

    public static Intent createNewLoyaltyCardActivityIntentWithOcrResults(Context context, int i, ArrayList arraylist)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.loyalty.NewLoyaltyCardActivity").putParcelableArrayListExtra("extra_wob_ocr_results", arraylist).putExtra("extra_ocr_result_code", i).putExtra("is_signup", false);
    }

    public static Intent createStartNewAdhocLoyaltyCardFlowIntent(Context context, boolean flag)
    {
        if (flag)
        {
            return AddWobsApi.createCaptureImagesActivityIntent(context, IMAGE_CAPTURE_ANALYTICS_STRINGS, 2);
        } else
        {
            return InternalIntents.forClass(context, "com.google.android.apps.wallet.loyalty.NewLoyaltyCardActivity").putExtra("is_signup", false);
        }
    }

}
