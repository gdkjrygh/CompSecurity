// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

public final class anz
{
    static final class a extends alw
    {

        private int d;
        private d e;
        private d f;

        private d h(long l)
        {
            d d2;
            int i = d;
            d d1 = e;
            d2 = f;
            long l1;
            long l2;
            try
            {
                l1 = d1.a(l, i, d2.b);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                l1 = l;
            }
            catch (ArithmeticException arithmeticexception)
            {
                l1 = l;
            }
            l2 = d2.a(l, i, d1.b);
            l = l2;
_L2:
            if (l1 > l)
            {
                return d1;
            } else
            {
                return d2;
            }
            Object obj;
            obj;
            continue; /* Loop/switch isn't completed */
            obj;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public final String a(long l)
        {
            return h(l).a;
        }

        public final int b(long l)
        {
            return d + h(l).b;
        }

        public final boolean c()
        {
            return false;
        }

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj instanceof a)
                {
                    if (!super.c.equals(((alw) (obj = (a)obj)).c) || d != ((a) (obj)).d || !e.equals(((a) (obj)).e) || !f.equals(((a) (obj)).f))
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        public final long f(long l)
        {
            d d1;
            d d2;
            int i;
            i = d;
            d1 = e;
            d2 = f;
            long l2 = d1.a(l, i, d2.b);
            long l1;
            l1 = l2;
            if (l > 0L)
            {
                l1 = l2;
                if (l2 < 0L)
                {
                    l1 = l;
                }
            }
_L1:
label0:
            {
                Object obj;
                long l3;
                try
                {
                    l3 = d2.a(l, i, d1.b);
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    break label0;
                }
                catch (ArithmeticException arithmeticexception)
                {
                    break label0;
                }
                if (l <= 0L || l3 >= 0L)
                {
                    l = l3;
                }
            }
            if (l1 > l)
            {
                return l;
            } else
            {
                return l1;
            }
            obj;
            l1 = l;
              goto _L1
            obj;
            l1 = l;
              goto _L1
        }

        public final long g(long l)
        {
            d d1;
            d d2;
            int i;
            l++;
            i = d;
            d1 = e;
            d2 = f;
            long l2 = d1.b(l, i, d2.b);
            long l1;
            l1 = l2;
            if (l < 0L)
            {
                l1 = l2;
                if (l2 > 0L)
                {
                    l1 = l;
                }
            }
_L1:
label0:
            {
                Object obj;
                long l3;
                try
                {
                    l3 = d2.b(l, i, d1.b);
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    break label0;
                }
                catch (ArithmeticException arithmeticexception)
                {
                    break label0;
                }
                if (l >= 0L || l3 <= 0L)
                {
                    l = l3;
                }
            }
            l3 = l;
            if (l1 > l)
            {
                l3 = l1;
            }
            return l3 - 1L;
            obj;
            l1 = l;
              goto _L1
            obj;
            l1 = l;
              goto _L1
        }

        a(String s, int i, d d1, d d2)
        {
            super(s);
            d = i;
            e = d1;
            f = d2;
        }
    }

    static final class b
    {

        final char a;
        final int b;
        final int c;
        final int d;
        private int e;
        private boolean f;

        private long d(alr alr1, long l)
        {
            if (e >= 0)
            {
                return alr1.u().b(l, e);
            } else
            {
                l = alr1.u().b(l, 1);
                l = alr1.C().a(l, 1);
                return alr1.u().a(l, e);
            }
        }

        final long a(alr alr1, long l)
        {
            long l1;
            try
            {
                l1 = d(alr1, l);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                if (b == 2 && e == 29)
                {
                    for (; !alr1.E().b(l); l = alr1.E().a(l, 1)) { }
                    return d(alr1, l);
                } else
                {
                    throw illegalargumentexception;
                }
            }
            return l1;
        }

        final long b(alr alr1, long l)
        {
            long l1;
            try
            {
                l1 = d(alr1, l);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                if (b == 2 && e == 29)
                {
                    for (; !alr1.E().b(l); l = alr1.E().a(l, -1)) { }
                    return d(alr1, l);
                } else
                {
                    throw illegalargumentexception;
                }
            }
            return l1;
        }

