// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

// Referenced classes of package com.c.b:
//            f, ba, g

final class bo extends f
{
    private static final class a
        implements Iterator
    {

        private final Stack a;
        private ba b;

        private ba a(f f1)
        {
            for (; f1 instanceof bo; f1 = bo.a(f1))
            {
                f1 = (bo)f1;
                a.push(f1);
            }

            return (ba)f1;
        }

        private ba b()
        {
            ba ba1;
            do
            {
                if (a.isEmpty())
                {
                    return null;
                }
                ba1 = a(bo.b((bo)a.pop()));
            } while (ba1.d());
            return ba1;
        }

        public final ba a()
        {
            if (b == null)
            {
                throw new NoSuchElementException();
            } else
            {
                ba ba1 = b;
                b = b();
                return ba1;
            }
        }

        public final boolean hasNext()
        {
            return b != null;
        }

        public final Object next()
        {
            return a();
        }

        public final void remove()
        {
            throw new UnsupportedOperationException();
        }

        private a(f f1)
        {
            a = new Stack();
            b = a(f1);
        }

        a(f f1, byte byte0)
        {
            this(f1);
        }
    }

    private final class b
        implements f.a
    {

        int a;
        final bo b;
        private final a c;
        private f.a d;

        public final byte a()
        {
            if (!d.hasNext())
            {
                d = c.a().c();
            }
            a = a - 1;
            return d.a();
        }

        public final boolean hasNext()
        {
            return a > 0;
        }

        public final Object next()
        {
            return Byte.valueOf(a());
        }

        public final void remove()
        {
            throw new UnsupportedOperationException();
        }

        private b()
        {
            b = bo.this;
            super();
            c = new a(bo.this, (byte)0);
            d = c.a().c();
            a = bo.this.a();
        }

        b(byte byte0)
        {
            this();
        }
    }

    private final class c extends InputStream
    {

        final bo a;
        private a b;
        private ba c;
        private int d;
        private int e;
        private int f;
        private int g;

        private int a(byte abyte0[], int j, int k)
        {
            int l = k;
            int j1 = j;
            j = l;
            for (int i1 = j1; j > 0; i1 = j1)
            {
                b();
                if (c == null)
                {
                    if (j == k)
                    {
                        return -1;
                    }
                    break;
                }
                int k1 = Math.min(d - e, j);
                j1 = i1;
                if (abyte0 != null)
                {
                    c.b(abyte0, e, i1, k1);
                    j1 = i1 + k1;
                }
                e = e + k1;
                j -= k1;
            }

            return k - j;
        }

        private void a()
        {
            b = new a(a, (byte)0);
            c = b.a();
            d = c.a();
            e = 0;
            f = 0;
        }

        private void b()
        {
label0:
            {
                if (c != null && e == d)
                {
                    f = f + d;
                    e = 0;
                    if (!b.hasNext())
                    {
                        break label0;
                    }
                    c = b.a();
                    d = c.a();
                }
                return;
            }
            c = null;
            d = 0;
        }

        public final int available()
        {
            int j = f;
            int k = e;
            return a.a() - (j + k);
        }

        public final void mark(int j)
        {
            g = f + e;
        }

        public final boolean markSupported()
        {
            return true;
        }

        public final int read()
        {
            b();
            if (c == null)
            {
                return -1;
            } else
            {
                ba ba1 = c;
                int j = e;
                e = j + 1;
                return ba1.a(j) & 0xff;
            }
        }

        public final int read(byte abyte0[], int j, int k)
        {
            if (abyte0 == null)
            {
                throw new NullPointerException();
            }
            if (j < 0 || k < 0 || k > abyte0.length - j)
            {
                throw new IndexOutOfBoundsException();
            } else
            {
                return a(abyte0, j, k);
            }
        }

        public final void reset()
        {
            this;
            JVM INSTR monitorenter ;
            a();
            a(null, 0, g);
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public final long skip(long l)
        {
            if (l < 0L)
            {
                throw new IndexOutOfBoundsException();
            }
            long l1 = l;
            if (l > 0x7fffffffL)
            {
                l1 = 0x7fffffffL;
            }
            return (long)a(null, 0, (int)l1);
        }

        public c()
        {
            a = bo.this;
            super();
            a();
        }
    }


    private static final int c[];
    private final int d;
    private final f e;
    private final f f;
    private final int g;
    private int h;

    static f a(bo bo1)
    {
        return bo1.e;
    }

    static f b(bo bo1)
    {
        return bo1.f;
    }

