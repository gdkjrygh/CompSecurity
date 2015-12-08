// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class gjc
{

    Locale a;
    double b;
    double c;
    double d;
    double e;

    public gjc()
    {
    }

    public final gjb a()
    {
        boolean flag1 = true;
        p.a(a);
        boolean flag;
        if (b < d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (c < e)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag);
        return new gjb(this);
    }

    public final gjc a(double d1, double d2)
    {
        b = d1;
        c = d2;
        return this;
    }

    public final gjc b(double d1, double d2)
    {
        d = d1;
        e = d2;
        return this;
    }
}
