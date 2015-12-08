// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.c;

import com.google.b.b.a;
import com.google.b.b.d;
import com.google.b.g;
import com.google.b.g.a.o;
import com.google.b.g.a.q;
import com.google.b.g.a.s;
import com.google.b.g.a.u;
import com.google.b.v;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.b.g.c:
//            f, e, a, g, 
//            b, d

public final class c
{

    private static final int a[] = {
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, 
        -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 
        2, 3, 4, 5, 6, 7, 8, 9, 44, -1, 
        -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 
        35, -1, -1, -1, -1, -1
    };

    static int a(int i)
    {
        if (i < a.length)
        {
            return a[i];
        } else
        {
            return -1;
        }
    }

    private static int a(a a1, o o, s s1, b b1)
    {
        int j = 0x7fffffff;
        int k = -1;
        for (int i = 0; i < 8; i++)
        {
            com.google.b.g.c.f.a(a1, o, s1, i, b1);
            int l = a(b1);
            if (l < j)
            {
                k = i;
                j = l;
            }
        }

        return k;
    }

    private static int a(b b1)
    {
        return com.google.b.g.c.e.a(b1) + e.b(b1) + e.c(b1) + com.google.b.g.c.e.d(b1);
    }

    static a a(a a1, int i, int j, int k)
    {
        if (a1.b() != j)
        {
            throw new v("Number of bits and data bytes does not match");
        }
        ArrayList arraylist = new ArrayList(k);
        int j1 = 0;
        int l = 0;
        int k1 = 0;
        int i1;
        int l1;
        for (i1 = 0; j1 < k; i1 = l1 + i1)
        {
            int ai[] = new int[1];
            int ai1[] = new int[1];
            a(i, j, k, j1, ai, ai1);
            l1 = ai[0];
            byte abyte0[] = new byte[l1];
            a1.a(i1 * 8, abyte0, 0, l1);
            ai1 = a(abyte0, ai1[0]);
            arraylist.add(new com.google.b.g.c.a(abyte0, ai1));
            k1 = Math.max(k1, l1);
            l = Math.max(l, ai1.length);
            l1 = ai[0];
            j1++;
        }

        if (j != i1)
        {
            throw new v("Data bytes does not match offset");
        }
        a1 = new a();
label0:
        for (j = 0; j < k1; j++)
        {
            Iterator iterator = arraylist.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                byte abyte1[] = ((com.google.b.g.c.a)iterator.next()).a();
                if (j < abyte1.length)
                {
                    a1.b(abyte1[j], 8);
                }
            } while (true);
        }

label1:
        for (j = 0; j < l; j++)
        {
            Iterator iterator1 = arraylist.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    continue label1;
                }
                byte abyte2[] = ((com.google.b.g.c.a)iterator1.next()).b();
                if (j < abyte2.length)
                {
                    a1.b(abyte2[j], 8);
                }
            } while (true);
        }

        if (i != a1.b())
        {
            throw new v((new StringBuilder()).append("Interleaving error: ").append(i).append(" and ").append(a1.b()).append(" differ.").toString());
        } else
        {
            return a1;
        }
    }

    private static q a(String s1, String s2)
    {
        int i = 0;
        if ("Shift_JIS".equals(s2))
        {
            if (a(s1))
            {
                return q.g;
            } else
            {
                return q.e;
            }
        }
        boolean flag1 = false;
        boolean flag = false;
        while (i < s1.length()) 
        {
            char c1 = s1.charAt(i);
            if (c1 >= '0' && c1 <= '9')
            {
                flag = true;
            } else
            if (a(c1) != -1)
            {
                flag1 = true;
            } else
            {
                return q.e;
            }
            i++;
        }
        if (flag1)
        {
            return q.c;
        }
        if (flag)
        {
            return q.b;
        } else
        {
            return q.e;
        }
    }

    private static s a(int i, o o)
    {
        for (int j = 1; j <= 40; j++)
        {
            s s1 = s.b(j);
            if (s1.c() - s1.a(o).c() >= (i + 7) / 8)
            {
                return s1;
            }
        }

        throw new v("Data too big");
    }

    public static com.google.b.g.c.g a(String s1, o o, Map map)
    {
        Object obj;
        Object obj1;
        a a1;
        a a2;
        int i;
        if (map == null)
        {
            map = null;
        } else
        {
            map = (String)map.get(g.b);
        }
        obj = map;
        if (map == null)
        {
            obj = "ISO-8859-1";
        }
        map = a(s1, ((String) (obj)));
        obj1 = new a();
        if (map == q.e && !"ISO-8859-1".equals(obj))
        {
            d d1 = d.a(((String) (obj)));
            if (d1 != null)
            {
                a(d1, ((a) (obj1)));
            }
        }
        a(((q) (map)), ((a) (obj1)));
        a1 = new a();
        a(s1, ((q) (map)), a1, ((String) (obj)));
        obj = a(((a) (obj1)).a() + map.a(s.b(1)) + a1.a(), o);
        i = ((a) (obj1)).a();
        obj = a(map.a(((s) (obj))) + i + a1.a(), o);
        a2 = new a();
        a2.a(((a) (obj1)));
        if (map == q.e)
        {
            i = a1.b();
        } else
        {
            i = s1.length();
        }
        a(i, ((s) (obj)), ((q) (map)), a2);
        a2.a(a1);
        s1 = ((s) (obj)).a(o);
        i = ((s) (obj)).c() - s1.c();
        a(i, a2);
        s1 = a(a2, ((s) (obj)).c(), i, s1.b());
        obj1 = new com.google.b.g.c.g();
        ((com.google.b.g.c.g) (obj1)).a(o);
        ((com.google.b.g.c.g) (obj1)).a(map);
        ((com.google.b.g.c.g) (obj1)).a(((s) (obj)));
        i = ((s) (obj)).d();
        map = new b(i, i);
        i = a(((a) (s1)), o, ((s) (obj)), ((b) (map)));
        ((com.google.b.g.c.g) (obj1)).a(i);
        com.google.b.g.c.f.a(s1, o, ((s) (obj)), i, map);
        ((com.google.b.g.c.g) (obj1)).a(map);
        return ((com.google.b.g.c.g) (obj1));
    }

    static void a(int i, int j, int k, int l, int ai[], int ai1[])
    {
        if (l >= k)
        {
            throw new v("Block ID too large");
        }
        int i1 = i % k;
        int j1 = k - i1;
        int k1 = i / k;
        j /= k;
        int l1 = j + 1;
        int i2 = k1 - j;
        k1 = (k1 + 1) - l1;
        if (i2 != k1)
        {
            throw new v("EC bytes mismatch");
        }
        if (k != j1 + i1)
        {
            throw new v("RS blocks mismatch");
        }
        if (i != i1 * (l1 + k1) + (j + i2) * j1)
        {
            throw new v("Total bytes mismatch");
        }
        if (l < j1)
        {
            ai[0] = j;
            ai1[0] = i2;
            return;
        } else
        {
            ai[0] = l1;
            ai1[0] = k1;
            return;
        }
    }

    static void a(int i, a a1)
    {
        int l = i * 8;
        if (a1.a() > l)
        {
            throw new v((new StringBuilder()).append("data bits cannot fit in the QR Code").append(a1.a()).append(" > ").append(l).toString());
        }
        for (int j = 0; j < 4 && a1.a() < l; j++)
        {
            a1.a(false);
        }

        int k = a1.a() & 7;
        if (k > 0)
        {
            for (; k < 8; k++)
            {
                a1.a(false);
            }

        }
        int i1 = a1.b();
        k = 0;
        while (k < i - i1) 
        {
            char c1;
            if ((k & 1) == 0)
            {
                c1 = '\354';
            } else
            {
                c1 = '\021';
            }
            a1.b(c1, 8);
            k++;
        }
        if (a1.a() != l)
        {
            throw new v("Bits size does not equal capacity");
        } else
        {
            return;
        }
    }

    static void a(int i, s s1, q q1, a a1)
    {
        int j = q1.a(s1);
        if (i >= 1 << j)
        {
            throw new v((new StringBuilder()).append(i).append(" is bigger than ").append((1 << j) - 1).toString());
        } else
        {
            a1.b(i, j);
            return;
        }
    }

    private static void a(d d1, a a1)
    {
        a1.b(q.f.a(), 4);
        a1.b(d1.a(), 8);
    }

    static void a(q q1, a a1)
    {
        a1.b(q1.a(), 4);
    }

    static void a(CharSequence charsequence, a a1)
    {
        int j = charsequence.length();
        for (int i = 0; i < j;)
        {
            int k = charsequence.charAt(i) - 48;
            if (i + 2 < j)
            {
                a1.b(k * 100 + (charsequence.charAt(i + 1) - 48) * 10 + (charsequence.charAt(i + 2) - 48), 10);
                i += 3;
            } else
            if (i + 1 < j)
            {
                a1.b(k * 10 + (charsequence.charAt(i + 1) - 48), 7);
                i += 2;
            } else
            {
                a1.b(k, 4);
                i++;
            }
        }

    }

    static void a(String s1, a a1)
    {
        int j;
        int k;
        try
        {
            s1 = s1.getBytes("Shift_JIS");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new v(s1);
        }
        k = s1.length;
        j = 0;
        while (j < k) 
        {
            int i = (s1[j] & 0xff) << 8 | s1[j + 1] & 0xff;
            if (i >= 33088 && i <= 40956)
            {
                i -= 33088;
            } else
            if (i >= 57408 && i <= 60351)
            {
                i -= 49472;
            } else
            {
                i = -1;
            }
            if (i == -1)
            {
                throw new v("Invalid byte sequence");
            }
            a1.b((i & 0xff) + (i >> 8) * 192, 13);
            j += 2;
        }
    }

    static void a(String s1, a a1, String s2)
    {
        int j;
        try
        {
            s1 = s1.getBytes(s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new v(s1);
        }
        j = s1.length;
        for (int i = 0; i < j; i++)
        {
            a1.b(s1[i], 8);
        }

    }

    static void a(String s1, q q1, a a1, String s2)
    {
        switch (com.google.b.g.c.d.a[q1.ordinal()])
        {
        default:
            throw new v((new StringBuilder()).append("Invalid mode: ").append(q1).toString());

        case 1: // '\001'
            a(((CharSequence) (s1)), a1);
            return;

        case 2: // '\002'
            b(s1, a1);
            return;

        case 3: // '\003'
            a(s1, a1, s2);
            return;

        case 4: // '\004'
            a(s1, a1);
            break;
        }
    }

    private static boolean a(String s1)
    {
        int i;
        int j;
        int k;
        try
        {
            s1 = s1.getBytes("Shift_JIS");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return false;
        }
        j = s1.length;
        if (j % 2 == 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                k = s1[i] & 0xff;
                if ((k < 129 || k > 159) && (k < 224 || k > 235))
                {
                    break label0;
                }
                i += 2;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    static byte[] a(byte abyte0[], int i)
    {
        boolean flag = false;
        int l = abyte0.length;
        int ai[] = new int[l + i];
        for (int j = 0; j < l; j++)
        {
            ai[j] = abyte0[j] & 0xff;
        }

        (new com.google.b.b.b.d(com.google.b.b.b.a.e)).a(ai, i);
        abyte0 = new byte[i];
        for (int k = ((flag) ? 1 : 0); k < i; k++)
        {
            abyte0[k] = (byte)ai[l + k];
        }

        return abyte0;
    }

    static void b(CharSequence charsequence, a a1)
    {
        int j = charsequence.length();
        for (int i = 0; i < j;)
        {
            int k = a(charsequence.charAt(i));
            if (k == -1)
            {
                throw new v();
            }
            if (i + 1 < j)
            {
                int l = a(charsequence.charAt(i + 1));
                if (l == -1)
                {
                    throw new v();
                }
                a1.b(k * 45 + l, 11);
                i += 2;
            } else
            {
                a1.b(k, 6);
                i++;
            }
        }

    }

}
