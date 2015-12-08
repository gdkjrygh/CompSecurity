// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksn extends krs
{

    private static volatile ksn c[];
    private String d;
    private ksp e;
    private ksj f;

    public ksn()
    {
        d = "";
        e = null;
        f = null;
        a = null;
        b = -1;
    }

    public static ksn[] f()
    {
        if (c == null)
        {
            synchronized (krv.a)
            {
                if (c == null)
                {
                    c = new ksn[0];
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
        return i;
    }

    public final void a(krr krr1)
    {
        if (!d.equals(""))
        {
            krr1.a(1, d);
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
        if (!(obj instanceof ksn)) goto _L4; else goto _L3
_L3:
        obj = (ksn)obj;
        if (d != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((ksn) (obj)).d != null) goto _L4; else goto _L7
_L7:
        return a(((krs) (obj)));
_L6:
        if (!d.equals(((ksn) (obj)).d))
        {
            return false;
        }
        if (true) goto _L7; else goto _L8
_L8:
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
        return (i + 527) * 31 * 31 * 31 + b();
    }
}
