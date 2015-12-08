// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.b.a:
//            k, p, y, u, 
//            x, b

public final class c
    implements k
{

    public final boolean a;
    private final byte b[];
    private int c;
    private int d;
    private int e;
    private final InputStream f;
    private int g;
    private int h;
    private int i;
    private int j;

    public c(InputStream inputstream)
    {
        this(inputstream, new byte[4096]);
    }

    private c(InputStream inputstream, byte abyte0[])
    {
        i = 0x7fffffff;
        j = 0x4000000;
        b = abyte0;
        c = 0;
        e = 0;
        h = 0;
        f = inputstream;
        a = true;
    }

    private boolean a(boolean flag)
    {
        if (e < c)
        {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        if (h + c == i)
        {
            if (flag)
            {
                throw p.a();
            } else
            {
                return false;
            }
        }
        h = h + c;
        e = 0;
        int l;
        if (f == null)
        {
            l = -1;
        } else
        {
            l = f.read(b);
        }
        c = l;
        if (c == 0 || c < -1)
        {
            throw new IllegalStateException((new StringBuilder("InputStream#read(byte[]) returned invalid result: ")).append(c).append("\nThe InputStream implementation is buggy.").toString());
        }
        if (c == -1)
        {
            c = 0;
            if (flag)
            {
                throw p.a();
            } else
            {
                return false;
            }
        }
        i();
        l = h + c + d;
        if (l > j || l < 0)
        {
            throw p.h();
        } else
        {
            return true;
        }
    }

    private boolean b(int l)
    {
        switch (y.a(l))
        {
        default:
            throw p.g();

        case 0: // '\0'
            a();
            return true;

        case 1: // '\001'
            k();
            k();
            k();
            k();
            k();
            k();
            k();
            k();
            return true;

        case 2: // '\002'
            d(a());
            return true;

        case 3: // '\003'
            int i1;
            do
            {
                if (j())
                {
                    g = 0;
                    i1 = 0;
                } else
                {
                    i1 = a();
                    if (i1 >>> 3 == 0)
                    {
                        throw p.e();
                    }
                    g = i1;
                }
            } while (i1 != 0 && b(i1));
            a(y.a(y.b(l), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            k();
            k();
            k();
            k();
            return true;
        }
    }

    private byte[] c(int l)
    {
        if (l < 0)
        {
            throw p.c();
        }
        if (h + e + l > i)
        {
            d(i - h - e);
            throw p.a();
        }
        if (l <= c - e)
        {
            byte abyte0[] = new byte[l];
            System.arraycopy(b, e, abyte0, 0, l);
            e = e + l;
            return abyte0;
        }
        if (l < b.length)
        {
            byte abyte1[] = new byte[l];
            int i1 = c - e;
            System.arraycopy(b, e, abyte1, 0, i1);
            e = c;
            a(true);
            while (l - i1 > c) 
            {
                System.arraycopy(b, 0, abyte1, i1, c);
                i1 += c;
                e = c;
                a(true);
            }
            System.arraycopy(b, 0, abyte1, i1, l - i1);
            e = l - i1;
            return abyte1;
        }
        int j2 = e;
        int k2 = c;
        h = h + c;
        e = 0;
        c = 0;
        Object obj = new ArrayList();
        int l1;
        for (int j1 = l - (k2 - j2); j1 > 0; j1 -= l1)
        {
            byte abyte2[] = new byte[Math.min(j1, b.length)];
            int i2;
            for (int k1 = 0; k1 < abyte2.length; k1 += i2)
            {
                if (f == null)
                {
                    i2 = -1;
                } else
                {
                    i2 = f.read(abyte2, k1, abyte2.length - k1);
                }
                if (i2 == -1)
                {
                    throw p.a();
                }
                h = h + i2;
            }

            l1 = abyte2.length;
            ((List) (obj)).add(abyte2);
        }

        byte abyte3[] = new byte[l];
        l = k2 - j2;
        System.arraycopy(b, j2, abyte3, 0, l);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            byte abyte4[] = (byte[])((Iterator) (obj)).next();
            System.arraycopy(abyte4, 0, abyte3, l, abyte4.length);
            l = abyte4.length + l;
        }

        return abyte3;
    }

    private void d(int l)
    {
        if (l < 0)
        {
            throw p.c();
        }
        if (h + e + l > i)
        {
            d(i - h - e);
            throw p.a();
        }
        if (l <= c - e)
        {
            e = e + l;
        } else
        {
            int i1 = c - e;
            h = h + i1;
            e = 0;
            c = 0;
            while (i1 < l) 
            {
                int j1;
                if (f == null)
                {
                    j1 = -1;
                } else
                {
                    j1 = (int)f.skip(l - i1);
                }
                if (j1 <= 0)
                {
                    throw p.a();
                }
                i1 += j1;
                h = j1 + h;
            }
        }
    }

    private void i()
    {
        c = c + d;
        int l = h + c;
        if (l > i)
        {
            d = l - i;
            c = c - d;
            return;
        } else
        {
            d = 0;
            return;
        }
    }

    private boolean j()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (e == c)
        {
            flag = flag1;
            if (!a(false))
            {
                flag = true;
            }
        }
        return flag;
    }

    private byte k()
    {
        if (e == c)
        {
            a(true);
        }
        byte abyte0[] = b;
        int l = e;
        e = l + 1;
        return abyte0[l];
    }

    public final int a()
    {
        int l = k();
        if (l < 0) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        l &= 0x7f;
        byte byte0 = k();
        if (byte0 >= 0)
        {
            return l | byte0 << 7;
        }
        l |= (byte0 & 0x7f) << 7;
        byte0 = k();
        if (byte0 >= 0)
        {
            return l | byte0 << 14;
        }
        l |= (byte0 & 0x7f) << 14;
        int j1 = k();
        if (j1 >= 0)
        {
            return l | j1 << 21;
        }
        byte0 = k();
        j1 = l | (j1 & 0x7f) << 21 | byte0 << 28;
        l = j1;
        if (byte0 < 0)
        {
            int i1 = 0;
label0:
            do
            {
label1:
                {
                    if (i1 >= 5)
                    {
                        break label1;
                    }
                    l = j1;
                    if (k() >= 0)
                    {
                        break label0;
                    }
                    i1++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw p.d();
    }

    public final int a(u u1)
    {
        if (j())
        {
            g = 0;
            return 0;
        }
        int l = a();
        int i1 = l >>> 3;
        if (i1 == 0)
        {
            if (a && 7 == (l & 7))
            {
                g = 0;
                return 0;
            } else
            {
                throw p.e();
            }
        }
        if (a && 4 == (l & 7))
        {
            g = 0;
            return 0;
        } else
        {
            g = l;
            return i1;
        }
    }

    public final Object a(Object obj, u u1)
    {
        if (a)
        {
            Object obj1 = obj;
            if (obj == null)
            {
                obj1 = u1.a();
            }
            u1.a(this, obj1);
            if (!u1.a(obj1))
            {
                throw new x(obj1, u1);
            } else
            {
                a(0);
                return obj1;
            }
        }
        int l = a();
        if (l < 0)
        {
            throw p.c();
        }
        l += h + e;
        int i1 = i;
        if (l > i1)
        {
            throw p.a();
        }
        i = l;
        i();
        Object obj2 = obj;
        if (obj == null)
        {
            obj2 = u1.a();
        }
        u1.a(this, obj2);
        if (!u1.a(obj2))
        {
            throw new x(obj2, u1);
        } else
        {
            a(0);
            i = i1;
            i();
            return obj2;
        }
    }

    public final void a(int l)
    {
        if (g != l)
        {
            throw p.f();
        } else
        {
            return;
        }
    }

    public final void a(int l, u u1)
    {
        b(g);
    }

    public final long b()
    {
        int l = 0;
        long l1 = 0L;
        for (; l < 64; l += 7)
        {
            byte byte0 = k();
            l1 |= (long)(byte0 & 0x7f) << l;
            if ((byte0 & 0x80) == 0)
            {
                return l1;
            }
        }

        throw p.d();
    }

    public final int c()
    {
        return a();
    }

    public final boolean d()
    {
        return a() != 0;
    }

    public final int e()
    {
        return g;
    }

    public final int f()
    {
        return a();
    }

    public final String g()
    {
        int l = a();
        if (l <= c - e && l > 0)
        {
            String s = w.a.a(b, e, l);
            e = l + e;
            return s;
        } else
        {
            return w.a.a(c(l));
        }
    }

    public final b h()
    {
        int l = a();
        if (l <= c - e && l > 0)
        {
            b b1 = com.b.a.b.a(b, e, l);
            e = l + e;
            return b1;
        } else
        {
            return com.b.a.b.a(c(l));
        }
    }
}
