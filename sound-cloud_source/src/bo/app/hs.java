// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            fw, fm, gr, he

final class hs extends fw
{

    final transient Object a;
    final transient Object b;
    transient fw c;

    hs(Object obj, Object obj1)
    {
        fm.a(obj, obj1);
        a = obj;
        b = obj1;
    }

    private hs(Object obj, Object obj1, fw fw1)
    {
        a = obj;
        b = obj1;
        c = fw1;
    }

    final gr a()
    {
        return gr.a(a);
    }

    final gr c()
    {
        return gr.a(he.a(a, b));
    }

    public final fw c_()
    {
        fw fw1 = c;
        Object obj = fw1;
        if (fw1 == null)
        {
            obj = new hs(b, a, this);
            c = ((fw) (obj));
        }
        return ((fw) (obj));
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
