// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

// Referenced classes of package b.a:
//            eg, gu, eh, ib

public final class gt
{

    List a;
    final Set b;
    final Set c;
    private Executor d;

    public gt(Executor executor)
    {
        this(executor, ((List) (new LinkedList())), ((List) (new LinkedList())));
    }

    private gt(Executor executor, List list, List list1)
    {
        a = new LinkedList();
        b = new HashSet();
        c = new HashSet();
        d = executor;
        a(list);
        b(list1);
    }

    public final void a(eg eg1, eh eh)
    {
        if (eg1.d)
        {
            return;
        } else
        {
            eg1.d = true;
            eg1.e = eh;
            d.execute(new gu(this, eg1, (byte)0));
            return;
        }
    }

    public final void a(ib ib)
    {
        synchronized (a)
        {
            a.add(ib);
        }
    }

    public final void a(List list)
    {
        synchronized (b)
        {
            b.addAll(list);
            b.remove(null);
        }
    }

    public final void b(List list)
    {
        synchronized (c)
        {
            c.addAll(list);
            c.remove(null);
        }
    }
}
