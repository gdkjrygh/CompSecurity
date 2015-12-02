// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.common.l.b;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.bugreporter:
//            aa

public class z
{

    private static final String a[] = {
        "com.facebook.katana", "com.facebook.wakizashi", "com.facebook.orca", "com.facebook.home", "com.facebook.pages.app", "com.instagram.android"
    };
    private PackageManager b;
    private b c;

    public z(PackageManager packagemanager, b b1)
    {
        b = (PackageManager)Preconditions.checkNotNull(packagemanager);
        c = (b)Preconditions.checkNotNull(b1);
    }

    public List a()
    {
        int i = 0;
        ArrayList arraylist = new ArrayList();
        Object obj = b.getInstalledPackages(0);
        HashMap hashmap = new HashMap();
        PackageInfo packageinfo;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hashmap.put(packageinfo.packageName, packageinfo))
        {
            packageinfo = (PackageInfo)((Iterator) (obj)).next();
        }

        String as[] = a;
        int j = as.length;
        while (i < j) 
        {
            String s = as[i];
            if (hashmap.containsKey(s))
            {
                try
                {
                    com.facebook.common.l.a a1 = c.a(s);
                    arraylist.add(new aa(s, ((PackageInfo)hashmap.get(s)).versionCode, a1));
                }
                catch (Exception exception)
                {
                    com.facebook.debug.log.b.b(com/facebook/bugreporter/z, (new StringBuilder()).append("Unable to parse AppBuildInfo from package: ").append(s).toString(), exception);
                }
            }
            i++;
        }
        return arraylist;
    }

}
