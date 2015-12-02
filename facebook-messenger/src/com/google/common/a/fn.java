// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;

// Referenced classes of package com.google.common.a:
//            ex, kk, fi, ev, 
//            fy, em

public class fn extends ex
    implements kk
{

    private final transient fy a;
    private transient fi d;

    public fi a()
    {
        fi fi2 = d;
        fi fi1 = fi2;
        if (fi2 == null)
        {
            fi1 = fi.a(super.n());
            d = fi1;
        }
        return fi1;
    }

    public fi a(Object obj)
    {
        obj = (fi)b.get(obj);
        if (obj != null)
        {
            return ((fi) (obj));
        }
        if (a != null)
        {
            return a;
        } else
        {
            return fi.d();
        }
    }

    public fi b(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public Collection c(Object obj)
    {
        return a(obj);
    }

    public Collection d(Object obj)
    {
        return b(obj);
    }

    public em e(Object obj)
    {
        return a(obj);
    }

    public em g(Object obj)
    {
        return b(obj);
    }

    public Collection i()
    {
        return a();
    }

    public em n()
    {
        return a();
    }
}
