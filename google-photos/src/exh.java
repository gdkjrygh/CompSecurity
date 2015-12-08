// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class exh
    implements nuc
{

    final nud a = new ntz(this);
    eyg b;
    int c;

    exh()
    {
        b = eyg.a;
    }

    public int a(long l)
    {
        int i = b.c().a(l);
        if (i != 0x80000000)
        {
            return i;
        } else
        {
            return 0x80000000;
        }
    }

    public int a(long l, long l1)
    {
        return b.c().a(l, l1);
    }

    public long a(int i)
    {
        long l = b.a(i - 1);
        if (l != 0x8000000000000000L)
        {
            return l;
        } else
        {
            return 0x8000000000000000L;
        }
    }

    public nud a()
    {
        return a;
    }

    public void a(eyg eyg1)
    {
        b = (eyg)p.a(eyg1);
        c = eyg1.b();
        a.b();
    }

    public int b()
    {
        return c;
    }

    public int b(int i)
    {
        return b.d(i);
    }

    public long c(int i)
    {
        long l = b.b(i);
        if (l != 0x8000000000000000L)
        {
            return l;
        } else
        {
            return 0x8000000000000000L;
        }
    }

    public eyg c()
    {
        return b;
    }

    public int d(int i)
    {
        i = b.c(i);
        if (i != 0x80000000)
        {
            return i;
        } else
        {
            return 0x80000000;
        }
    }

    public eyh e(int i)
    {
        if (b.c(i) == 0x80000000)
        {
            return null;
        } else
        {
            return b.a(0, i);
        }
    }

    public long f(int i)
    {
        long l = b.b(i);
        if (l != 0x8000000000000000L)
        {
            return l;
        } else
        {
            return 0x8000000000000000L;
        }
    }
}
