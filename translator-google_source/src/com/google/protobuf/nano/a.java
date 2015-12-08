// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;


// Referenced classes of package com.google.protobuf.nano:
//            InvalidProtocolBufferNanoException, g, j

public final class a
{

    final byte a[];
    int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    private a(byte abyte0[], int i1, int j1)
    {
        g = 0x7fffffff;
        i = 64;
        j = 0x4000000;
        a = abyte0;
        b = i1;
        c = i1 + j1;
        e = i1;
    }

    public static a a(byte abyte0[], int i1, int j1)
    {
        return new a(abyte0, i1, j1);
    }

    private byte[] f(int i1)
    {
        if (i1 < 0)
        {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        if (e + i1 > g)
        {
            g(g - e);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i1 <= c - e)
        {
            byte abyte0[] = new byte[i1];
            System.arraycopy(a, e, abyte0, 0, i1);
            e = e + i1;
            return abyte0;
        } else
        {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
    }

    private void g(int i1)
    {
        if (i1 < 0)
        {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        if (e + i1 > g)
        {
            g(g - e);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i1 <= c - e)
        {
            e = e + i1;
            return;
        } else
        {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
    }

    private void k()
    {
        c = c + d;
        int i1 = c;
        if (i1 > g)
        {
            d = i1 - g;
            c = c - d;
            return;
        } else
        {
            d = 0;
            return;
        }
    }

    private byte l()
    {
        if (e == c)
        {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        } else
        {
            byte abyte0[] = a;
            int i1 = e;
            e = i1 + 1;
            return abyte0[i1];
        }
    }

    public final int a()
    {
        boolean flag;
        if (e == c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f = 0;
            return 0;
        }
        f = e();
        if (f == 0)
        {
            throw InvalidProtocolBufferNanoException.invalidTag();
        } else
        {
            return f;
        }
    }

    public final void a(int i1)
    {
        if (f != i1)
        {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        } else
        {
            return;
        }
    }

    public final void a(g g1)
    {
        int i1 = e();
        if (h >= i)
        {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        } else
        {
            i1 = c(i1);
            h = h + 1;
            g1.mergeFrom(this);
            a(0);
            h = h - 1;
            d(i1);
            return;
        }
    }

    public final void a(g g1, int i1)
    {
        if (h >= i)
        {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        } else
        {
            h = h + 1;
            g1.mergeFrom(this);
            a(com.google.protobuf.nano.j.a(i1, 4));
            h = h - 1;
            return;
        }
    }

    public final boolean b()
    {
        return e() != 0;
    }

    public final boolean b(int i1)
    {
        switch (com.google.protobuf.nano.j.a(i1))
        {
        default:
            throw InvalidProtocolBufferNanoException.invalidWireType();

        case 0: // '\0'
            e();
            return true;

        case 1: // '\001'
            h();
            return true;

        case 2: // '\002'
            g(e());
            return true;

        case 3: // '\003'
            int j1;
            do
            {
                j1 = a();
            } while (j1 != 0 && b(j1));
            a(com.google.protobuf.nano.j.a(com.google.protobuf.nano.j.b(i1), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            g();
            return true;
        }
    }

    public final int c(int i1)
    {
        if (i1 < 0)
        {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        i1 = e + i1;
        int j1 = g;
        if (i1 > j1)
        {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        } else
        {
            g = i1;
            k();
            return j1;
        }
    }

    public final String c()
    {
        int i1 = e();
        if (i1 <= c - e && i1 > 0)
        {
            String s = new String(a, e, i1, "UTF-8");
            e = i1 + e;
            return s;
        } else
        {
            return new String(f(i1), "UTF-8");
        }
    }

    public final void d(int i1)
    {
        g = i1;
        k();
    }

    public final byte[] d()
    {
        int i1 = e();
        if (i1 <= c - e && i1 > 0)
        {
            byte abyte0[] = new byte[i1];
            System.arraycopy(a, e, abyte0, 0, i1);
            e = i1 + e;
            return abyte0;
        }
        if (i1 == 0)
        {
            return j.h;
        } else
        {
            return f(i1);
        }
    }

    public final int e()
    {
        int i1 = l();
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        i1 &= 0x7f;
        byte byte0 = l();
        if (byte0 >= 0)
        {
            return i1 | byte0 << 7;
        }
        i1 |= (byte0 & 0x7f) << 7;
        byte0 = l();
        if (byte0 >= 0)
        {
            return i1 | byte0 << 14;
        }
        i1 |= (byte0 & 0x7f) << 14;
        int k1 = l();
        if (k1 >= 0)
        {
            return i1 | k1 << 21;
        }
        byte0 = l();
        k1 = i1 | (k1 & 0x7f) << 21 | byte0 << 28;
        i1 = k1;
        if (byte0 < 0)
        {
            int j1 = 0;
label0:
            do
            {
label1:
                {
                    if (j1 >= 5)
                    {
                        break label1;
                    }
                    i1 = k1;
                    if (l() >= 0)
                    {
                        break label0;
                    }
                    j1++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public final void e(int i1)
    {
        if (i1 > e - b)
        {
            int j1 = e;
            int k1 = b;
            throw new IllegalArgumentException((new StringBuilder(50)).append("Position ").append(i1).append(" is beyond current ").append(j1 - k1).toString());
        }
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder(24)).append("Bad position ").append(i1).toString());
        } else
        {
            e = b + i1;
            return;
        }
    }

    public final long f()
    {
        int i1 = 0;
        long l1 = 0L;
        for (; i1 < 64; i1 += 7)
        {
            byte byte0 = l();
            l1 |= (long)(byte0 & 0x7f) << i1;
            if ((byte0 & 0x80) == 0)
            {
                return l1;
            }
        }

        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public final int g()
    {
        return l() & 0xff | (l() & 0xff) << 8 | (l() & 0xff) << 16 | (l() & 0xff) << 24;
    }

    public final long h()
    {
        int i1 = l();
        int j1 = l();
        int k1 = l();
        int l1 = l();
        int i2 = l();
        int j2 = l();
        int k2 = l();
        int l2 = l();
        long l3 = i1;
        return ((long)j1 & 255L) << 8 | l3 & 255L | ((long)k1 & 255L) << 16 | ((long)l1 & 255L) << 24 | ((long)i2 & 255L) << 32 | ((long)j2 & 255L) << 40 | ((long)k2 & 255L) << 48 | ((long)l2 & 255L) << 56;
    }

    public final int i()
    {
        if (g == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i1 = e;
            return g - i1;
        }
    }

    public final int j()
    {
        return e - b;
    }
}
