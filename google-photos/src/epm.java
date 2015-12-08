// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class epm
{

    public int a;
    public int b;
    public int c;
    public boolean d;

    public epm()
    {
        a = 1;
        b = 0x7fffffff;
        c = 0x7fffffff;
    }

    public final epk a()
    {
        boolean flag;
        if (a <= b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "must specify valid min/maxMedia values");
        return new epk(this);
    }
}
