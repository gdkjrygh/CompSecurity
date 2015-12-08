// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class haa
    implements hac
{

    private final int a;
    private final had b;

    public haa(had had1, int i)
    {
        a = i;
        b = had1;
    }

    public final int a(int i, int j)
    {
        return b.a(c.dO) * ((j - i) / a);
    }

    public final int b(int i, int j)
    {
        return b.a(c.dO) * ((j - i - 2) / a + 1);
    }

    public final int c(int i, int j)
    {
        return (j / b.a(c.dO)) * a;
    }
}
