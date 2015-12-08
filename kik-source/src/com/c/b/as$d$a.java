// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Iterator;

// Referenced classes of package com.c.b:
//            as, ar, aw, h, 
//            bd

protected final class <init>
{

    final c a;
    private final Iterator b;
    private java.util.ry c;
    private final boolean d;

    public final void a(h h1)
    {
        while (c != null && ((c)c.getKey()).tKey() < 0x20000000) 
        {
            t t = (tKey)c.getKey();
            if (d && t.d() == d && !t.d())
            {
                if (c instanceof c)
                {
                    h1.b(t.c(), ((c)c).c().c());
                } else
                {
                    h1.c(t.c(), (bd)c.getValue());
                }
            } else
            {
                ar.a(t, c.getValue(), h1);
            }
            if (b.hasNext())
            {
                c = (java.util.ry)b.next();
            } else
            {
                c = null;
            }
        }
    }

    private ntry(ntry ntry)
    {
        a = ntry;
        super();
        b = b(a).g();
        if (b.hasNext())
        {
            c = (java.util.ry)b.next();
        }
        d = false;
    }

    d(d d1, byte byte0)
    {
        this(d1);
    }
}
