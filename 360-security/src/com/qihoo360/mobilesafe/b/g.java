// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

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
import android.view.Display;
import android.view.WindowManager;
import java.lang.ref.SoftReference;
import java.util.HashMap;

public class g
{
    private class a extends SoftReference
    {

        public String a;
        final g b;

        public a(String s, Drawable drawable)
        {
            b = g.this;
            super(drawable);
            a = null;
            a = s;
        }
    }


    private final Context a;
    private final DisplayMetrics b;
    private int c;
    private int d;
    private final PackageManager e;
    private final int f;
    private HashMap g;

    public g(Context context)
    {
        c = 48;
        d = 48;
        f = -1;
        a = context;
        e = a.getPackageManager();
        g = new HashMap();
        b = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(b);
    }

    public g(Context context, int i, int j)
    {
        c = 48;
        d = 48;
        f = -1;
        a = context;
        e = a.getPackageManager();
        g = new HashMap();
        b = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(b);
        c = i;
        d = j;
    }

    private int a(Context context, float f1)
    {
        return (int)(context.getResources().getDisplayMetrics().density * f1 + 0.5F);
    }

    private int a(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        int k = options.outHeight;
        int l = options.outWidth;
        byte byte0 = 1;
        if (k == -1 || l == -1)
        {
            byte0 = -1;
        } else
        if (k > j || l > i)
        {
            if (l > k)
            {
                return Math.round((float)k / (float)j);
            } else
            {
                return Math.round((float)l / (float)i);
            }
        }
        return byte0;
    }

    private Drawable a(ApplicationInfo applicationinfo)
    {
        AssetManager assetmanager;
        Object obj;
        assetmanager = new AssetManager();
        assetmanager.addAssetPath(applicationinfo.publicSourceDir);
        obj = new Configuration();
        obj.screenLayout = 1;
        obj = new Resources(assetmanager, b, ((Configuration) (obj)));
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(((Resources) (obj)), applicationinfo.icon, options);
        options.inSampleSize = a(options, a(a, c), a(a, d));
        if (options.inSampleSize != -1)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        applicationinfo = a.getResources().getDrawable(0x7f020044);
        assetmanager.close();
        return applicationinfo;
        if (options.inSampleSize > 1)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        applicationinfo = e.getApplicationIcon(applicationinfo);
        assetmanager.close();
        return applicationinfo;
        if (options.inSampleSize <= 1)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        options.inJustDecodeBounds = false;
        applicationinfo = BitmapFactory.decodeResource(((Resources) (obj)), applicationinfo.icon, options);
        if (applicationinfo == null)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        applicationinfo = new BitmapDrawable(applicationinfo);
        assetmanager.close();
        return applicationinfo;
        assetmanager.close();
        return a.getResources().getDrawable(0x7f020044);
        applicationinfo;
        applicationinfo = a.getResources().getDrawable(0x7f020044);
        assetmanager.close();
        return applicationinfo;
        applicationinfo;
        applicationinfo = a.getResources().getDrawable(0x7f020044);
        assetmanager.close();
        return applicationinfo;
        applicationinfo;
        assetmanager.close();
        throw applicationinfo;
    }

    private Drawable a(ApplicationInfo applicationinfo, int i)
    {
        AssetManager assetmanager;
        Object obj;
        assetmanager = new AssetManager();
        assetmanager.addAssetPath(applicationinfo.publicSourceDir);
        obj = new Configuration();
        obj.screenLayout = 1;
        obj = new Resources(assetmanager, b, ((Configuration) (obj)));
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(((Resources) (obj)), applicationinfo.icon, options);
        options.inSampleSize = a(options, a(a, c), a(a, d));
        if (options.inSampleSize != -1)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        applicationinfo = a.getResources().getDrawable(i);
        assetmanager.close();
        return applicationinfo;
        if (options.inSampleSize > 1)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        applicationinfo = e.getApplicationIcon(applicationinfo);
        assetmanager.close();
        return applicationinfo;
        if (options.inSampleSize <= 1)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        options.inJustDecodeBounds = false;
        applicationinfo = BitmapFactory.decodeResource(((Resources) (obj)), applicationinfo.icon, options);
        if (applicationinfo == null)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        applicationinfo = new BitmapDrawable(applicationinfo);
        assetmanager.close();
        return applicationinfo;
        assetmanager.close();
        return a.getResources().getDrawable(0x7f020044);
        applicationinfo;
        applicationinfo = a.getResources().getDrawable(i);
        assetmanager.close();
        return applicationinfo;
        applicationinfo;
        applicationinfo = a.getResources().getDrawable(i);
        assetmanager.close();
        return applicationinfo;
        applicationinfo;
        assetmanager.close();
        throw applicationinfo;
    }

