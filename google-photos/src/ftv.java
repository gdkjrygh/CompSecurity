// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public final class ftv
    implements ftt
{

    private final amh a;
    private final fli b;
    private final ftw c;

    public ftv(amh amh1, fli fli, ftw ftw1)
    {
        a = amh1;
        b = fli;
        c = ftw1;
    }

    public final void a(List list)
    {
        azh azh1;
        for (list = list.iterator(); list.hasNext(); a.a(azh1))
        {
            azh1 = (azh)list.next();
        }

    }

    public final void a(List list, List list1)
    {
        gap gap;
        for (list = list.iterator(); list.hasNext(); list1.add(c.a(a, b, gap).b(1, 1)))
        {
            gap = ((elt)((ekp)list.next()).a(elt)).e();
        }

    }
}
