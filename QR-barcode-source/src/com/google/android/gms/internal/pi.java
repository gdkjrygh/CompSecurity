// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            pp, pf, pq, pn, 
//            pg

public class pi
{

    protected final Class awK;
    protected final boolean awL;
    protected final int tag;
    protected final int type;

    private pi(int i, Class class1, int j, boolean flag)
    {
        type = i;
        awK = class1;
        tag = j;
        awL = flag;
    }

    public static pi a(int i, Class class1, int j)
    {
        return new pi(i, class1, j, false);
    }

    private Object m(List list)
    {
        ArrayList arraylist;
        boolean flag;
        int k;
        flag = false;
        arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            pp pp1 = (pp)list.get(i);
            if (pp1.awV.length != 0)
            {
                a(pp1, arraylist);
            }
        }

        k = arraylist.size();
        if (k != 0) goto _L2; else goto _L1
_L1:
        list = null;
_L4:
        return list;
_L2:
        Object obj = awK.cast(Array.newInstance(awK.getComponentType(), k));
        int j = ((flag) ? 1 : 0);
        do
        {
            list = ((List) (obj));
            if (j >= k)
            {
                continue;
            }
            Array.set(obj, j, arraylist.get(j));
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Object n(List list)
    {
        if (list.isEmpty())
        {
            return null;
        } else
        {
            list = (pp)list.get(list.size() - 1);
            return awK.cast(u(pf.p(((pp) (list)).awV)));
        }
    }

    int A(Object obj)
    {
        if (awL)
        {
            return B(obj);
        } else
        {
            return C(obj);
        }
    }

    protected int B(Object obj)
    {
        int j = 0;
        int i1 = Array.getLength(obj);
        for (int i = 0; i < i1;)
        {
            int k = j;
            if (Array.get(obj, i) != null)
            {
                k = j + C(Array.get(obj, i));
            }
            i++;
            j = k;
        }

        return j;
    }

    protected int C(Object obj)
    {
        int i = pq.gI(tag);
        switch (type)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());

        case 10: // '\n'
            return pg.b(i, (pn)obj);

        case 11: // '\013'
            return pg.c(i, (pn)obj);
        }
    }

    protected void a(pp pp1, List list)
    {
        list.add(u(pf.p(pp1.awV)));
    }

    void a(Object obj, pg pg1)
        throws IOException
    {
        if (awL)
        {
            c(obj, pg1);
            return;
        } else
        {
            b(obj, pg1);
            return;
        }
    }

    protected void b(Object obj, pg pg1)
    {
        pg1.gA(tag);
        type;
        JVM INSTR tableswitch 10 11: default 110
    //                   10 76
    //                   11 101;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());
_L2:
        try
        {
            obj = (pn)obj;
            int i = pq.gI(tag);
            pg1.b(((pn) (obj)));
            pg1.w(i, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        pg1.c((pn)obj);
        return;
    }

    protected void c(Object obj, pg pg1)
    {
        int j = Array.getLength(obj);
        for (int i = 0; i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            if (obj1 != null)
            {
                b(obj1, pg1);
            }
        }

    }

    final Object l(List list)
    {
        if (list == null)
        {
            return null;
        }
        if (awL)
        {
            return m(list);
        } else
        {
            return n(list);
        }
    }

    protected Object u(pf pf1)
    {
        Class class1;
        if (awL)
        {
            class1 = awK.getComponentType();
        } else
        {
            class1 = awK;
        }
        type;
        JVM INSTR tableswitch 10 11: default 185
    //                   10 107
    //                   11 129;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());
_L2:
        pn pn1;
        try
        {
            pn1 = (pn)class1.newInstance();
            pf1.a(pn1, pq.gI(tag));
        }
        // Misplaced declaration of an exception variable
        catch (pf pf1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error creating instance of class ").append(class1).toString(), pf1);
        }
        // Misplaced declaration of an exception variable
        catch (pf pf1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error creating instance of class ").append(class1).toString(), pf1);
        }
        // Misplaced declaration of an exception variable
        catch (pf pf1)
        {
            throw new IllegalArgumentException("Error reading extension field", pf1);
        }
        return pn1;
_L3:
        pn1 = (pn)class1.newInstance();
        pf1.a(pn1);
        return pn1;
    }
}
