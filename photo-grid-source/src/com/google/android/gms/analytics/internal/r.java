// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            y, bj, c, aa

public final class r extends y
{

    protected String a;
    protected String b;
    protected boolean c;
    protected int d;
    protected boolean e;
    protected int f;
    protected boolean g;
    protected boolean h;

    public r(aa aa)
    {
        super(aa);
    }

    protected final void a()
    {
        Object obj = m();
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
                int j = ((Bundle) (obj)).getInt("com.google.android.gms.analytics.globalConfigResource");
                if (j > 0)
                {
                    c c1 = (c)(new bj(j())).a(j);
                    if (c1 != null)
                    {
                        b("Loading global XML config values");
                        int k;
                        if (c1.a != null)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        if (k != 0)
                        {
                            String s = c1.a;
                            b = s;
                            b("XML config - app name", s);
                        }
                        if (c1.b != null)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        if (k != 0)
                        {
                            String s1 = c1.b;
                            a = s1;
                            b("XML config - app version", s1);
                        }
                        if (c1.c != null)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        if (k != 0)
                        {
                            String s2 = c1.c.toLowerCase();
                            if ("verbose".equals(s2))
                            {
                                k = 0;
                            } else
                            if ("info".equals(s2))
                            {
                                k = 1;
                            } else
                            if ("warning".equals(s2))
                            {
                                k = 2;
                            } else
                            if ("error".equals(s2))
                            {
                                k = 3;
                            } else
                            {
                                k = -1;
                            }
                            if (k >= 0)
                            {
                                d = k;
                                a("XML config - log level", Integer.valueOf(k));
                            }
                        }
                        if (c1.d >= 0)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        if (k != 0)
                        {
                            k = c1.d;
                            f = k;
                            e = true;
                            b("XML config - dispatch period (sec)", Integer.valueOf(k));
                        }
                        if (c1.e != -1)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        if (k != 0)
                        {
                            boolean flag;
                            if (c1.e == 1)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            h = flag;
                            g = true;
                            b("XML config - dry run", Boolean.valueOf(flag));
                            return;
                        }
                    }
                }
            }
        }
    }

    public final String b()
    {
        B();
        return a;
    }

    public final String c()
    {
        B();
        return b;
    }

    public final boolean d()
    {
        B();
        return c;
    }

    public final int e()
    {
        B();
        return d;
    }

    public final boolean f()
    {
        B();
        return e;
    }

    public final int g()
    {
        B();
        return f;
    }

    public final boolean h()
    {
        B();
        return g;
    }

    public final boolean i()
    {
        B();
        return h;
    }
}
