// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class eqs
    implements nuc
{

    final nud a = new ntz(this);
    public int b;
    private String c;
    private int d;

    public eqs()
    {
        b = eqt.b;
    }

    public final nud a()
    {
        return a;
    }

    public final void a(String s, int i)
    {
        boolean flag1 = true;
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        if (i != -1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.b(flag);
        c = s;
        d = i;
        b = eqt.a;
        a.b();
    }

    public final boolean b(String s, int i)
    {
        boolean flag;
        if (b != eqt.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && d == i && c.c(c, s);
    }
}
