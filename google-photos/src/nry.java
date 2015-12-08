// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Arrays;
import java.util.List;

final class nry
{

    private static final String a = ntn.a(nry);

    nry()
    {
    }

    static nqv a(Context context, int i, String as[], int j)
    {
        if (ntf.a(context, i, as, j))
        {
            return a(context, i, as, j, ((nqz)olm.a(context, nqz)).a());
        } else
        {
            return new nqv(nqw.c);
        }
    }

    private static nqv a(Context context, int i, String as[], int j, String s)
    {
        if (as.length > 0)
        {
            Object obj = new qqn();
            obj.a = s;
            obj.b = ntf.a(context, i, as);
            obj.c = j;
            obj = new nrz(context, i, ((qqn) (obj)));
            olm.a(context, nti);
            nti.a(((nzc) (obj)), context);
            if (((nrz) (obj)).l())
            {
                ntn.d(a, String.format("Failed to set read states, account ID [%d], view [%s]", new Object[] {
                    Integer.valueOf(i), s
                }));
                s = a;
                context = String.valueOf(Arrays.toString(as));
                if (context.length() != 0)
                {
                    context = "NotificationKeys: ".concat(context);
                } else
                {
                    context = new String("NotificationKeys: ");
                }
                ntn.d(s, context);
                if (nxx.b(((nxx) (obj)).n))
                {
                    context = nqw.b;
                } else
                {
                    context = nqw.c;
                }
                return new nqv(context, ((nxx) (obj)).n);
            }
        }
        return new nqv(nqw.a);
    }

    static void a(Context context, int i, String as[], String s)
    {
        if (s.equals("AST"))
        {
            ntf.a(context, i, as, false);
        }
        a(context, i, as, 5, s);
    }

    static void a(Context context, int i, nqs anqs[], nqq nqq1)
    {
        nqq1 = olm.c(context, nqr);
        int j = nqq1.size();
        if (anqs != null)
        {
            Arrays.asList(anqs);
        }
        for (i = 0; i < j; i++)
        {
            nqq1.get(i);
        }

        if ((nrf)olm.b(context, nrf) != null)
        {
            context = nqq.c;
        }
    }

}
