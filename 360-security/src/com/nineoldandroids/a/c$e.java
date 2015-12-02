// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import java.util.ArrayList;

// Referenced classes of package com.nineoldandroids.a:
//            c, a

private static class a
    implements Cloneable
{

    public a a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public boolean f;

    public a a()
    {
        a a1;
        try
        {
            a1 = (dException)super.clone();
            a1.a = a.h();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError();
        }
        return a1;
    }

    public void a(init> init>)
    {
        if (b == null)
        {
            b = new ArrayList();
            d = new ArrayList();
        }
        b.add(init>);
        if (!d.contains(init>.a))
        {
            d.add(init>.a);
        }
        init> = init>.a;
        if (((a) (init>)).e == null)
        {
            init>.e = new ArrayList();
        }
        (() (init>)).e.add(this);
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return a();
    }

    public dException(a a1)
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = false;
        a = a1;
    }
}
