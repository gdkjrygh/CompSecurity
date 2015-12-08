// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class hgr
    implements Runnable
{

    private hgq a;

    hgr(hgq hgq1)
    {
        a = hgq1;
        super();
    }

    public final void run()
    {
        if (hgq.a(a).a())
        {
            ArrayList arraylist = new ArrayList(hgq.b(a).size());
            arraylist.add(hgq.c(a));
            for (Iterator iterator = hgq.b(a).iterator(); iterator.hasNext(); arraylist.add(noy.a("reason", (String)iterator.next()))) { }
            arraylist.toArray(new noy[arraylist.size()]);
        }
        hgq.b(a).clear();
    }
}
