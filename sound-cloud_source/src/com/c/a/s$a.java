// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import c.e;
import c.g;
import c.i;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.c.a:
//            x, s, r, p

private static final class st extends x
{

    private final i a;
    private final r b;
    private final List c;
    private final List d;
    private long e;

    private long a(g g1, boolean flag)
        throws IOException
    {
        long l1 = 0L;
        g g2;
        x x1;
        Object obj;
        int j;
        int k;
        int l;
        int i1;
        long l2;
        if (flag)
        {
            g1 = new e();
            g2 = g1;
        } else
        {
            g2 = null;
        }
        l = c.size();
        j = 0;
        if (j >= l) goto _L2; else goto _L1
_L1:
        obj = (p)c.get(j);
        x1 = (x)d.get(j);
        g1.b(s.a());
        g1.b(a);
        g1.b(s.b());
        if (obj != null)
        {
            k = 0;
            for (i1 = ((p) (obj)).a.length / 2; k < i1; k++)
            {
                g1.b(((p) (obj)).a(k)).b(s.c()).b(((p) (obj)).b(k)).b(s.b());
            }

        }
        obj = x1.contentType();
        if (obj != null)
        {
            g1.b("Content-Type: ").b(((r) (obj)).toString()).b(s.b());
        }
        l2 = x1.contentLength();
        if (l2 == -1L) goto _L4; else goto _L3
_L3:
        g1.b("Content-Length: ").j(l2).b(s.b());
_L6:
        g1.b(s.b());
        if (flag)
        {
            l1 = l2 + l1;
        } else
        {
            ((x)d.get(j)).writeTo(g1);
        }
        g1.b(s.b());
        j++;
        break MISSING_BLOCK_LABEL_31;
_L4:
        if (!flag) goto _L6; else goto _L5
_L5:
        g2.n();
        l2 = -1L;
_L8:
        return l2;
_L2:
        g1.b(s.a());
        g1.b(a);
        g1.b(s.a());
        g1.b(s.b());
        l2 = l1;
        if (flag)
        {
            l2 = ((e) (g2)).b;
            g2.n();
            return l1 + l2;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final long contentLength()
        throws IOException
    {
        long l = e;
        if (l != -1L)
        {
            return l;
        } else
        {
            long l1 = a(null, true);
            e = l1;
            return l1;
        }
    }

    public final r contentType()
    {
        return b;
    }

    public final void writeTo(g g1)
        throws IOException
    {
        a(g1, false);
    }

    public st(r r1, i j, List list, List list1)
    {
        e = -1L;
        if (r1 == null)
        {
            throw new NullPointerException("type == null");
        } else
        {
            a = j;
            b = r.a((new StringBuilder()).append(r1).append("; boundary=").append(j.a()).toString());
            c = com.c.a.a.i.a(list);
            d = com.c.a.a.i.a(list1);
            return;
        }
    }
}
