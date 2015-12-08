// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            z, m, f, d, 
//            e

public final class x
{
    public static final class a
    {

        private int a;
        private int b[];
        private Object c[];
        private boolean d;

        final void a()
        {
            if (d)
            {
                throw new IllegalStateException("Do not reuse UnknownFieldSetLite Builders.");
            } else
            {
                return;
            }
        }

        final void a(int i, Object obj)
        {
            if (a == b.length)
            {
                int j;
                if (a < 4)
                {
                    j = 8;
                } else
                {
                    j = a >> 1;
                }
                j += a;
                b = Arrays.copyOf(b, j);
                c = Arrays.copyOf(c, j);
            }
            b[a] = i;
            c[a] = obj;
            a = a + 1;
        }

        public final boolean a(int i, e e1)
        {
            a();
            int j = z.b(i);
            switch (z.a(i))
            {
            default:
                throw m.f();

            case 0: // '\0'
                a(i, Long.valueOf(e1.f()));
                return true;

            case 5: // '\005'
                a(i, Integer.valueOf(e1.g()));
                return true;

            case 1: // '\001'
                a(i, Long.valueOf(e1.h()));
                return true;

            case 2: // '\002'
                a(i, e1.d());
                return true;

            case 3: // '\003'
                a a1 = x.b();
                int k;
                do
                {
                    k = e1.a();
                } while (k != 0 && a1.a(k, e1));
                e1.a(z.a(j, 4));
                a(i, a1.b());
                return true;

            case 4: // '\004'
                return false;
            }
        }

        public final x b()
        {
            if (d)
            {
                throw new IllegalStateException("Do not reuse UnknownFieldSetLite Builders.");
            }
            d = true;
            if (a == 0)
            {
                return x.f();
            } else
            {
                return new x(a, b, c, (byte)0);
            }
        }

        private a()
        {
            a = 0;
            b = x.d();
            c = x.e();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final int a[];
    private static final Object b[];
    private static final x c;
    private int d;
    private int e[];
    private Object f[];
    private int g;

    private x(int i, int ai[], Object aobj[])
    {
        g = -1;
        d = i;
        e = ai;
        f = aobj;
    }

    x(int i, int ai[], Object aobj[], byte byte0)
    {
        this(i, ai, aobj);
    }

    public static x a()
    {
        return c;
    }

    static x a(x x1, x x2)
    {
        int i = x1.d + x2.d;
        int ai[] = Arrays.copyOf(x1.e, i);
        System.arraycopy(x2.e, 0, ai, x1.d, x2.d);
        Object aobj[] = Arrays.copyOf(x1.f, i);
        System.arraycopy(((Object) (x2.f)), 0, ((Object) (aobj)), x1.d, x2.d);
        return new x(i, ai, aobj);
    }

    public static a b()
    {
        return new a((byte)0);
    }

    static int[] d()
    {
        return a;
    }

    static Object[] e()
    {
        return b;
    }

    static x f()
    {
        return c;
    }

    public final void a(f f1)
    {
        int i = 0;
_L8:
        int j;
        int k;
        if (i >= d)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        k = e[i];
        j = z.b(k);
        z.a(k);
        JVM INSTR tableswitch 0 5: default 68
    //                   0 72
    //                   1 134
    //                   2 154
    //                   3 171
    //                   4 68
    //                   5 105;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6
_L5:
        break MISSING_BLOCK_LABEL_171;
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        throw m.f();
_L2:
        long l1 = ((Long)f[i]).longValue();
        f1.a(j, 0);
        f1.d(l1);
_L9:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        int l = ((Integer)f[i]).intValue();
        f1.a(j, 5);
        f1.l(l);
          goto _L9
_L3:
        f1.a(j, ((Long)f[i]).longValue());
          goto _L9
_L4:
        f1.a(j, (d)f[i]);
          goto _L9
        f1.a(j, 3);
        ((x)f[i]).a(f1);
        f1.a(j, 4);
          goto _L9
    }

    public final int c()
    {
        int i;
        int j;
        i = g;
        if (i != -1)
        {
            return i;
        }
        j = 0;
        i = 0;
_L8:
        int k;
        int i1;
        if (j >= d)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        k = e[j];
        i1 = z.b(k);
        z.a(k);
        JVM INSTR tableswitch 0 5: default 80
    //                   0 91
    //                   1 142
    //                   2 166
    //                   3 186
    //                   4 80
    //                   5 118;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6
_L5:
        break MISSING_BLOCK_LABEL_186;
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalStateException(m.f());
_L2:
        i += com.google.android.m4b.maps.ct.f.b(i1, ((Long)f[j]).longValue());
_L9:
        j++;
        if (true) goto _L8; else goto _L7
_L7:
        ((Integer)f[j]).intValue();
        i += com.google.android.m4b.maps.ct.f.c(i1);
          goto _L9
_L3:
        ((Long)f[j]).longValue();
        i += com.google.android.m4b.maps.ct.f.b(i1);
          goto _L9
_L4:
        i += com.google.android.m4b.maps.ct.f.b(i1, (d)f[j]);
          goto _L9
        int l = com.google.android.m4b.maps.ct.f.i(i1);
        i += ((x)f[j]).c() + l * 2;
          goto _L9
        g = i;
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof x))
            {
                return false;
            }
            obj = (x)obj;
            if (d != ((x) (obj)).d || !Arrays.equals(e, ((x) (obj)).e) || !Arrays.deepEquals(f, ((x) (obj)).f))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return ((d + 527) * 31 + Arrays.hashCode(e)) * 31 + Arrays.deepHashCode(f);
    }

    static 
    {
        a = new int[0];
        b = new Object[0];
        c = new x(0, a, b);
    }
}
