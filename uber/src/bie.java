// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class bie
{

    private int a;
    private int b;

    public bie()
    {
        a = 0;
        b = 0;
    }

    static int a(bie bie1)
    {
        return bie1.a;
    }

    static int b(bie bie1)
    {
        return bie1.b;
    }

    public final bid a()
    {
        return new bid(this, (byte)0);
    }

    public final bie a(int i)
    {
        if (i == 0 || i == 2 || i == 1)
        {
            a = i;
            return this;
        } else
        {
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[] {
                Integer.valueOf(i)
            }));
        }
    }
}
