// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class cqg
{

    private static final cod j = new cod(0L, 0x3d0900L);
    public Collection a;
    public List b;
    public List c;
    public List d;
    public cay e;
    public String f;
    public String g;
    public cod h;
    public cok i;
    private final List k;

    public cqg()
    {
        k = new ArrayList();
        f = "";
        g = "";
        h = j;
    }

    public cqg(cqg cqg1)
    {
        k = new ArrayList();
        f = "";
        g = "";
        h = j;
        k.addAll(k);
        a = cqg1.a;
        b = cqg1.b;
        c = cqg1.c;
        d = cqg1.d;
        e = cqg1.e;
        f = cqg1.f;
        g = cqg1.g;
        h = cqg1.h;
        i = cqg1.i;
    }

    public final cqf a()
    {
        c.a(b, "mVideoClips", null);
        Object obj1 = a;
        Object obj = b.l(((Collection) (obj1)).size());
        cnz cnz1;
        for (obj1 = ((Collection) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((Map) (obj)).put(cnz1.a(), cnz1))
        {
            cnz1 = (cnz)((Iterator) (obj1)).next();
        }

        obj = Collections.unmodifiableMap(((Map) (obj)));
        c.a(i, "mDimensions", null);
        if (c == null)
        {
            c = cnu.a(b, ((Map) (obj)), i.a, i.b);
        }
        return new cqf(((Map) (obj)), b, k, c, d, e, f, g, h, i);
    }

    public final cqg a(cnn cnn)
    {
        k.add(cnn);
        return this;
    }

    public final cqg a(List list)
    {
        b = Collections.unmodifiableList(list);
        return this;
    }

}
