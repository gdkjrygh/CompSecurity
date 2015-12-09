// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.htc.lib2.opensense.internal.SystemWrapper;
import java.util.Iterator;
import java.util.Set;

public class Hms
{
    public static class CompatibilityException extends Exception
    {

        private static final long serialVersionUID = 0xc785cd71efbff073L;
        private String mErrorMessage;

        public String getErrorMessage()
        {
            return mErrorMessage;
        }

        public CompatibilityException()
        {
            mErrorMessage = "";
        }

        public CompatibilityException(String s)
        {
            super(s);
            mErrorMessage = "";
            if (s != null)
            {
                mErrorMessage = s;
            }
        }
    }

    public static final class CompatibilityStatus extends Enum
    {

        private static final CompatibilityStatus $VALUES[];
        public static final CompatibilityStatus COMPATIBLE;
        public static final CompatibilityStatus ERROR_HSP_NOT_ENABLED;
        public static final CompatibilityStatus ERROR_HSP_NOT_INSTALLED;
        public static final CompatibilityStatus ERROR_HSP_NOT_SUPPORTED;
        public static final CompatibilityStatus ERROR_UNKNOWN;
        public static final CompatibilityStatus HMS_APP_UPDATE_REQUIRED;
        public static final CompatibilityStatus HSP_UPDATE_REQUIRED;

        public static CompatibilityStatus valueOf(String s)
        {
            return (CompatibilityStatus)Enum.valueOf(com/htc/lib2/Hms$CompatibilityStatus, s);
        }

        public static CompatibilityStatus[] values()
        {
            return (CompatibilityStatus[])$VALUES.clone();
        }

        static 
        {
            ERROR_UNKNOWN = new CompatibilityStatus("ERROR_UNKNOWN", 0);
            ERROR_HSP_NOT_SUPPORTED = new CompatibilityStatus("ERROR_HSP_NOT_SUPPORTED", 1);
            ERROR_HSP_NOT_INSTALLED = new CompatibilityStatus("ERROR_HSP_NOT_INSTALLED", 2);
            ERROR_HSP_NOT_ENABLED = new CompatibilityStatus("ERROR_HSP_NOT_ENABLED", 3);
            HMS_APP_UPDATE_REQUIRED = new CompatibilityStatus("HMS_APP_UPDATE_REQUIRED", 4);
            HSP_UPDATE_REQUIRED = new CompatibilityStatus("HSP_UPDATE_REQUIRED", 5);
            COMPATIBLE = new CompatibilityStatus("COMPATIBLE", 6);
            $VALUES = (new CompatibilityStatus[] {
                ERROR_UNKNOWN, ERROR_HSP_NOT_SUPPORTED, ERROR_HSP_NOT_INSTALLED, ERROR_HSP_NOT_ENABLED, HMS_APP_UPDATE_REQUIRED, HSP_UPDATE_REQUIRED, COMPATIBLE
            });
        }

