// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

// Referenced classes of package com.google.android.gms.analytics:
//            m, aa

class g
    implements m
{

    private static g tD;
    private static Object tn = new Object();
    protected String tA;
    protected String tB;
    protected String tC;
    protected String tz;

    protected g()
    {
    }

    private g(Context context)
    {
        Object obj;
        String s;
        Object obj1;
        PackageManager packagemanager;
        packagemanager = context.getPackageManager();
        tB = context.getPackageName();
        tC = packagemanager.getInstallerPackageName(tB);
        s = tB;
        obj1 = null;
        obj = s;
        PackageInfo packageinfo = packagemanager.getPackageInfo(context.getPackageName(), 0);
        context = obj1;
        obj = s;
        if (packageinfo == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj = s;
        context = packagemanager.getApplicationLabel(packageinfo.applicationInfo).toString();
        obj = context;
        s = packageinfo.versionName;
        obj = context;
        context = s;
_L2:
        tz = ((String) (obj));
        tA = context;
        return;
        context;
        aa.A((new StringBuilder()).append("Error retrieving package info: appName set to ").append(((String) (obj))).toString());
        context = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static g cp()
    {
        return tD;
    }

    public static void r(Context context)
    {
        synchronized (tn)
        {
            if (tD == null)
            {
                tD = new g(context);
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean J(String s)
    {
        return "&an".equals(s) || "&av".equals(s) || "&aid".equals(s) || "&aiid".equals(s);
    }

    public String getValue(String s)
    {
        if (s != null)
        {
            if (s.equals("&an"))
            {
                return tz;
            }
            if (s.equals("&av"))
            {
                return tA;
            }
            if (s.equals("&aid"))
            {
                return tB;
            }
            if (s.equals("&aiid"))
            {
                return tC;
            }
        }
        return null;
    }

}
