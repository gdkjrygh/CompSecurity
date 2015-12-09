// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class akq
    implements har
{

    private final akz a;
    private final akw b;

    akq(akz akz1, akw akw1)
    {
        a = akz1;
        b = akw1;
    }

    public final boolean a(List list)
    {
        long l = System.nanoTime();
        akw akw1 = b;
        hag hag3 = akw1.b;
        long l1 = hag3.b.a(hag3.a);
        boolean flag;
        if (l - akw1.a >= 0xf4240L * l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (a.a(list))
            {
                list = b;
                list.a = 0L;
                hag hag1 = ((akw) (list)).b;
                list.b = new hag(hag1.b, hag1.c);
                return true;
            } else
            {
                list = b;
                list.a = l;
                hag hag2 = ((akw) (list)).b;
                list.b = new hag(hag2.a + 1, hag2.b, hag2.c);
                return false;
            }
        } else
        {
            return false;
        }
    }
}
