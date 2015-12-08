// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class cxx
{

    private static final cqp d = new cqp();
    public long a;
    public int b;
    public cqp c;
    private List e;
    private Map f;
    private List g;
    private Map h;
    private long i;

    public cxx()
    {
        c = d;
    }

    public final cxw a()
    {
        boolean flag;
        if (e != null && !e.isEmpty() || g != null && !g.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "At least one of mPhotos and mVideos should be non-empty.");
        c.a(a, "mTargetDuration");
        c.a(i, "mSinglePhotoDurationUs");
        return new cxw(e, f, g, h, a, i, b, c);
    }

    public final cxx a(long l)
    {
        i = 0x1e8480L;
        return this;
    }

    public final cxx a(List list)
    {
        e = list;
        f = new HashMap();
        cqk cqk1;
        for (list = list.iterator(); list.hasNext(); f.put(cqk1.a, cqk1.c))
        {
            cqk1 = (cqk)list.next();
        }

        return this;
    }

    public final cxx b(List list)
    {
        g = list;
        h = new HashMap();
        coo coo1;
        for (list = list.iterator(); list.hasNext(); h.put(coo1.a, coo1.c))
        {
            coo1 = (coo)list.next();
        }

        return this;
    }

}
