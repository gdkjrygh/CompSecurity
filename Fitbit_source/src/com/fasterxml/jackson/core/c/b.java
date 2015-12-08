// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.c;

import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;

public final class b
{
    static final class a
    {

        private final String a;
        private final a b;
        private final int c;

        public String a()
        {
            return a;
        }

        public String a(char ac[], int i1, int j1)
        {
            a a1;
            String s;
            s = a;
            a1 = b;
_L7:
            int k1;
            if (s.length() != j1)
            {
                break MISSING_BLOCK_LABEL_72;
            }
            k1 = 0;
_L5:
            if (s.charAt(k1) == ac[i1 + k1]) goto _L2; else goto _L1
_L1:
            if (k1 == j1)
            {
                return s;
            }
            break MISSING_BLOCK_LABEL_72;
_L2:
            int l1 = k1 + 1;
            k1 = l1;
            if (l1 < j1)
            {
                break; /* Loop/switch isn't completed */
            }
            k1 = l1;
            if (true) goto _L1; else goto _L3
_L3:
            if (true) goto _L5; else goto _L4
_L4:
            if (a1 == null)
            {
                return null;
            }
            s = a1.a();
            a1 = a1.b();
            if (true) goto _L7; else goto _L6
_L6:
        }

        public a b()
        {
            return b;
        }

        public int c()
        {
            return c;
        }

