// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            fv, fl, gq, hd

final class hr extends fv
{

    final transient Object a;
    final transient Object b;
    transient fv c;

    hr(Object obj, Object obj1)
    {
        fl.a(obj, obj1);
        a = obj;
        b = obj1;
    }

    private hr(Object obj, Object obj1, fv fv1)
    {
        a = obj;
        b = obj1;
        c = fv1;
    }

    final gq a()
    {
        return gq.a(a);
    }

    final gq c()
    {
        return gq.a(hd.a(a, b));
    }

    public final fv c_()
    {
        fv fv1 = c;
        Object obj = fv1;
        if (fv1 == null)
        {
            obj = new hr(b, a, this);
            c = ((fv) (obj));
        }
        return ((fv) (obj));
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
