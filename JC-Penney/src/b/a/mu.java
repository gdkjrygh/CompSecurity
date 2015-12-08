// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pl, mt, pe, nb, 
//            mv, ph, pf, na

public final class mu extends pl
{

    private int b;

    public mu(int i)
    {
        super(i);
        b = -1;
    }

    public final mt a(int i)
    {
        return (mt)d(i);
    }

    public final void a(int i, mt mt1)
    {
        super.a(i, mt1);
        b = -1;
    }

    public final void a(na na)
    {
        int j = super.K.length;
        for (int i = 0; i < j; i++)
        {
            a(i).b.a(na);
        }

    }

    public final int b()
    {
        if (b == -1)
        {
            mv mv1 = new mv();
            a(mv1);
            b = mv1.a;
        }
        return b;
    }

    public final mt b(int i)
    {
        int j;
        if (i >= super.a.a())
        {
            j = -1;
        } else
        {
            j = super.a.a(i);
        }
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("no such label: ")).append(pf.b(i)).toString());
        } else
        {
            return a(j);
        }
    }

    public final int c()
    {
        int k = super.K.length;
        int j = 0;
        int i = 0;
        for (; j < k; j++)
        {
            mt mt1 = (mt)super.K[j];
            if (mt1 != null)
            {
                i = ((pe) (mt1.b)).K.length + i;
            }
        }

        return i;
    }
}
