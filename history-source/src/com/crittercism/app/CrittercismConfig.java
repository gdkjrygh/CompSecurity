// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import crittercism.android.dx;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public class CrittercismConfig
{

    public static final String API_VERSION = "5.0.4";
    protected String a;
    private String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private String h;
    private String i;
    private List j;
    private List k;

    public CrittercismConfig()
    {
        b = null;
        c = false;
        d = false;
        e = true;
        f = false;
        g = b();
        a = "com.crittercism/dumps";
        h = "Developer Reply";
        i = null;
        j = new LinkedList();
        k = new LinkedList();
    }

    public CrittercismConfig(CrittercismConfig crittercismconfig)
    {
        b = null;
        c = false;
        d = false;
        e = true;
        f = false;
        g = b();
        a = "com.crittercism/dumps";
        h = "Developer Reply";
        i = null;
        j = new LinkedList();
        k = new LinkedList();
        b = crittercismconfig.b;
        c = crittercismconfig.c;
        d = crittercismconfig.d;
        e = crittercismconfig.e;
        f = crittercismconfig.f;
        g = crittercismconfig.g;
        a = crittercismconfig.a;
        h = crittercismconfig.h;
        setURLBlacklistPatterns(crittercismconfig.j);
        setPreserveQueryStringPatterns(crittercismconfig.k);
        i = crittercismconfig.i;
    }

    public CrittercismConfig(JSONObject jsonobject)
    {
        b = null;
        c = false;
        d = false;
        e = true;
        f = false;
        g = b();
        a = "com.crittercism/dumps";
        h = "Developer Reply";
        i = null;
        j = new LinkedList();
        k = new LinkedList();
        b = a(jsonobject, "customVersionName", b);
        d = a(jsonobject, "includeVersionCode", d);
        e = a(jsonobject, "installNdk", e);
        c = a(jsonobject, "delaySendingAppLoad", c);
        f = a(jsonobject, "shouldCollectLogcat", f);
        a = a(jsonobject, "nativeDumpPath", a);
        h = a(jsonobject, "notificationTitle", h);
        g = a(jsonobject, "installApm", g);
    }

    private static int a(String s)
    {
        int l = 0;
        if (s != null)
        {
            l = s.hashCode();
        }
        return l;
    }

    private static String a(JSONObject jsonobject, String s, String s1)
    {
        String s2 = s1;
        if (jsonobject.has(s))
        {
            try
            {
                s2 = jsonobject.getString(s);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                return s1;
            }
        }
        return s2;
    }

    protected static boolean a(String s, String s1)
    {
        if (s == null)
        {
            return s1 == null;
        } else
        {
            return s.equals(s1);
        }
    }

    private static boolean a(JSONObject jsonobject, String s, boolean flag)
    {
        boolean flag1 = flag;
        if (jsonobject.has(s))
        {
            try
            {
                flag1 = jsonobject.getBoolean(s);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                return flag;
            }
        }
        return flag1;
    }

    private static final boolean b()
    {
        return android.os.Build.VERSION.SDK_INT >= 10 && android.os.Build.VERSION.SDK_INT <= 19;
    }

    public List a()
    {
        return getURLBlacklistPatterns();
    }

    public final boolean delaySendingAppLoad()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof CrittercismConfig)
        {
            if (c == ((CrittercismConfig) (obj = (CrittercismConfig)obj)).c && f == ((CrittercismConfig) (obj)).f && isNdkCrashReportingEnabled() == ((CrittercismConfig) (obj)).isNdkCrashReportingEnabled() && isOptmzEnabled() == ((CrittercismConfig) (obj)).isOptmzEnabled() && isVersionCodeToBeIncludedInVersionString() == ((CrittercismConfig) (obj)).isVersionCodeToBeIncludedInVersionString() && a(b, ((CrittercismConfig) (obj)).b) && a(h, ((CrittercismConfig) (obj)).h) && a(a, ((CrittercismConfig) (obj)).a) && j.equals(((CrittercismConfig) (obj)).j) && k.equals(((CrittercismConfig) (obj)).k) && a(i, ((CrittercismConfig) (obj)).i))
            {
                return true;
            }
        }
        return false;
    }

    public final String getCustomVersionName()
    {
        return b;
    }

    public List getPreserveQueryStringPatterns()
    {
        return new LinkedList(k);
    }

    public final String getRateMyAppTestTarget()
    {
        return i;
    }

    public List getURLBlacklistPatterns()
    {
        return new LinkedList(j);
    }

    public int hashCode()
    {
        int l1 = 1;
        int i2 = a(b);
        int j2 = a(h);
        int k2 = a(a);
        int l2 = a(i);
        int i3 = j.hashCode();
        int j3 = k.hashCode();
        int l;
        int i1;
        int j1;
        int k1;
        if (c)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (f)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (isNdkCrashReportingEnabled())
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (isOptmzEnabled())
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (!isVersionCodeToBeIncludedInVersionString())
        {
            l1 = 0;
        }
        return Integer.valueOf((k1 + (j1 + (i1 + (l + 0 << 1) << 1) << 1) << 1) + l1).hashCode() + (j3 + (((((i2 + 0) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31) * 31;
    }

    public final boolean isLogcatReportingEnabled()
    {
        return f;
    }

    public final boolean isNdkCrashReportingEnabled()
    {
        return e;
    }

    public final boolean isOptmzEnabled()
    {
        return g;
    }

    public final boolean isServiceMonitoringEnabled()
    {
        return isOptmzEnabled();
    }

    public final boolean isVersionCodeToBeIncludedInVersionString()
    {
        return d;
    }

    public final void setCustomVersionName(String s)
    {
        b = s;
    }

    public final void setDelaySendingAppLoad(boolean flag)
    {
        c = flag;
    }

    public final void setLogcatReportingEnabled(boolean flag)
    {
        f = flag;
    }

    public final void setNdkCrashReportingEnabled(boolean flag)
    {
        e = flag;
    }

    public final void setOptmzEnabled(boolean flag)
    {
        if (!b() && flag)
        {
            dx.a("Crittercism", "OPTMZ is currently only allowed for api levels 10 to 19.  APM will not be installed");
            return;
        } else
        {
            g = flag;
            return;
        }
    }

    public void setPreserveQueryStringPatterns(List list)
    {
        k.clear();
        if (list != null)
        {
            k.addAll(list);
        }
    }

    public final void setRateMyAppTestTarget(String s)
    {
        i = s;
    }

    public final void setServiceMonitoringEnabled(boolean flag)
    {
        setOptmzEnabled(flag);
    }

    public void setURLBlacklistPatterns(List list)
    {
        j.clear();
        if (list != null)
        {
            j.addAll(list);
        }
    }

    public final void setVersionCodeToBeIncludedInVersionString(boolean flag)
    {
        d = flag;
    }
}
