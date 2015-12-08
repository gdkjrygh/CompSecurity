// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.c.b:
//            ak, av, au, ap, 
//            bd

public static final class a extends a
{
    public static interface a
    {

        public abstract ap a(ak.g g1);
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b e[];
        private final String d;

        static String a(b b1)
        {
            return b1.d;
        }

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/c/b/ak$g$b, s);
        }

        public static b[] values()
        {
            return (b[])e.clone();
        }

        static 
        {
            a = new b("UNKNOWN", 0, "unknown");
            b = new b("PROTO2", 1, "proto2");
            c = new b("PROTO3", 2, "proto3");
            e = (new b[] {
                a, b, c
            });
        }

        private b(String s, int i1, String s1)
        {
            super(s, i1);
            d = s1;
        }
    }


    private b.c a;
    private final b.c b[];
    private final b.c c[];
    private final b.c d[];
    private final b.c e[];
    private final b.c f[];
    private final b.c g[];
    private final b.c h;

    static ing a(ing ing)
    {
        return ing.h;
    }

    private static h a(h h1, h ah[])
    {
        boolean flag = false;
        h1 = new <init>(h1, ah, new <init>(ah));
        ah = ((<init>) (h1)).b;
        int l1 = ah.length;
        for (int i1 = 0; i1 < l1; i1++)
        {
            a(ah[i1]);
        }

        ah = ((a) (h1)).d;
        l1 = ah.length;
        for (int j1 = 0; j1 < l1; j1++)
        {
            a(ah[j1]);
        }

        ah = ((a) (h1)).e;
        l1 = ah.length;
        for (int k1 = ((flag) ? 1 : 0); k1 < l1; k1++)
        {
            a(ah[k1]);
        }

        return h1;
    }

    public static void a(a a1, ap ap)
    {
        f f1 = a1.a.();
        try
        {
            ap = (f1, ap);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", a1);
        }
        a1.a(((a) (ap)));
    }

    private void a(a a1)
    {
        boolean flag = false;
        a = a1;
        for (int i1 = 0; i1 < b.length; i1++)
        {
            a(b[i1], a1.(i1));
        }

        for (int j1 = 0; j1 < c.length; j1++)
        {
            a(c[j1], a1.(j1));
        }

        int k1 = 0;
        int l1;
        do
        {
            l1 = ((flag) ? 1 : 0);
            if (k1 >= d.length)
            {
                break;
            }
            a(d[k1], a1.(k1));
            k1++;
        } while (true);
        for (; l1 < e.length; l1++)
        {
            a(e[l1], a1.(l1));
        }

    }

    public static void a(String as[], ing aing[], a a1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j1 = as.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            stringbuilder.append(as[i1]);
        }

        as = stringbuilder.toString().getBytes(au.b);
        try
        {
            as = (as);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", as);
        }
        try
        {
            aing = a(((a) (as)), aing);
        }
        // Misplaced declaration of an exception variable
        catch (ing aing[])
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid embedded descriptor for \"")).append(as.()).append("\".").toString(), aing);
        }
        a1.a(aing);
    }

    public final a.a a()
    {
        return a;
    }

    public final String b()
    {
        return a.();
    }

    public final String c()
    {
        return a.();
    }

    public final  d()
    {
        return this;
    }

    public final String e()
    {
        return a.();
    }

    public final  f()
    {
        return a.();
    }

    public final List g()
    {
        return Collections.unmodifiableList(Arrays.asList(b));
    }

    public final List h()
    {
        return Collections.unmodifiableList(Arrays.asList(e));
    }

    public final volatile bd i()
    {
        return a;
    }

    public final List j()
    {
        return Collections.unmodifiableList(Arrays.asList(g));
    }

    public final b k()
    {
        if (b.a(b.c).equals(a.()))
        {
            return b.c;
        } else
        {
            return b.b;
        }
    }

    final boolean l()
    {
        return k() == b.c;
    }

    private ing(ing ing, ing aing[], ing ing1)
    {
        h = ing1;
        a = ing;
        f = (f[])aing.clone();
        HashMap hashmap = new HashMap();
        int k2 = aing.length;
        for (int i1 = 0; i1 < k2; i1++)
        {
            hMap hmap = aing[i1];
            hashmap.put(hmap.a.(), hmap);
        }

        aing = new ArrayList();
        for (int j1 = 0; j1 < ing.(); j1++)
        {
            int l2 = ing.(j1);
            if (l2 < 0 || l2 >= ing.())
            {
                throw new <init>(this, "Invalid public dependency index.", (byte)0);
            }
            ect ect = (ing)hashmap.get(ing.(l2));
            if (ect != null)
            {
                aing.add(ect);
            }
        }

        g = new g[aing.size()];
        aing.toArray(g);
        ing1.a(a.(), this);
        b = new b[ing.()];
        for (int k1 = 0; k1 < ing.(); k1++)
        {
            b[k1] = new <init>(ing.(k1), this, k1);
        }

        c = new c[ing.()];
        for (int l1 = 0; l1 < ing.(); l1++)
        {
            c[l1] = new <init>(ing.(l1), this, null, l1, (byte)0);
        }

        d = new d[ing.()];
        for (int i2 = 0; i2 < ing.(); i2++)
        {
            d[i2] = new <init>(ing.(i2), this, i2, (byte)0);
        }

        e = new e[ing.()];
        for (int j2 = 0; j2 < ing.(); j2++)
        {
            e[j2] = new <init>(ing.(j2), this, null, j2, true, (byte)0);
        }

    }

    ing(String s, ing ing)
    {
        h = new <init>(new <init>[0]);
        a = ().a((new StringBuilder()).append(ing.c()).append(".placeholder.proto").toString()).b(s).a(ing.a()).g();
        f = new f[0];
        g = new g[0];
        b = (new b[] {
            ing
        });
        c = new c[0];
        d = new d[0];
        e = new e[0];
        h.a(s, this);
        h.a(ing);
    }
}
