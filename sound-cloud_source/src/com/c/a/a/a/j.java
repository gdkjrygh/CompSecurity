// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import c.e;
import c.g;
import c.h;
import c.y;
import c.z;
import com.c.a.a.i;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.c.a.a.a:
//            b, h

public final class j
    implements y
{

    boolean a;
    final h b;
    final b c;
    final g d;
    final com.c.a.a.a.h e;

    public j(com.c.a.a.a.h h1, h h2, b b1, g g1)
    {
        e = h1;
        b = h2;
        c = b1;
        d = g1;
        super();
    }

    public final long a(e e1, long l)
        throws IOException
    {
        try
        {
            l = b.a(e1, l);
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            if (!a)
            {
                a = true;
            }
            throw e1;
        }
        if (l == -1L)
        {
            if (!a)
            {
                a = true;
                d.close();
            }
            return -1L;
        } else
        {
            e1.a(d.a(), e1.b - l, l);
            d.o();
            return l;
        }
    }

    public final void close()
        throws IOException
    {
        if (!a && !i.a(this, TimeUnit.MILLISECONDS))
        {
            a = true;
        }
        b.close();
    }

    public final z timeout()
    {
        return b.timeout();
    }
}
