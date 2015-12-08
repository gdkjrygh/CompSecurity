// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            CommonUtils

public class ApiKey
{

    static final String CRASHLYTICS_API_KEY = "com.crashlytics.ApiKey";

    public ApiKey()
    {
    }

    private static String buildApiKeyInstructions()
    {
        return "Crashlytics could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"com.crashlytics.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    public static String getApiKey(Context context)
    {
        return getApiKey(context, false);
    }

    public static String getApiKey(Context context, boolean flag)
    {
        String s = null;
        Object obj1;
        Context context1 = context.getApplicationContext();
        obj1 = context1.getPackageName();
        obj1 = context1.getPackageManager().getApplicationInfo(((String) (obj1)), 128).metaData;
        Object obj = s;
        if (obj1 != null)
        {
            try
            {
                obj = ((Bundle) (obj1)).getString("com.crashlytics.ApiKey");
            }
            catch (Exception exception)
            {
                Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Caught non-fatal exception while retrieving apiKey: ").append(exception).toString());
                exception = s;
            }
        }
        s = ((String) (obj));
        if (CommonUtils.isNullOrEmpty(((String) (obj))))
        {
            int i = CommonUtils.getResourcesIdentifier(context, "com.crashlytics.ApiKey", "string");
            s = ((String) (obj));
            if (i != 0)
            {
                s = context.getResources().getString(i);
            }
        }
        if (CommonUtils.isNullOrEmpty(s))
        {
            if (flag || CommonUtils.isAppDebuggable(context))
            {
                throw new IllegalArgumentException(buildApiKeyInstructions());
            }
            Fabric.getLogger().e("Fabric", buildApiKeyInstructions(), null);
        }
        return s;
    }
}
