// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

final class ang.Object
    implements gsg
{

    private gqm a;

    public final grt a(grq grq)
    {
        return a.a(grq);
    }

    public final gtv a(grt grt1)
    {
        return a.a(grt1);
    }

    public final void a()
    {
        a.a();
    }

    public final void a(grt grt1, grt grt2)
    {
        gqp gqp1 = new gqp(grt2);
        grt2 = gqo.a((gqo)grt1.g);
        grt1 = null;
        try
        {
            grt2 = gsa.a(((gsd) (grt2)).d, ((gsd) (grt2)).a, ((gsd) (grt2)).b);
        }
        // Misplaced declaration of an exception variable
        catch (grt grt2)
        {
            gqm.a(grt1);
            return;
        }
        if (grt2 == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        grt1 = grt2;
        gqp1.a(grt2);
        grt1 = grt2;
        grt2.a();
    }

    public final void a(gtw gtw)
    {
        a.a(gtw);
    }

    public final void b(grq grq)
    {
        a.b(grq);
    }

    (gqm gqm1)
    {
        a = gqm1;
        super();
    }
}
