// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;


// Referenced classes of package com.google.a.b:
//            al, y, ca, be

final class dc extends al
{

    final transient Object a;
    final transient Object b;
    transient al c;

    dc(Object obj, Object obj1)
    {
        y.a(obj, obj1);
        a = obj;
        b = obj1;
    }

    private dc(Object obj, Object obj1, al al1)
    {
        a = obj;
        b = obj1;
        c = al1;
    }

    public final al a()
    {
        al al1 = c;
        Object obj = al1;
        if (al1 == null)
        {
            obj = new dc(b, a, this);
            c = ((al) (obj));
        }
        return ((al) (obj));
    }

    final be c()
    {
        return be.a(ca.a(a, b));
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

    final be i()
    {
        return be.a(a);
    }

    public final int size()
    {
        return 1;
    }
}
