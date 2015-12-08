// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            gb, fr, gw, hj

final class hx extends gb
{

    final transient Object a;
    final transient Object b;
    transient gb c;

    hx(Object obj, Object obj1)
    {
        fr.a(obj, obj1);
        a = obj;
        b = obj1;
    }

    private hx(Object obj, Object obj1, gb gb1)
    {
        a = obj;
        b = obj1;
        c = gb1;
    }

    final gw a()
    {
        return gw.a(a);
    }

    final gw c()
    {
        return gw.a(hj.a(a, b));
    }

    public final gb c_()
    {
        gb gb1 = c;
        Object obj = gb1;
        if (gb1 == null)
        {
            obj = new hx(b, a, this);
            c = ((gb) (obj));
        }
        return ((gb) (obj));
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
