// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.b;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.j;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package io.fabric.sdk.android.services.b:
//            c, f, g

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
    public final j d;
    protected final f e;
    protected volatile long f;
    protected final List g = new CopyOnWriteArrayList();

    public d(Context context, c c1, j j1, f f1)
        throws IOException
    {
        b = context.getApplicationContext();
        c = c1;
        e = f1;
        d = j1;
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

    public final void a(g g1)
    {
        if (g1 != null)
        {
            g.add(g1);
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
            CommonUtils.c(b, s);
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
            CommonUtils.c(b, String.format(Locale.US, "generated new file %s", new Object[] {
                s
            }));
            f = d.a();
            flag = true;
        }
        for (Iterator iterator = g.iterator(); iterator.hasNext();)
        {
            g g1 = (g)iterator.next();
            try
            {
                g1.a();
            }
            catch (Exception exception)
            {
                CommonUtils.b(b, "One of the roll over listeners threw an exception");
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
        CommonUtils.a(b, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[] {
            Integer.valueOf(((List) (obj1)).size()), Integer.valueOf(i), Integer.valueOf(k)
        }));
        Object obj = new TreeSet(new Comparator() {

            final d a;

            public final volatile int compare(Object obj2, Object obj3)
            {
                obj2 = (a)obj2;
                obj3 = (a)obj3;
                return (int)(((a) (obj2)).b - ((a) (obj3)).b);
            }

            
            {
                a = d.this;
                super();
            }
        });
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
