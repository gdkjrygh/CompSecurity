// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ab;

// Referenced classes of package com.google.a.b:
//            ap, bx

final class bu extends ap
    implements bx
{

    final int c;
    bu d;
    bx e;
    bx f;
    bu g;
    bu h;

    bu(Object obj, Object obj1, int i, bu bu1)
    {
        super(obj, obj1);
        c = i;
        d = bu1;
    }

    public final bx a()
    {
        return e;
    }

    public final void a(bx bx1)
    {
        e = bx1;
    }

    final boolean a(Object obj, int i)
    {
        return c == i && ab.a(getValue(), obj);
    }

    public final bx b()
    {
        return f;
    }

    public final void b(bx bx1)
    {
        f = bx1;
    }
}
