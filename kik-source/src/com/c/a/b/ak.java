// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;


// Referenced classes of package com.c.a.b:
//            j, d, ac, v

final class ak extends j
{

    final transient Object a;
    final transient Object b;
    transient j c;

    ak(Object obj, Object obj1)
    {
        d.a(obj, obj1);
        a = obj;
        b = obj1;
    }

    private ak(Object obj, Object obj1, j j1)
    {
        a = obj;
        b = obj1;
        c = j1;
    }

    public final j a()
    {
        j j1 = c;
        Object obj = j1;
        if (j1 == null)
        {
            obj = new ak(b, a, this);
            c = ((j) (obj));
        }
        return ((j) (obj));
    }

    final v c()
    {
        return v.a(ac.a(a, b));
    }

    public final boolean containsKey(Object obj)
    {
        return a.equals(obj);
    }

    public final boolean containsValue(Object obj)
    {
        return b.equals(obj);
    }

    public final Object get(Object obj)
    {
        if (a.equals(obj))
        {
            return b;
        } else
        {
            return null;
        }
    }

    final v i()
    {
        return v.a(a);
    }

    public final int size()
    {
        return 1;
    }
}
