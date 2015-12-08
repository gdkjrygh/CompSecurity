// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ncn
{

    public int a;
    int b;
    public int c;
    long d;
    long e;
    public boolean f;

    public ncn()
    {
    }

    public ncn(ncm ncm1)
    {
        a = ncm1.a;
        b = ncm1.b;
        c = ncm1.c;
        d = ncm1.d;
        e = ncm1.e;
    }

    public final ncm a()
    {
        return new ncm(this);
    }
}
