// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.io.DataOutput;

// Referenced classes of package com.b.a:
//            z, o, m, y, 
//            b, u, w

public final class r extends z
    implements o
{

    public r(m m1)
    {
        super(m1);
    }

    private static int a(int i)
    {
        if ((i & 0xffffff80) == 0)
        {
            return 1;
        }
        if ((i & 0xffffc000) == 0)
        {
            return 2;
        }
        if ((0xffe00000 & i) == 0)
        {
            return 3;
        }
        return (0xf0000000 & i) != 0 ? 5 : 4;
    }

    private static m a(int i, int j, z z1, m m1)
    {
        boolean flag = false;
        int k2 = a(i);
        int j2 = a(j);
        int k = k2 + j2;
        m m2 = m1;
        if (m1.c + k > m1.a.length)
        {
            m2 = new m(z1.d, m1);
        }
        m1 = m2.a;
        int j1 = m2.c;
        m2.c = m2.c + k;
        z1.c = k + z1.c;
        int k1 = j1;
        int l1 = i;
        if (k2 != 1)
        {
            int i2 = 0;
            int l = i;
            i = j1;
            do
            {
                k1 = i;
                l1 = l;
                if (i2 >= k2 - 1)
                {
                    break;
                }
                m1[i] = (byte)(l & 0x7f | 0x80);
                l >>>= 7;
                i2++;
                i++;
            } while (true);
        }
        i = k1 + 1;
        m1[k1] = (byte)l1;
        if (j2 != 1)
        {
            int i1 = ((flag) ? 1 : 0);
            do
            {
                k1 = i;
                j1 = j;
                if (i1 >= j2 - 1)
                {
                    break;
                }
                m1[i] = (byte)(j & 0x7f | 0x80);
                j >>>= 7;
                i1++;
                i++;
            } while (true);
        } else
        {
            j1 = j;
            k1 = i;
        }
        m1[k1] = (byte)j1;
        return m2;
    }

    private static m a(int i, long l, z z1, m m1)
    {
        int k2 = a(i);
        m m2;
        int j;
        int k;
        int k1;
        int l1;
        int i2;
        if ((-128L & l) == 0L)
        {
            j = 1;
        } else
        if ((-16384L & l) == 0L)
        {
            j = 2;
        } else
        if ((0xffffffffffe00000L & l) == 0L)
        {
            j = 3;
        } else
        if ((0xfffffffff0000000L & l) == 0L)
        {
            j = 4;
        } else
        if ((0xfffffff800000000L & l) == 0L)
        {
            j = 5;
        } else
        if ((0xfffffc0000000000L & l) == 0L)
        {
            j = 6;
        } else
        if ((0xfffe000000000000L & l) == 0L)
        {
            j = 7;
        } else
        if ((0xff00000000000000L & l) == 0L)
        {
            j = 8;
        } else
        if ((0x8000000000000000L & l) == 0L)
        {
            j = 9;
        } else
        {
            j = 10;
        }
        k = k2 + j;
        m2 = m1;
        if (m1.c + k > m1.a.length)
        {
            m2 = new m(z1.d, m1);
        }
        m1 = m2.a;
        k1 = m2.c;
        m2.c = m2.c + k;
        z1.c = k + z1.c;
        l1 = k1;
        i2 = i;
        if (k2 != 1)
        {
            int j2 = 0;
            int i1 = i;
            i = k1;
            do
            {
                l1 = i;
                i2 = i1;
                if (j2 >= k2 - 1)
                {
                    break;
                }
                m1[i] = (byte)(i1 & 0x7f | 0x80);
                i1 >>>= 7;
                j2++;
                i++;
            } while (true);
        }
        i = l1 + 1;
        m1[l1] = (byte)i2;
        long l2;
        if (j != 1)
        {
            int j1 = 0;
            do
            {
                k1 = i;
                l2 = l;
                if (j1 >= j - 1)
                {
                    break;
                }
                m1[i] = (byte)((int)l & 0x7f | 0x80);
                l >>>= 7;
                j1++;
                i++;
            } while (true);
        } else
        {
            l2 = l;
            k1 = i;
        }
        m1[k1] = (byte)(int)l2;
        return m2;
    }

    public static void a(DataOutput dataoutput, int i)
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                dataoutput.write(i);
                return;
            }
            dataoutput.write(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public final void a(int i, int j, boolean flag)
    {
        b(i, j, flag);
    }

    public final void a(int i, long l, boolean flag)
    {
        b = a(y.a(i, 0), l, ((z) (this)), b);
    }

    public final void a(int i, b b1, boolean flag)
    {
        byte abyte0[] = b1.a();
        int j = y.a(i, 2);
        i = abyte0.length;
        b1 = b;
        if (i == 0)
        {
            b1 = a(j, i, ((z) (this)), ((m) (b1)));
        } else
        {
            b1 = a(j, i, ((z) (this)), ((m) (b1)));
            super.c = super.c + i;
            j = ((m) (b1)).a.length - ((m) (b1)).c;
            if (i > j)
            {
                if (super.d + j < i)
                {
                    if (j == 0)
                    {
                        b1 = new m(super.d, new m(abyte0, i + 0, b1));
                    } else
                    {
                        b1 = new m(b1, new m(abyte0, i + 0, b1));
                    }
                } else
                {
                    System.arraycopy(abyte0, 0, ((m) (b1)).a, ((m) (b1)).c, j);
                    b1.c = ((m) (b1)).c + j;
                    b1 = new m(super.d, b1);
                    i -= j;
                    System.arraycopy(abyte0, j + 0, ((m) (b1)).a, 0, i);
                    b1.c = i + ((m) (b1)).c;
                }
            } else
            {
                System.arraycopy(abyte0, 0, ((m) (b1)).a, ((m) (b1)).c, i);
                b1.c = ((m) (b1)).c + i;
            }
        }
        b = b1;
    }

    public final void a(int i, Object obj, u u1, boolean flag)
    {
        m m1 = b;
        int j = c;
        b = new m(m1, m1);
        u1.a(this, obj);
        int k = y.a(i, 2);
        j = c - j;
        int i1 = a(k);
        int j1 = a(j);
        i = 0;
        obj = new byte[i1 + j1];
        int l;
        if (i1 == 1)
        {
            i = 1;
            obj[0] = (byte)k;
        } else
        {
            for (l = 0; l < i1 - 1;)
            {
                obj[i] = (byte)(k & 0x7f | 0x80);
                l++;
                k >>>= 7;
                i++;
            }

            l = i + 1;
            obj[i] = (byte)k;
            i = l;
        }
        l = i;
        i1 = j;
        if (j1 != 1)
        {
            k = 0;
            do
            {
                l = i;
                i1 = j;
                if (k >= j1 - 1)
                {
                    break;
                }
                obj[i] = (byte)(j & 0x7f | 0x80);
                j >>>= 7;
                k++;
                i++;
            } while (true);
        }
        obj[l] = (byte)i1;
        c = c + obj.length;
        u1 = m1.d;
        (new m(((byte []) (obj)), obj.length, m1)).d = u1;
    }

    public final void a(int i, String s, boolean flag)
    {
        int j = y.a(i, 2);
        m m1 = b;
        int j1 = a(j);
        if (m1.c + j1 > m1.a.length)
        {
            m1 = new m(super.d, m1);
        }
        byte abyte0[] = m1.a;
        i = m1.c;
        m1.c = m1.c + j1;
        super.c = super.c + j1;
        int l = i;
        int i1 = j;
        if (j1 != 1)
        {
            int k = 0;
            do
            {
                l = i;
                i1 = j;
                if (k >= j1 - 1)
                {
                    break;
                }
                abyte0[i] = (byte)(j & 0x7f | 0x80);
                j >>>= 7;
                k++;
                i++;
            } while (true);
        }
        abyte0[l] = (byte)i1;
        b = w.a(s, this, m1);
    }

    public final void a(int i, boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        int j = y.a(i, 0);
        i = ((flag2) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        b = a(j, i, ((z) (this)), b);
    }

    public final void b(int i, int j, boolean flag)
    {
        if (j < 0)
        {
            b = a(y.a(i, 0), j, this, b);
            return;
        } else
        {
            b = a(y.a(i, 0), j, this, b);
            return;
        }
    }
}
