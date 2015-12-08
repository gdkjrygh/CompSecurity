// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class att
    implements ann, ano
{

    private final List a;
    private final jw b;
    private int c;
    private amb d;
    private ano e;
    private List f;

    att(List list, jw jw1)
    {
        b = jw1;
        b.a(list);
        a = list;
        c = 0;
    }

    private void e()
    {
        if (c < a.size() - 1)
        {
            c = c + 1;
            a(d, e);
            return;
        } else
        {
            e.a(new apv("Fetch failed", new ArrayList(f)));
            return;
        }
    }

    public final void a()
    {
        b.a(f);
        f = null;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((ann)iterator.next()).a()) { }
    }

    public final void a(amb amb, ano ano1)
    {
        d = amb;
        e = ano1;
        f = (List)b.a();
        ((ann)a.get(c)).a(amb, this);
    }

    public final void a(Exception exception)
    {
        f.add(exception);
        e();
    }

    public final void a(Object obj)
    {
        if (obj != null)
        {
            e.a(obj);
            return;
        } else
        {
            e();
            return;
        }
    }

    public final void b()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((ann)iterator.next()).b()) { }
    }

    public final amz c()
    {
        return ((ann)a.get(0)).c();
    }

    public final Class d()
    {
        return ((ann)a.get(0)).d();
    }
}