        public a(String s, a a1)
        {
            a = s;
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


    public static final int a = 33;
    protected static final int b = 64;
    protected static final int c = 0x10000;
    static final int d = 12000;
    static final int e = 255;
    static final int f = 63;
    static final b g = new b();
    protected b h;
    protected final boolean i;
    protected final boolean j;
    protected String k[];
    protected a l[];
    protected int m;
    protected int n;
    protected int o;
    protected int p;
    protected boolean q;
    private final int r;

    private b()
    {
        j = true;
        i = true;
        q = true;
        r = 0;
        p = 0;
        d(64);
    }

    private b(b b1, boolean flag, boolean flag1, String as[], a aa[], int i1, int j1, 
            int k1)
    {
        h = b1;
        j = flag;
        i = flag1;
        k = as;
        l = aa;
        m = i1;
        r = j1;
        i1 = as.length;
        n = e(i1);
        o = i1 - 1;
        p = k1;
        q = false;
    }

    public static b a()
    {
        long l1 = System.currentTimeMillis();
        int i1 = (int)l1;
        return a((int)(l1 >>> 32) + i1 | 1);
    }

    protected static b a(int i1)
    {
        return g.f(i1);
    }

    private void a(b b1)
    {
        if (b1.c() <= 12000 && b1.p <= 63)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        this;
        JVM INSTR monitorenter ;
        d(64);
        q = false;
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
        if (b1.c() <= c())
        {
            break MISSING_BLOCK_LABEL_114;
        }
        this;
        JVM INSTR monitorenter ;
        k = b1.k;
        l = b1.l;
        m = b1.m;
        n = b1.n;
        o = b1.o;
        p = b1.p;
        q = false;
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    private void d(int i1)
    {
        k = new String[i1];
        l = new a[i1 >> 1];
        o = i1 - 1;
        m = 0;
        p = 0;
        n = e(i1);
    }

    private static int e(int i1)
    {
        return i1 - (i1 >> 2);
    }

    private b f(int i1)
    {
        return new b(null, true, true, k, l, m, i1, p);
    }

    private void i()
    {
        Object aobj[] = k;
        int i1 = aobj.length;
        k = new String[i1];
        System.arraycopy(((Object) (aobj)), 0, k, 0, i1);
        aobj = l;
        i1 = aobj.length;
        l = new a[i1];
        System.arraycopy(((Object) (aobj)), 0, l, 0, i1);
    }

    private void j()
    {
        int l2 = k.length;
        int i1 = l2 + l2;
        if (i1 > 0x10000)
        {
            m = 0;
            Arrays.fill(k, null);
            Arrays.fill(l, null);
            q = true;
        } else
        {
            String as[] = k;
            a aa[] = l;
            k = new String[i1];
            l = new a[i1 >> 1];
            o = i1 - 1;
            n = e(i1);
            int l1 = 0;
            i1 = 0;
            int j1 = 0;
            while (l1 < l2) 
            {
                Object obj = as[l1];
                int i2 = i1;
                int k2 = j1;
                if (obj != null)
                {
                    k2 = j1 + 1;
                    j1 = b(a(((String) (obj))));
                    if (k[j1] == null)
                    {
                        k[j1] = ((String) (obj));
                        i2 = i1;
                    } else
                    {
                        j1 >>= 1;
                        obj = new a(((String) (obj)), l[j1]);
                        l[j1] = ((a) (obj));
                        i2 = Math.max(i1, ((a) (obj)).c());
                    }
                }
                l1++;
                i1 = i2;
                j1 = k2;
            }
            boolean flag = false;
            l1 = j1;
            for (int k1 = ((flag) ? 1 : 0); k1 < l2 >> 1; k1++)
            {
                a a1 = aa[k1];
                while (a1 != null) 
                {
                    l1++;
                    Object obj1 = a1.a();
                    int j2 = b(a(((String) (obj1))));
                    if (k[j2] == null)
                    {
                        k[j2] = ((String) (obj1));
                    } else
                    {
                        j2 >>= 1;
                        obj1 = new a(((String) (obj1)), l[j2]);
                        l[j2] = ((a) (obj1));
                        i1 = Math.max(i1, ((a) (obj1)).c());
                    }
                    a1 = a1.b();
                }
            }

            p = i1;
            if (l1 != m)
            {
                throw new Error((new StringBuilder()).append("Internal error on SymbolTable.rehash(): had ").append(m).append(" entries; now have ").append(l1).append(".").toString());
            }
        }
    }

    public int a(String s)
    {
        int l1 = s.length();
        int i1 = r;
        for (int j1 = 0; j1 < l1;)
        {
            char c1 = s.charAt(j1);
            j1++;
            i1 = c1 + i1 * 33;
        }

        int k1 = i1;
        if (i1 == 0)
        {
            k1 = 1;
        }
        return k1;
    }

    public int a(char ac[], int i1, int j1)
    {
        i1 = r;
        for (int k1 = 0; k1 < j1;)
        {
            char c1 = ac[k1];
            k1++;
            i1 = c1 + i1 * 33;
        }

        j1 = i1;
        if (i1 == 0)
        {
            j1 = 1;
        }
        return j1;
    }

    public b a(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        String as[];
        a aa[];
        int i1;
        int j1;
        int k1;
        as = k;
        aa = l;
        i1 = m;
        j1 = r;
        k1 = p;
        this;
        JVM INSTR monitorexit ;
        return new b(this, flag, flag1, as, aa, i1, j1, k1);
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String a(char ac[], int i1, int j1, int k1)
    {
        Object obj;
        if (j1 < 1)
        {
            obj = "";
        } else
        {
            if (!j)
            {
                return new String(ac, i1, j1);
            }
            int l1 = b(k1);
            obj = k[l1];
            if (obj != null)
            {
                if (((String) (obj)).length() == j1)
                {
                    k1 = 0;
                    do
                    {
                        if (((String) (obj)).charAt(k1) == ac[i1 + k1])
                        {
                            int i2 = k1 + 1;
                            k1 = i2;
                            if (i2 < j1)
                            {
                                continue;
                            }
                            k1 = i2;
                        }
                        if (k1 == j1)
                        {
                            return ((String) (obj));
                        }
                        break;
                    } while (true);
                }
                obj = l[l1 >> 1];
                if (obj != null)
                {
                    obj = ((a) (obj)).a(ac, i1, j1);
                    if (obj != null)
                    {
                        return ((String) (obj));
                    }
                }
            }
            if (!q)
            {
                i();
                q = true;
                k1 = l1;
            } else
            if (m >= n)
            {
                j();
                k1 = b(a(ac, i1, j1));
            } else
            {
                k1 = l1;
            }
            obj = new String(ac, i1, j1);
            ac = ((char []) (obj));
            if (i)
            {
                ac = InternCache.a.a(((String) (obj)));
            }
            m = m + 1;
            if (k[k1] == null)
            {
                k[k1] = ac;
                return ac;
            }
            i1 = k1 >> 1;
            obj = new a(ac, l[i1]);
            l[i1] = ((a) (obj));
            p = Math.max(((a) (obj)).c(), p);
            obj = ac;
            if (p > 255)
            {
                c(255);
                return ac;
            }
        }
        return ((String) (obj));
    }

    public int b(int i1)
    {
        return (i1 >>> 15) + i1 & o;
    }

    public void b()
    {
        while (!e() || h == null) 
        {
            return;
        }
        h.a(this);
        q = false;
    }

    public int c()
    {
        return m;
    }

    protected void c(int i1)
    {
        throw new IllegalStateException((new StringBuilder()).append("Longest collision chain in symbol table (of size ").append(m).append(") now exceeds maximum, ").append(i1).append(" -- suspect a DoS attack based on hash collisions").toString());
    }

    public int d()
    {
        return k.length;
    }

    public boolean e()
    {
        return q;
    }

    public int f()
    {
        return r;
    }

    public int g()
    {
        int j1 = 0;
        a aa[] = l;
        int l1 = aa.length;
        for (int i1 = 0; i1 < l1;)
        {
            a a1 = aa[i1];
            int k1 = j1;
            if (a1 != null)
            {
                k1 = j1 + a1.c();
            }
            i1++;
            j1 = k1;
        }

        return j1;
    }

    public int h()
    {
        return p;
    }

}
