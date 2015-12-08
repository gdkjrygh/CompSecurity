// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class hak
{

    private volatile long a;
    public Context b;
    public haj c;
    public final gzc d;
    public han e;
    public List f;

    public hak(Context context, haj haj, gzc gzc1, han han1)
    {
        f = new CopyOnWriteArrayList();
        b = context.getApplicationContext();
        c = haj;
        e = han1;
        d = gzc1;
        a = d.a();
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

    public int b()
    {
        return 100;
    }

    public int c()
    {
        return 8000;
    }

    public final boolean d()
    {
        boolean flag = false;
        if (!e.b())
        {
            String s = a();
            e.a(s);
            CommonUtils.c(b, String.format(Locale.US, "generated new file %s", new Object[] {
                s
            }));
            a = d.a();
            flag = true;
        }
        for (Iterator iterator = f.iterator(); iterator.hasNext();)
        {
            hao hao1 = (hao)iterator.next();
            try
            {
                hao1.a();
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
        Object obj1 = e.d();
        int i = b();
        if (((List) (obj1)).size() <= i)
        {
            return;
        }
        int j = ((List) (obj1)).size() - i;
        CommonUtils.a(b, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[] {
            Integer.valueOf(((List) (obj1)).size()), Integer.valueOf(i), Integer.valueOf(j)
        }));
        Object obj = new TreeSet(new Comparator() {

            public final volatile int compare(Object obj2, Object obj3)
            {
                obj2 = (hal)obj2;
                obj3 = (hal)obj3;
                return (int)(((hal) (obj2)).b - ((hal) (obj3)).b);
            }

        });
        File file;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((TreeSet) (obj)).add(new hal(file, a(file.getName()))))
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
            ((ArrayList) (obj1)).add(((hal)((Iterator) (obj)).next()).a);
        } while (((ArrayList) (obj1)).size() != j);
        e.a(((List) (obj1)));
    }
}
