// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import android.graphics.PixelFormat;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, dv

public class du
{

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;
    public String j;
    public int k;
    public long l;
    public long m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public List r;
    public String s;
    public String t;
    public String u;
    public boolean v;
    public String w;
    private Context x;

    public du(Context context)
    {
        x = context;
        a = ct.w();
        if (ct.C() >= 4)
        {
            b = (new dv(this)).a();
        } else
        {
            b = "Android";
        }
        w = TimeZone.getDefault().getID();
        s = h();
        t = g();
        u = i();
        j = Build.BRAND;
        c = Build.MODEL;
        d = "Android OS";
        e = android.os.Build.VERSION.RELEASE;
        f = ct.o();
        g = k();
        h = e();
        i = f();
        l = Runtime.getRuntime().freeMemory();
        k = j();
        m = b();
        v = c();
        n = 0;
        o = a();
        p = d();
        q = false;
        r = new ArrayList();
    }

    private boolean a()
    {
        boolean flag = false;
        Object obj;
        try
        {
            obj = x.getSystemService("sensor");
        }
        catch (Exception exception)
        {
            return false;
        }
        if (obj != null)
        {
            flag = true;
        }
        return flag;
    }

    private long b()
    {
        StatFs statfs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        return (long)Math.abs(statfs.getFreeBlocks() * statfs.getBlockSize());
    }

    private boolean c()
    {
        return ((TelephonyManager)x.getSystemService("phone")).getPhoneType() != 0;
    }

    private boolean d()
    {
        boolean flag = false;
        Object obj;
        try
        {
            obj = x.getSystemService("location");
        }
        catch (Exception exception)
        {
            return false;
        }
        if (obj != null)
        {
            flag = true;
        }
        return flag;
    }

    private int e()
    {
        Display display = ((WindowManager)x.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        return Math.round(displaymetrics.widthPixels);
    }

    private int f()
    {
        Display display = ((WindowManager)x.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        return Math.round(displaymetrics.heightPixels);
    }

    private String g()
    {
        String s2 = ((TelephonyManager)x.getSystemService("phone")).getNetworkCountryIso();
        String s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        return s1;
    }

    private String h()
    {
        String s2 = ((TelephonyManager)x.getSystemService("phone")).getSimCountryIso();
        String s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        return s1;
    }

    private String i()
    {
        Object obj;
        Object obj1;
        try
        {
            obj1 = (TelephonyManager)x.getSystemService("phone");
            obj = ((TelephonyManager) (obj1)).getSimCountryIso();
            obj1 = ((TelephonyManager) (obj1)).getNetworkCountryIso();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ct.a(((Throwable) (obj)));
            return "";
        }
        if (obj1 != null && obj1 != "")
        {
            if (obj == null)
            {
                return "";
            } else
            {
                return ((String) (obj));
            }
        } else
        {
            return ((String) (obj));
        }
    }

    private int j()
    {
        Display display = ((WindowManager)x.getSystemService("window")).getDefaultDisplay();
        PixelFormat pixelformat = new PixelFormat();
        PixelFormat.getPixelFormatInfo(display.getPixelFormat(), pixelformat);
        return pixelformat.bitsPerPixel;
    }

    private String k()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)x.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo != null)
        {
            if (networkinfo.getTypeName().compareToIgnoreCase("WIFI") == 0)
            {
                return "wifi";
            }
            if (networkinfo.getTypeName().compareToIgnoreCase("MOBILE") == 0)
            {
                return "cellular";
            }
            if (networkinfo.getTypeName() != null)
            {
                return networkinfo.getTypeName().toLowerCase();
            }
        }
        return "";
    }
}
