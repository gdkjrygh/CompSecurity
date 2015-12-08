// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.UUID;

// Referenced classes of package com.quantcast.measurement.service:
//            QuantcastClient, QCLog

class QCUtility
{

    public static final String API_VERSION = "1_2_1";
    private static final Object APPLICATION_ID_LOCK = new Object();
    private static final long HASH_CONSTANTS[] = {
        0xffffffff811c9dc5L, 0xffffffffc9dc5118L
    };
    private static final String HTTPS_SCHEME = "https://";
    private static final String HTTP_SCHEME = "http://";
    private static final String INSTALL_ID_PREF_NAME = "applicationId";
    private static final String SHARED_PREFERENCES_NAME = "com.quantcast.measurement.service";
    private static final QCLog.Tag TAG = new QCLog.Tag(com/quantcast/measurement/service/QCUtility);
    private static final String USER_AD_PREF_NAME = "adPref";

    QCUtility()
    {
    }

    protected static String addScheme(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s1;
        if (QuantcastClient.isUsingSecureConnections())
        {
            s1 = "https://";
        } else
        {
            s1 = "http://";
        }
        return stringbuilder.append(s1).append(s).toString();
    }

    static String applyHash(String s)
    {
        if (s == null)
        {
            return null;
        }
        double ad[] = new double[HASH_CONSTANTS.length];
        for (int i = 0; i < ad.length; i++)
        {
            ad[i] = applyUserHash(HASH_CONSTANTS[i], s);
        }

        double d = 1.0D;
        int k = ad.length;
        for (int j = 0; j < k; j++)
        {
            d *= ad[j];
        }

        return Long.toHexString(Math.round(Math.abs(d) / 65536D));
    }

    private static long applyUserHash(long l, String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            int j = (int)l ^ s.charAt(i);
            l = (long)j + ((long)(j << 1) + (long)(j << 4) + (long)(j << 7) + (long)(j << 8) + (long)(j << 24));
        }

        return l;
    }

    static String[] combineLabels(String as[], String as1[])
    {
        if (as1 == null)
        {
            return as;
        }
        if (as == null)
        {
            return as1;
        } else
        {
            as = new HashSet(Arrays.asList(as));
            as.addAll(Arrays.asList(as1));
            as1 = new String[as.size()];
            as.toArray(as1);
            return as1;
        }
    }

    protected static void dumpAppInstallID(Context context)
    {
        context = context.getSharedPreferences("com.quantcast.measurement.service", 0).edit();
        context.remove("applicationId");
        context.commit();
    }

    protected static String encodeStringArray(String as[])
    {
        if (as != null && as.length != 0) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
_L4:
        return ((String) (obj1));
_L2:
        Object obj;
        int i;
        int j;
        obj = null;
        j = as.length;
        i = 0;
_L5:
        obj1 = obj;
        if (i >= j) goto _L4; else goto _L3
_L3:
        String s;
        s = as[i];
        obj1 = obj;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj1 = URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
        if (obj != null)
        {
            try
            {
                obj1 = (new StringBuilder()).append(((String) (obj))).append(",").append(((String) (obj1))).toString();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                obj1 = obj;
            }
        }
        i++;
        obj = obj1;
          goto _L5
    }

    private static String generateAndSaveAppInstallId(SharedPreferences sharedpreferences)
    {
        Object obj = APPLICATION_ID_LOCK;
        obj;
        JVM INSTR monitorenter ;
        String s1 = sharedpreferences.getString("applicationId", null);
        String s;
        s = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        s = generateUniqueId();
        QCLog.i(TAG, (new StringBuilder()).append("Saving install id:").append(s).append(".").toString());
        sharedpreferences = sharedpreferences.edit();
        sharedpreferences.putString("applicationId", s);
        sharedpreferences.commit();
        obj;
        JVM INSTR monitorexit ;
        return s;
        sharedpreferences;
        obj;
        JVM INSTR monitorexit ;
        throw sharedpreferences;
    }

    protected static String generateUniqueId()
    {
        return UUID.randomUUID().toString();
    }

    protected static String getAPIKey(Context context)
    {
        Object obj = null;
        PackageManager packagemanager = context.getPackageManager();
        String s = obj;
        if (packagemanager == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        try
        {
            context = packagemanager.getApplicationInfo(context.getPackageName(), 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        s = obj;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        s = obj;
        if (((ApplicationInfo) (context)).metaData != null)
        {
            s = ((ApplicationInfo) (context)).metaData.getString("com.quantcast.apiKey");
        }
        return s;
    }

    protected static String getAppInstallId(Context context)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("com.quantcast.measurement.service", 0);
        String s = sharedpreferences.getString("applicationId", null);
        context = s;
        if (s == null)
        {
            context = generateAndSaveAppInstallId(sharedpreferences);
        }
        return context;
    }

    protected static String getAppName(Context context)
    {
        String s = "app";
        ApplicationInfo applicationinfo = context.getApplicationInfo();
        if (applicationinfo != null)
        {
            int i = applicationinfo.labelRes;
            try
            {
                s = context.getString(i);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                QCLog.i(TAG, (new StringBuilder()).append("AppName: Resource not found for ").append(i).toString());
                return "app";
            }
        }
        return s;
    }

    static boolean getUserAdPref(Context context)
    {
        return context.getSharedPreferences("com.quantcast.measurement.service", 0).getBoolean("adPref", false);
    }

    static void saveUserAdPref(Context context, boolean flag)
    {
        context = context.getSharedPreferences("com.quantcast.measurement.service", 0);
        QCLog.i(TAG, "Saving advertising preference");
        context = context.edit();
        context.putBoolean("adPref", flag);
        context.commit();
    }

}
