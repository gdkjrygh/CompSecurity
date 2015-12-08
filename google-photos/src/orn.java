// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class orn
    implements orm
{

    final long a;
    final long b;
    final double c;

    public orn(long l, long l1)
    {
        boolean flag;
        if (l < l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        a = l;
        b = l1;
        c = l1 - l;
    }

    public final float a(long l)
    {
        if (c == 0.0D)
        {
            return 0.0F;
        } else
        {
            return (float)((double)(l - a) / c);
        }
    }

    public final long b(float f)
    {
        return Math.round((double)a + c * (double)f);
    }

    public final long c(float f)
    {
        return Math.round(c * (double)f);
    }
}
