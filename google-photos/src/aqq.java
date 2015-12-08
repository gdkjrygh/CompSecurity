// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class aqq
{

    private final aqr a = new aqr();
    private final Map b = new HashMap();

    aqq()
    {
    }

    private static void a(aqr aqr1)
    {
        aqr1.c.d = aqr1;
        aqr1.d.c = aqr1;
    }

    private static void b(aqr aqr1)
    {
        aqr1.d.c = aqr1.c;
        aqr1.c.d = aqr1.d;
    }

    public final Object a()
    {
        for (aqr aqr1 = a.d; !aqr1.equals(a); aqr1 = aqr1.d)
        {
            Object obj = aqr1.a();
            if (obj != null)
            {
                return obj;
            }
            b(aqr1);
            b.remove(aqr1.a);
            ((aqy)aqr1.a).a();
        }

        return null;
    }

    public final Object a(aqy aqy1)
    {
        aqr aqr1 = (aqr)b.get(aqy1);
        if (aqr1 == null)
        {
            aqr1 = new aqr(aqy1);
            b.put(aqy1, aqr1);
            aqy1 = aqr1;
        } else
        {
            aqy1.a();
            aqy1 = aqr1;
        }
        b(aqy1);
        aqy1.d = a;
        aqy1.c = a.c;
        a(((aqr) (aqy1)));
        return aqy1.a();
    }

    public final void a(aqy aqy1, Object obj)
    {
        aqr aqr1 = (aqr)b.get(aqy1);
        if (aqr1 == null)
        {
            aqr1 = new aqr(aqy1);
            b(aqr1);
            aqr1.d = a.d;
            aqr1.c = a;
            a(aqr1);
            b.put(aqy1, aqr1);
            aqy1 = aqr1;
        } else
        {
            aqy1.a();
            aqy1 = aqr1;
        }
        if (((aqr) (aqy1)).b == null)
        {
            aqy1.b = new ArrayList();
        }
        ((aqr) (aqy1)).b.add(obj);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("GroupedLinkedMap( ");
        aqr aqr1 = a.c;
        boolean flag = false;
        for (; !aqr1.equals(a); aqr1 = aqr1.c)
        {
            flag = true;
            stringbuilder.append('{').append(aqr1.a).append(':').append(aqr1.b()).append("}, ");
        }

        if (flag)
        {
            stringbuilder.delete(stringbuilder.length() - 2, stringbuilder.length());
        }
        return stringbuilder.append(" )").toString();
    }
}
