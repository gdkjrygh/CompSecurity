// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class aeR extends aeN
{

    public final aeP a;

    public aeR(int i)
    {
        super(i);
        a = new aeP(i);
    }

    public final void a(int i, aeQ aeq)
    {
        aeQ aeq1 = (aeQ)super.K[i];
        a(i, aeq);
        if (aeq1 != null)
        {
            int j = aeq1.a();
            a.a(j, -1);
        }
        if (aeq != null)
        {
            int l = aeq.a();
            int i1 = a.b;
            for (int k = 0; k <= l - i1; k++)
            {
                a.b(-1);
            }

            a.a(l, i);
        }
    }

    public final int d()
    {
        int i;
        for (i = a.b - 1; i >= 0 && a.a(i) < 0; i--) { }
        i++;
        aeP aep = a;
        if (i < 0)
        {
            throw new IllegalArgumentException("newSize < 0");
        }
        if (i > aep.b)
        {
            throw new IllegalArgumentException("newSize > size");
        } else
        {
            aep.f();
            aep.b = i;
            return i;
        }
    }
}
