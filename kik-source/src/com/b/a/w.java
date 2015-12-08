// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.b.a:
//            z, m

public final class w
{
    public static final class a
    {

        public static String a(byte abyte0[])
        {
            try
            {
                abyte0 = new String(abyte0, "UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new RuntimeException(abyte0);
            }
            return abyte0;
        }

        public static String a(byte abyte0[], int i, int j)
        {
            try
            {
                abyte0 = new String(abyte0, i, j, "UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new RuntimeException(abyte0);
            }
            return abyte0;
        }
    }


    static final int a[] = {
        9, 99, 999, 9999, 0x1869f, 0xf423f, 0x98967f, 0x5f5e0ff, 0x3b9ac9ff, 0x7fffffff
    };
    static final char b[] = {
        '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 
        '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', 
        '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', 
        '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', 
        '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', 
        '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', 
        '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', 
        '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', 
        '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', 
        '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'
    };
    static final char c[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    };
    static final char d[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
        'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
        'u', 'v', 'w', 'x', 'y', 'z'
    };
    static final byte e[] = {
        45, 50, 49, 52, 55, 52, 56, 51, 54, 52, 
        56
    };
    static final byte f[] = {
        45, 57, 50, 50, 51, 51, 55, 50, 48, 51, 
        54, 56, 53, 52, 55, 55, 53, 56, 48, 56
    };

    private static m a(String s, int i, int j, int k, z z1, m m1)
    {
        int i1 = z1.c;
        int l = m1.c;
        int j1 = l + k;
        if (j1 > m1.a.length)
        {
            if (i + k > z1.d)
            {
                l = i + k;
            } else
            {
                l = z1.d;
            }
            m1 = new m(l, m1);
            l = m1.b;
            j1 = l + k;
            m1.c = j1;
            s = a(s, 0, i, z1, m1);
            i1 = z1.c - i1;
            i = k;
            if (i1 < j)
            {
                System.arraycopy(m1.a, j1, m1.a, j1 - 1, m1.c - j1);
                i = k - 1;
                m1.c = m1.c - 1;
            }
            z1.c = z1.c + i;
            j = i1;
            k = l;
            do
            {
                i--;
                if (i > 0)
                {
                    m1.a[k] = (byte)(j & 0x7f | 0x80);
                    j >>>= 7;
                    k++;
                } else
                {
                    m1.a[k] = (byte)j;
                    return s;
                }
            } while (true);
        }
        if (j1 + i > m1.a.length)
        {
            m1.c = j1;
            s = a(s, 0, i, m1.a, j1, m1.a.length, z1, m1);
            i1 = z1.c - i1;
            i = k;
            if (i1 < j)
            {
                System.arraycopy(m1.a, j1, m1.a, j1 - 1, m1.c - j1);
                i = k - 1;
                m1.c = m1.c - 1;
            }
            z1.c = z1.c + i;
            j = i1;
            do
            {
                i--;
                if (i > 0)
                {
                    m1.a[l] = (byte)(j & 0x7f | 0x80);
                    j >>>= 7;
                    l++;
                } else
                {
                    m1.a[l] = (byte)j;
                    return s;
                }
            } while (true);
        }
        m1.c = j1;
        s = a(s, 0, i, z1, m1);
        i1 = z1.c - i1;
        i = k;
        if (i1 < j)
        {
            System.arraycopy(m1.a, j1, m1.a, j1 - 1, m1.c - j1);
            i = k - 1;
            m1.c = m1.c - 1;
        }
        z1.c = z1.c + i;
        j = i1;
        do
        {
            i--;
            if (i > 0)
            {
                m1.a[l] = (byte)(j & 0x7f | 0x80);
                j >>>= 7;
                l++;
            } else
            {
                m1.a[l] = (byte)j;
                return s;
            }
        } while (true);
    }

    static m a(String s, int i, int j, z z1, m m1)
    {
        byte abyte0[];
        int k;
        int l;
        int i1;
        abyte0 = m1.a;
        l = m1.c;
        i1 = l + j;
        boolean flag = false;
        k = i;
        i = ((flag) ? 1 : 0);
_L2:
        if (k == j)
        {
            break; /* Loop/switch isn't completed */
        }
        i = k + 1;
        k = s.charAt(k);
        if (k < 128)
        {
            abyte0[l] = (byte)k;
            int j1 = l + 1;
            l = i;
            i = k;
            k = l;
            l = j1;
            continue; /* Loop/switch isn't completed */
        }
_L3:
        if (i == j && k < 128)
        {
            z1.c = z1.c + (l - m1.c);
            m1.c = l;
            return m1;
        }
        if (k < 2048)
        {
            i1++;
            if (i1 > abyte0.length)
            {
                z1.c = z1.c + (l - m1.c);
                m1.c = l;
                return a(s, i - 1, j, abyte0, l, abyte0.length, z1, m1);
            }
            int k1 = l + 1;
            abyte0[l] = (byte)(k >> 6 & 0x1f | 0xc0);
            l = k1 + 1;
            abyte0[k1] = (byte)(k >> 0 & 0x3f | 0x80);
            k = l;
            l = i1;
        } else
        {
            i1 += 2;
            if (i1 > abyte0.length)
            {
                z1.c = z1.c + (l - m1.c);
                m1.c = l;
                return a(s, i - 1, j, abyte0, l, abyte0.length, z1, m1);
            }
            int l1 = l + 1;
            abyte0[l] = (byte)(k >> 12 & 0xf | 0xe0);
            l = l1 + 1;
            abyte0[l1] = (byte)(k >> 6 & 0x3f | 0x80);
            l1 = l + 1;
            abyte0[l] = (byte)(k >> 0 & 0x3f | 0x80);
            l = i1;
            k = l1;
        }
        i1 = l;
        l = k;
        k = i;
        i = 0;
        if (true) goto _L2; else goto _L1
_L1:
        int i2 = k;
        k = i;
        i = i2;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    static m a(String s, int i, int j, byte abyte0[], int k, int l, z z1, m m1)
    {
        int i1;
        boolean flag = false;
        m m2 = m1;
        int j1 = k;
        i1 = i;
        k = ((flag) ? 1 : 0);
        m1 = abyte0;
        i = j1;
        abyte0 = m2;
_L2:
        int k1;
        int l1;
        if (i1 == j || i == l)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = i1 + 1;
        k = s.charAt(i1);
        if (k < 128)
        {
            m1[i] = (byte)k;
            i++;
            i1 = k1;
            continue; /* Loop/switch isn't completed */
        }
        l1 = k;
_L3:
        if (k1 == j && l1 < 128)
        {
            z1.c = z1.c + (i - ((m) (abyte0)).c);
            abyte0.c = i;
            return abyte0;
        }
        if (i == l)
        {
            z1.c = z1.c + (i - ((m) (abyte0)).c);
            abyte0.c = i;
            if (((m) (abyte0)).d == null)
            {
                i = z1.d;
                m1 = new byte[i];
                abyte0 = new m(m1, abyte0);
                k = 0;
            } else
            {
                abyte0 = ((m) (abyte0)).d;
                k = ((m) (abyte0)).b;
                abyte0.c = k;
                m1 = ((m) (abyte0)).a;
                i = m1.length;
            }
        } else
        if (l1 < 2048)
        {
            Object obj;
            if (i == l)
            {
                z1.c = z1.c + (i - ((m) (abyte0)).c);
                abyte0.c = i;
                if (((m) (abyte0)).d == null)
                {
                    k = z1.d;
                    m1 = new byte[k];
                    abyte0 = new m(m1, abyte0);
                    i = 0;
                } else
                {
                    abyte0 = ((m) (abyte0)).d;
                    i = ((m) (abyte0)).b;
                    abyte0.c = i;
                    m1 = ((m) (abyte0)).a;
                    k = m1.length;
                }
            } else
            {
                k = l;
            }
            l = i + 1;
            m1[i] = (byte)(l1 >> 6 & 0x1f | 0xc0);
            if (l == k)
            {
                z1.c = z1.c + (l - ((m) (abyte0)).c);
                abyte0.c = l;
                if (((m) (abyte0)).d == null)
                {
                    i = z1.d;
                    m1 = new byte[i];
                    abyte0 = new m(m1, abyte0);
                    k = 0;
                } else
                {
                    abyte0 = ((m) (abyte0)).d;
                    k = ((m) (abyte0)).b;
                    abyte0.c = k;
                    m1 = ((m) (abyte0)).a;
                    i = m1.length;
                }
            } else
            {
                i = k;
                k = l;
            }
            m1[k] = (byte)(l1 >> 0 & 0x3f | 0x80);
            k++;
        } else
        {
            k = l;
            obj = abyte0;
            i1 = i;
            if (i == l)
            {
                z1.c = z1.c + (i - ((m) (abyte0)).c);
                abyte0.c = i;
                if (((m) (abyte0)).d == null)
                {
                    k = z1.d;
                    m1 = new byte[k];
                    obj = new m(m1, abyte0);
                    i1 = 0;
                } else
                {
                    obj = ((m) (abyte0)).d;
                    i1 = ((m) (obj)).b;
                    obj.c = i1;
                    m1 = ((m) (obj)).a;
                    k = m1.length;
                }
            }
            i = i1 + 1;
            m1[i1] = (byte)(l1 >> 12 & 0xf | 0xe0);
            if (i == k)
            {
                z1.c = z1.c + (i - ((m) (obj)).c);
                obj.c = i;
                if (((m) (obj)).d == null)
                {
                    k = z1.d;
                    m1 = new byte[k];
                    obj = new m(m1, ((m) (obj)));
                    i = 0;
                } else
                {
                    obj = ((m) (obj)).d;
                    i = ((m) (obj)).b;
                    obj.c = i;
                    m1 = ((m) (obj)).a;
                    k = m1.length;
                }
            }
            l = i + 1;
            m1[i] = (byte)(l1 >> 6 & 0x3f | 0x80);
            if (l == k)
            {
                z1.c = z1.c + (l - ((m) (obj)).c);
                obj.c = l;
                if (((m) (obj)).d == null)
                {
                    k = z1.d;
                    m1 = new byte[k];
                    obj = new m(m1, ((m) (obj)));
                    i = 0;
                } else
                {
                    obj = ((m) (obj)).d;
                    i = ((m) (obj)).b;
                    obj.c = i;
                    m1 = ((m) (obj)).a;
                    k = m1.length;
                }
            } else
            {
                i = l;
            }
            m1[i] = (byte)(l1 >> 0 & 0x3f | 0x80);
            l = i + 1;
            abyte0 = ((byte []) (obj));
            i = k;
            k = l;
        }
        i1 = 0;
        l = i;
        i = k;
        k = i1;
        i1 = k1;
        if (true) goto _L2; else goto _L1
_L1:
        l1 = k;
        k1 = i1;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static m a(String s, z z1, m m1)
    {
        int l = s.length();
        if (l == 0)
        {
            s = m1;
            if (m1.c == m1.a.length)
            {
                s = new m(z1.d, m1);
            }
            m1 = ((m) (s)).a;
            int i = ((m) (s)).c;
            s.c = i + 1;
            m1[i] = 0;
            z1.c = z1.c + 1;
            return s;
        }
        if (l < 43)
        {
            int i1 = z1.c;
            if (m1.c == m1.a.length)
            {
                int j;
                if (l + 1 > z1.d)
                {
                    j = l + 1;
                } else
                {
                    j = z1.d;
                }
                m1 = new m(j, m1);
                m1.c = 1;
                s = a(s, 0, l, z1, m1);
                m1.a[0] = (byte)(z1.c - i1);
                z1.c = z1.c + 1;
                return s;
            }
            int k = m1.c + 1;
            if (k + l > m1.a.length)
            {
                m1.c = k;
                byte abyte0[] = m1.a;
                s = a(s, 0, l, abyte0, k, abyte0.length, z1, m1);
                abyte0[k - 1] = (byte)(z1.c - i1);
                z1.c = z1.c + 1;
                return s;
            } else
            {
                m1.c = k;
                s = a(s, 0, l, z1, m1);
                m1.a[k - 1] = (byte)(z1.c - i1);
                z1.c = z1.c + 1;
                return s;
            }
        }
        if (l < 683)
        {
            return a(s, l, 128, 2, z1, m1);
        }
        if (l < 10923)
        {
            return a(s, l, 2048, 3, z1, m1);
        }
        if (l < 0x2aaab)
        {
            return a(s, l, 32768, 4, z1, m1);
        } else
        {
            return a(s, l, 0x80000, 5, z1, m1);
        }
    }

}
