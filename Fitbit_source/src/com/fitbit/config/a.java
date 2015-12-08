// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.config;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

// Referenced classes of package com.fitbit.config:
//            b, BuildType

public class a
{

    private static final String a = "AppVersion";
    private final int b;
    private final String c;
    private final BuildType d;

    public a(int i, String s, BuildType buildtype)
    {
        b = i;
        c = s;
        d = buildtype;
    }

    public static a a(Context context)
    {
        if (context == null)
        {
            return null;
        }
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String s = ((PackageInfo) (context)).versionName;
            context = new a(((PackageInfo) (context)).versionCode, s, b.a);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.fitbit.e.a.e("AppVersion", "Unable to create current AppVersion", context, new Object[0]);
            context = null;
        }
        return context;
    }

    public static a a(String s)
    {
        String s1;
        String as[];
        int i;
        if (s == null)
        {
            return null;
        }
        as = s.split(" ");
        if (as == null || as.length != 3)
        {
            com.fitbit.e.a.a("AppVersion", "Unable to parse AppVersion from [%s]", new Object[] {
                s
            });
            return null;
        }
        s1 = as[0];
        i = -1;
        s = BuildType.h;
        int j;
        as[1] = as[1].replace("(", "");
        as[1] = as[1].replace(")", "");
        j = Integer.parseInt(as[1]);
        i = j;
_L1:
        BuildType buildtype = BuildType.valueOf(as[2]);
        s = buildtype;
_L2:
        return new a(i, s1, s);
        Object obj;
        obj;
        com.fitbit.e.a.a("AppVersion", "Unable to parse versionCode from [%s]", ((Throwable) (obj)), new Object[] {
            as[1]
        });
          goto _L1
        obj;
        com.fitbit.e.a.a("AppVersion", "Unable to parse buildType from [%s]", ((Throwable) (obj)), new Object[] {
            as[2]
        });
          goto _L2
    }

    public int a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        while (obj == null || !(obj instanceof a)) 
        {
            return false;
        }
        return toString().equals(obj.toString());
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(c);
        stringbuilder.append(" (");
        stringbuilder.append(b);
        stringbuilder.append(") ");
        stringbuilder.append(d);
        return stringbuilder.toString();
    }
}
