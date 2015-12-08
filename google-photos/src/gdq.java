// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Set;

final class gdq
    implements Runnable
{

    private int a;
    private gcp b;
    private gcy c;
    private gcy d;
    private long e;
    private gdn f;

    gdq(gdn gdn1, int i, gcp gcp, gcy gcy, gcy gcy1, long l)
    {
        f = gdn1;
        a = i;
        b = gcp;
        c = gcy;
        d = gcy1;
        e = l;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = gdn.a(f).iterator(); iterator.hasNext(); ((gdt)iterator.next()).a(a, b, e)) { }
    }
}
