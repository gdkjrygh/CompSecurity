// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.k;

import com.c.b.aq;
import com.c.b.as;
import com.c.b.av;
import com.c.b.bd;
import com.c.b.be;
import com.c.b.bg;
import com.c.b.bk;
import com.c.b.by;
import com.c.b.f;
import com.c.b.g;
import com.c.b.h;
import com.c.b.i;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.kik.k:
//            b, c

public final class com.kik.k.a
{
    public static final class a extends as
        implements b
    {

        public static final bk c = new c();
        private static final a q = new a();
        private int f;
        private boolean g;
        private volatile Object h;
        private int i;
        private int j;
        private long k;
        private long l;
        private int m;
        private int n;
        private byte o;
        private int p;

        public static a A()
        {
            return q;
        }

        static boolean B()
        {
            return d;
        }

        private f C()
        {
            Object obj = h;
            if (obj instanceof String)
            {
                obj = com.c.b.f.a((String)obj);
                h = obj;
                return ((f) (obj));
            } else
            {
                return (f)obj;
            }
        }

        private a D()
        {
            if (this == q)
            {
                return new a((byte)0);
            } else
            {
                return (new a((byte)0)).a(this);
            }
        }

        static int a(a a1, int i1)
        {
            a1.i = i1;
            return i1;
        }

        static long a(a a1, long l1)
        {
            a1.k = l1;
            return l1;
        }

        static Object a(a a1)
        {
            return a1.h;
        }

        static Object a(a a1, Object obj)
        {
            a1.h = obj;
            return obj;
        }

        static boolean a(a a1, boolean flag)
        {
            a1.g = flag;
            return flag;
        }

        static int b(a a1, int i1)
        {
            a1.j = i1;
            return i1;
        }

        static long b(a a1, long l1)
        {
            a1.l = l1;
            return l1;
        }

        static by b(a a1)
        {
            return a1.e;
        }

        static int c(a a1, int i1)
        {
            a1.m = i1;
            return i1;
        }

        static int d(a a1, int i1)
        {
            a1.n = i1;
            return i1;
        }

        static int e(a a1, int i1)
        {
            a1.f = i1;
            return i1;
        }

        protected final com.c.b.bd.a a(com.c.b.as.b b1)
        {
            return new a(b1, (byte)0);
        }

        public final void a(h h1)
        {
            if ((f & 1) == 1)
            {
                h1.a(1, g);
            }
            if ((f & 2) == 2)
            {
                h1.a(2, C());
            }
            if ((f & 4) == 4)
            {
                h1.a(5, i);
            }
            if ((f & 8) == 8)
            {
                h1.a(6, j);
            }
            if ((f & 0x10) == 16)
            {
                h1.c(7, k);
            }
            if ((f & 0x20) == 32)
            {
                h1.c(8, l);
            }
            if ((f & 0x40) == 64)
            {
                h1.b(15, m);
            }
            if ((f & 0x80) == 128)
            {
                h1.b(16, n);
            }
            e.a(h1);
        }

        public final boolean a()
        {
            byte byte0 = o;
            if (byte0 == 1)
            {
                return true;
            }
            if (byte0 == 0)
            {
                return false;
            } else
            {
                o = 1;
                return true;
            }
        }

        public final int b()
        {
            int i1 = p;
            if (i1 != -1)
            {
                return i1;
            }
            int j1 = 0;
            if ((f & 1) == 1)
            {
                j1 = com.c.b.h.g(1) + 0;
            }
            i1 = j1;
            if ((f & 2) == 2)
            {
                i1 = j1 + com.c.b.h.c(2, C());
            }
            j1 = i1;
            if ((f & 4) == 4)
            {
                j1 = i1 + com.c.b.h.d(5, i);
            }
            i1 = j1;
            if ((f & 8) == 8)
            {
                i1 = j1 + com.c.b.h.d(6, j);
            }
            j1 = i1;
            if ((f & 0x10) == 16)
            {
                j1 = i1 + com.c.b.h.h(7);
            }
            i1 = j1;
            if ((f & 0x20) == 32)
            {
                i1 = j1 + com.c.b.h.h(8);
            }
            j1 = i1;
            if ((f & 0x40) == 64)
            {
                j1 = i1 + com.c.b.h.e(15, m);
            }
            i1 = j1;
            if ((f & 0x80) == 128)
            {
                i1 = j1 + com.c.b.h.e(16, n);
            }
            i1 += e.b();
            p = i1;
            return i1;
        }

        protected final com.c.b.as.g c_()
        {
            return com.kik.k.a.c().a(com/kik/k/a$a, com/kik/k/a$a$a);
        }

        public final by f()
        {
            return e;
        }

        public final boolean h()
        {
            return (f & 1) == 1;
        }

        public final boolean i()
        {
            return g;
        }

        public final boolean j()
        {
            return (f & 2) == 2;
        }

        public final boolean k()
        {
            return (f & 4) == 4;
        }

        public final int l()
        {
            return i;
        }

        public final boolean m()
        {
            return (f & 8) == 8;
        }

        public final int n()
        {
            return j;
        }

        public final boolean o()
        {
            return (f & 0x10) == 16;
        }

        public final long p()
        {
            return k;
        }

        public final boolean q()
        {
            return (f & 0x20) == 32;
        }

        public final long r()
        {
            return l;
        }

        public final boolean s()
        {
            return (f & 0x40) == 64;
        }

        public final bk t()
        {
            return c;
        }

        public final com.c.b.bd.a u()
        {
            return q.D();
        }

        public final com.c.b.be.a v()
        {
            return D();
        }

        public final volatile bd w()
        {
            return q;
        }

        public final int x()
        {
            return m;
        }

        public final boolean y()
        {
            return (f & 0x80) == 128;
        }

        public final int z()
        {
            return n;
        }


        private a()
        {
            o = -1;
            p = -1;
            g = false;
            h = "";
            i = 0;
            j = 0;
            k = 0L;
            l = 0L;
            m = 0;
            n = 0;
        }

        private a(com.c.b.as.a a1)
        {
            super(a1);
            o = -1;
            p = -1;
        }

        a(com.c.b.as.a a1, byte byte0)
        {
            this(a1);
        }

        private a(g g1, aq aq)
        {
            com.c.b.by.a a1;
            boolean flag;
            this();
            a1 = by.c();
            flag = false;
_L14:
            if (flag) goto _L2; else goto _L1
_L1:
            int i1 = g1.a();
            i1;
            JVM INSTR lookupswitch 9: default 370
        //                       0: 373
        //                       8: 126
        //                       18: 176
        //                       40: 225
        //                       48: 246
        //                       57: 268
        //                       65: 290
        //                       120: 312
        //                       128: 334;
               goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L3:
            if (!a(g1, a1, aq, i1))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            f = f | 1;
            g = g1.i();
            continue; /* Loop/switch isn't completed */
            g1;
            throw new RuntimeException(g1.a(this));
            g1;
            e = a1.b();
            L();
            throw g1;
_L6:
            f f1 = g1.l();
            f = f | 2;
            h = f1;
            continue; /* Loop/switch isn't completed */
            g1;
            throw new RuntimeException((new av(g1.getMessage())).a(this));
_L7:
            f = f | 4;
            i = g1.f();
            continue; /* Loop/switch isn't completed */
_L8:
            f = f | 8;
            j = g1.f();
            continue; /* Loop/switch isn't completed */
_L9:
            f = f | 0x10;
            k = g1.p();
            continue; /* Loop/switch isn't completed */
_L10:
            f = f | 0x20;
            l = g1.p();
            continue; /* Loop/switch isn't completed */
_L11:
            f = f | 0x40;
            m = g1.m();
            continue; /* Loop/switch isn't completed */
_L12:
            f = f | 0x80;
            n = g1.m();
            continue; /* Loop/switch isn't completed */
_L2:
            e = a1.b();
            L();
            return;
_L4:
            flag = true;
            if (true) goto _L14; else goto _L13
_L13:
        }

        a(g g1, aq aq, byte byte0)
        {
            this(g1, aq);
        }
    }

