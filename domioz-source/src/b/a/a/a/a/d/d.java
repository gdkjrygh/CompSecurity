// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.d;

import android.content.Context;
import b.a.a.a.a.b.l;
import b.a.a.a.a.b.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package b.a.a.a.a.d:
//            c, m, n, e, 
//            f

public abstract class d
{

    protected final Context a;
    protected final c b;
    protected final q c;
    protected final m d;
    protected volatile long e;
    protected final List f = new CopyOnWriteArrayList();
    private final int g = 100;

    public d(Context context, c c1, q q1, m m1)
    {
        a = context.getApplicationContext();
        b = c1;
        d = m1;
        c = q1;
        e = c.a();
    }

    private static long a(String s)
    {
        s = s.split("_");
        if (s.length != 3)
        {
            return 0L;
        }
        long l1;
        try
        {
            l1 = Long.valueOf(s[2]).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0L;
        }
        return l1;
    }

    protected abstract String a();

    public final void a(n n1)
    {
        if (n1 != null)
        {
            f.add(n1);
        }
    }

    public final void a(Object obj)
    {
        obj = b.a(obj);
        int i = obj.length;
        if (!d.a(i, c()))
        {
            String s = String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[] {
                Integer.valueOf(d.a()), Integer.valueOf(i), Integer.valueOf(c())
            });
            l.c(a, s);
            d();
        }
        d.a(((byte []) (obj)));
    }

    public final void a(List list)
    {
        d.a(list);
    }

    protected int b()
    {
        return g;
    }

    protected int c()
    {
        return 8000;
    }

    public final boolean d()
    {
        boolean flag = false;
        if (!d.b())
        {
            String s = a();
            d.a(s);
            l.c(a, String.format(Locale.US, "generated new file %s", new Object[] {
                s
            }));
            e = c.a();
            flag = true;
        }
        for (Iterator iterator = f.iterator(); iterator.hasNext();)
        {
            n n1 = (n)iterator.next();
            try
            {
                n1.b();
            }
            catch (Exception exception)
            {
                l.b(a, "One of the roll over listeners threw an exception");
            }
        }

        return flag;
    }

    public final List e()
    {
        return d.c();
    }

    public final void f()
    {
        d.a(d.d());
        d.e();
    }

    public final void g()
    {
        Object obj1 = d.d();
        int i = b();
        if (((List) (obj1)).size() <= i)
        {
            return;
        }
        int j = ((List) (obj1)).size() - i;
        l.a(a, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[] {
            Integer.valueOf(((List) (obj1)).size()), Integer.valueOf(i), Integer.valueOf(j)
        }));
        Object obj = new TreeSet(new e(this));
        File file;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((TreeSet) (obj)).add(new f(file, a(file.getName()))))
        {
            file = (File)((Iterator) (obj1)).next();
        }

        obj1 = new ArrayList();
        obj = ((TreeSet) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ((ArrayList) (obj1)).add(((f)((Iterator) (obj)).next()).a);
        } while (((ArrayList) (obj1)).size() != j);
        d.a(((List) (obj1)));
    }
}
