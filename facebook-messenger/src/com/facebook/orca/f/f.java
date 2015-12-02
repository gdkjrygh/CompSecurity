// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;


// Referenced classes of package com.facebook.orca.f:
//            e

class f
{

    private final Object a;
    private final long b;

    private f(Object obj, long l)
    {
        a = obj;
        b = l;
    }

    f(Object obj, long l, e e)
    {
        this(obj, l);
    }

    static long a(f f1)
    {
        return f1.b;
    }

    static Object b(f f1)
    {
        return f1.a;
    }
}
