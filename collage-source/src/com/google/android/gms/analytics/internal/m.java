// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            ad

public class m
    implements ad
{

    public String a;
    public double b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Map g;

    public m()
    {
        b = -1D;
        c = -1;
        d = -1;
        e = -1;
        f = -1;
        g = new HashMap();
    }

    public String a(Activity activity)
    {
        return a(activity.getClass().getCanonicalName());
    }

    public String a(String s)
    {
        String s1 = (String)g.get(s);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public boolean a()
    {
        return a != null;
    }

    public String b()
    {
        return a;
    }

    public boolean c()
    {
        return b >= 0.0D;
    }

    public double d()
    {
        return b;
    }

    public boolean e()
    {
        return c >= 0;
    }

    public int f()
    {
        return c;
    }

    public boolean g()
    {
        return d != -1;
    }

    public boolean h()
    {
        return d == 1;
    }

    public boolean i()
    {
        return e != -1;
    }

    public boolean j()
    {
        return e == 1;
    }

    public boolean k()
    {
        return f == 1;
    }
}
