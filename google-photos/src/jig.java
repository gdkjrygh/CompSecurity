// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class jig
{

    int c;

    public jig()
    {
    }

    public abstract jjh a(int i1);

    public void a()
    {
    }

    public void a(int i1, long l1, boolean flag)
    {
    }

    public void a(int i1, Object obj)
    {
    }

    public abstract void a(long l1, long l2);

    public abstract boolean a(long l1);

    public abstract int aB_();

    void b(int i1, long l1, boolean flag)
    {
        boolean flag1 = true;
        if (c != 1)
        {
            flag1 = false;
        }
        c.b(flag1);
        c = 2;
        a(i1, l1, flag);
    }

    public abstract void b(long l1);

    int c(long l1)
    {
        int i1 = 1;
        boolean flag;
        if (c == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        if (!a(l1))
        {
            i1 = 0;
        }
        c = i1;
        return c;
    }

    public abstract boolean c();

    public abstract boolean d();

    public abstract void e();

    public abstract long f();

    public abstract long g();

    public jim h()
    {
        return null;
    }

    public int i()
    {
        return c;
    }

    void j()
    {
        boolean flag;
        if (c == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        c = 3;
        k();
    }

    protected void k()
    {
    }

    void l()
    {
        boolean flag;
        if (c == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        c = 2;
        m();
    }

    public void m()
    {
    }

    void n()
    {
        boolean flag;
        if (c == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        c = 1;
        a();
    }

    void o()
    {
        boolean flag;
        if (c != 2 && c != 3 && c != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        c = -1;
        p();
    }

    protected void p()
    {
    }
}
