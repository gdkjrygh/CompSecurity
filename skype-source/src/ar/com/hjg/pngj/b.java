// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;

import ar.com.hjg.pngj.chunks.d;

// Referenced classes of package ar.com.hjg.pngj:
//            w, v

public abstract class b
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(ar/com/hjg/pngj/b$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("BUFFER", 0);
            b = new a("PROCESS", 1);
            c = new a("SKIP", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public final a a;
    protected int b;
    private final d c;
    private boolean d;
    private int e;

    public b(int i, String s, long l, a a1)
    {
        boolean flag1 = false;
        super();
        b = 0;
        e = 0;
        if (a1 == null || s.length() != 4 || i < 0)
        {
            throw new w((new StringBuilder("Bad chunk paramenters: ")).append(a1).toString());
        }
        a = a1;
        boolean flag;
        if (a1 == a.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = new d(i, s, flag);
        c.a(l);
        if (a1 == a.c)
        {
            flag = flag1;
        } else
        {
            flag = true;
        }
        d = flag;
    }

    public final int a(byte abyte0[], int i, int j)
    {
        int i1;
        if (j == 0)
        {
            return 0;
        }
        if (j < 0)
        {
            throw new v("negative length??");
        }
        if (b == 0 && e == 0 && d)
        {
            c.a(c.b, 0, 4);
        }
        int k = c.a - b;
        i1 = k;
        if (k > j)
        {
            i1 = j;
        }
        if (i1 > 0) goto _L2; else goto _L1
_L1:
        int l;
        int j1;
        j1 = i;
        l = j;
        if (e != 0) goto _L3; else goto _L2
_L2:
        if (d && a != a.a && i1 > 0)
        {
            c.a(abyte0, i, i1);
        }
        if (a != a.a) goto _L5; else goto _L4
_L4:
        if (c.d != abyte0 && i1 > 0)
        {
            System.arraycopy(abyte0, i, c.d, b, i1);
        }
_L7:
        b = b + i1;
        j1 = i + i1;
        l = j - i1;
_L3:
        j = 0;
        if (b == c.a)
        {
            j = 4 - e;
            i = j;
            if (j > l)
            {
                i = l;
            }
            j = i;
            if (i > 0)
            {
                if (abyte0 != c.e)
                {
                    System.arraycopy(abyte0, j1, c.e, e, i);
                }
                e = e + i;
                j = i;
                if (e == 4)
                {
                    if (d)
                    {
                        if (a == a.a)
                        {
                            c.a(c.d, 0, c.a);
                        }
                        c.a();
                    }
                    d();
                    j = i;
                }
            }
        }
        return i1 + j;
_L5:
        if (a == a.b)
        {
            b(abyte0, i, i1);
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final d a()
    {
        return c;
    }

    protected abstract void b(byte abyte0[], int i, int j);

    public final boolean b()
    {
        return e == 4;
    }

    public final void c()
    {
        d = false;
    }

    protected abstract void d();

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (b)obj;
        if (c != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((b) (obj)).c == null) goto _L1; else goto _L3
_L3:
        return false;
        if (c.equals(((b) (obj)).c)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int i;
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.hashCode();
        }
        return i + 31;
    }

    public String toString()
    {
        return c.toString();
    }
}
