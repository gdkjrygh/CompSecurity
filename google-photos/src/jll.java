// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jll
{

    public final int a;
    public final long b[];
    public final int c[];
    public final int d;
    public final long e[];
    public final int f[];

    public jll(long al[], int ai[], int i, long al1[], int ai1[])
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (ai.length == al1.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag);
        if (al.length == al1.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag);
        if (ai1.length == al1.length)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        c.a(flag);
        b = al;
        c = ai;
        d = i;
        e = al1;
        f = ai1;
        a = al.length;
    }
}
