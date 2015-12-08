// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksk extends krs
{

    private static volatile ksk c[];
    private int d;
    private int e;

    public ksk()
    {
        d = 0;
        e = 0;
        a = null;
        b = -1;
    }

    public static ksk[] f()
    {
        if (c == null)
        {
            synchronized (krv.a)
            {
                if (c == null)
                {
                    c = new ksk[0];
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
        return super.a() + krr.b(1, 0) + krr.b(2, 0);
    }

    public final void a(krr krr1)
    {
        krr1.a(1, 0);
        krr1.a(2, 0);
        super.a(krr1);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof ksk))
        {
            return false;
        } else
        {
            return a((ksk)obj);
        }
    }

    public final int hashCode()
    {
        return 0x7ba4f + b();
    }
}
