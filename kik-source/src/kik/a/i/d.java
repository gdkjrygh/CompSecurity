// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.i;

import java.util.Comparator;

// Referenced classes of package kik.a.i:
//            b

final class d
    implements Comparator
{

    final b a;

    d(b b)
    {
        a = b;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (h.a)obj;
        long l = ((h.a)obj1).e();
        long l1 = ((h.a) (obj)).e();
        if (l == l1)
        {
            return 0;
        }
        return l <= l1 ? -1 : 1;
    }
}
