// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class acW extends acY
    implements Comparable
{

    final ael a;

    public acW(ael ael1, int i)
    {
        super(i);
        if (ael1 == null)
        {
            throw new NullPointerException("field == null");
        } else
        {
            a = ael1;
            return;
        }
    }

    private int a(acW acw)
    {
        return a.a(acw.a);
    }

    public final int a(acU acu, aeG aeg, int i)
    {
        int j = acu.i.b(a);
        int k = super.b;
        aeg.e(j - i);
        aeg.e(k);
        return j;
    }

    public final void a(acU acu)
    {
        acu.i.a(a);
    }

    public final String ag_()
    {
        return a.ag_();
    }

    public final int compareTo(Object obj)
    {
        return a((acW)obj);
    }

    public final boolean equals(Object obj)
    {
        while (!(obj instanceof acW) || a((acW)obj) != 0) 
        {
            return false;
        }
        return true;
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(100);
        stringbuffer.append(getClass().getName());
        stringbuffer.append('{');
        stringbuffer.append(aeO.b(super.b));
        stringbuffer.append(' ');
        stringbuffer.append(a);
        stringbuffer.append('}');
        return stringbuffer.toString();
    }
}
