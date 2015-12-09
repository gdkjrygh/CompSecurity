// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.f;

import java.util.Map;

// Referenced classes of package android.support.v4.f:
//            g, a

class b extends g
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    protected int a()
    {
        return a.h;
    }

    protected int a(Object obj)
    {
        return a.a(obj);
    }

    protected Object a(int i, int j)
    {
        return a.g[(i << 1) + j];
    }

    protected Object a(int i, Object obj)
    {
        return a.a(i, obj);
    }

    protected void a(int i)
    {
        a.d(i);
    }

    protected void a(Object obj, Object obj1)
    {
        a.put(obj, obj1);
    }

    protected int b(Object obj)
    {
        return a.b(obj);
    }

    protected Map b()
    {
        return a;
    }

    protected void c()
    {
        a.clear();
    }
}
