// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Set;

final class gdp
    implements Runnable
{

    private int a;
    private Long b;
    private long c;
    private gdn d;

    gdp(gdn gdn1, int i, Long long1, long l)
    {
        d = gdn1;
        a = i;
        b = long1;
        c = l;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = gdn.a(d).iterator(); iterator.hasNext(); ((gdt)iterator.next()).a(a, b, c)) { }
    }
}
