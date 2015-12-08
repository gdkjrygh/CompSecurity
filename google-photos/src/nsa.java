// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nsa
{

    private static final String a = ntn.a(nsa);
    private final Context b;

    public nsa(Context context)
    {
        b = context;
    }

    private nqv a(Context context, int i, nqk nqk, nqx nqx)
    {
        Object obj = ntl.a(context);
        qqj qqj1 = new qqj();
        qqj1.a = ((ntl) (obj)).a();
        qqj1.b = (new ntk(context)).a();
        qqj1.c = Integer.valueOf(50);
        qqj1.d = ntl.a(nqk);
        obj = new nrm(context, i, qqj1);
        olm.a(context, nti);
        obj = (nrm)nti.a(((nzc) (obj)), context);
        if (((nrm) (obj)).l())
        {
            ntn.d(a, String.format("Failed to do initial fetch notifications for accountId [%d], fetchCategory [%s], trigger [%s]", new Object[] {
                Integer.valueOf(i), nqk, nqx
            }));
            if (nxx.b(((nxx) (obj)).n))
            {
                context = nqw.b;
            } else
            {
                context = nqw.c;
            }
            return new nqv(context, ((nxx) (obj)).n);
        }
        obj = ((nrm) (obj)).c();
        if (obj == null)
        {
            ntn.d(a, String.format("Got empty response for initial fetch - accountId [%d], fetchCategory [%s], trigger [%s]", new Object[] {
                Integer.valueOf(i), nqk, nqx
            }));
            return new nqv(nqw.b);
        } else
        {
            ntn.a(a, ((qqk) (obj)).toString());
            ntn.a(a, String.format("Completed initial fetch notifications for accountId [%d], fetchCategory [%s], trigger [%s] and received [%d] notifications.", new Object[] {
                Integer.valueOf(i), nqk, nqx, Integer.valueOf(((qqk) (obj)).b.length)
            }));
            ntf.a(context, i, nqk);
            ntf.a(context, i, nqk, nqx, ((qqk) (obj)));
            return new nqv(nqw.a);
        }
    }

    public final nqv a(int i, nqk nqk, nqx nqx)
    {
        b.v();
        if (i == -1)
        {
            throw new IllegalArgumentException("Invalid account ID");
        }
        byte abyte0[] = ntf.c(b, i, nqk);
        if (abyte0 == null || abyte0.length == 0)
        {
            ntn.a(a, String.format("Performing initial fetch since no valid syncToken is found, accountId [%d], fetchCategory [%s], trigger [%s]", new Object[] {
                Integer.valueOf(i), nqk, nqx
            }));
            return a(b, i, nqk, nqx);
        }
        Context context = b;
        ntl ntl1 = ntl.a(context);
        qqp qqp1 = new qqp();
        qqp1.a = ntl1.a();
        qqp1.b = (new ntk(context)).a();
        qqp1.c = Integer.valueOf(50);
        qqp1.d = ntl.a(nqk);
        qqp1.e = abyte0;
        Object obj = new nsb(context, i, qqp1);
        olm.a(context, nti);
        obj = (nsb)nti.a(((nzc) (obj)), context);
        if (((nsb) (obj)).l())
        {
            ntn.d(a, String.format("Failed to sync notifications for accountId [%d], fetchCategory [%s], trigger [%s]", new Object[] {
                Integer.valueOf(i), nqk, nqx
            }));
            if (nxx.b(((nxx) (obj)).n))
            {
                nqk = nqw.b;
            } else
            {
                nqk = nqw.c;
            }
            return new nqv(nqk, ((nxx) (obj)).n);
        }
        obj = (pbw)((nsb) (obj)).t();
        if (obj != null)
        {
            obj = ((pbw) (obj)).a;
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            ntn.d(a, String.format("Got empty response for sync fetch  - accountId [%d], fetchCategory [%s], trigger [%s]", new Object[] {
                Integer.valueOf(i), nqk, nqx
            }));
            return new nqv(nqw.b);
        }
        ntn.a(a, ((qqq) (obj)).toString());
        if (((qqq) (obj)).d == null || ((qqq) (obj)).d.length == 0)
        {
            ntn.a(a, String.format("Completed sync notifications fetch for accountId [%d], fetchCategory [%s], trigger [%s] and received [%d] notifications.", new Object[] {
                Integer.valueOf(i), nqk, nqx, Integer.valueOf(((qqq) (obj)).b.length)
            }));
            ntf.a(context, i, nqk, nqx, ((qqq) (obj)));
            return new nqv(nqw.a);
        } else
        {
            ntn.a(a, String.format("Sync notifications fetch has paging token, starting a initial fetch. AccountId [%d], fetchCategory [%s], trigger [%s].", new Object[] {
                Integer.valueOf(i), nqk, nqx, Integer.valueOf(((qqq) (obj)).b.length)
            }));
            return a(context, i, nqk, nqx);
        }
    }

}
