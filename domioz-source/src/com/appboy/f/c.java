// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.appboy.f;
import com.appboy.j;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.appboy.f:
//            a

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
        obj1 = resources.getResourcePackageName(j.b);
        b = ((String) (obj1));
        return ((String) (obj1));
        Exception exception;
        exception;
        exception = context.getPackageManager().getInstalledPackages(0).iterator();
_L5:
        if (!exception.hasNext()) goto _L2; else goto _L1
_L1:
        int i = resources.getIdentifier("string/resource_for_package_identification", null, ((PackageInfo)exception.next()).packageName);
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s;
        if (!resources.getResourceName(i).contains("string/resource_for_package_identification"))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = resources.getResourcePackageName(i);
        b = s;
        return s;
        Exception exception1;
        exception1;
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        com.appboy.f.a.b(a, "Could not find resource for package identification, returning Context#getPackageName().");
_L2:
        context = context.getPackageName();
        b = context;
        return context;
        obj;
        com.appboy.f.a.c(a, "Got null pointer exception getting resource package name, returning Context#getPackageName().", ((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        com.appboy.f.a.c(a, "General exception getting resource package name, returning Context#getPackageName().", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L3
_L3:
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/f/c.getName()
        });
    }
}
