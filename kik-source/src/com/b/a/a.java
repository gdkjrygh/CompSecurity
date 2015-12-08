// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;


// Referenced classes of package com.b.a:
//            k, y, p, u, 
//            x, b

public final class a
    implements k
{

    public final boolean a;
    private final byte b[];
    private int c;
    private int d;
    private int e;

    public a(byte abyte0[], int j, boolean flag)
    {
        e = 0;
        b = abyte0;
        c = 0;
        d = j + 0;
        a = flag;
    }

    private boolean b(int j)
    {
        switch (y.a(j))
        {
        default:
            throw p.g();

        case 0: // '\0'
            i();
            return true;

        case 1: // '\001'
            c = c + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
            return true;

        case 2: // '\002'
            j = i();
            if (j < 0)
            {
                throw p.c();
            } else
            {
                c = j + c;
                return true;
            }

        case 3: // '\003'
            int l;
            do
            {
                if (c == d)
                {
                    e = 0;
                    l = 0;
                } else
                {
                    l = i();
                    if (l >>> 3 == 0)
                    {
                        throw p.e();
                    }
                    e = l;
                }
            } while (l != 0 && b(l));
            a(y.a(y.b(j), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            c = c + 1 + 1 + 1 + 1;
            return true;
        }
    }

    private int i()
    {
        int j;
        byte abyte0[] = b;
        j = c;
        c = j + 1;
        j = abyte0[j];
        if (j < 0) goto _L2; else goto _L1
_L1:
        return j;
_L2:
        j &= 0x7f;
        byte abyte1[] = b;
        int l = c;
        c = l + 1;
        l = abyte1[l];
        if (l >= 0)
        {
            return j | l << 7;
        }
        j |= (l & 0x7f) << 7;
        abyte1 = b;
        l = c;
        c = l + 1;
        l = abyte1[l];
        if (l >= 0)
        {
            return j | l << 14;
        }
        j |= (l & 0x7f) << 14;
        abyte1 = b;
        l = c;
        c = l + 1;
        int j1 = abyte1[l];
        if (j1 >= 0)
        {
            return j | j1 << 21;
        }
        abyte1 = b;
        l = c;
        c = l + 1;
        l = abyte1[l];
        j1 = j | (j1 & 0x7f) << 21 | l << 28;
        j = j1;
        if (l < 0)
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
                    byte abyte2[] = b;
                    int k1 = c;
                    c = k1 + 1;
                    j = j1;
                    if (abyte2[k1] >= 0)
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

    public final int a()
    {
        return e;
    }

    public final int a(u u1)
    {
        if (c == d)
        {
            e = 0;
            return 0;
        }
        int j = i();
        int l = j >>> 3;
        if (l == 0)
        {
            if (a && 7 == (j & 7))
            {
                e = 0;
                return 0;
            } else
            {
                throw p.e();
            }
        }
        if (a && 4 == (j & 7))
        {
            e = 0;
            return 0;
        } else
        {
            e = j;
            return l;
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
        int j = i();
        if (j < 0)
        {
            throw p.c();
        }
        int l = d;
        d = j + c;
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
            d = l;
            return obj2;
        }
    }

    public final void a(int j)
    {
        if (e != j)
        {
            throw p.f();
        } else
        {
            return;
        }
    }

    public final void a(int j, u u1)
    {
        b(e);
    }

    public final long b()
    {
        byte abyte0[] = b;
        int l = c;
        int j = 0;
        long l1 = 0L;
        while (j < 64) 
        {
            int i1 = l + 1;
            l = abyte0[l];
            l1 |= (long)(l & 0x7f) << j;
            if ((l & 0x80) == 0)
            {
                c = i1;
                return l1;
            }
            j += 7;
            l = i1;
        }
        throw p.d();
    }

    public final int c()
    {
        return i();
    }

    public final boolean d()
    {
        byte abyte0[] = b;
        int j = c;
        c = j + 1;
        return abyte0[j] != 0;
    }

    public final int e()
    {
        return i();
    }

    public final int f()
    {
        return i();
    }

    public final String g()
    {
        int j = i();
        if (j < 0)
        {
            throw p.c();
        }
        if (c + j > d)
        {
            throw p.b();
        } else
        {
            int l = c;
            c = c + j;
            return w.a.a(b, l, j);
        }
    }

    public final b h()
    {
        int j = i();
        if (j < 0)
        {
            throw p.c();
        }
        if (c + j > d)
        {
            throw p.b();
        } else
        {
            byte abyte0[] = new byte[j];
            System.arraycopy(b, c, abyte0, 0, j);
            c = j + c;
            return com.b.a.b.a(abyte0);
        }
    }
}
