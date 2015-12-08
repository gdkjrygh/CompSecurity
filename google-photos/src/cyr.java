// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cyr
{

    long a;
    long b;
    long c;
    long d;
    long e;
    float f;
    float g;
    int h;
    long i;
    boolean j;
    boolean k;

    public cyr()
    {
    }

    cyr(cyq cyq1)
    {
        a = cyq1.c;
        b = cyq1.d;
        c = cyq1.e;
        d = cyq1.f;
        e = cyq1.g;
        f = cyq1.h;
        g = cyq1.i;
        h = cyq1.j;
        i = cyq1.k;
        j = cyq1.l;
        k = cyq1.m;
    }

    public final cyq a()
    {
        return new cyq(this);
    }

    public final cyr a(long l)
    {
        c = 0x4c4b40L;
        return this;
    }
}
