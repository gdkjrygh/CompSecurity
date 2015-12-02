// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import java.util.ArrayList;

// Referenced classes of package com.a.a:
//            a, h

class j
    implements Cloneable
{

    public a a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public boolean f;

    public j(a a1)
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = false;
        a = a1;
    }

    public j a()
    {
        j j1;
        try
        {
            j1 = (j)super.clone();
            j1.a = a.g();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError();
        }
        return j1;
    }

    public void a(h h1)
    {
        if (b == null)
        {
            b = new ArrayList();
            d = new ArrayList();
        }
        b.add(h1);
        if (!d.contains(h1.a))
        {
            d.add(h1.a);
        }
        h1 = h1.a;
        if (((j) (h1)).e == null)
        {
            h1.e = new ArrayList();
        }
        ((j) (h1)).e.add(this);
    }

    public Object clone()
    {
        return a();
    }
}
