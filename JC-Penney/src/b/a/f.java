// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            b, qe, c, qh, 
//            qf, qi

public final class f extends b
{

    private int g;

    public f(qe qe1, int i)
    {
        super(qe1);
        g = i;
    }

    protected final qe b()
    {
        boolean flag;
        if (super.d.c().equals("HEAD") || g >= 100 && g <= 199 || g == 204 || g == 304)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            super.d.b(f());
            return super.d.b();
        }
        if (super.c)
        {
            return new qh(this);
        }
        if (super.a)
        {
            if (super.b > 0)
            {
                return new qf(this, super.b);
            } else
            {
                super.d.b(f());
                return super.d.b();
            }
        }
        if (super.d.c().equals("CONNECT"))
        {
            super.d.b(f());
            return super.d.b();
        } else
        {
            return new qi(this);
        }
    }
}
