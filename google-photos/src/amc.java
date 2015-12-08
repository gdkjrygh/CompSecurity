// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class amc
{

    public final atp a;
    public final aye b = new aye();
    public final ayk c = new ayk();
    public final anr d = new anr();
    private final ayi e = new ayi();
    private final axh f = new axh();
    private final ayh g = new ayh();
    private final ayg h = new ayg();
    private final jw i = bai.a();

    public amc(Context context)
    {
        a = new atp(context.getApplicationContext(), i);
    }

    public final amc a(anq anq)
    {
        d.a(anq);
        return this;
    }

    public final amc a(Class class1, anc anc)
    {
        b.a(class1, anc);
        return this;
    }

    public final amc a(Class class1, ank ank)
    {
        c.a(class1, ank);
        return this;
    }

    public final amc a(Class class1, Class class2, anj anj)
    {
        e.a(anj, class1, class2);
        return this;
    }

    public final amc a(Class class1, Class class2, ato ato)
    {
        a.a(class1, class2, ato);
        return this;
    }

    public final amc a(Class class1, Class class2, axg axg)
    {
        f.a(class1, class2, axg);
        return this;
    }

    public final apx a(Class class1, Class class2, Class class3)
    {
        apx apx1 = h.b(class1, class2, class3);
        Object obj = apx1;
        if (apx1 == null)
        {
            obj = apx1;
            if (!h.a(class1, class2, class3))
            {
                obj = new ArrayList();
                for (Iterator iterator = e.b(class1, class2).iterator(); iterator.hasNext();)
                {
                    Class class4 = (Class)iterator.next();
                    Iterator iterator1 = f.b(class4, class3).iterator();
                    while (iterator1.hasNext()) 
                    {
                        Class class5 = (Class)iterator1.next();
                        ((List) (obj)).add(new aoy(class1, class4, class5, e.a(class1, class4), f.a(class4, class5), i));
                    }
                }

                ayg ayg1;
                if (((List) (obj)).isEmpty())
                {
                    obj = null;
                } else
                {
                    obj = new apx(class1, class2, class3, ((List) (obj)), i);
                }
                ayg1 = h;
                synchronized (ayg1.a)
                {
                    ayg1.a.put(new baf(class1, class2, class3), obj);
                }
            }
        }
        return ((apx) (obj));
        class1;
        jk1;
        JVM INSTR monitorexit ;
        throw class1;
    }

    public final List a(Object obj)
    {
        List list = a.a(obj);
        if (list.isEmpty())
        {
            throw new ao(obj);
        } else
        {
            return list;
        }
    }

    public final amc b(Class class1, Class class2, anj anj)
    {
        e.b(anj, class1, class2);
        return this;
    }

    public final amc b(Class class1, Class class2, ato ato)
    {
        a.b(class1, class2, ato);
        return this;
    }

    public final List b(Class class1, Class class2, Class class3)
    {
        Object obj = g.a(class1, class2);
        if (obj == null)
        {
            obj = new ArrayList();
            for (Iterator iterator = a.a(class1).iterator(); iterator.hasNext();)
            {
                Object obj1 = (Class)iterator.next();
                obj1 = e.b(((Class) (obj1)), class2).iterator();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    Class class4 = (Class)((Iterator) (obj1)).next();
                    if (!f.b(class4, class3).isEmpty() && !((List) (obj)).contains(class4))
                    {
                        ((List) (obj)).add(class4);
                    }
                }
            }

            ayh ayh1 = g;
            List list = Collections.unmodifiableList(((List) (obj)));
            synchronized (ayh1.a)
            {
                ayh1.a.put(new baf(class1, class2), list);
            }
            return ((List) (obj));
        } else
        {
            return ((List) (obj));
        }
        class1;
        class3;
        JVM INSTR monitorexit ;
        throw class1;
    }
}
