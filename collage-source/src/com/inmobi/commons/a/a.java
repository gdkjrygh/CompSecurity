// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.inmobi.commons.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Handler;
import android.webkit.WebSettings;
import com.inmobi.commons.core.utilities.Logger;
import com.inmobi.commons.core.utilities.b;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a
{

    private static final String a = com/inmobi/commons/a/a.getSimpleName();
    private static Context b;
    private static String c = "";
    private static String d = "";
    private static AtomicBoolean e = new AtomicBoolean();

    public a()
    {
    }

    public static File a(Context context)
    {
        return new File(context.getCacheDir(), "im_cached_content");
    }

    public static void a(Context context, String s)
    {
        if (!a())
        {
            b = context.getApplicationContext();
            d = s;
            e.set(true);
            b(context);
            c(context);
        }
    }

    public static void a(File file, String s)
    {
        if (s != null && s.trim().length() != 0)
        {
            com.inmobi.commons.core.utilities.b.a(new File(file, s));
            return;
        } else
        {
            com.inmobi.commons.core.utilities.b.a(file);
            return;
        }
    }

    public static void a(boolean flag)
    {
        e.set(flag);
    }

    public static boolean a()
    {
        return b != null;
    }

    public static boolean a(String s)
    {
        Object obj = b();
        if (obj != null)
        {
            obj = ((Context) (obj)).getPackageManager();
            if (android.os.Build.VERSION.SDK_INT < 23)
            {
                if (((PackageManager) (obj)).checkPermission(s, ((PackageManager) (obj)).getNameForUid(Binder.getCallingUid())) == 0)
                {
                    return true;
                }
            } else
            {
                return b(s);
            }
        }
        return false;
    }

    public static Context b()
    {
        return b;
    }

    private static void b(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            c = f();
            return;
        } else
        {
            (new Handler(context.getMainLooper())).post(new _cls1(context));
            return;
        }
    }

    public static boolean b(String s)
    {
        Object obj = b();
        if (obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        String as[];
        int j;
        if (((PackageInfo) (obj = ((Context) (obj)).getPackageManager().getPackageInfo(((Context) (obj)).getPackageName(), 4096))).requestedPermissions == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        as = ((PackageInfo) (obj)).requestedPermissions;
        j = as.length;
        int i = 0;
        while (i < j) 
        {
            boolean flag;
            try
            {
                flag = as[i].equals(s);
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, (new StringBuilder()).append("Could not check manifest for permission:").append(s).append(" Error:").append(namenotfoundexception.getLocalizedMessage()).toString());
                return false;
            }
            if (flag)
            {
                return true;
            }
            i++;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static String c()
    {
        return d;
    }

    static String c(String s)
    {
        c = s;
        return s;
    }

    private static void c(Context context)
    {
        context = a(context);
        a(context, null);
        if (!context.mkdir() && !context.isDirectory())
        {
            Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, a, "Cannot create media cache directory");
        }
    }

    public static String d()
    {
        return c;
    }

    public static boolean e()
    {
        return e.get();
    }

    private static String f()
    {
        return WebSettings.getDefaultUserAgent(b());
    }


    /* member class not found */
    class _cls1 {}

}
