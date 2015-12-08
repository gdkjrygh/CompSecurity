// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class deq
{

    public final List a;

    public deq(List list)
    {
        a = a(new ArrayList(list));
    }

    private static List a(List list)
    {
        b.a(list, "steps", null);
        for (int i = 0; i < list.size(); i++)
        {
            deu deu1 = (deu)list.get(i);
            if (deu1.a <= i || deu1.a > list.size())
            {
                throw new des(i, deu1.a);
            }
        }

        return list;
    }
}
