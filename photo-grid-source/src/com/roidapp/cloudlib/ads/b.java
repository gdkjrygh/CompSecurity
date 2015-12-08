// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.ads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.cmcm.adsdk.f;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.d.a;

// Referenced classes of package com.roidapp.cloudlib.ads:
//            c, f

public final class b
{

    private static boolean a = false;

    public static String a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(com.roidapp.baselib.d.a.c()).append("/ads/").append(com.roidapp.baselib.d.a.c(s)).toString();
        }
    }

    public static void a()
    {
        (new c()).start();
    }

    public static void a(Context context)
    {
        if (!a && context != null)
        {
            com.roidapp.cloudlib.ads.f.a().a(context, 40004).a();
            com.roidapp.cloudlib.ads.f.a().a(context, 40005).a();
            com.roidapp.cloudlib.ads.f.a().a(context, 40008).a();
            com.roidapp.cloudlib.ads.f.a().a(context, 40006).a();
            com.roidapp.cloudlib.ads.f.a().a(context, 40007).a();
            a = true;
        }
    }

    private static void a(Context context, PackageManager packagemanager, String s, String s1, boolean flag)
    {
        if (TextUtils.isEmpty(s1))
        {
            return;
        }
        if (!flag || s == null) goto _L2; else goto _L1
_L1:
        packagemanager = packagemanager.getLaunchIntentForPackage(s);
_L4:
        if (packagemanager == null)
        {
            try
            {
                packagemanager = new Intent();
                packagemanager.setAction("android.intent.action.VIEW");
                packagemanager.setData(Uri.parse(s1));
                packagemanager.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
                context.startActivity(packagemanager);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (PackageManager packagemanager)
            {
                a(context, s1);
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        packagemanager = null;
        if (true) goto _L4; else goto _L3
_L3:
        context.startActivity(packagemanager);
        return;
    }

    public static void a(Context context, String s)
    {
        try
        {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(s));
            intent.setPackage("com.android.browser");
            context.startActivity(intent);
            return;
        }
        catch (Exception exception)
        {
            s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        }
        s.setFlags(0x10000000);
        try
        {
            context.startActivity(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void a(Context context, String s, String s1, String s2, boolean flag)
    {
        PackageManager packagemanager;
        Object obj;
        Object obj1 = null;
        if (flag)
        {
            packagemanager = context.getPackageManager();
        } else
        {
            packagemanager = null;
        }
        if (TextUtils.isEmpty(s1))
        {
            a(context, packagemanager, s, s2, flag);
            return;
        }
        if (!n.a(context, "com.android.vending"))
        {
            break MISSING_BLOCK_LABEL_202;
        }
        obj = obj1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        obj = obj1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        obj = packagemanager.getLaunchIntentForPackage(s);
        if (obj == null)
        {
            try
            {
                obj = Uri.parse(s1);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(0x10000000);
                intent.setClassName("com.android.vending", "com.google.android.finsky.activities.MainActivity");
                intent.setData(((Uri) (obj)));
                context.startActivity(intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
            try
            {
                s1 = Uri.parse(s1);
                obj = new Intent("android.intent.action.VIEW");
                ((Intent) (obj)).setPackage("com.android.vending");
                ((Intent) (obj)).setFlags(0x10000000);
                ((Intent) (obj)).setData(s1);
                context.startActivity(((Intent) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
            }
            a(context, packagemanager, s, s2, false);
            return;
        }
        context.startActivity(((Intent) (obj)));
        return;
        a(context, packagemanager, s, s2, flag);
        return;
    }

}
