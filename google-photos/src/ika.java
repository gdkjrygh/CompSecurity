// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

final class ika
    implements ikj
{

    ika()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (qgg)obj;
        if (b.a(((qgg) (obj)).c.a))
        {
            hpm hpm1 = new hpm();
            hpm1.a = b.c(((qgg) (obj)));
            hpm1.d = ((qgg) (obj)).b.a;
            return new hpg(Collections.singletonList(hpm1.a()));
        }
        ArrayList arraylist = new ArrayList();
        qcm aqcm[] = ((qgg) (obj)).c.a;
        int j = aqcm.length;
        for (i = 0; i < j; i++)
        {
            qcm qcm1 = aqcm[i];
            hpm hpm2 = new hpm();
            hpm2.a = b.c(((qgg) (obj)));
            hpm2.d = ((qgg) (obj)).b.a;
            hpm2.e = qcm1.a;
            arraylist.add(hpm2.a());
        }

        return new hpg(arraylist);
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return hpg;
    }
}
