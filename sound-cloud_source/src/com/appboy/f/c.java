// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.appboy.d;
import com.appboy.i;
import java.util.Iterator;
import java.util.List;

public class c
{

    private static final String a;
    private static String b;

    public c()
    {
    }

    public static String a(Context context)
    {
        if (b != null)
        {
            return b;
        }
        Resources resources = context.getResources();
        Object obj1;
        obj1 = resources.getResourcePackageName(i.resource_for_package_identification);
        b = ((String) (obj1));
        return ((String) (obj1));
        Exception exception;
        exception;
        exception = context.getPackageManager().getInstalledPackages(0).iterator();
_L2:
        int j;
        if (!exception.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        j = resources.getIdentifier("string/resource_for_package_identification", null, ((PackageInfo)exception.next()).packageName);
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s;
        if (!resources.getResourceName(j).contains("string/resource_for_package_identification"))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = resources.getResourcePackageName(j);
        b = s;
        return s;
        Exception exception1;
        exception1;
        if (true) goto _L2; else goto _L1
        Object obj;
        obj;
_L1:
        context = context.getPackageName();
        b = context;
        return context;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L1; else goto _L3
_L3:
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, com/appboy/f/c.getName()
        });
    }
}
