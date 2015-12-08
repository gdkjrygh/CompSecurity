// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.a.c;

import com.google.b.b.a;

// Referenced classes of package com.google.b.a.c:
//            f, b

abstract class h
{

    static final h a = new f(null, 0, 0);
    private final h b;

    h(h h1)
    {
        b = h1;
    }

    final h a()
    {
        return b;
    }

    final h a(int i, int j)
    {
        return new f(this, i, j);
    }

    abstract void a(a a1, byte abyte0[]);

    final h b(int i, int j)
    {
        return new b(this, i, j);
    }

}
