// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.model.Sdk;
import com.apptentive.android.sdk.util.JsonDiffer;
import com.apptentive.android.sdk.util.Util;
import org.json.JSONException;

public class SdkManager
{

    public SdkManager()
    {
    }

    private static Sdk generateCurrentSdk(Context context)
    {
        Sdk sdk = new Sdk();
        sdk.setVersion("1.6.4");
        sdk.setPlatform("Android");
        String s = Util.getPackageMetaDataSingleQuotedString(context, "apptentive_sdk_distribution");
        if (s != null && s.toString().length() != 0)
        {
            sdk.setDistribution(s.toString());
        }
        context = Util.getPackageMetaDataSingleQuotedString(context, "apptentive_sdk_distribution_version");
        if (context != null && context.toString().length() != 0)
        {
            sdk.setDistributionVersion(context.toString());
        }
        return sdk;
    }

    public static Sdk getStoredSdk(Context context)
    {
        context = context.getSharedPreferences("APPTENTIVE", 0).getString("sdk", null);
        try
        {
            context = new Sdk(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    private static void storeSdk(Context context, Sdk sdk)
    {
        context.getSharedPreferences("APPTENTIVE", 0).edit().putString("sdk", sdk.toString()).commit();
    }

    public static Sdk storeSdkAndReturnDiff(Context context)
    {
        Sdk sdk;
        Object obj;
        obj = getStoredSdk(context);
        sdk = generateCurrentSdk(context);
        obj = JsonDiffer.getDiff(((org.json.JSONObject) (obj)), sdk);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        storeSdk(context, sdk);
        context = new Sdk(obj.toString());
        return context;
        context;
        Log.e("Error casting to Sdk.", context, new Object[0]);
        return null;
    }

    public static Sdk storeSdkAndReturnIt(Context context)
    {
        Sdk sdk = generateCurrentSdk(context);
        storeSdk(context, sdk);
        return sdk;
    }
}
