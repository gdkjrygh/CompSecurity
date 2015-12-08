// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class gqq
{

    public static final gqq a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    private final int k;
    private final boolean l;
    private String m;

    private gqq(gqr gqr1)
    {
        b = gqr1.a;
        c = gqr1.b;
        d = gqr1.c;
        k = -1;
        e = false;
        f = false;
        g = false;
        h = gqr1.d;
        i = gqr1.e;
        j = gqr1.f;
        l = false;
    }

    gqq(gqr gqr1, byte byte0)
    {
        this(gqr1);
    }

    private gqq(boolean flag, boolean flag1, int i1, int j1, boolean flag2, boolean flag3, boolean flag4, 
            int k1, int l1, boolean flag5, boolean flag6, String s)
    {
        b = flag;
        c = flag1;
        d = i1;
        k = j1;
        e = flag2;
        f = flag3;
        g = flag4;
        h = k1;
        i = l1;
        j = flag5;
        l = flag6;
        m = s;
    }

    public static gqq a(grh grh1)
    {
        String s;
        int i1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int i4;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        flag4 = false;
        j2 = -1;
        i2 = -1;
        flag6 = false;
        flag5 = false;
        flag3 = false;
        l1 = -1;
        k1 = -1;
        flag2 = false;
        flag1 = false;
        i1 = 1;
        i4 = grh1.a.length / 2;
        k2 = 0;
        s = null;
        flag = false;
_L1:
        String s1;
        int j1;
        int i3;
        int j3;
        int k3;
        int l3;
        boolean flag7;
        boolean flag8;
        boolean flag9;
        boolean flag10;
        boolean flag11;
        boolean flag12;
        boolean flag13;
        if (k2 < i4)
        {
            s1 = grh1.a(k2);
            String s2 = grh1.b(k2);
            int l2;
            if (s1.equalsIgnoreCase("Cache-Control"))
            {
                if (s != null)
                {
                    i1 = 0;
                } else
                {
                    s = s2;
                }
            } else
            {
label0:
                {
                    if (!s1.equalsIgnoreCase("Pragma"))
                    {
                        break label0;
                    }
                    i1 = 0;
                }
            }
            l2 = 0;
            do
            {
                s1 = s;
                flag13 = flag4;
                l3 = j2;
                k3 = i2;
                flag12 = flag6;
                flag11 = flag5;
                flag10 = flag3;
                j3 = l1;
                i3 = k1;
                flag9 = flag2;
                flag8 = flag1;
                j1 = i1;
                flag7 = flag;
                if (l2 >= s2.length())
                {
                    break;
                }
                j1 = gtz.a(s2, l2, "=,;");
                String s3 = s2.substring(l2, j1).trim();
                if (j1 == s2.length() || s2.charAt(j1) == ',' || s2.charAt(j1) == ';')
                {
                    j1++;
                    s1 = null;
                } else
                {
                    l2 = gtz.a(s2, j1 + 1);
                    if (l2 < s2.length() && s2.charAt(l2) == '"')
                    {
                        j1 = l2 + 1;
                        l2 = gtz.a(s2, j1, "\"");
                        s1 = s2.substring(j1, l2);
                        j1 = l2 + 1;
                    } else
                    {
                        j1 = gtz.a(s2, l2, ",;");
                        s1 = s2.substring(l2, j1).trim();
                    }
                }
                if ("no-cache".equalsIgnoreCase(s3))
                {
                    flag = true;
                    l2 = j1;
                } else
                if ("no-store".equalsIgnoreCase(s3))
                {
                    flag4 = true;
                    l2 = j1;
                } else
                if ("max-age".equalsIgnoreCase(s3))
                {
                    j2 = gtz.b(s1, -1);
                    l2 = j1;
                } else
                if ("s-maxage".equalsIgnoreCase(s3))
                {
                    i2 = gtz.b(s1, -1);
                    l2 = j1;
                } else
                if ("private".equalsIgnoreCase(s3))
                {
                    flag6 = true;
                    l2 = j1;
                } else
                if ("public".equalsIgnoreCase(s3))
                {
                    flag5 = true;
                    l2 = j1;
                } else
                if ("must-revalidate".equalsIgnoreCase(s3))
                {
                    flag3 = true;
                    l2 = j1;
                } else
                if ("max-stale".equalsIgnoreCase(s3))
                {
                    l1 = gtz.b(s1, 0x7fffffff);
                    l2 = j1;
                } else
                if ("min-fresh".equalsIgnoreCase(s3))
                {
                    k1 = gtz.b(s1, -1);
                    l2 = j1;
                } else
                if ("only-if-cached".equalsIgnoreCase(s3))
                {
                    flag2 = true;
                    l2 = j1;
                } else
                {
                    l2 = j1;
                    if ("no-transform".equalsIgnoreCase(s3))
                    {
                        flag1 = true;
                        l2 = j1;
                    }
                }
            } while (true);
            break MISSING_BLOCK_LABEL_611;
        } else
        {
            if (i1 == 0)
            {
                grh1 = null;
            } else
            {
                grh1 = s;
            }
            return new gqq(flag, flag4, j2, i2, flag6, flag5, flag3, l1, k1, flag2, flag1, grh1);
        }
        flag7 = flag;
        j1 = i1;
        flag8 = flag1;
        flag9 = flag2;
        i3 = k1;
        j3 = l1;
        flag10 = flag3;
        flag11 = flag5;
        flag12 = flag6;
        k3 = i2;
        l3 = j2;
        flag13 = flag4;
        s1 = s;
        k2++;
        flag = flag7;
        s = s1;
        flag4 = flag13;
        j2 = l3;
        i2 = k3;
        flag6 = flag12;
        flag5 = flag11;
        flag3 = flag10;
        l1 = j3;
        k1 = i3;
        flag2 = flag9;
        flag1 = flag8;
        i1 = j1;
          goto _L1
    }

    public final int a()
    {
        return d;
    }

    public final String toString()
    {
        Object obj = m;
        if (obj != null)
        {
            return ((String) (obj));
        }
        obj = new StringBuilder();
        if (b)
        {
            ((StringBuilder) (obj)).append("no-cache, ");
        }
        if (c)
        {
            ((StringBuilder) (obj)).append("no-store, ");
        }
        if (d != -1)
        {
            ((StringBuilder) (obj)).append("max-age=").append(d).append(", ");
        }
        if (k != -1)
        {
            ((StringBuilder) (obj)).append("s-maxage=").append(k).append(", ");
        }
        if (e)
        {
            ((StringBuilder) (obj)).append("private, ");
        }
        if (f)
        {
            ((StringBuilder) (obj)).append("public, ");
        }
        if (g)
        {
            ((StringBuilder) (obj)).append("must-revalidate, ");
        }
        if (h != -1)
        {
            ((StringBuilder) (obj)).append("max-stale=").append(h).append(", ");
        }
        if (i != -1)
        {
            ((StringBuilder) (obj)).append("min-fresh=").append(i).append(", ");
        }
        if (j)
        {
            ((StringBuilder) (obj)).append("only-if-cached, ");
        }
        if (l)
        {
            ((StringBuilder) (obj)).append("no-transform, ");
        }
        if (((StringBuilder) (obj)).length() == 0)
        {
            obj = "";
        } else
        {
            ((StringBuilder) (obj)).delete(((StringBuilder) (obj)).length() - 2, ((StringBuilder) (obj)).length());
            obj = ((StringBuilder) (obj)).toString();
        }
        m = ((String) (obj));
        return ((String) (obj));
    }

    static 
    {
        gqr gqr1 = new gqr();
        gqr1.a = true;
        gqr1.c();
        gqr1 = new gqr();
        gqr1.f = true;
        long l1 = TimeUnit.SECONDS.toSeconds(0x7fffffffL);
        int i1;
        if (l1 > 0x7fffffffL)
        {
            i1 = 0x7fffffff;
        } else
        {
            i1 = (int)l1;
        }
        gqr1.d = i1;
        a = gqr1.c();
    }
}
