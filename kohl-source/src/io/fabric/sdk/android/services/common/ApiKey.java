// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            CommonUtils

public class ApiKey
{

    static final String CRASHLYTICS_API_KEY = "com.crashlytics.ApiKey";
    static final String FABRIC_API_KEY = "io.fabric.ApiKey";

    public ApiKey()
    {
    }

    public static String getApiKey(Context context)
    {
        Fabric.getLogger().w("Fabric", "getApiKey(context) is deprecated, please upgrade kit(s) to the latest version.");
        return (new ApiKey()).getValue(context);
    }

    public static String getApiKey(Context context, boolean flag)
    {
        Fabric.getLogger().w("Fabric", "getApiKey(context, debug) is deprecated, please upgrade kit(s) to the latest version.");
        return (new ApiKey()).getValue(context);
    }

    protected String buildApiKeyInstructions()
    {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    protected String getApiKeyFromManifest(Context context)
    {
        String s1 = null;
        Object obj = null;
        String s = s1;
        Object obj1;
        try
        {
            obj1 = context.getPackageName();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Caught non-fatal exception while retrieving apiKey: ").append(context).toString());
            return s;
        }
        s = s1;
        obj1 = context.getPackageManager().getApplicationInfo(((String) (obj1)), 128).metaData;
        context = obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        s = s1;
        s1 = ((Bundle) (obj1)).getString("io.fabric.ApiKey");
        context = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        s = s1;
        Fabric.getLogger().d("Fabric", "Falling back to Crashlytics key lookup from Manifest");
        s = s1;
        context = ((Bundle) (obj1)).getString("com.crashlytics.ApiKey");
        return context;
    }

    protected String getApiKeyFromStrings(Context context)
    {
        String s = null;
        int j = CommonUtils.getResourcesIdentifier(context, "io.fabric.ApiKey", "string");
        int i = j;
        if (j == 0)
        {
            Fabric.getLogger().d("Fabric", "Falling back to Crashlytics key lookup from Strings");
            i = CommonUtils.getResourcesIdentifier(context, "com.crashlytics.ApiKey", "string");
        }
        if (i != 0)
        {
            s = context.getResources().getString(i);
        }
        return s;
    }

    public String getValue(Context context)
    {
        String s1 = getApiKeyFromManifest(context);
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = getApiKeyFromStrings(context);
        }
        if (TextUtils.isEmpty(s))
        {
            logErrorOrThrowException(context);
        }
        return s;
    }

    protected void logErrorOrThrowException(Context context)
    {
        if (Fabric.isDebuggable() || CommonUtils.isAppDebuggable(context))
        {
            throw new IllegalArgumentException(buildApiKeyInstructions());
        } else
        {
            Fabric.getLogger().e("Fabric", buildApiKeyInstructions());
            return;
        }
    }
}
