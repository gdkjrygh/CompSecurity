// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.d;
import com.squareup.okhttp.internal.k;
import java.io.IOException;
import java.net.Socket;
import okio.e;
import okio.i;
import okio.r;
import okio.s;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            f

private abstract class <init>
    implements r
{

    protected final i a;
    protected boolean b;
    final f c;

    protected final void a(boolean flag)
        throws IOException
    {
        if (c.e != 5)
        {
            throw new IllegalStateException((new StringBuilder("state: ")).append(c.e).toString());
        }
        f.a(a);
        c.e = 0;
        if (flag && c.f == 1)
        {
            c.f = 0;
            d.b.a(c.a, c.b);
        } else
        if (c.f == 2)
        {
            c.e = 6;
            c.b.c.close();
            return;
        }
    }

    protected final void b()
    {
        k.a(c.b.c);
        c.e = 6;
    }

    public final s q_()
    {
        return a;
    }

    private (f f1)
    {
        c = f1;
        super();
        a = new i(c.c.q_());
    }

    c(f f1, byte byte0)
    {
        this(f1);
    }
}
