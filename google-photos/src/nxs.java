// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public abstract class nxs
    implements nyf
{

    private static final oqe a = new oqe("debug.plus.apiary_token", "");
    private static final oqe b = new oqe("debug.plus.backend.url", "");
    private static final onh c = new onh("debug.plus.tracing_enabled");
    private static final oqe d = new oqe("debug.plus.tracing_token", "");
    private static final oqe e = new oqe("debug.plus.tracing_path", "");
    private static final oqe f = new oqe("debug.plus.tracing_level", "");
    private static final oqe g = new oqe("debug.plus.experiment_override", "");

    public nxs()
    {
    }

    public String a()
    {
        return f.a;
    }

    public final String b()
    {
        return a.a;
    }

    public final boolean c()
    {
        return false;
    }

    public final String d()
    {
        return d.a;
    }

    public final String e()
    {
        String s1 = e.a;
        String s = s1;
        if (s1 != null)
        {
            s = s1.trim();
        }
        s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = ".*";
        }
        return s1;
    }

    public final String f()
    {
        return g.a;
    }

}
