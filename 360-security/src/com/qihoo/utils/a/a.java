// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.utils.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.qihoo.security.SecurityApplication;

public class a
{

    private static a e;
    private final Context a = SecurityApplication.a();
    private final DisplayMetrics b;
    private final Configuration c;
    private int d;

    private a()
    {
        d = 0;
        b = a.getResources().getDisplayMetrics();
        c = a.getResources().getConfiguration();
        d = com.qihoo360.mobilesafe.b.a.a(a, 48F);
    }

    private Drawable a(ApplicationInfo applicationinfo)
    {
        Object obj;
        Resources resources;
        obj = new AssetManager();
        ((AssetManager) (obj)).addAssetPath(applicationinfo.publicSourceDir);
        resources = new Resources(((AssetManager) (obj)), b, c);
        android.graphics.BitmapFactory.Options options;
        int i;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, applicationinfo.icon, options);
        i = a(options, d, d);
        options.inSampleSize = i;
        if (i != -1) goto _L2; else goto _L1
_L1:
        applicationinfo = a.getPackageManager().getDefaultActivityIcon();
_L6:
        ((AssetManager) (obj)).close();
_L4:
        obj = applicationinfo;
        if (applicationinfo == null)
        {
            obj = a.getPackageManager().getDefaultActivityIcon();
        }
        return ((Drawable) (obj));
_L2:
        if (i == 1)
        {
            try
            {
                applicationinfo = applicationinfo.loadIcon(a.getPackageManager());
                continue; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch (ApplicationInfo applicationinfo) { }
            finally
            {
                ((AssetManager) (obj)).close();
                throw applicationinfo;
            }
            break MISSING_BLOCK_LABEL_179;
        }
        options.inJustDecodeBounds = false;
        applicationinfo = BitmapFactory.decodeResource(resources, applicationinfo.icon, options);
        if (applicationinfo == null)
        {
            break; /* Loop/switch isn't completed */
        }
        applicationinfo = new BitmapDrawable(resources, applicationinfo);
        continue; /* Loop/switch isn't completed */
        applicationinfo.printStackTrace();
        ((AssetManager) (obj)).close();
        applicationinfo = null;
        if (true) goto _L4; else goto _L3
_L3:
        applicationinfo = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static a a()
    {
        if (e == null)
        {
            e = new a();
        }
        return e;
    }

    public int a(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        int l;
        int i1;
        int j1;
        i1 = options.outHeight;
        j1 = options.outWidth;
        l = 1;
        if (i1 != -1 && j1 != -1) goto _L2; else goto _L1
_L1:
        i = -1;
_L4:
        return i;
_L2:
        int k;
        do
        {
            k = l;
            if (j1 / i <= l)
            {
                break;
            }
            l++;
        } while (true);
        do
        {
            i = k;
            if (i1 / j <= k)
            {
                continue;
            }
            k++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Drawable a(String s)
    {
        try
        {
            s = a(a.getPackageManager().getApplicationInfo(s, 0));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public Drawable b(String s)
    {
        try
        {
            ApplicationInfo applicationinfo = a.getPackageManager().getPackageArchiveInfo(s, 1).applicationInfo;
            applicationinfo.sourceDir = s;
            applicationinfo.publicSourceDir = s;
            s = a(applicationinfo);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }
}
