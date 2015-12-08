// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

public final class jsv extends jsw
{

    private String a;
    private String b;
    private int c;
    private boolean e;
    private int f;
    private boolean g;
    private boolean h;

    public jsv(jrk jrk)
    {
        super(jrk);
    }

    protected final void a()
    {
        Object obj = h();
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
                    jte jte1 = (jte)(new jtd(super.d)).a(i);
                    if (jte1 != null)
                    {
                        b("Loading global XML config values");
                        int j;
                        if (jte1.a != null)
                        {
                            j = 1;
                        } else
                        {
                            j = 0;
                        }
                        if (j != 0)
                        {
                            String s = jte1.a;
                            b = s;
                            b("XML config - app name", s);
                        }
                        if (jte1.b != null)
                        {
                            j = 1;
                        } else
                        {
                            j = 0;
                        }
                        if (j != 0)
                        {
                            String s1 = jte1.b;
                            a = s1;
                            b("XML config - app version", s1);
                        }
                        if (jte1.c != null)
                        {
                            j = 1;
                        } else
                        {
                            j = 0;
                        }
                        if (j != 0)
                        {
                            String s2 = jte1.c.toLowerCase();
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
                                c = j;
                                a("XML config - log level", Integer.valueOf(j));
                            }
                        }
                        if (jte1.d >= 0)
                        {
                            j = 1;
                        } else
                        {
                            j = 0;
                        }
                        if (j != 0)
                        {
                            j = jte1.d;
                            f = j;
                            e = true;
                            b("XML config - dispatch period (sec)", Integer.valueOf(j));
                        }
                        if (jte1.e != -1)
                        {
                            j = 1;
                        } else
                        {
                            j = 0;
                        }
                        if (j != 0)
                        {
                            boolean flag;
                            if (jte1.e == 1)
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
        r();
        return a;
    }

    public final String c()
    {
        r();
        return b;
    }

    public final boolean d()
    {
        r();
        return false;
    }

    public final int e()
    {
        r();
        return c;
    }

    public final boolean m()
    {
        r();
        return e;
    }

    public final int n()
    {
        r();
        return f;
    }

    public final boolean o()
    {
        r();
        return g;
    }

    public final boolean p()
    {
        r();
        return h;
    }
}
