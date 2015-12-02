// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Set;

// Referenced classes of package com.google.common.a:
//            fe, ev, kf, fi, 
//            mh

class ke extends fe
{

    private final transient ev a;
    private final transient int b;

    ke(ev ev1, int i)
    {
        a = ev1;
        b = i;
    }

    public int a(Object obj)
    {
        obj = (Integer)a.get(obj);
        if (obj == null)
        {
            return 0;
        } else
        {
            return ((Integer) (obj)).intValue();
        }
    }

    boolean a()
    {
        return a.d();
    }

    public fi c()
    {
        return a.i_();
    }

    public boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    mh d()
    {
        return new kf(this, a.a().h_());
    }

    int e()
    {
        return a.size();
    }

    public Set f()
    {
        return c();
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public int size()
    {
        return b;
    }
}
