// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.g;

import com.ford.syncV4.d.a.f;
import com.ford.syncV4.d.e;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.ford.syncV4.g:
//            a, b, d

final class c
    implements a
{

    final b a;

    private c(b b1)
    {
        a = b1;
        super();
    }

    c(b b1, byte byte0)
    {
        this(b1);
    }

    public final void a(byte byte0)
    {
        for (Iterator iterator = com.ford.syncV4.g.b.a(a).iterator(); iterator.hasNext(); ((d)iterator.next()).a(byte0)) { }
    }

    public final void a(f f, byte byte0, byte byte1, String s)
    {
        Iterator iterator = com.ford.syncV4.g.b.a(a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            d d1 = (d)iterator.next();
            if (d1.d() != 0)
            {
                continue;
            }
            d1.a(f, byte0, byte1, s);
            break;
        } while (true);
    }

    public final void a(f f, byte byte0, String s)
    {
        d d1 = com.ford.syncV4.g.b.a(a, byte0);
        if (d1 != null)
        {
            d1.a(f, byte0, s);
        }
    }

    public final void a(e e1)
    {
        d d1 = com.ford.syncV4.g.b.a(a, e1.b());
        if (d1 != null)
        {
            d1.a(e1);
        }
    }

    public final void a(String s)
    {
        for (Iterator iterator = com.ford.syncV4.g.b.a(a).iterator(); iterator.hasNext(); ((d)iterator.next()).a(s)) { }
    }

    public final void a(String s, Exception exception)
    {
        for (Iterator iterator = com.ford.syncV4.g.b.a(a).iterator(); iterator.hasNext(); ((d)iterator.next()).a(s, exception)) { }
    }

    public final void b(String s, Exception exception)
    {
        for (Iterator iterator = com.ford.syncV4.g.b.a(a).iterator(); iterator.hasNext(); ((d)iterator.next()).b(s, exception)) { }
    }
}
