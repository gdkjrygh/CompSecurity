// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class cxs
    implements cxu
{

    private final cxp a;
    private final cxp b;

    public cxs(cxp cxp1, cxp cxp2)
    {
        a = (cxp)b.a(cxp1, "videoSummarizer", null);
        b = (cxp)b.a(cxp2, "photoSummarizer", null);
    }

    public final cqj a(cxw cxw1)
    {
        Object obj;
        ArrayList arraylist;
        long l;
        if (cxw1.b.isEmpty())
        {
            l = cxw1.c;
            obj = Collections.emptyList();
        } else
        {
            if (cxw1.b.isEmpty())
            {
                l = 0L;
            } else
            {
                Iterator iterator = cxw1.a.iterator();
                for (l = 0L; iterator.hasNext(); l = ((cqk)iterator.next()).e + l) { }
                int i = cxw1.e;
                long l1 = cxw1.c;
                l1 = ((long)(100 - i) * l1) / 100L;
                l = cxw1.c - Math.min(l, l1);
            }
            obj = (new cxr()).a(cxw1.b).a(l).a(cxw1.f).b(cxw1.d).a();
            obj = b.a(((cxq) (obj)));
            l = Math.max(0L, cxw1.c - cxy.b(((List) (obj))));
        }
        if (cxw1.a.isEmpty())
        {
            cxw1 = Collections.emptyList();
        } else
        {
            cxw1 = (new cxr()).a(cxw1.a).a(l).a(cxw1.f).b(cxw1.d).a();
            cxw1 = a.a(cxw1);
        }
        arraylist = new ArrayList(((List) (obj)).size() + cxw1.size());
        arraylist.addAll(((java.util.Collection) (obj)));
        arraylist.addAll(cxw1);
        return new cqj(arraylist);
    }

    public final long b(cxw cxw1)
    {
        cxq cxq = (new cxr()).a(cxw1.a).a(0x7fffffffffffffffL).a(cxw1.f).b(cxw1.d).a();
        cxw1 = (new cxr()).a(cxw1.b).a(0x7fffffffffffffffL).a(cxw1.f).b(cxw1.d).a();
        long l = a.b(cxq);
        return b.b(cxw1) + l;
    }

    static 
    {
        cxs.getSimpleName();
    }
}
