// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

// Referenced classes of package crittercism.android:
//            c, f

public final class e
{

    List a;
    final Set b;
    final Set c;
    private Executor d;

    public e(Executor executor)
    {
        this(executor, ((List) (new LinkedList())), ((List) (new LinkedList())));
    }

    private e(Executor executor, List list, List list1)
    {
        a = new LinkedList();
        b = new HashSet();
        c = new HashSet();
        d = executor;
        a(list);
        b(list1);
    }

    public final void a(c c1)
    {
        a(c1, c.a.e);
    }

    public final void a(c c1, c.a a1)
    {
        if (c1.b)
        {
            return;
        } else
        {
            c1.b = true;
            c1.c = a1;
            d.execute(new a(c1, (byte)0));
            return;
        }
    }

    public final void a(f f)
    {
        synchronized (a)
        {
            a.add(f);
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

    /* member class not found */
    class a {}

}
