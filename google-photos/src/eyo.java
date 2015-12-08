// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.NoSuchElementException;

final class eyo
    implements eyh
{

    private final int a;
    private final int b;
    private int c;
    private eyn d;

    public eyo(eyn eyn1, int i, int j)
    {
        d = eyn1;
        super();
        if (j < i)
        {
            throw new IllegalArgumentException((new StringBuilder(60)).append("startIndex (").append(i).append(") should be <= endIndex (").append(j).append(")").toString());
        } else
        {
            a = i;
            b = Math.min(j, eyn.a(eyn1).a() - 1);
            c = i - 1;
            return;
        }
    }

    private boolean e()
    {
        return c >= a && c <= b;
    }

    public final boolean a()
    {
        c = c + 1;
        return e();
    }

    public final int b()
    {
        if (!e())
        {
            throw new NoSuchElementException();
        } else
        {
            return (int)eyn.a(d).b(c);
        }
    }

    public final long c()
    {
        if (!e())
        {
            throw new NoSuchElementException();
        } else
        {
            return eyn.a(d).a(c);
        }
    }

    public final int d()
    {
        return (b - a) + 1;
    }
}
