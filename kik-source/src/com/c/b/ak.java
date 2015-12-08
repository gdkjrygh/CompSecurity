// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Logger;

// Referenced classes of package com.c.b:
//            bd, av, au, ap, 
//            bu, be, f

public final class ak
{
    public static final class a extends h
    {

        private final int a;
        private i.a b;
        private final String c;
        private final g d;
        private final a e;
        private final a f[];
        private final d g[];
        private final f h[];
        private final f i[];
        private final j j[];

        static void a(a a1)
        {
            a1.j();
        }

        static void a(a a1, i.a a2)
        {
            a1.a(a2);
        }

        private void a(i.a a1)
        {
            boolean flag = false;
            b = a1;
            for (int l = 0; l < f.length; l++)
            {
                f[l].a(a1.c(l));
            }

            for (int i1 = 0; i1 < g.length; i1++)
            {
                d.a(g[i1], a1.d(i1));
            }

            int j1 = 0;
            int k1;
            do
            {
                k1 = ((flag) ? 1 : 0);
                if (j1 >= h.length)
                {
                    break;
                }
                f.a(h[j1], a1.a(j1));
                j1++;
            } while (true);
            for (; k1 < i.length; k1++)
            {
                f.a(i[k1], a1.b(k1));
            }

        }

        private void j()
        {
            boolean flag = false;
            Object aobj[] = f;
            int k1 = aobj.length;
            for (int l = 0; l < k1; l++)
            {
                aobj[l].j();
            }

            aobj = h;
            k1 = aobj.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                f.a(aobj[i1]);
            }

            aobj = i;
            k1 = aobj.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
            {
                f.a(aobj[j1]);
            }

        }

        public final f a(String s)
        {
            s = g.a(d).a((new StringBuilder()).append(c).append('.').append(s).toString());
            if (s != null && (s instanceof f))
            {
                return (f)s;
            } else
            {
                return null;
            }
        }

        public final i.a a()
        {
            return b;
        }

        public final boolean a(int l)
        {
            for (Iterator iterator = b.n().iterator(); iterator.hasNext();)
            {
                i.a.b b1 = (i.a.b)iterator.next();
                if (b1.i() <= l && l < b1.k())
                {
                    return true;
                }
            }

            return false;
        }

        public final f b(int l)
        {
            return (f)b.a(g.a(d)).get(new b.a(this, l));
        }

        public final String b()
        {
            return b.i();
        }

        public final String c()
        {
            return c;
        }

        public final g d()
        {
            return d;
        }

        public final i.s e()
        {
            return b.q();
        }

        public final List f()
        {
            return Collections.unmodifiableList(Arrays.asList(h));
        }

        public final List g()
        {
            return Collections.unmodifiableList(Arrays.asList(j));
        }

        public final List h()
        {
            return Collections.unmodifiableList(Arrays.asList(f));
        }

        public final volatile bd i()
        {
            return b;
        }

        a(i.a a1, g g1, int l)
        {
            this(a1, g1, null, l);
        }

        private a(i.a a1, g g1, a a2, int l)
        {
            a = l;
            b = a1;
            c = ak.a(g1, a2, a1.i());
            d = g1;
            e = a2;
            j = new j[a1.o()];
            for (l = 0; l < a1.o(); l++)
            {
                j[l] = new j(a1.e(l), g1, this, l, (byte)0);
            }

            f = new a[a1.l()];
            for (l = 0; l < a1.l(); l++)
            {
                f[l] = new a(a1.c(l), g1, this, l);
            }

            g = new d[a1.m()];
            for (l = 0; l < a1.m(); l++)
            {
                g[l] = new d(a1.d(l), g1, this, l, (byte)0);
            }

            h = new f[a1.j()];
            for (l = 0; l < a1.j(); l++)
            {
                h[l] = new f(a1.a(l), g1, this, l, false, (byte)0);
            }

            i = new f[a1.k()];
            for (l = 0; l < a1.k(); l++)
            {
                i[l] = new f(a1.b(l), g1, this, l, true, (byte)0);
            }

            for (l = 0; l < a1.o(); l++)
            {
                j.a(j[l], new f[j[l].b()]);
                j.a(j[l]);
            }

            for (l = 0; l < a1.j(); l++)
            {
                a2 = h[l].u();
                if (a2 != null)
                {
                    j.b(a2)[j.c(a2)] = h[l];
                }
            }

            g.a(g1).a(this);
        }

        a(String s)
        {
            String s1 = "";
            int l = s.lastIndexOf('.');
            String s2;
            if (l != -1)
            {
                s2 = s.substring(l + 1);
                s1 = s.substring(0, l);
            } else
            {
                s2 = s;
            }
            a = 0;
            b = com.c.b.i.a.r().a(s2).a(com.c.b.i.a.b.l().a(1).b(0x20000000).g()).g();
            c = s;
            e = null;
            f = new a[0];
            g = new d[0];
            h = new f[0];
            i = new f[0];
            j = new j[0];
            d = new g(s1, this);
        }
    }

    private static final class b
    {

        static final boolean a;
        private final Set b = new HashSet();
        private boolean c;
        private final Map d = new HashMap();
        private final Map e = new HashMap();
        private final Map f = new HashMap();

        private h a(String s, int l)
        {
            h h2 = (h)d.get(s);
            if (h2 == null) goto _L2; else goto _L1
_L1:
            h h1 = h2;
            if (l == c.c) goto _L4; else goto _L3
_L3:
            if (l != c.a) goto _L6; else goto _L5
_L5:
            h1 = h2;
            if (b(h2)) goto _L4; else goto _L6
_L6:
            if (l != c.b || !c(h2)) goto _L2; else goto _L7
_L7:
            h1 = h2;
_L4:
            return h1;
_L2:
            Iterator iterator = b.iterator();
_L11:
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_167;
                }
                h2 = (h)g.a((g)iterator.next()).d.get(s);
            } while (h2 == null);
            h1 = h2;
            if (l == c.c) goto _L4; else goto _L8
