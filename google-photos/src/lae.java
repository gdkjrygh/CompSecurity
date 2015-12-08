// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class lae extends lag
{

    private lad d;

    lae(lad lad1)
    {
        d = lad1;
        super();
    }

    protected final int a()
    {
        return d.c;
    }

    protected final int a(Object obj)
    {
        if (obj == null)
        {
            return d.a();
        } else
        {
            return d.a(obj, obj.hashCode());
        }
    }

    protected final Object a(int i, int j)
    {
        return d.b[(i << 1) + j];
    }

    protected final Object a(int i, Object obj)
    {
        lad lad1 = d;
        i = (i << 1) + 1;
        Object obj1 = ((lam) (lad1)).b[i];
        ((lam) (lad1)).b[i] = obj;
        return obj1;
    }

    protected final void a(int i)
    {
        d.b(i);
    }

    protected final void a(Object obj, Object obj1)
    {
        d.put(obj, obj1);
    }

    protected final int b(Object obj)
    {
        return d.a(obj);
    }

    protected final Map b()
    {
        return d;
    }

    protected final void c()
    {
        d.clear();
    }
}
