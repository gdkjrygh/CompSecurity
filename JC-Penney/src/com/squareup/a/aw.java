// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import java.util.concurrent.FutureTask;

// Referenced classes of package com.squareup.a:
//            d, ar

final class aw extends FutureTask
    implements Comparable
{

    private final d a;

    public aw(d d1)
    {
        super(d1, null);
        a = d1;
    }

    public int a(aw aw1)
    {
        ar ar1 = a.n();
        ar ar2 = aw1.a.n();
        if (ar1 == ar2)
        {
            return a.a - aw1.a.a;
        } else
        {
            return ar2.ordinal() - ar1.ordinal();
        }
    }

    public int compareTo(Object obj)
    {
        return a((aw)obj);
    }
}
