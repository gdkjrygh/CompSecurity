// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.NoSuchElementException;

// Referenced classes of package com.c.b:
//            e

private final class <init>
    implements ject
{

    final e a;
    private int b;
    private final int c;

    public final byte a()
    {
        if (b >= c)
        {
            throw new NoSuchElementException();
        } else
        {
            byte abyte0[] = a.c;
            int i = b;
            b = i + 1;
            return abyte0[i];
        }
    }

    public final boolean hasNext()
    {
        return b < c;
    }

    public final Object next()
    {
        return Byte.valueOf(a());
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }

    private ject(e e1)
    {
        a = e1;
        super();
        b = e1.b();
        c = b + e1.a();
    }

    b(e e1, byte byte0)
    {
        this(e1);
    }
}
