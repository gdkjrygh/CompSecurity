// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public class CrittercismConfig
{

    public static final String API_VERSION = "3.1.4";
    private String a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private String g;
    private String h;
    private String i;
    private List j;

    public CrittercismConfig()
    {
        a = null;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = "com.crittercism/dumps";
        h = "Developer Reply";
        i = null;
        j = new LinkedList();
    }

    public CrittercismConfig(CrittercismConfig crittercismconfig)
    {
        a = null;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = "com.crittercism/dumps";
        h = "Developer Reply";
        i = null;
        j = new LinkedList();
        a = crittercismconfig.a;
        b = crittercismconfig.b;
        c = crittercismconfig.c;
        d = crittercismconfig.d;
        e = crittercismconfig.e;
        f = crittercismconfig.f;
        g = crittercismconfig.g;
        h = crittercismconfig.h;
        setApmBlackListURLPatterns(crittercismconfig.j);
        i = crittercismconfig.i;
    }

    public CrittercismConfig(JSONObject jsonobject)
    {
        a = null;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = "com.crittercism/dumps";
        h = "Developer Reply";
        i = null;
        j = new LinkedList();
        a = a(jsonobject, "customVersionName", a);
        c = a(jsonobject, "includeVersionCode", c);
        d = a(jsonobject, "installNdk", d);
        b = a(jsonobject, "delaySendingAppLoad", b);
        e = a(jsonobject, "shouldCollectLogcat", e);
        g = a(jsonobject, "nativeDumpPath", g);
        h = a(jsonobject, "notificationTitle", h);
        f = a(jsonobject, "installApm", f);
    }

    private static int a(String s)
    {
        int k = 0;
        if (s != null)
        {
            k = s.hashCode();
        }
        return k;
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

    public final boolean delaySendingAppLoad()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof CrittercismConfig)
        {
            if (b == ((CrittercismConfig) (obj = (CrittercismConfig)obj)).b && e == ((CrittercismConfig) (obj)).e && isNdkCrashReportingEnabled() == ((CrittercismConfig) (obj)).isNdkCrashReportingEnabled() && isVersionCodeToBeIncludedInVersionString() == ((CrittercismConfig) (obj)).isVersionCodeToBeIncludedInVersionString() && a(a, ((CrittercismConfig) (obj)).a) && a(h, ((CrittercismConfig) (obj)).h) && a(g, ((CrittercismConfig) (obj)).g) && j.equals(((CrittercismConfig) (obj)).j) && a(i, ((CrittercismConfig) (obj)).i))
            {
                return true;
            }
        }
        return false;
    }

    public List getApmBlackListURLPatterns()
    {
        return new LinkedList(j);
    }

    public final String getCustomVersionName()
    {
        return a;
    }

    public final String getNativeDumpPath()
    {
        return g;
    }

    public final String getNotificationTitle()
    {
        return h;
    }

    public final String getRateMyAppTestTarget()
    {
        return i;
    }

    public int hashCode()
    {
        int j1 = 1;
        int k1 = a(a);
        int l1 = a(h);
        int i2 = a(g);
        int j2 = a(i);
        int k2 = j.hashCode();
        int k;
        int l;
        int i1;
        if (b)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (e)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (isNdkCrashReportingEnabled())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!isVersionCodeToBeIncludedInVersionString())
        {
            j1 = 0;
        }
        return Integer.valueOf(((i1 + (l + (k + 0 << 1) << 1) << 1) + 0 << 1) + j1).hashCode() + (k2 + ((((k1 + 0) * 31 + l1) * 31 + i2) * 31 + j2) * 31) * 31;
    }

    public final boolean isLogcatReportingEnabled()
    {
        return e;
    }

    public final boolean isNdkCrashReportingEnabled()
    {
        return d;
    }

    public final boolean isVersionCodeToBeIncludedInVersionString()
    {
        return c;
    }

    public void setApmBlackListURLPatterns(List list)
    {
        j.clear();
        if (list != null)
        {
            j.addAll(list);
        }
    }

    public final void setCustomVersionName(String s)
    {
        a = s;
    }

    public final void setDelaySendingAppLoad(boolean flag)
    {
        b = flag;
    }

    public final void setLogcatReportingEnabled(boolean flag)
    {
        e = flag;
    }

    public final void setNativeDumpPath(String s)
    {
        g = s;
    }

    public final void setNdkCrashReportingEnabled(boolean flag)
    {
        d = flag;
    }

    public final void setNotificationTitle(String s)
    {
        h = s;
    }

    public final void setRateMyAppTestTarget(String s)
    {
        i = s;
    }

    public final void setVersionCodeToBeIncludedInVersionString(boolean flag)
    {
        c = flag;
    }
}
