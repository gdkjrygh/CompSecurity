// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class aoj
    implements Comparator
{

    private static final Comparator a = new aoj(true);
    private static final Comparator b = new aoj(false);
    private final int c;

    private aoj(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = -1;
        }
        c = i;
    }

    static Comparator a()
    {
        return a;
    }

    static Comparator b()
    {
        return b;
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (aoi)obj;
        obj1 = (aoi)obj1;
        int i = c;
        long l = ((aoi) (obj)).c;
        long l1 = ((aoi) (obj1)).c;
        byte byte0;
        if (l < l1)
        {
            byte0 = -1;
        } else
        if (l == l1)
        {
            byte0 = 0;
        } else
        {
            byte0 = 1;
        }
        return byte0 * i;
    }

}
