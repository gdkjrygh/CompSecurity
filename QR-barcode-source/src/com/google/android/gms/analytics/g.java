// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

// Referenced classes of package com.google.android.gms.analytics:
//            l, z

class g
    implements l
{

    private static g xP;
    private static Object xz = new Object();
    protected String xL;
    protected String xM;
    protected String xN;
    protected String xO;

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
        xN = context.getPackageName();
        xO = packagemanager.getInstallerPackageName(xN);
        s = xN;
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
        xL = ((String) (obj));
        xM = context;
        return;
        context;
        z.T((new StringBuilder()).append("Error retrieving package info: appName set to ").append(((String) (obj))).toString());
        context = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static g dP()
    {
        return xP;
    }

    public static void y(Context context)
    {
        synchronized (xz)
        {
            if (xP == null)
            {
                xP = new g(context);
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean ac(String s)
    {
        return "&an".equals(s) || "&av".equals(s) || "&aid".equals(s) || "&aiid".equals(s);
    }

    public String getValue(String s)
    {
        if (s != null)
        {
            if (s.equals("&an"))
            {
                return xL;
            }
            if (s.equals("&av"))
            {
                return xM;
            }
            if (s.equals("&aid"))
            {
                return xN;
            }
            if (s.equals("&aiid"))
            {
                return xO;
            }
        }
        return null;
    }

}
