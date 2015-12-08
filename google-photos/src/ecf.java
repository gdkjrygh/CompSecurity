// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Set;

final class ecf
    implements ebn
{

    ecf()
    {
    }

    public final ekf a(int i, Object obj)
    {
        qgg qgg1 = (qgg)obj;
        String s = null;
        obj = s;
        if (qgg1.c != null)
        {
            obj = s;
            if (qgg1.c.a != null)
            {
                obj = s;
                if (qgg1.c.a.length > 0)
                {
                    obj = qgg1.c.a[0].a;
                }
            }
        }
        s = b.c(qgg1);
        hpm hpm1 = new hpm();
        hpm1.a = s;
        hpm1.c = qgg1.b.b.b;
        hpm1.d = qgg1.b.a;
        hpm1.e = ((String) (obj));
        return new hpg(hpm1.a());
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
