// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gqn
{

    boolean a;
    ekp b;
    boolean c;
    public int d;
    int e;
    public boolean f;

    gqn()
    {
        c = true;
        d = gqo.b;
        e = -1;
        f = true;
    }

    gqn(gqm gqm1)
    {
        c = true;
        d = gqo.b;
        e = -1;
        f = true;
        b = gqm1.a;
        e = gqm1.b;
        d = gqm1.c;
        a = gqm1.d;
        c = gqm1.e;
        f = gqm1.f;
    }

    public final gqm a()
    {
        return new gqm(this);
    }
}
