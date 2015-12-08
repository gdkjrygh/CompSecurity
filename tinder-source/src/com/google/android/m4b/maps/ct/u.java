// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            d, p, e

final class u extends com.google.android.m4b.maps.ct.d
{
    static final class a
    {

        final Stack a;

        private static int a(int i)
        {
            int j = Arrays.binarySearch(u.h(), i);
            i = j;
            if (j < 0)
            {
                i = -(j + 1) - 1;
            }
            return i;
        }

        final void a(com.google.android.m4b.maps.ct.d d1)
        {
            do
            {
                if (d1.f())
                {
                    int i = a(d1.b());
                    int k = u.h()[i + 1];
                    if (a.isEmpty() || ((com.google.android.m4b.maps.ct.d)a.peek()).b() >= k)
                    {
                        a.push(d1);
                        return;
                    }
                    i = u.h()[i];
                    Object obj;
                    for (obj = (com.google.android.m4b.maps.ct.d)a.pop(); !a.isEmpty() && ((com.google.android.m4b.maps.ct.d)a.peek()).b() < i; obj = new u((com.google.android.m4b.maps.ct.d)a.pop(), ((com.google.android.m4b.maps.ct.d) (obj)), (byte)0)) { }
                    d1 = new u(((com.google.android.m4b.maps.ct.d) (obj)), d1, (byte)0);
                    do
                    {
                        if (a.isEmpty())
                        {
                            break;
                        }
                        int j = a(d1.b());
                        j = u.h()[j + 1];
                        if (((com.google.android.m4b.maps.ct.d)a.peek()).b() >= j)
                        {
                            break;
                        }
                        d1 = new u((com.google.android.m4b.maps.ct.d)a.pop(), d1, (byte)0);
                    } while (true);
                    a.push(d1);
                    return;
                }
                if (d1 instanceof u)
                {
                    d1 = (u)d1;
                    a(u.a(d1));
                    d1 = u.b(d1);
                } else
                {
                    d1 = String.valueOf(d1.getClass());
                    throw new IllegalArgumentException((new StringBuilder(String.valueOf(d1).length() + 49)).append("Has a new type of ByteString been created? Found ").append(d1).toString());
                }
            } while (true);
        }

        private a()
        {
            a = new Stack();
        }

        a(byte byte0)
        {
            this();
        }
    }

