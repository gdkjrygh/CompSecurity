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

    private static Object sf = new Object();
    private static g ss;
    protected String so;
    protected String sp;
    protected String sq;
    protected String sr;

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
        sq = context.getPackageName();
        sr = packagemanager.getInstallerPackageName(sq);
        s = sq;
        obj1 = null;
        obj = s;
        PackageInfo packageinfo = packagemanager.getPackageInfo(context.getPackageName(), 0);
        context = obj1;
        obj = s;
        if (packageinfo == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        obj = s;
        context = packagemanager.getApplicationLabel(packageinfo.applicationInfo).toString();
        obj = context;
        s = packageinfo.versionName;
        obj = context;
        context = s;
_L2:
        so = ((String) (obj));
        sp = context;
        return;
        context;
        aa.w((new StringBuilder()).append("Error retrieving package info: appName set to ").append(((String) (obj))).toString());
        context = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static g ca()
    {
        return ss;
    }

    public static void n(Context context)
    {
        synchronized (sf)
        {
            if (ss == null)
            {
                ss = new g(context);
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean C(String s)
    {
        return "&an".equals(s) || "&av".equals(s) || "&aid".equals(s) || "&aiid".equals(s);
    }

    public String getValue(String s)
    {
        if (s != null)
        {
            if (s.equals("&an"))
            {
                return so;
            }
            if (s.equals("&av"))
            {
                return sp;
            }
            if (s.equals("&aid"))
            {
                return sq;
            }
            if (s.equals("&aiid"))
            {
                return sr;
            }
        }
        return null;
    }

}
