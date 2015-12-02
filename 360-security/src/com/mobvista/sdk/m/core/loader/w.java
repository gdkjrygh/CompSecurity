// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;


// Referenced classes of package com.mobvista.sdk.m.core.loader:
//            t, v, u

final class w
    implements t
{

    final v a;

    w(v v1)
    {
        a = v1;
        super();
    }

    private void a()
    {
        synchronized (a.a)
        {
            u.a(a.a).setSuccess(true);
            v.a(a);
        }
    }

    public final boolean a(String s)
    {
        boolean flag = v.a(a, s);
        if (flag)
        {
            a();
        }
        return flag;
    }

    public final boolean b(String s)
    {
        boolean flag = v.a(a, s);
        if (flag)
        {
            a();
        }
        return flag;
    }

    public final void c(String s)
    {
        v.a(a, s);
        a();
    }
}
