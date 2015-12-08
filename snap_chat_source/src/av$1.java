// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class nit> extends aB
{

    private av d;

    protected final int a()
    {
        return d.c;
    }

    protected final int a(Object obj)
    {
        return d.a(obj);
    }

    protected final Object a(int i, int j)
    {
        return d.b[(i << 1) + j];
    }

    protected final Object a(int i, Object obj)
    {
        return d.a(i, obj);
    }

    protected final void a(int i)
    {
        d.d(i);
    }

    protected final void a(Object obj, Object obj1)
    {
        d.put(obj, obj1);
    }

    protected final int b(Object obj)
    {
        return d.b(obj);
    }

    protected final Map b()
    {
        return d;
    }

    protected final void c()
    {
        d.clear();
    }

    >(av av1)
    {
        d = av1;
        super();
    }
}
