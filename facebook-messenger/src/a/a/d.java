// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import a.a;
import a.b;
import a.c;
import a.f;
import a.h;
import a.i;
import java.lang.reflect.Array;
import java.util.List;

// Referenced classes of package a.a:
//            e, f, b, c

public class d
    implements f
{

    public d()
    {
    }

    public static i a(e e1, Object aobj[], Object aobj1[])
    {
        if (e1 == null)
        {
            throw new IllegalArgumentException("path is null");
        }
        if (aobj == null)
        {
            throw new IllegalArgumentException("original sequence is null");
        }
        if (aobj1 == null)
        {
            throw new IllegalArgumentException("revised sequence is null");
        }
        i j = new i();
        if (e1.a())
        {
            e1 = e1.c;
        }
        while (e1 != null && e1.c != null && e1.c.b >= 0) 
        {
            if (e1.a())
            {
                throw new IllegalStateException("bad diffpath: found snake when looking for diff");
            }
            int k = e1.a;
            int l = e1.b;
            e e2 = e1.c;
            int i1 = e2.a;
            int j1 = e2.b;
            e1 = new b(i1, a(aobj, i1, k));
            b b1 = new b(j1, a(aobj1, j1, l));
            if (e1.c() == 0 && b1.c() != 0)
            {
                e1 = new h(e1, b1);
            } else
            if (e1.c() > 0 && b1.c() == 0)
            {
                e1 = new c(e1, b1);
            } else
            {
                e1 = new a(e1, b1);
            }
            j.a(e1);
            if (e2.a())
            {
                e1 = e2.c;
            } else
            {
                e1 = e2;
            }
        }
        return j;
    }

    public static Object[] a(Object aobj[], int j, int k)
    {
        return a(aobj, j, k, ((Object) (aobj)).getClass());
    }

    public static Object[] a(Object aobj[], int j, int k, Class class1)
    {
        int l = k - j;
        if (l < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(j).append(" > ").append(k).toString());
        }
        if (class1 == [Ljava/lang/Object;)
        {
            class1 = ((Class) ((Object[])new Object[l]));
        } else
        {
            class1 = ((Class) ((Object[])(Object[])Array.newInstance(class1.getComponentType(), l)));
        }
        System.arraycopy(((Object) (aobj)), j, class1, 0, Math.min(aobj.length - j, l));
        return class1;
    }

    public static e b(Object aobj[], Object aobj1[])
    {
        if (aobj == null)
        {
            throw new IllegalArgumentException("original sequence is null");
        }
        if (aobj1 == null)
        {
            throw new IllegalArgumentException("revised sequence is null");
        }
        int k1 = aobj.length;
        int l1 = aobj1.length;
        int i2 = k1 + l1 + 1;
        int j = i2 * 2 + 1;
        int j2 = j / 2;
        e ae[] = new e[j];
        ae[j2 + 1] = new a.a.f(0, -1, null);
        for (int l = 0; l < i2; l++)
        {
            for (int i1 = -l; i1 <= l; i1 += 2)
            {
                int k2 = j2 + i1;
                int l2 = k2 + 1;
                int j1 = k2 - 1;
                Object obj;
                int k;
                if (i1 == -l || i1 != l && ae[j1].a < ae[l2].a)
                {
                    k = ae[l2].a;
                    obj = ae[l2];
                } else
                {
                    k = ae[j1].a + 1;
                    obj = ae[j1];
                }
                ae[j1] = null;
                j1 = k - i1;
                obj = new a.a.b(k, j1, ((e) (obj)));
                for (; k < k1 && j1 < l1 && aobj[k].equals(aobj1[j1]); j1++)
                {
                    k++;
                }

                if (k > ((e) (obj)).a)
                {
                    obj = new a.a.f(k, j1, ((e) (obj)));
                }
                ae[k2] = ((e) (obj));
                if (k >= k1 && j1 >= l1)
                {
                    return ae[k2];
                }
            }

            ae[(j2 + l) - 1] = null;
        }

        throw new a.a.c("could not find a diff path");
    }

    public i a(List list, List list1)
    {
        return a(list.toArray(), list1.toArray());
    }

    public i a(Object aobj[], Object aobj1[])
    {
        try
        {
            aobj = a(b(aobj, aobj1), aobj, aobj1);
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            ((a.a.c) (aobj)).printStackTrace();
            return new i();
        }
        return ((i) (aobj));
    }
}
