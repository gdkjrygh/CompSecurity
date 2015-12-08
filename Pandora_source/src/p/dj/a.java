// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dj;


public class a
{

    private int a;
    private String b;
    private int c;
    private boolean d;

    public a(int i, String s, int j)
    {
        a = i;
        b = s;
        c = j;
        boolean flag;
        if (c() && d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }

    public a(a a1)
    {
        a = a1.a;
        b = a1.b;
        c = a1.c;
        d = a1.d;
    }

    public int a()
    {
        return a;
    }

    void a(boolean flag)
    {
        if (flag && !c())
        {
            return;
        } else
        {
            d = flag;
            return;
        }
    }

    public int b()
    {
        return c;
    }

    public boolean c()
    {
        return (c & 1) != 0;
    }

    public boolean d()
    {
        return (c & 2) != 0;
    }

    public boolean e()
    {
        return c() && !d();
    }

    public boolean f()
    {
        return d;
    }

    public String toString()
    {
        return (new StringBuilder()).append(a).append(": ").append(b).toString();
    }
}
