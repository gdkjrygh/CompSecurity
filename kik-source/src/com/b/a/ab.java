// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;


// Referenced classes of package com.b.a:
//            aa, z, m, w

final class ab extends aa
{

    ab(String s)
    {
        super(s, 0, (byte)0);
    }

    public final m a(byte byte0, z z1, m m1)
    {
        z1.c = z1.c + 1;
        m m2 = m1;
        if (m1.c == m1.a.length)
        {
            m2 = new m(z1.d, m1);
        }
        z1 = m2.a;
        int i = m2.c;
        m2.c = i + 1;
        z1[i] = byte0;
        return m2;
    }

    public final m a(int i, z z1, m m1)
    {
        Object obj = m1;
        do
        {
            z1.c = z1.c + 1;
            m1 = ((m) (obj));
            if (((m) (obj)).c == ((m) (obj)).a.length)
            {
                m1 = new m(z1.d, ((m) (obj)));
            }
            if ((i & 0xffffff80) == 0)
            {
                z1 = m1.a;
                int j = m1.c;
                m1.c = j + 1;
                z1[j] = (byte)i;
                return m1;
            }
            obj = m1.a;
            int k = m1.c;
            m1.c = k + 1;
            obj[k] = (byte)(i & 0x7f | 0x80);
            i >>>= 7;
            obj = m1;
        } while (true);
    }

    public final m a(long l, z z1, m m1)
    {
        Object obj = m1;
        do
        {
            z1.c = z1.c + 1;
            m1 = ((m) (obj));
            if (((m) (obj)).c == ((m) (obj)).a.length)
            {
                m1 = new m(z1.d, ((m) (obj)));
            }
            if ((-128L & l) == 0L)
            {
                z1 = m1.a;
                int i = m1.c;
                m1.c = i + 1;
                z1[i] = (byte)(int)l;
                return m1;
            }
            obj = m1.a;
            int j = m1.c;
            m1.c = j + 1;
            obj[j] = (byte)((int)l & 0x7f | 0x80);
            l >>>= 7;
            obj = m1;
        } while (true);
    }

    public final m a(String s, z z1, m m1)
    {
        return w.a(s, z1, m1);
    }

    public final m a(byte abyte0[], int i, z z1, m m1)
    {
        if (i == 0)
        {
            return m1;
        }
        z1.c = z1.c + i;
        int j = m1.a.length - m1.c;
        if (i > j)
        {
            if (z1.d + j < i)
            {
                if (j == 0)
                {
                    return new m(z1.d, new m(abyte0, i + 0, m1));
                } else
                {
                    return new m(m1, new m(abyte0, i + 0, m1));
                }
            } else
            {
                System.arraycopy(abyte0, 0, m1.a, m1.c, j);
                m1.c = m1.c + j;
                z1 = new m(z1.d, m1);
                i -= j;
                System.arraycopy(abyte0, j + 0, ((m) (z1)).a, 0, i);
                z1.c = ((m) (z1)).c + i;
                return z1;
            }
        } else
        {
            System.arraycopy(abyte0, 0, m1.a, m1.c, i);
            m1.c = m1.c + i;
            return m1;
        }
    }
}
