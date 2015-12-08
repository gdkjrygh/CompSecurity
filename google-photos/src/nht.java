// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

final class nht
    implements Callable
{

    private nhu a;

    nht(nhr nhr1, nhu nhu1)
    {
        a = nhu1;
        super();
    }

    public final Object call()
    {
        boolean flag = true;
        nhu nhu1 = a;
        if (nhu1.j)
        {
            if (nhu1.k)
            {
                nhu1.e.c("has_irrecoverable_error", true);
            } else
            {
                nhu1.e.g("has_irrecoverable_error");
            }
            nhu1.i = nhu1.e.d();
            if (nhu1.k && nhu1.i != -1)
            {
                nhr.a(nhu1.l, nhu1.i);
            }
        } else
        {
            nhu1.e.b("LoginManager.last_updated", nhr.c(nhu1.l).a());
            nhu1.e.c("LoginManager.build_version", nhr.d(nhu1.l).a());
            Object obj = new ArrayList();
            if (nhr.e(nhu1.l) != null)
            {
                nhr.e(nhu1.l);
            }
            if (nhr.e(nhu1.l) != null)
            {
                nhr.e(nhu1.l);
            }
            if (nhu1.c != null && nhu1.c.d)
            {
                ((List) (obj)).addAll(nhu1.c.u);
            } else
            {
                flag = false;
            }
            if (flag)
            {
                obj = nhu1.l.a(((List) (obj)));
                nhr.a(nhu1.e, ((List) (obj)));
            }
            if (!nhu1.k)
            {
                nhu1.e.g("has_irrecoverable_error");
            }
            nhu1.i = nhu1.e.d();
            nhr.b(nhu1.l, nhu1.i);
        }
        return null;
    }
}
