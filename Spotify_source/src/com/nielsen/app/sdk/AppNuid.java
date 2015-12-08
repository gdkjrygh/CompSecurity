// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public class AppNuid extends Thread
{

    private static final String b = (new StringBuilder("aa.")).append(Integer.toString(1)).append(".").append(Integer.toString(1)).append(".").append(Integer.toString(0)).toString();
    private static final String c = (new StringBuilder("aa.")).append(Integer.toString(1)).append(".").append(Integer.toString(1)).append(".").append(Integer.toString(0)).append(".").append(Integer.toString(4)).toString();
    protected static final byte mBuild = 4;
    protected static final byte mDrop = 0;
    protected static final byte mMajor = 1;
    protected static final byte mMinor = 1;
    protected static final String mPlatform = "aa";
    public final String TAG;
    String a;
    private final String d;
    private final String e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private int l;
    private String m;
    protected Context mContext;
    public Object mSync;
    private String n;
    private boolean o;
    private String p;

    public AppNuid(Context context)
    {
        TAG = "AppNuid";
        mContext = null;
        d = "nol_nuid";
        e = "nol_deviceId";
        f = -1;
        g = 0;
        h = 1;
        i = 2;
        j = 3;
        k = 4;
        l = -1;
        mSync = new Object();
        m = "";
        a = "";
        n = "";
        o = false;
        p = "";
        mContext = context;
        getNuid();
        int i1 = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mContext);
        if (i1 != 0)
        {
            if (GooglePlayServicesUtil.isUserRecoverableError(i1))
            {
                synchronized (mSync)
                {
                    l = 2;
                }
            } else
            {
                synchronized (mSync)
                {
                    l = 1;
                }
            }
            m = android.provider.Settings.Secure.getString(mContext.getContentResolver(), "android_id");
            if (m != null)
            {
                m = m.toUpperCase(Locale.US);
            }
            return;
        } else
        {
            start();
            return;
        }
        exception;
        context;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        context;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    private String a()
    {
        if (p == null || p.isEmpty())
        {
            p = b();
            if (p == null || p.isEmpty())
            {
                p = c();
                if (p == null || p.isEmpty())
                {
                    return "";
                }
            }
            p = p.toUpperCase(Locale.US);
        }
        return p;
    }

    private String a(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (int i1 = 0; i1 < abyte0.length; i1++)
        {
            String s = Integer.toHexString(abyte0[i1] & 0xff);
            if (s.length() == 1)
            {
                stringbuffer.append('0');
            }
            stringbuffer.append(s);
        }

        return stringbuffer.toString();
    }

    private String b()
    {
        String s = android.provider.Settings.Secure.getString(mContext.getContentResolver(), "android_id");
        if (s != null) goto _L2; else goto _L1
_L1:
        String s1 = null;
_L4:
        return s1;
_L2:
        s = s.replaceAll("[^0-9A-Fa-f]", "");
        int i1 = s.length();
        do
        {
            s1 = s;
            if (i1 >= 16)
            {
                continue;
            }
            s = (new StringBuilder("0")).append(s).toString();
            i1 = s.length();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private String c()
    {
        String s = Build.SERIAL.replaceAll("[^0-9A-Fa-f]", "");
        for (int i1 = s.length(); i1 != 16; i1 = s.length())
        {
            s = (new StringBuilder("0")).append(s).toString();
        }

        return s;
    }

    public static String getBuildVersion()
    {
        return c;
    }

    public static String getDropVersion()
    {
        return b;
    }

    protected String generateHash(String s, String s1)
    {
        try
        {
            s = MessageDigest.getInstance(s);
            s.update(s1.getBytes());
            s = a(s.digest());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }

    public String getDeviceId()
    {
        return m;
    }

    public String getNielsenIds()
    {
        if (a.equals("") && n != null && !n.isEmpty() && m != null && !m.isEmpty())
        {
            a = String.format("{\"%s\":\"%s\",\"%s\":\"%s\"}", new Object[] {
                "nol_nuid", n, "nol_deviceId", m
            });
        }
        return a;
    }

    public String getNuid()
    {
label0:
        {
            if (n == null || n.isEmpty())
            {
                n = generateHash("MD5", a());
                if (n.length() != 32)
                {
                    break label0;
                }
                n = n.toUpperCase(Locale.US);
                String s = n.substring(0, 8);
                String s1 = n.substring(8, 12);
                String s2 = n.substring(12, 16);
                String s3 = n.substring(16, 20);
                String s4 = n.substring(20);
                n = (new StringBuilder()).append(s).append("-").append(s1).append("-").append(s2).append("-").append(s3).append("-").append(s4).toString();
            }
            return n;
        }
        return "0000000-0000-0000-0000-000000000000";
    }

    public boolean isReady()
    {
        Object obj = mSync;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (l != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected String isTrackingEnabled()
    {
        switch (l)
        {
        default:
            return "NOT_AVAILABLE";

        case 0: // '\0'
            break;
        }
        if (o)
        {
            return "ENABLED";
        } else
        {
            return "DISABLED";
        }
    }

    public void run()
    {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = AdvertisingIdClient.getAdvertisingIdInfo(mContext);
        synchronized (mSync)
        {
            m = info.getId();
            o = info.isLimitAdTrackingEnabled();
            l = 0;
        }
        if (m == null || m.isEmpty())
        {
            m = android.provider.Settings.Secure.getString(mContext.getContentResolver(), "android_id");
        }
        if (m == null || m.isEmpty())
        {
            m = "0000000-0000-0000-0000-000000000000";
        }
        m = m.toUpperCase(Locale.US);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj1;
        obj1;
        synchronized (mSync)
        {
            l = 4;
        }
        if (m == null || m.isEmpty())
        {
            m = android.provider.Settings.Secure.getString(mContext.getContentResolver(), "android_id");
        }
        if (m == null || m.isEmpty())
        {
            m = "0000000-0000-0000-0000-000000000000";
        }
        m = m.toUpperCase(Locale.US);
        return;
        exception1;
        obj2;
        JVM INSTR monitorexit ;
        throw exception1;
        obj2;
        if (m == null || m.isEmpty())
        {
            m = android.provider.Settings.Secure.getString(mContext.getContentResolver(), "android_id");
        }
        if (m == null || m.isEmpty())
        {
            m = "0000000-0000-0000-0000-000000000000";
        }
        m = m.toUpperCase(Locale.US);
        throw obj2;
        obj2;
        synchronized (mSync)
        {
            l = 2;
        }
        if (m == null || m.isEmpty())
        {
            m = android.provider.Settings.Secure.getString(mContext.getContentResolver(), "android_id");
        }
        if (m == null || m.isEmpty())
        {
            m = "0000000-0000-0000-0000-000000000000";
        }
        m = m.toUpperCase(Locale.US);
        return;
        exception2;
        obj3;
        JVM INSTR monitorexit ;
        throw exception2;
        obj3;
        synchronized (mSync)
        {
            l = 3;
        }
        if (m == null || m.isEmpty())
        {
            m = android.provider.Settings.Secure.getString(mContext.getContentResolver(), "android_id");
        }
        if (m == null || m.isEmpty())
        {
            m = "0000000-0000-0000-0000-000000000000";
        }
        m = m.toUpperCase(Locale.US);
        return;
        exception3;
        obj4;
        JVM INSTR monitorexit ;
        throw exception3;
        obj4;
        synchronized (mSync)
        {
            l = 1;
        }
        if (m == null || m.isEmpty())
        {
            m = android.provider.Settings.Secure.getString(mContext.getContentResolver(), "android_id");
        }
        if (m == null || m.isEmpty())
        {
            m = "0000000-0000-0000-0000-000000000000";
        }
        m = m.toUpperCase(Locale.US);
        return;
        exception4;
        obj5;
        JVM INSTR monitorexit ;
        throw exception4;
    }

}
