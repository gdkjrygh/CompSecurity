// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.ProtocolException;
import java.util.List;

final class guj
    implements grm
{

    private final int a;
    private final grq b;
    private int c;
    private gui d;

    guj(gui gui1, int i, grq grq1)
    {
        d = gui1;
        super();
        a = i;
        b = grq1;
    }

    public final grq a()
    {
        return b;
    }

    public final grt a(grq grq1)
    {
        c = c + 1;
        if (a > 0)
        {
            grl grl1 = (grl)d.a.g.get(a - 1);
            gqk gqk1 = gui.a(d).b.a;
            if (!grq1.a.c.equals(gqk1.b) || grq1.a.d != gqk1.c)
            {
                throw new IllegalStateException((new StringBuilder("network interceptor ")).append(grl1).append(" must retain the same host and port").toString());
            }
            if (c > 1)
            {
                throw new IllegalStateException((new StringBuilder("network interceptor ")).append(grl1).append(" must call proceed() exactly once").toString());
            }
        }
        if (a >= d.a.g.size()) goto _L2; else goto _L1
_L1:
        guj guj1 = new guj(d, a + 1, grq1);
        grl grl2 = (grl)d.a.g.get(a);
        grq1 = grl2.a(guj1);
        if (guj1.c != 1)
        {
            throw new IllegalStateException((new StringBuilder("network interceptor ")).append(grl2).append(" must call proceed() exactly once").toString());
        }
_L4:
        return grq1;
_L2:
        grt grt1;
        int i;
        gui.b(d).a(grq1);
        gui.a(d, grq1);
        if (d.c() && grq1.d != null)
        {
            hci hci1 = hcq.a(gui.b(d).a(grq1, grq1.d.b()));
            grq1.d.a(hci1);
            hci1.close();
        }
        grt1 = gui.c(d);
        i = grt1.c;
        if (i == 204)
        {
            break; /* Loop/switch isn't completed */
        }
        grq1 = grt1;
        if (i != 205) goto _L4; else goto _L3
_L3:
        grq1 = grt1;
        if (grt1.g.b() > 0L)
        {
            throw new ProtocolException((new StringBuilder("HTTP ")).append(i).append(" had non-zero Content-Length: ").append(grt1.g.b()).toString());
        }
        if (true) goto _L4; else goto _L5
_L5:
    }
}
