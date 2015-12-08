// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksa extends krs
{

    private int c;
    private String d;
    private String e;

    public ksa()
    {
        c = 0;
        d = "";
        e = "";
        a = null;
        b = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (!d.equals(""))
        {
            i = j + krr.b(2, d);
        }
        j = i;
        if (!e.equals(""))
        {
            j = i + krr.b(3, e);
        }
        return j;
    }

    public final void a(krr krr1)
    {
        if (!d.equals(""))
        {
            krr1.a(2, d);
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
        if (!(obj instanceof ksa)) goto _L4; else goto _L3
_L3:
        obj = (ksa)obj;
        if (d != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((ksa) (obj)).d != null) goto _L4; else goto _L7
_L7:
        if (e != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = flag1;
        if (((ksa) (obj)).e != null) goto _L4; else goto _L8
_L8:
        return a(((krs) (obj)));
_L6:
        if (!d.equals(((ksa) (obj)).d))
        {
            return false;
        }
          goto _L7
        if (!e.equals(((ksa) (obj)).e))
        {
            return false;
        }
          goto _L8
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (d == null)
        {
            i = 0;
        } else
        {
            i = d.hashCode();
        }
        if (e != null)
        {
            j = e.hashCode();
        }
        return ((i + 16337) * 31 + j) * 31 + b();
    }
}
