// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.cl;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            f

public final class ke
{
    public static final class a
    {

        private final Map a;
        private final h.a b;

        public final Map a()
        {
            return Collections.unmodifiableMap(a);
        }

        public final void a(String s, h.a a1)
        {
            a.put(s, a1);
        }

        public final h.a b()
        {
            return b;
        }

        public final String toString()
        {
            return (new StringBuilder("Properties: ")).append(Collections.unmodifiableMap(a)).append(" pushAfterEvaluate: ").append(b).toString();
        }

        private a(Map map, h.a a1)
        {
            a = map;
            b = a1;
        }

        a(Map map, h.a a1, byte byte0)
        {
            this(map, a1);
        }
    }

    public static final class b
    {

        private final Map a;
        private h.a b;

        public final a a()
        {
            return new a(a, b, (byte)0);
        }

        public final b a(h.a a1)
        {
            b = a1;
            return this;
        }

        public final b a(String s, h.a a1)
        {
            a.put(s, a1);
            return this;
        }

        private b()
        {
            a = new HashMap();
        }

        b(byte byte0)
        {
            this();
        }
    }

    public static final class c
    {

        private final List a;
        private final Map b;
        private final String c;
        private final int d;

        public final List a()
        {
            return a;
        }

        public final String b()
        {
            return c;
        }

        public final Map c()
        {
            return b;
        }

        public final String toString()
        {
            return (new StringBuilder("Rules: ")).append(a).append("  Macros: ").append(b).toString();
        }

        private c(List list, Map map, String s, int i)
        {
            a = Collections.unmodifiableList(list);
            b = Collections.unmodifiableMap(map);
            c = s;
            d = i;
        }

        c(List list, Map map, String s, int i, byte byte0)
        {
            this(list, map, s, i);
        }
    }

    public static final class d
    {

        private final List a;
        private final Map b;
        private String c;
        private int d;

        public final d a()
        {
            d = 1;
            return this;
        }

        public final d a(a a1)
        {
            String s = cl.a((h.a)a1.a().get(com.google.android.gms.internal.f.bk.toString()));
            List list = (List)b.get(s);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                b.put(s, obj);
            }
            ((List) (obj)).add(a1);
            return this;
        }

        public final d a(e e1)
        {
            a.add(e1);
            return this;
        }

        public final d a(String s)
        {
            c = s;
            return this;
        }

        public final c b()
        {
            return new c(a, b, c, d, (byte)0);
        }

        private d()
        {
            a = new ArrayList();
            b = new HashMap();
            c = "";
            d = 0;
        }

        d(byte byte0)
        {
            this();
        }
    }

    public static final class e
    {

        private final List a;
        private final List b;
        private final List c;
        private final List d;
        private final List e;
        private final List f;
        private final List g;
        private final List h;
        private final List i;
        private final List j;

        public final List a()
        {
            return a;
        }

        public final List b()
        {
            return b;
        }

        public final List c()
        {
            return c;
        }

        public final List d()
        {
            return d;
        }

        public final List e()
        {
            return e;
        }

        public final List f()
        {
            return f;
        }

        public final String toString()
        {
            return (new StringBuilder("Positive predicates: ")).append(a).append("  Negative predicates: ").append(b).append("  Add tags: ").append(c).append("  Remove tags: ").append(d).append("  Add macros: ").append(e).append("  Remove macros: ").append(f).toString();
        }

        private e(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
                List list7, List list8, List list9)
        {
            a = Collections.unmodifiableList(list);
            b = Collections.unmodifiableList(list1);
            c = Collections.unmodifiableList(list2);
            d = Collections.unmodifiableList(list3);
            e = Collections.unmodifiableList(list4);
            f = Collections.unmodifiableList(list5);
            g = Collections.unmodifiableList(list6);
            h = Collections.unmodifiableList(list7);
            i = Collections.unmodifiableList(list8);
            j = Collections.unmodifiableList(list9);
        }

        e(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
                List list7, List list8, List list9, byte byte0)
        {
            this(list, list1, list2, list3, list4, list5, list6, list7, list8, list9);
        }
    }

    public static final class f
    {

        private final List a;
        private final List b;
        private final List c;
        private final List d;
        private final List e;
        private final List f;
        private final List g;
        private final List h;
        private final List i;
        private final List j;

        public final e a()
        {
            return new e(a, b, c, d, e, f, g, h, i, j, (byte)0);
        }

        public final f a(a a1)
        {
            a.add(a1);
            return this;
        }

        public final f a(String s)
        {
            i.add(s);
            return this;
        }

        public final f b(a a1)
        {
            b.add(a1);
            return this;
        }

        public final f b(String s)
        {
            j.add(s);
            return this;
        }

        public final f c(a a1)
        {
            c.add(a1);
            return this;
        }

        public final f c(String s)
        {
            g.add(s);
            return this;
        }

        public final f d(a a1)
        {
            d.add(a1);
            return this;
        }

        public final f d(String s)
        {
            h.add(s);
            return this;
        }

        public final f e(a a1)
        {
            e.add(a1);
            return this;
        }

        public final f f(a a1)
        {
            f.add(a1);
            return this;
        }

        private f()
        {
            a = new ArrayList();
            b = new ArrayList();
            c = new ArrayList();
            d = new ArrayList();
            e = new ArrayList();
            f = new ArrayList();
            g = new ArrayList();
            h = new ArrayList();
            i = new ArrayList();
            j = new ArrayList();
        }

        f(byte byte0)
        {
            this();
        }
    }

    public static final class g extends Exception
    {

        public g(String s)
        {
            super(s);
        }
    }


    public static h.a a(h.a a1)
    {
        h.a a2 = new h.a();
        a2.a = a1.a;
        a2.k = (int[])a1.k.clone();
        if (a1.l)
        {
            a2.l = a1.l;
        }
        return a2;
    }

    public static void a(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[1024];
        do
        {
            int i = inputstream.read(abyte0);
            if (i == -1)
            {
                return;
            }
            outputstream.write(abyte0, 0, i);
        } while (true);
    }
}
