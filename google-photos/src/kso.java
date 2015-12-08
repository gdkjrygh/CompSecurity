// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kso extends krs
{

    private ksn c[];
    private ksl d;
    private String e;

    public kso()
    {
        c = ksn.f();
        d = null;
        e = "";
        a = null;
        b = -1;
    }

    protected final int a()
    {
        int i = super.a();
        int j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= c.length)
                    {
                        break;
                    }
                    ksn ksn1 = c[k];
                    j = i;
                    if (ksn1 != null)
                    {
                        j = i + krr.b(1, ksn1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (!e.equals(""))
        {
            i = j + krr.b(3, e);
        }
        return i;
    }

    public final void a(krr krr1)
    {
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                ksn ksn1 = c[i];
                if (ksn1 != null)
                {
                    krr1.a(1, ksn1);
                }
            }

        }
        if (!e.equals(""))
        {
            krr1.a(3, e);
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
        if (!(obj instanceof kso)) goto _L4; else goto _L3
_L3:
        obj = (kso)obj;
        flag = flag1;
        if (!krv.a(c, ((kso) (obj)).c)) goto _L4; else goto _L5
_L5:
        if (e != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((kso) (obj)).e != null) goto _L4; else goto _L8
_L8:
        return a(((krs) (obj)));
_L7:
        if (!e.equals(((kso) (obj)).e))
        {
            return false;
        }
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final int hashCode()
    {
        int j = krv.a(c);
        int i;
        if (e == null)
        {
            i = 0;
        } else
        {
            i = e.hashCode();
        }
        return (i + (j + 527) * 31 * 31) * 31 + b();
    }
}
