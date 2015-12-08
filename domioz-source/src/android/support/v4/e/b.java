// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.e;

import java.util.Map;

// Referenced classes of package android.support.v4.e:
//            g, a

final class b extends g
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    protected final int a()
    {
        return a.h;
    }

    protected final int a(Object obj)
    {
        return a.a(obj);
    }

    protected final Object a(int i, int j)
    {
        return a.g[(i << 1) + j];
    }

    protected final Object a(int i, Object obj)
    {
        return a.a(i, obj);
    }

    protected final void a(int i)
    {
        a.d(i);
    }

    protected final void a(Object obj, Object obj1)
    {
        a.put(obj, obj1);
    }

    protected final int b(Object obj)
    {
        return a.b(obj);
    }

    protected final Map b()
    {
        return a;
    }

    protected final void c()
    {
        a.clear();
    }
}
