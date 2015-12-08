// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.amazon.drm.AmazonLicenseVerificationCallback;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.util:
//            AndroidUtils

public final class AppStoreHelper
{

    private static final String AMAZON_APP_STORE_URI = "amzn://apps/android?p=com.netflix.mediaclient";
    private static final String ANDROID_PACKAGE_PREFIX = "com.android.";
    private static final String GOOGLE_PACKAGE_PREFIX = "com.google.";
    private static final String INSTALL_SOURCE_AMAZON = "amazon";
    private static final String INSTALL_SOURCE_GOOGLE = "google";
    private static final String INSTALL_SOURCE_SIDELOAD = "sideload";
    private static final String NOOK_APP_STORE_ACTION = "com.bn.sdk.shop.details";
    private static final String NOOK_APP_STORE_NETFLIX_EAN = "2940043872739";
    private static final String PACKAGE_NAME = "com.netflix.mediaclient";
    private static final String PLAY_STORE_URI = "market://details?id=com.netflix.mediaclient";
    private static final String TAG = "nf_appstorehelper";

    private AppStoreHelper()
    {
    }

    public static final Intent getAmazonStoreIntent()
    {
        Intent intent = new Intent();
        intent.setData(Uri.parse("amzn://apps/android?p=com.netflix.mediaclient"));
        return intent;
    }

    public static String getInstallationSource(Context context)
    {
        if (isPlayStoreInstallSource(context))
        {
            return "google";
        }
        if (isAmazonStoreInstallSource())
        {
            return "amazon";
        } else
        {
            return "sideload";
        }
    }

    public static final Intent getNookStoreIntent()
    {
        Intent intent = new Intent();
        intent.setAction("com.bn.sdk.shop.details");
        intent.putExtra("product_details_ean", "2940043872739");
        return intent;
    }

    public static final Intent getPlayStoreIntent()
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=com.netflix.mediaclient"));
        return intent;
    }

    public static final Intent getUpdateSourceIntent(Context context)
    {
        if (isAmazonStoreInstallSource())
        {
            Intent intent = getAmazonStoreIntent();
            if (AndroidUtils.queryIntentActivities(context, intent) != null)
            {
                Log.d("nf_appstorehelper", "App Update Source is Amazon App Store");
                return intent;
            }
        }
        Intent intent1 = getPlayStoreIntent();
        if (AndroidUtils.queryIntentActivities(context, intent1) != null)
        {
            Log.d("nf_appstorehelper", "App Update Source is Google Play Store");
            return intent1;
        }
        Log.d("nf_appstorehelper", "Google Play Store is not installed or was not setup.");
        intent1 = getNookStoreIntent();
        if (AndroidUtils.queryIntentActivities(context, intent1) != null)
        {
            Log.d("nf_appstorehelper", "App Update Source is Nook App Store");
            return intent1;
        }
        intent1 = getAmazonStoreIntent();
        if (AndroidUtils.queryIntentActivities(context, intent1) != null)
        {
            Log.d("nf_appstorehelper", "App Update Source is Amazon App Store");
            return intent1;
        } else
        {
            return null;
        }
    }

    public static final boolean isAmazonStoreInstallSource()
    {
        if (AmazonLicenseVerificationCallback.isCalled())
        {
            Log.d("nf_appstorehelper", "Installation source is Amazon App Store.");
            return true;
        } else
        {
            return false;
        }
    }

    public static final boolean isPlayStoreInstallSource(Context context)
    {
        context = context.getPackageManager();
        if (context != null)
        {
            context = context.getInstallerPackageName("com.netflix.mediaclient");
            if (context != null)
            {
                context = context.toLowerCase();
                if (context.startsWith("com.android.") || context.startsWith("com.google."))
                {
                    Log.d("nf_appstorehelper", "Installation source is Google Play Store.");
                    return true;
                }
            }
        }
        return false;
    }
}
