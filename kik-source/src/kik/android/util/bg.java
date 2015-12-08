// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Context;
import com.kik.m.a;
import java.util.Properties;

public final class bg extends a
{

    private String a;
    private String b;
    private String c;
    private String d;
    private boolean e;

    public bg(Context context)
    {
        super(context);
        e = false;
        h();
    }

    private void h()
    {
        Properties properties = b();
        if (properties != null)
        {
            a = properties.getProperty("branch_name");
            b = properties.getProperty("build_time");
            c = properties.getProperty("commit_hash");
            d = properties.getProperty("hostname");
            e = Boolean.valueOf(properties.getProperty("automation_enabled")).booleanValue();
        }
    }

    public final String c()
    {
        if (a == null)
        {
            h();
        }
        return a;
    }

    public final String d()
    {
        if (b == null)
        {
            h();
        }
        return b;
    }

    public final String e()
    {
        if (d == null)
        {
            h();
        }
        return d;
    }

    public final String f()
    {
        if (c == null)
        {
            h();
        }
        return c;
    }

    public final boolean g()
    {
        return e;
    }
}
