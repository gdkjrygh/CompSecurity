// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dgt
    implements dgr
{

    int a[];
    int b[];

    private dgt()
    {
    }

    dgt(byte byte0)
    {
        this();
    }

    public final int a()
    {
        return a[0 % a.length];
    }

    public final int a(int i)
    {
        return b[i % b.length];
    }
}
