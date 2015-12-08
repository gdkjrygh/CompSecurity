// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;


// Referenced classes of package com.google.android.m4b.maps.bk:
//            g, a

class m
{

    protected a a;
    protected int b[];
    int c;

    protected m(a a1)
    {
        a = a1;
        b = new int[4];
        c = 0;
    }

    protected m(a a1, int ai[])
    {
        a = a1;
        b = ai;
        c = ai.length;
    }

    protected m(double ad[])
    {
        a = com.google.android.m4b.maps.bk.g.a(ad);
        b = new int[4];
        c = 0;
    }

    private int n(int i1)
    {
        return a.h(j(i1 - 1));
    }

    private int o(int i1)
    {
        if (c == 0)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        int j1 = i1 % c;
        i1 = j1;
        if (j1 < 0)
        {
            i1 = j1 + c;
        }
        return i1;
    }

    private int p(int i1)
    {
        if (i1 == -1)
        {
            return -1;
        } else
        {
            return a.h(i1);
        }
    }

    private void q(int i1)
    {
        int j1 = c;
        if (b.length < j1 + i1)
        {
            int ai[] = new int[c + Math.max(i1, (int)((double)b.length * 1.5D + 1.0D))];
            System.arraycopy(b, 0, ai, 0, b.length);
            b = ai;
        }
    }

    public final double a(int i1, int j1, int k1)
    {
        return a.a(i1, j1, k1);
    }

    public void a()
    {
        c = 0;
    }

    public void a(int i1)
    {
        System.arraycopy(b, i1 + 1, b, i1, c - i1 - 1);
        c = c - 1;
    }

    protected boolean a(Object obj)
    {
        return obj instanceof m;
    }

    public final double b(int i1)
    {
        return a.a(i1);
    }

    public final double b(int i1, int j1, int k1)
    {
        return -((a.a(b[i1]) - a.a(b[j1])) * (a.b(b[k1]) - a.b(b[j1])) - (a.b(b[i1]) - a.b(b[j1])) * (a.a(b[k1]) - a.a(b[j1]))) / 2D;
    }

    public void b()
    {
        c = c - 1;
    }

    public transient void b(int ai[])
    {
        q(ai.length);
        int j1 = ai.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            int k1 = ai[i1];
            b[c] = p(k1);
            c = c + 1;
        }

    }

    public final double c(int i1)
    {
        return a.b(i1);
    }

    public final double c(int i1, int j1, int k1)
    {
        a a1 = a;
        double d1 = a1.a(i1);
        double d2 = a1.a(j1);
        double d3 = a1.b(k1);
        double d4 = a1.b(j1);
        double d5 = a1.b(i1);
        double d6 = a1.b(j1);
        return -((d1 - d2) * (d3 - d4) - (a1.a(k1) - a1.a(j1)) * (d5 - d6)) / 2D;
    }

    public final m c()
    {
        return new m(a);
    }

    public final int d()
    {
        return a.a();
    }

    public final int d(int i1)
    {
        return a.c(i1);
    }

    public final int e()
    {
        return a.a;
    }

    public final int e(int i1)
    {
        return a.d(i1);
    }

    public void e(int i1, int j1)
    {
        q(1);
        System.arraycopy(b, i1, b, i1 + 1, c - i1);
        b[i1] = p(j1);
        c = c + 1;
    }

    public boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int ai[];
        int ai1[];
        int i1;
        int j1;
        if (!(obj instanceof m))
        {
            return false;
        }
        obj = (m)obj;
        if (!((m) (obj)).a(this) || !a.equals(((m) (obj)).a))
        {
            break; /* Loop/switch isn't completed */
        }
        ai = b;
        j1 = c;
        ai1 = ((m) (obj)).b;
        int k1 = ((m) (obj)).c;
        i1 = j1;
        if (j1 == -1)
        {
            i1 = ai.length;
        }
        j1 = k1;
        if (k1 == -1)
        {
            j1 = ai1.length;
        }
        if (i1 == j1 && ai != null && ai1 != null && ai.length >= i1 && ai1.length >= i1) goto _L4; else goto _L3
_L3:
        i1 = 0;
_L6:
        if (i1 != 0) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        j1 = 0;
_L7:
label0:
        {
            if (j1 >= i1)
            {
                break MISSING_BLOCK_LABEL_168;
            }
            if (ai[j1] == ai1[j1])
            {
                break label0;
            }
            i1 = 0;
        }
          goto _L6
        j1++;
          goto _L7
        i1 = 1;
          goto _L6
        if (true) goto _L1; else goto _L8
_L8:
    }

    public final int f()
    {
        return a.h(j(c - 2));
    }

    public final a.b f(int i1)
    {
        return a.e(i1);
    }

    public void f(int i1, int j1)
    {
        b[o(i1)] = p(j1);
    }

    public final double g(int i1)
    {
        return a.a(j(i1));
    }

    public final int g(int i1, int j1)
    {
        return a.a(i1, j1);
    }

    public final double h(int i1)
    {
        return a.b(j(i1));
    }

    public final int h(int i1, int j1)
    {
        i1 = a.h(i1);
        for (; j1 < c; j1++)
        {
            if (j(j1) == i1)
            {
                return j1;
            }
        }

        return -1;
    }

    public int hashCode()
    {
        int ai[];
        int k1;
        int l1;
        int i2;
        k1 = 0;
        l1 = a.hashCode();
        ai = b;
        i2 = c;
        if (ai != null) goto _L2; else goto _L1
_L1:
        return k1 * 31 + l1;
_L2:
        int i1 = 1;
        int j1 = 0;
        do
        {
            k1 = i1;
            if (j1 >= i2)
            {
                continue;
            }
            k1 = ai[j1];
            j1++;
            i1 = k1 + i1 * 31;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean i(int i1)
    {
        return j(i1) == -1;
    }

    public final boolean i(int i1, int j1)
    {
        return a.h(j(j1)) == a.h(i1);
    }

    public final int j(int i1)
    {
        return b[o(i1)];
    }

    public final boolean k(int i1)
    {
        return n(i1) == a.d(j(i1));
    }

    public final boolean l(int i1)
    {
        return n(i1) == a.c(j(i1));
    }

    final String m(int i1)
    {
        int k1 = c - 1;
        if (k1 == -1)
        {
            return "[]";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('[');
        int j1 = 0;
        do
        {
            stringbuilder.append(String.format((new StringBuilder(13)).append("%").append(i1).append("s").toString(), new Object[] {
                Integer.valueOf(b[j1])
            }));
            if (j1 == k1)
            {
                return stringbuilder.append(']').toString();
            }
            stringbuilder.append(", ");
            j1++;
        } while (true);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{");
        stringbuilder.append(m(5));
        stringbuilder.append(",");
        stringbuilder.append(c);
        stringbuilder.append(",\n");
        stringbuilder.append(a);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
