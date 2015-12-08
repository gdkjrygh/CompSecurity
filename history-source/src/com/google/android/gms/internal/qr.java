// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            qy, qo, qz, qw, 
//            qp

public class qr
{

    protected final Class ayX;
    protected final boolean ayY;
    public final int tag;
    protected final int type;

    private qr(int i, Class class1, int j, boolean flag)
    {
        type = i;
        ayX = class1;
        tag = j;
        ayY = flag;
    }

    public static qr a(int i, Class class1, int j)
    {
        return new qr(i, class1, j, false);
    }

    private Object n(List list)
    {
        ArrayList arraylist;
        boolean flag;
        int k;
        flag = false;
        arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            qy qy1 = (qy)list.get(i);
            if (qy1.azi.length != 0)
            {
                a(qy1, arraylist);
            }
        }

        k = arraylist.size();
        if (k != 0) goto _L2; else goto _L1
_L1:
        list = null;
_L4:
        return list;
_L2:
        Object obj = ayX.cast(Array.newInstance(ayX.getComponentType(), k));
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

    private Object o(List list)
    {
        if (list.isEmpty())
        {
            return null;
        } else
        {
            list = (qy)list.get(list.size() - 1);
            return ayX.cast(x(qo.p(((qy) (list)).azi)));
        }
    }

    int B(Object obj)
    {
        if (ayY)
        {
            return C(obj);
        } else
        {
            return D(obj);
        }
    }

    protected int C(Object obj)
    {
        int j = 0;
        int l = Array.getLength(obj);
        for (int i = 0; i < l;)
        {
            int k = j;
            if (Array.get(obj, i) != null)
            {
                k = j + D(Array.get(obj, i));
            }
            i++;
            j = k;
        }

        return j;
    }

    protected int D(Object obj)
    {
        int i = qz.hl(tag);
        switch (type)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());

        case 10: // '\n'
            return qp.b(i, (qw)obj);

        case 11: // '\013'
            return qp.c(i, (qw)obj);
        }
    }

    protected void a(qy qy1, List list)
    {
        list.add(x(qo.p(qy1.azi)));
    }

    void a(Object obj, qp qp1)
        throws IOException
    {
        if (ayY)
        {
            c(obj, qp1);
            return;
        } else
        {
            b(obj, qp1);
            return;
        }
    }

    protected void b(Object obj, qp qp1)
    {
        qp1.hd(tag);
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
            obj = (qw)obj;
            int i = qz.hl(tag);
            qp1.b(((qw) (obj)));
            qp1.x(i, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        qp1.c((qw)obj);
        return;
    }

    protected void c(Object obj, qp qp1)
    {
        int j = Array.getLength(obj);
        for (int i = 0; i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            if (obj1 != null)
            {
                b(obj1, qp1);
            }
        }

    }

    final Object m(List list)
    {
        if (list == null)
        {
            return null;
        }
        if (ayY)
        {
            return n(list);
        } else
        {
            return o(list);
        }
    }

    protected Object x(qo qo1)
    {
        Class class1;
        if (ayY)
        {
            class1 = ayX.getComponentType();
        } else
        {
            class1 = ayX;
        }
        type;
        JVM INSTR tableswitch 10 11: default 185
    //                   10 107
    //                   11 129;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());
_L2:
        qw qw1;
        try
        {
            qw1 = (qw)class1.newInstance();
            qo1.a(qw1, qz.hl(tag));
        }
        // Misplaced declaration of an exception variable
        catch (qo qo1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error creating instance of class ").append(class1).toString(), qo1);
        }
        // Misplaced declaration of an exception variable
        catch (qo qo1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error creating instance of class ").append(class1).toString(), qo1);
        }
        // Misplaced declaration of an exception variable
        catch (qo qo1)
        {
            throw new IllegalArgumentException("Error reading extension field", qo1);
        }
        return qw1;
_L3:
        qw1 = (qw)class1.newInstance();
        qo1.a(qw1);
        return qw1;
    }
}