    static final class b
        implements Iterator
    {

        private final Stack a;
        private p b;

        private p a(com.google.android.m4b.maps.ct.d d1)
        {
            for (; d1 instanceof u; d1 = u.a(d1))
            {
                d1 = (u)d1;
                a.push(d1);
            }

            return (p)d1;
        }

        private p b()
        {
            do
            {
                if (a.isEmpty())
                {
                    return null;
                }
                p p1 = a(u.b((u)a.pop()));
                boolean flag;
                if (p1.b() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } while (flag);
            return p1;
        }

        public final p a()
        {
            if (b == null)
            {
                throw new NoSuchElementException();
            } else
            {
                p p1 = b;
                b = b();
                return p1;
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

        private b(com.google.android.m4b.maps.ct.d d1)
        {
            a = new Stack();
            b = a(d1);
        }

        b(com.google.android.m4b.maps.ct.d d1, byte byte0)
        {
            this(d1);
        }
    }

    final class c
        implements d.a
    {

        private final b a;
        private d.a b;
        private int c;
        private u d;

        public final byte a()
        {
            if (!b.hasNext())
            {
                b = a.a().a();
            }
            c = c - 1;
            return b.a();
        }

        public final boolean hasNext()
        {
            return c > 0;
        }

        public final Object next()
        {
            return Byte.valueOf(a());
        }

        public final void remove()
        {
            throw new UnsupportedOperationException();
        }

        private c()
        {
            d = u.this;
            super();
            a = new b(u.this, (byte)0);
            b = a.a().a();
            c = u.this.b();
        }

        c(byte byte0)
        {
            this();
        }
    }

    final class d extends InputStream
    {

        private b a;
        private p b;
        private int c;
        private int d;
        private int e;
        private int f;
        private u g;

        private int a(byte abyte0[], int i, int j)
        {
            int k = j;
            int i1 = i;
            i = k;
            for (int l = i1; i > 0; l = i1)
            {
                b();
                if (b == null)
                {
                    if (i == j)
                    {
                        return -1;
                    }
                    break;
                }
                int j1 = Math.min(c - d, i);
                i1 = l;
                if (abyte0 != null)
                {
                    b.a(abyte0, d, l, j1);
                    i1 = l + j1;
                }
                d = d + j1;
                i -= j1;
            }

            return j - i;
        }

        private void a()
        {
            a = new b(g, (byte)0);
            b = a.a();
            c = b.b();
            d = 0;
            e = 0;
        }

        private void b()
        {
label0:
            {
                if (b != null && d == c)
                {
                    e = e + c;
                    d = 0;
                    if (!a.hasNext())
                    {
                        break label0;
                    }
                    b = a.a();
                    c = b.b();
                }
                return;
            }
            b = null;
            c = 0;
        }

        public final int available()
        {
            int i = e;
            int j = d;
            return g.b() - (i + j);
        }

        public final void mark(int i)
        {
            f = e + d;
        }

        public final boolean markSupported()
        {
            return true;
        }

        public final int read()
        {
            b();
            if (b == null)
            {
                return -1;
            } else
            {
                p p1 = b;
                int i = d;
                d = i + 1;
                return p1.b(i) & 0xff;
            }
        }

        public final int read(byte abyte0[], int i, int j)
        {
            if (abyte0 == null)
            {
                throw new NullPointerException();
            }
            if (i < 0 || j < 0 || j > abyte0.length - i)
            {
                throw new IndexOutOfBoundsException();
            } else
            {
                return a(abyte0, i, j);
            }
        }

        public final void reset()
        {
            this;
            JVM INSTR monitorenter ;
            a();
            a(null, 0, f);
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

        public d()
        {
            g = u.this;
            super();
            a();
        }
    }


    private static final int b[];
    private static final long serialVersionUID = 1L;
    private final int c;
    private final com.google.android.m4b.maps.ct.d d;
    private final com.google.android.m4b.maps.ct.d e;
    private final int f;
    private final int g;
    private int h;

    private u(com.google.android.m4b.maps.ct.d d1, com.google.android.m4b.maps.ct.d d2)
    {
        h = 0;
        d = d1;
        e = d2;
        f = d1.b();
        c = f + d2.b();
        g = Math.max(d1.e(), d2.e()) + 1;
    }

    u(com.google.android.m4b.maps.ct.d d1, com.google.android.m4b.maps.ct.d d2, byte byte0)
    {
        this(d1, d2);
    }

    static com.google.android.m4b.maps.ct.d a(com.google.android.m4b.maps.ct.d d1, com.google.android.m4b.maps.ct.d d2)
    {
        Object obj;
        int i;
        if (d1 instanceof u)
        {
            obj = (u)d1;
        } else
        {
            obj = null;
        }
        if (d2.b() == 0)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        if (d1.b() == 0) goto _L2; else goto _L1
_L1:
        i = d1.b() + d2.b();
        if (i >= 128) goto _L4; else goto _L3
_L3:
        d2 = b(d1, d2);
_L5:
        return d2;
_L4:
        if (obj != null && ((u) (obj)).e.b() + d2.b() < 128)
        {
            d1 = b(((u) (obj)).e, d2);
            return new u(((u) (obj)).d, d1);
        }
        if (obj != null && ((u) (obj)).d.e() > ((u) (obj)).e.e() && ((u) (obj)).g > d2.e())
        {
            d1 = new u(((u) (obj)).e, d2);
            return new u(((u) (obj)).d, d1);
        }
        int j = Math.max(d1.e(), d2.e());
        if (i >= b[j + 1])
        {
            return new u(d1, d2);
        }
        obj = new a((byte)0);
        ((a) (obj)).a(d1);
        ((a) (obj)).a(d2);
        d1 = (com.google.android.m4b.maps.ct.d)((a) (obj)).a.pop();
        do
        {
            d2 = d1;
            if (((a) (obj)).a.isEmpty())
            {
                break;
            }
            d1 = new u((com.google.android.m4b.maps.ct.d)((a) (obj)).a.pop(), d1, (byte)0);
        } while (true);
        if (true) goto _L5; else goto _L2
_L2:
        return d2;
        return d1;
    }

    static com.google.android.m4b.maps.ct.d a(u u1)
    {
        return u1.d;
    }

    static com.google.android.m4b.maps.ct.d b(u u1)
    {
        return u1.e;
    }

    private static p b(com.google.android.m4b.maps.ct.d d1, com.google.android.m4b.maps.ct.d d2)
    {
        int i = d1.b();
        int j = d2.b();
        byte abyte0[] = new byte[i + j];
        d1.a(abyte0, 0, 0, i);
        d2.a(abyte0, 0, i, j);
        return new p(abyte0);
    }

    static int[] h()
    {
        return b;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    protected final int a(int i, int j, int k)
    {
        if (j + k <= f)
        {
            return d.a(i, j, k);
        }
        if (j >= f)
        {
            return e.a(i, j - f, k);
        } else
        {
            int l = f - j;
            i = d.a(i, j, l);
            return e.a(i, 0, k - l);
        }
    }

    public final d.a a()
    {
        return new c((byte)0);
    }

    public final int b()
    {
        return c;
    }

    protected final void b(byte abyte0[], int i, int j, int k)
    {
        if (i + k <= f)
        {
            d.b(abyte0, i, j, k);
            return;
        }
        if (i >= f)
        {
            e.b(abyte0, i - f, j, k);
            return;
        } else
        {
            int l = f - i;
            d.b(abyte0, i, j, l);
            e.b(abyte0, 0, j + l, k - l);
            return;
        }
    }

    public final e d()
    {
        return new e(new d());
    }

    protected final int e()
    {
        return g;
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
        int i;
        flag = flag2;
        if (!(obj instanceof com.google.android.m4b.maps.ct.d))
        {
            continue;
        }
        obj = (com.google.android.m4b.maps.ct.d)obj;
        flag = flag2;
        if (c != ((com.google.android.m4b.maps.ct.d) (obj)).b())
        {
            continue;
        }
        if (c == 0)
        {
            return true;
        }
        if (h == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i = ((com.google.android.m4b.maps.ct.d) (obj)).g();
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag2;
        if (h != i) goto _L4; else goto _L3
_L3:
        b b1 = new b(this, (byte)0);
        p p1 = (p)b1.next();
        b b2 = new b(((com.google.android.m4b.maps.ct.d) (obj)), (byte)0);
        obj = (p)b2.next();
        int j = 0;
        int k = 0;
        int l = 0;
        do
        {
            int k1 = p1.b() - k;
            int i1 = ((p) (obj)).b() - j;
            int j1 = Math.min(k1, i1);
            boolean flag1;
            if (k == 0)
            {
                flag1 = p1.a(((p) (obj)), j, j1);
            } else
            {
                flag1 = ((p) (obj)).a(p1, k, j1);
            }
            flag = flag2;
            if (!flag1)
            {
                continue;
            }
            l += j1;
            if (l >= c)
            {
                if (l == c)
                {
                    return true;
                } else
                {
                    throw new IllegalStateException();
                }
            }
            if (j1 == k1)
            {
                p1 = (p)b1.next();
                k = 0;
            } else
            {
                k += j1;
            }
            if (j1 == i1)
            {
                obj = (p)b2.next();
                j = 0;
            } else
            {
                j += j1;
            }
        } while (true);
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected final boolean f()
    {
        return c >= b[g];
    }

    protected final int g()
    {
        return h;
    }

    public final int hashCode()
    {
        int j = h;
        int i = j;
        if (j == 0)
        {
            int k = a(c, 0, c);
            i = k;
            if (k == 0)
            {
                i = 1;
            }
            h = i;
        }
        return i;
    }

    public final Iterator iterator()
    {
        return a();
    }

    final Object writeReplace()
    {
        return new p(c());
    }

    static 
    {
        int i = 1;
        ArrayList arraylist = new ArrayList();
        int k = 1;
        do
        {
            int l = k;
            if (i <= 0)
            {
                break;
            }
            arraylist.add(Integer.valueOf(i));
            k = i;
            i = l + i;
        } while (true);
        arraylist.add(Integer.valueOf(0x7fffffff));
        b = new int[arraylist.size()];
        for (int j = 0; j < b.length; j++)
        {
            b[j] = ((Integer)arraylist.get(j)).intValue();
        }

    }
}
