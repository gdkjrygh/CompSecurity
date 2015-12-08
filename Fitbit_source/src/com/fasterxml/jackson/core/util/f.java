// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import java.math.BigDecimal;
import java.util.ArrayList;

// Referenced classes of package com.fasterxml.jackson.core.util:
//            BufferRecycler

public final class f
{

    static final char a[] = new char[0];
    static final int b = 1000;
    static final int c = 0x40000;
    private final BufferRecycler d;
    private char e[];
    private int f;
    private int g;
    private ArrayList h;
    private boolean i;
    private int j;
    private char k[];
    private int l;
    private String m;
    private char n[];

    public f(BufferRecycler bufferrecycler)
    {
        i = false;
        d = bufferrecycler;
    }

    private char[] b(int i1)
    {
        if (d != null)
        {
            return d.a(BufferRecycler.CharBufferType.c, i1);
        } else
        {
            return new char[Math.max(i1, 1000)];
        }
    }

    private void c(int i1)
    {
        int j1 = g;
        g = 0;
        char ac[] = e;
        e = null;
        int k1 = f;
        f = -1;
        i1 = j1 + i1;
        if (k == null || i1 > k.length)
        {
            k = b(i1);
        }
        if (j1 > 0)
        {
            System.arraycopy(ac, k1, k, 0, j1);
        }
        j = 0;
        l = j1;
    }

    private void d(int i1)
    {
        if (h == null)
        {
            h = new ArrayList();
        }
        char ac[] = k;
        i = true;
        h.add(ac);
        j = j + ac.length;
        int k1 = ac.length;
        int j1 = k1 >> 1;
        if (j1 >= i1)
        {
            i1 = j1;
        }
        ac = e(Math.min(0x40000, k1 + i1));
        l = 0;
        k = ac;
    }

    private char[] e(int i1)
    {
        return new char[i1];
    }

    private void q()
    {
        i = false;
        h.clear();
        j = 0;
        l = 0;
    }

    private char[] r()
    {
        if (m != null)
        {
            return m.toCharArray();
        }
        if (f >= 0)
        {
            if (g < 1)
            {
                return a;
            } else
            {
                char ac[] = e(g);
                System.arraycopy(e, f, ac, 0, g);
                return ac;
            }
        }
        int i1 = c();
        if (i1 < 1)
        {
            return a;
        }
        char ac1[] = e(i1);
        if (h != null)
        {
            int k1 = h.size();
            int j1 = 0;
            i1 = 0;
            for (; j1 < k1; j1++)
            {
                char ac2[] = (char[])(char[])h.get(j1);
                int l1 = ac2.length;
                System.arraycopy(ac2, 0, ac1, i1, l1);
                i1 += l1;
            }

        } else
        {
            i1 = 0;
        }
        System.arraycopy(k, 0, ac1, i1, l);
        return ac1;
    }

    public void a()
    {
        if (d == null)
        {
            b();
        } else
        if (k != null)
        {
            b();
            char ac[] = k;
            k = null;
            d.a(BufferRecycler.CharBufferType.c, ac);
            return;
        }
    }

    public void a(char c1)
    {
        if (f >= 0)
        {
            c(16);
        }
        m = null;
        n = null;
        char ac1[] = k;
        char ac[] = ac1;
        if (l >= ac1.length)
        {
            d(1);
            ac = k;
        }
        int i1 = l;
        l = i1 + 1;
        ac[i1] = c1;
    }

    public void a(int i1)
    {
        l = i1;
    }

    public void a(String s)
    {
        e = null;
        f = -1;
        g = 0;
        m = s;
        n = null;
        if (i)
        {
            q();
        }
        l = 0;
    }

    public void a(String s, int i1, int j1)
    {
        if (f >= 0)
        {
            c(j1);
        }
        m = null;
        n = null;
        char ac[] = k;
        int i2 = ac.length - l;
        if (i2 >= j1)
        {
            s.getChars(i1, i1 + j1, ac, l);
            l = l + j1;
            return;
        }
        int l1 = i1;
        int k1 = j1;
        if (i2 > 0)
        {
            s.getChars(i1, i1 + i2, ac, l);
            k1 = j1 - i2;
            l1 = i1 + i2;
        }
        do
        {
            d(k1);
            i1 = Math.min(k.length, k1);
            s.getChars(l1, l1 + i1, k, 0);
            l = l + i1;
            l1 += i1;
            i1 = k1 - i1;
            k1 = i1;
        } while (i1 > 0);
    }

    public void a(char ac[], int i1, int j1)
    {
        m = null;
        n = null;
        e = ac;
        f = i1;
        g = j1;
        if (i)
        {
            q();
        }
    }

    public void b()
    {
        f = -1;
        l = 0;
        g = 0;
        e = null;
        m = null;
        n = null;
        if (i)
        {
            q();
        }
    }

