// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.b;


// Referenced classes of package com.umeng.common.b:
//            a

public abstract class d
{

    private static final int a = 2;
    public static final int b = 76;
    public static final int c = 64;
    protected static final int d = 255;
    protected static final byte e = 61;
    private static final int m = 8192;
    protected final byte f = 61;
    protected final int g;
    protected byte h[];
    protected int i;
    protected boolean j;
    protected int k;
    protected int l;
    private final int n;
    private final int o;
    private final int p;
    private int q;

    protected d(int i1, int j1, int k1, int l1)
    {
        n = i1;
        o = j1;
        if (k1 > 0 && l1 > 0)
        {
            i1 = (k1 / j1) * j1;
        } else
        {
            i1 = 0;
        }
        g = i1;
        p = l1;
    }

    private void a()
    {
        if (h == null)
        {
            h = new byte[d()];
            i = 0;
            q = 0;
            return;
        } else
        {
            byte abyte0[] = new byte[h.length * 2];
            System.arraycopy(h, 0, abyte0, 0, h.length);
            h = abyte0;
            return;
        }
    }

    protected static boolean c(byte byte0)
    {
        switch (byte0)
        {
        default:
            return false;

        case 9: // '\t'
        case 10: // '\n'
        case 13: // '\r'
        case 32: // ' '
            return true;
        }
    }

    private void e()
    {
        h = null;
        i = 0;
        q = 0;
        k = 0;
        l = 0;
        j = false;
    }

    public Object a(Object obj)
        throws Exception
    {
        if (!(obj instanceof byte[]))
        {
            throw new Exception("Parameter supplied to Base-N encode is not a byte[]");
        } else
        {
            return l((byte[])obj);
        }
    }

    protected void a(int i1)
    {
        if (h == null || h.length < i + i1)
        {
            a();
        }
    }

    abstract void a(byte abyte0[], int i1, int j1);

    public Object b(Object obj)
        throws Exception
    {
        if (obj instanceof byte[])
        {
            return k((byte[])obj);
        }
        if (obj instanceof String)
        {
            return c((String)obj);
        } else
        {
            throw new Exception("Parameter supplied to Base-N decode is not a byte[] or a String");
        }
    }

    abstract void b(byte abyte0[], int i1, int j1);

    boolean b()
    {
        return h != null;
    }

    protected abstract boolean b(byte byte0);

    public boolean b(byte abyte0[], boolean flag)
    {
        int i1;
        boolean flag2;
        flag2 = false;
        i1 = 0;
_L7:
        if (i1 < abyte0.length) goto _L2; else goto _L1
_L1:
        boolean flag1 = true;
_L4:
        return flag1;
_L2:
        if (b(abyte0[i1]))
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag2;
        if (!flag) goto _L4; else goto _L3
_L3:
        if (abyte0[i1] == 61)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag2;
        if (!c(abyte0[i1])) goto _L4; else goto _L5
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    int c()
    {
        if (h != null)
        {
            return i - q;
        } else
        {
            return 0;
        }
    }

    int c(byte abyte0[], int i1, int j1)
    {
        if (h != null)
        {
            j1 = Math.min(c(), j1);
            System.arraycopy(h, q, abyte0, i1, j1);
            q = q + j1;
            if (q >= i)
            {
                h = null;
            }
            return j1;
        }
        return !j ? 0 : -1;
    }

    public byte[] c(String s)
    {
        return k(com.umeng.common.b.a.f(s));
    }

    protected int d()
    {
        return 8192;
    }

    public boolean d(String s)
    {
        return b(com.umeng.common.b.a.f(s), true);
    }

    public String j(byte abyte0[])
    {
        return com.umeng.common.b.a.f(l(abyte0));
    }

    public byte[] k(byte abyte0[])
    {
        e();
        if (abyte0 == null || abyte0.length == 0)
        {
            return abyte0;
        } else
        {
            b(abyte0, 0, abyte0.length);
            b(abyte0, 0, -1);
            abyte0 = new byte[i];
            c(abyte0, 0, abyte0.length);
            return abyte0;
        }
    }

    public byte[] l(byte abyte0[])
    {
        e();
        if (abyte0 == null || abyte0.length == 0)
        {
            return abyte0;
        } else
        {
            a(abyte0, 0, abyte0.length);
            a(abyte0, 0, -1);
            abyte0 = new byte[i - q];
            c(abyte0, 0, abyte0.length);
            return abyte0;
        }
    }

    public String m(byte abyte0[])
    {
        return com.umeng.common.b.a.f(l(abyte0));
    }

    protected boolean n(byte abyte0[])
    {
        if (abyte0 != null)
        {
            int i1 = 0;
            while (i1 < abyte0.length) 
            {
                if (61 == abyte0[i1] || b(abyte0[i1]))
                {
                    return true;
                }
                i1++;
            }
        }
        return false;
    }

    public long o(byte abyte0[])
    {
        long l2 = (long)(((abyte0.length + n) - 1) / n) * (long)o;
        long l1 = l2;
        if (g > 0)
        {
            l1 = l2 + ((((long)g + l2) - 1L) / (long)g) * (long)p;
        }
        return l1;
    }
}
