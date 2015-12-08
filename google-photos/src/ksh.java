// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksh extends krs
{

    private static volatile ksh c[];
    private int d[];
    private int e;
    private int f;
    private boolean g;
    private boolean h;

    public ksh()
    {
        d = kry.a;
        e = 0;
        f = 0;
        g = false;
        h = false;
        a = null;
        b = -1;
    }

    public static ksh[] f()
    {
        if (c == null)
        {
            synchronized (krv.a)
            {
                if (c == null)
                {
                    c = new ksh[0];
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
        int i = 0;
        int j = super.a();
        int l = krr.b(2, 0) + j;
        if (d != null && d.length > 0)
        {
            int k = 0;
            for (; i < d.length; i++)
            {
                k += krr.a(d[i]);
            }

            return l + k + d.length * 1;
        } else
        {
            return l;
        }
    }

    public final void a(krr krr1)
    {
        int i = 0;
        krr1.a(2, 0);
        if (d != null && d.length > 0)
        {
            for (; i < d.length; i++)
            {
                krr1.a(3, d[i]);
            }

        }
        super.a(krr1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof ksh)
            {
                obj = (ksh)obj;
                flag = flag1;
                if (krv.a(d, ((ksh) (obj)).d))
                {
                    return a(((krs) (obj)));
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (((krv.a(d) + 527) * 31 * 31 * 31 + 1237) * 31 + 1237) * 31 + b();
    }
}
