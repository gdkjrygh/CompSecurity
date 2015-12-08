// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.d;

import android.content.Context;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.m;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package b.a.a.a.a.d:
//            c, g, h, e

public abstract class d
{
    static final class a
    {

        final File a;
        final long b;

        public a(File file, long l)
        {
            a = file;
            b = l;
        }
    }


    private final int a = 100;
    protected final Context b;
    protected final c c;
    public final m d;
    protected final g e;
    protected volatile long f;
    protected final List g = new CopyOnWriteArrayList();

    public d(Context context, c c1, m m1, g g1)
        throws IOException
    {
        b = context.getApplicationContext();
        c = c1;
        e = g1;
        d = m1;
        f = d.a();
    }

    private static long a(String s)
    {
        s = s.split("_");
        if (s.length != 3)
        {
            return 0L;
        }
        long l;
        try
        {
            l = Long.valueOf(s[2]).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0L;
        }
        return l;
    }

    public abstract String a();

    public final void a(h h1)
    {
        if (h1 != null)
        {
            g.add(h1);
        }
    }

    public final void a(Object obj)
        throws IOException
    {
        obj = c.a(obj);
        int i = obj.length;
        if (!e.a(i, c()))
        {
            String s = String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[] {
                Integer.valueOf(e.a()), Integer.valueOf(i), Integer.valueOf(c())
            });
            j.a(b, s);
            d();
        }
        e.a(((byte []) (obj)));
    }

    public final void a(List list)
    {
        e.a(list);
    }

    public int b()
    {
        return a;
    }

    public int c()
    {
        return 8000;
    }

    public final boolean d()
        throws IOException
    {
        boolean flag = false;
        if (!e.b())
        {
            String s = a();
            e.a(s);
            j.a(b, String.format(Locale.US, "generated new file %s", new Object[] {
                s
            }));
            f = d.a();
            flag = true;
        }
        for (Iterator iterator = g.iterator(); iterator.hasNext();)
        {
            h h1 = (h)iterator.next();
            try
            {
                h1.a();
            }
            catch (Exception exception)
            {
                j.f(b);
            }
        }

        return flag;
    }

    public final List e()
    {
        return e.c();
    }

    public final void f()
    {
        e.a(e.d());
        e.e();
    }

    public final void g()
    {
        Object obj1 = e.d();
        int i = b();
        if (((List) (obj1)).size() <= i)
        {
            return;
        }
        int k = ((List) (obj1)).size() - i;
        Object obj = b;
        String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[] {
            Integer.valueOf(((List) (obj1)).size()), Integer.valueOf(i), Integer.valueOf(k)
        });
        j.e(((Context) (obj)));
        obj = new TreeSet(new e(this));
        File file;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((TreeSet) (obj)).add(new a(file, a(file.getName()))))
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
            ((ArrayList) (obj1)).add(((a)((Iterator) (obj)).next()).a);
        } while (((ArrayList) (obj1)).size() != k);
        e.a(((List) (obj1)));
    }
}
