// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.bl;

// Referenced classes of package com.google.android.gms.common.api:
//            b, f, d, g

public final class a
{

    private final b a;
    private final f b = null;
    private final d c;
    private final g d = null;
    private final String e;

    public a(String s, b b1, d d1)
    {
        bl.a(b1, "Cannot construct an Api with a null ClientBuilder");
        bl.a(d1, "Cannot construct an Api with a null ClientKey");
        e = s;
        a = b1;
        c = d1;
    }

    public final b a()
    {
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.a(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return a;
    }

    public final f b()
    {
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.a(flag, "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return b;
    }

    public final d c()
    {
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.a(flag, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return c;
    }

    public final boolean d()
    {
        return d != null;
    }

    public final String e()
    {
        return e;
    }
}
