// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.io.OutputStream;

// Referenced classes of package com.b.a:
//            aa, z, m, v

final class ac extends aa
{

    ac(String s)
    {
        super(s, 1, (byte)0);
    }

    public final m a(byte byte0, z z1, m m1)
    {
        z1.c = z1.c + 1;
        if (m1.c == m1.a.length)
        {
            z1.e.write(m1.a, m1.b, m1.c - m1.b);
            m1.c = m1.b;
        }
        z1 = m1.a;
        int i = m1.c;
        m1.c = i + 1;
        z1[i] = byte0;
        return m1;
    }

    public final m a(int i, z z1, m m1)
    {
        do
        {
            z1.c = z1.c + 1;
            if (m1.c == m1.a.length)
            {
                z1.e.write(m1.a, m1.b, m1.c - m1.b);
                m1.c = m1.b;
            }
            if ((i & 0xffffff80) == 0)
            {
                z1 = m1.a;
                int j = m1.c;
                m1.c = j + 1;
                z1[j] = (byte)i;
                return m1;
            }
            byte abyte0[] = m1.a;
            int k = m1.c;
            m1.c = k + 1;
            abyte0[k] = (byte)(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public final m a(long l, z z1, m m1)
    {
        do
        {
            z1.c = z1.c + 1;
            if (m1.c == m1.a.length)
            {
                z1.e.write(m1.a, m1.b, m1.c - m1.b);
                m1.c = m1.b;
            }
            if ((-128L & l) == 0L)
            {
                z1 = m1.a;
                int i = m1.c;
                m1.c = i + 1;
                z1[i] = (byte)(int)l;
                return m1;
            }
            byte abyte0[] = m1.a;
            int j = m1.c;
            m1.c = j + 1;
            abyte0[j] = (byte)((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public final m a(String s, z z1, m m1)
    {
        return v.a(s, z1, z1.e, m1);
    }

    public final m a(byte abyte0[], int i, z z1, m m1)
    {
        if (i == 0)
        {
            return m1;
        }
        z1.c = z1.c + i;
        if (m1.c + i > m1.a.length)
        {
            z1.e.write(m1.a, m1.b, m1.c - m1.b);
            m1.c = m1.b;
            z1.e.write(abyte0, 0, i);
            return m1;
        } else
        {
            System.arraycopy(abyte0, 0, m1.a, m1.c, i);
            m1.c = m1.c + i;
            return m1;
        }
    }
}
