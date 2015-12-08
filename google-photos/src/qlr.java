// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class qlr
{

    public final Class a;
    public final int b;
    public final boolean c = false;
    private int d;

    private qlr(int i, Class class1, int j, boolean flag)
    {
        d = i;
        a = class1;
        b = j;
    }

    private Object a(qlo qlo1)
    {
        Object obj;
        if (c)
        {
            obj = a.getComponentType();
        } else
        {
            obj = a;
        }
        d;
        JVM INSTR tableswitch 10 11: default 221
    //                   10 128
    //                   11 150;
           goto _L1 _L2 _L3
_L1:
        int i = d;
        throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());
_L2:
        qlw qlw1;
        try
        {
            qlw1 = (qlw)((Class) (obj)).newInstance();
            qlo1.a(qlw1, qmb.b(b));
        }
        // Misplaced declaration of an exception variable
        catch (qlo qlo1)
        {
            obj = String.valueOf(obj);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 33)).append("Error creating instance of class ").append(((String) (obj))).toString(), qlo1);
        }
        // Misplaced declaration of an exception variable
        catch (qlo qlo1)
        {
            obj = String.valueOf(obj);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 33)).append("Error creating instance of class ").append(((String) (obj))).toString(), qlo1);
        }
        // Misplaced declaration of an exception variable
        catch (qlo qlo1)
        {
            throw new IllegalArgumentException("Error reading extension field", qlo1);
        }
        return qlw1;
_L3:
        qlw1 = (qlw)((Class) (obj)).newInstance();
        qlo1.a(qlw1);
        return qlw1;
    }

    public static qlr a(int i, Class class1, long l)
    {
        return new qlr(11, class1, (int)l, false);
    }

    private int b(Object obj)
    {
        int i = qmb.b(b);
        switch (d)
        {
        default:
            i = d;
            throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());

        case 10: // '\n'
            return qlp.b(i, (qlw)obj);

        case 11: // '\013'
            return qlp.c(i, (qlw)obj);
        }
    }

    private void b(Object obj, qlp qlp1)
    {
        qlp1.d(b);
        d;
        JVM INSTR tableswitch 10 11: default 114
    //                   10 80
    //                   11 105;
           goto _L1 _L2 _L3
_L1:
        int i = d;
        throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());
_L2:
        try
        {
            obj = (qlw)obj;
            int j = qmb.b(b);
            ((qlw) (obj)).a(qlp1);
            qlp1.g(j, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        qlp1.a((qlw)obj);
        return;
    }

    final int a(Object obj)
    {
        int i = 0;
        int k;
        if (c)
        {
            int l = Array.getLength(obj);
            int j = 0;
            do
            {
                k = i;
                if (j >= l)
                {
                    break;
                }
                k = i;
                if (Array.get(obj, j) != null)
                {
                    k = i + b(Array.get(obj, j));
                }
                j++;
                i = k;
            } while (true);
        } else
        {
            k = b(obj);
        }
        return k;
    }

    Object a(List list)
    {
        ArrayList arraylist;
        boolean flag;
        int k;
        flag = false;
        arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            qlz qlz1 = (qlz)list.get(i);
            if (qlz1.b.length != 0)
            {
                byte abyte0[] = qlz1.b;
                arraylist.add(a(qlo.a(abyte0, 0, abyte0.length)));
            }
        }

        k = arraylist.size();
        if (k != 0) goto _L2; else goto _L1
_L1:
        list = null;
_L4:
        return list;
_L2:
        Object obj = a.cast(Array.newInstance(a.getComponentType(), k));
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

    final void a(Object obj, qlp qlp1)
    {
        if (c)
        {
            int j = Array.getLength(obj);
            for (int i = 0; i < j; i++)
            {
                Object obj1 = Array.get(obj, i);
                if (obj1 != null)
                {
                    b(obj1, qlp1);
                }
            }

        } else
        {
            b(obj, qlp1);
        }
    }

    Object b(List list)
    {
        if (list.isEmpty())
        {
            return null;
        } else
        {
            qlz qlz1 = (qlz)list.get(list.size() - 1);
            list = a;
            byte abyte0[] = qlz1.b;
            return list.cast(a(qlo.a(abyte0, 0, abyte0.length)));
        }
    }
}
