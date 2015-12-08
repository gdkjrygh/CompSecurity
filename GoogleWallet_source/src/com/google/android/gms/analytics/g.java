// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

// Referenced classes of package com.google.android.gms.analytics:
//            q, ac

final class g
    implements q
{

    private static Object xN = new Object();
    private static g yd;
    protected String xZ;
    protected String ya;
    protected String yb;
    protected String yc;

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
        yb = context.getPackageName();
        yc = packagemanager.getInstallerPackageName(yb);
        s = yb;
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
        xZ = ((String) (obj));
        ya = context;
        return;
        context;
        ac.e((new StringBuilder("Error retrieving package info: appName set to ")).append(((String) (obj))).toString());
        context = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static g dV()
    {
        return yd;
    }

    public static void y(Context context)
    {
        synchronized (xN)
        {
            if (yd == null)
            {
                yd = new g(context);
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final String getValue(String s)
    {
        if (s != null)
        {
            if (s.equals("&an"))
            {
                return xZ;
            }
            if (s.equals("&av"))
            {
                return ya;
            }
            if (s.equals("&aid"))
            {
                return yb;
            }
            if (s.equals("&aiid"))
            {
                return yc;
            }
        }
        return null;
    }

}
