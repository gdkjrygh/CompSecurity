// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.ads;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.ThreadUtils;

// Referenced classes of package com.netflix.mediaclient.service.logging.ads:
//            GooglePlayAdvertisingIdProvider, AdvertisingIdProvider

public final class AdvertisingIdProviderFactory
{

    private static final String TAG = "nf_log";

    private AdvertisingIdProviderFactory()
    {
    }

    public static AdvertisingIdProvider getInstance(Context context)
    {
        ThreadUtils.assertNotOnMain();
        int i;
        i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Google Play status: ").append(i).toString());
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Log.e("nf_log", "Not success!");
        return null;
        GooglePlayAdvertisingIdProvider googleplayadvertisingidprovider = new GooglePlayAdvertisingIdProvider(context);
        context = googleplayadvertisingidprovider;
        if (!Log.isLoggable("nf_log", 3))
        {
            break MISSING_BLOCK_LABEL_180;
        }
        Log.d("nf_log", (new StringBuilder()).append("Google Play Advertising ID: ").append(googleplayadvertisingidprovider.getId()).toString());
        Log.d("nf_log", (new StringBuilder()).append("Google Play Advertising ID is resettable : ").append(googleplayadvertisingidprovider.isResettable()).toString());
        Log.d("nf_log", (new StringBuilder()).append("Google Play Advertising ID is limited : ").append(googleplayadvertisingidprovider.isLimitAdTrackingEnabled()).toString());
        return googleplayadvertisingidprovider;
        context;
        Log.e("nf_log", "Failed to create Google Play provider", context);
        context = null;
        return context;
    }
}
