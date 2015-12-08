// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;

abstract class akR
    implements akr
{
    static interface a
    {

        public abstract String a(int i);

        public abstract void a(int i, String s);
    }

    static final class b
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

        public final String a(int i)
        {
            String as[] = a();
            if (as == null)
            {
                return null;
            } else
            {
                return as[i];
            }
        }

        public final void a(int i, String s)
        {
            String as1[] = a();
            String as[] = as1;
            if (as1 == null)
            {
                as = b();
            }
            as[i] = s;
        }

        public b()
        {
            b();
        }
    }


    private static boolean d = true;
    int a;
    String b;
    String c;
    private Class e;
    private a f;
    private ClassLoader g;

    akR(int i, String s, Class class1)
    {
        a = -1;
        g = null;
        a = i;
        b = s;
        e = class1;
    }

    private ClassLoader a()
    {
        if (g == null)
        {
            g = getClass().getClassLoader();
        }
        return g;
    }

    static String a(int i)
    {
        throw new NullPointerException();
    }

    protected abstract String a(akT akt);

    final Class b(int i)
    {
        return akN.a(a(i), a());
    }

    final String b(akT akt)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        if (!d) goto _L2; else goto _L1
_L1:
        if (f != null) goto _L4; else goto _L3
_L3:
        try
        {
            f = new b();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d = false;
            obj = obj1;
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
_L2:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = a(akt);
        }
        if (d)
        {
            f.a(akt.d, ((String) (obj1)));
        }
        return ((String) (obj1));
_L4:
        obj = f.a(akt.d);
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final Class c()
    {
        if (e == null)
        {
            e = b(2);
        }
        return e;
    }

    final Class[] c(int i)
    {
        StringTokenizer stringtokenizer = new StringTokenizer(a(i), ":");
        int j = stringtokenizer.countTokens();
        Class aclass[] = new Class[j];
        for (i = 0; i < j; i++)
        {
            aclass[i] = akN.a(stringtokenizer.nextToken(), a());
        }

        return aclass;
    }

    public final String toString()
    {
        return b(akT.e);
    }

}
