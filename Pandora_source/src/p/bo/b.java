// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bo;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

final class p.bo.b
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a f[];
        public final byte e;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/bo/b$a, s);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        public String a()
        {
            return name().toLowerCase();
        }

        static 
        {
            a = new a("BYTES", 0, 0);
            b = new a("STRING", 1, 1);
            c = new a("UINT", 2, 2);
            d = new a("INT", 3, 3);
            f = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i, int j)
        {
            super(s, i);
            e = (byte)j;
        }
    }

    public static class b extends RuntimeException
    {

        public b()
        {
            super("Value exceeds tuple capacity");
        }
    }

    static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        private static final c f[];
        public final int e;

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(p/bo/b$c, s);
        }

        public static c[] values()
        {
            return (c[])f.clone();
        }

        static 
        {
            a = new c("NONE", 0, 0);
            b = new c("BYTE", 1, 1);
            c = new c("SHORT", 2, 2);
            d = new c("WORD", 3, 4);
            f = (new c[] {
                a, b, c, d
            });
        }

        private c(String s, int i, int j)
        {
            super(s, i);
            e = j;
        }
    }


    static final Map a;
    static final Map b;
    private static final Charset h = Charset.forName("UTF-8");
    public final int c;
    public final a d;
    public final c e;
    public final int f;
    public final Object g;

    private p.bo.b(int i, a a1, c c1, int j, Object obj)
    {
        c = i;
        d = a1;
        e = c1;
        f = j;
        g = obj;
    }

    static p.bo.b a(int i, a a1, c c1, int j)
    {
        return new p.bo.b(i, a1, c1, c1.e, Long.valueOf(j));
    }

    static p.bo.b a(int i, a a1, c c1, Object obj)
    {
        int j = 0x7fffffff;
        if (c1 != c.a)
        {
            j = c1.e;
        } else
        if (a1 == a.a)
        {
            j = ((byte[])(byte[])obj).length;
        } else
        if (a1 == a.b)
        {
            j = ((String)obj).getBytes(h).length;
        }
        if (j > 65535)
        {
            throw new b();
        } else
        {
            return new p.bo.b(i, a1, c1, j, obj);
        }
    }

    static 
    {
        boolean flag = false;
        a = new HashMap();
        Object aobj[] = a.values();
        int k = aobj.length;
        for (int i = 0; i < k; i++)
        {
            a a1 = aobj[i];
            a.put(a1.a(), a1);
        }

        b = new HashMap();
        aobj = c.values();
        k = aobj.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            c c1 = aobj[j];
            b.put(Integer.valueOf(c1.e), c1);
        }

    }
}
