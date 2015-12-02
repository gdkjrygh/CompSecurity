// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            i, TrashItemInfo

public class j
    implements i
{
    public static final class a
    {

        public static List a(List list, int k)
        {
            ArrayList arraylist = new ArrayList();
            for (list = list.iterator(); list.hasNext(); arraylist.add(new j((TrashItemInfo)list.next(), k))) { }
            return arraylist;
        }

        public static void a(i k, List list, int l)
        {
            if (k != null)
            {
                list = list.iterator();
                while (list.hasNext()) 
                {
                    j j1 = new j((TrashItemInfo)list.next(), l);
                    if (k.b() != null)
                    {
                        k.b().add(j1);
                        j1.a(k);
                    }
                }
            }
        }
    }


    private i a;
    private final List b = new ArrayList();
    private Object c;
    private boolean d;
    private int e;
    private boolean f;
    private boolean g;
    private int h;

    public j(Object obj, int k)
    {
        d = false;
        e = 0;
        f = false;
        g = true;
        h = -1;
        c = obj;
        h = k;
    }

    public i a()
    {
        return a;
    }

    public void a(i k)
    {
        a = k;
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    public List b()
    {
        return b;
    }

    public Object c()
    {
        return c;
    }

    public boolean d()
    {
        return f;
    }

    public boolean e()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        if (f) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (a.d())
        {
            return a.e();
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void f()
    {
        b.clear();
    }

    public boolean g()
    {
        return !b.isEmpty();
    }

    public boolean h()
    {
        return a == null;
    }

    public Integer i()
    {
        if (h == -1)
        {
            return null;
        } else
        {
            return Integer.valueOf(h);
        }
    }
}
