// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class cxr
{

    List a;
    Map b;
    cqp c;
    long d;
    long e;

    public cxr()
    {
        a = Collections.emptyList();
        b = Collections.emptyMap();
        c = new cqp();
        e = 0x1e8480L;
    }

    public final cxq a()
    {
        return new cxq(this);
    }

    public final cxr a(long l)
    {
        d = b.b(l, "targetDurationUs");
        return this;
    }

    public final cxr a(cqp cqp1)
    {
        c = (cqp)b.a(cqp1, "constraints", null);
        return this;
    }

    public final cxr a(List list)
    {
        Object obj = (List)b.a(list, "media", null);
        ArrayList arraylist = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(cqh.a((cnz)((Iterator) (obj)).next()))) { }
        a = arraylist;
        b = new HashMap();
        cnz cnz1;
        for (list = list.iterator(); list.hasNext(); b.put(cnz1.a(), cnz1.c()))
        {
            cnz1 = (cnz)list.next();
        }

        return this;
    }

    public final cxr b(long l)
    {
        e = b.a(l, "singlePhotoDurationUs");
        return this;
    }
}
