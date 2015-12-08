// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.k;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okio.c;
import okio.d;
import okio.e;
import okio.r;
import okio.s;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            h, b

public final class d
    implements r
{

    boolean a;
    final e b;
    final b c;
    final d d;
    final h e;

    public final long a(c c1, long l)
        throws IOException
    {
        try
        {
            l = b.a(c1, l);
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            if (!a)
            {
                a = true;
                c.a();
            }
            throw c1;
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
            c1.a(d.b(), c1.b - l, l);
            d.s();
            return l;
        }
    }

    public final void close()
        throws IOException
    {
        if (!a && !k.a(this, TimeUnit.MILLISECONDS))
        {
            a = true;
            c.a();
        }
        b.close();
    }

    public final s q_()
    {
        return b.q_();
    }

    public (h h1, e e1, b b1, d d1)
    {
        e = h1;
        b = e1;
        c = b1;
        d = d1;
        super();
    }
}
