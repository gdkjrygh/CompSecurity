// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            r, b, an, t

public class o extends r
{

    protected String a;
    protected String b;
    protected boolean c;
    protected int d;
    protected boolean e;
    protected int f;
    protected boolean g;
    protected boolean h;

    public o(t t)
    {
        super(t);
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

    void a(b b1)
    {
        b("Loading global XML config values");
        if (b1.a())
        {
            String s = b1.b();
            b = s;
            b("XML config - app name", s);
        }
        if (b1.c())
        {
            String s1 = b1.d();
            a = s1;
            b("XML config - app version", s1);
        }
        if (b1.e())
        {
            int k = a(b1.f());
            if (k >= 0)
            {
                d = k;
                a("XML config - log level", Integer.valueOf(k));
            }
        }
        if (b1.g())
        {
            int l = b1.h();
            f = l;
            e = true;
            b("XML config - dispatch period (sec)", Integer.valueOf(l));
        }
        if (b1.i())
        {
            boolean flag = b1.j();
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
                    b b1 = (b)(new an(k())).a(k);
                    if (b1 != null)
                    {
                        a(b1);
                        return;
                    }
                }
            }
        }
    }
}
