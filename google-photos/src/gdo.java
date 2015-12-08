// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Set;

final class gdo
    implements Runnable
{

    private int a;
    private gcp b;
    private gdn c;

    gdo(gdn gdn1, int i, gcp gcp)
    {
        c = gdn1;
        a = i;
        b = gcp;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = gdn.a(c).iterator(); iterator.hasNext(); ((gdt)iterator.next()).a(a, b)) { }
    }
}