    public final byte a(int j)
    {
        if (j < 0)
        {
            throw new ArrayIndexOutOfBoundsException((new StringBuilder("Index < 0: ")).append(j).toString());
        }
        if (j > d)
        {
            throw new ArrayIndexOutOfBoundsException((new StringBuilder("Index > length: ")).append(j).append(", ").append(d).toString());
        }
        if (j < g)
        {
            return e.a(j);
        } else
        {
            return f.a(j - g);
        }
    }

    public final int a()
    {
        return d;
    }

    protected final int a(int j, int k, int l)
    {
        if (k + l <= g)
        {
            return e.a(j, k, l);
        }
        if (k >= g)
        {
            return f.a(j, k - g, l);
        } else
        {
            int i1 = g - k;
            j = e.a(j, k, i1);
            return f.a(j, 0, l - i1);
        }
    }

    protected final String a(Charset charset)
    {
        return new String(e(), charset);
    }

    final void a(OutputStream outputstream, int j, int k)
    {
        if (j + k <= g)
        {
            e.a(outputstream, j, k);
            return;
        }
        if (j >= g)
        {
            f.a(outputstream, j - g, k);
            return;
        } else
        {
            int l = g - j;
            e.a(outputstream, j, l);
            f.a(outputstream, 0, k - l);
            return;
        }
    }

    protected final void a(byte abyte0[], int j, int k, int l)
    {
        if (j + l <= g)
        {
            e.a(abyte0, j, k, l);
            return;
        }
        if (j >= g)
        {
            f.a(abyte0, j - g, k, l);
            return;
        } else
        {
            int i1 = g - j;
            e.a(abyte0, j, k, i1);
            f.a(abyte0, 0, k + i1, l - i1);
            return;
        }
    }

    protected final int b(int j, int k, int l)
    {
        if (k + l <= g)
        {
            return e.b(j, k, l);
        }
        if (k >= g)
        {
            return f.b(j, k - g, l);
        } else
        {
            int i1 = g - k;
            j = e.b(j, k, i1);
            return f.b(j, 0, l - i1);
        }
    }

    public final f.a c()
    {
        return new b((byte)0);
    }

    public final boolean equals(Object obj)
    {
        boolean flag2 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        int j;
        flag = flag2;
        if (!(obj instanceof f))
        {
            continue;
        }
        obj = (f)obj;
        flag = flag2;
        if (d != ((f) (obj)).a())
        {
            continue;
        }
        if (d == 0)
        {
            return true;
        }
        if (h == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j = ((f) (obj)).i();
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag2;
        if (h != j) goto _L4; else goto _L3
_L3:
        a a1 = new a(this, (byte)0);
        ba ba1 = (ba)a1.next();
        a a2 = new a(((f) (obj)), (byte)0);
        obj = (ba)a2.next();
        int k = 0;
        int l = 0;
        int i1 = 0;
        do
        {
            int l1 = ba1.a() - l;
            int j1 = ((ba) (obj)).a() - k;
            int k1 = Math.min(l1, j1);
            boolean flag1;
            if (l == 0)
            {
                flag1 = ba1.a(((ba) (obj)), k, k1);
            } else
            {
                flag1 = ((ba) (obj)).a(ba1, l, k1);
            }
            flag = flag2;
            if (!flag1)
            {
                continue;
            }
            i1 += k1;
            if (i1 >= d)
            {
                if (i1 == d)
                {
                    return true;
                } else
                {
                    throw new IllegalStateException();
                }
            }
            if (k1 == l1)
            {
                ba1 = (ba)a1.next();
                l = 0;
            } else
            {
                l += k1;
            }
            if (k1 == j1)
            {
                obj = (ba)a2.next();
                k = 0;
            } else
            {
                k += k1;
            }
        } while (true);
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final boolean g()
    {
        boolean flag = false;
        int j = e.a(0, 0, g);
        if (f.a(j, 0, f.a()) == 0)
        {
            flag = true;
        }
        return flag;
    }

    public final g h()
    {
        return com.c.b.g.a(new c());
    }

    public final int hashCode()
    {
        int k = h;
        int j = k;
        if (k == 0)
        {
            int l = b(d, 0, d);
            j = l;
            if (l == 0)
            {
                j = 1;
            }
            h = j;
        }
        return j;
    }

    protected final int i()
    {
        return h;
    }

    public final Iterator iterator()
    {
        return c();
    }

    static 
    {
        int j = 1;
        ArrayList arraylist = new ArrayList();
        int l = 1;
        do
        {
            int i1 = l;
            if (j <= 0)
            {
                break;
            }
            arraylist.add(Integer.valueOf(j));
            l = j;
            j = i1 + j;
        } while (true);
        arraylist.add(Integer.valueOf(0x7fffffff));
        c = new int[arraylist.size()];
        for (int k = 0; k < c.length; k++)
        {
            c[k] = ((Integer)arraylist.get(k)).intValue();
        }

    }
}
