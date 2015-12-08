// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksi extends krs
{

    private static volatile ksi c[];
    private String d;
    private long e;
    private long f;
    private boolean g;
    private long h;

    public ksi()
    {
        d = "";
        e = 0L;
        f = 0x7fffffffL;
        g = false;
        h = 0L;
        a = null;
        b = -1;
    }

    public static ksi[] f()
    {
        if (c == null)
        {
            synchronized (krv.a)
            {
                if (c == null)
                {
                    c = new ksi[0];
                }
            }
        }
        return c;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (!d.equals(""))
        {
            i = j + krr.b(1, d);
        }
        j = i;
        if (0L != 0L)
        {
            j = i + krr.b(2, 0L);
        }
        i = j;
        if (f != 0x7fffffffL)
        {
            i = j + krr.b(3, f);
        }
        j = i;
        if (0L != 0L)
        {
            j = i + krr.b(5, 0L);
        }
        return j;
    }

    public final void a(krr krr1)
    {
        if (!d.equals(""))
        {
            krr1.a(1, d);
        }
        if (0L != 0L)
        {
            krr1.a(2, 0L);
        }
        if (f != 0x7fffffffL)
        {
            krr1.a(3, f);
        }
        if (0L != 0L)
        {
            krr1.a(5, 0L);
        }
        super.a(krr1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof ksi))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (ksi)obj;
        if (d != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((ksi) (obj)).d != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (0L == 0L)
        {
            flag = flag1;
            if (f == ((ksi) (obj)).f)
            {
                flag = flag1;
                if (0L == 0L)
                {
                    return a(((krs) (obj)));
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!d.equals(((ksi) (obj)).d))
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final int hashCode()
    {
        int i;
        if (d == null)
        {
            i = 0;
        } else
        {
            i = d.hashCode();
        }
        return (((i + 527) * 31 * 31 + (int)(f ^ f >>> 32)) * 31 + 1237) * 31 * 31 + b();
    }
}
