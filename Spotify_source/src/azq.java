// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class azq
    implements ays
{

    public int g;

    public azq()
    {
    }

    public abstract int a();

    public void a(int k, Object obj)
    {
    }

    public abstract void a(long l);

    public abstract void a(long l, long l1);

    public void a(long l, boolean flag)
    {
    }

    final void b(long l, boolean flag)
    {
        boolean flag1 = true;
        if (g != 1)
        {
            flag1 = false;
        }
        bds.b(flag1);
        g = 2;
        a(l, flag);
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract void d();

    public abstract long e();

    public abstract long f();

    protected ayy g()
    {
        return null;
    }

    public void h()
    {
    }

    public void i()
    {
    }

    public void j()
    {
    }

    public void n()
    {
    }

    final void o()
    {
        boolean flag;
        if (g == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        g = 3;
        h();
    }

    final void p()
    {
        boolean flag;
        if (g == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        g = 2;
        i();
    }

    final void q()
    {
        boolean flag;
        if (g == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        g = 1;
        j();
    }
}
