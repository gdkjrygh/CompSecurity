// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class cwz
    implements cxd
{

    private final List a;

    public cwz(List list)
    {
        a = b.b((Collection)b.a(list, "metrics", null));
    }

    public final float a(cqh cqh, cof cof, cqh cqh1, cof cof1)
    {
        Iterator iterator = a.iterator();
        float f = 0.0F;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cxb cxb1 = (cxb)iterator.next();
            if (cxb1.b.b(cqh, cof, cqh1, cof1))
            {
                float f1 = cxb1.b.a(cqh, cof, cqh1, cof1);
                f = cxb1.a * f1 + f;
            }
        } while (true);
        return f;
    }

    public final boolean b(cqh cqh, cof cof, cqh cqh1, cof cof1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            if (((cxb)iterator.next()).b.b(cqh, cof, cqh1, cof1))
            {
                return true;
            }
        }

        return false;
    }

    static 
    {
        cwz.getSimpleName();
    }
}