    public void b(char ac[], int i1, int j1)
    {
        e = null;
        f = -1;
        g = 0;
        m = null;
        n = null;
        if (!i) goto _L2; else goto _L1
_L1:
        q();
_L4:
        j = 0;
        l = 0;
        c(ac, i1, j1);
        return;
_L2:
        if (k == null)
        {
            k = b(j1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int c()
    {
        if (f >= 0)
        {
            return g;
        }
        if (n != null)
        {
            return n.length;
        }
        if (m != null)
        {
            return m.length();
        } else
        {
            return j + l;
        }
    }

    public void c(char ac[], int i1, int j1)
    {
        if (f >= 0)
        {
            c(j1);
        }
        m = null;
        n = null;
        char ac1[] = k;
        int i2 = ac1.length - l;
        if (i2 >= j1)
        {
            System.arraycopy(ac, i1, ac1, l, j1);
            l = l + j1;
            return;
        }
        int l1 = i1;
        int k1 = j1;
        if (i2 > 0)
        {
            System.arraycopy(ac, i1, ac1, l, i2);
            l1 = i1 + i2;
            k1 = j1 - i2;
        }
        do
        {
            d(k1);
            i1 = Math.min(k.length, k1);
            System.arraycopy(ac, l1, k, 0, i1);
            l = l + i1;
            l1 += i1;
            i1 = k1 - i1;
            k1 = i1;
        } while (i1 > 0);
    }

    public int d()
    {
        if (f >= 0)
        {
            return f;
        } else
        {
            return 0;
        }
    }

    public boolean e()
    {
        while (f >= 0 || n != null || m == null) 
        {
            return true;
        }
        return false;
    }

    public char[] f()
    {
        if (f >= 0)
        {
            return e;
        }
        if (n != null)
        {
            return n;
        }
        if (m != null)
        {
            char ac[] = m.toCharArray();
            n = ac;
            return ac;
        }
        if (!i)
        {
            return k;
        } else
        {
            return h();
        }
    }

    public String g()
    {
        if (m == null)
        {
            if (n != null)
            {
                m = new String(n);
            } else
            if (f >= 0)
            {
                if (g < 1)
                {
                    m = "";
                    return "";
                }
                m = new String(e, f, g);
            } else
            {
                int i1 = j;
                int k1 = l;
                if (i1 == 0)
                {
                    String s;
                    if (k1 == 0)
                    {
                        s = "";
                    } else
                    {
                        s = new String(k, 0, k1);
                    }
                    m = s;
                } else
                {
                    StringBuilder stringbuilder = new StringBuilder(i1 + k1);
                    if (h != null)
                    {
                        int l1 = h.size();
                        for (int j1 = 0; j1 < l1; j1++)
                        {
                            char ac[] = (char[])h.get(j1);
                            stringbuilder.append(ac, 0, ac.length);
                        }

                    }
                    stringbuilder.append(k, 0, l);
                    m = stringbuilder.toString();
                }
            }
        }
        return m;
    }

    public char[] h()
    {
        char ac1[] = n;
        char ac[] = ac1;
        if (ac1 == null)
        {
            ac = r();
            n = ac;
        }
        return ac;
    }

    public BigDecimal i()
        throws NumberFormatException
    {
        if (n != null)
        {
            return new BigDecimal(n);
        }
        if (f >= 0)
        {
            return new BigDecimal(e, f, g);
        }
        if (j == 0)
        {
            return new BigDecimal(k, 0, l);
        } else
        {
            return new BigDecimal(h());
        }
    }

    public double j()
        throws NumberFormatException
    {
        return com.fasterxml.jackson.core.io.f.c(g());
    }

    public void k()
    {
        if (f >= 0)
        {
            c(16);
        }
    }

    public char[] l()
    {
        if (f < 0) goto _L2; else goto _L1
_L1:
        c(1);
_L4:
        return k;
_L2:
        char ac[] = k;
        if (ac == null)
        {
            k = b(0);
        } else
        if (l >= ac.length)
        {
            d(1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public char[] m()
    {
        f = -1;
        l = 0;
        g = 0;
        e = null;
        m = null;
        n = null;
        if (i)
        {
            q();
        }
        char ac1[] = k;
        char ac[] = ac1;
        if (ac1 == null)
        {
            ac = b(0);
            k = ac;
        }
        return ac;
    }

    public int n()
    {
        return l;
    }

    public char[] o()
    {
        if (h == null)
        {
            h = new ArrayList();
        }
        i = true;
        h.add(k);
        int i1 = k.length;
        j = j + i1;
        char ac[] = e(Math.min(i1 + (i1 >> 1), 0x40000));
        l = 0;
        k = ac;
        return ac;
    }

    public char[] p()
    {
        char ac[] = k;
        int j1 = ac.length;
        int i1;
        if (j1 == 0x40000)
        {
            i1 = 0x40001;
        } else
        {
            i1 = Math.min(0x40000, (j1 >> 1) + j1);
        }
        k = e(i1);
        System.arraycopy(ac, 0, k, 0, j1);
        return k;
    }

    public String toString()
    {
        return g();
    }

}
