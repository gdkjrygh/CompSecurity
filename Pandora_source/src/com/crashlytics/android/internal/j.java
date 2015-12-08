// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.crashlytics.android.internal:
//            bg, bj, cm, cj, 
//            aj, w, bi, ba, 
//            k, l, u

final class j
{

    private final w a;
    private final bg b;
    private aj c;
    private final bi d;
    private final int e;
    private List f;

    j(w w1, bg bg1, bi bi1)
        throws IOException
    {
        this(w1, bg1, bi1, 100);
    }

    private j(w w1, bg bg1, bi bi1, int i)
        throws IOException
    {
        f = new CopyOnWriteArrayList();
        a = w1;
        d = bi1;
        b = bg1;
        b.a();
        e = 100;
    }

    private void a(String s)
    {
        for (s = f.iterator(); s.hasNext();)
        {
            bj bj1 = (bj)s.next();
            try
            {
                bj1.c();
            }
            catch (Exception exception)
            {
                cm.a().b().a("Crashlytics", "One of the roll over listeners threw an exception", exception);
            }
        }

    }

    private static long b(String s)
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

    private int e()
    {
        if (c == null)
        {
            return 8000;
        } else
        {
            return c.c;
        }
    }

    final void a(aj aj1)
    {
        c = aj1;
    }

    final void a(bj bj1)
    {
        if (bj1 != null)
        {
            f.add(bj1);
        }
    }

    final void a(u u)
        throws IOException
    {
        u = a.a(u);
        int i = u.length;
        if (!d.a(i, e()))
        {
            ba.a(4, String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[] {
                Integer.valueOf(d.a()), Integer.valueOf(i), Integer.valueOf(e())
            }));
            a();
        }
        d.a(u);
    }

    final void a(List list)
    {
        d.a(list);
    }

    final boolean a()
        throws IOException
    {
        boolean flag = true;
        Object obj = null;
        if (!d.b())
        {
            obj = UUID.randomUUID();
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("sa");
            stringbuilder.append("_");
            stringbuilder.append(((UUID) (obj)).toString());
            stringbuilder.append("_");
            stringbuilder.append(b.a());
            stringbuilder.append(".tap");
            obj = stringbuilder.toString();
            d.a(((String) (obj)));
            ba.a(4, String.format(Locale.US, "generated new to-send analytics file %s", new Object[] {
                obj
            }));
            b.a();
        } else
        {
            flag = false;
        }
        a(((String) (obj)));
        return flag;
    }

    final List b()
    {
        return d.a(1);
    }

    final void c()
    {
        d.a(d.c());
        d.d();
    }

    final void d()
    {
        Object obj1 = d.c();
        if (((List) (obj1)).size() <= e)
        {
            return;
        }
        int i = ((List) (obj1)).size() - e;
        ba.c(String.format(Locale.US, "Found %d files in session analytics roll over directory, this is greater than %d, deleting %d oldest files", new Object[] {
            Integer.valueOf(((List) (obj1)).size()), Integer.valueOf(e), Integer.valueOf(i)
        }));
        Object obj = new TreeSet(new k(this));
        File file;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((TreeSet) (obj)).add(new l(this, file, b(file.getName()))))
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
            ((ArrayList) (obj1)).add(((l)((Iterator) (obj)).next()).a);
        } while (((ArrayList) (obj1)).size() != i);
        d.a(((List) (obj1)));
    }
}