        final long c(alr alr1, long l)
        {
            int k;
            long l1;
            int i = alr1.t().a(l);
            k = c - i;
            l1 = l;
            if (k == 0) goto _L2; else goto _L1
_L1:
            if (!f) goto _L4; else goto _L3
_L3:
            int j;
            j = k;
            if (k < 0)
            {
                j = k + 7;
            }
_L6:
            l1 = alr1.t().a(l, j);
_L2:
            return l1;
_L4:
            j = k;
            if (k > 0)
            {
                j = k - 7;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj instanceof b)
                {
                    if (a != ((b) (obj = (b)obj)).a || b != ((b) (obj)).b || e != ((b) (obj)).e || c != ((b) (obj)).c || f != ((b) (obj)).f || d != ((b) (obj)).d)
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        b(char c1, int i, int j, int k, boolean flag, int l)
        {
            if (c1 != 'u' && c1 != 'w' && c1 != 's')
            {
                throw new IllegalArgumentException((new StringBuilder("Unknown mode: ")).append(c1).toString());
            } else
            {
                a = c1;
                b = i;
                e = j;
                c = k;
                f = flag;
                d = l;
                return;
            }
        }
    }

    static final class c extends alw
    {

        private final long d[];
        private final int e[];
        private final int f[];
        private final String g[];
        private final a h;

        static c a(DataInput datainput, String s)
        {
            Object obj;
            long al[];
            int ai[];
            int ai1[];
            String as[];
            int j;
            int l;
            int i1;
            l = datainput.readUnsignedShort();
            obj = new String[l];
            for (int i = 0; i < l; i++)
            {
                obj[i] = datainput.readUTF();
            }

            i1 = datainput.readInt();
            al = new long[i1];
            ai = new int[i1];
            ai1 = new int[i1];
            as = new String[i1];
            j = 0;
_L2:
            int k;
            if (j >= i1)
            {
                break MISSING_BLOCK_LABEL_154;
            }
            al[j] = anz.a(datainput);
            ai[j] = (int)anz.a(datainput);
            ai1[j] = (int)anz.a(datainput);
            if (l < 256)
            {
                try
                {
                    k = datainput.readUnsignedByte();
                }
                // Misplaced declaration of an exception variable
                catch (DataInput datainput)
                {
                    throw new IOException("Invalid encoding");
                }
                break MISSING_BLOCK_LABEL_204;
            }
            k = datainput.readUnsignedShort();
            break MISSING_BLOCK_LABEL_204;
            obj = null;
            if (datainput.readBoolean())
            {
                obj = new a(s, (int)anz.a(datainput), d.a(datainput), d.a(datainput));
            }
            return new c(s, al, ai, ai1, as, ((a) (obj)));
            as[j] = obj[k];
            j++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public final String a(long l)
        {
            long al[] = d;
            int i = Arrays.binarySearch(al, l);
            if (i >= 0)
            {
                return g[i];
            }
            i = ~i;
            if (i < al.length)
            {
                if (i > 0)
                {
                    return g[i - 1];
                } else
                {
                    return "UTC";
                }
            }
            if (h == null)
            {
                return g[i - 1];
            } else
            {
                return h.a(l);
            }
        }

        public final int b(long l)
        {
            long al[] = d;
            int i = Arrays.binarySearch(al, l);
            if (i >= 0)
            {
                return e[i];
            }
            i = ~i;
            if (i < al.length)
            {
                if (i > 0)
                {
                    return e[i - 1];
                } else
                {
                    return 0;
                }
            }
            if (h == null)
            {
                return e[i - 1];
            } else
            {
                return h.b(l);
            }
        }

        public final boolean c()
        {
            return false;
        }

        public final boolean equals(Object obj)
        {
            if (this != obj) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof c))
            {
                break MISSING_BLOCK_LABEL_121;
            }
            obj = (c)obj;
            if (!super.c.equals(((alw) (obj)).c) || !Arrays.equals(d, ((c) (obj)).d) || !Arrays.equals(g, ((c) (obj)).g) || !Arrays.equals(e, ((c) (obj)).e) || !Arrays.equals(f, ((c) (obj)).f))
            {
                break; /* Loop/switch isn't completed */
            }
            if (h != null) goto _L4; else goto _L3
_L3:
            if (((c) (obj)).h == null) goto _L1; else goto _L5
_L5:
            return false;
_L4:
            if (!h.equals(((c) (obj)).h)) goto _L5; else goto _L6
_L6:
            return true;
            return false;
        }

        public final long f(long l)
        {
            long al[] = d;
            int i = Arrays.binarySearch(al, l);
            long l1;
            if (i >= 0)
            {
                i++;
            } else
            {
                i = ~i;
            }
            if (i < al.length)
            {
                l1 = al[i];
            } else
            {
                l1 = l;
                if (h != null)
                {
                    long l3 = al[al.length - 1];
                    long l2 = l;
                    if (l < l3)
                    {
                        l2 = l3;
                    }
                    return h.f(l2);
                }
            }
            return l1;
        }

        public final long g(long l)
        {
            long al[];
            int i;
            al = d;
            i = Arrays.binarySearch(al, l);
            if (i < 0) goto _L2; else goto _L1
_L1:
            long l1;
            l1 = l;
            if (l > 0x8000000000000000L)
            {
                l1 = l - 1L;
            }
_L4:
            return l1;
_L2:
            i = ~i;
            if (i >= al.length)
            {
                break; /* Loop/switch isn't completed */
            }
            l1 = l;
            if (i > 0)
            {
                long l2 = al[i - 1];
                l1 = l;
                if (l2 > 0x8000000000000000L)
                {
                    return l2 - 1L;
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (h != null)
            {
                l1 = h.g(l);
                if (l1 < l)
                {
                    return l1;
                }
            }
            long l3 = al[i - 1];
            l1 = l;
            if (l3 > 0x8000000000000000L)
            {
                return l3 - 1L;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        private c(String s, long al[], int ai[], int ai1[], String as[], a a1)
        {
            super(s);
            d = al;
            e = ai;
            f = ai1;
            g = as;
            h = a1;
        }
    }

    static final class d
    {

        final String a;
        final int b;
        private b c;

        static d a(DataInput datainput)
        {
            return new d(new b((char)datainput.readUnsignedByte(), datainput.readUnsignedByte(), datainput.readByte(), datainput.readUnsignedByte(), datainput.readBoolean(), (int)anz.a(datainput)), datainput.readUTF(), (int)anz.a(datainput));
        }

        public final long a(long l, int i, int j)
        {
            b b1 = c;
            ams ams1;
            long l1;
            long l2;
            if (b1.a == 'w')
            {
                i += j;
            } else
            if (b1.a != 's')
            {
                i = 0;
            }
            l2 = (long)i + l;
            ams1 = ams.L();
            l = ams1.C().b(l2, b1.b);
            l = ams1.e().b(l, 0);
            l1 = b1.a(ams1, ams1.e().a(l, b1.d));
            if (b1.c == 0)
            {
                l = l1;
                if (l1 <= l2)
                {
                    l = b1.a(ams1, ams1.E().a(l1, 1));
                }
            } else
            {
                l1 = b1.c(ams1, l1);
                l = l1;
                if (l1 <= l2)
                {
                    l = ams1.E().a(l1, 1);
                    l = b1.c(ams1, b1.a(ams1, ams1.C().b(l, b1.b)));
                }
            }
            return l - (long)i;
        }

        public final long b(long l, int i, int j)
        {
            b b1 = c;
            ams ams1;
            long l1;
            long l2;
            if (b1.a == 'w')
            {
                i += j;
            } else
            if (b1.a != 's')
            {
                i = 0;
            }
            l2 = (long)i + l;
            ams1 = ams.L();
            l = ams1.C().b(l2, b1.b);
            l = ams1.e().b(l, 0);
            l1 = b1.b(ams1, ams1.e().a(l, b1.d));
            if (b1.c == 0)
            {
                l = l1;
                if (l1 >= l2)
                {
                    l = b1.b(ams1, ams1.E().a(l1, -1));
                }
            } else
            {
                l1 = b1.c(ams1, l1);
                l = l1;
                if (l1 >= l2)
                {
                    l = ams1.E().a(l1, -1);
                    l = b1.c(ams1, b1.b(ams1, ams1.C().b(l, b1.b)));
                }
            }
            return l - (long)i;
        }

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj instanceof d)
                {
                    if (b != ((d) (obj = (d)obj)).b || !a.equals(((d) (obj)).a) || !c.equals(((d) (obj)).c))
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        private d(b b1, String s, int i)
        {
            c = b1;
            a = s;
            b = i;
        }
    }


    static long a(DataInput datainput)
    {
        int i = datainput.readUnsignedByte();
        switch (i >> 6)
        {
        default:
            return (long)((i << 26) >> 26) * 0x1b7740L;

        case 1: // '\001'
            return (long)((i << 26) >> 2 | datainput.readUnsignedByte() << 16 | datainput.readUnsignedByte() << 8 | datainput.readUnsignedByte()) * 60000L;

        case 2: // '\002'
            return (((long)i << 58) >> 26 | (long)(datainput.readUnsignedByte() << 24) | (long)(datainput.readUnsignedByte() << 16) | (long)(datainput.readUnsignedByte() << 8) | (long)datainput.readUnsignedByte()) * 1000L;

        case 3: // '\003'
            return datainput.readLong();
        }
    }

    public static alw a(DataInput datainput, String s)
    {
        switch (datainput.readUnsignedByte())
        {
        default:
            throw new IOException("Invalid encoding");

        case 70: // 'F'
            s = new anB(s, datainput.readUTF(), (int)a(datainput), (int)a(datainput));
            datainput = s;
            if (s.equals(alw.a))
            {
                datainput = alw.a;
            }
            return datainput;

        case 67: // 'C'
            return any.a(c.a(datainput, s));

        case 80: // 'P'
            return c.a(datainput, s);
        }
    }
}
