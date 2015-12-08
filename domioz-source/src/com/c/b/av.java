// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.concurrent.FutureTask;

// Referenced classes of package com.c.b:
//            d

final class av extends FutureTask
    implements Comparable
{

    private final d a;

    public av(d d1)
    {
        super(d1, null);
        a = d1;
    }

    public final volatile int compareTo(Object obj)
    {
        obj = (av)obj;
        int i = a.s;
        int j = ((av) (obj)).a.s;
        if (i == j)
        {
            return a.a - ((av) (obj)).a.a;
        } else
        {
            return j - 1 - (i - 1);
        }
    }
}
