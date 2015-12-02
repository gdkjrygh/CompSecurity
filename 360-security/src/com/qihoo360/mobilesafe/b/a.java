// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.content.g;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.qihoo.security.service.SecurityService;
import com.qihoo.utils.notice.c;
import com.qihoo360.common.utils.PortPackageParser;
import com.qihoo360.mobilesafe.core.d.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
{

    private static Drawable a;
    private static DisplayMetrics b;

    public static int a(Context context)
    {
        return context.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
    }

    public static int a(Context context, float f1)
    {
        return (int)(context.getResources().getDisplayMetrics().density * f1 + 0.5F);
    }

    public static int a(Context context, int i)
    {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static int a(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        int i1 = options.outHeight;
        int j1 = options.outWidth;
        int k = 1;
        int l;
        do
        {
            l = k;
            if (j1 / i <= k)
            {
                break;
            }
            k++;
        } while (true);
        for (; i1 / j > l; l++) { }
        return l;
    }

    private static android.content.pm.PackageParser.Package a(String s)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        displaymetrics.setToDefaults();
        return PortPackageParser.parsePackage(new File(s), null, displaymetrics, 0);
    }

    private static Drawable a(Context context, String s, String s1, boolean flag, int i)
    {
        AssetManager assetmanager;
        assetmanager = new AssetManager();
        assetmanager.addAssetPath(s1);
        s1 = new Configuration();
        s1.screenLayout = 1;
        android.graphics.BitmapFactory.Options options;
        s1 = new Resources(assetmanager, b, s1);
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(s1, i, options);
        options.inSampleSize = a(options, a(context, 48F), a(context, 48F));
        if (options.inSampleSize != 1 || !flag) goto _L2; else goto _L1
_L1:
        try
        {
            context = context.getPackageManager().getApplicationIcon(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            assetmanager.close();
            return null;
        }
        finally
        {
            assetmanager.close();
        }
_L4:
        assetmanager.close();
        return context;
_L2:
        options.inJustDecodeBounds = false;
        context = BitmapFactory.decodeResource(s1, i, options);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        context = new BitmapDrawable(s1, context);
        continue; /* Loop/switch isn't completed */
        throw context;
        context = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String a(Context context, String s, String s1, boolean flag)
    {
        String s2;
        s2 = "";
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        ApplicationInfo applicationinfo = context.getPackageManager().getApplicationInfo(s, 0);
        Object obj = s2;
        if (applicationinfo == null) goto _L2; else goto _L1
_L1:
        obj = context.getPackageManager().getApplicationLabel(applicationinfo);
        Object obj1 = obj;
        int i;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_123;
        }
        context = context.getResources();
        obj1 = new AssetManager();
        ((AssetManager) (obj1)).addAssetPath(s1);
        s1 = new Resources(((AssetManager) (obj1)), context.getDisplayMetrics(), context.getConfiguration());
        i = applicationinfo.labelRes;
        context = ((Context) (obj));
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        try
        {
            context = s1.getText(applicationinfo.labelRes);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = ((Context) (obj));
        }
        ((AssetManager) (obj1)).close();
        obj1 = context;
        if (!TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L4; else goto _L3
_L3:
        if (applicationinfo.nonLocalizedLabel == null) goto _L6; else goto _L5
_L5:
        obj = applicationinfo.nonLocalizedLabel.toString();
_L2:
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return s;
        } else
        {
            return ((String) (obj));
        }
_L6:
        try
        {
            obj = applicationinfo.packageName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            obj = s2;
        }
          goto _L2
_L4:
        obj = ((CharSequence) (obj1)).toString();
          goto _L2
        android.content.pm.PackageParser.Package package1 = a(s1);
        obj = s2;
        if (package1 != null)
        {
            obj = s2;
            if (package1.applicationInfo != null)
            {
                context = context.getResources();
                obj = new AssetManager();
                ((AssetManager) (obj)).addAssetPath(s1);
                Resources resources = new Resources(((AssetManager) (obj)), context.getDisplayMetrics(), context.getConfiguration());
                s1 = null;
                context = s1;
                if (package1.applicationInfo.labelRes != 0)
                {
                    try
                    {
                        context = resources.getText(package1.applicationInfo.labelRes);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        context = s1;
                    }
                }
                ((AssetManager) (obj)).close();
                if (TextUtils.isEmpty(context))
                {
                    if (package1.applicationInfo.nonLocalizedLabel != null)
                    {
                        obj = package1.applicationInfo.nonLocalizedLabel.toString();
                    } else
                    {
                        obj = package1.applicationInfo.packageName;
                    }
                } else
                {
                    obj = context.toString();
                }
            }
        }
          goto _L2
    }

    public static ArrayList a(PackageManager packagemanager)
    {
        ArrayList arraylist;
        Object obj;
        obj = new Intent("android.intent.action.MAIN", null);
        ((Intent) (obj)).addCategory("android.intent.category.LAUNCHER");
        arraylist = new ArrayList();
        if (packagemanager == null)
        {
            return arraylist;
        }
        ArrayList arraylist1;
        arraylist1 = new ArrayList();
        packagemanager = packagemanager.queryIntentActivities(((Intent) (obj)), 0).iterator();
_L2:
        do
        {
            if (!packagemanager.hasNext())
            {
                break MISSING_BLOCK_LABEL_137;
            }
            obj = (ResolveInfo)packagemanager.next();
        } while (obj == null);
        if (((ResolveInfo) (obj)).activityInfo == null || arraylist1.contains(((ResolveInfo) (obj)).activityInfo.applicationInfo.packageName)) goto _L2; else goto _L1
_L1:
        arraylist1.add(((ResolveInfo) (obj)).activityInfo.applicationInfo.packageName);
        arraylist.add(new com.qihoo.security.c.a(((ResolveInfo) (obj)).activityInfo.applicationInfo));
          goto _L2
        packagemanager;
        return arraylist;
    }

    public static void a(Context context, String s)
    {
        Intent intent = new Intent();
        intent.addFlags(0x10000000);
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 9)
        {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", s, null));
        } else
        {
            String s1;
            if (i == 8)
            {
                s1 = "pkg";
            } else
            {
                s1 = "com.android.settings.ApplicationPkgName";
            }
            intent.setAction("android.intent.action.VIEW");
            intent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
            intent.putExtra(s1, s);
        }
        context.startActivity(intent);
    }

    public static int b(Context context)
    {
        return context.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
    }

    public static String b(Context context, String s, String s1, boolean flag)
    {
        String s2 = "";
        if (!flag) goto _L2; else goto _L1
_L1:
        try
        {
            s = context.getPackageManager().getPackageInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return "";
        }
        context = s2;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        context = ((PackageInfo) (s)).versionName;
_L4:
        return context;
_L2:
        s = a(s1);
        context = s2;
        if (s != null)
        {
            return ((android.content.pm.PackageParser.Package) (s)).mVersionName;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean b(Context context, String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 12)
        {
            return c(context, s);
        }
        context = context.getPackageManager().getApplicationInfo(s, 0);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        int i = ((ApplicationInfo) (context)).flags;
        if ((i & 0x200000) != 0)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_48;
        context;
        context.printStackTrace();
        return false;
    }

    public static int c(Context context)
    {
        context = context.getResources();
        int i = 0;
        int j = context.getIdentifier("status_bar_height", "dimen", "android");
        if (j > 0)
        {
            i = context.getDimensionPixelSize(j);
        }
        return i;
    }

    public static Drawable c(Context context, String s, String s1, boolean flag)
    {
        Object obj;
        h(context);
        obj = null;
        if (!flag) goto _L2; else goto _L1
_L1:
        int i;
        s1 = context.getPackageManager().getApplicationInfo(s, 0);
        i = ((ApplicationInfo) (s1)).icon;
        Drawable drawable;
        drawable = obj;
        if (i != 0)
        {
            try
            {
                drawable = a(context, s, ((ApplicationInfo) (s1)).publicSourceDir, flag, i);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                drawable = obj;
            }
        }
_L4:
        context = drawable;
        if (drawable == null)
        {
            context = a;
        }
        return context;
_L2:
        android.content.pm.PackageParser.Package package1 = a(s1);
        drawable = obj;
        if (package1 != null)
        {
            drawable = obj;
            if (package1.applicationInfo != null)
            {
                int j = package1.applicationInfo.icon;
                drawable = obj;
                if (j != 0)
                {
                    drawable = a(context, s, s1, flag, j);
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static boolean c(Context context, String s)
    {
        context = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
        if (context == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        context = context.iterator();
        flag = false;
_L5:
        boolean flag1;
        flag1 = flag;
        if (context.hasNext())
        {
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)context.next();
            if (runningappprocessinfo.pkgList == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            String as[] = runningappprocessinfo.pkgList;
            int j = as.length;
            int i = 0;
            do
            {
                if (i >= j)
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (TextUtils.equals(s, as[i]))
                {
                    flag = true;
                    continue; /* Loop/switch isn't completed */
                }
                i++;
            } while (true);
        }
          goto _L3
_L2:
        flag1 = false;
_L3:
        return flag1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean d(Context context)
    {
        boolean flag = false;
        context = (new b(context)).a();
        if (!TextUtils.isEmpty(context))
        {
            flag = context.equals("com.qihoo.security.lite");
        }
        return flag;
    }

    public static void e(Context context)
    {
        if (context == null)
        {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT > 20)
        {
            context.stopService(new Intent(context, com/qihoo/security/service/SecurityService));
        }
        if (android.os.Build.VERSION.SDK_INT > 20)
        {
            context.stopService(new Intent(context, com/qihoo/security/service/SecurityService));
        }
        context.startService((new Intent(context, com/qihoo/security/service/SecurityService)).setAction("com.qihoo.security.ACTION_FINISH"));
        android.support.v4.content.g.a(context).a(new Intent("com.qihoo.security.ACTION_FINISH"));
    }

    public static void f(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT > 20)
        {
            context.stopService(new Intent(context, com/qihoo/security/service/SecurityService));
        }
        context.startService(new Intent(context, com/qihoo/security/service/SecurityService));
    }

    public static void g(Context context)
    {
        if (com.qihoo.utils.notice.c.a(context))
        {
            context.startService((new Intent(context, com/qihoo/security/service/SecurityService)).setAction("com.qihoo.security.action.DAEMON"));
        }
    }

    private static void h(Context context)
    {
        if (a == null)
        {
            a = context.getPackageManager().getDefaultActivityIcon();
        }
        if (b == null)
        {
            b = new DisplayMetrics();
            ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(b);
        }
    }
}
