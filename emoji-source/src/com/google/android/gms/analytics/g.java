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

    private static g tG;
    private static Object tq = new Object();
    protected String tC;
    protected String tD;
    protected String tE;
    protected String tF;

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
        tE = context.getPackageName();
        tF = packagemanager.getInstallerPackageName(tE);
        s = tE;
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
        tC = ((String) (obj));
        tD = context;
        return;
        context;
        aa.A((new StringBuilder()).append("Error retrieving package info: appName set to ").append(((String) (obj))).toString());
        context = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static g cu()
    {
        return tG;
    }

    public static void u(Context context)
    {
        synchronized (tq)
        {
            if (tG == null)
            {
                tG = new g(context);
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
                return tC;
            }
            if (s.equals("&av"))
            {
                return tD;
            }
            if (s.equals("&aid"))
            {
                return tE;
            }
            if (s.equals("&aiid"))
            {
                return tF;
            }
        }
        return null;
    }

}
