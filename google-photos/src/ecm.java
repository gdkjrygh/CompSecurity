// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class ecm
    implements elf
{

    private static final ekz a = (new ela()).a();
    private static final ekk b = (new ekm()).a(hpg).a();
    private final Context c;
    private final elp d;

    ecm(Context context)
    {
        c = context;
        d = new elp(context, ebn);
    }

    private static String a(ekp ekp1)
    {
        return ((hpk)((hpg)ekp1.a(hpg)).a.get(0)).e;
    }

    public final long a(ekq ekq, ekw ekw)
    {
        throw new UnsupportedOperationException();
    }

    public final Class a()
    {
        return ecj;
    }

    public final List a(ekq ekq, ekw ekw, ekk ekk)
    {
        ekw = (ecj)ekq;
        ekk = (new ekm()).a(ekk).a(b).a();
        int i = ((ecj) (ekw)).e;
        ekq = ((ecj) (ekw)).d;
        Object obj = ((ecj) (ekw)).a;
        if (obj == null)
        {
            ekq = null;
        } else
        {
            elm elm = d.a(i, obj, ekk);
            long l1 = 0L;
            long l = l1;
            if (((qgg) (obj)).c != null)
            {
                Long long1 = ((qgg) (obj)).c.f;
                Long long2 = ((qgg) (obj)).c.g;
                if (long1 != null)
                {
                    l1 = long1.longValue();
                }
                l = l1;
                if (long2 != null)
                {
                    l = l1 + long2.longValue();
                }
            }
            ekq = new ebt(i, ((qgg) (obj)).b.a, ekq, elm, b.a(((qgg) (obj))), null, l);
        }
        obj = ((ecj) (ekw)).b;
        ekw = ((ecj) (ekw)).c;
        ekw = (List)b.a(c, ((ekq) (obj))).a(((ekq) (obj)), ekw, ekk).a();
        if (ekq == null)
        {
            return ekw;
        }
        ekk = new ArrayList();
        obj = a(((ekp) (ekq)));
        int k = ekw.size();
        for (int j = 0; j < k; j++)
        {
            ekp ekp1 = (ekp)ekw.get(j);
            if (!TextUtils.equals(((CharSequence) (obj)), a(ekp1)))
            {
                ekk.add(ekp1);
            }
        }

        Collections.reverse(ekk);
        ekk.add(0, ekq);
        return Collections.unmodifiableList(ekk);
    }

    public final ekz b()
    {
        return a;
    }

    public final ekz c()
    {
        return a;
    }

}
