// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.periodicreporters;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.analytics.c.b;
import com.facebook.analytics.ca;
import com.facebook.analytics.cb;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.fi;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.analytics.periodicreporters:
//            l, j, h, i, 
//            f

public class e
    implements l
{

    private long a;
    private final com.facebook.analytics.c.e b;
    private final Context c;
    private final PackageManager d;
    private final ActivityManager e;
    private final Iterable f;

    public e(Context context, com.facebook.analytics.c.e e1, PackageManager packagemanager, ActivityManager activitymanager, Iterable iterable)
    {
        a = 0L;
        c = context;
        b = e1;
        d = packagemanager;
        e = activitymanager;
        f = fi.a(iterable);
    }

    private long a()
    {
        if (a == 0L)
        {
            a = b.a(b.g, 0L);
        }
        return a;
    }

    private Point a(DisplayMetrics displaymetrics)
    {
        Point point = new Point();
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            ((WindowManager)c.getSystemService("window")).getDefaultDisplay().getSize(point);
            return point;
        } else
        {
            point.x = displaymetrics.widthPixels;
            point.y = displaymetrics.heightPixels;
            return point;
        }
    }

    private static ObjectNode a(Context context)
    {
        Object obj = PreferenceManager.getDefaultSharedPreferences(context).getAll();
        context = new ObjectNode(JsonNodeFactory.instance);
        java.util.Map.Entry entry;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); context.put((String)entry.getKey(), entry.getValue().toString()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        return context;
    }

    private void a(cb cb1)
    {
        long l3 = 0L;
        StatFs statfs;
        int k;
        long l1;
        statfs = new StatFs(Environment.getDataDirectory().getPath());
        l1 = statfs.getAvailableBlocks();
        k = statfs.getBlockSize();
        l1 *= k;
        long l2;
        l2 = statfs.getBlockCount();
        k = statfs.getBlockSize();
        long l4 = (long)k * l2;
        l2 = l1;
        l1 = l4;
_L1:
        cb1.a("device_free_space", l2);
        cb1.a("device_total_space", l1);
        statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        l1 = statfs.getAvailableBlocks();
        k = statfs.getBlockSize();
        l1 *= k;
        l2 = statfs.getBlockSize();
        k = statfs.getBlockCount();
        l2 = (long)k * l2;
_L2:
        cb1.a("sd_free_space", l1);
        cb1.a("sd_total_space", l2);
        return;
        Exception exception;
        exception;
        l1 = 0L;
_L3:
        l2 = l1;
        l1 = 0L;
          goto _L1
        exception;
        l1 = 0L;
        l2 = l3;
          goto _L2
        exception;
        l2 = l3;
          goto _L2
        exception;
          goto _L3
    }

    private ca b(long l1, String s)
    {
        cb cb1 = new cb("device_info");
        cb1.a(l1);
        cb1.c(s);
        s = c.getResources().getDisplayMetrics();
        Point point = a(s);
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((j)iterator.next()).a(cb1)) { }
        cb1.b("device_type", Build.MODEL);
        cb1.b("brand", Build.BRAND);
        cb1.b("manufacturer", Build.MANUFACTURER);
        cb1.b("os_type", "Android");
        cb1.b("os_ver", android.os.Build.VERSION.RELEASE);
        cb1.a("density", ((DisplayMetrics) (s)).density);
        cb1.a("screen_width", point.x);
        cb1.a("screen_height", point.y);
        cb1.a("front_camera", d.hasSystemFeature("android.hardware.camera.front"));
        cb1.a("rear_camera", d.hasSystemFeature("android.hardware.camera"));
        cb1.b("allows_non_market_installs", android.provider.Settings.Secure.getString(c.getContentResolver(), "install_non_market_apps"));
        cb1.b("android_id", android.provider.Settings.Secure.getString(c.getContentResolver(), "android_id"));
        cb1.a("preferences", a(c));
        cb1.a("opengl_version", e.getDeviceConfigurationInfo().reqGlEsVersion);
        s = b();
        cb1.b("google_play_services_installation", h.a(s).name());
        cb1.a("google_play_services_version", com.facebook.analytics.periodicreporters.h.b(s));
        cb1.e("device");
        a(cb1);
        b(cb1);
        return cb1;
    }

    private h b()
    {
        Object obj;
        ApplicationInfo applicationinfo;
        try
        {
            d.getPackageInfo("com.android.vending", 64);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return new h(i.SERVICE_MISSING, -1);
        }
        try
        {
            obj = d.getPackageInfo("com.google.android.gms", 64);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return new h(i.SERVICE_MISSING, -1);
        }
        try
        {
            applicationinfo = d.getApplicationInfo("com.google.android.gms", 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return new h(i.SERVICE_MISSING, ((PackageInfo) (obj)).versionCode);
        }
        if (!applicationinfo.enabled)
        {
            return new h(i.SERVICE_DISABLED, ((PackageInfo) (obj)).versionCode);
        } else
        {
            return new h(i.SERVICE_ENABLED, ((PackageInfo) (obj)).versionCode);
        }
    }

    private void b(long l1)
    {
        a = l1;
        b.b(b.g, l1);
    }

    private void b(cb cb1)
    {
        ArrayNode arraynode;
        long l1;
        long l2;
        l1 = 0L;
        arraynode = new ArrayNode(JsonNodeFactory.instance);
        l2 = l1;
        File afile[] = (new File(c.getFilesDir().getParentFile().getPath(), "databases")).listFiles();
        l2 = l1;
        ArrayList arraylist = new ArrayList(afile.length);
        l2 = l1;
        int i1 = afile.length;
        int k = 0;
_L3:
        if (k >= i1) goto _L2; else goto _L1
_L1:
        File file;
        file = afile[k];
        l2 = l1;
        if (!file.isFile())
        {
            continue; /* Loop/switch isn't completed */
        }
        l2 = l1;
        long l3 = file.length();
        l1 += l3;
        arraylist.add(new f(file));
        k++;
          goto _L3
_L2:
        l2 = l1;
        Collections.sort(arraylist, com.facebook.analytics.periodicreporters.f.a());
        l2 = l1;
        Iterator iterator = arraylist.subList(0, Math.min(7, arraylist.size())).iterator();
_L5:
        l2 = l1;
        l3 = l1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        l2 = l1;
        arraynode.add(com.facebook.analytics.periodicreporters.f.b((f)iterator.next()));
        if (true) goto _L5; else goto _L4
        Exception exception;
        exception;
        l3 = l2;
_L4:
        cb1.a("db_folder_size", l3);
        cb1.a("db_top_sizes", arraynode);
        return;
        exception;
        l3 = l1;
        if (true) goto _L4; else goto _L6
_L6:
    }

    public List a(long l1, String s)
    {
        b(l1);
        return Collections.singletonList(b(l1, s));
    }

    public boolean a(long l1)
    {
        return l1 - a() > 0x5265c00L;
    }
}
