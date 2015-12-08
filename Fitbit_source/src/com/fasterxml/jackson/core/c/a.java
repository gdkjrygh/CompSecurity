// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.c;

import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.core.c:
//            d, e, f, g, 
//            c

public final class com.fasterxml.jackson.core.c.a
{
    static final class a
    {

        protected final c a;
        protected final a b;
        private final int c;

        public int a()
        {
            return c;
        }

        public c a(int i1, int j1, int k1)
        {
            if (a.hashCode() != i1 || !a.a(j1, k1)) goto _L2; else goto _L1
_L1:
            c c1 = a;
_L6:
            return c1;
_L2:
            a a1 = b;
_L7:
            if (a1 == null) goto _L4; else goto _L3
_L3:
            c c2;
            c2 = a1.a;
            if (c2.hashCode() != i1)
            {
                continue; /* Loop/switch isn't completed */
            }
            c1 = c2;
            if (c2.a(j1, k1)) goto _L6; else goto _L5
_L5:
            a1 = a1.b;
              goto _L7
_L4:
            return null;
        }

        public c a(int i1, int ai[], int j1)
        {
            if (a.hashCode() != i1 || !a.a(ai, j1)) goto _L2; else goto _L1
_L1:
            c c1 = a;
_L6:
            return c1;
_L2:
            a a1 = b;
_L7:
            if (a1 == null) goto _L4; else goto _L3
_L3:
            c c2;
            c2 = a1.a;
            if (c2.hashCode() != i1)
            {
                continue; /* Loop/switch isn't completed */
            }
            c1 = c2;
            if (c2.a(ai, j1)) goto _L6; else goto _L5
_L5:
            a1 = a1.b;
              goto _L7
_L4:
            return null;
        }

        a(c c1, a a1)
        {
            a = c1;
            b = a1;
            int i1;
            if (a1 == null)
            {
                i1 = 1;
            } else
            {
                i1 = a1.c + 1;
            }
            c = i1;
        }
    }

    private static final class b
    {

        public final int a;
        public final int b;
        public final int c[];
        public final c d[];
        public final a e[];
        public final int f;
        public final int g;
        public final int h;

        public b(int i1, int j1, int ai[], c ac[], a aa[], int k1, int l1, 
                int i2)
        {
            a = i1;
            b = j1;
            c = ai;
            d = ac;
            e = aa;
            f = k1;
            g = l1;
            h = i2;
        }

        public b(com.fasterxml.jackson.core.c.a a1)
        {
            a = a1.l;
            b = a1.n;
            c = a1.o;
            d = a1.p;
            e = a1.q;
            f = a1.r;
            g = a1.s;
            h = a1.m;
        }
    }


    private static final int A = 31;
    protected static final int a = 64;
    protected static final int b = 0x10000;
    static final int c = 6000;
    static final int d = 255;
    static final int e = 63;
    static final int f = 16;
    static final int g = 32;
    static final int h = 254;
    private static final int y = 33;
    private static final int z = 0x1003f;
    protected final com.fasterxml.jackson.core.c.a i;
    protected final AtomicReference j;
    protected final boolean k;
    protected int l;
    protected int m;
    protected int n;
    protected int o[];
    protected c p[];
    protected a q[];
    protected int r;
    protected int s;
    private final int t;
    private transient boolean u;
    private boolean v;
    private boolean w;
    private boolean x;

