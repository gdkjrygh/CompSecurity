// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.c;

import android.content.pm.ApplicationInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Referenced classes of package com.qihoo.security.c:
//            b

public class a extends b
{

    public static int c = 1;
    public static int d = 2;
    public static int e = 3;
    private static int j = 0x20000000;
    private static int k = 0x40000;
    private static int l = 2;
    private static int m = 0;
    private static int n = -1;
    private static int o;
    private static boolean p = false;
    public ApplicationInfo a;
    public int b;
    int f;

    public a(ApplicationInfo applicationinfo)
    {
        b = 7;
        f = c;
        a = applicationinfo;
    }

    static 
    {
        o = 2;
        try
        {
            Class class1 = Class.forName("android.content.pm.ApplicationInfo");
            j = class1.getField("FLAG_FORWARD_LOCK").getInt(class1);
            k = class1.getField("FLAG_EXTERNAL_STORAGE").getInt(class1);
            class1 = Class.forName("android.content.pm.PackageInfo");
            l = class1.getField("INSTALL_LOCATION_PREFER_EXTERNAL").getInt(class1);
            m = class1.getField("INSTALL_LOCATION_AUTO").getInt(class1);
            n = class1.getField("INSTALL_LOCATION_UNSPECIFIED").getInt(class1);
            class1 = Class.forName("com.android.internal.content.PackageHelper");
            o = class1.getField("APP_INSTALL_EXTERNAL").getInt(class1);
            Object obj = Class.forName("android.app.ActivityThread");
            class1 = Class.forName("android.content.pm.IPackageManager");
            obj = ((Class) (obj)).getMethod("getPackageManager", new Class[0]).invoke(obj.getClass(), new Object[0]);
            if (((Integer)class1.getMethod("getInstallLocation", new Class[0]).invoke(obj, new Object[0])).intValue() == o)
            {
                p = true;
            }
        }
        catch (Exception exception) { }
    }
}
