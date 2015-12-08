// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gtu
{

    public int a;
    public ejm b;
    private Long c;

    public gtu()
    {
    }

    public final gtt a()
    {
        boolean flag1 = true;
        boolean flag;
        if (a != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Must set accountId");
        if (c != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.b(flag, "Must set editId");
        return new gtt(a, c.longValue(), b);
    }

    public final gtu a(long l)
    {
        c = Long.valueOf(l);
        return this;
    }
}
