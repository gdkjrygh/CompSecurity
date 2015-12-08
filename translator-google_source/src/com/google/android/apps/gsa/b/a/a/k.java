// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.b.a.a;

import com.google.android.apps.gsa.shared.io.HttpException;
import com.google.android.apps.gsa.shared.io.HttpUnavailableException;
import com.google.android.apps.gsa.shared.io.a;
import com.google.android.apps.gsa.shared.io.b;
import com.google.android.apps.gsa.shared.io.c;
import com.google.android.apps.gsa.shared.io.g;
import com.google.android.apps.gsa.shared.io.l;
import com.google.android.apps.gsa.shared.io.n;
import com.google.android.apps.gsa.shared.io.o;
import com.google.android.apps.gsa.shared.util.e;
import com.google.common.base.p;
import com.google.common.util.concurrent.t;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.apps.gsa.b.a.a:
//            d, q, j

final class k
    implements g
{

    private final d a;
    private final l b;
    private final c c;
    private int d;
    private b e;
    private q f;
    private InputStream g;

    k(l l1, d d1)
    {
        b = (l)p.a(l1);
        a = (d)p.a(d1);
        c = (c)p.a(d1.a);
        d = 1;
        d();
        c();
    }

    k(l l1, d d1, b b1, q q1)
    {
        e = (b)p.a(b1);
        b = (l)p.a(l1);
        a = (d)p.a(d1);
        f = (q)p.a(q1);
        c = (c)p.a(d1.a);
        d = 1;
    }

    private void d()
    {
        boolean flag = true;
        if (d != 1)
        {
            flag = false;
        }
        p.b(flag);
        e();
        f = null;
        d = 2;
    }

    private n e()
    {
        n n1;
        try
        {
            n1 = (n)a.b.get();
        }
        catch (InterruptedException interruptedexception)
        {
            throw c.a(0x4002b, interruptedexception);
        }
        catch (ExecutionException executionexception)
        {
            throw c.a(0x4002d, executionexception);
        }
        return n1;
    }

    public final void a()
    {
        a.a();
        d = 3;
    }

    public final void a(byte abyte0[], int i, boolean flag)
    {
        boolean flag2 = true;
        boolean flag1;
        if (d == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.b(flag1);
        if (f != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.b(flag1);
        p.a(true);
        if (i <= abyte0.length)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1);
        flag1 = flag2;
        if (i <= 0)
        {
            if (i == 0 && flag)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
        }
        p.a(flag1);
        c.a(i);
        ByteBuffer bytebuffer;
        for (abyte0 = ByteBuffer.wrap(abyte0, 0, i); abyte0.hasRemaining(); f.a(e.a(bytebuffer)))
        {
            bytebuffer = e.a();
            com.google.android.apps.gsa.shared.util.e.a(abyte0, bytebuffer);
        }

        if (flag)
        {
            f.a(a.a);
            d();
        }
    }

    public final o b()
    {
        boolean flag;
        if (d == 2 || d == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        return (o)p.a(e().a());
    }

    public final InputStream c()
    {
        boolean flag;
        if (d == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        if (g == null)
        {
            g = new j(this, e().b(), c);
            try
            {
                b().a(b.s);
            }
            catch (HttpException httpexception)
            {
                if (httpexception.getErrorCode() == 503)
                {
                    throw c.a(0x4001a, new HttpUnavailableException(b(), b.f.toString()));
                } else
                {
                    throw httpexception;
                }
            }
        }
        return g;
    }

    public final String toString()
    {
        return String.format("HttpConnection(%s)", new Object[] {
            b.f
        });
    }
}