        private CompatibilityStatus(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String BUNDLE_KEY_INCLUDE_GOOGLE_PLAY_EDITION = "include_google_play_edition";
    private static final String FEATURE_GOOGLE_PLAY_EDITION = "com.google.android.feature.GOOGLE_EXPERIENCE";
    private static final String HSP_PACKAGE_NAME = SystemWrapper.getHspPackageName();
    private static final String LOG_TAG = com/htc/lib2/Hms.getSimpleName();
    private static final int MINIMUM_VERSION_DIGIT = 3;
    private static float sHdkBaseVersion = 0.0F;
    private static boolean sIsHtcDevice = false;
    private static boolean sIsValidApiLevel = false;
    private static float sSenseVersion = 0.0F;

    private Hms()
    {
    }

    public static CompatibilityStatus checkCompatibility(Context context)
        throws IllegalArgumentException, CompatibilityException
    {
        return checkCompatibility(context, null);
    }

    public static CompatibilityStatus checkCompatibility(Context context, Bundle bundle)
        throws IllegalArgumentException, CompatibilityException
    {
        Context context1;
        Object obj1;
        context1 = null;
        if (context == null)
        {
            throw new IllegalArgumentException("context == null");
        }
        context = context.getApplicationContext();
        obj1 = context.getPackageManager();
        if (SystemWrapper.getIgnoreHdkSupportCheck() || sHdkBaseVersion > 0.0F && sSenseVersion >= 6F) goto _L2; else goto _L1
_L1:
        boolean flag;
        flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("include_google_play_edition");
        }
        if (flag && sIsHtcDevice && sIsValidApiLevel && ((PackageManager) (obj1)).hasSystemFeature("com.google.android.feature.GOOGLE_EXPERIENCE")) goto _L2; else goto _L3
_L3:
        context = CompatibilityStatus.ERROR_HSP_NOT_SUPPORTED;
_L6:
        return context;
_L2:
        Object obj;
        int i;
        try
        {
            i = ((PackageManager) (obj1)).getApplicationEnabledSetting(HSP_PACKAGE_NAME);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return CompatibilityStatus.ERROR_HSP_NOT_INSTALLED;
        }
        if (i == 2 || i == 3)
        {
            return CompatibilityStatus.ERROR_HSP_NOT_ENABLED;
        }
        obj = CompatibilityStatus.ERROR_UNKNOWN;
        bundle = ((PackageManager) (obj1)).getApplicationInfo(HSP_PACKAGE_NAME, 128);
        obj1 = ((PackageManager) (obj1)).getApplicationInfo(context.getPackageName(), 128);
        context = ((ApplicationInfo) (bundle)).metaData;
        bundle = ((ApplicationInfo) (obj1)).metaData;
        context1 = context;
_L5:
        if (context1 == null || context1.isEmpty())
        {
            return CompatibilityStatus.HSP_UPDATE_REQUIRED;
        }
        break; /* Loop/switch isn't completed */
        context;
        context = null;
_L7:
        bundle = context1;
        context1 = context;
        if (true) goto _L5; else goto _L4
_L4:
label0:
        {
            if (bundle == null || bundle.isEmpty())
            {
                Log.e(LOG_TAG, "You should add \"manifestmerger.enabled=true\" in your project.properties.");
                throw new CompatibilityException("hdkMetaData == null || hdkMetaData.isEmpty()");
            }
            String s = SystemWrapper.getHdkApiPrefix();
            String s1 = SystemWrapper.getHspApiPrefix();
            Iterator iterator = bundle.keySet().iterator();
            context = ((Context) (obj));
            String s2;
            String s3;
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    obj = (String)iterator.next();
                } while (!((String) (obj)).startsWith(s));
                context = (new StringBuilder()).append(s1).append(((String) (obj)).substring(s.length())).toString();
                if (!context1.containsKey(context))
                {
                    return CompatibilityStatus.HSP_UPDATE_REQUIRED;
                }
                s2 = bundle.getString(((String) (obj)));
                s3 = context1.getString(context);
                obj = compareVersion(getIntArrayFromString(s2), getIntArrayFromString(s3));
                context = ((Context) (obj));
            } while (obj == CompatibilityStatus.COMPATIBLE);
            context = ((Context) (obj));
            if (obj == CompatibilityStatus.ERROR_UNKNOWN)
            {
                throw new CompatibilityException((new StringBuilder()).append("Unknown error. hdkVer: ").append(s2).append(", hspVer: ").append(s3).toString());
            }
        }
          goto _L6
        if (context == CompatibilityStatus.ERROR_UNKNOWN)
        {
            throw new CompatibilityException("Unknown error.");
        } else
        {
            return context;
        }
        bundle;
          goto _L7
    }

    private static CompatibilityStatus compareVersion(int ai[], int ai1[])
    {
        if (ai == null)
        {
            return CompatibilityStatus.HMS_APP_UPDATE_REQUIRED;
        }
        if (ai1 == null)
        {
            return CompatibilityStatus.HSP_UPDATE_REQUIRED;
        }
        int k = ai.length;
        int i = ai1.length;
        if (k < 3)
        {
            return CompatibilityStatus.HMS_APP_UPDATE_REQUIRED;
        }
        if (i < 3)
        {
            return CompatibilityStatus.HSP_UPDATE_REQUIRED;
        }
        if (k < i)
        {
            return CompatibilityStatus.HMS_APP_UPDATE_REQUIRED;
        }
        if (k > i)
        {
            return CompatibilityStatus.HSP_UPDATE_REQUIRED;
        }
        for (int j = 0; j < k; j++)
        {
            if (j >= 2)
            {
                return CompatibilityStatus.COMPATIBLE;
            }
            if (ai[j] < ai1[j] && j == 0)
            {
                return CompatibilityStatus.HMS_APP_UPDATE_REQUIRED;
            }
            if (ai[j] > ai1[j])
            {
                return CompatibilityStatus.HSP_UPDATE_REQUIRED;
            }
        }

        return CompatibilityStatus.ERROR_UNKNOWN;
    }

    private static float getFloat(String s)
    {
        float f;
        try
        {
            f = Float.parseFloat(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0.0F;
        }
        return f;
    }

    public static String getHspPackageName()
    {
        return HSP_PACKAGE_NAME;
    }

    private static int getInt(String s)
    {
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0;
        }
        return i;
    }

    private static int[] getIntArrayFromString(String s)
    {
        int ai[] = new int[3];
        if (TextUtils.isEmpty(s))
        {
            return ai;
        }
        s = s.split("\\.");
        int i = 0;
label0:
        do
        {
label1:
            {
                int j = i;
                if (i < s.length)
                {
                    if (i < ai.length)
                    {
                        break label1;
                    }
                }
                for (j = i; j < ai.length; j++)
                {
                    ai[j] = 0;
                }

                break label0;
            }
            ai[i] = getInt(s[i]);
            i++;
        } while (true);
        return ai;
    }

    private static float getSenseVersion()
    {
        float f1 = 0.0F;
        Object obj = new com.htc.lib2.opensense.internal.SystemWrapper.HtcCustomizationManager();
        float f = f1;
        if (obj != null)
        {
            obj = ((com.htc.lib2.opensense.internal.SystemWrapper.HtcCustomizationManager) (obj)).getCustomizationReader("system", 1, false);
            f = f1;
            if (obj != null)
            {
                f = getFloat(((com.htc.lib2.opensense.internal.SystemWrapper.HtcCustomizationReader) (obj)).readString("sense_version", "0.0"));
            }
        }
        return f;
    }

    private static boolean isHtcDevice()
    {
        return Build.BRAND.toLowerCase().equals("htc");
    }

    private static boolean isValidApiLevel()
    {
        return android.os.Build.VERSION.SDK_INT >= 19;
    }

    static 
    {
        sIsHtcDevice = isHtcDevice();
        sIsValidApiLevel = isValidApiLevel();
        sHdkBaseVersion = com.htc.lib2.opensense.internal.SystemWrapper.Build.getHDKBaseVersion();
        sSenseVersion = getSenseVersion();
    }
}
