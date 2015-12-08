// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import c.h;
import c.y;
import c.z;
import com.c.a.a.a;
import com.c.a.i;
import java.io.IOException;
import java.net.Socket;

// Referenced classes of package com.c.a.a.a:
//            e

private abstract class <init>
    implements y
{

    protected boolean a;
    final e b;

    protected final void a()
    {
        com.c.a.a.i.a(b.b.c);
        b.e = 6;
    }

    protected final void a(boolean flag)
        throws IOException
    {
        if (b.e != 5)
        {
            throw new IllegalStateException((new StringBuilder("state: ")).append(b.e).toString());
        }
        b.e = 0;
        if (flag && b.f == 1)
        {
            b.f = 0;
            a.b.a(b.a, b.b);
        } else
        if (b.f == 2)
        {
            b.e = 6;
            b.b.c.close();
            return;
        }
    }

    public z timeout()
    {
        return b.c.timeout();
    }

    private ion(e e1)
    {
        b = e1;
        super();
    }

    (e e1, byte byte0)
    {
        this(e1);
    }
}
