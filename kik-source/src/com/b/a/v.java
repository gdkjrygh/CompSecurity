// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.io.OutputStream;

// Referenced classes of package com.b.a:
//            z, m, w

public final class v
{

    static final boolean a;

    private v()
    {
    }

    private static m a(String s, int i, int j, int k, z z1, OutputStream outputstream, m m1)
    {
        int l;
        int i1;
        int k1;
        int l1;
        l1 = z1.c;
        l = m1.c;
        i1 = l + k;
        k1 = i1;
        if (i1 + i <= m1.a.length) goto _L2; else goto _L1
_L1:
        outputstream.write(m1.a, m1.b, m1.c - m1.b);
        l = m1.b;
        k1 = l + k;
        if (k1 + i <= m1.a.length) goto _L2; else goto _L3
_L3:
        m1.c = k1;
        s = w.a(s, 0, i, m1.a, k1, m1.a.length, z1, m1);
        i = z1.c - l1;
        if (i >= j) goto _L5; else goto _L4
_L4:
        j = z1.c;
        k--;
        z1.c = j + k;
        l++;
        j = i;
        i = l;
        do
        {
            k--;
            if (k <= 0)
            {
                break;
            }
            m1.a[i] = (byte)(j & 0x7f | 0x80);
            j >>>= 7;
            i++;
        } while (true);
        m1.a[i] = (byte)j;
        outputstream.write(m1.a, l, m1.c - l);
        m1.c = m1.b;
        if (!a && s == m1)
        {
            throw new AssertionError();
        }
        a(m1.d, outputstream);
_L7:
        return m1;
_L5:
        z1.c = z1.c + k;
        do
        {
            k--;
            if (k <= 0)
            {
                break;
            }
            m1.a[l] = (byte)(i & 0x7f | 0x80);
            i >>>= 7;
            l++;
        } while (true);
        m1.a[l] = (byte)i;
        if (!a && s == m1)
        {
            throw new AssertionError();
        } else
        {
            a(m1, outputstream);
            return m1;
        }
_L2:
        m1.c = k1;
        s = w.a(s, 0, i, z1, m1);
        int j1 = z1.c - l1;
        i = k;
        if (j1 < j)
        {
            if (s != m1 || k != 2)
            {
                i = z1.c;
                k--;
                z1.c = i + k;
                if (l != m1.b)
                {
                    outputstream.write(m1.a, m1.b, l - m1.b);
                }
                l++;
                i = l;
                j = j1;
                do
                {
                    k--;
                    if (k <= 0)
                    {
                        break;
                    }
                    m1.a[i] = (byte)(j & 0x7f | 0x80);
                    j >>>= 7;
                    i++;
                } while (true);
                m1.a[i] = (byte)j;
                outputstream.write(m1.a, l, m1.c - l);
                m1.c = m1.b;
                if (s != m1)
                {
                    a(m1.d, outputstream);
                    return m1;
                }
                continue; /* Loop/switch isn't completed */
            }
            System.arraycopy(m1.a, k1, m1.a, k1 - 1, m1.c - k1);
            i = k - 1;
            m1.c = m1.c - 1;
        }
        z1.c = z1.c + i;
        j = i;
        i = j1;
        do
        {
            j--;
            if (j <= 0)
            {
                break;
            }
            m1.a[l] = (byte)(i & 0x7f | 0x80);
            i >>>= 7;
            l++;
        } while (true);
        m1.a[l] = (byte)i;
        if (s != m1)
        {
            a(m1, outputstream);
            return m1;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static m a(String s, z z1, OutputStream outputstream, m m1)
    {
        int l = s.length();
        if (l == 0)
        {
            if (m1.c == m1.a.length)
            {
                outputstream.write(m1.a, m1.b, m1.c - m1.b);
                m1.c = m1.b;
            }
            s = m1.a;
            int i = m1.c;
            m1.c = i + 1;
            s[i] = 0;
            z1.c = z1.c + 1;
        } else
        if (l < 43)
        {
            int i1 = z1.c;
            int k = m1.c + 1;
            int j = k;
            if (k + l > m1.a.length)
            {
                outputstream.write(m1.a, m1.b, m1.c - m1.b);
                m1.c = m1.b;
                j = m1.c + 1;
            }
            m1.c = j;
            s = w.a(s, 0, l, z1, m1);
            m1.a[j - 1] = (byte)(z1.c - i1);
            z1.c = z1.c + 1;
            if (s != m1)
            {
                a(m1, outputstream);
                return m1;
            }
        } else
        {
            if (l < 683)
            {
                return a(s, l, 128, 2, z1, outputstream, m1);
            }
            if (l < 10923)
            {
                return a(s, l, 2048, 3, z1, outputstream, m1);
            }
            if (l < 0x2aaab)
            {
                return a(s, l, 32768, 4, z1, outputstream, m1);
            } else
            {
                return a(s, l, 0x80000, 5, z1, outputstream, m1);
            }
        }
        return m1;
    }

    private static void a(m m1, OutputStream outputstream)
    {
        m m2;
        do
        {
            int i = m1.c - m1.b;
            if (i > 0)
            {
                outputstream.write(m1.a, m1.b, i);
                m1.c = m1.b;
            }
            m2 = m1.d;
            m1 = m2;
        } while (m2 != null);
    }

    static 
    {
        boolean flag;
        if (!com/b/a/v.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
