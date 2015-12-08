// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Pair;
import java.util.Arrays;

public final class nsu
{

    private static final String b = ntn.a(nsu);
    public final Context a;

    public nsu(Context context)
    {
        a = context;
    }

    public static Pair a(int i, String as[], nth nth1)
    {
        if (nth1.l())
        {
            ntn.d(b, String.format("Failed to fetch notifications by key for accountId [%d], keys [%s]", new Object[] {
                Integer.valueOf(i), Arrays.toString(as)
            }));
            if (nxx.b(((nxx) (nth1)).n))
            {
                as = nqw.b;
            } else
            {
                as = nqw.c;
            }
            return Pair.create(new nqv(as, ((nxx) (nth1)).n), null);
        }
        nth1 = (pbo)nth1.t();
        if (nth1 != null)
        {
            nth1 = ((pbo) (nth1)).a;
        } else
        {
            nth1 = null;
        }
        if (nth1 == null)
        {
            ntn.d(b, String.format("Got empty response for fetch by key - accountId [%d], keys [%s]", new Object[] {
                Integer.valueOf(i), Arrays.toString(as)
            }));
            return Pair.create(new nqv(nqw.b), null);
        } else
        {
            ntn.a(b, nth1.toString());
            ntn.a(b, String.format("Completed fetch notifications by key for accountId [%d], keys [%s] and received [%d] notifications.", new Object[] {
                Integer.valueOf(i), Arrays.toString(as), Integer.valueOf(((qqv) (nth1)).a.length)
            }));
            return Pair.create(new nqv(nqw.a), nth1);
        }
    }

    public static qqu a(Context context, String as[])
    {
        ntl ntl1 = ntl.a(context);
        qqu qqu1 = new qqu();
        qqu1.a = ntl1.a();
        qqu1.b = (new ntk(context)).a();
        qqu1.c = as;
        return qqu1;
    }

}
