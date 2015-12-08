// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class azl
    implements azr
{

    private final azs a;
    private final int b;
    private azm c;
    private azm d;

    public azl()
    {
        this(300);
    }

    private azl(int i)
    {
        this(new azs(new azu(300)), 300);
    }

    private azl(azs azs1, int i)
    {
        a = azs1;
        b = i;
    }

    public final azp a(amz amz1, boolean flag)
    {
        if (amz1 == amz.e)
        {
            return azn.b();
        }
        if (flag)
        {
            if (c == null)
            {
                c = new azm(a.a(amz1, true), b);
            }
            return c;
        }
        if (d == null)
        {
            d = new azm(a.a(amz1, false), b);
        }
        return d;
    }
}
