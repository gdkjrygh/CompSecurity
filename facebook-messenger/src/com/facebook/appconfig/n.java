// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appconfig;

import com.facebook.common.bundle.ImmutableBundle;
import com.facebook.common.w.t;

// Referenced classes of package com.facebook.appconfig:
//            AppConfig, b

public abstract class n
{

    protected final b a;

    public n(b b1)
    {
        a = b1;
    }

    private Object a(String s)
    {
        AppConfig appconfig = g();
        if (appconfig != null)
        {
            return appconfig.a().a(s);
        } else
        {
            return null;
        }
    }

    protected int a(String s, int i)
    {
        s = ((String) (a(s)));
        if (s == null)
        {
            return i;
        } else
        {
            return t.a(s, i);
        }
    }

    protected String a(String s, String s1)
    {
        s = ((String) (a(s)));
        if (s == null)
        {
            return s1;
        } else
        {
            return s.toString();
        }
    }

    public long f()
    {
        AppConfig appconfig = g();
        if (appconfig != null)
        {
            return appconfig.b();
        } else
        {
            return 0L;
        }
    }

    protected AppConfig g()
    {
        return a.a();
    }
}
