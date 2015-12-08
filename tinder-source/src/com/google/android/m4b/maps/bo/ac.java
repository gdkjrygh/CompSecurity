// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import java.io.DataInput;
import java.util.ArrayList;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            af, g, am, ar, 
//            m, ah, bd

public class ac
    implements Comparable
{

    public final int a;
    public final int b;
    public final int c;
    public final af d;
    public final int e;
    public final int f;
    final int g;
    private ac h;
    private m i;

    public ac(int j, int k, int l)
    {
        this(j, k, l, null);
    }

    public ac(int j, int k, int l, af af1)
    {
        h = null;
        a = j;
        b = k;
        c = l;
        af af2 = af1;
        if (af1 == null)
        {
            af2 = new af();
        }
        d = af2;
        g = 18 - j;
        j = 0x40000000 >> j;
        e = b * j - 0x20000000;
        f = -(j * (c + 1) - 0x20000000);
    }

    private static ac a(int j, int k, int l, af af1)
    {
        boolean flag = false;
        if (j <= 0)
        {
            return new ac(0, 0, 0);
        }
        int i1 = j;
        if (j > 30)
        {
            i1 = 30;
        }
        j = 30 - i1;
        k = k + 0x20000000 >> j;
        l = -l + 0x20000000 >> j;
        int j1 = 1 << i1;
        if (k < 0)
        {
            j = k + j1;
        } else
        {
            j = k;
            if (k >= j1)
            {
                j = k - j1;
            }
        }
        if (l < 0)
        {
            k = ((flag) ? 1 : 0);
        } else
        if (l >= j1)
        {
            k = j1 - 1;
        } else
        {
            k = l;
        }
        return new ac(i1, j, k, af1);
    }

    public static ac a(g g1)
    {
        int l;
        int i1;
        l = g1.a;
        int j = g1.b;
        if (j <= 0xe0000000 || j > 0x20000000)
        {
            return null;
        }
        l = l + 0x20000000 >> 0;
        i1 = -j;
        if (l >= 0) goto _L2; else goto _L1
_L1:
        int k = l + 0x40000000;
_L4:
        return new ac(30, k, i1 + 0x20000000 >> 0);
_L2:
        k = l;
        if (l >= 0x40000000)
        {
            k = l - 0x40000000;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static ac a(DataInput datainput)
    {
        return new ac(am.a(datainput), am.a(datainput), am.a(datainput));
    }

    public static ArrayList a(ar ar1)
    {
        return a(ar1, 15, ((af) (null)));
    }

    public static ArrayList a(ar ar1, int j)
    {
        Object obj;
        int k;
        int i1;
        int l2;
        int i3;
        obj = b(j, ar1.b.a, ar1.c.b);
        ar1 = b(j, ar1.c.a - 1, ar1.b.b + 1);
        i1 = ((ac) (obj)).b;
        k = ((ac) (obj)).c;
        l2 = ((ac) (ar1)).b;
        i3 = ((ac) (ar1)).c;
        if (com.google.android.m4b.maps.bo.g.e(((ac) (obj)).e, ((ac) (obj)).f) || com.google.android.m4b.maps.bo.g.e(((ac) (ar1)).e, ((ac) (ar1)).f)) goto _L2; else goto _L1
_L1:
        ar1 = new ArrayList();
_L7:
        return ar1;
_L2:
        int l;
        l = 1 << j;
        obj = new ArrayList();
        if (i1 > l2)
        {
            for (; i1 < l; i1++)
            {
                for (int j1 = k; j1 < 0; j1++)
                {
                    ((ArrayList) (obj)).add(new ac(j, i1, j1, null));
                }

                for (int k1 = l; k1 <= i3; k1++)
                {
                    ((ArrayList) (obj)).add(new ac(j, i1, k1, null));
                }

            }

            i1 = 0;
            do
            {
                ar1 = ((ar) (obj));
                if (i1 > l2)
                {
                    continue; /* Loop/switch isn't completed */
                }
                for (int l1 = k; l1 < 0; l1++)
                {
                    ((ArrayList) (obj)).add(new ac(j, i1, l1, null));
                }

                for (int i2 = l; i2 <= i3; i2++)
                {
                    ((ArrayList) (obj)).add(new ac(j, i1, i2, null));
                }

                i1++;
            } while (true);
        }
_L5:
        ar1 = ((ar) (obj));
        if (i1 > l2)
        {
            continue; /* Loop/switch isn't completed */
        }
        for (int j2 = k; j2 < 0; j2++)
        {
            ((ArrayList) (obj)).add(new ac(j, i1, j2, null));
        }

        int k2 = l;
        while (k2 <= i3) 
        {
            ((ArrayList) (obj)).add(new ac(j, i1, k2, null));
            k2++;
        }
        if (true) goto _L4; else goto _L3
_L4:
        i1++;
        if (true) goto _L5; else goto _L3
_L3:
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static ArrayList a(ar ar1, int j, af af1)
    {
        boolean flag = false;
        if (j >= 0) goto _L2; else goto _L1
_L1:
        ar1 = new ArrayList(0);
_L4:
        return ar1;
_L2:
        ArrayList arraylist;
        int k;
        int l;
        int i2;
        int j2;
        int k2;
        ac ac1 = a(j, ar1.b.a, ar1.c.b, af1);
        ac ac2 = a(j, ar1.c.a - 1, ar1.b.b + 1, af1);
        l = ac1.b;
        k = ac1.c;
        i2 = ac2.b;
        j2 = ac2.c;
        k2 = 1 << j;
        int k1;
        if (l > i2)
        {
            k1 = ((k2 - l) + i2 + 1) * ((j2 - k) + 1);
        } else
        {
            k1 = ((i2 - l) + 1) * ((j2 - k) + 1);
        }
        if (k1 < 0)
        {
            return new ArrayList();
        }
        arraylist = new ArrayList(k1);
        if (k1 > 2)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(ac1);
        ar1 = arraylist;
        if (k1 == 2)
        {
            arraylist.add(ac2);
            return arraylist;
        }
        if (true) goto _L4; else goto _L3
_L3:
        int l1 = l;
        if (l <= i2) goto _L6; else goto _L5
_L5:
        do
        {
            l1 = ((flag) ? 1 : 0);
            if (l >= k2)
            {
                break;
            }
            for (l1 = k; l1 <= j2; l1++)
            {
                arraylist.add(new ac(j, l, l1, af1));
            }

            l++;
        } while (true);
        do
        {
            ar1 = arraylist;
            if (l1 > i2)
            {
                continue; /* Loop/switch isn't completed */
            }
            int i1 = k;
            while (i1 <= j2) 
            {
                arraylist.add(new ac(j, l1, i1, af1));
                i1++;
            }
            if (true)
            {
                l1++;
            } else
            {
                break;
            }
        } while (true);
_L8:
        l1++;
_L6:
        ar1 = arraylist;
        if (l1 > i2)
        {
            continue; /* Loop/switch isn't completed */
        }
        int j1 = k;
        while (j1 <= j2) 
        {
            arraylist.add(new ac(j, l1, j1, af1));
            j1++;
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L4; else goto _L9
_L9:
    }

    private static ac b(int j, int k, int l)
    {
        if (j <= 0)
        {
            return new ac(0, 0, 0);
        }
        int i1 = j;
        if (j > 30)
        {
            i1 = 30;
        }
        j = 30 - i1;
        return new ac(i1, k + 0x20000000 >> j, -l + 0x20000000 >> j, null);
    }

    public static ac b(g g1)
    {
        return a(15, g1.a, g1.b, null);
    }

    public final ac a()
    {
        if (h == null)
        {
            h = new ac(a, b, c, null);
        }
        return h;
    }

    public final ac a(int j)
    {
        int k = a - j;
        if (k <= 0)
        {
            return this;
        } else
        {
            return a(j, b >> k, c >> k);
        }
    }

    public final ac a(int j, int k, int l)
    {
        return new ac(j, k, l, d);
    }

    public ac a(af af1)
    {
        return new ac(a, b, c, af1);
    }

    public final ac a(ah ah)
    {
        return a(d.a(ah));
    }

    public final bd a(bd.a a1)
    {
        return d.a(a1);
    }

    public final g b()
    {
        return new g(e, f);
    }

    public final g c()
    {
        int j = 0x40000000 >> a;
        return new g(e + j, j + f);
    }

    public int compareTo(Object obj)
    {
        obj = (ac)obj;
        if (a == ((ac) (obj)).a)
        {
            if (b == ((ac) (obj)).b)
            {
                if (c == ((ac) (obj)).c)
                {
                    return d.a(((ac) (obj)).d);
                } else
                {
                    return c - ((ac) (obj)).c;
                }
            } else
            {
                return b - ((ac) (obj)).b;
            }
        } else
        {
            return a - ((ac) (obj)).a;
        }
    }

    public final m d()
    {
        if (i == null)
        {
            int j = 0x40000000 >> a;
            i = new m(new g(e, f), new g(e + j, j + f));
        }
        return i;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof ac)
            {
                obj = (ac)obj;
                flag = flag1;
                if (b == ((ac) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((ac) (obj)).c)
                    {
                        flag = flag1;
                        if (a == ((ac) (obj)).a)
                        {
                            return d.equals(((ac) (obj)).d);
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        int k = (a * 31 + b) * 31 + c;
        int j = k;
        if (!d.b())
        {
            j = k * 31 + d.hashCode();
        }
        return j;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("[");
        stringbuilder.append(a).append(",").append(b).append(",").append(c).append(",").append(d).append("]");
        return stringbuilder.toString();
    }
}
