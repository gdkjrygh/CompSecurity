// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzaa, zzz, zzf

public class zzan extends zzd
{

    protected String a;
    protected String b;
    protected boolean c;
    protected int d;
    protected boolean e;
    protected int f;
    protected boolean g;
    protected boolean h;

    public zzan(zzf zzf)
    {
        super(zzf);
    }

    private static int a(String s)
    {
        s = s.toLowerCase();
        if ("verbose".equals(s))
        {
            return 0;
        }
        if ("info".equals(s))
        {
            return 1;
        }
        if ("warning".equals(s))
        {
            return 2;
        }
        return !"error".equals(s) ? -1 : 3;
    }

    protected void a()
    {
        j();
    }

    void a(zzaa zzaa1)
    {
        b("Loading global XML config values");
        if (zzaa1.a())
        {
            String s = zzaa1.b();
            b = s;
            b("XML config - app name", s);
        }
        if (zzaa1.c())
        {
            String s1 = zzaa1.d();
            a = s1;
            b("XML config - app version", s1);
        }
        if (zzaa1.e())
        {
            int k = a(zzaa1.f());
            if (k >= 0)
            {
                d = k;
                a("XML config - log level", Integer.valueOf(k));
            }
        }
        if (zzaa1.g())
        {
            int l = zzaa1.h();
            f = l;
            e = true;
            b("XML config - dispatch period (sec)", Integer.valueOf(l));
        }
        if (zzaa1.i())
        {
            boolean flag = zzaa1.j();
            h = flag;
            g = true;
            b("XML config - dry run", Boolean.valueOf(flag));
        }
    }

    public String b()
    {
        D();
        return a;
    }

    public String c()
    {
        D();
        return b;
    }

    public boolean d()
    {
        D();
        return c;
    }

    public int e()
    {
        D();
        return d;
    }

    public boolean f()
    {
        D();
        return e;
    }

    public int g()
    {
        D();
        return f;
    }

    public boolean h()
    {
        D();
        return g;
    }

    public boolean i()
    {
        D();
        return h;
    }

    protected void j()
    {
        Object obj = o();
        try
        {
            obj = ((Context) (obj)).getPackageManager().getApplicationInfo(((Context) (obj)).getPackageName(), 129);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d("PackageManager doesn't know about the app package", obj);
            obj = null;
        }
        if (obj == null)
        {
            e("Couldn't get ApplicationInfo to load global config");
        } else
        {
            obj = ((ApplicationInfo) (obj)).metaData;
            if (obj != null)
            {
                int k = ((Bundle) (obj)).getInt("com.google.android.gms.analytics.globalConfigResource");
                if (k > 0)
                {
                    zzaa zzaa1 = (zzaa)(new zzz(k())).a(k);
                    if (zzaa1 != null)
                    {
                        a(zzaa1);
                        return;
                    }
                }
            }
        }
    }
}
