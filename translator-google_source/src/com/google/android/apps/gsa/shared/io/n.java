// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.io;

import com.google.android.apps.gsa.shared.exception.GsaIOException;
import com.google.common.base.p;

// Referenced classes of package com.google.android.apps.gsa.shared.io:
//            o, d, HttpException

public final class n
{

    private final GsaIOException a;
    private final o b;
    private final HttpException c;
    private final d d;

    public n(GsaIOException gsaioexception, o o1, HttpException httpexception, d d1)
    {
        boolean flag = true;
        boolean flag1 = true;
        super();
        if (gsaioexception != null)
        {
            if (o1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag);
            if (httpexception == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag);
            if (d1 == null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            p.a(flag);
        } else
        if (httpexception != null)
        {
            p.a(o1);
            if (d1 != null)
            {
                flag = false;
            }
            p.a(flag);
        } else
        {
            p.a(o1);
            p.a(d1);
        }
        a = gsaioexception;
        b = o1;
        c = httpexception;
        d = d1;
    }

    public final o a()
    {
        if (a != null)
        {
            throw a;
        } else
        {
            return (o)p.a(b);
        }
    }

    public final d b()
    {
        if (a != null)
        {
            throw a;
        }
        if (c != null)
        {
            throw c;
        } else
        {
            return (d)p.a(d);
        }
    }
}
