// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

public final class bna extends bnd
{

    private String a;
    private String b;
    private boolean c;
    private int d;
    private boolean e;
    private boolean g;

    public bna(bnf bnf1)
    {
        super(bnf1);
    }

    protected final void a()
    {
        Object obj = super.f.a;
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
                int i = ((Bundle) (obj)).getInt("com.google.android.gms.analytics.globalConfigResource");
                if (i > 0)
                {
                    bmi bmi1 = (bmi)(new bob(super.f)).a(i);
                    if (bmi1 != null)
                    {
                        b("Loading global XML config values");
                        int j;
                        if (bmi1.a != null)
                        {
                            j = 1;
                        } else
                        {
                            j = 0;
                        }
                        if (j != 0)
                        {
                            String s = bmi1.a;
                            b = s;
                            b("XML config - app name", s);
                        }
                        if (bmi1.b != null)
                        {
                            j = 1;
                        } else
                        {
                            j = 0;
                        }
                        if (j != 0)
                        {
                            String s1 = bmi1.b;
                            a = s1;
                            b("XML config - app version", s1);
                        }
                        if (bmi1.c != null)
                        {
                            j = 1;
                        } else
                        {
                            j = 0;
                        }
                        if (j != 0)
                        {
                            String s2 = bmi1.c.toLowerCase();
                            if ("verbose".equals(s2))
                            {
                                j = 0;
                            } else
                            if ("info".equals(s2))
                            {
                                j = 1;
                            } else
                            if ("warning".equals(s2))
                            {
                                j = 2;
                            } else
                            if ("error".equals(s2))
                            {
                                j = 3;
                            } else
                            {
                                j = -1;
                            }
                            if (j >= 0)
                            {
                                a("XML config - log level", Integer.valueOf(j));
                            }
                        }
                        if (bmi1.d >= 0)
                        {
                            j = 1;
                        } else
                        {
                            j = 0;
                        }
                        if (j != 0)
                        {
                            j = bmi1.d;
                            d = j;
                            c = true;
                            b("XML config - dispatch period (sec)", Integer.valueOf(j));
                        }
                        if (bmi1.e != -1)
                        {
                            j = 1;
                        } else
                        {
                            j = 0;
                        }
                        if (j != 0)
                        {
                            boolean flag;
                            if (bmi1.e == 1)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            g = flag;
                            e = true;
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
        m();
        return a;
    }

    public final String c()
    {
        m();
        return b;
    }

    public final boolean d()
    {
        m();
        return false;
    }

    public final boolean e()
    {
        m();
        return c;
    }

    public final int f()
    {
        m();
        return d;
    }

    public final boolean g()
    {
        m();
        return e;
    }

    public final boolean h()
    {
        m();
        return g;
    }
}
