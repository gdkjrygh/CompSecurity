// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            PostAPI4Version, AdMarvelAdapterInstances, AdMarvelAdapter

class Version
{

    public static final String ADMARVEL_API_VERSION = "1.5";
    public static final String SDK_VERSION = "2.4.2.1";
    public static final String SDK_VERSION_DATE = "2013-12-13";

    Version()
    {
    }

    public static int getAndroidSDKVersion()
    {
        if (android.os.Build.VERSION.RELEASE.contains("1.5"))
        {
            return 3;
        } else
        {
            return PostAPI4Version.getAndroidOSVersion();
        }
    }

    static final String getSDKSupported()
    {
        Object obj1 = "";
        Object obj = obj1;
        try
        {
            if (AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarveladmobadapter.AdMarvelAdmobAdapter") != null)
            {
                obj = (new StringBuilder(String.valueOf(""))).append("_admob").toString();
            }
        }
        catch (Exception exception)
        {
            exception = ((Exception) (obj1));
        }
        obj1 = obj;
        try
        {
            if (AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter") != null)
            {
                obj1 = (new StringBuilder(String.valueOf(obj))).append("_rhythm").toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj1 = obj;
        }
        obj = obj1;
        try
        {
            if (AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter") != null)
            {
                obj = (new StringBuilder(String.valueOf(obj1))).append("_greystripe").toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = obj1;
        }
        obj1 = obj;
        try
        {
            if (AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelmedialetsadapter.AdMarvelMedialetsAdapter") != null)
            {
                obj1 = (new StringBuilder(String.valueOf(obj))).append("_medialets").toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj1 = obj;
        }
        obj = obj1;
        try
        {
            if (AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter") != null)
            {
                obj = (new StringBuilder(String.valueOf(obj1))).append("_millennial").toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = obj1;
        }
        obj1 = obj;
        try
        {
            if (AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter") != null)
            {
                obj1 = (new StringBuilder(String.valueOf(obj))).append("_amazon").toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj1 = obj;
        }
        obj = obj1;
        try
        {
            if (AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter") != null)
            {
                obj = (new StringBuilder(String.valueOf(obj1))).append("_adcolony").toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = obj1;
        }
        obj1 = obj;
        try
        {
            if (AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelpinsightadapter.AdMarvelPinsightAdapter") != null)
            {
                obj1 = (new StringBuilder(String.valueOf(obj))).append("_pinsight").toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj1 = obj;
        }
        obj = obj1;
        try
        {
            if (AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter") != null)
            {
                obj = (new StringBuilder(String.valueOf(obj1))).append("_pulse3d").toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return ((String) (obj1));
        }
        return ((String) (obj));
    }

    static final String getVersionDump()
    {
        Object obj1 = "";
        Object obj = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarveladmobadapter.AdMarvelAdmobAdapter");
        AdMarvelAdapter admarveladapter;
        if (obj != null)
        {
            try
            {
                obj1 = (new StringBuilder(String.valueOf(""))).append("admob: found, ").append(((AdMarvelAdapter) (obj)).getAdnetworkSDKVersionInfo()).append("\n").toString();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj1 = (new StringBuilder(String.valueOf(""))).append("admob: NOT found, admarvel-android-sdk-admob-adapter.jar NOT in classpath\n").toString();
            }
        }
        admarveladapter = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter");
        obj = obj1;
        if (admarveladapter != null)
        {
            try
            {
                obj = (new StringBuilder(String.valueOf(obj1))).append("rhythm: found, ").append(admarveladapter.getAdnetworkSDKVersionInfo()).append("\n").toString();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = (new StringBuilder(String.valueOf(obj1))).append("rhythm: NOT found, admarvel-android-sdk-rhythm-adapter.jar NOT in classpath\n").toString();
            }
        }
        admarveladapter = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter");
        obj1 = obj;
        if (admarveladapter != null)
        {
            try
            {
                obj1 = (new StringBuilder(String.valueOf(obj))).append("greystripe: found, ").append(admarveladapter.getAdnetworkSDKVersionInfo()).append("\n").toString();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                obj1 = (new StringBuilder(String.valueOf(obj))).append("greystripe: NOT found, admarvel-android-sdk-greystripe-adapter.jar NOT in classpath\n").toString();
            }
        }
        admarveladapter = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelmedialetsadapter.AdMarvelMedialetsAdapter");
        obj = obj1;
        if (admarveladapter != null)
        {
            try
            {
                obj = (new StringBuilder(String.valueOf(obj1))).append("medialets: found, ").append(admarveladapter.getAdnetworkSDKVersionInfo()).append("\n").toString();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = (new StringBuilder(String.valueOf(obj1))).append("medialets: NOT found, admarvel-android-sdk-medialets-adapter.jar NOT in classpath\n").toString();
            }
        }
        admarveladapter = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter");
        obj1 = obj;
        if (admarveladapter != null)
        {
            try
            {
                obj1 = (new StringBuilder(String.valueOf(obj))).append("millennial: found, ").append(admarveladapter.getAdnetworkSDKVersionInfo()).append("\n").toString();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                obj1 = (new StringBuilder(String.valueOf(obj))).append("millennial: NOT found, admarvel-android-sdk-millennial-adapter.jar NOT in classpath\n").toString();
            }
        }
        admarveladapter = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter");
        obj = obj1;
        if (admarveladapter != null)
        {
            try
            {
                obj = (new StringBuilder(String.valueOf(obj1))).append("amazon: found, ").append(admarveladapter.getAdnetworkSDKVersionInfo()).append("\n").toString();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = (new StringBuilder(String.valueOf(obj1))).append("amazon: NOT found, admarvel-android-sdk-amazon-adapter.jar NOT in classpath\n").toString();
            }
        }
        admarveladapter = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter");
        obj1 = obj;
        if (admarveladapter != null)
        {
            try
            {
                obj1 = (new StringBuilder(String.valueOf(obj))).append("adcolony: found, ").append(admarveladapter.getAdnetworkSDKVersionInfo()).append("\n").toString();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                obj1 = (new StringBuilder(String.valueOf(obj))).append("adcolony: NOT found, admarvel-android-sdk-adcolony-adapter.jar NOT in classpath\n").toString();
            }
        }
        admarveladapter = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelpinsightadapter.AdMarvelPinsightAdapter");
        obj = obj1;
        if (admarveladapter != null)
        {
            try
            {
                obj = (new StringBuilder(String.valueOf(obj1))).append("pinsight: found, ").append(admarveladapter.getAdnetworkSDKVersionInfo()).append("\n").toString();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = (new StringBuilder(String.valueOf(obj1))).append("pinsight: NOT found, admarvel-android-sdk-adcolony-adapter.jar NOT in classpath\n").toString();
            }
        }
        try
        {
            admarveladapter = AdMarvelAdapterInstances.getInstance("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter");
        }
        catch (Exception exception)
        {
            return (new StringBuilder(String.valueOf(obj))).append("pulse3d: NOT found, admarvel-android-sdk-admob-adapter.jar NOT in classpath\n").toString();
        }
        obj1 = obj;
        if (admarveladapter == null)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        obj1 = (new StringBuilder(String.valueOf(obj))).append("pulse3d: found, ").append(admarveladapter.getAdnetworkSDKVersionInfo()).append("\n").toString();
        return ((String) (obj1));
    }
}
