// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class acZ extends acY
    implements Comparable
{

    private final aev a;
    private final acR c;

    public acZ(aev aev1, int i, abK abk, aeF aef)
    {
        super(i);
        if (aev1 == null)
        {
            throw new NullPointerException("method == null");
        }
        a = aev1;
        boolean flag;
        if ((i & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = new acR(aev1, abk, flag, aef);
    }

    private int a(acZ acz)
    {
        return a.a(acz.a);
    }

    public final int a(acU acu, aeG aeg, int i)
    {
        boolean flag1 = true;
        int j = acu.j.b(a);
        int k = super.b;
        int l = ado.b(c);
        boolean flag;
        if (l != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((k & 0x500) != 0)
        {
            flag1 = false;
        }
        if (flag != flag1)
        {
            throw new UnsupportedOperationException("code vs. access_flags mismatch");
        } else
        {
            aeg.e(j - i);
            aeg.e(k);
            aeg.e(l);
            return j;
        }
    }

    public final void a(acU acu)
    {
        adm adm1 = acu.j;
        acu = acu.b;
        adm1.a(a);
        acu.a(c);
    }

    public final String ag_()
    {
        return a.ag_();
    }

    public final int compareTo(Object obj)
    {
        return a((acZ)obj);
    }

    public final boolean equals(Object obj)
    {
        while (!(obj instanceof acZ) || a((acZ)obj) != 0) 
        {
            return false;
        }
        return true;
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(100);
        stringbuffer.append(getClass().getName());
        stringbuffer.append('{');
        stringbuffer.append(aeO.b(super.b));
        stringbuffer.append(' ');
        stringbuffer.append(a);
        stringbuffer.append(' ');
        stringbuffer.append(c);
        stringbuffer.append('}');
        return stringbuffer.toString();
    }
}
