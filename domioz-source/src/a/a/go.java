// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


// Referenced classes of package a.a:
//            er, eh, fm, fz

final class go extends er
{

    final transient Object a;
    final transient Object b;
    transient er c;

    go(Object obj, Object obj1)
    {
        eh.a(obj, obj1);
        a = obj;
        b = obj1;
    }

    private go(Object obj, Object obj1, er er1)
    {
        a = obj;
        b = obj1;
        c = er1;
    }

    final fm a()
    {
        return fm.a(a);
    }

    final fm c()
    {
        return fm.a(fz.a(a, b));
    }

    public final er c_()
    {
        er er1 = c;
        Object obj = er1;
        if (er1 == null)
        {
            obj = new go(b, a, this);
            c = ((er) (obj));
        }
        return ((er) (obj));
    }

    public final boolean containsKey(Object obj)
    {
        return a.equals(obj);
    }

    public final boolean containsValue(Object obj)
    {
        return b.equals(obj);
    }

    final boolean e()
    {
        return false;
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

    public final int size()
    {
        return 1;
    }
}