_L8:
            if (l != c.a)
            {
                break; /* Loop/switch isn't completed */
            }
            h1 = h2;
            if (b(h2)) goto _L4; else goto _L9
_L9:
            if (l != c.b || !c(h2)) goto _L11; else goto _L10
_L10:
            return h2;
            return null;
        }

        static Map a(b b1)
        {
            return b1.e;
        }

        private void a(g g1)
        {
            g1 = g1.j().iterator();
            do
            {
                if (!g1.hasNext())
                {
                    break;
                }
                g g2 = (g)g1.next();
                if (b.add(g2))
                {
                    a(g2);
                }
            } while (true);
        }

        static Map b(b b1)
        {
            return b1.f;
        }

        private static boolean b(h h1)
        {
            return (h1 instanceof a) || (h1 instanceof d);
        }

        private static boolean c(h h1)
        {
            return (h1 instanceof a) || (h1 instanceof d) || (h1 instanceof b) || (h1 instanceof k);
        }

        final h a(String s)
        {
            return a(s, c.c);
        }

        final h a(String s, h h1, int l)
        {
            if (!s.startsWith(".")) goto _L2; else goto _L1
_L1:
            Object obj;
            Object obj1;
            obj1 = s.substring(1);
            obj = a(((String) (obj1)), l);
_L8:
            Object obj2 = obj;
            if (obj != null) goto _L4; else goto _L3
_L3:
            if (!c || l != c.a) goto _L6; else goto _L5
_L5:
            ak.a().warning((new StringBuilder("The descriptor for message type \"")).append(s).append("\" can not be found and a placeholder is created for it").toString());
            obj2 = new a(((String) (obj1)));
            b.add(((h) (obj2)).d());
_L4:
            return ((h) (obj2));
_L2:
            int i1 = s.indexOf('.');
            StringBuilder stringbuilder;
            if (i1 == -1)
            {
                obj = s;
            } else
            {
                obj = s.substring(0, i1);
            }
            stringbuilder = new StringBuilder(h1.c());
            do
            {
                int j1 = stringbuilder.lastIndexOf(".");
                if (j1 == -1)
                {
                    obj = a(s, l);
                    obj1 = s;
                    continue; /* Loop/switch isn't completed */
                }
                stringbuilder.setLength(j1 + 1);
                stringbuilder.append(((String) (obj)));
                obj1 = a(stringbuilder.toString(), c.b);
                if (obj1 != null)
                {
                    if (i1 != -1)
                    {
                        stringbuilder.setLength(j1 + 1);
                        stringbuilder.append(s);
                        obj = a(stringbuilder.toString(), l);
                    } else
                    {
                        obj = obj1;
                    }
                    obj1 = stringbuilder.toString();
                    continue; /* Loop/switch isn't completed */
                }
                stringbuilder.setLength(j1);
            } while (true);
_L6:
            throw new c(h1, (new StringBuilder("\"")).append(s).append("\" is not defined.").toString(), (byte)0);
            if (true) goto _L8; else goto _L7
_L7:
        }

        final void a(e e1)
        {
            a a1 = new a(e1.e(), e1.a());
            e1 = (e)f.put(a1, e1);
            if (e1 != null)
            {
                f.put(a1, e1);
            }
        }

        final void a(f f1)
        {
            a a1 = new a(f1.t(), f1.e());
            f f2 = (f)e.put(a1, f1);
            if (f2 != null)
            {
                e.put(a1, f2);
                throw new c(f1, (new StringBuilder("Field number ")).append(f1.e()).append(" has already been used in \"").append(f1.t().c()).append("\" by field \"").append(f2.b()).append("\".").toString(), (byte)0);
            } else
            {
                return;
            }
        }

        final void a(h h1)
        {
            String s = h1.b();
            if (s.length() == 0)
            {
                throw new c(h1, "Missing name.", (byte)0);
            }
            boolean flag = true;
            for (int i1 = 0; i1 < s.length(); i1++)
            {
                char c1 = s.charAt(i1);
                boolean flag1 = flag;
                if (c1 >= '\200')
                {
                    flag1 = false;
                }
                flag = flag1;
                if (Character.isLetter(c1))
                {
                    continue;
                }
                flag = flag1;
                if (c1 == '_')
                {
                    continue;
                }
                if (Character.isDigit(c1))
                {
                    flag = flag1;
                    if (i1 > 0)
                    {
                        continue;
                    }
                }
                flag = false;
            }

            if (!flag)
            {
                throw new c(h1, (new StringBuilder("\"")).append(s).append("\" is not a valid identifier.").toString(), (byte)0);
            }
            s = h1.c();
            int l = s.lastIndexOf('.');
            h h2 = (h)d.put(s, h1);
            if (h2 != null)
            {
                d.put(s, h2);
                if (h1.d() == h2.d())
                {
                    if (l == -1)
                    {
                        throw new c(h1, (new StringBuilder("\"")).append(s).append("\" is already defined.").toString(), (byte)0);
                    } else
                    {
                        throw new c(h1, (new StringBuilder("\"")).append(s.substring(l + 1)).append("\" is already defined in \"").append(s.substring(0, l)).append("\".").toString(), (byte)0);
                    }
                } else
                {
                    throw new c(h1, (new StringBuilder("\"")).append(s).append("\" is already defined in file \"").append(h2.d().b()).append("\".").toString(), (byte)0);
                }
            } else
            {
                return;
            }
        }

        final void a(String s, g g1)
        {
            int l = s.lastIndexOf('.');
            String s1;
            h h1;
            if (l == -1)
            {
                s1 = s;
            } else
            {
                a(s.substring(0, l), g1);
                s1 = s.substring(l + 1);
            }
            h1 = (h)d.put(s, new b(s1, s, g1));
            if (h1 != null)
            {
                d.put(s, h1);
                if (!(h1 instanceof b))
                {
                    throw new c(g1, (new StringBuilder("\"")).append(s1).append("\" is already defined (as something other than a package) in file \"").append(h1.d().b()).append("\".").toString(), (byte)0);
                }
            }
        }

        static 
        {
            boolean flag;
            if (!com/c/b/ak.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
        }

        b(g ag[])
        {
            c = true;
            for (int l = 0; l < ag.length; l++)
            {
                b.add(ag[l]);
                a(ag[l]);
            }

            for (ag = b.iterator(); ag.hasNext();)
            {
                g g1 = (g)ag.next();
                try
                {
                    a(g1.e(), g1);
                }
                catch (c c1)
                {
                    if (!a)
                    {
                        throw new AssertionError();
                    }
                }
            }

        }
    }

    private static final class b.a
    {

        private final h a;
        private final int b;

        public final boolean equals(Object obj)
        {
            if (obj instanceof b.a)
            {
                if (a == ((b.a) (obj = (b.a)obj)).a && b == ((b.a) (obj)).b)
                {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode()
        {
            return a.hashCode() * 65535 + b;
        }

        b.a(h h1, int l)
        {
            a = h1;
            b = l;
        }
    }

    private static final class b.b extends h
    {

        private final String a;
        private final String b;
        private final g c;

        public final String b()
        {
            return a;
        }

        public final String c()
        {
            return b;
        }

        public final g d()
        {
            return c;
        }

        public final bd i()
        {
            return c.a();
        }

        b.b(String s, String s1, g g1)
        {
            c = g1;
            b = s1;
            a = s;
        }
    }

    static final class b.c extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }

    public static final class c extends Exception
    {

        private final String a;
        private final bd b;
        private final String c;

        private c(g g1, String s)
        {
            super((new StringBuilder()).append(g1.b()).append(": ").append(s).toString());
            a = g1.b();
            b = g1.a();
            c = s;
        }

        c(g g1, String s, byte byte0)
        {
            this(g1, s);
        }

        private c(h h1, String s)
        {
            super((new StringBuilder()).append(h1.c()).append(": ").append(s).toString());
            a = h1.c();
            b = h1.i();
            c = s;
        }

        c(h h1, String s, byte byte0)
        {
            this(h1, s);
        }

        private c(h h1, String s, Throwable throwable)
        {
            this(h1, s);
            initCause(throwable);
        }

        c(h h1, String s, Throwable throwable, byte byte0)
        {
            this(h1, s, throwable);
        }
    }

    public static final class d extends h
        implements au.b
    {

        private final int a;
        private i.c b;
        private final String c;
        private final g d;
        private final a e;
        private e f[];
        private final WeakHashMap g;

        static void a(d d1, i.c c1)
        {
            d1.b = c1;
            for (int l = 0; l < d1.f.length; l++)
            {
                e.a(d1.f[l], c1.a(l));
            }

        }

        public final e a(int l)
        {
            return (e)b.b(g.a(d)).get(new b.a(this, l));
        }

        public final e a(String s)
        {
            s = g.a(d).a((new StringBuilder()).append(c).append('.').append(s).toString());
            if (s != null && (s instanceof e))
            {
                return (e)s;
            } else
            {
                return null;
            }
        }

        public final List a()
        {
            return Collections.unmodifiableList(Arrays.asList(f));
        }

        public final e b(int l)
        {
            e e1;
            e1 = a(l);
            if (e1 != null)
            {
                return e1;
            }
            this;
            JVM INSTR monitorenter ;
            Object obj;
            Integer integer;
            integer = new Integer(l);
            obj = (WeakReference)g.get(integer);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            e1 = (e)((WeakReference) (obj)).get();
            obj = e1;
            if (e1 != null)
            {
                break MISSING_BLOCK_LABEL_89;
            }
            obj = new e(d, this, integer, (byte)0);
            g.put(integer, new WeakReference(obj));
            this;
            JVM INSTR monitorexit ;
            return ((e) (obj));
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final String b()
        {
            return b.i();
        }

        public final String c()
        {
            return c;
        }

        public final g d()
        {
            return d;
        }

        public final volatile bd i()
        {
            return b;
        }

        private d(i.c c1, g g1, a a1, int l)
        {
            g = new WeakHashMap();
            a = l;
            b = c1;
            c = ak.a(g1, a1, c1.i());
            d = g1;
            e = a1;
            if (c1.j() == 0)
            {
                throw new c(this, "Enums must contain at least one value.", (byte)0);
            }
            f = new e[c1.j()];
            for (l = 0; l < c1.j(); l++)
            {
                f[l] = new e(c1.a(l), g1, this, l, (byte)0);
            }

            g.a(g1).a(this);
        }

        d(i.c c1, g g1, a a1, int l, byte byte0)
        {
            this(c1, g1, a1, l);
        }
    }

    public static final class e extends h
        implements au.a
    {

        private final int a;
        private i.g b;
        private final String c;
        private final g d;
        private final d e;
        private Integer f;

        static void a(e e1, i.g g1)
        {
            e1.b = g1;
        }

        public final int a()
        {
            return b.k();
        }

        public final String b()
        {
            return b.i();
        }

        public final String c()
        {
            return c;
        }

        public final g d()
        {
            return d;
        }

        public final d e()
        {
            return e;
        }

        public final volatile bd i()
        {
            return b;
        }

        public final String toString()
        {
            return b.i();
        }

        private e(g g1, d d1, Integer integer)
        {
            Object obj = (new StringBuilder("UNKNOWN_ENUM_VALUE_")).append(d1.b()).append("_").append(integer).toString();
            obj = com.c.b.i.g.n().a(((String) (obj))).a(integer.intValue()).g();
            a = -1;
            b = ((i.g) (obj));
            d = g1;
            e = d1;
            c = (new StringBuilder()).append(d1.c()).append('.').append(((i.g) (obj)).i()).toString();
            f = integer;
        }

        e(g g1, d d1, Integer integer, byte byte0)
        {
            this(g1, d1, integer);
        }

        private e(i.g g1, g g2, d d1, int l)
        {
            a = l;
            b = g1;
            d = g2;
            e = d1;
            c = (new StringBuilder()).append(d1.c()).append('.').append(g1.i()).toString();
            g.a(g2).a(this);
            g.a(g2).a(this);
        }

        e(i.g g1, g g2, d d1, int l, byte byte0)
        {
            this(g1, g2, d1, l);
        }
    }

    public static final class f extends h
        implements ar.a, Comparable
    {

        private static final cd.a a[] = cd.a.values();
        private final int b;
        private i.k c;
        private final String d;
        private final g e;
        private final a f;
        private b g;
        private a h;
        private a i;
        private j j;
        private d k;
        private Object l;

        static void a(f f1)
        {
            if (f1.c.r())
            {
                h h1 = g.a(f1.e).a(f1.c.s(), f1, b.c.a);
                if (!(h1 instanceof a))
                {
                    throw new c(f1, (new StringBuilder("\"")).append(f1.c.s()).append("\" is not a message type.").toString(), (byte)0);
                }
                f1.h = (a)h1;
                if (!f1.h.a(f1.c.k()))
                {
                    throw new c(f1, (new StringBuilder("\"")).append(f1.h.c()).append("\" does not declare ").append(f1.c.k()).append(" as an extension number.").toString(), (byte)0);
                }
            }
            if (!f1.c.p()) goto _L2; else goto _L1
_L1:
            h h2;
            h2 = g.a(f1.e).a(f1.c.q(), f1, b.c.a);
            if (!f1.c.n())
            {
                if (h2 instanceof a)
                {
                    f1.g = b.k;
                } else
                if (h2 instanceof d)
                {
                    f1.g = b.n;
                } else
                {
                    throw new c(f1, (new StringBuilder("\"")).append(f1.c.q()).append("\" is not a type.").toString(), (byte)0);
                }
            }
            if (f1.g.a() != a.i) goto _L4; else goto _L3
_L3:
            if (!(h2 instanceof a))
            {
                throw new c(f1, (new StringBuilder("\"")).append(f1.c.q()).append("\" is not a message type.").toString(), (byte)0);
            }
            f1.i = (a)h2;
            if (f1.c.x())
            {
                throw new c(f1, "Messages can't have default values.", (byte)0);
            }
              goto _L5
_L4:
            if (f1.g.a() != a.h) goto _L7; else goto _L6
_L6:
            if (!(h2 instanceof d))
            {
                throw new c(f1, (new StringBuilder("\"")).append(f1.c.q()).append("\" is not an enum type.").toString(), (byte)0);
            }
            f1.k = (d)h2;
_L5:
            if (f1.c.C().k() && !f1.q())
            {
                throw new c(f1, "[packed = true] can only be specified for repeated primitive fields.", (byte)0);
            }
            break; /* Loop/switch isn't completed */
_L7:
            throw new c(f1, "Field with primitive type has type_name.", (byte)0);
_L2:
            if (f1.g.a() == a.i || f1.g.a() == a.h)
            {
                throw new c(f1, "Field with message or enum type missing type_name.", (byte)0);
            }
            if (true) goto _L5; else goto _L8
_L8:
            if (!f1.c.x()) goto _L10; else goto _L9
_L9:
            static final class _cls1
            {

                static final int a[];
                static final int b[];

                static 
                {
                    b = new int[f.a.values().length];
                    try
                    {
                        b[f.a.h.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror19) { }
                    try
                    {
                        b[f.a.i.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror18) { }
                    a = new int[f.b.values().length];
                    try
                    {
                        a[f.b.e.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror17) { }
                    try
                    {
                        a[f.b.q.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror16) { }
                    try
                    {
                        a[f.b.o.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror15) { }
                    try
                    {
                        a[f.b.m.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror14) { }
                    try
                    {
                        a[f.b.g.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror13) { }
                    try
                    {
                        a[f.b.c.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror12) { }
                    try
                    {
                        a[f.b.r.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror11) { }
                    try
                    {
                        a[f.b.p.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        a[f.b.d.ordinal()] = 9;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    try
                    {
                        a[f.b.f.ordinal()] = 10;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        a[f.b.b.ordinal()] = 11;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        a[f.b.a.ordinal()] = 12;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        a[f.b.h.ordinal()] = 13;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[f.b.i.ordinal()] = 14;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[f.b.l.ordinal()] = 15;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[f.b.n.ordinal()] = 16;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[f.b.k.ordinal()] = 17;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[f.b.j.ordinal()] = 18;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            if (f1.o())
            {
                throw new c(f1, "Repeated fields cannot have default values.", (byte)0);
            }
            int i1;
            try
            {
                i1 = _cls1.a[f1.g.ordinal()];
            }
            catch (NumberFormatException numberformatexception)
            {
                throw new c(f1, (new StringBuilder("Could not parse default value: \"")).append(f1.c.y()).append('"').toString(), numberformatexception, (byte)0);
            }
            i1;
            JVM INSTR tableswitch 1 18: default 628
        //                       1 709
        //                       2 709
        //                       3 709
        //                       4 769
        //                       5 769
        //                       6 789
        //                       7 789
        //                       8 789
        //                       9 809
        //                       10 809
        //                       11 829
        //                       12 933
        //                       13 1037
        //                       14 1054
        //                       15 1068
        //                       16 1117
        //                       17 1180
        //                       18 1180;
               goto _L11 _L12 _L12 _L12 _L13 _L13 _L14 _L14 _L14 _L15 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L22
_L11:
            if (!f1.c.r())
            {
                g.a(f1.e).a(f1);
            }
            bu.b b1;
            if (f1.h != null && f1.h.e().i())
            {
                if (f1.c.r())
                {
                    if (!f1.n() || f1.g != b.k)
                    {
                        throw new c(f1, "Extensions of MessageSets must be optional messages.", (byte)0);
                    }
                } else
                {
                    throw new c(f1, "MessageSets cannot have fields, only extensions.", (byte)0);
                }
            }
            break; /* Loop/switch isn't completed */
_L12:
            f1.l = Integer.valueOf(bu.c(f1.c.y()));
            continue; /* Loop/switch isn't completed */
_L13:
            f1.l = Integer.valueOf(bu.d(f1.c.y()));
            continue; /* Loop/switch isn't completed */
_L14:
            f1.l = Long.valueOf(bu.e(f1.c.y()));
            continue; /* Loop/switch isn't completed */
_L15:
            f1.l = Long.valueOf(bu.f(f1.c.y()));
            continue; /* Loop/switch isn't completed */
_L16:
            if (f1.c.y().equals("inf"))
            {
                f1.l = Float.valueOf((1.0F / 0.0F));
                continue; /* Loop/switch isn't completed */
            }
            if (f1.c.y().equals("-inf"))
            {
                f1.l = Float.valueOf((-1.0F / 0.0F));
                continue; /* Loop/switch isn't completed */
            }
            if (f1.c.y().equals("nan"))
            {
                f1.l = Float.valueOf((0.0F / 0.0F));
                continue; /* Loop/switch isn't completed */
            }
            f1.l = Float.valueOf(f1.c.y());
            continue; /* Loop/switch isn't completed */
_L17:
            if (f1.c.y().equals("inf"))
            {
                f1.l = Double.valueOf((1.0D / 0.0D));
                continue; /* Loop/switch isn't completed */
            }
            if (f1.c.y().equals("-inf"))
            {
                f1.l = Double.valueOf((-1.0D / 0.0D));
                continue; /* Loop/switch isn't completed */
            }
            if (f1.c.y().equals("nan"))
            {
                f1.l = Double.valueOf((0.0D / 0.0D));
                continue; /* Loop/switch isn't completed */
            }
            f1.l = Double.valueOf(f1.c.y());
            continue; /* Loop/switch isn't completed */
_L18:
            f1.l = Boolean.valueOf(f1.c.y());
            continue; /* Loop/switch isn't completed */
_L19:
            f1.l = f1.c.y();
            continue; /* Loop/switch isn't completed */
_L20:
            f1.l = bu.a(f1.c.y());
            continue; /* Loop/switch isn't completed */
            b1;
            throw new c(f1, (new StringBuilder("Couldn't parse default value: ")).append(b1.getMessage()).toString(), b1, (byte)0);
_L21:
            f1.l = f1.k.a(f1.c.y());
            if (f1.l == null)
            {
                throw new c(f1, (new StringBuilder("Unknown enum default value: \"")).append(f1.c.y()).append('"').toString(), (byte)0);
            }
            continue; /* Loop/switch isn't completed */
_L22:
            throw new c(f1, "Message type had default value.", (byte)0);
_L10:
            if (f1.o())
            {
                f1.l = Collections.emptyList();
                continue; /* Loop/switch isn't completed */
            }
            switch (_cls1.b[f1.g.a().ordinal()])
            {
            default:
                f1.l = a.a(f1.g.a());
                break;

            case 1: // '\001'
                f1.l = f1.k.a().get(0);
                break;

            case 2: // '\002'
                f1.l = null;
                break;
            }
            if (true) goto _L11; else goto _L23
_L23:
        }

        static void a(f f1, i.k k1)
        {
            f1.c = k1;
        }

        public final int a()
        {
            return b;
        }

        public final be.a a(be.a a1, be be)
        {
            return ((bd.a)a1).c((bd)be);
        }

        public final String b()
        {
            return c.i();
        }

        public final String c()
        {
            return d;
        }

        public final int compareTo(Object obj)
        {
            obj = (f)obj;
            if (((f) (obj)).h != h)
            {
                throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
            } else
            {
                return c.k() - ((f) (obj)).c.k();
            }
        }

        public final g d()
        {
            return e;
        }

        public final int e()
        {
            return c.k();
        }

        public final a f()
        {
            return g.a();
        }

        public final cd.b g()
        {
            return j().a();
        }

        public final b h()
        {
            return g;
        }

        public final volatile bd i()
        {
            return c;
        }

        public final cd.a j()
        {
            return a[g.ordinal()];
        }

        public final boolean k()
        {
            return g == b.i && e.f().o();
        }

        public final boolean l()
        {
            return g == b.k && o() && w().e().o();
        }

        public final boolean m()
        {
            return c.m() == i.k.b.b;
        }

        public final boolean n()
        {
            return c.m() == i.k.b.a;
        }

        public final boolean o()
        {
            return c.m() == i.k.b.c;
        }

        public final boolean p()
        {
            if (q())
            {
                if (e.k() == g.b.b)
                {
                    return c.C().k();
                }
                if (!c.C().j() || c.C().k())
                {
                    return true;
                }
            }
            return false;
        }

        public final boolean q()
        {
            return o() && j().c();
        }

        public final Object r()
        {
            if (g.a() == a.i)
            {
                throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
            } else
            {
                return l;
            }
        }

        public final boolean s()
        {
            return c.r();
        }

        public final a t()
        {
            return h;
        }

        public final String toString()
        {
            return d;
        }

        public final j u()
        {
            return j;
        }

        public final a v()
        {
            if (!c.r())
            {
                throw new UnsupportedOperationException("This field is not an extension.");
            } else
            {
                return f;
            }
        }

        public final a w()
        {
            if (g.a() != a.i)
            {
                throw new UnsupportedOperationException("This field is not of message type.");
            } else
            {
                return i;
            }
        }

        public final d x()
        {
            if (g.a() != a.h)
            {
                throw new UnsupportedOperationException("This field is not of enum type.");
            } else
            {
                return k;
            }
        }

        static 
        {
            if (b.values().length != com.c.b.i.k.c.values().length)
            {
                throw new RuntimeException("descriptor.proto has a new declared type but Desrciptors.java wasn't updated.");
            }
        }

        private f(i.k k1, g g1, a a1, int i1, boolean flag)
        {
            b = i1;
            c = k1;
            d = ak.a(g1, a1, k1.i());
            e = g1;
            if (k1.n())
            {
                g = b.a(k1.o());
            }
            if (c.k() <= 0)
            {
                throw new c(this, "Field numbers must be positive integers.", (byte)0);
            }
            if (flag)
            {
                if (!k1.r())
                {
                    throw new c(this, "FieldDescriptorProto.extendee not set for extension field.", (byte)0);
                }
                h = null;
                if (a1 != null)
                {
                    f = a1;
                } else
                {
                    f = null;
                }
                if (k1.z())
                {
                    throw new c(this, "FieldDescriptorProto.oneof_index set for extension field.", (byte)0);
                }
                j = null;
            } else
            {
                if (k1.r())
                {
                    throw new c(this, "FieldDescriptorProto.extendee set for non-extension field.", (byte)0);
                }
                h = a1;
                if (k1.z())
                {
                    if (k1.A() < 0 || k1.A() >= a1.a().o())
                    {
                        throw new c(this, (new StringBuilder("FieldDescriptorProto.oneof_index is out of range for type ")).append(a1.b()).toString(), (byte)0);
                    }
                    j = (j)a1.g().get(k1.A());
                    j.c(j);
                } else
                {
                    j = null;
                }
                f = null;
            }
            g.a(g1).a(this);
        }

        f(i.k k1, g g1, a a1, int i1, boolean flag, byte byte0)
        {
            this(k1, g1, a1, i1, flag);
        }
    }

    public static final class f.a extends Enum
    {

        public static final f.a a;
        public static final f.a b;
        public static final f.a c;
        public static final f.a d;
        public static final f.a e;
        public static final f.a f;
        public static final f.a g;
        public static final f.a h;
        public static final f.a i;
        private static final f.a k[];
        private final Object j;

        static Object a(f.a a1)
        {
            return a1.j;
        }

        public static f.a valueOf(String s)
        {
            return (f.a)Enum.valueOf(com/c/b/ak$f$a, s);
        }

        public static f.a[] values()
        {
            return (f.a[])k.clone();
        }

        static 
        {
            a = new f.a("INT", 0, Integer.valueOf(0));
            b = new f.a("LONG", 1, Long.valueOf(0L));
            c = new f.a("FLOAT", 2, Float.valueOf(0.0F));
            d = new f.a("DOUBLE", 3, Double.valueOf(0.0D));
            e = new f.a("BOOLEAN", 4, Boolean.valueOf(false));
            f = new f.a("STRING", 5, "");
            g = new f.a("BYTE_STRING", 6, com.c.b.f.a);
            h = new f.a("ENUM", 7, null);
            i = new f.a("MESSAGE", 8, null);
            k = (new f.a[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private f.a(String s, int l, Object obj)
        {
            super(s, l);
            j = obj;
        }
    }

    public static final class f.b extends Enum
    {

        public static final f.b a;
        public static final f.b b;
        public static final f.b c;
        public static final f.b d;
        public static final f.b e;
        public static final f.b f;
        public static final f.b g;
        public static final f.b h;
        public static final f.b i;
        public static final f.b j;
        public static final f.b k;
        public static final f.b l;
        public static final f.b m;
        public static final f.b n;
        public static final f.b o;
        public static final f.b p;
        public static final f.b q;
        public static final f.b r;
        private static final f.b t[];
        private f.a s;

        public static f.b a(i.k.c c1)
        {
            return values()[c1.a() - 1];
        }

        public static f.b valueOf(String s1)
        {
            return (f.b)Enum.valueOf(com/c/b/ak$f$b, s1);
        }

        public static f.b[] values()
        {
            return (f.b[])t.clone();
        }

        public final f.a a()
        {
            return s;
        }

        static 
        {
            a = new f.b("DOUBLE", 0, f.a.d);
            b = new f.b("FLOAT", 1, f.a.c);
            c = new f.b("INT64", 2, f.a.b);
            d = new f.b("UINT64", 3, f.a.b);
            e = new f.b("INT32", 4, f.a.a);
            f = new f.b("FIXED64", 5, f.a.b);
            g = new f.b("FIXED32", 6, f.a.a);
            h = new f.b("BOOL", 7, f.a.e);
            i = new f.b("STRING", 8, f.a.f);
            j = new f.b("GROUP", 9, f.a.i);
            k = new f.b("MESSAGE", 10, f.a.i);
            l = new f.b("BYTES", 11, f.a.g);
            m = new f.b("UINT32", 12, f.a.a);
            n = new f.b("ENUM", 13, f.a.h);
            o = new f.b("SFIXED32", 14, f.a.a);
            p = new f.b("SFIXED64", 15, f.a.b);
            q = new f.b("SINT32", 16, f.a.a);
            r = new f.b("SINT64", 17, f.a.b);
            t = (new f.b[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r
            });
        }

        private f.b(String s1, int i1, f.a a1)
        {
            super(s1, i1);
            s = a1;
        }
    }

    public static final class g extends h
    {

        private i.o a;
        private final a b[];
        private final d c[];
        private final k d[];
        private final f e[];
        private final g f[];
        private final g g[];
        private final b h;

        static b a(g g1)
        {
            return g1.h;
        }

        private static g a(i.o o, g ag[])
        {
            boolean flag = false;
            o = new g(o, ag, new b(ag));
            ag = ((g) (o)).b;
            int l1 = ag.length;
            for (int i1 = 0; i1 < l1; i1++)
            {
                a.a(ag[i1]);
            }

            ag = ((g) (o)).d;
            l1 = ag.length;
            for (int j1 = 0; j1 < l1; j1++)
            {
                k.a(ag[j1]);
            }

            ag = ((g) (o)).e;
            l1 = ag.length;
            for (int k1 = ((flag) ? 1 : 0); k1 < l1; k1++)
            {
                f.a(ag[k1]);
            }

            return o;
        }

        public static void a(g g1, ap ap)
        {
            com.c.b.f f1 = g1.a.d();
            try
            {
                ap = com.c.b.i.o.a(f1, ap);
            }
            // Misplaced declaration of an exception variable
            catch (g g1)
            {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", g1);
            }
            g1.a(((i.o) (ap)));
        }

        private void a(i.o o)
        {
            boolean flag = false;
            a = o;
            for (int i1 = 0; i1 < b.length; i1++)
            {
                a.a(b[i1], o.c(i1));
            }

            for (int j1 = 0; j1 < c.length; j1++)
            {
                d.a(c[j1], o.d(j1));
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
                k.a(d[k1], o.e(k1));
                k1++;
            } while (true);
            for (; l1 < e.length; l1++)
            {
                f.a(e[l1], o.f(l1));
            }

        }

        public static void a(String as[], g ag[], a a1)
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
                as = com.c.b.i.o.a(as);
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", as);
            }
            try
            {
                ag = a(((i.o) (as)), ag);
            }
            // Misplaced declaration of an exception variable
            catch (g ag[])
            {
                throw new IllegalArgumentException((new StringBuilder("Invalid embedded descriptor for \"")).append(as.i()).append("\".").toString(), ag);
            }
            a1.a(ag);
        }

        public final i.o a()
        {
            return a;
        }

        public final String b()
        {
            return a.i();
        }

        public final String c()
        {
            return a.i();
        }

        public final g d()
        {
            return this;
        }

        public final String e()
        {
            return a.k();
        }

        public final i.q f()
        {
            return a.s();
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
            if (b.a(b.c).equals(a.A()))
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

        private g(i.o o, g ag[], b b1)
        {
            h = b1;
            a = o;
            f = (g[])ag.clone();
            HashMap hashmap = new HashMap();
            int k2 = ag.length;
            for (int i1 = 0; i1 < k2; i1++)
            {
                g g1 = ag[i1];
                hashmap.put(g1.a.i(), g1);
            }

            ag = new ArrayList();
            for (int j1 = 0; j1 < o.m(); j1++)
            {
                int l2 = o.b(j1);
                if (l2 < 0 || l2 >= o.l())
                {
                    throw new c(this, "Invalid public dependency index.", (byte)0);
                }
                g g2 = (g)hashmap.get(o.a(l2));
                if (g2 != null)
                {
                    ag.add(g2);
                }
            }

            g = new g[ag.size()];
            ag.toArray(g);
            b1.a(a.k(), this);
            b = new a[o.n()];
            for (int k1 = 0; k1 < o.n(); k1++)
            {
                b[k1] = new a(o.c(k1), this, k1);
            }

            c = new d[o.o()];
            for (int l1 = 0; l1 < o.o(); l1++)
            {
                c[l1] = new d(o.d(l1), this, null, l1, (byte)0);
            }

            d = new k[o.p()];
            for (int i2 = 0; i2 < o.p(); i2++)
            {
                d[i2] = new k(o.e(i2), this, i2, (byte)0);
            }

            e = new f[o.q()];
            for (int j2 = 0; j2 < o.q(); j2++)
            {
                e[j2] = new f(o.f(j2), this, null, j2, true, (byte)0);
            }

        }

        g(String s, a a1)
        {
            h = new b(new g[0]);
            a = com.c.b.i.o.B().a((new StringBuilder()).append(a1.c()).append(".placeholder.proto").toString()).b(s).a(a1.a()).g();
            f = new g[0];
            g = new g[0];
            b = (new a[] {
                a1
            });
            c = new d[0];
            d = new k[0];
            e = new f[0];
            h.a(s, this);
            h.a(a1);
        }
    }

    public static interface g.a
    {

        public abstract ap a(g g1);
    }

    public static final class g.b extends Enum
    {

        public static final g.b a;
        public static final g.b b;
        public static final g.b c;
        private static final g.b e[];
        private final String d;

        static String a(g.b b1)
        {
            return b1.d;
        }

        public static g.b valueOf(String s)
        {
            return (g.b)Enum.valueOf(com/c/b/ak$g$b, s);
        }

        public static g.b[] values()
        {
            return (g.b[])e.clone();
        }

        static 
        {
            a = new g.b("UNKNOWN", 0, "unknown");
            b = new g.b("PROTO2", 1, "proto2");
            c = new g.b("PROTO3", 2, "proto3");
            e = (new g.b[] {
                a, b, c
            });
        }

        private g.b(String s, int l, String s1)
        {
            super(s, l);
            d = s1;
        }
    }

    public static abstract class h
    {

        public abstract String b();

        public abstract String c();

        public abstract g d();

        public abstract bd i();

        public h()
        {
        }
    }

    public static final class i extends h
    {

        private final int a;
        private i.u b;
        private final String c;
        private final g d;
        private final k e;
        private a f;
        private a g;

        static void a(i l)
        {
            h h1 = g.a(l.d).a(l.b.k(), l, b.c.a);
            if (!(h1 instanceof a))
            {
                throw new c(l, (new StringBuilder("\"")).append(l.b.k()).append("\" is not a message type.").toString(), (byte)0);
            }
            l.f = (a)h1;
            h1 = g.a(l.d).a(l.b.m(), l, b.c.a);
            if (!(h1 instanceof a))
            {
                throw new c(l, (new StringBuilder("\"")).append(l.b.m()).append("\" is not a message type.").toString(), (byte)0);
            } else
            {
                l.g = (a)h1;
                return;
            }
        }

        static void a(i l, i.u u)
        {
            l.b = u;
        }

        public final String b()
        {
            return b.i();
        }

        public final String c()
        {
            return c;
        }

        public final g d()
        {
            return d;
        }

        public final volatile bd i()
        {
            return b;
        }

        private i(i.u u, g g1, k k1, int l)
        {
            a = l;
            b = u;
            d = g1;
            e = k1;
            c = (new StringBuilder()).append(k1.c()).append('.').append(u.i()).toString();
            g.a(g1).a(this);
        }

        i(i.u u, g g1, k k1, int l, byte byte0)
        {
            this(u, g1, k1, l);
        }
    }

    public static final class j
    {

        private final int a;
        private i.y b;
        private final String c;
        private final g d;
        private a e;
        private int f;
        private f g[];

        static int a(j j1)
        {
            j1.f = 0;
            return 0;
        }

        static f[] a(j j1, f af[])
        {
            j1.g = af;
            return af;
        }

        static f[] b(j j1)
        {
            return j1.g;
        }

        static int c(j j1)
        {
            int l = j1.f;
            j1.f = l + 1;
            return l;
        }

        public final int a()
        {
            return a;
        }

        public final int b()
        {
            return f;
        }

        private j(i.y y, g g1, a a1, int l)
        {
            b = y;
            c = ak.a(g1, a1, y.i());
            d = g1;
            a = l;
            e = a1;
            f = 0;
        }

        j(i.y y, g g1, a a1, int l, byte byte0)
        {
            this(y, g1, a1, l);
        }
    }

    public static final class k extends h
    {

        private final int a;
        private i.aa b;
        private final String c;
        private final g d;
        private i e[];

        static void a(k k1)
        {
            k1 = k1.e;
            int i1 = k1.length;
            for (int l = 0; l < i1; l++)
            {
                i.a(k1[l]);
            }

        }

        static void a(k k1, i.aa aa)
        {
            k1.b = aa;
            for (int l = 0; l < k1.e.length; l++)
            {
                i.a(k1.e[l], aa.a(l));
            }

        }

        public final String b()
        {
            return b.i();
        }

        public final String c()
        {
            return c;
        }

        public final g d()
        {
            return d;
        }

        public final volatile bd i()
        {
            return b;
        }

        private k(i.aa aa, g g1, int l)
        {
            a = l;
            b = aa;
            c = ak.a(g1, null, aa.i());
            d = g1;
            e = new i[aa.j()];
            for (l = 0; l < aa.j(); l++)
            {
                e[l] = new i(aa.a(l), g1, this, l, (byte)0);
            }

            g.a(g1).a(this);
        }

        k(i.aa aa, g g1, int l, byte byte0)
        {
            this(aa, g1, l);
        }
    }


    private static final Logger a = Logger.getLogger(com/c/b/ak.getName());

    public ak()
    {
    }

    static String a(g g1, a a1, String s)
    {
        if (a1 != null)
        {
            a1 = (new StringBuilder()).append(a1.c()).append('.').append(s).toString();
        } else
        {
            a1 = s;
            if (g1.e().length() > 0)
            {
                return (new StringBuilder()).append(g1.e()).append('.').append(s).toString();
            }
        }
        return a1;
    }

    static Logger a()
    {
        return a;
    }

}
