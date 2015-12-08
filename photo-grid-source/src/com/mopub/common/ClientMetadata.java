// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DeviceUtils;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Utils;
import java.util.Locale;

public class ClientMetadata
{

    private static volatile ClientMetadata l;
    private String a;
    private final String b;
    private String c;
    private final String d;
    private final String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private boolean j;
    private boolean k;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final String q = "3.7.0";
    private final String r;
    private final String s;
    private String t;
    private final Context u;
    private final ConnectivityManager v;

    public ClientMetadata(Context context)
    {
        j = false;
        k = false;
        u = context.getApplicationContext();
        v = (ConnectivityManager)u.getSystemService("connectivity");
        m = Build.MANUFACTURER;
        n = Build.MODEL;
        o = Build.PRODUCT;
        p = android.os.Build.VERSION.RELEASE;
        r = a(u);
        PackageManager packagemanager = u.getPackageManager();
        s = context.getPackageName();
        try
        {
            context = packagemanager.getApplicationInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (context != null)
        {
            t = (String)packagemanager.getApplicationLabel(context);
        }
        context = (TelephonyManager)u.getSystemService("phone");
        a = context.getNetworkOperator();
        b = context.getNetworkOperator();
        if (context.getPhoneType() == 2 && context.getSimState() == 5)
        {
            a = context.getSimOperator();
            c = context.getSimOperator();
        }
        d = context.getNetworkCountryIso();
        e = context.getSimCountryIso();
        try
        {
            f = context.getNetworkOperatorName();
            if (context.getSimState() == 5)
            {
                g = context.getSimOperatorName();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            f = null;
            g = null;
        }
        context = android.provider.Settings.Secure.getString(u.getContentResolver(), "android_id");
        if (context == null)
        {
            context = "";
        } else
        {
            context = Utils.sha1(context);
        }
        h = (new StringBuilder("sha:")).append(context).toString();
    }

    private static String a(Context context)
    {
        try
        {
            String s1 = context.getPackageName();
            context = context.getPackageManager().getPackageInfo(s1, 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MoPubLog.d("Failed to retrieve PackageInfo#versionName.");
            return null;
        }
        return context;
    }

    public static void clearForTesting()
    {
        l = null;
    }

    public static ClientMetadata getInstance()
    {
        Object obj;
        obj = l;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        com/mopub/common/ClientMetadata;
        JVM INSTR monitorenter ;
        obj = l;
        com/mopub/common/ClientMetadata;
        JVM INSTR monitorexit ;
        return ((ClientMetadata) (obj));
        obj;
        com/mopub/common/ClientMetadata;
        JVM INSTR monitorexit ;
        throw obj;
        return ((ClientMetadata) (obj));
    }

    public static ClientMetadata getInstance(Context context)
    {
        ClientMetadata clientmetadata;
        clientmetadata = l;
        if (clientmetadata != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        com/mopub/common/ClientMetadata;
        JVM INSTR monitorenter ;
        ClientMetadata clientmetadata1 = l;
        clientmetadata = clientmetadata1;
        if (clientmetadata1 != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        clientmetadata = new ClientMetadata(context);
        l = clientmetadata;
        com/mopub/common/ClientMetadata;
        JVM INSTR monitorexit ;
        return clientmetadata;
        context;
        com/mopub/common/ClientMetadata;
        JVM INSTR monitorexit ;
        throw context;
        return clientmetadata;
    }

    public static void setInstance(ClientMetadata clientmetadata)
    {
        com/mopub/common/ClientMetadata;
        JVM INSTR monitorenter ;
        l = clientmetadata;
        com/mopub/common/ClientMetadata;
        JVM INSTR monitorexit ;
        return;
        clientmetadata;
        com/mopub/common/ClientMetadata;
        JVM INSTR monitorexit ;
        throw clientmetadata;
    }

    public MoPubNetworkType getActiveNetworkType()
    {
        byte byte0 = -1;
        int i1 = byte0;
        if (u.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)
        {
            NetworkInfo networkinfo = v.getActiveNetworkInfo();
            i1 = byte0;
            if (networkinfo != null)
            {
                i1 = networkinfo.getType();
            }
        }
        return MoPubNetworkType.a(i1);
    }

    public String getAppName()
    {
        return t;
    }

    public String getAppPackageName()
    {
        return s;
    }

    public String getAppVersion()
    {
        return r;
    }

    public float getDensity()
    {
        return u.getResources().getDisplayMetrics().density;
    }

    public Point getDeviceDimensions()
    {
        if (Preconditions.NoThrow.checkNotNull(u))
        {
            return DeviceUtils.getDeviceDimensions(u);
        } else
        {
            return new Point(0, 0);
        }
    }

    public String getDeviceId()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = h;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public Locale getDeviceLocale()
    {
        return u.getResources().getConfiguration().locale;
    }

    public String getDeviceManufacturer()
    {
        return m;
    }

    public String getDeviceModel()
    {
        return n;
    }

    public String getDeviceOsVersion()
    {
        return p;
    }

    public String getDeviceProduct()
    {
        return o;
    }

    public int getDeviceScreenHeightDip()
    {
        return Dips.screenHeightAsIntDips(u);
    }

    public int getDeviceScreenWidthDip()
    {
        return Dips.screenWidthAsIntDips(u);
    }

    public String getIsoCountryCode()
    {
        return d;
    }

    public String getNetworkOperator()
    {
        return b;
    }

    public String getNetworkOperatorForUrl()
    {
        return a;
    }

    public String getNetworkOperatorName()
    {
        return f;
    }

    public String getOrientationString()
    {
        int i1 = u.getResources().getConfiguration().orientation;
        String s1 = "u";
        if (i1 == 1)
        {
            s1 = "p";
        } else
        {
            if (i1 == 2)
            {
                return "l";
            }
            if (i1 == 3)
            {
                return "s";
            }
        }
        return s1;
    }

    public String getSdkVersion()
    {
        return q;
    }

    public String getSimIsoCountryCode()
    {
        return e;
    }

    public String getSimOperator()
    {
        return c;
    }

    public String getSimOperatorName()
    {
        return g;
    }

    public boolean isAdvertisingInfoSet()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = k;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isDoNotTrackSet()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = j;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void setAdvertisingInfo(String s1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        h = (new StringBuilder("ifa:")).append(s1).toString();
        j = flag;
        k = true;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public void setUdidBySelf(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        i = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    private class MoPubNetworkType extends Enum
    {

        public static final MoPubNetworkType ETHERNET;
        public static final MoPubNetworkType MOBILE;
        public static final MoPubNetworkType UNKNOWN;
        public static final MoPubNetworkType WIFI;
        private static final MoPubNetworkType b[];
        private final int a;

        static MoPubNetworkType a(int i1)
        {
            switch (i1)
            {
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            default:
                return UNKNOWN;

            case 9: // '\t'
                return ETHERNET;

            case 1: // '\001'
                return WIFI;

            case 0: // '\0'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                return MOBILE;
            }
        }

        public static MoPubNetworkType valueOf(String s1)
        {
            return (MoPubNetworkType)Enum.valueOf(com/mopub/common/ClientMetadata$MoPubNetworkType, s1);
        }

        public static MoPubNetworkType[] values()
        {
            return (MoPubNetworkType[])b.clone();
        }

        public final int getId()
        {
            return a;
        }

        public final String toString()
        {
            return Integer.toString(a);
        }

        static 
        {
            UNKNOWN = new MoPubNetworkType("UNKNOWN", 0, 0);
            ETHERNET = new MoPubNetworkType("ETHERNET", 1, 1);
            WIFI = new MoPubNetworkType("WIFI", 2, 2);
            MOBILE = new MoPubNetworkType("MOBILE", 3, 3);
            b = (new MoPubNetworkType[] {
                UNKNOWN, ETHERNET, WIFI, MOBILE
            });
        }

        private MoPubNetworkType(String s1, int i1, int j1)
        {
            super(s1, i1);
            a = j1;
        }
    }

}