    private Drawable b(String s, String s1)
    {
        Object obj = null;
        Object obj1 = e.getApplicationInfo(s, 0);
        if (obj1 != null)
        {
            try
            {
                obj = a(((ApplicationInfo) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((android.content.pm.PackageManager.NameNotFoundException) (obj)).printStackTrace();
                obj = null;
            }
        }
        if (obj != null || s1 == null) goto _L2; else goto _L1
_L1:
        obj1 = e.getPackageArchiveInfo(s1, 1);
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        obj1 = ((PackageInfo) (obj1)).applicationInfo;
        obj1.sourceDir = s1;
        obj1.publicSourceDir = s1;
        s1 = e.getApplicationIcon(((ApplicationInfo) (obj1)));
_L5:
        obj = s1;
        if (s1 == null)
        {
            obj = a.getResources().getDrawable(0x7f020044);
        }
        s1 = new a(s, ((Drawable) (obj)));
        g.put(s, s1);
        return ((Drawable) (obj));
        s1;
        s1.printStackTrace();
_L2:
        s1 = ((String) (obj));
        if (true) goto _L5; else goto _L4
_L4:
    }

    private Drawable b(String s, String s1, int i)
    {
        Object obj = null;
        Object obj1 = e.getApplicationInfo(s, 0);
        if (obj1 != null)
        {
            try
            {
                obj = a(((ApplicationInfo) (obj1)), i);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((android.content.pm.PackageManager.NameNotFoundException) (obj)).printStackTrace();
                obj = null;
            }
        }
        if (obj != null || s1 == null) goto _L2; else goto _L1
_L1:
        obj1 = e.getPackageArchiveInfo(s1, 1);
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        obj1 = ((PackageInfo) (obj1)).applicationInfo;
        obj1.sourceDir = s1;
        obj1.publicSourceDir = s1;
        s1 = e.getApplicationIcon(((ApplicationInfo) (obj1)));
_L5:
        obj = s1;
        if (s1 == null)
        {
            obj = a.getResources().getDrawable(i);
        }
        s1 = new a(s, ((Drawable) (obj)));
        g.put(s, s1);
        return ((Drawable) (obj));
        s1;
        s1.printStackTrace();
_L2:
        s1 = ((String) (obj));
        if (true) goto _L5; else goto _L4
_L4:
    }

    public Drawable a(String s, String s1)
    {
        Drawable drawable = null;
        if (g == null)
        {
            g = new HashMap();
        }
        if (g.containsKey(s))
        {
            drawable = (Drawable)((a)g.get(s)).get();
        }
        Drawable drawable1 = drawable;
        if (drawable == null)
        {
            drawable1 = b(s, s1);
        }
        return drawable1;
    }

    public Drawable a(String s, String s1, int i)
    {
        Drawable drawable1 = null;
        if (g == null)
        {
            g = new HashMap();
        }
        Drawable drawable = drawable1;
        if (s != null)
        {
            drawable = drawable1;
            if (g.containsKey(s))
            {
                drawable = (Drawable)((a)g.get(s)).get();
            }
        }
        drawable1 = drawable;
        if (drawable == null)
        {
            drawable1 = b(s, s1, i);
        }
        return drawable1;
    }

    public void a()
    {
        if (g != null)
        {
            g.clear();
        }
    }
}