    public static final class a.a extends com.c.b.as.a
        implements b
    {

        private int a;
        private boolean b;
        private Object c;
        private int d;
        private int e;
        private long f;
        private long g;
        private int h;
        private int i;

        private a.a d(bd bd)
        {
            if (bd instanceof a)
            {
                return a((a)bd);
            } else
            {
                super.a(bd);
                return this;
            }
        }

        private a.a d(g g1, aq aq)
        {
            g1 = (a)a.c.a(g1, aq);
            if (g1 != null)
            {
                a(g1);
            }
            return this;
            aq;
            g1 = (a)aq.a();
            throw aq;
            aq;
_L2:
            if (g1 != null)
            {
                a(g1);
            }
            throw aq;
            aq;
            g1 = null;
            if (true) goto _L2; else goto _L1
_L1:
        }

        private a r()
        {
            a a1 = s();
            if (!a1.a())
            {
                throw b(a1);
            } else
            {
                return a1;
            }
        }

        private a s()
        {
            int l = 1;
            a a1 = new a(this, (byte)0);
            int i1 = a;
            int k;
            if ((i1 & 1) != 1)
            {
                l = 0;
            }
            a.a(a1, b);
            k = l;
            if ((i1 & 2) == 2)
            {
                k = l | 2;
            }
            a.a(a1, c);
            l = k;
            if ((i1 & 4) == 4)
            {
                l = k | 4;
            }
            a.a(a1, d);
            k = l;
            if ((i1 & 8) == 8)
            {
                k = l | 8;
            }
            a.b(a1, e);
            l = k;
            if ((i1 & 0x10) == 16)
            {
                l = k | 0x10;
            }
            a.a(a1, f);
            k = l;
            if ((i1 & 0x20) == 32)
            {
                k = l | 0x20;
            }
            a.b(a1, g);
            l = k;
            if ((i1 & 0x40) == 64)
            {
                l = k | 0x40;
            }
            a.c(a1, h);
            k = l;
            if ((i1 & 0x80) == 128)
            {
                k = l | 0x80;
            }
            a.d(a1, i);
            a.e(a1, k);
            l();
            return a1;
        }

        public final com.c.b.a a(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.a a(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final a.a a(a a1)
        {
            if (a1 == a.A())
            {
                return this;
            }
            if (a1.h())
            {
                boolean flag = a1.i();
                a = a | 1;
                b = flag;
                q();
            }
            if (a1.j())
            {
                a = a | 2;
                c = a.a(a1);
                q();
            }
            if (a1.k())
            {
                int k = a1.l();
                a = a | 4;
                d = k;
                q();
            }
            if (a1.m())
            {
                int l = a1.n();
                a = a | 8;
                e = l;
                q();
            }
            if (a1.o())
            {
                long l1 = a1.p();
                a = a | 0x10;
                f = l1;
                q();
            }
            if (a1.q())
            {
                long l2 = a1.r();
                a = a | 0x20;
                g = l2;
                q();
            }
            if (a1.s())
            {
                int i1 = a1.x();
                a = a | 0x40;
                h = i1;
                q();
            }
            if (a1.y())
            {
                int j1 = a1.z();
                a = a | 0x80;
                i = j1;
                q();
            }
            d(a.b(a1));
            q();
            return this;
        }

        public final boolean a()
        {
            return true;
        }

        public final com.c.b.b.a b(g g1, aq aq)
        {
            return d(g1, aq);
        }

        public final com.c.b.bd.a c(bd bd)
        {
            return d(bd);
        }

        public final com.c.b.be.a c(g g1, aq aq)
        {
            return d(g1, aq);
        }

        protected final com.c.b.as.g d()
        {
            return com.kik.k.a.c().a(com/kik/k/a$a, com/kik/k/a$a$a);
        }

        public final com.c.b.ak.a e()
        {
            return com.kik.k.a.b();
        }

        public final bd h()
        {
            return s();
        }

        public final bd i()
        {
            return r();
        }

        public final be j()
        {
            return r();
        }

        public final bd w()
        {
            return a.A();
        }

        private a.a()
        {
            c = "";
            a.B();
        }

        a.a(byte byte0)
        {
            this();
        }

        private a.a(com.c.b.as.b b1)
        {
            super(b1);
            c = "";
            a.B();
        }

        a.a(com.c.b.as.b b1, byte byte0)
        {
            this(b1);
        }
    }

    public static interface b
        extends bg
    {
    }


    public static final com.c.b.as.h a;
    private static com.c.b.ak.a b;
    private static com.c.b.as.g c;
    private static com.c.b.ak.g d;

    public static com.c.b.ak.g a()
    {
        return d;
    }

    static com.c.b.ak.g a(com.c.b.ak.g g)
    {
        d = g;
        return g;
    }

    static com.c.b.ak.a b()
    {
        return b;
    }

    static com.c.b.as.g c()
    {
        return c;
    }

    static 
    {
        a = as.a(com/kik/k/a$a, a.A());
        com.kik.k.b b1 = new com.kik.k.b();
        com.c.b.ak.g g = i.a();
        com.c.b.ak.g.a(new String[] {
            "\n\031protobuf_validation.proto\022\016kik.validation\032 google/protobuf/descriptor.proto\"\300\001\n\017FieldValidation\022\030\n\tmandatory\030\001 \001(\b:\005false\022\r\n\005regex\030\002 \001(\t\022\027\n\017min_byte_length\030\005 \001(\005\022\027\n\017max_byte_length\030\006 \001(\005\022\017\n\007min_val\030\007 \001(\020\022\017\n\007max_val\030\b \001(\020\022\027\n\017min_repetitions\030\017 \001(\r\022\027\n\017max_repetitions\030\020 \001(\r:Z\n\020field_validation\022\035.google.protobuf.FieldOptions\030\331\323\004 \001(\0132\037.kik.validation.FieldValidationB\031\n\027com.kik.protovalidation"
        }, new com.c.b.ak.g[] {
            g
        }, b1);
        b = (com.c.b.ak.a)d.g().get(0);
        c = new com.c.b.as.g(b, new String[] {
            "Mandatory", "Regex", "MinByteLength", "MaxByteLength", "MinVal", "MaxVal", "MinRepetitions", "MaxRepetitions"
        });
        a.a((com.c.b.ak.f)d.h().get(0));
        i.a();
    }
}