    private com.fasterxml.jackson.core.c.a(int i1, boolean flag, int j1)
    {
        byte byte0;
        byte0 = 16;
        super();
        i = null;
        t = j1;
        k = flag;
        if (i1 >= 16) goto _L2; else goto _L1
_L1:
        j1 = 16;
_L4:
        j = new AtomicReference(e(j1));
        return;
_L2:
        j1 = i1;
        if ((i1 - 1 & i1) != 0)
        {
            j1 = byte0;
            while (j1 < i1) 
            {
                j1 += j1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private com.fasterxml.jackson.core.c.a(com.fasterxml.jackson.core.c.a a1, boolean flag, int i1, b b1)
    {
        i = a1;
        t = i1;
        k = flag;
        j = null;
        l = b1.a;
        n = b1.b;
        o = b1.c;
        p = b1.d;
        q = b1.e;
        r = b1.f;
        s = b1.g;
        m = b1.h;
        u = false;
        v = true;
        w = true;
        x = true;
    }

    public static com.fasterxml.jackson.core.c.a a()
    {
        long l1 = System.currentTimeMillis();
        int i1 = (int)l1;
        return a((int)(l1 >>> 32) + i1 | 1);
    }

    protected static com.fasterxml.jackson.core.c.a a(int i1)
    {
        return new com.fasterxml.jackson.core.c.a(64, true, i1);
    }

    private static c a(int i1, String s1, int j1, int k1)
    {
        if (k1 == 0)
        {
            return new d(s1, i1, j1);
        } else
        {
            return new e(s1, i1, j1, k1);
        }
    }

    private static c a(int i1, String s1, int ai[], int j1)
    {
        if (j1 >= 4) goto _L2; else goto _L1
_L1:
        j1;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 64
    //                   2 77
    //                   3 93;
           goto _L2 _L3 _L4 _L5
_L2:
        int ai1[];
        ai1 = new int[j1];
        for (int k1 = 0; k1 < j1; k1++)
        {
            ai1[k1] = ai[k1];
        }

        break; /* Loop/switch isn't completed */
_L3:
        return new d(s1, i1, ai[0]);
_L4:
        return new e(s1, i1, ai[0], ai[1]);
_L5:
        return new f(s1, i1, ai[0], ai[1], ai[2]);
        return new g(s1, i1, ai1, j1);
    }

    private void a(int i1, c c1)
    {
        int k1;
        if (v)
        {
            m();
        }
        if (u)
        {
            j();
        }
        l = l + 1;
        k1 = i1 & n;
        if (p[k1] != null) goto _L2; else goto _L1
_L1:
        o[k1] = i1 << 8;
        if (w)
        {
            o();
        }
        p[k1] = c1;
_L9:
        i1 = o.length;
        if (l <= i1 >> 1) goto _L4; else goto _L3
_L3:
        int j1 = i1 >> 2;
        if (l <= i1 - j1) goto _L6; else goto _L5
_L5:
        u = true;
_L4:
        return;
_L2:
        if (x)
        {
            n();
        }
        r = r + 1;
        int l1 = o[k1];
        i1 = l1 & 0xff;
        if (i1 == 0)
        {
            if (s <= 254)
            {
                j1 = s;
                s = s + 1;
                i1 = j1;
                if (j1 >= q.length)
                {
                    p();
                    i1 = j1;
                }
            } else
            {
                i1 = l();
            }
            o[k1] = l1 & 0xffffff00 | i1 + 1;
        } else
        {
            i1--;
        }
        c1 = new a(c1, q[i1]);
        q[i1] = c1;
        m = Math.max(c1.a(), m);
        if (m > 255)
        {
            d(255);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (r < j1) goto _L4; else goto _L7
_L7:
        u = true;
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void a(b b1)
    {
        b b2;
        b b3;
label0:
        {
            int i1 = b1.a;
            b3 = (b)j.get();
            if (i1 <= b3.a)
            {
                return;
            }
            if (i1 <= 6000)
            {
                b2 = b1;
                if (b1.h <= 63)
                {
                    break label0;
                }
            }
            b2 = e(64);
        }
        j.compareAndSet(b3, b2);
    }

    protected static int[] a(byte abyte0[])
    {
        int i2 = abyte0.length;
        int ai[] = new int[(i2 + 3) / 4];
        int j1;
        for (int i1 = 0; i1 < i2; i1 = j1 + 1)
        {
            int k1 = abyte0[i1] & 0xff;
            int l1 = i1 + 1;
            i1 = k1;
            j1 = l1;
            if (l1 < i2)
            {
                k1 = k1 << 8 | abyte0[l1] & 0xff;
                l1++;
                i1 = k1;
                j1 = l1;
                if (l1 < i2)
                {
                    k1 = k1 << 8 | abyte0[l1] & 0xff;
                    l1++;
                    i1 = k1;
                    j1 = l1;
                    if (l1 < i2)
                    {
                        i1 = k1 << 8 | abyte0[l1] & 0xff;
                        j1 = l1;
                    }
                }
            }
            ai[j1 >> 2] = i1;
        }

        return ai;
    }

    private b e(int i1)
    {
        return new b(0, i1 - 1, new int[i1], new c[i1], null, 0, 0, 0);
    }

    public static c i()
    {
        return com.fasterxml.jackson.core.c.d.b();
    }

    private void j()
    {
        boolean flag = false;
        u = false;
        w = false;
        int j2 = o.length;
        int i1 = j2 + j2;
        if (i1 > 0x10000)
        {
            k();
        } else
        {
            o = new int[i1];
            n = i1 - 1;
            c ac[] = p;
            p = new c[i1];
            int j1 = 0;
            int k1;
            for (i1 = 0; j1 < j2; i1 = k1)
            {
                c c1 = ac[j1];
                k1 = i1;
                if (c1 != null)
                {
                    k1 = i1 + 1;
                    i1 = c1.hashCode();
                    int l2 = n & i1;
                    p[l2] = c1;
                    o[l2] = i1 << 8;
                }
                j1++;
            }

            int i3 = s;
            if (i3 == 0)
            {
                m = 0;
                return;
            }
            r = 0;
            s = 0;
            x = false;
            a aa[] = q;
            q = new a[aa.length];
            j2 = 0;
            j1 = ((flag) ? 1 : 0);
            for (; j2 < i3; j2++)
            {
                a a1 = aa[j2];
                while (a1 != null) 
                {
                    Object obj = a1.a;
                    int l1 = ((c) (obj)).hashCode();
                    int j3 = n & l1;
                    int k3 = o[j3];
                    if (p[j3] == null)
                    {
                        o[j3] = l1 << 8;
                        p[j3] = ((c) (obj));
                    } else
                    {
                        r = r + 1;
                        int i2 = k3 & 0xff;
                        if (i2 == 0)
                        {
                            if (s <= 254)
                            {
                                int k2 = s;
                                s = s + 1;
                                i2 = k2;
                                if (k2 >= q.length)
                                {
                                    p();
                                    i2 = k2;
                                }
                            } else
                            {
                                i2 = l();
                            }
                            o[j3] = k3 & 0xffffff00 | i2 + 1;
                        } else
                        {
                            i2--;
                        }
                        obj = new a(((c) (obj)), q[i2]);
                        q[i2] = ((a) (obj));
                        j1 = Math.max(j1, ((a) (obj)).a());
                    }
                    a1 = a1.b;
                    i1++;
                }
            }

            m = j1;
            if (i1 != l)
            {
                throw new RuntimeException((new StringBuilder()).append("Internal error: count after rehash ").append(i1).append("; should be ").append(l).toString());
            }
        }
    }

    private void k()
    {
        l = 0;
        m = 0;
        Arrays.fill(o, 0);
        Arrays.fill(p, null);
        Arrays.fill(q, null);
        r = 0;
        s = 0;
    }

    private int l()
    {
        a aa[] = q;
        int j1 = 0x7fffffff;
        int k1 = -1;
        int i1 = 0;
        for (int i2 = s; i1 < i2; i1++)
        {
            int l1 = aa[i1].a();
            if (l1 >= j1)
            {
                continue;
            }
            if (l1 == 1)
            {
                return i1;
            }
            k1 = i1;
            j1 = l1;
        }

        return k1;
    }

    private void m()
    {
        int ai[] = o;
        int i1 = o.length;
        o = new int[i1];
        System.arraycopy(ai, 0, o, 0, i1);
        v = false;
    }

    private void n()
    {
        a aa[] = q;
        if (aa == null)
        {
            q = new a[32];
        } else
        {
            int i1 = aa.length;
            q = new a[i1];
            System.arraycopy(aa, 0, q, 0, i1);
        }
        x = false;
    }

    private void o()
    {
        c ac[] = p;
        int i1 = ac.length;
        p = new c[i1];
        System.arraycopy(ac, 0, p, 0, i1);
        w = false;
    }

    private void p()
    {
        a aa[] = q;
        int i1 = aa.length;
        q = new a[i1 + i1];
        System.arraycopy(aa, 0, q, 0, i1);
    }

    public com.fasterxml.jackson.core.c.a a(boolean flag, boolean flag1)
    {
        return new com.fasterxml.jackson.core.c.a(this, flag1, t, (b)j.get());
    }

    public c a(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        if (j1 == 0)
        {
            k1 = c(i1);
        } else
        {
            k1 = b(i1, j1);
        }
        l1 = n & k1;
        i2 = o[l1];
        if ((i2 >> 8 ^ k1) << 8 == 0)
        {
            c c1 = p[l1];
            if (c1 == null)
            {
                return null;
            }
            if (c1.a(i1, j1))
            {
                return c1;
            }
        } else
        if (i2 == 0)
        {
            return null;
        }
        l1 = i2 & 0xff;
        if (l1 > 0)
        {
            a a1 = q[l1 - 1];
            if (a1 != null)
            {
                return a1.a(k1, i1, j1);
            }
        }
        return null;
    }

    public c a(String s1, int i1, int j1)
    {
        String s2 = s1;
        if (k)
        {
            s2 = InternCache.a.a(s1);
        }
        int k1;
        if (j1 == 0)
        {
            k1 = c(i1);
        } else
        {
            k1 = b(i1, j1);
        }
        s1 = a(k1, s2, i1, j1);
        a(k1, ((c) (s1)));
        return s1;
    }

    public c a(String s1, int ai[], int i1)
    {
        String s2 = s1;
        if (k)
        {
            s2 = InternCache.a.a(s1);
        }
        int j1;
        if (i1 < 3)
        {
            if (i1 == 1)
            {
                j1 = c(ai[0]);
            } else
            {
                j1 = b(ai[0], ai[1]);
            }
        } else
        {
            j1 = b(ai, i1);
        }
        s1 = a(j1, s2, ai, i1);
        a(j1, ((c) (s1)));
        return s1;
    }

    public c a(int ai[], int i1)
    {
        int j1 = 0;
        if (i1 >= 3) goto _L2; else goto _L1
_L1:
        c c1;
        int k1 = ai[0];
        if (i1 < 2)
        {
            i1 = j1;
        } else
        {
            i1 = ai[1];
        }
        c1 = a(k1, i1);
_L6:
        return c1;
_L2:
        int l1;
        int j2;
        j1 = b(ai, i1);
        l1 = n & j1;
        j2 = o[l1];
        if ((j2 >> 8 ^ j1) << 8 != 0) goto _L4; else goto _L3
_L3:
        c c2;
        c2 = p[l1];
        c1 = c2;
        if (c2 == null) goto _L6; else goto _L5
_L5:
        c1 = c2;
        if (c2.a(ai, i1)) goto _L6; else goto _L7
_L7:
        int i2 = j2 & 0xff;
        if (i2 > 0)
        {
            a a1 = q[i2 - 1];
            if (a1 != null)
            {
                return a1.a(j1, ai, i1);
            }
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (j2 == 0)
        {
            return null;
        }
        if (true) goto _L7; else goto _L8
_L8:
        return null;
    }

    public int b(int i1, int j1)
    {
        i1 = (i1 >>> 15 ^ i1) + j1 * 33 ^ t;
        return i1 + (i1 >>> 7);
    }

    public int b(int ai[], int i1)
    {
        int j1 = 3;
        if (i1 < 3)
        {
            throw new IllegalArgumentException();
        }
        int k1 = ai[0] ^ t;
        k1 = ((k1 + (k1 >>> 9)) * 33 + ai[1]) * 0x1003f;
        k1 = k1 + (k1 >>> 15) ^ ai[2];
        k1 += k1 >>> 17;
        for (; j1 < i1; j1++)
        {
            k1 = k1 * 31 ^ ai[j1];
            k1 += k1 >>> 3;
            k1 ^= k1 << 7;
        }

        i1 = (k1 >>> 15) + k1;
        return i1 ^ i1 << 9;
    }

    public c b(int i1)
    {
        int j1;
        int k1;
        int i2;
        j1 = c(i1);
        k1 = n & j1;
        i2 = o[k1];
        if ((i2 >> 8 ^ j1) << 8 != 0) goto _L2; else goto _L1
_L1:
        c c1 = p[k1];
        if (c1 != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        if (c1.a(i1))
        {
            return c1;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (i2 == 0) goto _L3; else goto _L5
_L5:
        int l1 = i2 & 0xff;
        if (l1 > 0)
        {
            a a1 = q[l1 - 1];
            if (a1 != null)
            {
                return a1.a(j1, i1, 0);
            }
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    public void b()
    {
        if (i != null && e())
        {
            i.a(new b(this));
            v = true;
            w = true;
            x = true;
        }
    }

    public int c()
    {
        if (j != null)
        {
            return ((b)j.get()).a;
        } else
        {
            return l;
        }
    }

    public int c(int i1)
    {
        i1 = t ^ i1;
        i1 += i1 >>> 15;
        return i1 ^ i1 >>> 9;
    }

    public int d()
    {
        return o.length;
    }

    protected void d(int i1)
    {
        throw new IllegalStateException((new StringBuilder()).append("Longest collision chain in symbol table (of size ").append(l).append(") now exceeds maximum, ").append(i1).append(" -- suspect a DoS attack based on hash collisions").toString());
    }

    public boolean e()
    {
        return !v;
    }

    public int f()
    {
        return t;
    }

    public int g()
    {
        return r;
    }

    public int h()
    {
        return m;
    }
}
