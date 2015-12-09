// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.a;

import com.google.b.b.c;
import com.google.b.b.d;
import com.google.b.b.e;
import com.google.b.b.l;
import com.google.b.h;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.b.g.a:
//            q, o, s

final class m
{

    private static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
        'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '$', '%', '*', 
        '+', '-', '.', '/', ':'
    };

    private static char a(int i)
    {
        if (i >= a.length)
        {
            throw h.a();
        } else
        {
            return a[i];
        }
    }

    private static int a(c c1)
    {
        int i = c1.a(8);
        if ((i & 0x80) == 0)
        {
            return i & 0x7f;
        }
        if ((i & 0xc0) == 128)
        {
            return (i & 0x3f) << 8 | c1.a(8);
        }
        if ((i & 0xe0) == 192)
        {
            return (i & 0x1f) << 16 | c1.a(16);
        } else
        {
            throw h.a();
        }
    }

    static e a(byte abyte0[], s s, o o1, Map map)
    {
        d d1;
        ArrayList arraylist;
        c c1;
        StringBuilder stringbuilder;
        int i;
        int j;
        boolean flag;
        c1 = new c(abyte0);
        stringbuilder = new StringBuilder(50);
        arraylist = new ArrayList(1);
        d1 = null;
        i = -1;
        j = -1;
        flag = false;
_L15:
        if (c1.c() >= 4) goto _L2; else goto _L1
_L1:
        q q1 = q.a;
_L7:
        if (q1 == q.a) goto _L4; else goto _L3
_L3:
        if (q1 != com.google.b.g.a.q.h && q1 != q.i) goto _L6; else goto _L5
_L2:
        q1 = q.a(c1.a(4));
          goto _L7
_L6:
        if (q1 != com.google.b.g.a.q.d)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        if (c1.c() < 16)
        {
            throw h.a();
        }
        i = c1.a(8);
        j = c1.a(8);
          goto _L8
        if (q1 != q.f) goto _L10; else goto _L9
_L9:
        d1 = d.a(a(c1));
        if (d1 != null) goto _L12; else goto _L11
_L11:
        throw h.a();
_L10:
        if (q1 != q.j) goto _L14; else goto _L13
_L13:
        k = c1.a(4);
        k2 = c1.a(q1.a(s));
        if (k != 1)
        {
            break MISSING_BLOCK_LABEL_501;
        }
        a(c1, stringbuilder, k2);
        break MISSING_BLOCK_LABEL_501;
_L14:
        k = c1.a(q1.a(s));
        if (q1 != q.b)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        c(c1, stringbuilder, k);
        k = i;
        i = j;
        j = k;
          goto _L8
        if (q1 != com.google.b.g.a.q.c)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        a(c1, stringbuilder, k, flag);
        k = i;
        i = j;
        j = k;
          goto _L8
        if (q1 != com.google.b.g.a.q.e)
        {
            break MISSING_BLOCK_LABEL_388;
        }
        a(c1, stringbuilder, k, d1, ((Collection) (arraylist)), map);
        k = i;
        i = j;
        j = k;
          goto _L8
        if (q1 != q.g)
        {
            break MISSING_BLOCK_LABEL_420;
        }
        b(c1, stringbuilder, k);
        int i1 = i;
        i = j;
        j = i1;
          goto _L8
        throw h.a();
_L4:
        int j1 = i;
        i = j;
        j = j1;
_L8:
        q q2;
        try
        {
            q2 = q.a;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw h.a();
        }
        if (q1 == q2)
        {
            map = stringbuilder.toString();
            int k;
            int k2;
            if (arraylist.isEmpty())
            {
                s = null;
            } else
            {
                s = arraylist;
            }
            if (o1 == null)
            {
                o1 = null;
            } else
            {
                o1 = o1.toString();
            }
            return new e(abyte0, map, s, o1, i, j);
        }
        int k1 = i;
        i = j;
        j = k1;
          goto _L15
_L5:
        flag = true;
        int l1 = i;
        i = j;
        j = l1;
          goto _L8
_L12:
        int i2 = i;
        i = j;
        j = i2;
          goto _L8
        int j2 = i;
        i = j;
        j = j2;
          goto _L8
    }

    private static void a(c c1, StringBuilder stringbuilder, int i)
    {
        if (i * 13 > c1.c())
        {
            throw h.a();
        }
        byte abyte0[] = new byte[i * 2];
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        while (j > 0) 
        {
            int k = c1.a(13);
            k = k % 96 | k / 96 << 8;
            if (k < 959)
            {
                k += 41377;
            } else
            {
                k += 42657;
            }
            abyte0[i] = (byte)(k >> 8 & 0xff);
            abyte0[i + 1] = (byte)(k & 0xff);
            j--;
            i += 2;
        }
        try
        {
            stringbuilder.append(new String(abyte0, "GB2312"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            throw h.a();
        }
    }

    private static void a(c c1, StringBuilder stringbuilder, int i, d d1, Collection collection, Map map)
    {
        if (i * 8 > c1.c())
        {
            throw h.a();
        }
        byte abyte0[] = new byte[i];
        for (int j = 0; j < i; j++)
        {
            abyte0[j] = (byte)c1.a(8);
        }

        if (d1 == null)
        {
            c1 = l.a(abyte0, map);
        } else
        {
            c1 = d1.name();
        }
        try
        {
            stringbuilder.append(new String(abyte0, c1));
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            throw h.a();
        }
        collection.add(abyte0);
    }

    private static void a(c c1, StringBuilder stringbuilder, int i, boolean flag)
    {
        int j = stringbuilder.length();
        for (; i > 1; i -= 2)
        {
            if (c1.c() < 11)
            {
                throw h.a();
            }
            int k = c1.a(11);
            stringbuilder.append(a(k / 45));
            stringbuilder.append(a(k % 45));
        }

        if (i == 1)
        {
            if (c1.c() < 6)
            {
                throw h.a();
            }
            stringbuilder.append(a(c1.a(6)));
        }
        if (flag)
        {
            i = j;
            while (i < stringbuilder.length()) 
            {
                if (stringbuilder.charAt(i) == '%')
                {
                    if (i < stringbuilder.length() - 1 && stringbuilder.charAt(i + 1) == '%')
                    {
                        stringbuilder.deleteCharAt(i + 1);
                    } else
                    {
                        stringbuilder.setCharAt(i, '\035');
                    }
                }
                i++;
            }
        }
    }

    private static void b(c c1, StringBuilder stringbuilder, int i)
    {
        if (i * 13 > c1.c())
        {
            throw h.a();
        }
        byte abyte0[] = new byte[i * 2];
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        while (j > 0) 
        {
            int k = c1.a(13);
            k = k % 192 | k / 192 << 8;
            if (k < 7936)
            {
                k += 33088;
            } else
            {
                k += 49472;
            }
            abyte0[i] = (byte)(k >> 8);
            abyte0[i + 1] = (byte)k;
            j--;
            i += 2;
        }
        try
        {
            stringbuilder.append(new String(abyte0, "SJIS"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            throw h.a();
        }
    }

    private static void c(c c1, StringBuilder stringbuilder, int i)
    {
        for (; i >= 3; i -= 3)
        {
            if (c1.c() < 10)
            {
                throw h.a();
            }
            int j = c1.a(10);
            if (j >= 1000)
            {
                throw h.a();
            }
            stringbuilder.append(a(j / 100));
            stringbuilder.append(a((j / 10) % 10));
            stringbuilder.append(a(j % 10));
        }

        if (i == 2)
        {
            if (c1.c() < 7)
            {
                throw h.a();
            }
            i = c1.a(7);
            if (i >= 100)
            {
                throw h.a();
            }
            stringbuilder.append(a(i / 10));
            stringbuilder.append(a(i % 10));
        } else
        if (i == 1)
        {
            if (c1.c() < 4)
            {
                throw h.a();
            }
            i = c1.a(4);
            if (i >= 10)
            {
                throw h.a();
            } else
            {
                stringbuilder.append(a(i));
                return;
            }
        }
    }

}
