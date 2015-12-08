// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Set;

final class ijr
    implements ikj
{

    ijr()
    {
    }

    public final ekf a(int i, Object obj)
    {
        Object obj2 = null;
        Object obj1 = (qgg)obj;
        String s;
        if (((qgg) (obj1)).c != null)
        {
            obj = ((qgg) (obj1)).c.d;
        } else
        {
            obj = null;
        }
        s = b.a(((qgg) (obj1)), b.a(((qgg) (obj1))));
        obj1 = obj2;
        if (s != null)
        {
            obj1 = obj2;
            if (obj != null)
            {
                obj1 = new feu(s, ((String) (obj)));
            }
        }
        return ((ekf) (obj1));
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return feu;
    }
}
