// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.Window;
import android.view.WindowManager;
import com.netflix.mediaclient.Log;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient.util:
//            PreferenceUtils, AndroidManifestUtils

public final class DeviceUtils
{

    public static final int SCREEN_SIZE_LARGE = 3;
    public static final int SCREEN_SIZE_NORMAL = 2;
    public static final int SCREEN_SIZE_SMALL = 1;
    public static final int SCREEN_SIZE_XLARGE = 4;
    private static final String TAG = "nf_device_utils";
    private static AtomicBoolean sFirstStartAfterInstall;

    private DeviceUtils()
    {
    }

    public static int getBasicScreenOrientation(Context context)
    {
        return context.getResources().getConfiguration().orientation;
    }

    public static String getCertificationVersion(Context context)
    {
        String s = getSoftwareVersion(context).trim();
        if (Log.isLoggable("nf_device_utils", 3))
        {
            Log.d("nf_device_utils", (new StringBuilder()).append("SV: ").append(s).toString());
        }
        int i = s.indexOf(" ");
        context = s;
        if (i > 0)
        {
            context = s.substring(0, i);
        }
        if (Log.isLoggable("nf_device_utils", 3))
        {
            Log.d("nf_device_utils", (new StringBuilder()).append("CV: ").append(context).toString());
        }
        return context;
    }

    public static long getFirstStartTime(Context context)
    {
        long l1 = -1L;
        com/netflix/mediaclient/util/DeviceUtils;
        JVM INSTR monitorenter ;
        long l = l1;
        if (sFirstStartAfterInstall == null) goto _L2; else goto _L1
_L1:
        boolean flag = sFirstStartAfterInstall.get();
        if (!flag) goto _L4; else goto _L3
_L3:
        l = l1;
_L2:
        com/netflix/mediaclient/util/DeviceUtils;
        JVM INSTR monitorexit ;
        return l;
_L4:
        l = PreferenceUtils.getLongPref(context, "nf_first_start_after_install", -1L);
        if (true) goto _L2; else goto _L5
_L5:
        context;
        throw context;
    }

    public static int getScreenHeightInPixels(Context context)
    {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static String getScreenResolutionCategoryString(Activity activity)
    {
        switch (getScreenResolutionDpi(activity))
        {
        default:
            return "unknown";

        case 240: 
            return "hdpi";

        case 120: // 'x'
            return "ldpi";

        case 160: 
            return "mdpi";

        case 213: 
            return "tvdpi";

        case 320: 
            return "xhdpi";

        case 480: 
            return "xxhdpi";

        case 640: 
            return "xxxhdpi";
        }
    }

    public static int getScreenResolutionDpi(Activity activity)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics.densityDpi;
    }

    public static int getScreenSensorOrientation(Context context)
    {
        return !isLandscape(context) ? 7 : 6;
    }

    public static int getScreenSizeCategory(Context context)
    {
        return context.getResources().getConfiguration().screenLayout & 0xf;
    }

    public static String getScreenSizeCategoryString(Context context)
    {
        switch (getScreenSizeCategory(context))
        {
        default:
            return "unknown";

        case 1: // '\001'
            return "small";

        case 2: // '\002'
            return "normal";

        case 3: // '\003'
            return "large";

        case 4: // '\004'
            return "xlarge";

        case 0: // '\0'
            return "undefined";
        }
    }

    public static int getScreenWidthInPixels(Context context)
    {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static String getSoftwareVersion(Context context)
    {
        String s = AndroidManifestUtils.getVersionName(context);
        context = s;
        if (s == null)
        {
            context = "N/A";
        }
        return context;
    }

    public static boolean hasHardwareNavigationKeys()
    {
        boolean flag = KeyCharacterMap.deviceHasKey(4);
        boolean flag1 = KeyCharacterMap.deviceHasKey(3);
        return flag && flag1;
    }

    public static void hideSoftKeyboard(Activity activity)
    {
        activity.getWindow().setSoftInputMode(2);
    }

    public static boolean isFirstApplicationStartAfterInstallation(Context context)
    {
        if (sFirstStartAfterInstall != null) goto _L2; else goto _L1
_L1:
        com/netflix/mediaclient/util/DeviceUtils;
        JVM INSTR monitorenter ;
        if (sFirstStartAfterInstall != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        boolean flag;
        if (PreferenceUtils.getLongPref(context, "nf_first_start_after_install", -1L) < 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        sFirstStartAfterInstall = new AtomicBoolean(flag);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        PreferenceUtils.putLongPref(context, "nf_first_start_after_install", System.currentTimeMillis());
        com/netflix/mediaclient/util/DeviceUtils;
        JVM INSTR monitorexit ;
_L2:
        return sFirstStartAfterInstall.get();
        context;
        com/netflix/mediaclient/util/DeviceUtils;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static boolean isLandscape(Context context)
    {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean isNotTabletByContext(Context context)
    {
        return !isTabletByContext(context);
    }

    public static boolean isPortrait(Context context)
    {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public static boolean isTabletByContext(Context context)
    {
        if (context == null)
        {
            Log.e("nf_device_utils", "AndroidUtils#isTabletByContext:: context is null!");
            return false;
        }
        context = context.getResources();
        if (context == null)
        {
            Log.e("nf_device_utils", "AndroidUtils#isTabletByContext:: context.getResources() is null!");
            return false;
        }
        context = context.getConfiguration();
        if (context == null)
        {
            Log.e("nf_device_utils", "AndroidUtils#isTabletByContext:: context.getResources().getConfiguration() is null!");
            return false;
        }
        int i = ((Configuration) (context)).screenLayout & 0xf;
        if (Log.isLoggable("nf_device_utils", 3))
        {
            Log.d("nf_device_utils", (new StringBuilder()).append("Screen size: ").append(i).toString());
        }
        switch (i)
        {
        default:
            Log.d("nf_device_utils", "Screen size is at least XL - tablet UI");
            return true;

        case 0: // '\0'
            Log.d("nf_device_utils", "Screen size undefined - mobile UI");
            return false;

        case 2: // '\002'
            Log.d("nf_device_utils", "Screen size normal - mobile UI");
            return false;

        case 1: // '\001'
            Log.d("nf_device_utils", "Screen size small - mobile UI");
            return false;

        case 3: // '\003'
            Log.d("nf_device_utils", "Screen size large - tablet UI");
            break;
        }
        return true;
    }

    public static void showSoftKeyboard(Activity activity)
    {
        activity.getWindow().setSoftInputMode(4);
    }
}
