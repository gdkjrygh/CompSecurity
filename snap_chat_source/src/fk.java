// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fk
{

    int a;
    private final byte b[];
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    fk(byte abyte0[], int i)
    {
        f = 0x7fffffff;
        h = 64;
        b = abyte0;
        c = i;
        a = 0;
    }

    private void e(int i)
    {
        if (i < 0)
        {
            throw fm.b();
        }
        if (a + i > f)
        {
            e(f - a);
            throw fm.a();
        }
        if (i <= c - a)
        {
            a = a + i;
            return;
        } else
        {
            throw fm.a();
        }
    }

    private void f()
    {
        c = c + d;
        int i = c;
        if (i > f)
        {
            d = i - f;
            c = c - d;
            return;
        } else
        {
            d = 0;
            return;
        }
    }

    public final int a()
    {
        boolean flag;
        if (a == c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            e = 0;
            return 0;
        }
        e = c();
        if (e == 0)
        {
            throw fm.d();
        } else
        {
            return e;
        }
    }

    public final void a(int i)
    {
        if (e != i)
        {
            throw fm.e();
        } else
        {
            return;
        }
    }

    public final void a(fo fo1)
    {
        int i = c();
        if (g >= h)
        {
            throw fm.g();
        } else
        {
            i = c(i);
            g = g + 1;
            fo1.a(this);
            a(0);
            g = g - 1;
            d(i);
            return;
        }
    }

    public final String b()
    {
        int i = c();
        if (i <= c - a && i > 0)
        {
            String s = new String(b, a, i, fl.a);
            a = i + a;
            return s;
        }
        if (i < 0)
        {
            throw fm.b();
        }
        if (a + i > f)
        {
            e(f - a);
            throw fm.a();
        }
        if (i <= c - a)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(b, a, abyte0, 0, i);
            a = i + a;
            return new String(abyte0, fl.a);
        } else
        {
            throw fm.a();
        }
    }

    public final boolean b(int i)
    {
        switch (i & 7)
        {
        default:
            throw fm.f();

        case 0: // '\0'
            c();
            return true;

        case 1: // '\001'
            d();
            d();
            d();
            d();
            d();
            d();
            d();
            d();
            return true;

        case 2: // '\002'
            e(c());
            return true;

        case 3: // '\003'
            int j;
            do
            {
                j = a();
            } while (j != 0 && b(j));
            a((i >>> 3) << 3 | 4);
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            d();
            d();
            d();
            d();
            return true;
        }
    }

    public final int c()
    {
        int i = d();
        if (i < 0) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        i &= 0x7f;
        byte byte0 = d();
        if (byte0 >= 0)
        {
            return i | byte0 << 7;
        }
        i |= (byte0 & 0x7f) << 7;
        byte0 = d();
        if (byte0 >= 0)
        {
            return i | byte0 << 14;
        }
        i |= (byte0 & 0x7f) << 14;
        int k = d();
        if (k >= 0)
        {
            return i | k << 21;
        }
        byte0 = d();
        k = i | (k & 0x7f) << 21 | byte0 << 28;
        i = k;
        if (byte0 < 0)
        {
            int j = 0;
label0:
            do
            {
label1:
                {
                    if (j >= 5)
                    {
                        break label1;
                    }
                    i = k;
                    if (d() >= 0)
                    {
                        break label0;
                    }
                    j++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw fm.c();
    }

    public final int c(int i)
    {
        if (i < 0)
        {
            throw fm.b();
        }
        i = a + i;
        int j = f;
        if (i > j)
        {
            throw fm.a();
        } else
        {
            f = i;
            f();
            return j;
        }
    }

    public final byte d()
    {
        if (a == c)
        {
            throw fm.a();
        } else
        {
            byte abyte0[] = b;
            int i = a;
            a = i + 1;
            return abyte0[i];
        }
    }

    public final void d(int i)
    {
        f = i;
        f();
    }

    final Object e()
    {
        return b();
    }
}
