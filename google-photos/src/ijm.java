// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class ijm
    implements Comparator
{

    private final String a;
    private final String b;

    ijm(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (diy)obj;
        obj1 = (diy)obj1;
        if (!a.equals(((diy) (obj)).a))
        {
            if (a.equals(((diy) (obj1)).a))
            {
                return 1;
            }
            if (!b.equals(((diy) (obj)).c))
            {
                return !b.equals(((diy) (obj1)).c) ? 0 : 1;
            }
        }
        return -1;
    }
}
