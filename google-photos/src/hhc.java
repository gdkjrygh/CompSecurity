// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hhc extends adf
{

    private final int c;
    private hgz d;

    public hhc(hgz hgz1, int i)
    {
        d = hgz1;
        super();
        c = i;
    }

    private hhd a()
    {
        return (hhd)hgz.a(d);
    }

    public final int a(int i)
    {
        return a().a(i, c);
    }

    public final int a(int i, int j)
    {
        return a().b(i, j);
    }

    public final int c(int i, int j)
    {
        return a().c(i, j);
    }
}
