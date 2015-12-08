// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;


// Referenced classes of package com.google.android.m4b.maps.aa:
//            z, bb, al, ax

final class bp extends z
{

    private transient Object a;
    private transient Object b;
    private transient z c;

    bp(Object obj, Object obj1)
    {
        bb.a(obj, obj1);
        a = obj;
        b = obj1;
    }

    private bp(Object obj, Object obj1, z z1)
    {
        a = obj;
        b = obj1;
        c = z1;
    }

    final al a()
    {
        return al.a(a);
    }

    final al b()
    {
        return al.a(ax.a(a, b));
    }

    final boolean c()
    {
        return false;
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

    public final z i()
    {
        z z1 = c;
        Object obj = z1;
        if (z1 == null)
        {
            obj = new bp(b, a, this);
            c = ((z) (obj));
        }
        return ((z) (obj));
    }

    public final int size()
    {
        return 1;
    }
}
