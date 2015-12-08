// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.b.b.b;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;
import org.b.a.d;

// Referenced classes of package org.b.b.b:
//            b, h

abstract class f
    implements d
{
    private static interface a
    {

        public abstract String a(int i1);

        public abstract void a(int i1, String s);
    }

    private static final class b
        implements a
    {

        private SoftReference a;

        private String[] a()
        {
            return (String[])a.get();
        }

        private String[] b()
        {
            String as[] = new String[3];
            a = new SoftReference(as);
            return as;
        }

        public final String a(int i1)
        {
            String as[] = a();
            if (as == null)
            {
                return null;
            } else
            {
                return as[i1];
            }
        }

        public final void a(int i1, String s)
        {
            String as1[] = a();
            String as[] = as1;
            if (as1 == null)
            {
                as = b();
            }
            as[i1] = s;
        }

        public b()
        {
            b();
        }
    }


    private static boolean a = true;
    static String k[] = new String[0];
    static Class l[] = new Class[0];
    private String b;
    int e;
    String f;
    String g;
    Class h;
    a i;
    ClassLoader j;

    f(int i1, String s, Class class1)
    {
        e = -1;
        j = null;
        e = i1;
        f = s;
        h = class1;
    }

    private ClassLoader b()
    {
        if (j == null)
        {
            j = getClass().getClassLoader();
        }
        return j;
    }

    public final Class a()
    {
        if (h == null)
        {
            h = b(2);
        }
        return h;
    }

    final String a(int i1)
    {
        int j1 = 0;
        int l1 = b.indexOf('-');
        int k1 = i1;
        i1 = l1;
        for (; k1 > 0; k1--)
        {
            j1 = i1 + 1;
            i1 = b.indexOf('-', j1);
        }

        k1 = i1;
        if (i1 == -1)
        {
            k1 = b.length();
        }
        return b.substring(j1, k1);
    }

    protected abstract String a(h h1);

    final Class b(int i1)
    {
        return org.b.b.b.b.a(a(i1), b());
    }

    final String b(h h1)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        if (!a) goto _L2; else goto _L1
_L1:
        if (i != null) goto _L4; else goto _L3
_L3:
        try
        {
            i = new b();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a = false;
            obj = obj1;
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
_L2:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = a(h1);
        }
        if (a)
        {
            i.a(h1.i, ((String) (obj1)));
        }
        return ((String) (obj1));
_L4:
        obj = i.a(h1.i);
        if (true) goto _L2; else goto _L5
_L5:
    }

    final Class[] c(int i1)
    {
        StringTokenizer stringtokenizer = new StringTokenizer(a(i1), ":");
        int j1 = stringtokenizer.countTokens();
        Class aclass[] = new Class[j1];
        for (i1 = 0; i1 < j1; i1++)
        {
            aclass[i1] = org.b.b.b.b.a(stringtokenizer.nextToken(), b());
        }

        return aclass;
    }

    public final String toString()
    {
        return b(h.k);
    }

}
