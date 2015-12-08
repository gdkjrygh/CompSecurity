// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.mopub.common.CreativeOrientation;
import com.mopub.common.logging.MoPubLog;
import java.io.File;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

// Referenced classes of package com.mopub.common.util:
//            Utils, VersionCode

public class DeviceUtils
{

    private DeviceUtils()
    {
    }

    private static int a(int i, int j)
    {
        byte byte0 = 9;
        if (1 == j)
        {
            j = byte0;
            switch (i)
            {
            default:
                j = 1;
                // fall through

            case 2: // '\002'
            case 3: // '\003'
                return j;
            }
        }
        if (2 == j)
        {
            switch (i)
            {
            default:
                return 0;

            case 2: // '\002'
            case 3: // '\003'
                return 8;
            }
        } else
        {
            MoPubLog.d("Unknown screen orientation. Defaulting to portrait.");
            return 9;
        }
    }

    public static long diskCacheSizeBytes(File file)
    {
        return diskCacheSizeBytes(file, 0x1e00000L);
    }

    public static long diskCacheSizeBytes(File file, long l)
    {
        long l1;
        file = new StatFs(file.getAbsolutePath());
        l1 = file.getBlockCount();
        l1 = ((long)file.getBlockSize() * l1) / 50L;
        l = l1;
_L2:
        return Math.max(Math.min(l, 0x6400000L), 0x1e00000L);
        file;
        MoPubLog.d("Unable to calculate 2% of available disk space, defaulting to minimum");
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static Point getDeviceDimensions(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 13) goto _L2; else goto _L1
_L1:
        Object obj1 = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        if (android.os.Build.VERSION.SDK_INT < 17) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = new Point();
        ((Display) (obj1)).getRealSize(((Point) (obj)));
        obj1 = Integer.valueOf(((Point) (obj)).x);
        obj = Integer.valueOf(((Point) (obj)).y);
_L7:
        Integer integer;
label0:
        {
            if (obj1 != null)
            {
                integer = ((Integer) (obj));
                if (obj != null)
                {
                    break label0;
                }
            }
            context = context.getResources().getDisplayMetrics();
            obj1 = Integer.valueOf(((DisplayMetrics) (context)).widthPixels);
            integer = Integer.valueOf(((DisplayMetrics) (context)).heightPixels);
        }
        return new Point(((Integer) (obj1)).intValue(), integer.intValue());
_L4:
        obj = (Integer)(new Reflection.MethodBuilder(obj1, "getRawWidth")).execute();
        Integer integer1 = (Integer)(new Reflection.MethodBuilder(obj1, "getRawHeight")).execute();
        obj1 = obj;
        obj = integer1;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        obj1 = null;
_L5:
        MoPubLog.v("Display#getRawWidth/Height failed.", exception);
        obj = null;
        continue; /* Loop/switch isn't completed */
        exception;
        obj1 = obj;
        if (true) goto _L5; else goto _L2
_L2:
        obj = null;
        obj1 = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static String getHashedUdid(Context context)
    {
        if (context == null)
        {
            return null;
        } else
        {
            return Utils.sha1(android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id"));
        }
    }

    public static String getIpAddress(IP ip)
    {
        Iterator iterator = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
_L2:
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_89;
        }
        iterator1 = Collections.list(((NetworkInterface)iterator.next()).getInetAddresses()).iterator();
_L4:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (InetAddress)iterator1.next();
        if (((InetAddress) (obj)).isLoopbackAddress()) goto _L4; else goto _L3
_L3:
        obj = ((InetAddress) (obj)).getHostAddress().toUpperCase(Locale.US);
        if (!IP.a(ip, ((String) (obj)))) goto _L4; else goto _L5
_L5:
        return IP.b(ip, ((String) (obj)));
        return null;
    }

    public static int getScreenOrientation(Activity activity)
    {
        return a(activity.getWindowManager().getDefaultDisplay().getRotation(), activity.getResources().getConfiguration().orientation);
    }

    public static boolean isNetworkAvailable(Context context)
    {
        if (context == null)
        {
            return false;
        }
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1)
        {
            return false;
        }
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == -1)
        {
            return true;
        }
        boolean flag;
        try
        {
            flag = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo().isConnected();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return flag;
    }

    public static void lockOrientation(Activity activity, CreativeOrientation creativeorientation)
    {
        if (com.mopub.common.Preconditions.NoThrow.checkNotNull(creativeorientation) && com.mopub.common.Preconditions.NoThrow.checkNotNull(activity)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        i = a(((WindowManager)activity.getSystemService("window")).getDefaultDisplay().getRotation(), activity.getResources().getConfiguration().orientation);
        if (CreativeOrientation.PORTRAIT != creativeorientation)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (9 == i)
        {
            i = 9;
        } else
        {
            i = 1;
        }
_L4:
        activity.setRequestedOrientation(i);
        return;
        if (CreativeOrientation.LANDSCAPE != creativeorientation) goto _L1; else goto _L3
_L3:
        if (8 == i)
        {
            i = 8;
        } else
        {
            i = 0;
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static int memoryCacheSizeBytes(Context context)
    {
        ActivityManager activitymanager;
        long l;
        long l1;
        activitymanager = (ActivityManager)context.getSystemService("activity");
        l = activitymanager.getMemoryClass();
        l1 = l;
        if (!VersionCode.currentApiLevel().isAtLeast(VersionCode.HONEYCOMB))
        {
            break MISSING_BLOCK_LABEL_87;
        }
        int i;
        i = android/content/pm/ApplicationInfo.getDeclaredField("FLAG_LARGE_HEAP").getInt(null);
        if (!Utils.bitMaskContainsFlag(context.getApplicationInfo().flags, i))
        {
            break MISSING_BLOCK_LABEL_84;
        }
        i = ((Integer)(new Reflection.MethodBuilder(activitymanager, "getLargeMemoryClass")).execute()).intValue();
        l = i;
        l1 = l;
_L2:
        return (int)Math.min(0x1e00000L, (l1 / 8L) * 1024L * 1024L);
        context;
        MoPubLog.d("Unable to reflectively determine large heap size on Honeycomb and above.");
        l1 = l;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private class IP extends Enum
    {

        public static final IP IPv4;
        public static final IP IPv6;
        private static final IP a[];

        static boolean a(IP ip, String s)
        {
            switch (a.a[ip.ordinal()])
            {
            default:
                return false;

            case 1: // '\001'
                return InetAddressUtils.isIPv4Address(s);

            case 2: // '\002'
                return InetAddressUtils.isIPv6Address(s);
            }
        }

        static String b(IP ip, String s)
        {
            String s1 = s;
            switch (a.a[ip.ordinal()])
            {
            default:
                s1 = null;
                // fall through

            case 1: // '\001'
                return s1;

            case 2: // '\002'
                return s.split("%")[0];
            }
        }

        public static IP valueOf(String s)
        {
            return (IP)Enum.valueOf(com/mopub/common/util/DeviceUtils$IP, s);
        }

        public static IP[] values()
        {
            return (IP[])a.clone();
        }

        static 
        {
            IPv4 = new IP("IPv4", 0);
            IPv6 = new IP("IPv6", 1);
            a = (new IP[] {
                IPv4, IPv6
            });
        }

        private IP(String s, int i)
        {
            super(s, i);
        }
    }

}
