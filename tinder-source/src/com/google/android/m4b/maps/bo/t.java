// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import java.io.DataInput;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            z, y, s, d, 
//            am, bf

public final class t
{

    private static final int h[];
    private static t i;
    final int a;
    public final int b[];
    public final s c[];
    public final z d;
    public final y e;
    public final s f;
    final bf g;
    private final int j;

    public t(int k, int l, int ai[], s as[], z z1, y y1, s s1, 
            bf bf1)
    {
        j = k;
        a = l;
        b = ai;
        c = as;
        d = z1;
        e = y1;
        f = s1;
        g = bf1;
    }

    public static t a()
    {
        return i;
    }

    public static t a(int k, DataInput datainput, int l)
    {
        boolean flag = false;
        int k1 = datainput.readUnsignedByte();
        int ai[];
        if (com.google.android.m4b.maps.bo.d.a(k1, 1))
        {
            int l1 = am.a(datainput);
            int ai1[] = new int[l1];
            int i1 = 0;
            do
            {
                ai = ai1;
                if (i1 >= l1)
                {
                    break;
                }
                ai1[i1] = datainput.readInt();
                i1++;
            } while (true);
        } else
        {
            ai = null;
        }
        s as[];
        if (com.google.android.m4b.maps.bo.d.a(k1, 2))
        {
            int i2 = am.a(datainput);
            s as1[] = new s[i2];
            int j1 = ((flag) ? 1 : 0);
            do
            {
                as = as1;
                if (j1 >= i2)
                {
                    break;
                }
                as1[j1] = s.a(datainput);
                j1++;
            } while (true);
        } else
        {
            as = null;
        }
        z z1;
        y y1;
        s s1;
        if (com.google.android.m4b.maps.bo.d.a(k1, 4))
        {
            z1 = z.a(datainput);
        } else
        {
            z1 = null;
        }
        if (com.google.android.m4b.maps.bo.d.a(k1, 8))
        {
            y1 = y.a(datainput);
        } else
        {
            y1 = null;
        }
        if (com.google.android.m4b.maps.bo.d.a(k1, 16))
        {
            s1 = s.a(datainput);
        } else
        {
            s1 = null;
        }
        if (l == 11 && com.google.android.m4b.maps.bo.d.a(k1, 32))
        {
            datainput = new bf(datainput.readUTF(), datainput.readUnsignedByte());
        } else
        {
            datainput = null;
        }
        return new t(k, k1, ai, as, z1, y1, s1, datainput);
    }

    private static void a(String s1, int ai[], StringBuilder stringbuilder)
    {
        stringbuilder.append(s1).append("=");
        if (ai == null)
        {
            stringbuilder.append(ai);
            return;
        }
        stringbuilder.append("[");
        boolean flag = true;
        int l = ai.length;
        int k = 0;
        while (k < l) 
        {
            int i1 = ai[k];
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(Integer.toHexString(i1));
            k++;
        }
        stringbuilder.append("]");
    }

    public final int b()
    {
        if (c == null)
        {
            return 0;
        } else
        {
            return c.length;
        }
    }

    public final int c()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.length;
        }
    }

    public final boolean d()
    {
        return com.google.android.m4b.maps.bo.d.a(a, 2);
    }

    public final boolean e()
    {
        return com.google.android.m4b.maps.bo.d.a(a, 4);
    }

    public final boolean equals(Object obj)
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
        obj = (t)obj;
        if (f == null)
        {
            if (((t) (obj)).f != null)
            {
                return false;
            }
        } else
        if (!f.equals(((t) (obj)).f))
        {
            return false;
        }
        if (a != ((t) (obj)).a)
        {
            return false;
        }
        if (!Arrays.equals(b, ((t) (obj)).b))
        {
            return false;
        }
        if (j != ((t) (obj)).j)
        {
            return false;
        }
        if (!Arrays.equals(c, ((t) (obj)).c))
        {
            return false;
        }
        if (e == null)
        {
            if (((t) (obj)).e != null)
            {
                return false;
            }
        } else
        if (!e.equals(((t) (obj)).e))
        {
            return false;
        }
        if (d != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((t) (obj)).d == null) goto _L1; else goto _L3
_L3:
        return false;
        if (d.equals(((t) (obj)).d)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final boolean f()
    {
        return com.google.android.m4b.maps.bo.d.a(a, 8);
    }

    public final int hashCode()
    {
        int i1 = 0;
        int k;
        int l;
        int j1;
        int k1;
        int l1;
        int i2;
        if (f == null)
        {
            k = 0;
        } else
        {
            k = f.hashCode();
        }
        j1 = a;
        k1 = Arrays.hashCode(b);
        l1 = j;
        i2 = Arrays.hashCode(c);
        if (e == null)
        {
            l = 0;
        } else
        {
            l = e.hashCode();
        }
        if (d != null)
        {
            i1 = d.hashCode();
        }
        return (l + (((((k + 31) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31) * 31 + i1;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Style{id=").append(j).append(", ");
        a("fillColors", b, stringbuilder);
        stringbuilder.append(", ");
        StringBuilder stringbuilder1 = stringbuilder.append(", components=").append(a).append(", strokes=");
        java.util.List list;
        if (c == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(c);
        }
        stringbuilder1.append(list).append(", textStyle=").append(d).append(", textBoxStyle=").append(e).append(", arrowStyle=").append(f).append(", icon=").append(g).append('}');
        return stringbuilder.toString();
    }

    static 
    {
        h = new int[0];
        int ai[] = h;
        z z1 = z.a();
        y y1 = y.a();
        s s1 = s.a();
        i = new t(-1, 0, ai, new s[0], z1, y1, s1, null);
    }
}
