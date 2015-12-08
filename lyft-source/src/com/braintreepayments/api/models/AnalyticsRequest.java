// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.content.Context;
import com.braintreepayments.api.Utils;
import com.google.gson.Gson;

public class AnalyticsRequest
{

    public Meta _meta;
    public Analytics analytics[];

    public AnalyticsRequest(Context context, String s, String s1)
    {
        analytics = (new Analytics[] {
            new Analytics(s)
        });
        _meta = new Meta(context, s1);
    }

    public String toJson()
    {
        return Utils.getGson().a(this);
    }

    private class Analytics
    {

        private String kind;
        final AnalyticsRequest this$0;

        public Analytics(String s)
        {
            this$0 = AnalyticsRequest.this;
            super();
            kind = s;
        }
    }


    private class Meta
    {

        private String androidId;
        private String deviceAppGeneratedPersistentUuid;
        private String deviceManufacturer;
        private String deviceModel;
        private String deviceNetworkType;
        private String deviceRooted;
        private String deviceScreenOrientation;
        private String integrationType;
        private String isSimulator;
        private String merchantAppId;
        private String merchantAppName;
        private String merchantAppVersion;
        private String platform;
        private String platformVersion;
        private String sdkVersion;
        final AnalyticsRequest this$0;
        private String userInterfaceOrientation;

        private String detectEmulator()
        {
            if ("google_sdk".equalsIgnoreCase(Build.PRODUCT) || "sdk".equalsIgnoreCase(Build.PRODUCT) || "Genymotion".equalsIgnoreCase(Build.MANUFACTURER))
            {
                return "true";
            } else
            {
                return "false";
            }
        }

        private String getAppName(ApplicationInfo applicationinfo, PackageManager packagemanager)
        {
            if (applicationinfo != null)
            {
                return (String)packagemanager.getApplicationLabel(applicationinfo);
            } else
            {
                return "ApplicationNameUnknown";
            }
        }

        private String getAppVersion(PackageManager packagemanager, String s)
        {
            try
            {
                packagemanager = packagemanager.getPackageInfo(s, 0).versionName;
            }
            // Misplaced declaration of an exception variable
            catch (PackageManager packagemanager)
            {
                return "VersionUnknown";
            }
            return packagemanager;
        }

        private String getNetworkType(Context context)
        {
            return ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo().getTypeName();
        }

        private String getUUID(Context context)
        {
            SharedPreferences sharedpreferences = context.getSharedPreferences("BraintreeApi", 0);
            String s = sharedpreferences.getString("braintreeUUID", null);
            context = s;
            if (s == null)
            {
                context = UUID.randomUUID().toString().replace("-", "");
                sharedpreferences.edit().putString("braintreeUUID", context).apply();
            }
            return context;
        }

        private String getUserOrientation(Context context)
        {
            switch (context.getResources().getConfiguration().orientation)
            {
            default:
                return "Unknown";

            case 1: // '\001'
                return "Portrait";

            case 2: // '\002'
                return "Landscape";
            }
        }

        private String isDeviceRooted()
        {
            boolean flag;
            boolean flag3 = false;
            String s = Build.TAGS;
            boolean flag1;
            boolean flag2;
            if (s != null && s.contains("test-keys"))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            try
            {
                flag2 = (new File("/system/app/Superuser.apk")).exists();
            }
            catch (Exception exception)
            {
                flag2 = false;
            }
            s = (new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[] {
                "/system/xbin/which", "su"
            }).getInputStream()))).readLine();
            if (s != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
_L2:
label0:
            {
                if (!flag1 && !flag2)
                {
                    flag2 = flag3;
                    if (!flag)
                    {
                        break label0;
                    }
                }
                flag2 = true;
            }
            return Boolean.toString(flag2);
            Exception exception1;
            exception1;
            flag = false;
            if (true) goto _L2; else goto _L1
_L1:
        }

        Meta(Context context, String s)
        {
            this$0 = AnalyticsRequest.this;
            super();
            String s1 = context.getPackageName();
            PackageManager packagemanager = context.getPackageManager();
            try
            {
                analyticsrequest = packagemanager.getApplicationInfo(s1, 0);
            }
            // Misplaced declaration of an exception variable
            catch (AnalyticsRequest analyticsrequest)
            {
                analyticsrequest = null;
            }
            platform = "Android";
            platformVersion = Integer.toString(android.os.Build.VERSION.SDK_INT);
            sdkVersion = "1.4.0";
            merchantAppId = s1;
            merchantAppName = getAppName(AnalyticsRequest.this, packagemanager);
            merchantAppVersion = getAppVersion(packagemanager, s1);
            deviceRooted = isDeviceRooted();
            deviceManufacturer = Build.MANUFACTURER;
            deviceModel = Build.MODEL;
            deviceNetworkType = getNetworkType(context);
            androidId = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
            deviceAppGeneratedPersistentUuid = getUUID(context);
            isSimulator = detectEmulator();
            integrationType = s;
            userInterfaceOrientation = getUserOrientation(context);
        }
    }

}
