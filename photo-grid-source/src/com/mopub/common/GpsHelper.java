// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.mopub.common.factories.MethodBuilderFactory;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import com.mopub.common.util.Reflection;

// Referenced classes of package com.mopub.common:
//            j, ClientMetadata, SharedPreferencesHelper

public class GpsHelper
{

    public static final String ADVERTISING_ID_KEY = "advertisingId";
    public static final int GOOGLE_PLAY_SUCCESS_CODE = 0;
    public static final String IS_LIMIT_AD_TRACKING_ENABLED_KEY = "isLimitAdTrackingEnabled";
    private static String a = "com.google.android.gms.common.GooglePlayServicesUtil";
    private static String b = "com.google.android.gms.ads.identifier.AdvertisingIdClient";

    public GpsHelper()
    {
    }

    static String a()
    {
        return b;
    }

    private static String a(Object obj)
    {
        try
        {
            obj = (String)MethodBuilderFactory.create(obj, "getId").execute();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        return ((String) (obj));
    }

    private static void a(Context context, GpsHelperListener gpshelperlistener)
    {
        if (!Reflection.classFound(b))
        {
            if (gpshelperlistener != null)
            {
                gpshelperlistener.onFetchAdInfoCompleted();
            }
        } else
        {
            try
            {
                AsyncTasks.safeExecuteOnExecutor(new j(context, gpshelperlistener), new Void[0]);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                MoPubLog.d("Error executing FetchAdvertisingInfoTask", context);
            }
            if (gpshelperlistener != null)
            {
                gpshelperlistener.onFetchAdInfoCompleted();
                return;
            }
        }
    }

    static void a(Context context, Object obj)
    {
        String s = a(obj);
        boolean flag = b(obj);
        ClientMetadata.getInstance(context).setAdvertisingInfo(s, flag);
    }

    private static boolean b(Object obj)
    {
        boolean flag;
        try
        {
            obj = (Boolean)MethodBuilderFactory.create(obj, "isLimitAdTrackingEnabled").execute();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        flag = ((Boolean) (obj)).booleanValue();
        return flag;
        return false;
    }

    public static void fetchAdvertisingInfoAsync(Context context, GpsHelperListener gpshelperlistener)
    {
        boolean flag = isPlayServicesAvailable(context);
        if (flag && !ClientMetadata.getInstance(context).isAdvertisingInfoSet())
        {
            a(context, gpshelperlistener);
        } else
        {
            if (gpshelperlistener != null)
            {
                gpshelperlistener.onFetchAdInfoCompleted();
            }
            if (flag)
            {
                a(context, ((GpsHelperListener) (null)));
                return;
            }
        }
    }

    public static AdvertisingInfo fetchAdvertisingInfoSync(Context context)
    {
        if (context == null)
        {
            return null;
        }
        try
        {
            context = ((Context) (MethodBuilderFactory.create(null, "getAdvertisingIdInfo").setStatic(Class.forName(b)).addParam(android/content/Context, context).execute()));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MoPubLog.d("Unable to obtain Google AdvertisingIdClient.Info via reflection.");
            return null;
        }
        return new AdvertisingInfo(a(context), b(context));
    }

    public static boolean isLimitAdTrackingEnabled(Context context)
    {
        boolean flag = false;
        if (isPlayServicesAvailable(context))
        {
            flag = SharedPreferencesHelper.getSharedPreferences(context).getBoolean("isLimitAdTrackingEnabled", false);
        }
        return flag;
    }

    public static boolean isPlayServicesAvailable(Context context)
    {
        int i;
        try
        {
            context = ((Context) (MethodBuilderFactory.create(null, "isGooglePlayServicesAvailable").setStatic(Class.forName(a)).addParam(android/content/Context, context).execute()));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        i = ((Integer)context).intValue();
        if (i == 0)
        {
            return true;
        }
        return false;
    }

    public static void setClassNamesForTesting()
    {
        a = "java.lang.Class";
        b = "java.lang.Class";
    }


    private class GpsHelperListener
    {

        public abstract void onFetchAdInfoCompleted();
    }


    private class AdvertisingInfo
    {

        public final String advertisingId;
        public final boolean limitAdTracking;

        public AdvertisingInfo(String s, boolean flag)
        {
            advertisingId = s;
            limitAdTracking = flag;
        }
    }

}
